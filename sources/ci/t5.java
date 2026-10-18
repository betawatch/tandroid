package ci;

import android.text.TextUtils;
import j$.util.Comparator$-CC;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes4.dex */
public final class t5 {
    public int a;
    public final TL_stories.StoryItem b;
    public final long c;
    public final int d;
    public boolean e;
    public final boolean f;
    public final boolean j;
    public final boolean k;
    public boolean l;
    public String n;
    public final boolean q;
    public final ArrayList g = new ArrayList();
    public final ArrayList h = new ArrayList();
    public final ArrayList i = new ArrayList();
    public boolean m = true;
    public int o = -1;
    public final HashSet p = new HashSet();
    public final ArrayList r = new ArrayList();
    public final f5 s = new f5();

    public t5(int i10, long j10, TL_stories.StoryItem storyItem) {
        TL_stories.StoryViews storyViews;
        this.d = i10;
        this.b = storyItem;
        this.f = j10 < 0;
        this.c = j10;
        TL_stories.StoryViews storyViews2 = storyItem.views;
        int i11 = storyViews2 == null ? 0 : storyViews2.views_count;
        this.a = i11;
        if (i11 < 200) {
            this.q = true;
        }
        boolean z10 = d8.v(storyItem) && !UserConfig.getInstance(i10).isPremium();
        this.j = z10;
        if (z10 && (storyViews = storyItem.views) != null && storyViews.reactions_count > 0) {
            this.j = false;
            this.k = true;
        }
        if (this.j) {
            return;
        }
        this.l = true;
        if (storyItem.views != null) {
            for (int i12 = 0; i12 < storyItem.views.recent_viewers.size(); i12++) {
                Long l4 = storyItem.views.recent_viewers.get(i12);
                long longValue = l4.longValue();
                if (MessagesController.getInstance(i10).getUser(l4) != null) {
                    TL_stories.TL_storyView tL_storyView = new TL_stories.TL_storyView();
                    tL_storyView.user_id = longValue;
                    tL_storyView.date = 0;
                    this.g.add(tL_storyView);
                }
            }
        }
    }

