package ih;

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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class f5 {
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
    public final s4 s = new s4();

    public f5(int i9, long j10, TL_stories.StoryItem storyItem) {
        TL_stories.StoryViews storyViews;
        this.d = i9;
        this.b = storyItem;
        this.f = j10 < 0;
        this.c = j10;
        TL_stories.StoryViews storyViews2 = storyItem.views;
        int i10 = storyViews2 == null ? 0 : storyViews2.views_count;
        this.a = i10;
        if (i10 < 200) {
            this.q = true;
        }
        boolean z10 = p7.v(storyItem) && !UserConfig.getInstance(i9).isPremium();
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
            for (int i11 = 0; i11 < storyItem.views.recent_viewers.size(); i11++) {
                Long l10 = storyItem.views.recent_viewers.get(i11);
                long longValue = l10.longValue();
                if (MessagesController.getInstance(i9).getUser(l10) != null) {
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
        s4 s4Var = this.s;
        boolean z10 = s4Var.b;
        ArrayList arrayList2 = this.h;
        if (z10 || !TextUtils.isEmpty(s4Var.c)) {
            if (TextUtils.isEmpty(s4Var.c)) {
                str = null;
                str2 = null;
                str3 = null;
                str4 = null;
            } else {
                str = s4Var.c.trim().toLowerCase();
                str2 = LocaleController.getInstance().getTranslitString(str);
                str4 = ta.b.d(" ", str);
                str3 = ta.b.d(" ", str2);
            }
            for (int i9 = 0; i9 < arrayList2.size(); i9++) {
                TLRPC.User user = MessagesController.getInstance(this.d).getUser(Long.valueOf(((TL_stories.StoryView) arrayList2.get(i9)).user_id));
                boolean z11 = !s4Var.b || (user != null && user.contact);
                if (z11 && str != null) {
                    String lowerCase = ContactsController.formatName(user.first_name, user.last_name).toLowerCase();
                    String publicUsername = UserObject.getPublicUsername(user);
                    String translitSafe = AndroidUtilities.translitSafe(lowerCase);
                    if ((lowerCase == null || (!lowerCase.startsWith(str) && !lowerCase.contains(str4))) && ((translitSafe == null || (!translitSafe.startsWith(str2) && !translitSafe.contains(str3))) && (publicUsername == null || (!publicUsername.startsWith(str2) && !publicUsername.contains(str3))))) {
                        z11 = false;
                    }
                }
                if (z11) {
                    arrayList.add((TL_stories.StoryView) arrayList2.get(i9));
                }
            }
        } else {
            arrayList.addAll(arrayList2);
        }
        if (s4Var.a) {
            return;
        }
        Collections.sort(arrayList, Comparator$-CC.comparingInt(new ff.d(7)));
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
        s4 s4Var = this.s;
        int i9 = this.d;
        TL_stories.StoryItem storyItem = this.b;
        if (z10) {
            TL_stories.TL_getStoryReactionsList tL_getStoryReactionsList = new TL_stories.TL_getStoryReactionsList();
            tL_getStoryReactionsList.forwards_first = s4Var.a;
            tL_getStoryReactionsList.id = storyItem.id;
            tL_getStoryReactionsList.peer = MessagesController.getInstance(i9).getInputPeer(j10);
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
            final int i10 = 0;
            int sendRequest = ConnectionsManager.getInstance(i9).sendRequest(tL_getStoryReactionsList, new RequestDelegate(this) { // from class: ih.d5
                public final /* synthetic */ f5 b;

                {
                    this.b = this;
                }

                @Override // org.telegram.tgnet.RequestDelegate
                public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                    switch (i10) {
                        case 0:
                            final int i11 = 1;
                            final f5 f5Var = this.b;
                            final int[] iArr = r2;
                            AndroidUtilities.runOnUIThread(new Runnable() { // from class: ih.e5
                                @Override // java.lang.Runnable
                                public final void run() {
                                    boolean z11;
                                    switch (i11) {
                                        case 0:
                                            f5 f5Var2 = f5Var;
                                            ArrayList arrayList = f5Var2.r;
                                            ArrayList arrayList2 = f5Var2.h;
                                            int i12 = f5Var2.d;
                                            ArrayList arrayList3 = f5Var2.g;
                                            TL_stories.StoryItem storyItem2 = f5Var2.b;
                                            if (iArr[0] != f5Var2.o) {
                                                FileLog.d("SelfStoryViewsPage " + storyItem2.id + " localId != reqId");
                                                break;
                                            } else {
                                                f5Var2.e = false;
                                                f5Var2.o = -1;
                                                TLObject tLObject2 = tLObject;
                                                if (tLObject2 != null) {
                                                    TL_stories.StoryViewsList storyViewsList = (TL_stories.StoryViewsList) tLObject2;
                                                    a0.h hVar = MessagesController.getInstance(i12).getStoriesController().M;
                                                    if (storyViewsList.views != null) {
                                                        for (int i13 = 0; i13 < storyViewsList.views.size(); i13++) {
                                                            TL_stories.StoryView storyView = storyViewsList.views.get(i13);
                                                            if (hVar.d(storyView.user_id)) {
                                                                hVar.k(Boolean.valueOf(storyView.blocked_my_stories_from), storyView.user_id);
                                                            }
                                                        }
                                                    }
                                                    MessagesController.getInstance(i12).putUsers(storyViewsList.users, false);
                                                    MessagesController.getInstance(i12).putChats(storyViewsList.chats, false);
                                                    boolean z12 = true;
                                                    MessagesStorage.getInstance(i12).putUsersAndChats(storyViewsList.users, storyViewsList.chats, true, false);
                                                    if (f5Var2.l) {
                                                        f5Var2.l = false;
                                                        for (int i14 = 0; i14 < arrayList3.size(); i14++) {
                                                            f5Var2.p.add(Long.valueOf(((TL_stories.StoryView) arrayList3.get(i14)).user_id));
                                                        }
                                                        arrayList3.clear();
                                                        arrayList2.clear();
                                                    }
                                                    if (f5Var2.q) {
                                                        arrayList2.addAll(storyViewsList.views);
                                                        f5Var2.a();
                                                    } else {
                                                        arrayList3.addAll(storyViewsList.views);
                                                    }
                                                    if (storyViewsList.views.isEmpty()) {
                                                        f5Var2.m = false;
                                                    } else {
                                                        f5Var2.m = true;
                                                    }
                                                    String str2 = storyViewsList.next_offset;
                                                    f5Var2.n = str2;
                                                    if (TextUtils.isEmpty(str2)) {
                                                        f5Var2.m = false;
                                                    }
                                                    if (storyItem2.views == null) {
                                                        storyItem2.views = new TL_stories.TL_storyViews();
                                                    }
                                                    int i15 = storyViewsList.count;
                                                    TL_stories.StoryViews storyViews = storyItem2.views;
                                                    if (i15 > storyViews.views_count) {
                                                        storyViews.recent_viewers.clear();
                                                        for (int i16 = 0; i16 < Math.min(3, storyViewsList.users.size()); i16 = aa.d.g(storyViewsList.users.get(i16).id, storyItem2.views.recent_viewers, i16, 1)) {
                                                        }
                                                        storyItem2.views.views_count = storyViewsList.count;
                                                        z11 = true;
                                                    } else {
                                                        z11 = false;
                                                    }
                                                    TL_stories.StoryViews storyViews2 = storyItem2.views;
                                                    int i17 = storyViews2.reactions_count;
                                                    int i18 = storyViewsList.reactions_count;
                                                    if (i17 != i18) {
                                                        storyViews2.reactions_count = i18;
                                                    } else {
                                                        z12 = z11;
                                                    }
                                                    if (z12) {
                                                        NotificationCenter.getInstance(i12).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
                                                    }
                                                } else {
                                                    TLRPC.TL_error tL_error2 = tL_error;
                                                    if (tL_error2 != null && "MSG_ID_INVALID".equals(tL_error2.text)) {
                                                        f5Var2.a = 0;
                                                    }
                                                    f5Var2.m = false;
                                                }
                                                FileLog.d("SelfStoryViewsPage " + storyItem2.id + " response  totalItems " + arrayList3.size() + " has next " + f5Var2.m);
                                                for (int i19 = 0; i19 < arrayList.size(); i19++) {
                                                    ((g5) arrayList.get(i19)).e(f5Var2);
                                                }
                                                if (arrayList3.size() < 20 && f5Var2.m) {
                                                    f5Var2.c();
                                                    break;
                                                }
                                            }
                                            break;
                                        default:
                                            f5 f5Var3 = f5Var;
                                            ArrayList arrayList4 = f5Var3.r;
                                            TL_stories.StoryItem storyItem3 = f5Var3.b;
                                            int i20 = f5Var3.d;
                                            ArrayList arrayList5 = f5Var3.i;
                                            if (iArr[0] != f5Var3.o) {
                                                FileLog.d("SelfStoryViewsPage reactions " + storyItem3.id + " localId != reqId");
                                                break;
                                            } else {
                                                f5Var3.e = false;
                                                f5Var3.o = -1;
                                                TLObject tLObject3 = tLObject;
                                                if (tLObject3 != null) {
                                                    TL_stories.TL_storyReactionsList tL_storyReactionsList = (TL_stories.TL_storyReactionsList) tLObject3;
                                                    MessagesController.getInstance(i20).putUsers(tL_storyReactionsList.users, false);
                                                    MessagesController.getInstance(i20).putChats(tL_storyReactionsList.chats, false);
                                                    MessagesStorage.getInstance(i20).putUsersAndChats(tL_storyReactionsList.users, tL_storyReactionsList.chats, true, false);
                                                    if (f5Var3.l) {
                                                        f5Var3.l = false;
                                                        for (int i21 = 0; i21 < arrayList5.size(); i21++) {
                                                            f5Var3.p.add(Long.valueOf(DialogObject.getPeerDialogId(((TL_stories.StoryReaction) arrayList5.get(i21)).peer_id)));
                                                        }
                                                        arrayList5.clear();
                                                        f5Var3.h.clear();
                                                    }
                                                    arrayList5.addAll(tL_storyReactionsList.reactions);
                                                    if (tL_storyReactionsList.reactions.isEmpty()) {
                                                        f5Var3.m = false;
                                                    } else {
                                                        f5Var3.m = true;
                                                    }
                                                    String str3 = tL_storyReactionsList.next_offset;
                                                    f5Var3.n = str3;
                                                    if (TextUtils.isEmpty(str3)) {
                                                        f5Var3.m = false;
                                                    }
                                                    if (storyItem3.views == null) {
                                                        storyItem3.views = new TL_stories.TL_storyViews();
                                                    }
                                                    int i22 = f5Var3.a;
                                                    int i23 = tL_storyReactionsList.count;
                                                    boolean z13 = i22 != i23;
                                                    f5Var3.a = i23;
                                                    if (z13) {
                                                        NotificationCenter.getInstance(i20).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
                                                    }
                                                } else {
                                                    TLRPC.TL_error tL_error3 = tL_error;
                                                    if (tL_error3 != null && "MSG_ID_INVALID".equals(tL_error3.text)) {
                                                        f5Var3.a = 0;
                                                    }
                                                    f5Var3.m = false;
                                                }
                                                FileLog.d("SelfStoryViewsPage reactions " + storyItem3.id + " response  totalItems " + arrayList5.size() + " has next " + f5Var3.m);
                                                for (int i24 = 0; i24 < arrayList4.size(); i24++) {
                                                    ((g5) arrayList4.get(i24)).e(f5Var3);
                                                }
                                                if (arrayList5.size() < 20 && f5Var3.m) {
                                                    f5Var3.c();
                                                    break;
                                                }
                                            }
                                            break;
                                    }
                                }
                            });
                            break;
                        default:
                            final int i12 = 0;
                            final f5 f5Var2 = this.b;
                            final int[] iArr2 = r2;
                            AndroidUtilities.runOnUIThread(new Runnable() { // from class: ih.e5
                                @Override // java.lang.Runnable
                                public final void run() {
                                    boolean z11;
                                    switch (i12) {
                                        case 0:
                                            f5 f5Var22 = f5Var2;
                                            ArrayList arrayList = f5Var22.r;
                                            ArrayList arrayList2 = f5Var22.h;
                                            int i122 = f5Var22.d;
                                            ArrayList arrayList3 = f5Var22.g;
                                            TL_stories.StoryItem storyItem2 = f5Var22.b;
                                            if (iArr2[0] != f5Var22.o) {
                                                FileLog.d("SelfStoryViewsPage " + storyItem2.id + " localId != reqId");
                                                break;
                                            } else {
                                                f5Var22.e = false;
                                                f5Var22.o = -1;
                                                TLObject tLObject2 = tLObject;
                                                if (tLObject2 != null) {
                                                    TL_stories.StoryViewsList storyViewsList = (TL_stories.StoryViewsList) tLObject2;
                                                    a0.h hVar = MessagesController.getInstance(i122).getStoriesController().M;
                                                    if (storyViewsList.views != null) {
                                                        for (int i13 = 0; i13 < storyViewsList.views.size(); i13++) {
                                                            TL_stories.StoryView storyView = storyViewsList.views.get(i13);
                                                            if (hVar.d(storyView.user_id)) {
                                                                hVar.k(Boolean.valueOf(storyView.blocked_my_stories_from), storyView.user_id);
                                                            }
                                                        }
                                                    }
                                                    MessagesController.getInstance(i122).putUsers(storyViewsList.users, false);
                                                    MessagesController.getInstance(i122).putChats(storyViewsList.chats, false);
                                                    boolean z12 = true;
                                                    MessagesStorage.getInstance(i122).putUsersAndChats(storyViewsList.users, storyViewsList.chats, true, false);
                                                    if (f5Var22.l) {
                                                        f5Var22.l = false;
                                                        for (int i14 = 0; i14 < arrayList3.size(); i14++) {
                                                            f5Var22.p.add(Long.valueOf(((TL_stories.StoryView) arrayList3.get(i14)).user_id));
                                                        }
                                                        arrayList3.clear();
                                                        arrayList2.clear();
                                                    }
                                                    if (f5Var22.q) {
                                                        arrayList2.addAll(storyViewsList.views);
                                                        f5Var22.a();
                                                    } else {
                                                        arrayList3.addAll(storyViewsList.views);
                                                    }
                                                    if (storyViewsList.views.isEmpty()) {
                                                        f5Var22.m = false;
                                                    } else {
                                                        f5Var22.m = true;
                                                    }
                                                    String str2 = storyViewsList.next_offset;
                                                    f5Var22.n = str2;
                                                    if (TextUtils.isEmpty(str2)) {
                                                        f5Var22.m = false;
                                                    }
                                                    if (storyItem2.views == null) {
                                                        storyItem2.views = new TL_stories.TL_storyViews();
                                                    }
                                                    int i15 = storyViewsList.count;
                                                    TL_stories.StoryViews storyViews = storyItem2.views;
                                                    if (i15 > storyViews.views_count) {
                                                        storyViews.recent_viewers.clear();
                                                        for (int i16 = 0; i16 < Math.min(3, storyViewsList.users.size()); i16 = aa.d.g(storyViewsList.users.get(i16).id, storyItem2.views.recent_viewers, i16, 1)) {
                                                        }
                                                        storyItem2.views.views_count = storyViewsList.count;
                                                        z11 = true;
                                                    } else {
                                                        z11 = false;
                                                    }
                                                    TL_stories.StoryViews storyViews2 = storyItem2.views;
                                                    int i17 = storyViews2.reactions_count;
                                                    int i18 = storyViewsList.reactions_count;
                                                    if (i17 != i18) {
                                                        storyViews2.reactions_count = i18;
                                                    } else {
                                                        z12 = z11;
                                                    }
                                                    if (z12) {
                                                        NotificationCenter.getInstance(i122).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
                                                    }
                                                } else {
                                                    TLRPC.TL_error tL_error2 = tL_error;
                                                    if (tL_error2 != null && "MSG_ID_INVALID".equals(tL_error2.text)) {
                                                        f5Var22.a = 0;
                                                    }
                                                    f5Var22.m = false;
                                                }
                                                FileLog.d("SelfStoryViewsPage " + storyItem2.id + " response  totalItems " + arrayList3.size() + " has next " + f5Var22.m);
                                                for (int i19 = 0; i19 < arrayList.size(); i19++) {
                                                    ((g5) arrayList.get(i19)).e(f5Var22);
                                                }
                                                if (arrayList3.size() < 20 && f5Var22.m) {
                                                    f5Var22.c();
                                                    break;
                                                }
                                            }
                                            break;
                                        default:
                                            f5 f5Var3 = f5Var2;
                                            ArrayList arrayList4 = f5Var3.r;
                                            TL_stories.StoryItem storyItem3 = f5Var3.b;
                                            int i20 = f5Var3.d;
                                            ArrayList arrayList5 = f5Var3.i;
                                            if (iArr2[0] != f5Var3.o) {
                                                FileLog.d("SelfStoryViewsPage reactions " + storyItem3.id + " localId != reqId");
                                                break;
                                            } else {
                                                f5Var3.e = false;
                                                f5Var3.o = -1;
                                                TLObject tLObject3 = tLObject;
                                                if (tLObject3 != null) {
                                                    TL_stories.TL_storyReactionsList tL_storyReactionsList = (TL_stories.TL_storyReactionsList) tLObject3;
                                                    MessagesController.getInstance(i20).putUsers(tL_storyReactionsList.users, false);
                                                    MessagesController.getInstance(i20).putChats(tL_storyReactionsList.chats, false);
                                                    MessagesStorage.getInstance(i20).putUsersAndChats(tL_storyReactionsList.users, tL_storyReactionsList.chats, true, false);
                                                    if (f5Var3.l) {
                                                        f5Var3.l = false;
                                                        for (int i21 = 0; i21 < arrayList5.size(); i21++) {
                                                            f5Var3.p.add(Long.valueOf(DialogObject.getPeerDialogId(((TL_stories.StoryReaction) arrayList5.get(i21)).peer_id)));
                                                        }
                                                        arrayList5.clear();
                                                        f5Var3.h.clear();
                                                    }
                                                    arrayList5.addAll(tL_storyReactionsList.reactions);
                                                    if (tL_storyReactionsList.reactions.isEmpty()) {
                                                        f5Var3.m = false;
                                                    } else {
                                                        f5Var3.m = true;
                                                    }
                                                    String str3 = tL_storyReactionsList.next_offset;
                                                    f5Var3.n = str3;
                                                    if (TextUtils.isEmpty(str3)) {
                                                        f5Var3.m = false;
                                                    }
                                                    if (storyItem3.views == null) {
                                                        storyItem3.views = new TL_stories.TL_storyViews();
                                                    }
                                                    int i22 = f5Var3.a;
                                                    int i23 = tL_storyReactionsList.count;
                                                    boolean z13 = i22 != i23;
                                                    f5Var3.a = i23;
                                                    if (z13) {
                                                        NotificationCenter.getInstance(i20).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
                                                    }
                                                } else {
                                                    TLRPC.TL_error tL_error3 = tL_error;
                                                    if (tL_error3 != null && "MSG_ID_INVALID".equals(tL_error3.text)) {
                                                        f5Var3.a = 0;
                                                    }
                                                    f5Var3.m = false;
                                                }
                                                FileLog.d("SelfStoryViewsPage reactions " + storyItem3.id + " response  totalItems " + arrayList5.size() + " has next " + f5Var3.m);
                                                for (int i24 = 0; i24 < arrayList4.size(); i24++) {
                                                    ((g5) arrayList4.get(i24)).e(f5Var3);
                                                }
                                                if (arrayList5.size() < 20 && f5Var3.m) {
                                                    f5Var3.c();
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
        tL_stories_getStoryViewsList.peer = MessagesController.getInstance(i9).getInputPeer(j10);
        if (this.q) {
            tL_stories_getStoryViewsList.q = "";
            tL_stories_getStoryViewsList.just_contacts = false;
            tL_stories_getStoryViewsList.reactions_first = true;
        } else {
            String str2 = s4Var.c;
            tL_stories_getStoryViewsList.q = str2;
            if (!TextUtils.isEmpty(str2)) {
                tL_stories_getStoryViewsList.flags |= 2;
            }
            tL_stories_getStoryViewsList.just_contacts = s4Var.b;
            tL_stories_getStoryViewsList.reactions_first = s4Var.a;
        }
        tL_stories_getStoryViewsList.limit = (this.l || this.g.size() < 20) ? 20 : 100;
        String str3 = this.n;
        tL_stories_getStoryViewsList.offset = str3;
        if (str3 == null) {
            tL_stories_getStoryViewsList.offset = "";
        }
        this.e = true;
        FileLog.d("SelfStoryViewsPage load next " + storyItem.id + " " + this.l + " offset=" + tL_stories_getStoryViewsList.offset + " q" + tL_stories_getStoryViewsList.q + " " + tL_stories_getStoryViewsList.just_contacts + " " + tL_stories_getStoryViewsList.reactions_first);
        final int i11 = 1;
        int sendRequest2 = ConnectionsManager.getInstance(i9).sendRequest(tL_stories_getStoryViewsList, new RequestDelegate(this) { // from class: ih.d5
            public final /* synthetic */ f5 b;

            {
                this.b = this;
            }

            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                switch (i11) {
                    case 0:
                        final int i112 = 1;
                        final f5 f5Var = this.b;
                        final int[] iArr2 = r2;
                        AndroidUtilities.runOnUIThread(new Runnable() { // from class: ih.e5
                            @Override // java.lang.Runnable
                            public final void run() {
                                boolean z11;
                                switch (i112) {
                                    case 0:
                                        f5 f5Var22 = f5Var;
                                        ArrayList arrayList = f5Var22.r;
                                        ArrayList arrayList2 = f5Var22.h;
                                        int i122 = f5Var22.d;
                                        ArrayList arrayList3 = f5Var22.g;
                                        TL_stories.StoryItem storyItem2 = f5Var22.b;
                                        if (iArr2[0] != f5Var22.o) {
                                            FileLog.d("SelfStoryViewsPage " + storyItem2.id + " localId != reqId");
                                            break;
                                        } else {
                                            f5Var22.e = false;
                                            f5Var22.o = -1;
                                            TLObject tLObject2 = tLObject;
                                            if (tLObject2 != null) {
                                                TL_stories.StoryViewsList storyViewsList = (TL_stories.StoryViewsList) tLObject2;
                                                a0.h hVar = MessagesController.getInstance(i122).getStoriesController().M;
                                                if (storyViewsList.views != null) {
                                                    for (int i13 = 0; i13 < storyViewsList.views.size(); i13++) {
                                                        TL_stories.StoryView storyView = storyViewsList.views.get(i13);
                                                        if (hVar.d(storyView.user_id)) {
                                                            hVar.k(Boolean.valueOf(storyView.blocked_my_stories_from), storyView.user_id);
                                                        }
                                                    }
                                                }
                                                MessagesController.getInstance(i122).putUsers(storyViewsList.users, false);
                                                MessagesController.getInstance(i122).putChats(storyViewsList.chats, false);
                                                boolean z12 = true;
                                                MessagesStorage.getInstance(i122).putUsersAndChats(storyViewsList.users, storyViewsList.chats, true, false);
                                                if (f5Var22.l) {
                                                    f5Var22.l = false;
                                                    for (int i14 = 0; i14 < arrayList3.size(); i14++) {
                                                        f5Var22.p.add(Long.valueOf(((TL_stories.StoryView) arrayList3.get(i14)).user_id));
                                                    }
                                                    arrayList3.clear();
                                                    arrayList2.clear();
                                                }
                                                if (f5Var22.q) {
                                                    arrayList2.addAll(storyViewsList.views);
                                                    f5Var22.a();
                                                } else {
                                                    arrayList3.addAll(storyViewsList.views);
                                                }
                                                if (storyViewsList.views.isEmpty()) {
                                                    f5Var22.m = false;
                                                } else {
                                                    f5Var22.m = true;
                                                }
                                                String str22 = storyViewsList.next_offset;
                                                f5Var22.n = str22;
                                                if (TextUtils.isEmpty(str22)) {
                                                    f5Var22.m = false;
                                                }
                                                if (storyItem2.views == null) {
                                                    storyItem2.views = new TL_stories.TL_storyViews();
                                                }
                                                int i15 = storyViewsList.count;
                                                TL_stories.StoryViews storyViews = storyItem2.views;
                                                if (i15 > storyViews.views_count) {
                                                    storyViews.recent_viewers.clear();
                                                    for (int i16 = 0; i16 < Math.min(3, storyViewsList.users.size()); i16 = aa.d.g(storyViewsList.users.get(i16).id, storyItem2.views.recent_viewers, i16, 1)) {
                                                    }
                                                    storyItem2.views.views_count = storyViewsList.count;
                                                    z11 = true;
                                                } else {
                                                    z11 = false;
                                                }
                                                TL_stories.StoryViews storyViews2 = storyItem2.views;
                                                int i17 = storyViews2.reactions_count;
                                                int i18 = storyViewsList.reactions_count;
                                                if (i17 != i18) {
                                                    storyViews2.reactions_count = i18;
                                                } else {
                                                    z12 = z11;
                                                }
                                                if (z12) {
                                                    NotificationCenter.getInstance(i122).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
                                                }
                                            } else {
                                                TLRPC.TL_error tL_error2 = tL_error;
                                                if (tL_error2 != null && "MSG_ID_INVALID".equals(tL_error2.text)) {
                                                    f5Var22.a = 0;
                                                }
                                                f5Var22.m = false;
                                            }
                                            FileLog.d("SelfStoryViewsPage " + storyItem2.id + " response  totalItems " + arrayList3.size() + " has next " + f5Var22.m);
                                            for (int i19 = 0; i19 < arrayList.size(); i19++) {
                                                ((g5) arrayList.get(i19)).e(f5Var22);
                                            }
                                            if (arrayList3.size() < 20 && f5Var22.m) {
                                                f5Var22.c();
                                                break;
                                            }
                                        }
                                        break;
                                    default:
                                        f5 f5Var3 = f5Var;
                                        ArrayList arrayList4 = f5Var3.r;
                                        TL_stories.StoryItem storyItem3 = f5Var3.b;
                                        int i20 = f5Var3.d;
                                        ArrayList arrayList5 = f5Var3.i;
                                        if (iArr2[0] != f5Var3.o) {
                                            FileLog.d("SelfStoryViewsPage reactions " + storyItem3.id + " localId != reqId");
                                            break;
                                        } else {
                                            f5Var3.e = false;
                                            f5Var3.o = -1;
                                            TLObject tLObject3 = tLObject;
                                            if (tLObject3 != null) {
                                                TL_stories.TL_storyReactionsList tL_storyReactionsList = (TL_stories.TL_storyReactionsList) tLObject3;
                                                MessagesController.getInstance(i20).putUsers(tL_storyReactionsList.users, false);
                                                MessagesController.getInstance(i20).putChats(tL_storyReactionsList.chats, false);
                                                MessagesStorage.getInstance(i20).putUsersAndChats(tL_storyReactionsList.users, tL_storyReactionsList.chats, true, false);
                                                if (f5Var3.l) {
                                                    f5Var3.l = false;
                                                    for (int i21 = 0; i21 < arrayList5.size(); i21++) {
                                                        f5Var3.p.add(Long.valueOf(DialogObject.getPeerDialogId(((TL_stories.StoryReaction) arrayList5.get(i21)).peer_id)));
                                                    }
                                                    arrayList5.clear();
                                                    f5Var3.h.clear();
                                                }
                                                arrayList5.addAll(tL_storyReactionsList.reactions);
                                                if (tL_storyReactionsList.reactions.isEmpty()) {
                                                    f5Var3.m = false;
                                                } else {
                                                    f5Var3.m = true;
                                                }
                                                String str32 = tL_storyReactionsList.next_offset;
                                                f5Var3.n = str32;
                                                if (TextUtils.isEmpty(str32)) {
                                                    f5Var3.m = false;
                                                }
                                                if (storyItem3.views == null) {
                                                    storyItem3.views = new TL_stories.TL_storyViews();
                                                }
                                                int i22 = f5Var3.a;
                                                int i23 = tL_storyReactionsList.count;
                                                boolean z13 = i22 != i23;
                                                f5Var3.a = i23;
                                                if (z13) {
                                                    NotificationCenter.getInstance(i20).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
                                                }
                                            } else {
                                                TLRPC.TL_error tL_error3 = tL_error;
                                                if (tL_error3 != null && "MSG_ID_INVALID".equals(tL_error3.text)) {
                                                    f5Var3.a = 0;
                                                }
                                                f5Var3.m = false;
                                            }
                                            FileLog.d("SelfStoryViewsPage reactions " + storyItem3.id + " response  totalItems " + arrayList5.size() + " has next " + f5Var3.m);
                                            for (int i24 = 0; i24 < arrayList4.size(); i24++) {
                                                ((g5) arrayList4.get(i24)).e(f5Var3);
                                            }
                                            if (arrayList5.size() < 20 && f5Var3.m) {
                                                f5Var3.c();
                                                break;
                                            }
                                        }
                                        break;
                                }
                            }
                        });
                        break;
                    default:
                        final int i12 = 0;
                        final f5 f5Var2 = this.b;
                        final int[] iArr22 = r2;
                        AndroidUtilities.runOnUIThread(new Runnable() { // from class: ih.e5
                            @Override // java.lang.Runnable
                            public final void run() {
                                boolean z11;
                                switch (i12) {
                                    case 0:
                                        f5 f5Var22 = f5Var2;
                                        ArrayList arrayList = f5Var22.r;
                                        ArrayList arrayList2 = f5Var22.h;
                                        int i122 = f5Var22.d;
                                        ArrayList arrayList3 = f5Var22.g;
                                        TL_stories.StoryItem storyItem2 = f5Var22.b;
                                        if (iArr22[0] != f5Var22.o) {
                                            FileLog.d("SelfStoryViewsPage " + storyItem2.id + " localId != reqId");
                                            break;
                                        } else {
                                            f5Var22.e = false;
                                            f5Var22.o = -1;
                                            TLObject tLObject2 = tLObject;
                                            if (tLObject2 != null) {
                                                TL_stories.StoryViewsList storyViewsList = (TL_stories.StoryViewsList) tLObject2;
                                                a0.h hVar = MessagesController.getInstance(i122).getStoriesController().M;
                                                if (storyViewsList.views != null) {
                                                    for (int i13 = 0; i13 < storyViewsList.views.size(); i13++) {
                                                        TL_stories.StoryView storyView = storyViewsList.views.get(i13);
                                                        if (hVar.d(storyView.user_id)) {
                                                            hVar.k(Boolean.valueOf(storyView.blocked_my_stories_from), storyView.user_id);
                                                        }
                                                    }
                                                }
                                                MessagesController.getInstance(i122).putUsers(storyViewsList.users, false);
                                                MessagesController.getInstance(i122).putChats(storyViewsList.chats, false);
                                                boolean z12 = true;
                                                MessagesStorage.getInstance(i122).putUsersAndChats(storyViewsList.users, storyViewsList.chats, true, false);
                                                if (f5Var22.l) {
                                                    f5Var22.l = false;
                                                    for (int i14 = 0; i14 < arrayList3.size(); i14++) {
                                                        f5Var22.p.add(Long.valueOf(((TL_stories.StoryView) arrayList3.get(i14)).user_id));
                                                    }
                                                    arrayList3.clear();
                                                    arrayList2.clear();
                                                }
                                                if (f5Var22.q) {
                                                    arrayList2.addAll(storyViewsList.views);
                                                    f5Var22.a();
                                                } else {
                                                    arrayList3.addAll(storyViewsList.views);
                                                }
                                                if (storyViewsList.views.isEmpty()) {
                                                    f5Var22.m = false;
                                                } else {
                                                    f5Var22.m = true;
                                                }
                                                String str22 = storyViewsList.next_offset;
                                                f5Var22.n = str22;
                                                if (TextUtils.isEmpty(str22)) {
                                                    f5Var22.m = false;
                                                }
                                                if (storyItem2.views == null) {
                                                    storyItem2.views = new TL_stories.TL_storyViews();
                                                }
                                                int i15 = storyViewsList.count;
                                                TL_stories.StoryViews storyViews = storyItem2.views;
                                                if (i15 > storyViews.views_count) {
                                                    storyViews.recent_viewers.clear();
                                                    for (int i16 = 0; i16 < Math.min(3, storyViewsList.users.size()); i16 = aa.d.g(storyViewsList.users.get(i16).id, storyItem2.views.recent_viewers, i16, 1)) {
                                                    }
                                                    storyItem2.views.views_count = storyViewsList.count;
                                                    z11 = true;
                                                } else {
                                                    z11 = false;
                                                }
                                                TL_stories.StoryViews storyViews2 = storyItem2.views;
                                                int i17 = storyViews2.reactions_count;
                                                int i18 = storyViewsList.reactions_count;
                                                if (i17 != i18) {
                                                    storyViews2.reactions_count = i18;
                                                } else {
                                                    z12 = z11;
                                                }
                                                if (z12) {
                                                    NotificationCenter.getInstance(i122).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
                                                }
                                            } else {
                                                TLRPC.TL_error tL_error2 = tL_error;
                                                if (tL_error2 != null && "MSG_ID_INVALID".equals(tL_error2.text)) {
                                                    f5Var22.a = 0;
                                                }
                                                f5Var22.m = false;
                                            }
                                            FileLog.d("SelfStoryViewsPage " + storyItem2.id + " response  totalItems " + arrayList3.size() + " has next " + f5Var22.m);
                                            for (int i19 = 0; i19 < arrayList.size(); i19++) {
                                                ((g5) arrayList.get(i19)).e(f5Var22);
                                            }
                                            if (arrayList3.size() < 20 && f5Var22.m) {
                                                f5Var22.c();
                                                break;
                                            }
                                        }
                                        break;
                                    default:
                                        f5 f5Var3 = f5Var2;
                                        ArrayList arrayList4 = f5Var3.r;
                                        TL_stories.StoryItem storyItem3 = f5Var3.b;
                                        int i20 = f5Var3.d;
                                        ArrayList arrayList5 = f5Var3.i;
                                        if (iArr22[0] != f5Var3.o) {
                                            FileLog.d("SelfStoryViewsPage reactions " + storyItem3.id + " localId != reqId");
                                            break;
                                        } else {
                                            f5Var3.e = false;
                                            f5Var3.o = -1;
                                            TLObject tLObject3 = tLObject;
                                            if (tLObject3 != null) {
                                                TL_stories.TL_storyReactionsList tL_storyReactionsList = (TL_stories.TL_storyReactionsList) tLObject3;
                                                MessagesController.getInstance(i20).putUsers(tL_storyReactionsList.users, false);
                                                MessagesController.getInstance(i20).putChats(tL_storyReactionsList.chats, false);
                                                MessagesStorage.getInstance(i20).putUsersAndChats(tL_storyReactionsList.users, tL_storyReactionsList.chats, true, false);
                                                if (f5Var3.l) {
                                                    f5Var3.l = false;
                                                    for (int i21 = 0; i21 < arrayList5.size(); i21++) {
                                                        f5Var3.p.add(Long.valueOf(DialogObject.getPeerDialogId(((TL_stories.StoryReaction) arrayList5.get(i21)).peer_id)));
                                                    }
                                                    arrayList5.clear();
                                                    f5Var3.h.clear();
                                                }
                                                arrayList5.addAll(tL_storyReactionsList.reactions);
                                                if (tL_storyReactionsList.reactions.isEmpty()) {
                                                    f5Var3.m = false;
                                                } else {
                                                    f5Var3.m = true;
                                                }
                                                String str32 = tL_storyReactionsList.next_offset;
                                                f5Var3.n = str32;
                                                if (TextUtils.isEmpty(str32)) {
                                                    f5Var3.m = false;
                                                }
                                                if (storyItem3.views == null) {
                                                    storyItem3.views = new TL_stories.TL_storyViews();
                                                }
                                                int i22 = f5Var3.a;
                                                int i23 = tL_storyReactionsList.count;
                                                boolean z13 = i22 != i23;
                                                f5Var3.a = i23;
                                                if (z13) {
                                                    NotificationCenter.getInstance(i20).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
                                                }
                                            } else {
                                                TLRPC.TL_error tL_error3 = tL_error;
                                                if (tL_error3 != null && "MSG_ID_INVALID".equals(tL_error3.text)) {
                                                    f5Var3.a = 0;
                                                }
                                                f5Var3.m = false;
                                            }
                                            FileLog.d("SelfStoryViewsPage reactions " + storyItem3.id + " response  totalItems " + arrayList5.size() + " has next " + f5Var3.m);
                                            for (int i24 = 0; i24 < arrayList4.size(); i24++) {
                                                ((g5) arrayList4.get(i24)).e(f5Var3);
                                            }
                                            if (arrayList5.size() < 20 && f5Var3.m) {
                                                f5Var3.c();
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

    public final void e(s4 s4Var, boolean z10, boolean z11) {
        s4 s4Var2 = new s4();
        s4Var2.a = s4Var.a;
        s4Var2.b = s4Var.b;
        s4Var2.c = s4Var.c;
        int i9 = 0;
        if (!z10) {
            s4Var2.b = false;
        }
        if (!z11) {
            s4Var2.a = true;
        }
        s4 s4Var3 = this.s;
        if (s4Var3.equals(s4Var2)) {
            return;
        }
        s4Var3.a = s4Var2.a;
        s4Var3.b = s4Var2.b;
        s4Var3.c = s4Var2.c;
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
            if (i9 >= arrayList.size()) {
                return;
            }
            ((g5) arrayList.get(i9)).e(this);
            i9++;
        }
    }
}
