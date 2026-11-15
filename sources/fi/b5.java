package fi;

import android.text.TextUtils;
import j$.util.Comparator$-CC;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import org.telegram.messenger.hd;
import org.telegram.messenger.m10;
import org.telegram.messenger.np;
import org.telegram.messenger.ns;
import org.telegram.messenger.q10;
import org.telegram.messenger.vr;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class b5 {
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
    public final o4 s = new o4();

    public b5(int i7, long j3, TL_stories.StoryItem storyItem) {
        TL_stories.StoryViews storyViews;
        this.d = i7;
        this.b = storyItem;
        this.f = j3 < 0;
        this.c = j3;
        TL_stories.StoryViews storyViews2 = storyItem.views;
        int i10 = storyViews2 == null ? 0 : storyViews2.views_count;
        this.a = i10;
        if (i10 < 200) {
            this.q = true;
        }
        boolean z10 = l7.v(storyItem) && !m10.i(i7).q();
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
                if (np.s1(i7).a2(l10) != null) {
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
        o4 o4Var = this.s;
        boolean z10 = o4Var.b;
        ArrayList arrayList2 = this.h;
        if (z10 || !TextUtils.isEmpty(o4Var.c)) {
            if (TextUtils.isEmpty(o4Var.c)) {
                str = null;
                str2 = null;
                str3 = null;
                str4 = null;
            } else {
                str = o4Var.c.trim().toLowerCase();
                str2 = hd.E0().S0(str, true, false);
                str4 = r.b.k(" ", str);
                str3 = r.b.k(" ", str2);
            }
            for (int i7 = 0; i7 < arrayList2.size(); i7++) {
                TLRPC.User a22 = np.s1(this.d).a2(Long.valueOf(((TL_stories.StoryView) arrayList2.get(i7)).user_id));
                boolean z11 = !o4Var.b || (a22 != null && a22.contact);
                if (z11 && str != null) {
                    String lowerCase = org.telegram.messenger.g5.m(0, a22.first_name, a22.last_name).toLowerCase();
                    String n10 = q10.n(a22);
                    String N3 = org.telegram.messenger.g0.N3(lowerCase);
                    if ((lowerCase == null || (!lowerCase.startsWith(str) && !lowerCase.contains(str4))) && !N3.startsWith(str2) && !N3.contains(str3) && (n10 == null || (!n10.startsWith(str2) && !n10.contains(str3)))) {
                        z11 = false;
                    }
                }
                if (z11) {
                    arrayList.add((TL_stories.StoryView) arrayList2.get(i7));
                }
            }
        } else {
            arrayList.addAll(arrayList2);
        }
        if (o4Var.a) {
            return;
        }
        Collections.sort(arrayList, Comparator$-CC.comparingInt(new bg.d(7)));
    }

    public final int b() {
        return (this.f ? this.i : this.g).size();
    }

    public final void c() {
        if (this.e || !this.m || this.j) {
            return;
        }
        boolean z10 = this.f;
        long j3 = this.c;
        o4 o4Var = this.s;
        int i7 = this.d;
        TL_stories.StoryItem storyItem = this.b;
        if (z10) {
            TL_stories.TL_getStoryReactionsList tL_getStoryReactionsList = new TL_stories.TL_getStoryReactionsList();
            tL_getStoryReactionsList.forwards_first = o4Var.a;
            tL_getStoryReactionsList.id = storyItem.id;
            tL_getStoryReactionsList.peer = np.s1(i7).j1(j3);
            tL_getStoryReactionsList.limit = (this.l || this.i.size() < 20) ? 20 : 100;
            String str = this.n;
            tL_getStoryReactionsList.offset = str;
            if (str == null) {
                tL_getStoryReactionsList.offset = "";
            } else {
                tL_getStoryReactionsList.flags |= 2;
            }
            this.e = true;
            org.telegram.messenger.a8.b("SelfStoryViewsPage reactions load next " + storyItem.id + " " + this.l + " offset=" + tL_getStoryReactionsList.offset);
            final int i10 = 0;
            int sendRequest = ConnectionsManager.getInstance(i7).sendRequest(tL_getStoryReactionsList, new RequestDelegate(this) { // from class: fi.z4
                public final /* synthetic */ b5 b;

                {
                    this.b = this;
                }

                @Override // org.telegram.tgnet.RequestDelegate
                public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                    switch (i10) {
                        case 0:
                            final int i11 = 1;
                            final b5 b5Var = this.b;
                            final int[] iArr = r2;
                            org.telegram.messenger.g0.h3(new Runnable() { // from class: fi.a5
                                @Override // java.lang.Runnable
                                public final void run() {
                                    boolean z11;
                                    switch (i11) {
                                        case 0:
                                            b5 b5Var2 = b5Var;
                                            ArrayList arrayList = b5Var2.r;
                                            ArrayList arrayList2 = b5Var2.h;
                                            int i12 = b5Var2.d;
                                            ArrayList arrayList3 = b5Var2.g;
                                            TL_stories.StoryItem storyItem2 = b5Var2.b;
                                            if (iArr[0] != b5Var2.o) {
                                                org.telegram.messenger.a8.b("SelfStoryViewsPage " + storyItem2.id + " localId != reqId");
                                                break;
                                            } else {
                                                b5Var2.e = false;
                                                b5Var2.o = -1;
                                                TLObject tLObject2 = tLObject;
                                                if (tLObject2 != null) {
                                                    TL_stories.StoryViewsList storyViewsList = (TL_stories.StoryViewsList) tLObject2;
                                                    a0.h hVar = np.s1(i12).P1().M;
                                                    if (storyViewsList.views != null) {
                                                        for (int i13 = 0; i13 < storyViewsList.views.size(); i13++) {
                                                            TL_stories.StoryView storyView = storyViewsList.views.get(i13);
                                                            if (hVar.d(storyView.user_id)) {
                                                                hVar.k(Boolean.valueOf(storyView.blocked_my_stories_from), storyView.user_id);
                                                            }
                                                        }
                                                    }
                                                    np.s1(i12).Y3(storyViewsList.users, false);
                                                    np.s1(i12).S3(storyViewsList.chats, false);
                                                    boolean z12 = true;
                                                    vr.a0(i12).m1(storyViewsList.users, storyViewsList.chats, true, false);
                                                    if (b5Var2.l) {
                                                        b5Var2.l = false;
                                                        for (int i14 = 0; i14 < arrayList3.size(); i14++) {
                                                            b5Var2.p.add(Long.valueOf(((TL_stories.StoryView) arrayList3.get(i14)).user_id));
                                                        }
                                                        arrayList3.clear();
                                                        arrayList2.clear();
                                                    }
                                                    if (b5Var2.q) {
                                                        arrayList2.addAll(storyViewsList.views);
                                                        b5Var2.a();
                                                    } else {
                                                        arrayList3.addAll(storyViewsList.views);
                                                    }
                                                    if (storyViewsList.views.isEmpty()) {
                                                        b5Var2.m = false;
                                                    } else {
                                                        b5Var2.m = true;
                                                    }
                                                    String str2 = storyViewsList.next_offset;
                                                    b5Var2.n = str2;
                                                    if (TextUtils.isEmpty(str2)) {
                                                        b5Var2.m = false;
                                                    }
                                                    if (storyItem2.views == null) {
                                                        storyItem2.views = new TL_stories.TL_storyViews();
                                                    }
                                                    int i15 = storyViewsList.count;
                                                    TL_stories.StoryViews storyViews = storyItem2.views;
                                                    if (i15 > storyViews.views_count) {
                                                        storyViews.recent_viewers.clear();
                                                        for (int i16 = 0; i16 < Math.min(3, storyViewsList.users.size()); i16 = com.google.android.gms.internal.vision.e2.g(i16, 1, storyViewsList.users.get(i16).id, storyItem2.views.recent_viewers)) {
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
                                                        ns.f(i12).k(ns.v5, new Object[0]);
                                                    }
                                                } else {
                                                    TLRPC.TL_error tL_error2 = tL_error;
                                                    if (tL_error2 != null && "MSG_ID_INVALID".equals(tL_error2.text)) {
                                                        b5Var2.a = 0;
                                                    }
                                                    b5Var2.m = false;
                                                }
                                                org.telegram.messenger.a8.b("SelfStoryViewsPage " + storyItem2.id + " response  totalItems " + arrayList3.size() + " has next " + b5Var2.m);
                                                for (int i19 = 0; i19 < arrayList.size(); i19++) {
                                                    ((c5) arrayList.get(i19)).e(b5Var2);
                                                }
                                                if (arrayList3.size() < 20 && b5Var2.m) {
                                                    b5Var2.c();
                                                    break;
                                                }
                                            }
                                            break;
                                        default:
                                            b5 b5Var3 = b5Var;
                                            ArrayList arrayList4 = b5Var3.r;
                                            TL_stories.StoryItem storyItem3 = b5Var3.b;
                                            int i20 = b5Var3.d;
                                            ArrayList arrayList5 = b5Var3.i;
                                            if (iArr[0] != b5Var3.o) {
                                                org.telegram.messenger.a8.b("SelfStoryViewsPage reactions " + storyItem3.id + " localId != reqId");
                                                break;
                                            } else {
                                                b5Var3.e = false;
                                                b5Var3.o = -1;
                                                TLObject tLObject3 = tLObject;
                                                if (tLObject3 != null) {
                                                    TL_stories.TL_storyReactionsList tL_storyReactionsList = (TL_stories.TL_storyReactionsList) tLObject3;
                                                    np.s1(i20).Y3(tL_storyReactionsList.users, false);
                                                    np.s1(i20).S3(tL_storyReactionsList.chats, false);
                                                    vr.a0(i20).m1(tL_storyReactionsList.users, tL_storyReactionsList.chats, true, false);
                                                    if (b5Var3.l) {
                                                        b5Var3.l = false;
                                                        for (int i21 = 0; i21 < arrayList5.size(); i21++) {
                                                            b5Var3.p.add(Long.valueOf(org.telegram.messenger.m5.o(((TL_stories.StoryReaction) arrayList5.get(i21)).peer_id)));
                                                        }
                                                        arrayList5.clear();
                                                        b5Var3.h.clear();
                                                    }
                                                    arrayList5.addAll(tL_storyReactionsList.reactions);
                                                    if (tL_storyReactionsList.reactions.isEmpty()) {
                                                        b5Var3.m = false;
                                                    } else {
                                                        b5Var3.m = true;
                                                    }
                                                    String str3 = tL_storyReactionsList.next_offset;
                                                    b5Var3.n = str3;
                                                    if (TextUtils.isEmpty(str3)) {
                                                        b5Var3.m = false;
                                                    }
                                                    if (storyItem3.views == null) {
                                                        storyItem3.views = new TL_stories.TL_storyViews();
                                                    }
                                                    int i22 = b5Var3.a;
                                                    int i23 = tL_storyReactionsList.count;
                                                    boolean z13 = i22 != i23;
                                                    b5Var3.a = i23;
                                                    if (z13) {
                                                        ns.f(i20).k(ns.v5, new Object[0]);
                                                    }
                                                } else {
                                                    TLRPC.TL_error tL_error3 = tL_error;
                                                    if (tL_error3 != null && "MSG_ID_INVALID".equals(tL_error3.text)) {
                                                        b5Var3.a = 0;
                                                    }
                                                    b5Var3.m = false;
                                                }
                                                org.telegram.messenger.a8.b("SelfStoryViewsPage reactions " + storyItem3.id + " response  totalItems " + arrayList5.size() + " has next " + b5Var3.m);
                                                for (int i24 = 0; i24 < arrayList4.size(); i24++) {
                                                    ((c5) arrayList4.get(i24)).e(b5Var3);
                                                }
                                                if (arrayList5.size() < 20 && b5Var3.m) {
                                                    b5Var3.c();
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
                            final b5 b5Var2 = this.b;
                            final int[] iArr2 = r2;
                            org.telegram.messenger.g0.h3(new Runnable() { // from class: fi.a5
                                @Override // java.lang.Runnable
                                public final void run() {
                                    boolean z11;
                                    switch (i12) {
                                        case 0:
                                            b5 b5Var22 = b5Var2;
                                            ArrayList arrayList = b5Var22.r;
                                            ArrayList arrayList2 = b5Var22.h;
                                            int i122 = b5Var22.d;
                                            ArrayList arrayList3 = b5Var22.g;
                                            TL_stories.StoryItem storyItem2 = b5Var22.b;
                                            if (iArr2[0] != b5Var22.o) {
                                                org.telegram.messenger.a8.b("SelfStoryViewsPage " + storyItem2.id + " localId != reqId");
                                                break;
                                            } else {
                                                b5Var22.e = false;
                                                b5Var22.o = -1;
                                                TLObject tLObject2 = tLObject;
                                                if (tLObject2 != null) {
                                                    TL_stories.StoryViewsList storyViewsList = (TL_stories.StoryViewsList) tLObject2;
                                                    a0.h hVar = np.s1(i122).P1().M;
                                                    if (storyViewsList.views != null) {
                                                        for (int i13 = 0; i13 < storyViewsList.views.size(); i13++) {
                                                            TL_stories.StoryView storyView = storyViewsList.views.get(i13);
                                                            if (hVar.d(storyView.user_id)) {
                                                                hVar.k(Boolean.valueOf(storyView.blocked_my_stories_from), storyView.user_id);
                                                            }
                                                        }
                                                    }
                                                    np.s1(i122).Y3(storyViewsList.users, false);
                                                    np.s1(i122).S3(storyViewsList.chats, false);
                                                    boolean z12 = true;
                                                    vr.a0(i122).m1(storyViewsList.users, storyViewsList.chats, true, false);
                                                    if (b5Var22.l) {
                                                        b5Var22.l = false;
                                                        for (int i14 = 0; i14 < arrayList3.size(); i14++) {
                                                            b5Var22.p.add(Long.valueOf(((TL_stories.StoryView) arrayList3.get(i14)).user_id));
                                                        }
                                                        arrayList3.clear();
                                                        arrayList2.clear();
                                                    }
                                                    if (b5Var22.q) {
                                                        arrayList2.addAll(storyViewsList.views);
                                                        b5Var22.a();
                                                    } else {
                                                        arrayList3.addAll(storyViewsList.views);
                                                    }
                                                    if (storyViewsList.views.isEmpty()) {
                                                        b5Var22.m = false;
                                                    } else {
                                                        b5Var22.m = true;
                                                    }
                                                    String str2 = storyViewsList.next_offset;
                                                    b5Var22.n = str2;
                                                    if (TextUtils.isEmpty(str2)) {
                                                        b5Var22.m = false;
                                                    }
                                                    if (storyItem2.views == null) {
                                                        storyItem2.views = new TL_stories.TL_storyViews();
                                                    }
                                                    int i15 = storyViewsList.count;
                                                    TL_stories.StoryViews storyViews = storyItem2.views;
                                                    if (i15 > storyViews.views_count) {
                                                        storyViews.recent_viewers.clear();
                                                        for (int i16 = 0; i16 < Math.min(3, storyViewsList.users.size()); i16 = com.google.android.gms.internal.vision.e2.g(i16, 1, storyViewsList.users.get(i16).id, storyItem2.views.recent_viewers)) {
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
                                                        ns.f(i122).k(ns.v5, new Object[0]);
                                                    }
                                                } else {
                                                    TLRPC.TL_error tL_error2 = tL_error;
                                                    if (tL_error2 != null && "MSG_ID_INVALID".equals(tL_error2.text)) {
                                                        b5Var22.a = 0;
                                                    }
                                                    b5Var22.m = false;
                                                }
                                                org.telegram.messenger.a8.b("SelfStoryViewsPage " + storyItem2.id + " response  totalItems " + arrayList3.size() + " has next " + b5Var22.m);
                                                for (int i19 = 0; i19 < arrayList.size(); i19++) {
                                                    ((c5) arrayList.get(i19)).e(b5Var22);
                                                }
                                                if (arrayList3.size() < 20 && b5Var22.m) {
                                                    b5Var22.c();
                                                    break;
                                                }
                                            }
                                            break;
                                        default:
                                            b5 b5Var3 = b5Var2;
                                            ArrayList arrayList4 = b5Var3.r;
                                            TL_stories.StoryItem storyItem3 = b5Var3.b;
                                            int i20 = b5Var3.d;
                                            ArrayList arrayList5 = b5Var3.i;
                                            if (iArr2[0] != b5Var3.o) {
                                                org.telegram.messenger.a8.b("SelfStoryViewsPage reactions " + storyItem3.id + " localId != reqId");
                                                break;
                                            } else {
                                                b5Var3.e = false;
                                                b5Var3.o = -1;
                                                TLObject tLObject3 = tLObject;
                                                if (tLObject3 != null) {
                                                    TL_stories.TL_storyReactionsList tL_storyReactionsList = (TL_stories.TL_storyReactionsList) tLObject3;
                                                    np.s1(i20).Y3(tL_storyReactionsList.users, false);
                                                    np.s1(i20).S3(tL_storyReactionsList.chats, false);
                                                    vr.a0(i20).m1(tL_storyReactionsList.users, tL_storyReactionsList.chats, true, false);
                                                    if (b5Var3.l) {
                                                        b5Var3.l = false;
                                                        for (int i21 = 0; i21 < arrayList5.size(); i21++) {
                                                            b5Var3.p.add(Long.valueOf(org.telegram.messenger.m5.o(((TL_stories.StoryReaction) arrayList5.get(i21)).peer_id)));
                                                        }
                                                        arrayList5.clear();
                                                        b5Var3.h.clear();
                                                    }
                                                    arrayList5.addAll(tL_storyReactionsList.reactions);
                                                    if (tL_storyReactionsList.reactions.isEmpty()) {
                                                        b5Var3.m = false;
                                                    } else {
                                                        b5Var3.m = true;
                                                    }
                                                    String str3 = tL_storyReactionsList.next_offset;
                                                    b5Var3.n = str3;
                                                    if (TextUtils.isEmpty(str3)) {
                                                        b5Var3.m = false;
                                                    }
                                                    if (storyItem3.views == null) {
                                                        storyItem3.views = new TL_stories.TL_storyViews();
                                                    }
                                                    int i22 = b5Var3.a;
                                                    int i23 = tL_storyReactionsList.count;
                                                    boolean z13 = i22 != i23;
                                                    b5Var3.a = i23;
                                                    if (z13) {
                                                        ns.f(i20).k(ns.v5, new Object[0]);
                                                    }
                                                } else {
                                                    TLRPC.TL_error tL_error3 = tL_error;
                                                    if (tL_error3 != null && "MSG_ID_INVALID".equals(tL_error3.text)) {
                                                        b5Var3.a = 0;
                                                    }
                                                    b5Var3.m = false;
                                                }
                                                org.telegram.messenger.a8.b("SelfStoryViewsPage reactions " + storyItem3.id + " response  totalItems " + arrayList5.size() + " has next " + b5Var3.m);
                                                for (int i24 = 0; i24 < arrayList4.size(); i24++) {
                                                    ((c5) arrayList4.get(i24)).e(b5Var3);
                                                }
                                                if (arrayList5.size() < 20 && b5Var3.m) {
                                                    b5Var3.c();
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
        tL_stories_getStoryViewsList.peer = np.s1(i7).j1(j3);
        if (this.q) {
            tL_stories_getStoryViewsList.q = "";
            tL_stories_getStoryViewsList.just_contacts = false;
            tL_stories_getStoryViewsList.reactions_first = true;
        } else {
            String str2 = o4Var.c;
            tL_stories_getStoryViewsList.q = str2;
            if (!TextUtils.isEmpty(str2)) {
                tL_stories_getStoryViewsList.flags |= 2;
            }
            tL_stories_getStoryViewsList.just_contacts = o4Var.b;
            tL_stories_getStoryViewsList.reactions_first = o4Var.a;
        }
        tL_stories_getStoryViewsList.limit = (this.l || this.g.size() < 20) ? 20 : 100;
        String str3 = this.n;
        tL_stories_getStoryViewsList.offset = str3;
        if (str3 == null) {
            tL_stories_getStoryViewsList.offset = "";
        }
        this.e = true;
        org.telegram.messenger.a8.b("SelfStoryViewsPage load next " + storyItem.id + " " + this.l + " offset=" + tL_stories_getStoryViewsList.offset + " q" + tL_stories_getStoryViewsList.q + " " + tL_stories_getStoryViewsList.just_contacts + " " + tL_stories_getStoryViewsList.reactions_first);
        final int i11 = 1;
        int sendRequest2 = ConnectionsManager.getInstance(i7).sendRequest(tL_stories_getStoryViewsList, new RequestDelegate(this) { // from class: fi.z4
            public final /* synthetic */ b5 b;

            {
                this.b = this;
            }

            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                switch (i11) {
                    case 0:
                        final int i112 = 1;
                        final b5 b5Var = this.b;
                        final int[] iArr2 = r2;
                        org.telegram.messenger.g0.h3(new Runnable() { // from class: fi.a5
                            @Override // java.lang.Runnable
                            public final void run() {
                                boolean z11;
                                switch (i112) {
                                    case 0:
                                        b5 b5Var22 = b5Var;
                                        ArrayList arrayList = b5Var22.r;
                                        ArrayList arrayList2 = b5Var22.h;
                                        int i122 = b5Var22.d;
                                        ArrayList arrayList3 = b5Var22.g;
                                        TL_stories.StoryItem storyItem2 = b5Var22.b;
                                        if (iArr2[0] != b5Var22.o) {
                                            org.telegram.messenger.a8.b("SelfStoryViewsPage " + storyItem2.id + " localId != reqId");
                                            break;
                                        } else {
                                            b5Var22.e = false;
                                            b5Var22.o = -1;
                                            TLObject tLObject2 = tLObject;
                                            if (tLObject2 != null) {
                                                TL_stories.StoryViewsList storyViewsList = (TL_stories.StoryViewsList) tLObject2;
                                                a0.h hVar = np.s1(i122).P1().M;
                                                if (storyViewsList.views != null) {
                                                    for (int i13 = 0; i13 < storyViewsList.views.size(); i13++) {
                                                        TL_stories.StoryView storyView = storyViewsList.views.get(i13);
                                                        if (hVar.d(storyView.user_id)) {
                                                            hVar.k(Boolean.valueOf(storyView.blocked_my_stories_from), storyView.user_id);
                                                        }
                                                    }
                                                }
                                                np.s1(i122).Y3(storyViewsList.users, false);
                                                np.s1(i122).S3(storyViewsList.chats, false);
                                                boolean z12 = true;
                                                vr.a0(i122).m1(storyViewsList.users, storyViewsList.chats, true, false);
                                                if (b5Var22.l) {
                                                    b5Var22.l = false;
                                                    for (int i14 = 0; i14 < arrayList3.size(); i14++) {
                                                        b5Var22.p.add(Long.valueOf(((TL_stories.StoryView) arrayList3.get(i14)).user_id));
                                                    }
                                                    arrayList3.clear();
                                                    arrayList2.clear();
                                                }
                                                if (b5Var22.q) {
                                                    arrayList2.addAll(storyViewsList.views);
                                                    b5Var22.a();
                                                } else {
                                                    arrayList3.addAll(storyViewsList.views);
                                                }
                                                if (storyViewsList.views.isEmpty()) {
                                                    b5Var22.m = false;
                                                } else {
                                                    b5Var22.m = true;
                                                }
                                                String str22 = storyViewsList.next_offset;
                                                b5Var22.n = str22;
                                                if (TextUtils.isEmpty(str22)) {
                                                    b5Var22.m = false;
                                                }
                                                if (storyItem2.views == null) {
                                                    storyItem2.views = new TL_stories.TL_storyViews();
                                                }
                                                int i15 = storyViewsList.count;
                                                TL_stories.StoryViews storyViews = storyItem2.views;
                                                if (i15 > storyViews.views_count) {
                                                    storyViews.recent_viewers.clear();
                                                    for (int i16 = 0; i16 < Math.min(3, storyViewsList.users.size()); i16 = com.google.android.gms.internal.vision.e2.g(i16, 1, storyViewsList.users.get(i16).id, storyItem2.views.recent_viewers)) {
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
                                                    ns.f(i122).k(ns.v5, new Object[0]);
                                                }
                                            } else {
                                                TLRPC.TL_error tL_error2 = tL_error;
                                                if (tL_error2 != null && "MSG_ID_INVALID".equals(tL_error2.text)) {
                                                    b5Var22.a = 0;
                                                }
                                                b5Var22.m = false;
                                            }
                                            org.telegram.messenger.a8.b("SelfStoryViewsPage " + storyItem2.id + " response  totalItems " + arrayList3.size() + " has next " + b5Var22.m);
                                            for (int i19 = 0; i19 < arrayList.size(); i19++) {
                                                ((c5) arrayList.get(i19)).e(b5Var22);
                                            }
                                            if (arrayList3.size() < 20 && b5Var22.m) {
                                                b5Var22.c();
                                                break;
                                            }
                                        }
                                        break;
                                    default:
                                        b5 b5Var3 = b5Var;
                                        ArrayList arrayList4 = b5Var3.r;
                                        TL_stories.StoryItem storyItem3 = b5Var3.b;
                                        int i20 = b5Var3.d;
                                        ArrayList arrayList5 = b5Var3.i;
                                        if (iArr2[0] != b5Var3.o) {
                                            org.telegram.messenger.a8.b("SelfStoryViewsPage reactions " + storyItem3.id + " localId != reqId");
                                            break;
                                        } else {
                                            b5Var3.e = false;
                                            b5Var3.o = -1;
                                            TLObject tLObject3 = tLObject;
                                            if (tLObject3 != null) {
                                                TL_stories.TL_storyReactionsList tL_storyReactionsList = (TL_stories.TL_storyReactionsList) tLObject3;
                                                np.s1(i20).Y3(tL_storyReactionsList.users, false);
                                                np.s1(i20).S3(tL_storyReactionsList.chats, false);
                                                vr.a0(i20).m1(tL_storyReactionsList.users, tL_storyReactionsList.chats, true, false);
                                                if (b5Var3.l) {
                                                    b5Var3.l = false;
                                                    for (int i21 = 0; i21 < arrayList5.size(); i21++) {
                                                        b5Var3.p.add(Long.valueOf(org.telegram.messenger.m5.o(((TL_stories.StoryReaction) arrayList5.get(i21)).peer_id)));
                                                    }
                                                    arrayList5.clear();
                                                    b5Var3.h.clear();
                                                }
                                                arrayList5.addAll(tL_storyReactionsList.reactions);
                                                if (tL_storyReactionsList.reactions.isEmpty()) {
                                                    b5Var3.m = false;
                                                } else {
                                                    b5Var3.m = true;
                                                }
                                                String str32 = tL_storyReactionsList.next_offset;
                                                b5Var3.n = str32;
                                                if (TextUtils.isEmpty(str32)) {
                                                    b5Var3.m = false;
                                                }
                                                if (storyItem3.views == null) {
                                                    storyItem3.views = new TL_stories.TL_storyViews();
                                                }
                                                int i22 = b5Var3.a;
                                                int i23 = tL_storyReactionsList.count;
                                                boolean z13 = i22 != i23;
                                                b5Var3.a = i23;
                                                if (z13) {
                                                    ns.f(i20).k(ns.v5, new Object[0]);
                                                }
                                            } else {
                                                TLRPC.TL_error tL_error3 = tL_error;
                                                if (tL_error3 != null && "MSG_ID_INVALID".equals(tL_error3.text)) {
                                                    b5Var3.a = 0;
                                                }
                                                b5Var3.m = false;
                                            }
                                            org.telegram.messenger.a8.b("SelfStoryViewsPage reactions " + storyItem3.id + " response  totalItems " + arrayList5.size() + " has next " + b5Var3.m);
                                            for (int i24 = 0; i24 < arrayList4.size(); i24++) {
                                                ((c5) arrayList4.get(i24)).e(b5Var3);
                                            }
                                            if (arrayList5.size() < 20 && b5Var3.m) {
                                                b5Var3.c();
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
                        final b5 b5Var2 = this.b;
                        final int[] iArr22 = r2;
                        org.telegram.messenger.g0.h3(new Runnable() { // from class: fi.a5
                            @Override // java.lang.Runnable
                            public final void run() {
                                boolean z11;
                                switch (i12) {
                                    case 0:
                                        b5 b5Var22 = b5Var2;
                                        ArrayList arrayList = b5Var22.r;
                                        ArrayList arrayList2 = b5Var22.h;
                                        int i122 = b5Var22.d;
                                        ArrayList arrayList3 = b5Var22.g;
                                        TL_stories.StoryItem storyItem2 = b5Var22.b;
                                        if (iArr22[0] != b5Var22.o) {
                                            org.telegram.messenger.a8.b("SelfStoryViewsPage " + storyItem2.id + " localId != reqId");
                                            break;
                                        } else {
                                            b5Var22.e = false;
                                            b5Var22.o = -1;
                                            TLObject tLObject2 = tLObject;
                                            if (tLObject2 != null) {
                                                TL_stories.StoryViewsList storyViewsList = (TL_stories.StoryViewsList) tLObject2;
                                                a0.h hVar = np.s1(i122).P1().M;
                                                if (storyViewsList.views != null) {
                                                    for (int i13 = 0; i13 < storyViewsList.views.size(); i13++) {
                                                        TL_stories.StoryView storyView = storyViewsList.views.get(i13);
                                                        if (hVar.d(storyView.user_id)) {
                                                            hVar.k(Boolean.valueOf(storyView.blocked_my_stories_from), storyView.user_id);
                                                        }
                                                    }
                                                }
                                                np.s1(i122).Y3(storyViewsList.users, false);
                                                np.s1(i122).S3(storyViewsList.chats, false);
                                                boolean z12 = true;
                                                vr.a0(i122).m1(storyViewsList.users, storyViewsList.chats, true, false);
                                                if (b5Var22.l) {
                                                    b5Var22.l = false;
                                                    for (int i14 = 0; i14 < arrayList3.size(); i14++) {
                                                        b5Var22.p.add(Long.valueOf(((TL_stories.StoryView) arrayList3.get(i14)).user_id));
                                                    }
                                                    arrayList3.clear();
                                                    arrayList2.clear();
                                                }
                                                if (b5Var22.q) {
                                                    arrayList2.addAll(storyViewsList.views);
                                                    b5Var22.a();
                                                } else {
                                                    arrayList3.addAll(storyViewsList.views);
                                                }
                                                if (storyViewsList.views.isEmpty()) {
                                                    b5Var22.m = false;
                                                } else {
                                                    b5Var22.m = true;
                                                }
                                                String str22 = storyViewsList.next_offset;
                                                b5Var22.n = str22;
                                                if (TextUtils.isEmpty(str22)) {
                                                    b5Var22.m = false;
                                                }
                                                if (storyItem2.views == null) {
                                                    storyItem2.views = new TL_stories.TL_storyViews();
                                                }
                                                int i15 = storyViewsList.count;
                                                TL_stories.StoryViews storyViews = storyItem2.views;
                                                if (i15 > storyViews.views_count) {
                                                    storyViews.recent_viewers.clear();
                                                    for (int i16 = 0; i16 < Math.min(3, storyViewsList.users.size()); i16 = com.google.android.gms.internal.vision.e2.g(i16, 1, storyViewsList.users.get(i16).id, storyItem2.views.recent_viewers)) {
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
                                                    ns.f(i122).k(ns.v5, new Object[0]);
                                                }
                                            } else {
                                                TLRPC.TL_error tL_error2 = tL_error;
                                                if (tL_error2 != null && "MSG_ID_INVALID".equals(tL_error2.text)) {
                                                    b5Var22.a = 0;
                                                }
                                                b5Var22.m = false;
                                            }
                                            org.telegram.messenger.a8.b("SelfStoryViewsPage " + storyItem2.id + " response  totalItems " + arrayList3.size() + " has next " + b5Var22.m);
                                            for (int i19 = 0; i19 < arrayList.size(); i19++) {
                                                ((c5) arrayList.get(i19)).e(b5Var22);
                                            }
                                            if (arrayList3.size() < 20 && b5Var22.m) {
                                                b5Var22.c();
                                                break;
                                            }
                                        }
                                        break;
                                    default:
                                        b5 b5Var3 = b5Var2;
                                        ArrayList arrayList4 = b5Var3.r;
                                        TL_stories.StoryItem storyItem3 = b5Var3.b;
                                        int i20 = b5Var3.d;
                                        ArrayList arrayList5 = b5Var3.i;
                                        if (iArr22[0] != b5Var3.o) {
                                            org.telegram.messenger.a8.b("SelfStoryViewsPage reactions " + storyItem3.id + " localId != reqId");
                                            break;
                                        } else {
                                            b5Var3.e = false;
                                            b5Var3.o = -1;
                                            TLObject tLObject3 = tLObject;
                                            if (tLObject3 != null) {
                                                TL_stories.TL_storyReactionsList tL_storyReactionsList = (TL_stories.TL_storyReactionsList) tLObject3;
                                                np.s1(i20).Y3(tL_storyReactionsList.users, false);
                                                np.s1(i20).S3(tL_storyReactionsList.chats, false);
                                                vr.a0(i20).m1(tL_storyReactionsList.users, tL_storyReactionsList.chats, true, false);
                                                if (b5Var3.l) {
                                                    b5Var3.l = false;
                                                    for (int i21 = 0; i21 < arrayList5.size(); i21++) {
                                                        b5Var3.p.add(Long.valueOf(org.telegram.messenger.m5.o(((TL_stories.StoryReaction) arrayList5.get(i21)).peer_id)));
                                                    }
                                                    arrayList5.clear();
                                                    b5Var3.h.clear();
                                                }
                                                arrayList5.addAll(tL_storyReactionsList.reactions);
                                                if (tL_storyReactionsList.reactions.isEmpty()) {
                                                    b5Var3.m = false;
                                                } else {
                                                    b5Var3.m = true;
                                                }
                                                String str32 = tL_storyReactionsList.next_offset;
                                                b5Var3.n = str32;
                                                if (TextUtils.isEmpty(str32)) {
                                                    b5Var3.m = false;
                                                }
                                                if (storyItem3.views == null) {
                                                    storyItem3.views = new TL_stories.TL_storyViews();
                                                }
                                                int i22 = b5Var3.a;
                                                int i23 = tL_storyReactionsList.count;
                                                boolean z13 = i22 != i23;
                                                b5Var3.a = i23;
                                                if (z13) {
                                                    ns.f(i20).k(ns.v5, new Object[0]);
                                                }
                                            } else {
                                                TLRPC.TL_error tL_error3 = tL_error;
                                                if (tL_error3 != null && "MSG_ID_INVALID".equals(tL_error3.text)) {
                                                    b5Var3.a = 0;
                                                }
                                                b5Var3.m = false;
                                            }
                                            org.telegram.messenger.a8.b("SelfStoryViewsPage reactions " + storyItem3.id + " response  totalItems " + arrayList5.size() + " has next " + b5Var3.m);
                                            for (int i24 = 0; i24 < arrayList4.size(); i24++) {
                                                ((c5) arrayList4.get(i24)).e(b5Var3);
                                            }
                                            if (arrayList5.size() < 20 && b5Var3.m) {
                                                b5Var3.c();
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

    public final void e(o4 o4Var, boolean z10, boolean z11) {
        o4 o4Var2 = new o4();
        o4Var2.a = o4Var.a;
        o4Var2.b = o4Var.b;
        o4Var2.c = o4Var.c;
        int i7 = 0;
        if (!z10) {
            o4Var2.b = false;
        }
        if (!z11) {
            o4Var2.a = true;
        }
        o4 o4Var3 = this.s;
        if (o4Var3.equals(o4Var2)) {
            return;
        }
        o4Var3.a = o4Var2.a;
        o4Var3.b = o4Var2.b;
        o4Var3.c = o4Var2.c;
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
            if (i7 >= arrayList.size()) {
                return;
            }
            ((c5) arrayList.get(i7)).e(this);
            i7++;
        }
    }
}