    public final void a() {
        String str;
        String str2;
        String str3;
        String str4;
        if (this.f) {
            return;
        }
        ArrayList arrayList = this.g;
        arrayList.clear();
        f5 f5Var = this.s;
        boolean z10 = f5Var.b;
        ArrayList arrayList2 = this.h;
        if (z10 || !TextUtils.isEmpty(f5Var.c)) {
            if (TextUtils.isEmpty(f5Var.c)) {
                str = null;
                str2 = null;
                str3 = null;
                str4 = null;
            } else {
                str = f5Var.c.trim().toLowerCase();
                str2 = LocaleController.getInstance().getTranslitString(str);
                str4 = r4.c.h(" ", str);
                str3 = r4.c.h(" ", str2);
            }
            for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                TLRPC.User user = MessagesController.getInstance(this.d).getUser(Long.valueOf(((TL_stories.StoryView) arrayList2.get(i10)).user_id));
                boolean z11 = !f5Var.b || (user != null && user.contact);
                if (z11 && str != null) {
                    String lowerCase = ContactsController.formatName(user.first_name, user.last_name).toLowerCase();
                    String publicUsername = UserObject.getPublicUsername(user);
                    String translitSafe = AndroidUtilities.translitSafe(lowerCase);
                    if ((lowerCase == null || (!lowerCase.startsWith(str) && !lowerCase.contains(str4))) && ((translitSafe == null || (!translitSafe.startsWith(str2) && !translitSafe.contains(str3))) && (publicUsername == null || (!publicUsername.startsWith(str2) && !publicUsername.contains(str3))))) {
                        z11 = false;
                    }
                }
                if (z11) {
                    arrayList.add((TL_stories.StoryView) arrayList2.get(i10));
                }
            }
        } else {
            arrayList.addAll(arrayList2);
        }
        if (f5Var.a) {
            return;
        }
        Collections.sort(arrayList, Comparator$-CC.comparingInt(new ai.u8(6)));
    }

    public final int b() {
        return (this.f ? this.i : this.g).size();
    }

    public final void c() {
        if (this.e || !this.m || this.j) {
            return;
        }
        boolean z10 = this.f;
        long j10 = this.c;
        f5 f5Var = this.s;
        int i10 = this.d;
        TL_stories.StoryItem storyItem = this.b;
        if (z10) {
            TL_stories.TL_getStoryReactionsList tL_getStoryReactionsList = new TL_stories.TL_getStoryReactionsList();
            tL_getStoryReactionsList.forwards_first = f5Var.a;
            tL_getStoryReactionsList.id = storyItem.id;
            tL_getStoryReactionsList.peer = MessagesController.getInstance(i10).getInputPeer(j10);
            tL_getStoryReactionsList.limit = (this.l || this.i.size() < 20) ? 20 : 100;
            String str = this.n;
            tL_getStoryReactionsList.offset = str;
            if (str == null) {
                tL_getStoryReactionsList.offset = "";
            } else {
                tL_getStoryReactionsList.flags |= 2;
            }
            this.e = true;
            FileLog.d("SelfStoryViewsPage reactions load next " + storyItem.id + " " + this.l + " offset=" + tL_getStoryReactionsList.offset);
            final int i11 = 0;
            int sendRequest = ConnectionsManager.getInstance(i10).sendRequest(tL_getStoryReactionsList, new RequestDelegate(this) { // from class: ci.r5
                public final /* synthetic */ t5 b;

                {
                    this.b = this;
                }

                @Override // org.telegram.tgnet.RequestDelegate
                public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                    switch (i11) {
                        case 0:
                            final int i12 = 1;
                            final t5 t5Var = this.b;
                            final int[] iArr = r2;
                            AndroidUtilities.runOnUIThread(new Runnable() { // from class: ci.s5
                                @Override // java.lang.Runnable
                                public final void run() {
                                    boolean z11;
                                    switch (i12) {
                                        case 0:
                                            t5 t5Var2 = t5Var;
                                            ArrayList arrayList = t5Var2.r;
                                            ArrayList arrayList2 = t5Var2.h;
                                            int i13 = t5Var2.d;
                                            ArrayList arrayList3 = t5Var2.g;
                                            TL_stories.StoryItem storyItem2 = t5Var2.b;
                                            if (iArr[0] != t5Var2.o) {
                                                FileLog.d("SelfStoryViewsPage " + storyItem2.id + " localId != reqId");
                                                break;
                                            } else {
                                                t5Var2.e = false;
                                                t5Var2.o = -1;
                                                TLObject tLObject2 = tLObject;
                                                if (tLObject2 != null) {
                                                    TL_stories.StoryViewsList storyViewsList = (TL_stories.StoryViewsList) tLObject2;
                                                    a0.h hVar = MessagesController.getInstance(i13).getStoriesController().M;
                                                    if (storyViewsList.views != null) {
                                                        for (int i14 = 0; i14 < storyViewsList.views.size(); i14++) {
                                                            TL_stories.StoryView storyView = storyViewsList.views.get(i14);
                                                            if (hVar.d(storyView.user_id)) {
                                                                hVar.k(Boolean.valueOf(storyView.blocked_my_stories_from), storyView.user_id);
                                                            }
                                                        }
                                                    }
                                                    MessagesController.getInstance(i13).putUsers(storyViewsList.users, false);
                                                    MessagesController.getInstance(i13).putChats(storyViewsList.chats, false);
                                                    boolean z12 = true;
                                                    MessagesStorage.getInstance(i13).putUsersAndChats(storyViewsList.users, storyViewsList.chats, true, false);
                                                    if (t5Var2.l) {
                                                        t5Var2.l = false;
                                                        for (int i15 = 0; i15 < arrayList3.size(); i15++) {
                                                            t5Var2.p.add(Long.valueOf(((TL_stories.StoryView) arrayList3.get(i15)).user_id));
                                                        }
                                                        arrayList3.clear();
                                                        arrayList2.clear();
                                                    }
                                                    if (t5Var2.q) {
                                                        arrayList2.addAll(storyViewsList.views);
                                                        t5Var2.a();
                                                    } else {
                                                        arrayList3.addAll(storyViewsList.views);
                                                    }
                                                    if (storyViewsList.views.isEmpty()) {
                                                        t5Var2.m = false;
                                                    } else {
                                                        t5Var2.m = true;
                                                    }
                                                    String str2 = storyViewsList.next_offset;
                                                    t5Var2.n = str2;
                                                    if (TextUtils.isEmpty(str2)) {
                                                        t5Var2.m = false;
                                                    }
                                                    if (storyItem2.views == null) {
                                                        storyItem2.views = new TL_stories.TL_storyViews();
                                                    }
                                                    int i16 = storyViewsList.count;
                                                    TL_stories.StoryViews storyViews = storyItem2.views;
                                                    if (i16 > storyViews.views_count) {
                                                        storyViews.recent_viewers.clear();
                                                        for (int i17 = 0; i17 < Math.min(3, storyViewsList.users.size()); i17 = com.google.android.gms.internal.play_billing.k3.h(storyViewsList.users.get(i17).id, storyItem2.views.recent_viewers, i17, 1)) {
                                                        }
                                                        storyItem2.views.views_count = storyViewsList.count;
                                                        z11 = true;
                                                    } else {
                                                        z11 = false;
                                                    }
                                                    TL_stories.StoryViews storyViews2 = storyItem2.views;
                                                    int i18 = storyViews2.reactions_count;
                                                    int i19 = storyViewsList.reactions_count;
                                                    if (i18 != i19) {
                                                        storyViews2.reactions_count = i19;
                                                    } else {
                                                        z12 = z11;
                                                    }
                                                    if (z12) {
                                                        NotificationCenter.getInstance(i13).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
                                                    }
                                                } else {
                                                    TLRPC.TL_error tL_error2 = tL_error;
                                                    if (tL_error2 != null && "MSG_ID_INVALID".equals(tL_error2.text)) {
                                                        t5Var2.a = 0;
                                                    }
                                                    t5Var2.m = false;
                                                }
                                                FileLog.d("SelfStoryViewsPage " + storyItem2.id + " response  totalItems " + arrayList3.size() + " has next " + t5Var2.m);
                                                for (int i20 = 0; i20 < arrayList.size(); i20++) {
                                                    ((u5) arrayList.get(i20)).e(t5Var2);
                                                }
                                                if (arrayList3.size() < 20 && t5Var2.m) {
                                                    t5Var2.c();
                                                    break;
                                                }
                                            }
                                            break;
                                        default:
                                            t5 t5Var3 = t5Var;
                                            ArrayList arrayList4 = t5Var3.r;
                                            TL_stories.StoryItem storyItem3 = t5Var3.b;
                                            int i21 = t5Var3.d;
                                            ArrayList arrayList5 = t5Var3.i;
                                            if (iArr[0] != t5Var3.o) {
                                                FileLog.d("SelfStoryViewsPage reactions " + storyItem3.id + " localId != reqId");
                                                break;
                                            } else {
                                                t5Var3.e = false;
                                                t5Var3.o = -1;
                                                TLObject tLObject3 = tLObject;
                                                if (tLObject3 != null) {
                                                    TL_stories.TL_storyReactionsList tL_storyReactionsList = (TL_stories.TL_storyReactionsList) tLObject3;
                                                    MessagesController.getInstance(i21).putUsers(tL_storyReactionsList.users, false);
                                                    MessagesController.getInstance(i21).putChats(tL_storyReactionsList.chats, false);
                                                    MessagesStorage.getInstance(i21).putUsersAndChats(tL_storyReactionsList.users, tL_storyReactionsList.chats, true, false);
                                                    if (t5Var3.l) {
                                                        t5Var3.l = false;
                                                        for (int i22 = 0; i22 < arrayList5.size(); i22++) {
                                                            t5Var3.p.add(Long.valueOf(DialogObject.getPeerDialogId(((TL_stories.StoryReaction) arrayList5.get(i22)).peer_id)));
                                                        }
                                                        arrayList5.clear();
                                                        t5Var3.h.clear();
                                                    }
                                                    arrayList5.addAll(tL_storyReactionsList.reactions);
                                                    if (tL_storyReactionsList.reactions.isEmpty()) {
                                                        t5Var3.m = false;
                                                    } else {
                                                        t5Var3.m = true;
                                                    }
                                                    String str3 = tL_storyReactionsList.next_offset;
                                                    t5Var3.n = str3;
                                                    if (TextUtils.isEmpty(str3)) {
                                                        t5Var3.m = false;
                                                    }
                                                    if (storyItem3.views == null) {
                                                        storyItem3.views = new TL_stories.TL_storyViews();
                                                    }
                                                    int i23 = t5Var3.a;
                                                    int i24 = tL_storyReactionsList.count;
                                                    boolean z13 = i23 != i24;
                                                    t5Var3.a = i24;
                                                    if (z13) {
                                                        NotificationCenter.getInstance(i21).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
                                                    }
                                                } else {
                                                    TLRPC.TL_error tL_error3 = tL_error;
                                                    if (tL_error3 != null && "MSG_ID_INVALID".equals(tL_error3.text)) {
                                                        t5Var3.a = 0;
                                                    }
                                                    t5Var3.m = false;
                                                }
                                                FileLog.d("SelfStoryViewsPage reactions " + storyItem3.id + " response  totalItems " + arrayList5.size() + " has next " + t5Var3.m);
                                                for (int i25 = 0; i25 < arrayList4.size(); i25++) {
                                                    ((u5) arrayList4.get(i25)).e(t5Var3);
                                                }
                                                if (arrayList5.size() < 20 && t5Var3.m) {
                                                    t5Var3.c();
                                                    break;
                                                }
                                            }
                                            break;
                                    }
                                }
                            });
                            break;
                        default:
                            final int i13 = 0;
                            final t5 t5Var2 = this.b;
                            final int[] iArr2 = r2;
                            AndroidUtilities.runOnUIThread(new Runnable() { // from class: ci.s5
                                @Override // java.lang.Runnable
                                public final void run() {
                                    boolean z11;
                                    switch (i13) {
                                        case 0:
                                            t5 t5Var22 = t5Var2;
                                            ArrayList arrayList = t5Var22.r;
                                            ArrayList arrayList2 = t5Var22.h;
                                            int i132 = t5Var22.d;
                                            ArrayList arrayList3 = t5Var22.g;
                                            TL_stories.StoryItem storyItem2 = t5Var22.b;
                                            if (iArr2[0] != t5Var22.o) {
                                                FileLog.d("SelfStoryViewsPage " + storyItem2.id + " localId != reqId");
                                                break;
                                            } else {
                                                t5Var22.e = false;
                                                t5Var22.o = -1;
                                                TLObject tLObject2 = tLObject;
                                                if (tLObject2 != null) {
                                                    TL_stories.StoryViewsList storyViewsList = (TL_stories.StoryViewsList) tLObject2;
                                                    a0.h hVar = MessagesController.getInstance(i132).getStoriesController().M;
                                                    if (storyViewsList.views != null) {
                                                        for (int i14 = 0; i14 < storyViewsList.views.size(); i14++) {
                                                            TL_stories.StoryView storyView = storyViewsList.views.get(i14);
                                                            if (hVar.d(storyView.user_id)) {
                                                                hVar.k(Boolean.valueOf(storyView.blocked_my_stories_from), storyView.user_id);
                                                            }
                                                        }
                                                    }
                                                    MessagesController.getInstance(i132).putUsers(storyViewsList.users, false);
                                                    MessagesController.getInstance(i132).putChats(storyViewsList.chats, false);
                                                    boolean z12 = true;
                                                    MessagesStorage.getInstance(i132).putUsersAndChats(storyViewsList.users, storyViewsList.chats, true, false);
                                                    if (t5Var22.l) {
                                                        t5Var22.l = false;
                                                        for (int i15 = 0; i15 < arrayList3.size(); i15++) {
                                                            t5Var22.p.add(Long.valueOf(((TL_stories.StoryView) arrayList3.get(i15)).user_id));
                                                        }
                                                        arrayList3.clear();
                                                        arrayList2.clear();
                                                    }
                                                    if (t5Var22.q) {
                                                        arrayList2.addAll(storyViewsList.views);
                                                        t5Var22.a();
                                                    } else {
                                                        arrayList3.addAll(storyViewsList.views);
                                                    }
                                                    if (storyViewsList.views.isEmpty()) {
                                                        t5Var22.m = false;
                                                    } else {
                                                        t5Var22.m = true;
                                                    }
                                                    String str2 = storyViewsList.next_offset;
                                                    t5Var22.n = str2;
                                                    if (TextUtils.isEmpty(str2)) {
                                                        t5Var22.m = false;
                                                    }
                                                    if (storyItem2.views == null) {
                                                        storyItem2.views = new TL_stories.TL_storyViews();
                                                    }
                                                    int i16 = storyViewsList.count;
                                                    TL_stories.StoryViews storyViews = storyItem2.views;
                                                    if (i16 > storyViews.views_count) {
                                                        storyViews.recent_viewers.clear();
                                                        for (int i17 = 0; i17 < Math.min(3, storyViewsList.users.size()); i17 = com.google.android.gms.internal.play_billing.k3.h(storyViewsList.users.get(i17).id, storyItem2.views.recent_viewers, i17, 1)) {
                                                        }
                                                        storyItem2.views.views_count = storyViewsList.count;
                                                        z11 = true;
                                                    } else {
                                                        z11 = false;
                                                    }
                                                    TL_stories.StoryViews storyViews2 = storyItem2.views;
                                                    int i18 = storyViews2.reactions_count;
                                                    int i19 = storyViewsList.reactions_count;
                                                    if (i18 != i19) {
                                                        storyViews2.reactions_count = i19;
                                                    } else {
                                                        z12 = z11;
                                                    }
                                                    if (z12) {
                                                        NotificationCenter.getInstance(i132).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
                                                    }
                                                } else {
                                                    TLRPC.TL_error tL_error2 = tL_error;
                                                    if (tL_error2 != null && "MSG_ID_INVALID".equals(tL_error2.text)) {
                                                        t5Var22.a = 0;
                                                    }
                                                    t5Var22.m = false;
                                                }
                                                FileLog.d("SelfStoryViewsPage " + storyItem2.id + " response  totalItems " + arrayList3.size() + " has next " + t5Var22.m);
                                                for (int i20 = 0; i20 < arrayList.size(); i20++) {
                                                    ((u5) arrayList.get(i20)).e(t5Var22);
                                                }
                                                if (arrayList3.size() < 20 && t5Var22.m) {
                                                    t5Var22.c();
                                                    break;
                                                }
                                            }
                                            break;
                                        default:
                                            t5 t5Var3 = t5Var2;
                                            ArrayList arrayList4 = t5Var3.r;
                                            TL_stories.StoryItem storyItem3 = t5Var3.b;
                                            int i21 = t5Var3.d;
                                            ArrayList arrayList5 = t5Var3.i;
                                            if (iArr2[0] != t5Var3.o) {
                                                FileLog.d("SelfStoryViewsPage reactions " + storyItem3.id + " localId != reqId");
                                                break;
                                            } else {
                                                t5Var3.e = false;
                                                t5Var3.o = -1;
                                                TLObject tLObject3 = tLObject;
                                                if (tLObject3 != null) {
                                                    TL_stories.TL_storyReactionsList tL_storyReactionsList = (TL_stories.TL_storyReactionsList) tLObject3;
                                                    MessagesController.getInstance(i21).putUsers(tL_storyReactionsList.users, false);
                                                    MessagesController.getInstance(i21).putChats(tL_storyReactionsList.chats, false);
                                                    MessagesStorage.getInstance(i21).putUsersAndChats(tL_storyReactionsList.users, tL_storyReactionsList.chats, true, false);
                                                    if (t5Var3.l) {
                                                        t5Var3.l = false;
                                                        for (int i22 = 0; i22 < arrayList5.size(); i22++) {
                                                            t5Var3.p.add(Long.valueOf(DialogObject.getPeerDialogId(((TL_stories.StoryReaction) arrayList5.get(i22)).peer_id)));
                                                        }
                                                        arrayList5.clear();
                                                        t5Var3.h.clear();
                                                    }
                                                    arrayList5.addAll(tL_storyReactionsList.reactions);
                                                    if (tL_storyReactionsList.reactions.isEmpty()) {
                                                        t5Var3.m = false;
                                                    } else {
                                                        t5Var3.m = true;
                                                    }
                                                    String str3 = tL_storyReactionsList.next_offset;
                                                    t5Var3.n = str3;
                                                    if (TextUtils.isEmpty(str3)) {
                                                        t5Var3.m = false;
                                                    }
                                                    if (storyItem3.views == null) {
                                                        storyItem3.views = new TL_stories.TL_storyViews();
                                                    }
                                                    int i23 = t5Var3.a;
                                                    int i24 = tL_storyReactionsList.count;
                                                    boolean z13 = i23 != i24;
                                                    t5Var3.a = i24;
                                                    if (z13) {
                                                        NotificationCenter.getInstance(i21).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
                                                    }
                                                } else {
                                                    TLRPC.TL_error tL_error3 = tL_error;
                                                    if (tL_error3 != null && "MSG_ID_INVALID".equals(tL_error3.text)) {
                                                        t5Var3.a = 0;
                                                    }
                                                    t5Var3.m = false;
                                                }
                                                FileLog.d("SelfStoryViewsPage reactions " + storyItem3.id + " response  totalItems " + arrayList5.size() + " has next " + t5Var3.m);
                                                for (int i25 = 0; i25 < arrayList4.size(); i25++) {
                                                    ((u5) arrayList4.get(i25)).e(t5Var3);
                                                }
                                                if (arrayList5.size() < 20 && t5Var3.m) {
                                                    t5Var3.c();
                                                    break;
                                                }
                                            }
                                            break;
                                    }
                                }
                            });
                            break;
                    }
                }
            });
            this.o = sendRequest;
            final int[] iArr = {sendRequest};
            return;
        }
        TL_stories.TL_stories_getStoryViewsList tL_stories_getStoryViewsList = new TL_stories.TL_stories_getStoryViewsList();
        tL_stories_getStoryViewsList.id = storyItem.id;
        tL_stories_getStoryViewsList.peer = MessagesController.getInstance(i10).getInputPeer(j10);
        if (this.q) {
            tL_stories_getStoryViewsList.q = "";
            tL_stories_getStoryViewsList.just_contacts = false;
            tL_stories_getStoryViewsList.reactions_first = true;
        } else {
            String str2 = f5Var.c;
            tL_stories_getStoryViewsList.q = str2;
            if (!TextUtils.isEmpty(str2)) {
                tL_stories_getStoryViewsList.flags |= 2;
            }
            tL_stories_getStoryViewsList.just_contacts = f5Var.b;
            tL_stories_getStoryViewsList.reactions_first = f5Var.a;
        }
        tL_stories_getStoryViewsList.limit = (this.l || this.g.size() < 20) ? 20 : 100;
        String str3 = this.n;
        tL_stories_getStoryViewsList.offset = str3;
        if (str3 == null) {
            tL_stories_getStoryViewsList.offset = "";
        }
        this.e = true;
        FileLog.d("SelfStoryViewsPage load next " + storyItem.id + " " + this.l + " offset=" + tL_stories_getStoryViewsList.offset + " q" + tL_stories_getStoryViewsList.q + " " + tL_stories_getStoryViewsList.just_contacts + " " + tL_stories_getStoryViewsList.reactions_first);
        final int i12 = 1;
        int sendRequest2 = ConnectionsManager.getInstance(i10).sendRequest(tL_stories_getStoryViewsList, new RequestDelegate(this) { // from class: ci.r5
            public final /* synthetic */ t5 b;

            {
                this.b = this;
            }

            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                switch (i12) {
                    case 0:
                        final int i122 = 1;
                        final t5 t5Var = this.b;
                        final int[] iArr2 = r2;
                        AndroidUtilities.runOnUIThread(new Runnable() { // from class: ci.s5
                            @Override // java.lang.Runnable
                            public final void run() {
                                boolean z11;
                                switch (i122) {
                                    case 0:
                                        t5 t5Var22 = t5Var;
                                        ArrayList arrayList = t5Var22.r;
                                        ArrayList arrayList2 = t5Var22.h;
                                        int i132 = t5Var22.d;
                                        ArrayList arrayList3 = t5Var22.g;
                                        TL_stories.StoryItem storyItem2 = t5Var22.b;
                                        if (iArr2[0] != t5Var22.o) {
                                            FileLog.d("SelfStoryViewsPage " + storyItem2.id + " localId != reqId");
                                            break;
                                        } else {
                                            t5Var22.e = false;
                                            t5Var22.o = -1;
                                            TLObject tLObject2 = tLObject;
                                            if (tLObject2 != null) {
                                                TL_stories.StoryViewsList storyViewsList = (TL_stories.StoryViewsList) tLObject2;
                                                a0.h hVar = MessagesController.getInstance(i132).getStoriesController().M;
                                                if (storyViewsList.views != null) {
                                                    for (int i14 = 0; i14 < storyViewsList.views.size(); i14++) {
                                                        TL_stories.StoryView storyView = storyViewsList.views.get(i14);
                                                        if (hVar.d(storyView.user_id)) {
                                                            hVar.k(Boolean.valueOf(storyView.blocked_my_stories_from), storyView.user_id);
                                                        }
                                                    }
                                                }
                                                MessagesController.getInstance(i132).putUsers(storyViewsList.users, false);
                                                MessagesController.getInstance(i132).putChats(storyViewsList.chats, false);
                                                boolean z12 = true;
                                                MessagesStorage.getInstance(i132).putUsersAndChats(storyViewsList.users, storyViewsList.chats, true, false);
                                                if (t5Var22.l) {
                                                    t5Var22.l = false;
                                                    for (int i15 = 0; i15 < arrayList3.size(); i15++) {
                                                        t5Var22.p.add(Long.valueOf(((TL_stories.StoryView) arrayList3.get(i15)).user_id));
                                                    }
                                                    arrayList3.clear();
                                                    arrayList2.clear();
                                                }
                                                if (t5Var22.q) {
                                                    arrayList2.addAll(storyViewsList.views);
                                                    t5Var22.a();
                                                } else {
                                                    arrayList3.addAll(storyViewsList.views);
                                                }
                                                if (storyViewsList.views.isEmpty()) {
                                                    t5Var22.m = false;
                                                } else {
                                                    t5Var22.m = true;
                                                }
                                                String str22 = storyViewsList.next_offset;
                                                t5Var22.n = str22;
                                                if (TextUtils.isEmpty(str22)) {
                                                    t5Var22.m = false;
                                                }
                                                if (storyItem2.views == null) {
                                                    storyItem2.views = new TL_stories.TL_storyViews();
                                                }
                                                int i16 = storyViewsList.count;
                                                TL_stories.StoryViews storyViews = storyItem2.views;
                                                if (i16 > storyViews.views_count) {
                                                    storyViews.recent_viewers.clear();
                                                    for (int i17 = 0; i17 < Math.min(3, storyViewsList.users.size()); i17 = com.google.android.gms.internal.play_billing.k3.h(storyViewsList.users.get(i17).id, storyItem2.views.recent_viewers, i17, 1)) {
                                                    }
                                                    storyItem2.views.views_count = storyViewsList.count;
                                                    z11 = true;
                                                } else {
                                                    z11 = false;
                                                }
                                                TL_stories.StoryViews storyViews2 = storyItem2.views;
                                                int i18 = storyViews2.reactions_count;
                                                int i19 = storyViewsList.reactions_count;
                                                if (i18 != i19) {
                                                    storyViews2.reactions_count = i19;
                                                } else {
                                                    z12 = z11;
                                                }
                                                if (z12) {
                                                    NotificationCenter.getInstance(i132).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
                                                }
                                            } else {
                                                TLRPC.TL_error tL_error2 = tL_error;
                                                if (tL_error2 != null && "MSG_ID_INVALID".equals(tL_error2.text)) {
                                                    t5Var22.a = 0;
                                                }
                                                t5Var22.m = false;
                                            }
                                            FileLog.d("SelfStoryViewsPage " + storyItem2.id + " response  totalItems " + arrayList3.size() + " has next " + t5Var22.m);
                                            for (int i20 = 0; i20 < arrayList.size(); i20++) {
                                                ((u5) arrayList.get(i20)).e(t5Var22);
                                            }
                                            if (arrayList3.size() < 20 && t5Var22.m) {
                                                t5Var22.c();
                                                break;
                                            }
                                        }
                                        break;
                                    default:
                                        t5 t5Var3 = t5Var;
                                        ArrayList arrayList4 = t5Var3.r;
                                        TL_stories.StoryItem storyItem3 = t5Var3.b;
                                        int i21 = t5Var3.d;
                                        ArrayList arrayList5 = t5Var3.i;
                                        if (iArr2[0] != t5Var3.o) {
                                            FileLog.d("SelfStoryViewsPage reactions " + storyItem3.id + " localId != reqId");
                                            break;
                                        } else {
                                            t5Var3.e = false;
                                            t5Var3.o = -1;
                                            TLObject tLObject3 = tLObject;
                                            if (tLObject3 != null) {
                                                TL_stories.TL_storyReactionsList tL_storyReactionsList = (TL_stories.TL_storyReactionsList) tLObject3;
                                                MessagesController.getInstance(i21).putUsers(tL_storyReactionsList.users, false);
                                                MessagesController.getInstance(i21).putChats(tL_storyReactionsList.chats, false);
                                                MessagesStorage.getInstance(i21).putUsersAndChats(tL_storyReactionsList.users, tL_storyReactionsList.chats, true, false);
                                                if (t5Var3.l) {
                                                    t5Var3.l = false;
                                                    for (int i22 = 0; i22 < arrayList5.size(); i22++) {
                                                        t5Var3.p.add(Long.valueOf(DialogObject.getPeerDialogId(((TL_stories.StoryReaction) arrayList5.get(i22)).peer_id)));
                                                    }
                                                    arrayList5.clear();
                                                    t5Var3.h.clear();
                                                }
                                                arrayList5.addAll(tL_storyReactionsList.reactions);
                                                if (tL_storyReactionsList.reactions.isEmpty()) {
                                                    t5Var3.m = false;
                                                } else {
                                                    t5Var3.m = true;
                                                }
                                                String str32 = tL_storyReactionsList.next_offset;
                                                t5Var3.n = str32;
                                                if (TextUtils.isEmpty(str32)) {
                                                    t5Var3.m = false;
                                                }
                                                if (storyItem3.views == null) {
                                                    storyItem3.views = new TL_stories.TL_storyViews();
                                                }
                                                int i23 = t5Var3.a;
                                                int i24 = tL_storyReactionsList.count;
                                                boolean z13 = i23 != i24;
                                                t5Var3.a = i24;
                                                if (z13) {
                                                    NotificationCenter.getInstance(i21).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
                                                }
                                            } else {
                                                TLRPC.TL_error tL_error3 = tL_error;
                                                if (tL_error3 != null && "MSG_ID_INVALID".equals(tL_error3.text)) {
                                                    t5Var3.a = 0;
                                                }
                                                t5Var3.m = false;
                                            }
                                            FileLog.d("SelfStoryViewsPage reactions " + storyItem3.id + " response  totalItems " + arrayList5.size() + " has next " + t5Var3.m);
                                            for (int i25 = 0; i25 < arrayList4.size(); i25++) {
                                                ((u5) arrayList4.get(i25)).e(t5Var3);
                                            }
                                            if (arrayList5.size() < 20 && t5Var3.m) {
                                                t5Var3.c();
                                                break;
                                            }
                                        }
                                        break;
                                }
                            }
                        });
                        break;
                    default:
                        final int i13 = 0;
                        final t5 t5Var2 = this.b;
                        final int[] iArr22 = r2;
                        AndroidUtilities.runOnUIThread(new Runnable() { // from class: ci.s5
                            @Override // java.lang.Runnable
                            public final void run() {
                                boolean z11;
                                switch (i13) {
                                    case 0:
                                        t5 t5Var22 = t5Var2;
                                        ArrayList arrayList = t5Var22.r;
                                        ArrayList arrayList2 = t5Var22.h;
                                        int i132 = t5Var22.d;
                                        ArrayList arrayList3 = t5Var22.g;
                                        TL_stories.StoryItem storyItem2 = t5Var22.b;
                                        if (iArr22[0] != t5Var22.o) {
                                            FileLog.d("SelfStoryViewsPage " + storyItem2.id + " localId != reqId");
                                            break;
                                        } else {
                                            t5Var22.e = false;
                                            t5Var22.o = -1;
                                            TLObject tLObject2 = tLObject;
                                            if (tLObject2 != null) {
                                                TL_stories.StoryViewsList storyViewsList = (TL_stories.StoryViewsList) tLObject2;
                                                a0.h hVar = MessagesController.getInstance(i132).getStoriesController().M;
                                                if (storyViewsList.views != null) {
                                                    for (int i14 = 0; i14 < storyViewsList.views.size(); i14++) {
                                                        TL_stories.StoryView storyView = storyViewsList.views.get(i14);
                                                        if (hVar.d(storyView.user_id)) {
                                                            hVar.k(Boolean.valueOf(storyView.blocked_my_stories_from), storyView.user_id);
                                                        }
                                                    }
                                                }
                                                MessagesController.getInstance(i132).putUsers(storyViewsList.users, false);
                                                MessagesController.getInstance(i132).putChats(storyViewsList.chats, false);
                                                boolean z12 = true;
                                                MessagesStorage.getInstance(i132).putUsersAndChats(storyViewsList.users, storyViewsList.chats, true, false);
                                                if (t5Var22.l) {
                                                    t5Var22.l = false;
                                                    for (int i15 = 0; i15 < arrayList3.size(); i15++) {
                                                        t5Var22.p.add(Long.valueOf(((TL_stories.StoryView) arrayList3.get(i15)).user_id));
                                                    }
                                                    arrayList3.clear();
                                                    arrayList2.clear();
                                                }
                                                if (t5Var22.q) {
                                                    arrayList2.addAll(storyViewsList.views);
                                                    t5Var22.a();
                                                } else {
                                                    arrayList3.addAll(storyViewsList.views);
                                                }
                                                if (storyViewsList.views.isEmpty()) {
                                                    t5Var22.m = false;
                                                } else {
                                                    t5Var22.m = true;
                                                }
                                                String str22 = storyViewsList.next_offset;
                                                t5Var22.n = str22;
                                                if (TextUtils.isEmpty(str22)) {
                                                    t5Var22.m = false;
                                                }
                                                if (storyItem2.views == null) {
                                                    storyItem2.views = new TL_stories.TL_storyViews();
                                                }
                                                int i16 = storyViewsList.count;
                                                TL_stories.StoryViews storyViews = storyItem2.views;
                                                if (i16 > storyViews.views_count) {
                                                    storyViews.recent_viewers.clear();
                                                    for (int i17 = 0; i17 < Math.min(3, storyViewsList.users.size()); i17 = com.google.android.gms.internal.play_billing.k3.h(storyViewsList.users.get(i17).id, storyItem2.views.recent_viewers, i17, 1)) {
                                                    }
                                                    storyItem2.views.views_count = storyViewsList.count;
                                                    z11 = true;
                                                } else {
                                                    z11 = false;
                                                }
                                                TL_stories.StoryViews storyViews2 = storyItem2.views;
                                                int i18 = storyViews2.reactions_count;
                                                int i19 = storyViewsList.reactions_count;
                                                if (i18 != i19) {
                                                    storyViews2.reactions_count = i19;
                                                } else {
                                                    z12 = z11;
                                                }
                                                if (z12) {
                                                    NotificationCenter.getInstance(i132).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
                                                }
                                            } else {
                                                TLRPC.TL_error tL_error2 = tL_error;
                                                if (tL_error2 != null && "MSG_ID_INVALID".equals(tL_error2.text)) {
                                                    t5Var22.a = 0;
                                                }
                                                t5Var22.m = false;
                                            }
                                            FileLog.d("SelfStoryViewsPage " + storyItem2.id + " response  totalItems " + arrayList3.size() + " has next " + t5Var22.m);
                                            for (int i20 = 0; i20 < arrayList.size(); i20++) {
                                                ((u5) arrayList.get(i20)).e(t5Var22);
                                            }
                                            if (arrayList3.size() < 20 && t5Var22.m) {
                                                t5Var22.c();
                                                break;
                                            }
                                        }
                                        break;
                                    default:
                                        t5 t5Var3 = t5Var2;
                                        ArrayList arrayList4 = t5Var3.r;
                                        TL_stories.StoryItem storyItem3 = t5Var3.b;
                                        int i21 = t5Var3.d;
                                        ArrayList arrayList5 = t5Var3.i;
                                        if (iArr22[0] != t5Var3.o) {
                                            FileLog.d("SelfStoryViewsPage reactions " + storyItem3.id + " localId != reqId");
                                            break;
                                        } else {
                                            t5Var3.e = false;
                                            t5Var3.o = -1;
                                            TLObject tLObject3 = tLObject;
                                            if (tLObject3 != null) {
                                                TL_stories.TL_storyReactionsList tL_storyReactionsList = (TL_stories.TL_storyReactionsList) tLObject3;
                                                MessagesController.getInstance(i21).putUsers(tL_storyReactionsList.users, false);
                                                MessagesController.getInstance(i21).putChats(tL_storyReactionsList.chats, false);
                                                MessagesStorage.getInstance(i21).putUsersAndChats(tL_storyReactionsList.users, tL_storyReactionsList.chats, true, false);
                                                if (t5Var3.l) {
                                                    t5Var3.l = false;
                                                    for (int i22 = 0; i22 < arrayList5.size(); i22++) {
                                                        t5Var3.p.add(Long.valueOf(DialogObject.getPeerDialogId(((TL_stories.StoryReaction) arrayList5.get(i22)).peer_id)));
                                                    }
                                                    arrayList5.clear();
                                                    t5Var3.h.clear();
                                                }
                                                arrayList5.addAll(tL_storyReactionsList.reactions);
                                                if (tL_storyReactionsList.reactions.isEmpty()) {
                                                    t5Var3.m = false;
                                                } else {
                                                    t5Var3.m = true;
                                                }
                                                String str32 = tL_storyReactionsList.next_offset;
                                                t5Var3.n = str32;
                                                if (TextUtils.isEmpty(str32)) {
                                                    t5Var3.m = false;
                                                }
                                                if (storyItem3.views == null) {
                                                    storyItem3.views = new TL_stories.TL_storyViews();
                                                }
                                                int i23 = t5Var3.a;
                                                int i24 = tL_storyReactionsList.count;
                                                boolean z13 = i23 != i24;
                                                t5Var3.a = i24;
                                                if (z13) {
                                                    NotificationCenter.getInstance(i21).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
                                                }
                                            } else {
                                                TLRPC.TL_error tL_error3 = tL_error;
                                                if (tL_error3 != null && "MSG_ID_INVALID".equals(tL_error3.text)) {
                                                    t5Var3.a = 0;
                                                }
                                                t5Var3.m = false;
                                            }
                                            FileLog.d("SelfStoryViewsPage reactions " + storyItem3.id + " response  totalItems " + arrayList5.size() + " has next " + t5Var3.m);
                                            for (int i25 = 0; i25 < arrayList4.size(); i25++) {
                                                ((u5) arrayList4.get(i25)).e(t5Var3);
                                            }
                                            if (arrayList5.size() < 20 && t5Var3.m) {
                                                t5Var3.c();
                                                break;
                                            }
                                        }
                                        break;
                                }
                            }
                        });
                        break;
                }
            }
        });
        this.o = sendRequest2;
        final int[] iArr2 = {sendRequest2};
    }

    public final void d() {
        if (this.o >= 0) {
            ConnectionsManager.getInstance(this.d).cancelRequest(this.o, false);
        }
        this.o = -1;
    }

    public final void e(f5 f5Var, boolean z10, boolean z11) {
        f5 f5Var2 = new f5();
        f5Var2.a = f5Var.a;
        f5Var2.b = f5Var.b;
        f5Var2.c = f5Var.c;
        int i10 = 0;
        if (!z10) {
            f5Var2.b = false;
        }
        if (!z11) {
            f5Var2.a = true;
        }
        f5 f5Var3 = this.s;
        if (f5Var3.equals(f5Var2)) {
            return;
        }
        f5Var3.a = f5Var2.a;
        f5Var3.b = f5Var2.b;
        f5Var3.c = f5Var2.c;
        if (this.f || !this.q) {
            d();
            this.g.clear();
            this.i.clear();
            this.l = true;
            this.e = false;
            this.m = true;
            this.n = "";
            c();
            return;
        }
        a();
        while (true) {
            ArrayList arrayList = this.r;
            if (i10 >= arrayList.size()) {
                return;
            }
            ((u5) arrayList.get(i10)).e(this);
            i10++;
        }
    }
}
