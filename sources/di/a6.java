package di;

import a8.ia;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.text.TextUtils;
import android.util.SparseBooleanArray;
import c8.ab;
import fi.nb;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.concurrent.CountDownLatch;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.c20;
import org.telegram.messenger.qp;
import org.telegram.messenger.qs;
import org.telegram.messenger.ui;
import org.telegram.messenger.yr;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.ot0;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.s11;
import org.telegram.ui.wt0;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class a6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ a6(z6 z6Var, boolean z9, TL_stories.TL_stories_getAllStories tL_stories_getAllStories, TLObject tLObject, boolean z10) {
        this.a = 0;
        this.d = z6Var;
        this.b = z9;
        this.e = tL_stories_getAllStories;
        this.f = tLObject;
        this.c = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        c20 c20Var;
        int i7 = this.a;
        int i10 = 4;
        boolean z9 = this.c;
        boolean z10 = this.b;
        final int i11 = 1;
        Object obj = this.f;
        Object obj2 = this.e;
        Object obj3 = this.d;
        final int i12 = 0;
        switch (i7) {
            case 0:
                z6 z6Var = (z6) obj3;
                TL_stories.TL_stories_getAllStories tL_stories_getAllStories = (TL_stories.TL_stories_getAllStories) obj2;
                TLObject tLObject = (TLObject) obj;
                int i13 = z6Var.a;
                SharedPreferences sharedPreferences = z6Var.l;
                if (z10) {
                    z6Var.r = false;
                } else {
                    z6Var.q = false;
                }
                org.telegram.messenger.a8.b("StoriesController loaded stories from server state=" + tL_stories_getAllStories.state + " more=" + tL_stories_getAllStories.next + "  " + tLObject);
                if (tLObject instanceof TL_stories.TL_stories_allStories) {
                    TL_stories.TL_stories_allStories tL_stories_allStories = (TL_stories.TL_stories_allStories) tLObject;
                    yr.a0(i13).m1(tL_stories_allStories.users, null, true, true);
                    if (z10) {
                        z6Var.v = tL_stories_allStories.count;
                        z6Var.z = tL_stories_allStories.has_more;
                        z6Var.y = tL_stories_allStories.state;
                        sharedPreferences.edit().putString("last_stories_state_hidden", z6Var.y).putBoolean("last_stories_has_more_hidden", z6Var.z).putInt("total_stores_hidden", z6Var.v).apply();
                    } else {
                        z6Var.u = tL_stories_allStories.count;
                        z6Var.p = tL_stories_allStories.has_more;
                        z6Var.o = tL_stories_allStories.state;
                        sharedPreferences.edit().putString("last_stories_state", z6Var.o).putBoolean("last_stories_has_more", z6Var.p).putInt("total_stores", z6Var.u).apply();
                    }
                    z6Var.b0(tL_stories_allStories, z10, false, z9);
                    break;
                } else if (tLObject instanceof TL_stories.TL_stories_allStoriesNotModified) {
                    if (z10) {
                        z6Var.z = sharedPreferences.getBoolean("last_stories_has_more_hidden", false);
                        z6Var.y = ((TL_stories.TL_stories_allStoriesNotModified) tLObject).state;
                        sharedPreferences.edit().putString("last_stories_state_hidden", z6Var.y).apply();
                    } else {
                        z6Var.p = sharedPreferences.getBoolean("last_stories_has_more", false);
                        z6Var.o = ((TL_stories.TL_stories_allStoriesNotModified) tLObject).state;
                        sharedPreferences.edit().putString("last_stories_state", z6Var.o).apply();
                    }
                    if (z10 ? z6Var.z : z6Var.p) {
                        qs.f(i13).k(qs.v5, new Object[0]);
                        break;
                    }
                }
                break;
            case 1:
                m7 m7Var = (m7) obj3;
                ArrayList arrayList = (ArrayList) obj2;
                ai.m0 m0Var = (ai.m0) obj;
                int i14 = m7Var.a;
                yr yrVar = m7Var.b;
                SQLiteDatabase sQLiteDatabase = yrVar.b;
                int i15 = 0;
                while (i15 < arrayList.size()) {
                    TL_stories.PeerStories peerStories = (TL_stories.PeerStories) arrayList.get(i15);
                    long o4 = org.telegram.messenger.m5.o(peerStories.peer);
                    try {
                        ArrayList<TL_stories.StoryItem> arrayList2 = peerStories.stories;
                        for (int i16 = i12; i16 < arrayList2.size(); i16++) {
                            if (arrayList2.get(i16) instanceof TL_stories.TL_storyItemSkipped) {
                                TL_stories.StoryItem f10 = m7Var.f(arrayList2.get(i16).id, o4);
                                if (f10 instanceof TL_stories.TL_storyItem) {
                                    arrayList2.set(i16, f10);
                                }
                            }
                        }
                    } catch (Exception e10) {
                        org.telegram.messenger.a8.g(e10, true);
                    }
                    i15++;
                    i12 = 0;
                }
                if (!z10) {
                    try {
                        SQLiteCursor queryFinalized = sQLiteDatabase.queryFinalized("SELECT DISTINCT dialog_id FROM stories", new Object[0]);
                        ArrayList arrayList3 = new ArrayList();
                        while (queryFinalized.next()) {
                            long longValue = queryFinalized.longValue(0);
                            if (longValue > 0) {
                                TLRPC.User a22 = qp.s1(i14).a2(Long.valueOf(longValue));
                                if (a22 == null) {
                                    a22 = yr.a0(i14).j0(longValue);
                                }
                                if (a22 == null || (a22.stories_hidden == z9 && !arrayList3.contains(Long.valueOf(longValue)))) {
                                    arrayList3.add(Long.valueOf(longValue));
                                }
                            } else {
                                long j3 = -longValue;
                                TLRPC.Chat M0 = qp.s1(i14).M0(Long.valueOf(j3));
                                if (M0 == null) {
                                    M0 = yr.a0(i14).O(j3);
                                }
                                if (M0 == null || (M0.stories_hidden == z9 && !arrayList3.contains(Long.valueOf(longValue)))) {
                                    arrayList3.add(Long.valueOf(longValue));
                                }
                            }
                        }
                        if (org.telegram.messenger.r2.a) {
                            org.telegram.messenger.a8.b("StoriesStorage delete dialogs " + TextUtils.join(",", arrayList3));
                        }
                        Locale locale = Locale.US;
                        sQLiteDatabase.executeFast("DELETE FROM stories WHERE dialog_id IN(" + TextUtils.join(",", arrayList3) + ")").stepThis().dispose();
                    } catch (Throwable th2) {
                        yrVar.o(th2, true);
                    }
                }
                for (int i17 = 0; i17 < arrayList.size(); i17++) {
                    TL_stories.PeerStories peerStories2 = (TL_stories.PeerStories) arrayList.get(i17);
                    m7Var.g(org.telegram.messenger.m5.o(peerStories2.peer), peerStories2);
                }
                org.telegram.messenger.g0.h3(m0Var);
                break;
            case 2:
                ProfileActivity.Z((ProfileActivity) obj3, (TLRPC.User) obj2, (String) obj, z10, z9);
                break;
            case 3:
                final s11 s11Var = (s11) obj3;
                final String str = (String) obj2;
                String[] strArr = (String[]) obj;
                final LinkedHashSet linkedHashSet = new LinkedHashSet();
                final LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                final HashMap hashMap = ui.b0(s11Var.V).r;
                final ArrayList arrayList4 = new ArrayList();
                final ArrayList arrayList5 = new ArrayList();
                boolean d = org.telegram.messenger.i6.d(str);
                final ArrayList arrayList6 = new ArrayList();
                HashMap hashMap2 = new HashMap();
                final ArrayList arrayList7 = new ArrayList();
                final boolean z11 = this.b;
                final boolean z12 = this.c;
                c20 c20Var2 = new c20() { // from class: org.telegram.ui.a01
                    @Override // org.telegram.messenger.c20
                    public final void a(Object obj4) {
                        final s11 s11Var2 = s11.this;
                        final String str2 = str;
                        final boolean z13 = z11;
                        final ArrayList arrayList8 = arrayList4;
                        final HashMap hashMap3 = hashMap;
                        final ArrayList arrayList9 = arrayList5;
                        final LinkedHashSet linkedHashSet3 = linkedHashSet;
                        final LinkedHashSet linkedHashSet4 = linkedHashSet2;
                        final ArrayList arrayList10 = arrayList7;
                        final ArrayList arrayList11 = arrayList6;
                        final boolean z14 = z12;
                        org.telegram.messenger.g0.h3(new Runnable() { // from class: org.telegram.ui.e01
                            @Override // java.lang.Runnable
                            public final void run() {
                                s11 s11Var3 = s11.this;
                                wz0 wz0Var = s11Var3.J1;
                                if (wz0Var != null) {
                                    org.telegram.messenger.g0.r(wz0Var);
                                    s11Var3.J1 = null;
                                }
                                String str3 = s11Var3.A1;
                                String str4 = str2;
                                if (str4 != str3) {
                                    return;
                                }
                                s11Var3.z1 = true;
                                s11Var3.z(true, z13);
                                k01 k01Var = s11Var3.f0;
                                if (k01Var != null) {
                                    k01Var.d(true);
                                }
                                ArrayList arrayList12 = s11Var3.B1;
                                if (arrayList12 == null) {
                                    s11Var3.B1 = new ArrayList();
                                } else {
                                    arrayList12.clear();
                                }
                                ArrayList arrayList13 = s11Var3.E1;
                                if (arrayList13 == null) {
                                    s11Var3.E1 = new ArrayList();
                                } else {
                                    arrayList13.clear();
                                }
                                ArrayList arrayList14 = s11Var3.D1;
                                if (arrayList14 == null) {
                                    s11Var3.D1 = new ArrayList();
                                } else {
                                    arrayList14.clear();
                                }
                                ArrayList arrayList15 = s11Var3.C1;
                                if (arrayList15 == null) {
                                    s11Var3.C1 = new ArrayList();
                                } else {
                                    arrayList15.clear();
                                }
                                int i18 = 0;
                                s11Var3.i0.v0(0);
                                int i19 = s11Var3.W;
                                if (i19 == 1 || i19 == 14 || i19 == 11 || i19 == 2) {
                                    ArrayList arrayList16 = arrayList8;
                                    if (arrayList16.isEmpty()) {
                                        TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) hashMap3.get(str4);
                                        if (tL_availableReaction != null) {
                                            s11Var3.B1.add(ch.o0.c(tL_availableReaction));
                                        }
                                    } else {
                                        s11Var3.B1.addAll(arrayList16);
                                    }
                                    ArrayList arrayList17 = arrayList9;
                                    if (!arrayList17.isEmpty()) {
                                        s11Var3.C1.addAll(arrayList17);
                                    }
                                }
                                Iterator it = linkedHashSet3.iterator();
                                while (it.hasNext()) {
                                    Long l10 = (Long) it.next();
                                    l10.getClass();
                                    ArrayList arrayList18 = s11Var3.B1;
                                    ch.o0 o0Var = new ch.o0();
                                    long longValue2 = l10.longValue();
                                    o0Var.g = longValue2;
                                    o0Var.h = longValue2;
                                    arrayList18.add(o0Var);
                                }
                                Iterator it2 = linkedHashSet4.iterator();
                                while (it2.hasNext()) {
                                    s11Var3.B1.add(ch.o0.b((String) it2.next()));
                                }
                                s11Var3.E1.addAll(arrayList10);
                                ArrayList arrayList19 = arrayList11;
                                int size = arrayList19.size();
                                while (i18 < size) {
                                    Object obj5 = arrayList19.get(i18);
                                    i18++;
                                    s11Var3.D1.addAll((ArrayList) obj5);
                                }
                                s11Var3.q0.E(true ^ z14);
                            }
                        });
                    }
                };
                int i18 = s11Var.W;
                if (i18 == 13) {
                    Utilities.u(0, new c20() { // from class: org.telegram.ui.b01
                        @Override // org.telegram.messenger.c20
                        public final void a(Object obj4) {
                            switch (i12) {
                                case 0:
                                    s11 s11Var2 = s11Var;
                                    org.telegram.messenger.ui.b0(s11Var2.V).V(s11.b2, str, false, new nk0(12, linkedHashSet2, (Runnable) obj4), false, false, false, false, 0);
                                    break;
                                default:
                                    s11 s11Var3 = s11Var;
                                    String str2 = str;
                                    org.telegram.messenger.ui b02 = org.telegram.messenger.ui.b0(s11Var3.V);
                                    d01 d01Var = new d01(linkedHashSet2, (Runnable) obj4, 0);
                                    if (str2 != null) {
                                        Utilities.g.c(new org.telegram.messenger.em(str2, b02.s0(5), b02.s0[1], d01Var, 16));
                                        break;
                                    } else {
                                        d01Var.a(new ArrayList());
                                        break;
                                    }
                            }
                        }
                    }, c20Var2);
                    break;
                } else if (i18 == 14) {
                    if (d) {
                        final int i19 = 0;
                        c20Var = new c20() { // from class: org.telegram.ui.c01
                            @Override // org.telegram.messenger.c20
                            public final void a(Object obj4) {
                                switch (i19) {
                                    case 0:
                                        String str2 = str;
                                        Runnable runnable = (Runnable) obj4;
                                        TLRPC.messages_AvailableEffects E0 = org.telegram.messenger.qp.s1(s11Var.V).E0();
                                        if (E0 != null) {
                                            for (int i20 = 0; i20 < E0.effects.size(); i20++) {
                                                try {
                                                    TLRPC.TL_availableEffect tL_availableEffect = E0.effects.get(i20);
                                                    if (str2.contains(tL_availableEffect.emoticon)) {
                                                        (tL_availableEffect.effect_animation_id == 0 ? arrayList5 : arrayList4).add(ch.o0.e(tL_availableEffect));
                                                    }
                                                } catch (Exception unused) {
                                                }
                                            }
                                        }
                                        runnable.run();
                                        break;
                                    default:
                                        s11 s11Var2 = s11Var;
                                        org.telegram.messenger.ui.b0(s11Var2.V).V(s11.b2, str, false, new a1.d(s11Var2, arrayList5, arrayList4, (Runnable) obj4, 18), false, false, false, false, 0);
                                        break;
                                }
                            }
                        };
                    } else {
                        final int i20 = 1;
                        c20Var = new c20() { // from class: org.telegram.ui.c01
                            @Override // org.telegram.messenger.c20
                            public final void a(Object obj4) {
                                switch (i20) {
                                    case 0:
                                        String str2 = str;
                                        Runnable runnable = (Runnable) obj4;
                                        TLRPC.messages_AvailableEffects E0 = org.telegram.messenger.qp.s1(s11Var.V).E0();
                                        if (E0 != null) {
                                            for (int i202 = 0; i202 < E0.effects.size(); i202++) {
                                                try {
                                                    TLRPC.TL_availableEffect tL_availableEffect = E0.effects.get(i202);
                                                    if (str2.contains(tL_availableEffect.emoticon)) {
                                                        (tL_availableEffect.effect_animation_id == 0 ? arrayList5 : arrayList4).add(ch.o0.e(tL_availableEffect));
                                                    }
                                                } catch (Exception unused) {
                                                }
                                            }
                                        }
                                        runnable.run();
                                        break;
                                    default:
                                        s11 s11Var2 = s11Var;
                                        org.telegram.messenger.ui.b0(s11Var2.V).V(s11.b2, str, false, new a1.d(s11Var2, arrayList5, arrayList4, (Runnable) obj4, 18), false, false, false, false, 0);
                                        break;
                                }
                            }
                        };
                    }
                    Utilities.u(0, c20Var, c20Var2);
                    break;
                } else {
                    Utilities.u(0, new nb(d, str, linkedHashSet, i10), new c20() { // from class: org.telegram.ui.b01
                        @Override // org.telegram.messenger.c20
                        public final void a(Object obj4) {
                            switch (i11) {
                                case 0:
                                    s11 s11Var2 = s11Var;
                                    org.telegram.messenger.ui.b0(s11Var2.V).V(s11.b2, str, false, new nk0(12, linkedHashSet, (Runnable) obj4), false, false, false, false, 0);
                                    break;
                                default:
                                    s11 s11Var3 = s11Var;
                                    String str2 = str;
                                    org.telegram.messenger.ui b02 = org.telegram.messenger.ui.b0(s11Var3.V);
                                    d01 d01Var = new d01(linkedHashSet, (Runnable) obj4, 0);
                                    if (str2 != null) {
                                        Utilities.g.c(new org.telegram.messenger.em(str2, b02.s0(5), b02.s0[1], d01Var, 16));
                                        break;
                                    } else {
                                        d01Var.a(new ArrayList());
                                        break;
                                    }
                            }
                        }
                    }, new s2(s11Var, strArr, str, linkedHashSet, 12), new wt0(s11Var, d, linkedHashSet, str, hashMap, arrayList4), new s2((Object) s11Var, str, arrayList6, (Object) hashMap2, 13), new org.telegram.ui.y(s11Var, str, arrayList7, 12), c20Var2);
                    break;
                }
            case 4:
                p4.v vVar = (p4.v) obj;
                p4.d0 d0Var = ((p4.m0) ((m.c3) obj3).d).h;
                p4.g1 g1Var = d0Var.t;
                ab.b(g1Var, (p4.w) obj2);
                int i21 = g1Var.i();
                if (z10) {
                    if (i21 == 1) {
                        if (g1Var.p0(2)) {
                            g1Var.a();
                        }
                    } else if (i21 == 4 && g1Var.p0(4)) {
                        g1Var.G();
                    }
                }
                if (z9 && g1Var.p0(1)) {
                    g1Var.f();
                }
                SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
                for (int i22 : new int[]{31, 2}) {
                    ia.p(!false);
                    sparseBooleanArray.append(i22, true);
                }
                if (z9) {
                    ia.p(!false);
                    sparseBooleanArray.append(1, true);
                }
                ia.p(!false);
                d0Var.p(vVar);
                break;
            case 5:
                Runnable runnable = (Runnable) obj;
                ((sg.j0) obj3).l((sg.k0) obj2, z10, z9);
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            default:
                Bitmap[] bitmapArr = (Bitmap[]) obj2;
                CountDownLatch countDownLatch = (CountDownLatch) obj;
                sg.j0 j0Var = ((sg.t0) obj3).D.c;
                ot0 ot0Var = j0Var.g;
                sg.i0 h = j0Var.h(new RectF(0.0f, 0.0f, ot0Var.a, ot0Var.b), false, z10, z9);
                if (h != null) {
                    bitmapArr[0] = (Bitmap) h.b;
                }
                countDownLatch.countDown();
                break;
        }
    }

    public /* synthetic */ a6(Object obj, Object obj2, boolean z9, boolean z10, Object obj3, int i7) {
        this.a = i7;
        this.d = obj;
        this.e = obj2;
        this.b = z9;
        this.c = z10;
        this.f = obj3;
    }

    public /* synthetic */ a6(ProfileActivity profileActivity, TLRPC.User user, String str, boolean z9, boolean z10) {
        this.a = 2;
        this.d = profileActivity;
        this.e = user;
        this.f = str;
        this.b = z9;
        this.c = z10;
    }

    public /* synthetic */ a6(sg.t0 t0Var, boolean z9, boolean z10, Bitmap[] bitmapArr, CountDownLatch countDownLatch) {
        this.a = 6;
        this.d = t0Var;
        this.b = z9;
        this.c = z10;
        this.e = bitmapArr;
        this.f = countDownLatch;
    }
}
