package ei;

import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.text.TextUtils;
import android.util.SparseBooleanArray;
import b8.xe;
import b8.zb;
import gi.nb;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.concurrent.CountDownLatch;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.hp;
import org.telegram.messenger.hs;
import org.telegram.messenger.li;
import org.telegram.messenger.qr;
import org.telegram.messenger.u10;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.lt0;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.g11;
import org.telegram.ui.kt0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class a6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ a6(z6 z6Var, boolean z10, TL_stories.TL_stories_getAllStories tL_stories_getAllStories, TLObject tLObject, boolean z11) {
        this.a = 0;
        this.d = z6Var;
        this.b = z10;
        this.e = tL_stories_getAllStories;
        this.f = tLObject;
        this.c = z11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        u10 u10Var;
        int i3 = this.a;
        int i10 = 4;
        boolean z10 = this.c;
        boolean z11 = this.b;
        Object obj = this.f;
        Object obj2 = this.e;
        Object obj3 = this.d;
        final int i11 = 0;
        switch (i3) {
            case 0:
                z6 z6Var = (z6) obj3;
                TL_stories.TL_stories_getAllStories tL_stories_getAllStories = (TL_stories.TL_stories_getAllStories) obj2;
                TLObject tLObject = (TLObject) obj;
                int i12 = z6Var.a;
                SharedPreferences sharedPreferences = z6Var.l;
                if (z11) {
                    z6Var.r = false;
                } else {
                    z6Var.q = false;
                }
                org.telegram.messenger.a8.b("StoriesController loaded stories from server state=" + tL_stories_getAllStories.state + " more=" + tL_stories_getAllStories.next + "  " + tLObject);
                if (tLObject instanceof TL_stories.TL_stories_allStories) {
                    TL_stories.TL_stories_allStories tL_stories_allStories = (TL_stories.TL_stories_allStories) tLObject;
                    qr.a0(i12).m1(tL_stories_allStories.users, null, true, true);
                    if (z11) {
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
                    z6Var.b0(tL_stories_allStories, z11, false, z10);
                    break;
                } else if (tLObject instanceof TL_stories.TL_stories_allStoriesNotModified) {
                    if (z11) {
                        z6Var.z = sharedPreferences.getBoolean("last_stories_has_more_hidden", false);
                        z6Var.y = ((TL_stories.TL_stories_allStoriesNotModified) tLObject).state;
                        sharedPreferences.edit().putString("last_stories_state_hidden", z6Var.y).apply();
                    } else {
                        z6Var.p = sharedPreferences.getBoolean("last_stories_has_more", false);
                        z6Var.o = ((TL_stories.TL_stories_allStoriesNotModified) tLObject).state;
                        sharedPreferences.edit().putString("last_stories_state", z6Var.o).apply();
                    }
                    if (z11 ? z6Var.z : z6Var.p) {
                        hs.f(i12).k(hs.v5, new Object[0]);
                        break;
                    }
                }
                break;
            case 1:
                m7 m7Var = (m7) obj3;
                ArrayList arrayList = (ArrayList) obj2;
                ai.y1 y1Var = (ai.y1) obj;
                int i13 = m7Var.a;
                qr qrVar = m7Var.b;
                SQLiteDatabase sQLiteDatabase = qrVar.b;
                int i14 = 0;
                while (i14 < arrayList.size()) {
                    TL_stories.PeerStories peerStories = (TL_stories.PeerStories) arrayList.get(i14);
                    long o10 = org.telegram.messenger.m5.o(peerStories.peer);
                    try {
                        ArrayList<TL_stories.StoryItem> arrayList2 = peerStories.stories;
                        for (int i15 = i11; i15 < arrayList2.size(); i15++) {
                            if (arrayList2.get(i15) instanceof TL_stories.TL_storyItemSkipped) {
                                TL_stories.StoryItem f10 = m7Var.f(arrayList2.get(i15).id, o10);
                                if (f10 instanceof TL_stories.TL_storyItem) {
                                    arrayList2.set(i15, f10);
                                }
                            }
                        }
                    } catch (Exception e10) {
                        org.telegram.messenger.a8.g(e10, true);
                    }
                    i14++;
                    i11 = 0;
                }
                if (!z11) {
                    try {
                        SQLiteCursor queryFinalized = sQLiteDatabase.queryFinalized("SELECT DISTINCT dialog_id FROM stories", new Object[0]);
                        ArrayList arrayList3 = new ArrayList();
                        while (queryFinalized.next()) {
                            long longValue = queryFinalized.longValue(0);
                            if (longValue > 0) {
                                TLRPC.User a22 = hp.s1(i13).a2(Long.valueOf(longValue));
                                if (a22 == null) {
                                    a22 = qr.a0(i13).j0(longValue);
                                }
                                if (a22 == null || (a22.stories_hidden == z10 && !arrayList3.contains(Long.valueOf(longValue)))) {
                                    arrayList3.add(Long.valueOf(longValue));
                                }
                            } else {
                                long j10 = -longValue;
                                TLRPC.Chat M0 = hp.s1(i13).M0(Long.valueOf(j10));
                                if (M0 == null) {
                                    M0 = qr.a0(i13).O(j10);
                                }
                                if (M0 == null || (M0.stories_hidden == z10 && !arrayList3.contains(Long.valueOf(longValue)))) {
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
                        qrVar.o(th2, true);
                    }
                }
                for (int i16 = 0; i16 < arrayList.size(); i16++) {
                    TL_stories.PeerStories peerStories2 = (TL_stories.PeerStories) arrayList.get(i16);
                    m7Var.g(org.telegram.messenger.m5.o(peerStories2.peer), peerStories2);
                }
                org.telegram.messenger.g0.h3(y1Var);
                break;
            case 2:
                o4.v vVar = (o4.v) obj;
                o4.e0 e0Var = ((o4.o0) ((m.b3) obj3).d).h;
                o4.l1 l1Var = e0Var.t;
                xe.b(l1Var, (o4.w) obj2);
                int h = l1Var.h();
                if (z11) {
                    if (h == 1) {
                        if (l1Var.m0(2)) {
                            l1Var.a();
                        }
                    } else if (h == 4 && l1Var.m0(4)) {
                        l1Var.F();
                    }
                }
                if (z10 && l1Var.m0(1)) {
                    l1Var.j();
                }
                SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
                for (int i17 : new int[]{31, 2}) {
                    zb.p(!false);
                    sparseBooleanArray.append(i17, true);
                }
                if (z10) {
                    zb.p(!false);
                    sparseBooleanArray.append(1, true);
                }
                zb.p(!false);
                e0Var.p(vVar);
                break;
            case 3:
                ProfileActivity.Z((ProfileActivity) obj3, (TLRPC.User) obj2, (String) obj, z11, z10);
                break;
            case 4:
                final g11 g11Var = (g11) obj3;
                final String str = (String) obj2;
                String[] strArr = (String[]) obj;
                final LinkedHashSet linkedHashSet = new LinkedHashSet();
                final LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                final HashMap hashMap = li.b0(g11Var.W).r;
                final ArrayList arrayList4 = new ArrayList();
                final ArrayList arrayList5 = new ArrayList();
                boolean d = org.telegram.messenger.i6.d(str);
                final ArrayList arrayList6 = new ArrayList();
                HashMap hashMap2 = new HashMap();
                final ArrayList arrayList7 = new ArrayList();
                final boolean z12 = this.b;
                final boolean z13 = this.c;
                u10 u10Var2 = new u10() { // from class: org.telegram.ui.oz0
                    @Override // org.telegram.messenger.u10
                    public final void a(Object obj4) {
                        final g11 g11Var2 = g11.this;
                        final String str2 = str;
                        final boolean z14 = z12;
                        final ArrayList arrayList8 = arrayList4;
                        final HashMap hashMap3 = hashMap;
                        final ArrayList arrayList9 = arrayList5;
                        final LinkedHashSet linkedHashSet3 = linkedHashSet;
                        final LinkedHashSet linkedHashSet4 = linkedHashSet2;
                        final ArrayList arrayList10 = arrayList7;
                        final ArrayList arrayList11 = arrayList6;
                        final boolean z15 = z13;
                        org.telegram.messenger.g0.h3(new Runnable() { // from class: org.telegram.ui.sz0
                            @Override // java.lang.Runnable
                            public final void run() {
                                g11 g11Var3 = g11.this;
                                kz0 kz0Var = g11Var3.K1;
                                if (kz0Var != null) {
                                    org.telegram.messenger.g0.r(kz0Var);
                                    g11Var3.K1 = null;
                                }
                                String str3 = g11Var3.B1;
                                String str4 = str2;
                                if (str4 != str3) {
                                    return;
                                }
                                g11Var3.A1 = true;
                                g11Var3.z(true, z14);
                                yz0 yz0Var = g11Var3.g0;
                                if (yz0Var != null) {
                                    yz0Var.d(true);
                                }
                                ArrayList arrayList12 = g11Var3.C1;
                                if (arrayList12 == null) {
                                    g11Var3.C1 = new ArrayList();
                                } else {
                                    arrayList12.clear();
                                }
                                ArrayList arrayList13 = g11Var3.F1;
                                if (arrayList13 == null) {
                                    g11Var3.F1 = new ArrayList();
                                } else {
                                    arrayList13.clear();
                                }
                                ArrayList arrayList14 = g11Var3.E1;
                                if (arrayList14 == null) {
                                    g11Var3.E1 = new ArrayList();
                                } else {
                                    arrayList14.clear();
                                }
                                ArrayList arrayList15 = g11Var3.D1;
                                if (arrayList15 == null) {
                                    g11Var3.D1 = new ArrayList();
                                } else {
                                    arrayList15.clear();
                                }
                                int i18 = 0;
                                g11Var3.j0.v0(0);
                                int i19 = g11Var3.a0;
                                if (i19 == 1 || i19 == 14 || i19 == 11 || i19 == 2) {
                                    ArrayList arrayList16 = arrayList8;
                                    if (arrayList16.isEmpty()) {
                                        TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) hashMap3.get(str4);
                                        if (tL_availableReaction != null) {
                                            g11Var3.C1.add(dh.n0.c(tL_availableReaction));
                                        }
                                    } else {
                                        g11Var3.C1.addAll(arrayList16);
                                    }
                                    ArrayList arrayList17 = arrayList9;
                                    if (!arrayList17.isEmpty()) {
                                        g11Var3.D1.addAll(arrayList17);
                                    }
                                }
                                Iterator it = linkedHashSet3.iterator();
                                while (it.hasNext()) {
                                    Long l10 = (Long) it.next();
                                    l10.getClass();
                                    ArrayList arrayList18 = g11Var3.C1;
                                    dh.n0 n0Var = new dh.n0();
                                    long longValue2 = l10.longValue();
                                    n0Var.g = longValue2;
                                    n0Var.h = longValue2;
                                    arrayList18.add(n0Var);
                                }
                                Iterator it2 = linkedHashSet4.iterator();
                                while (it2.hasNext()) {
                                    g11Var3.C1.add(dh.n0.b((String) it2.next()));
                                }
                                g11Var3.F1.addAll(arrayList10);
                                ArrayList arrayList19 = arrayList11;
                                int size = arrayList19.size();
                                while (i18 < size) {
                                    Object obj5 = arrayList19.get(i18);
                                    i18++;
                                    g11Var3.E1.addAll((ArrayList) obj5);
                                }
                                g11Var3.r0.E(true ^ z15);
                            }
                        });
                    }
                };
                int i18 = g11Var.a0;
                final int i19 = 1;
                if (i18 == 13) {
                    Utilities.u(0, new u10() { // from class: org.telegram.ui.pz0
                        @Override // org.telegram.messenger.u10
                        public final void a(Object obj4) {
                            switch (i11) {
                                case 0:
                                    g11 g11Var2 = g11Var;
                                    org.telegram.messenger.li.b0(g11Var2.W).V(g11.c2, str, false, new rb0(20, linkedHashSet2, (Runnable) obj4), false, false, false, false, 0);
                                    break;
                                default:
                                    g11 g11Var3 = g11Var;
                                    String str2 = str;
                                    org.telegram.messenger.li b02 = org.telegram.messenger.li.b0(g11Var3.W);
                                    rz0 rz0Var = new rz0(linkedHashSet2, (Runnable) obj4, 0);
                                    if (str2 != null) {
                                        Utilities.g.c(new org.telegram.messenger.ul(str2, b02.s0(5), b02.t0[1], rz0Var, 16));
                                        break;
                                    } else {
                                        rz0Var.a(new ArrayList());
                                        break;
                                    }
                            }
                        }
                    }, u10Var2);
                    break;
                } else if (i18 == 14) {
                    if (d) {
                        final int i20 = 0;
                        u10Var = new u10() { // from class: org.telegram.ui.qz0
                            @Override // org.telegram.messenger.u10
                            public final void a(Object obj4) {
                                switch (i20) {
                                    case 0:
                                        String str2 = str;
                                        Runnable runnable = (Runnable) obj4;
                                        TLRPC.messages_AvailableEffects E0 = org.telegram.messenger.hp.s1(g11Var.W).E0();
                                        if (E0 != null) {
                                            for (int i21 = 0; i21 < E0.effects.size(); i21++) {
                                                try {
                                                    TLRPC.TL_availableEffect tL_availableEffect = E0.effects.get(i21);
                                                    if (str2.contains(tL_availableEffect.emoticon)) {
                                                        (tL_availableEffect.effect_animation_id == 0 ? arrayList5 : arrayList4).add(dh.n0.e(tL_availableEffect));
                                                    }
                                                } catch (Exception unused) {
                                                }
                                            }
                                        }
                                        runnable.run();
                                        break;
                                    default:
                                        g11 g11Var2 = g11Var;
                                        org.telegram.messenger.li.b0(g11Var2.W).V(g11.c2, str, false, new a1.d(g11Var2, arrayList5, arrayList4, (Runnable) obj4, 17), false, false, false, false, 0);
                                        break;
                                }
                            }
                        };
                    } else {
                        final int i21 = 1;
                        u10Var = new u10() { // from class: org.telegram.ui.qz0
                            @Override // org.telegram.messenger.u10
                            public final void a(Object obj4) {
                                switch (i21) {
                                    case 0:
                                        String str2 = str;
                                        Runnable runnable = (Runnable) obj4;
                                        TLRPC.messages_AvailableEffects E0 = org.telegram.messenger.hp.s1(g11Var.W).E0();
                                        if (E0 != null) {
                                            for (int i212 = 0; i212 < E0.effects.size(); i212++) {
                                                try {
                                                    TLRPC.TL_availableEffect tL_availableEffect = E0.effects.get(i212);
                                                    if (str2.contains(tL_availableEffect.emoticon)) {
                                                        (tL_availableEffect.effect_animation_id == 0 ? arrayList5 : arrayList4).add(dh.n0.e(tL_availableEffect));
                                                    }
                                                } catch (Exception unused) {
                                                }
                                            }
                                        }
                                        runnable.run();
                                        break;
                                    default:
                                        g11 g11Var2 = g11Var;
                                        org.telegram.messenger.li.b0(g11Var2.W).V(g11.c2, str, false, new a1.d(g11Var2, arrayList5, arrayList4, (Runnable) obj4, 17), false, false, false, false, 0);
                                        break;
                                }
                            }
                        };
                    }
                    Utilities.u(0, u10Var, u10Var2);
                    break;
                } else {
                    Utilities.u(0, new nb(d, str, linkedHashSet, i10), new u10() { // from class: org.telegram.ui.pz0
                        @Override // org.telegram.messenger.u10
                        public final void a(Object obj4) {
                            switch (i19) {
                                case 0:
                                    g11 g11Var2 = g11Var;
                                    org.telegram.messenger.li.b0(g11Var2.W).V(g11.c2, str, false, new rb0(20, linkedHashSet, (Runnable) obj4), false, false, false, false, 0);
                                    break;
                                default:
                                    g11 g11Var3 = g11Var;
                                    String str2 = str;
                                    org.telegram.messenger.li b02 = org.telegram.messenger.li.b0(g11Var3.W);
                                    rz0 rz0Var = new rz0(linkedHashSet, (Runnable) obj4, 0);
                                    if (str2 != null) {
                                        Utilities.g.c(new org.telegram.messenger.ul(str2, b02.s0(5), b02.t0[1], rz0Var, 16));
                                        break;
                                    } else {
                                        rz0Var.a(new ArrayList());
                                        break;
                                    }
                            }
                        }
                    }, new ai.v1(g11Var, strArr, str, linkedHashSet, 13), new kt0(g11Var, d, linkedHashSet, str, hashMap, arrayList4), new ai.v1(g11Var, str, arrayList6, hashMap2, 14), new org.telegram.ui.z(g11Var, str, arrayList7, 12), u10Var2);
                    break;
                }
            case 5:
                Runnable runnable = (Runnable) obj;
                ((tg.i0) obj3).l((tg.j0) obj2, z11, z10);
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            default:
                Bitmap[] bitmapArr = (Bitmap[]) obj2;
                CountDownLatch countDownLatch = (CountDownLatch) obj;
                tg.i0 i0Var = ((tg.s0) obj3).E.c;
                lt0 lt0Var = i0Var.g;
                m2.t h7 = i0Var.h(new RectF(0.0f, 0.0f, lt0Var.a, lt0Var.b), false, z11, z10);
                if (h7 != null) {
                    bitmapArr[0] = (Bitmap) h7.b;
                }
                countDownLatch.countDown();
                break;
        }
    }

    public /* synthetic */ a6(Object obj, Object obj2, boolean z10, boolean z11, Object obj3, int i3) {
        this.a = i3;
        this.d = obj;
        this.e = obj2;
        this.b = z10;
        this.c = z11;
        this.f = obj3;
    }

    public /* synthetic */ a6(ProfileActivity profileActivity, TLRPC.User user, String str, boolean z10, boolean z11) {
        this.a = 3;
        this.d = profileActivity;
        this.e = user;
        this.f = str;
        this.b = z10;
        this.c = z11;
    }

    public /* synthetic */ a6(tg.s0 s0Var, boolean z10, boolean z11, Bitmap[] bitmapArr, CountDownLatch countDownLatch) {
        this.a = 6;
        this.d = s0Var;
        this.b = z10;
        this.c = z11;
        this.e = bitmapArr;
        this.f = countDownLatch;
    }
}
