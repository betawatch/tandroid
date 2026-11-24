// default package

import android.text.TextUtils;
import j$.util.Comparator$-CC;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes3.dex */
public final class f0a {
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
    public final tz9 s = new tz9();

    public f0a(int i, long j, TL_stories.StoryItem storyItem) {
        TL_stories.StoryViews storyViews;
        this.d = i;
        this.b = storyItem;
        this.f = j < 0;
        this.c = j;
        TL_stories.StoryViews storyViews2 = storyItem.views;
        int i2 = storyViews2 == null ? 0 : storyViews2.views_count;
        this.a = i2;
        if (i2 < 200) {
            this.q = true;
        }
        boolean z = x2b.v(storyItem) && !y6c.h(i).p();
        this.j = z;
        if (z && (storyViews = storyItem.views) != null && storyViews.reactions_count > 0) {
            this.j = false;
            this.k = true;
            z = false;
        }
        if (z) {
            return;
        }
        this.l = true;
        if (storyItem.views != null) {
            for (int i3 = 0; i3 < storyItem.views.recent_viewers.size(); i3++) {
                Long l = storyItem.views.recent_viewers.get(i3);
                long longValue = l.longValue();
                if (na7.q1(i).V1(l) != null) {
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
        tz9 tz9Var = this.s;
        boolean z = tz9Var.b;
        ArrayList arrayList2 = this.h;
        if (z || !TextUtils.isEmpty(tz9Var.c)) {
            if (TextUtils.isEmpty(tz9Var.c)) {
                str = null;
                str2 = null;
                str3 = null;
                str4 = null;
            } else {
                str = tz9Var.c.trim().toLowerCase();
                str2 = k96.D0().S0(str, true, false);
                str4 = b00.h(" ", str);
                str3 = b00.h(" ", str2);
            }
            for (int i = 0; i < arrayList2.size(); i++) {
                TLRPC.User V1 = na7.q1(this.d).V1(Long.valueOf(((TL_stories.StoryView) arrayList2.get(i)).user_id));
                boolean z2 = !tz9Var.b || (V1 != null && V1.contact);
                if (z2 && str != null) {
                    String lowerCase = qu2.m(0, V1.first_name, V1.last_name).toLowerCase();
                    String o = l7c.o(V1);
                    String J3 = gl.J3(lowerCase);
                    if ((lowerCase == null || (!lowerCase.startsWith(str) && !lowerCase.contains(str4))) && !J3.startsWith(str2) && !J3.contains(str3) && (o == null || (!o.startsWith(str2) && !o.contains(str3)))) {
                        z2 = false;
                    }
                }
                if (z2) {
                    arrayList.add((TL_stories.StoryView) arrayList2.get(i));
                }
            }
        } else {
            arrayList.addAll(arrayList2);
        }
        if (tz9Var.a) {
            return;
        }
        Collections.sort(arrayList, Comparator$-CC.comparingInt(new mm((byte) 13)));
    }

    public final int b() {
        return (this.f ? this.i : this.g).size();
    }

    public final void c() {
        if (this.e || !this.m || this.j) {
            return;
        }
        boolean z = this.f;
        long j = this.c;
        final byte b = 0;
        tz9 tz9Var = this.s;
        int i = this.d;
        TL_stories.StoryItem storyItem = this.b;
        final byte b2 = 1;
        if (z) {
            TL_stories.TL_getStoryReactionsList tL_getStoryReactionsList = new TL_stories.TL_getStoryReactionsList();
            tL_getStoryReactionsList.forwards_first = tz9Var.a;
            tL_getStoryReactionsList.id = storyItem.id;
            tL_getStoryReactionsList.peer = na7.q1(i).h1(j);
            tL_getStoryReactionsList.limit = (this.l || this.i.size() < 20) ? 20 : 100;
            String str = this.n;
            tL_getStoryReactionsList.offset = str;
            if (str == null) {
                tL_getStoryReactionsList.offset = "";
            } else {
                tL_getStoryReactionsList.flags |= 2;
            }
            this.e = true;
            fa4.b("SelfStoryViewsPage reactions load next " + storyItem.id + " " + this.l + " offset=" + tL_getStoryReactionsList.offset);
            int sendRequest = ConnectionsManager.getInstance(i).sendRequest(tL_getStoryReactionsList, new RequestDelegate(this) { // from class: d0a
                public final /* synthetic */ f0a b;

                {
                    this.b = this;
                }

                @Override // org.telegram.tgnet.RequestDelegate
                public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                    switch (b) {
                        case 0:
                            final byte b3 = 1;
                            final f0a f0aVar = this.b;
                            final int[] iArr = r2;
                            gl.d3(new Runnable() { // from class: e0a
                                @Override // java.lang.Runnable
                                public final void run() {
                                    int i2;
                                    TL_stories.StoryItem storyItem2;
                                    boolean z2;
                                    boolean z3;
                                    boolean z4;
                                    byte b4 = b3;
                                    TLRPC.TL_error tL_error2 = tL_error;
                                    TLObject tLObject2 = tLObject;
                                    int[] iArr2 = iArr;
                                    f0a f0aVar2 = f0aVar;
                                    switch (b4) {
                                        case 0:
                                            ArrayList arrayList = f0aVar2.r;
                                            ArrayList arrayList2 = f0aVar2.h;
                                            int i3 = f0aVar2.d;
                                            TL_stories.StoryItem storyItem3 = f0aVar2.b;
                                            ArrayList arrayList3 = f0aVar2.g;
                                            if (iArr2[0] != f0aVar2.o) {
                                                fa4.b("SelfStoryViewsPage " + storyItem3.id + " localId != reqId");
                                                break;
                                            } else {
                                                f0aVar2.e = false;
                                                f0aVar2.o = -1;
                                                if (tLObject2 != null) {
                                                    TL_stories.StoryViewsList storyViewsList = (TL_stories.StoryViewsList) tLObject2;
                                                    vf6 vf6Var = na7.q1(i3).M1().M;
                                                    if (storyViewsList.views != null) {
                                                        int i4 = 0;
                                                        while (i4 < storyViewsList.views.size()) {
                                                            TL_stories.StoryView storyView = storyViewsList.views.get(i4);
                                                            TL_stories.StoryItem storyItem4 = storyItem3;
                                                            if (vf6Var.d(storyView.user_id)) {
                                                                vf6Var.k(Boolean.valueOf(storyView.blocked_my_stories_from), storyView.user_id);
                                                            }
                                                            i4++;
                                                            storyItem3 = storyItem4;
                                                        }
                                                    }
                                                    storyItem2 = storyItem3;
                                                    na7.q1(i3).a4(storyViewsList.users, false);
                                                    na7.q1(i3).U3(storyViewsList.chats, false);
                                                    ad7.Y(i3).j1(storyViewsList.users, storyViewsList.chats, true, false);
                                                    if (f0aVar2.l) {
                                                        f0aVar2.l = false;
                                                        for (int i5 = 0; i5 < arrayList3.size(); i5++) {
                                                            f0aVar2.p.add(Long.valueOf(((TL_stories.StoryView) arrayList3.get(i5)).user_id));
                                                        }
                                                        arrayList3.clear();
                                                        arrayList2.clear();
                                                    }
                                                    boolean z5 = f0aVar2.q;
                                                    ArrayList<TL_stories.StoryView> arrayList4 = storyViewsList.views;
                                                    if (z5) {
                                                        arrayList2.addAll(arrayList4);
                                                        f0aVar2.a();
                                                    } else {
                                                        arrayList3.addAll(arrayList4);
                                                    }
                                                    if (storyViewsList.views.isEmpty()) {
                                                        z2 = false;
                                                        f0aVar2.m = false;
                                                    } else {
                                                        f0aVar2.m = true;
                                                        z2 = false;
                                                    }
                                                    String str2 = storyViewsList.next_offset;
                                                    f0aVar2.n = str2;
                                                    if (TextUtils.isEmpty(str2)) {
                                                        f0aVar2.m = z2;
                                                    }
                                                    TL_stories.StoryViews storyViews = storyItem2.views;
                                                    if (storyViews == null) {
                                                        storyViews = new TL_stories.TL_storyViews();
                                                        storyItem2.views = storyViews;
                                                    }
                                                    if (storyViewsList.count > storyViews.views_count) {
                                                        storyViews.recent_viewers.clear();
                                                        int i6 = 0;
                                                        while (true) {
                                                            int min = Math.min(3, storyViewsList.users.size());
                                                            TL_stories.StoryViews storyViews2 = storyItem2.views;
                                                            if (i6 < min) {
                                                                i6 = mue.c(i6, 1, storyViewsList.users.get(i6).id, storyViews2.recent_viewers);
                                                            } else {
                                                                z3 = true;
                                                                storyViews2.views_count = storyViewsList.count;
                                                                storyViews = storyViews2;
                                                                z4 = true;
                                                            }
                                                        }
                                                    } else {
                                                        z3 = true;
                                                        z4 = false;
                                                    }
                                                    int i7 = storyViews.reactions_count;
                                                    int i8 = storyViewsList.reactions_count;
                                                    if (i7 != i8) {
                                                        storyViews.reactions_count = i8;
                                                    } else {
                                                        z3 = z4;
                                                    }
                                                    if (z3) {
                                                        i2 = 0;
                                                        kk7.f(i3).k(kk7.x5, new Object[0]);
                                                    } else {
                                                        i2 = 0;
                                                    }
                                                } else {
                                                    i2 = 0;
                                                    storyItem2 = storyItem3;
                                                    if (tL_error2 != null && "MSG_ID_INVALID".equals(tL_error2.text)) {
                                                        f0aVar2.a = 0;
                                                    }
                                                    f0aVar2.m = false;
                                                }
                                                fa4.b("SelfStoryViewsPage " + storyItem2.id + " response  totalItems " + arrayList3.size() + " has next " + f0aVar2.m);
                                                for (int i9 = i2; i9 < arrayList.size(); i9++) {
                                                    ((g0a) arrayList.get(i9)).c(f0aVar2);
                                                }
                                                if (arrayList3.size() < 20 && f0aVar2.m) {
                                                    f0aVar2.c();
                                                    break;
                                                }
                                            }
                                            break;
                                        default:
                                            ArrayList arrayList5 = f0aVar2.r;
                                            TL_stories.StoryItem storyItem5 = f0aVar2.b;
                                            int i10 = f0aVar2.d;
                                            ArrayList arrayList6 = f0aVar2.i;
                                            if (iArr2[0] != f0aVar2.o) {
                                                fa4.b("SelfStoryViewsPage reactions " + storyItem5.id + " localId != reqId");
                                                break;
                                            } else {
                                                f0aVar2.e = false;
                                                f0aVar2.o = -1;
                                                if (tLObject2 != null) {
                                                    TL_stories.TL_storyReactionsList tL_storyReactionsList = (TL_stories.TL_storyReactionsList) tLObject2;
                                                    na7.q1(i10).a4(tL_storyReactionsList.users, false);
                                                    na7.q1(i10).U3(tL_storyReactionsList.chats, false);
                                                    ad7.Y(i10).j1(tL_storyReactionsList.users, tL_storyReactionsList.chats, true, false);
                                                    if (f0aVar2.l) {
                                                        f0aVar2.l = false;
                                                        for (int i11 = 0; i11 < arrayList6.size(); i11++) {
                                                            f0aVar2.p.add(Long.valueOf(cf3.n(((TL_stories.StoryReaction) arrayList6.get(i11)).peer_id)));
                                                        }
                                                        arrayList6.clear();
                                                        f0aVar2.h.clear();
                                                    }
                                                    arrayList6.addAll(tL_storyReactionsList.reactions);
                                                    if (tL_storyReactionsList.reactions.isEmpty()) {
                                                        f0aVar2.m = false;
                                                    } else {
                                                        f0aVar2.m = true;
                                                    }
                                                    String str3 = tL_storyReactionsList.next_offset;
                                                    f0aVar2.n = str3;
                                                    if (TextUtils.isEmpty(str3)) {
                                                        f0aVar2.m = false;
                                                    }
                                                    if (storyItem5.views == null) {
                                                        storyItem5.views = new TL_stories.TL_storyViews();
                                                    }
                                                    int i12 = f0aVar2.a;
                                                    int i13 = tL_storyReactionsList.count;
                                                    boolean z6 = i12 != i13;
                                                    f0aVar2.a = i13;
                                                    if (z6) {
                                                        kk7.f(i10).k(kk7.x5, new Object[0]);
                                                    }
                                                } else {
                                                    if (tL_error2 != null && "MSG_ID_INVALID".equals(tL_error2.text)) {
                                                        f0aVar2.a = 0;
                                                    }
                                                    f0aVar2.m = false;
                                                }
                                                fa4.b("SelfStoryViewsPage reactions " + storyItem5.id + " response  totalItems " + arrayList6.size() + " has next " + f0aVar2.m);
                                                for (int i14 = 0; i14 < arrayList5.size(); i14++) {
                                                    ((g0a) arrayList5.get(i14)).c(f0aVar2);
                                                }
                                                if (arrayList6.size() < 20 && f0aVar2.m) {
                                                    f0aVar2.c();
                                                    break;
                                                }
                                            }
                                            break;
                                    }
                                }
                            });
                            break;
                        default:
                            final byte b4 = 0;
                            final f0a f0aVar2 = this.b;
                            final int[] iArr2 = r2;
                            gl.d3(new Runnable() { // from class: e0a
                                @Override // java.lang.Runnable
                                public final void run() {
                                    int i2;
                                    TL_stories.StoryItem storyItem2;
                                    boolean z2;
                                    boolean z3;
                                    boolean z4;
                                    byte b42 = b4;
                                    TLRPC.TL_error tL_error2 = tL_error;
                                    TLObject tLObject2 = tLObject;
                                    int[] iArr22 = iArr2;
                                    f0a f0aVar22 = f0aVar2;
                                    switch (b42) {
                                        case 0:
                                            ArrayList arrayList = f0aVar22.r;
                                            ArrayList arrayList2 = f0aVar22.h;
                                            int i3 = f0aVar22.d;
                                            TL_stories.StoryItem storyItem3 = f0aVar22.b;
                                            ArrayList arrayList3 = f0aVar22.g;
                                            if (iArr22[0] != f0aVar22.o) {
                                                fa4.b("SelfStoryViewsPage " + storyItem3.id + " localId != reqId");
                                                break;
                                            } else {
                                                f0aVar22.e = false;
                                                f0aVar22.o = -1;
                                                if (tLObject2 != null) {
                                                    TL_stories.StoryViewsList storyViewsList = (TL_stories.StoryViewsList) tLObject2;
                                                    vf6 vf6Var = na7.q1(i3).M1().M;
                                                    if (storyViewsList.views != null) {
                                                        int i4 = 0;
                                                        while (i4 < storyViewsList.views.size()) {
                                                            TL_stories.StoryView storyView = storyViewsList.views.get(i4);
                                                            TL_stories.StoryItem storyItem4 = storyItem3;
                                                            if (vf6Var.d(storyView.user_id)) {
                                                                vf6Var.k(Boolean.valueOf(storyView.blocked_my_stories_from), storyView.user_id);
                                                            }
                                                            i4++;
                                                            storyItem3 = storyItem4;
                                                        }
                                                    }
                                                    storyItem2 = storyItem3;
                                                    na7.q1(i3).a4(storyViewsList.users, false);
                                                    na7.q1(i3).U3(storyViewsList.chats, false);
                                                    ad7.Y(i3).j1(storyViewsList.users, storyViewsList.chats, true, false);
                                                    if (f0aVar22.l) {
                                                        f0aVar22.l = false;
                                                        for (int i5 = 0; i5 < arrayList3.size(); i5++) {
                                                            f0aVar22.p.add(Long.valueOf(((TL_stories.StoryView) arrayList3.get(i5)).user_id));
                                                        }
                                                        arrayList3.clear();
                                                        arrayList2.clear();
                                                    }
                                                    boolean z5 = f0aVar22.q;
                                                    ArrayList<TL_stories.StoryView> arrayList4 = storyViewsList.views;
                                                    if (z5) {
                                                        arrayList2.addAll(arrayList4);
                                                        f0aVar22.a();
                                                    } else {
                                                        arrayList3.addAll(arrayList4);
                                                    }
                                                    if (storyViewsList.views.isEmpty()) {
                                                        z2 = false;
                                                        f0aVar22.m = false;
                                                    } else {
                                                        f0aVar22.m = true;
                                                        z2 = false;
                                                    }
                                                    String str2 = storyViewsList.next_offset;
                                                    f0aVar22.n = str2;
                                                    if (TextUtils.isEmpty(str2)) {
                                                        f0aVar22.m = z2;
                                                    }
                                                    TL_stories.StoryViews storyViews = storyItem2.views;
                                                    if (storyViews == null) {
                                                        storyViews = new TL_stories.TL_storyViews();
                                                        storyItem2.views = storyViews;
                                                    }
                                                    if (storyViewsList.count > storyViews.views_count) {
                                                        storyViews.recent_viewers.clear();
                                                        int i6 = 0;
                                                        while (true) {
                                                            int min = Math.min(3, storyViewsList.users.size());
                                                            TL_stories.StoryViews storyViews2 = storyItem2.views;
                                                            if (i6 < min) {
                                                                i6 = mue.c(i6, 1, storyViewsList.users.get(i6).id, storyViews2.recent_viewers);
                                                            } else {
                                                                z3 = true;
                                                                storyViews2.views_count = storyViewsList.count;
                                                                storyViews = storyViews2;
                                                                z4 = true;
                                                            }
                                                        }
                                                    } else {
                                                        z3 = true;
                                                        z4 = false;
                                                    }
                                                    int i7 = storyViews.reactions_count;
                                                    int i8 = storyViewsList.reactions_count;
                                                    if (i7 != i8) {
                                                        storyViews.reactions_count = i8;
                                                    } else {
                                                        z3 = z4;
                                                    }
                                                    if (z3) {
                                                        i2 = 0;
                                                        kk7.f(i3).k(kk7.x5, new Object[0]);
                                                    } else {
                                                        i2 = 0;
                                                    }
                                                } else {
                                                    i2 = 0;
                                                    storyItem2 = storyItem3;
                                                    if (tL_error2 != null && "MSG_ID_INVALID".equals(tL_error2.text)) {
                                                        f0aVar22.a = 0;
                                                    }
                                                    f0aVar22.m = false;
                                                }
                                                fa4.b("SelfStoryViewsPage " + storyItem2.id + " response  totalItems " + arrayList3.size() + " has next " + f0aVar22.m);
                                                for (int i9 = i2; i9 < arrayList.size(); i9++) {
                                                    ((g0a) arrayList.get(i9)).c(f0aVar22);
                                                }
                                                if (arrayList3.size() < 20 && f0aVar22.m) {
                                                    f0aVar22.c();
                                                    break;
                                                }
                                            }
                                            break;
                                        default:
                                            ArrayList arrayList5 = f0aVar22.r;
                                            TL_stories.StoryItem storyItem5 = f0aVar22.b;
                                            int i10 = f0aVar22.d;
                                            ArrayList arrayList6 = f0aVar22.i;
                                            if (iArr22[0] != f0aVar22.o) {
                                                fa4.b("SelfStoryViewsPage reactions " + storyItem5.id + " localId != reqId");
                                                break;
                                            } else {
                                                f0aVar22.e = false;
                                                f0aVar22.o = -1;
                                                if (tLObject2 != null) {
                                                    TL_stories.TL_storyReactionsList tL_storyReactionsList = (TL_stories.TL_storyReactionsList) tLObject2;
                                                    na7.q1(i10).a4(tL_storyReactionsList.users, false);
                                                    na7.q1(i10).U3(tL_storyReactionsList.chats, false);
                                                    ad7.Y(i10).j1(tL_storyReactionsList.users, tL_storyReactionsList.chats, true, false);
                                                    if (f0aVar22.l) {
                                                        f0aVar22.l = false;
                                                        for (int i11 = 0; i11 < arrayList6.size(); i11++) {
                                                            f0aVar22.p.add(Long.valueOf(cf3.n(((TL_stories.StoryReaction) arrayList6.get(i11)).peer_id)));
                                                        }
                                                        arrayList6.clear();
                                                        f0aVar22.h.clear();
                                                    }
                                                    arrayList6.addAll(tL_storyReactionsList.reactions);
                                                    if (tL_storyReactionsList.reactions.isEmpty()) {
                                                        f0aVar22.m = false;
                                                    } else {
                                                        f0aVar22.m = true;
                                                    }
                                                    String str3 = tL_storyReactionsList.next_offset;
                                                    f0aVar22.n = str3;
                                                    if (TextUtils.isEmpty(str3)) {
                                                        f0aVar22.m = false;
                                                    }
                                                    if (storyItem5.views == null) {
                                                        storyItem5.views = new TL_stories.TL_storyViews();
                                                    }
                                                    int i12 = f0aVar22.a;
                                                    int i13 = tL_storyReactionsList.count;
                                                    boolean z6 = i12 != i13;
                                                    f0aVar22.a = i13;
                                                    if (z6) {
                                                        kk7.f(i10).k(kk7.x5, new Object[0]);
                                                    }
                                                } else {
                                                    if (tL_error2 != null && "MSG_ID_INVALID".equals(tL_error2.text)) {
                                                        f0aVar22.a = 0;
                                                    }
                                                    f0aVar22.m = false;
                                                }
                                                fa4.b("SelfStoryViewsPage reactions " + storyItem5.id + " response  totalItems " + arrayList6.size() + " has next " + f0aVar22.m);
                                                for (int i14 = 0; i14 < arrayList5.size(); i14++) {
                                                    ((g0a) arrayList5.get(i14)).c(f0aVar22);
                                                }
                                                if (arrayList6.size() < 20 && f0aVar22.m) {
                                                    f0aVar22.c();
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
        tL_stories_getStoryViewsList.peer = na7.q1(i).h1(j);
        if (this.q) {
            tL_stories_getStoryViewsList.q = "";
            tL_stories_getStoryViewsList.just_contacts = false;
            tL_stories_getStoryViewsList.reactions_first = true;
        } else {
            String str2 = tz9Var.c;
            tL_stories_getStoryViewsList.q = str2;
            if (!TextUtils.isEmpty(str2)) {
                tL_stories_getStoryViewsList.flags |= 2;
            }
            tL_stories_getStoryViewsList.just_contacts = tz9Var.b;
            tL_stories_getStoryViewsList.reactions_first = tz9Var.a;
        }
        tL_stories_getStoryViewsList.limit = (this.l || this.g.size() < 20) ? 20 : 100;
        String str3 = this.n;
        tL_stories_getStoryViewsList.offset = str3;
        if (str3 == null) {
            tL_stories_getStoryViewsList.offset = "";
        }
        this.e = true;
        fa4.b("SelfStoryViewsPage load next " + storyItem.id + " " + this.l + " offset=" + tL_stories_getStoryViewsList.offset + " q" + tL_stories_getStoryViewsList.q + " " + tL_stories_getStoryViewsList.just_contacts + " " + tL_stories_getStoryViewsList.reactions_first);
        int sendRequest2 = ConnectionsManager.getInstance(i).sendRequest(tL_stories_getStoryViewsList, new RequestDelegate(this) { // from class: d0a
            public final /* synthetic */ f0a b;

            {
                this.b = this;
            }

            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                switch (b2) {
                    case 0:
                        final byte b3 = 1;
                        final f0a f0aVar = this.b;
                        final int[] iArr2 = r2;
                        gl.d3(new Runnable() { // from class: e0a
                            @Override // java.lang.Runnable
                            public final void run() {
                                int i2;
                                TL_stories.StoryItem storyItem2;
                                boolean z2;
                                boolean z3;
                                boolean z4;
                                byte b42 = b3;
                                TLRPC.TL_error tL_error2 = tL_error;
                                TLObject tLObject2 = tLObject;
                                int[] iArr22 = iArr2;
                                f0a f0aVar22 = f0aVar;
                                switch (b42) {
                                    case 0:
                                        ArrayList arrayList = f0aVar22.r;
                                        ArrayList arrayList2 = f0aVar22.h;
                                        int i3 = f0aVar22.d;
                                        TL_stories.StoryItem storyItem3 = f0aVar22.b;
                                        ArrayList arrayList3 = f0aVar22.g;
                                        if (iArr22[0] != f0aVar22.o) {
                                            fa4.b("SelfStoryViewsPage " + storyItem3.id + " localId != reqId");
                                            break;
                                        } else {
                                            f0aVar22.e = false;
                                            f0aVar22.o = -1;
                                            if (tLObject2 != null) {
                                                TL_stories.StoryViewsList storyViewsList = (TL_stories.StoryViewsList) tLObject2;
                                                vf6 vf6Var = na7.q1(i3).M1().M;
                                                if (storyViewsList.views != null) {
                                                    int i4 = 0;
                                                    while (i4 < storyViewsList.views.size()) {
                                                        TL_stories.StoryView storyView = storyViewsList.views.get(i4);
                                                        TL_stories.StoryItem storyItem4 = storyItem3;
                                                        if (vf6Var.d(storyView.user_id)) {
                                                            vf6Var.k(Boolean.valueOf(storyView.blocked_my_stories_from), storyView.user_id);
                                                        }
                                                        i4++;
                                                        storyItem3 = storyItem4;
                                                    }
                                                }
                                                storyItem2 = storyItem3;
                                                na7.q1(i3).a4(storyViewsList.users, false);
                                                na7.q1(i3).U3(storyViewsList.chats, false);
                                                ad7.Y(i3).j1(storyViewsList.users, storyViewsList.chats, true, false);
                                                if (f0aVar22.l) {
                                                    f0aVar22.l = false;
                                                    for (int i5 = 0; i5 < arrayList3.size(); i5++) {
                                                        f0aVar22.p.add(Long.valueOf(((TL_stories.StoryView) arrayList3.get(i5)).user_id));
                                                    }
                                                    arrayList3.clear();
                                                    arrayList2.clear();
                                                }
                                                boolean z5 = f0aVar22.q;
                                                ArrayList<TL_stories.StoryView> arrayList4 = storyViewsList.views;
                                                if (z5) {
                                                    arrayList2.addAll(arrayList4);
                                                    f0aVar22.a();
                                                } else {
                                                    arrayList3.addAll(arrayList4);
                                                }
                                                if (storyViewsList.views.isEmpty()) {
                                                    z2 = false;
                                                    f0aVar22.m = false;
                                                } else {
                                                    f0aVar22.m = true;
                                                    z2 = false;
                                                }
                                                String str22 = storyViewsList.next_offset;
                                                f0aVar22.n = str22;
                                                if (TextUtils.isEmpty(str22)) {
                                                    f0aVar22.m = z2;
                                                }
                                                TL_stories.StoryViews storyViews = storyItem2.views;
                                                if (storyViews == null) {
                                                    storyViews = new TL_stories.TL_storyViews();
                                                    storyItem2.views = storyViews;
                                                }
                                                if (storyViewsList.count > storyViews.views_count) {
                                                    storyViews.recent_viewers.clear();
                                                    int i6 = 0;
                                                    while (true) {
                                                        int min = Math.min(3, storyViewsList.users.size());
                                                        TL_stories.StoryViews storyViews2 = storyItem2.views;
                                                        if (i6 < min) {
                                                            i6 = mue.c(i6, 1, storyViewsList.users.get(i6).id, storyViews2.recent_viewers);
                                                        } else {
                                                            z3 = true;
                                                            storyViews2.views_count = storyViewsList.count;
                                                            storyViews = storyViews2;
                                                            z4 = true;
                                                        }
                                                    }
                                                } else {
                                                    z3 = true;
                                                    z4 = false;
                                                }
                                                int i7 = storyViews.reactions_count;
                                                int i8 = storyViewsList.reactions_count;
                                                if (i7 != i8) {
                                                    storyViews.reactions_count = i8;
                                                } else {
                                                    z3 = z4;
                                                }
                                                if (z3) {
                                                    i2 = 0;
                                                    kk7.f(i3).k(kk7.x5, new Object[0]);
                                                } else {
                                                    i2 = 0;
                                                }
                                            } else {
                                                i2 = 0;
                                                storyItem2 = storyItem3;
                                                if (tL_error2 != null && "MSG_ID_INVALID".equals(tL_error2.text)) {
                                                    f0aVar22.a = 0;
                                                }
                                                f0aVar22.m = false;
                                            }
                                            fa4.b("SelfStoryViewsPage " + storyItem2.id + " response  totalItems " + arrayList3.size() + " has next " + f0aVar22.m);
                                            for (int i9 = i2; i9 < arrayList.size(); i9++) {
                                                ((g0a) arrayList.get(i9)).c(f0aVar22);
                                            }
                                            if (arrayList3.size() < 20 && f0aVar22.m) {
                                                f0aVar22.c();
                                                break;
                                            }
                                        }
                                        break;
                                    default:
                                        ArrayList arrayList5 = f0aVar22.r;
                                        TL_stories.StoryItem storyItem5 = f0aVar22.b;
                                        int i10 = f0aVar22.d;
                                        ArrayList arrayList6 = f0aVar22.i;
                                        if (iArr22[0] != f0aVar22.o) {
                                            fa4.b("SelfStoryViewsPage reactions " + storyItem5.id + " localId != reqId");
                                            break;
                                        } else {
                                            f0aVar22.e = false;
                                            f0aVar22.o = -1;
                                            if (tLObject2 != null) {
                                                TL_stories.TL_storyReactionsList tL_storyReactionsList = (TL_stories.TL_storyReactionsList) tLObject2;
                                                na7.q1(i10).a4(tL_storyReactionsList.users, false);
                                                na7.q1(i10).U3(tL_storyReactionsList.chats, false);
                                                ad7.Y(i10).j1(tL_storyReactionsList.users, tL_storyReactionsList.chats, true, false);
                                                if (f0aVar22.l) {
                                                    f0aVar22.l = false;
                                                    for (int i11 = 0; i11 < arrayList6.size(); i11++) {
                                                        f0aVar22.p.add(Long.valueOf(cf3.n(((TL_stories.StoryReaction) arrayList6.get(i11)).peer_id)));
                                                    }
                                                    arrayList6.clear();
                                                    f0aVar22.h.clear();
                                                }
                                                arrayList6.addAll(tL_storyReactionsList.reactions);
                                                if (tL_storyReactionsList.reactions.isEmpty()) {
                                                    f0aVar22.m = false;
                                                } else {
                                                    f0aVar22.m = true;
                                                }
                                                String str32 = tL_storyReactionsList.next_offset;
                                                f0aVar22.n = str32;
                                                if (TextUtils.isEmpty(str32)) {
                                                    f0aVar22.m = false;
                                                }
                                                if (storyItem5.views == null) {
                                                    storyItem5.views = new TL_stories.TL_storyViews();
                                                }
                                                int i12 = f0aVar22.a;
                                                int i13 = tL_storyReactionsList.count;
                                                boolean z6 = i12 != i13;
                                                f0aVar22.a = i13;
                                                if (z6) {
                                                    kk7.f(i10).k(kk7.x5, new Object[0]);
                                                }
                                            } else {
                                                if (tL_error2 != null && "MSG_ID_INVALID".equals(tL_error2.text)) {
                                                    f0aVar22.a = 0;
                                                }
                                                f0aVar22.m = false;
                                            }
                                            fa4.b("SelfStoryViewsPage reactions " + storyItem5.id + " response  totalItems " + arrayList6.size() + " has next " + f0aVar22.m);
                                            for (int i14 = 0; i14 < arrayList5.size(); i14++) {
                                                ((g0a) arrayList5.get(i14)).c(f0aVar22);
                                            }
                                            if (arrayList6.size() < 20 && f0aVar22.m) {
                                                f0aVar22.c();
                                                break;
                                            }
                                        }
                                        break;
                                }
                            }
                        });
                        break;
                    default:
                        final byte b4 = 0;
                        final f0a f0aVar2 = this.b;
                        final int[] iArr22 = r2;
                        gl.d3(new Runnable() { // from class: e0a
                            @Override // java.lang.Runnable
                            public final void run() {
                                int i2;
                                TL_stories.StoryItem storyItem2;
                                boolean z2;
                                boolean z3;
                                boolean z4;
                                byte b42 = b4;
                                TLRPC.TL_error tL_error2 = tL_error;
                                TLObject tLObject2 = tLObject;
                                int[] iArr222 = iArr22;
                                f0a f0aVar22 = f0aVar2;
                                switch (b42) {
                                    case 0:
                                        ArrayList arrayList = f0aVar22.r;
                                        ArrayList arrayList2 = f0aVar22.h;
                                        int i3 = f0aVar22.d;
                                        TL_stories.StoryItem storyItem3 = f0aVar22.b;
                                        ArrayList arrayList3 = f0aVar22.g;
                                        if (iArr222[0] != f0aVar22.o) {
                                            fa4.b("SelfStoryViewsPage " + storyItem3.id + " localId != reqId");
                                            break;
                                        } else {
                                            f0aVar22.e = false;
                                            f0aVar22.o = -1;
                                            if (tLObject2 != null) {
                                                TL_stories.StoryViewsList storyViewsList = (TL_stories.StoryViewsList) tLObject2;
                                                vf6 vf6Var = na7.q1(i3).M1().M;
                                                if (storyViewsList.views != null) {
                                                    int i4 = 0;
                                                    while (i4 < storyViewsList.views.size()) {
                                                        TL_stories.StoryView storyView = storyViewsList.views.get(i4);
                                                        TL_stories.StoryItem storyItem4 = storyItem3;
                                                        if (vf6Var.d(storyView.user_id)) {
                                                            vf6Var.k(Boolean.valueOf(storyView.blocked_my_stories_from), storyView.user_id);
                                                        }
                                                        i4++;
                                                        storyItem3 = storyItem4;
                                                    }
                                                }
                                                storyItem2 = storyItem3;
                                                na7.q1(i3).a4(storyViewsList.users, false);
                                                na7.q1(i3).U3(storyViewsList.chats, false);
                                                ad7.Y(i3).j1(storyViewsList.users, storyViewsList.chats, true, false);
                                                if (f0aVar22.l) {
                                                    f0aVar22.l = false;
                                                    for (int i5 = 0; i5 < arrayList3.size(); i5++) {
                                                        f0aVar22.p.add(Long.valueOf(((TL_stories.StoryView) arrayList3.get(i5)).user_id));
                                                    }
                                                    arrayList3.clear();
                                                    arrayList2.clear();
                                                }
                                                boolean z5 = f0aVar22.q;
                                                ArrayList<TL_stories.StoryView> arrayList4 = storyViewsList.views;
                                                if (z5) {
                                                    arrayList2.addAll(arrayList4);
                                                    f0aVar22.a();
                                                } else {
                                                    arrayList3.addAll(arrayList4);
                                                }
                                                if (storyViewsList.views.isEmpty()) {
                                                    z2 = false;
                                                    f0aVar22.m = false;
                                                } else {
                                                    f0aVar22.m = true;
                                                    z2 = false;
                                                }
                                                String str22 = storyViewsList.next_offset;
                                                f0aVar22.n = str22;
                                                if (TextUtils.isEmpty(str22)) {
                                                    f0aVar22.m = z2;
                                                }
                                                TL_stories.StoryViews storyViews = storyItem2.views;
                                                if (storyViews == null) {
                                                    storyViews = new TL_stories.TL_storyViews();
                                                    storyItem2.views = storyViews;
                                                }
                                                if (storyViewsList.count > storyViews.views_count) {
                                                    storyViews.recent_viewers.clear();
                                                    int i6 = 0;
                                                    while (true) {
                                                        int min = Math.min(3, storyViewsList.users.size());
                                                        TL_stories.StoryViews storyViews2 = storyItem2.views;
                                                        if (i6 < min) {
                                                            i6 = mue.c(i6, 1, storyViewsList.users.get(i6).id, storyViews2.recent_viewers);
                                                        } else {
                                                            z3 = true;
                                                            storyViews2.views_count = storyViewsList.count;
                                                            storyViews = storyViews2;
                                                            z4 = true;
                                                        }
                                                    }
                                                } else {
                                                    z3 = true;
                                                    z4 = false;
                                                }
                                                int i7 = storyViews.reactions_count;
                                                int i8 = storyViewsList.reactions_count;
                                                if (i7 != i8) {
                                                    storyViews.reactions_count = i8;
                                                } else {
                                                    z3 = z4;
                                                }
                                                if (z3) {
                                                    i2 = 0;
                                                    kk7.f(i3).k(kk7.x5, new Object[0]);
                                                } else {
                                                    i2 = 0;
                                                }
                                            } else {
                                                i2 = 0;
                                                storyItem2 = storyItem3;
                                                if (tL_error2 != null && "MSG_ID_INVALID".equals(tL_error2.text)) {
                                                    f0aVar22.a = 0;
                                                }
                                                f0aVar22.m = false;
                                            }
                                            fa4.b("SelfStoryViewsPage " + storyItem2.id + " response  totalItems " + arrayList3.size() + " has next " + f0aVar22.m);
                                            for (int i9 = i2; i9 < arrayList.size(); i9++) {
                                                ((g0a) arrayList.get(i9)).c(f0aVar22);
                                            }
                                            if (arrayList3.size() < 20 && f0aVar22.m) {
                                                f0aVar22.c();
                                                break;
                                            }
                                        }
                                        break;
                                    default:
                                        ArrayList arrayList5 = f0aVar22.r;
                                        TL_stories.StoryItem storyItem5 = f0aVar22.b;
                                        int i10 = f0aVar22.d;
                                        ArrayList arrayList6 = f0aVar22.i;
                                        if (iArr222[0] != f0aVar22.o) {
                                            fa4.b("SelfStoryViewsPage reactions " + storyItem5.id + " localId != reqId");
                                            break;
                                        } else {
                                            f0aVar22.e = false;
                                            f0aVar22.o = -1;
                                            if (tLObject2 != null) {
                                                TL_stories.TL_storyReactionsList tL_storyReactionsList = (TL_stories.TL_storyReactionsList) tLObject2;
                                                na7.q1(i10).a4(tL_storyReactionsList.users, false);
                                                na7.q1(i10).U3(tL_storyReactionsList.chats, false);
                                                ad7.Y(i10).j1(tL_storyReactionsList.users, tL_storyReactionsList.chats, true, false);
                                                if (f0aVar22.l) {
                                                    f0aVar22.l = false;
                                                    for (int i11 = 0; i11 < arrayList6.size(); i11++) {
                                                        f0aVar22.p.add(Long.valueOf(cf3.n(((TL_stories.StoryReaction) arrayList6.get(i11)).peer_id)));
                                                    }
                                                    arrayList6.clear();
                                                    f0aVar22.h.clear();
                                                }
                                                arrayList6.addAll(tL_storyReactionsList.reactions);
                                                if (tL_storyReactionsList.reactions.isEmpty()) {
                                                    f0aVar22.m = false;
                                                } else {
                                                    f0aVar22.m = true;
                                                }
                                                String str32 = tL_storyReactionsList.next_offset;
                                                f0aVar22.n = str32;
                                                if (TextUtils.isEmpty(str32)) {
                                                    f0aVar22.m = false;
                                                }
                                                if (storyItem5.views == null) {
                                                    storyItem5.views = new TL_stories.TL_storyViews();
                                                }
                                                int i12 = f0aVar22.a;
                                                int i13 = tL_storyReactionsList.count;
                                                boolean z6 = i12 != i13;
                                                f0aVar22.a = i13;
                                                if (z6) {
                                                    kk7.f(i10).k(kk7.x5, new Object[0]);
                                                }
                                            } else {
                                                if (tL_error2 != null && "MSG_ID_INVALID".equals(tL_error2.text)) {
                                                    f0aVar22.a = 0;
                                                }
                                                f0aVar22.m = false;
                                            }
                                            fa4.b("SelfStoryViewsPage reactions " + storyItem5.id + " response  totalItems " + arrayList6.size() + " has next " + f0aVar22.m);
                                            for (int i14 = 0; i14 < arrayList5.size(); i14++) {
                                                ((g0a) arrayList5.get(i14)).c(f0aVar22);
                                            }
                                            if (arrayList6.size() < 20 && f0aVar22.m) {
                                                f0aVar22.c();
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

    public final void e(tz9 tz9Var, boolean z, boolean z2) {
        tz9 tz9Var2 = new tz9();
        tz9Var2.a = tz9Var.a;
        tz9Var2.b = tz9Var.b;
        tz9Var2.c = tz9Var.c;
        int i = 0;
        if (!z) {
            tz9Var2.b = false;
        }
        if (!z2) {
            tz9Var2.a = true;
        }
        tz9 tz9Var3 = this.s;
        if (tz9Var3.equals(tz9Var2)) {
            return;
        }
        tz9Var3.a = tz9Var2.a;
        tz9Var3.b = tz9Var2.b;
        tz9Var3.c = tz9Var2.c;
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
            if (i >= arrayList.size()) {
                return;
            }
            ((g0a) arrayList.get(i)).c(this);
            i++;
        }
    }
}
