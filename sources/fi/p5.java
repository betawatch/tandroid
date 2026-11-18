package fi;

import a8.la;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.text.TextUtils;
import android.util.SparseBooleanArray;
import c8.jb;
import hi.lb;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.concurrent.CountDownLatch;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.ks;
import org.telegram.messenger.mp;
import org.telegram.messenger.ri;
import org.telegram.messenger.tr;
import org.telegram.messenger.x10;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.vt0;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.r11;
import org.telegram.ui.ut0;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes4.dex */
public final /* synthetic */ class p5 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ p5(p6 p6Var, boolean z10, TL_stories.TL_stories_getAllStories tL_stories_getAllStories, TLObject tLObject, boolean z11) {
        this.a = 0;
        this.d = p6Var;
        this.b = z10;
        this.e = tL_stories_getAllStories;
        this.f = tLObject;
        this.c = z11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        x10 x10Var;
        int i7 = this.a;
        int i10 = 4;
        boolean z10 = this.c;
        boolean z11 = this.b;
        final int i11 = 1;
        Object obj = this.f;
        Object obj2 = this.e;
        Object obj3 = this.d;
        final int i12 = 0;
        switch (i7) {
            case 0:
                p6 p6Var = (p6) obj3;
                TL_stories.TL_stories_getAllStories tL_stories_getAllStories = (TL_stories.TL_stories_getAllStories) obj2;
                TLObject tLObject = (TLObject) obj;
                int i13 = p6Var.a;
                SharedPreferences sharedPreferences = p6Var.l;
                if (z11) {
                    p6Var.r = false;
                } else {
                    p6Var.q = false;
                }
                org.telegram.messenger.a8.b("StoriesController loaded stories from server state=" + tL_stories_getAllStories.state + " more=" + tL_stories_getAllStories.next + "  " + tLObject);
                if (tLObject instanceof TL_stories.TL_stories_allStories) {
                    TL_stories.TL_stories_allStories tL_stories_allStories = (TL_stories.TL_stories_allStories) tLObject;
                    tr.a0(i13).m1(tL_stories_allStories.users, null, true, true);
                    if (z11) {
                        p6Var.v = tL_stories_allStories.count;
                        p6Var.z = tL_stories_allStories.has_more;
                        p6Var.y = tL_stories_allStories.state;
                        sharedPreferences.edit().putString("last_stories_state_hidden", p6Var.y).putBoolean("last_stories_has_more_hidden", p6Var.z).putInt("total_stores_hidden", p6Var.v).apply();
                    } else {
                        p6Var.u = tL_stories_allStories.count;
                        p6Var.p = tL_stories_allStories.has_more;
                        p6Var.o = tL_stories_allStories.state;
                        sharedPreferences.edit().putString("last_stories_state", p6Var.o).putBoolean("last_stories_has_more", p6Var.p).putInt("total_stores", p6Var.u).apply();
                    }
                    p6Var.b0(tL_stories_allStories, z11, false, z10);
                    break;
                } else if (tLObject instanceof TL_stories.TL_stories_allStoriesNotModified) {
                    if (z11) {
                        p6Var.z = sharedPreferences.getBoolean("last_stories_has_more_hidden", false);
                        p6Var.y = ((TL_stories.TL_stories_allStoriesNotModified) tLObject).state;
                        sharedPreferences.edit().putString("last_stories_state_hidden", p6Var.y).apply();
                    } else {
                        p6Var.p = sharedPreferences.getBoolean("last_stories_has_more", false);
                        p6Var.o = ((TL_stories.TL_stories_allStoriesNotModified) tLObject).state;
                        sharedPreferences.edit().putString("last_stories_state", p6Var.o).apply();
                    }
                    if (z11 ? p6Var.z : p6Var.p) {
                        ks.f(i13).k(ks.y5, new Object[0]);
                        break;
                    }
                }
                break;
            case 1:
                c7 c7Var = (c7) obj3;
                ArrayList arrayList = (ArrayList) obj2;
                ai.o oVar = (ai.o) obj;
                int i14 = c7Var.a;
                tr trVar = c7Var.b;
                SQLiteDatabase sQLiteDatabase = trVar.b;
                int i15 = 0;
                while (i15 < arrayList.size()) {
                    TL_stories.PeerStories peerStories = (TL_stories.PeerStories) arrayList.get(i15);
                    long o4 = org.telegram.messenger.n5.o(peerStories.peer);
                    try {
                        ArrayList<TL_stories.StoryItem> arrayList2 = peerStories.stories;
                        for (int i16 = i12; i16 < arrayList2.size(); i16++) {
                            if (arrayList2.get(i16) instanceof TL_stories.TL_storyItemSkipped) {
                                TL_stories.StoryItem f10 = c7Var.f(arrayList2.get(i16).id, o4);
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
                if (!z11) {
                    try {
                        SQLiteCursor queryFinalized = sQLiteDatabase.queryFinalized("SELECT DISTINCT dialog_id FROM stories", new Object[0]);
                        ArrayList arrayList3 = new ArrayList();
                        while (queryFinalized.next()) {
                            long longValue = queryFinalized.longValue(0);
                            if (longValue > 0) {
                                TLRPC.User c22 = mp.u1(i14).c2(Long.valueOf(longValue));
                                if (c22 == null) {
                                    c22 = tr.a0(i14).j0(longValue);
                                }
                                if (c22 == null || (c22.stories_hidden == z10 && !arrayList3.contains(Long.valueOf(longValue)))) {
                                    arrayList3.add(Long.valueOf(longValue));
                                }
                            } else {
                                long j3 = -longValue;
                                TLRPC.Chat O0 = mp.u1(i14).O0(Long.valueOf(j3));
                                if (O0 == null) {
                                    O0 = tr.a0(i14).O(j3);
                                }
                                if (O0 == null || (O0.stories_hidden == z10 && !arrayList3.contains(Long.valueOf(longValue)))) {
                                    arrayList3.add(Long.valueOf(longValue));
                                }
                            }
                        }
                        if (org.telegram.messenger.s2.a) {
                            org.telegram.messenger.a8.b("StoriesStorage delete dialogs " + TextUtils.join(",", arrayList3));
                        }
                        Locale locale = Locale.US;
                        sQLiteDatabase.executeFast("DELETE FROM stories WHERE dialog_id IN(" + TextUtils.join(",", arrayList3) + ")").stepThis().dispose();
                    } catch (Throwable th2) {
                        trVar.o(th2, true);
                    }
                }
                for (int i17 = 0; i17 < arrayList.size(); i17++) {
                    TL_stories.PeerStories peerStories2 = (TL_stories.PeerStories) arrayList.get(i17);
                    c7Var.g(org.telegram.messenger.n5.o(peerStories2.peer), peerStories2);
                }
                org.telegram.messenger.g0.g3(oVar);
                break;
            case 2:
                ProfileActivity.Z((ProfileActivity) obj3, (TLRPC.User) obj2, (String) obj, z11, z10);
                break;
            case 3:
                final r11 r11Var = (r11) obj3;
                final String str = (String) obj2;
                String[] strArr = (String[]) obj;
                final LinkedHashSet linkedHashSet = new LinkedHashSet();
                final LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                final HashMap hashMap = ri.d0(r11Var.W).r;
                final ArrayList arrayList4 = new ArrayList();
                final ArrayList arrayList5 = new ArrayList();
                boolean d = org.telegram.messenger.j6.d(str);
                final ArrayList arrayList6 = new ArrayList();
                HashMap hashMap2 = new HashMap();
                final ArrayList arrayList7 = new ArrayList();
                final boolean z12 = this.b;
                final boolean z13 = this.c;
                x10 x10Var2 = new x10() { // from class: org.telegram.ui.zz0
                    @Override // org.telegram.messenger.x10
                    public final void a(Object obj4) {
                        final r11 r11Var2 = r11.this;
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
                        org.telegram.messenger.g0.g3(new Runnable() { // from class: org.telegram.ui.d01
                            @Override // java.lang.Runnable
                            public final void run() {
                                r11 r11Var3 = r11.this;
                                vz0 vz0Var = r11Var3.K1;
                                if (vz0Var != null) {
                                    org.telegram.messenger.g0.r(vz0Var);
                                    r11Var3.K1 = null;
                                }
                                String str3 = r11Var3.B1;
                                String str4 = str2;
                                if (str4 != str3) {
                                    return;
                                }
                                r11Var3.A1 = true;
                                r11Var3.z(true, z14);
                                j01 j01Var = r11Var3.g0;
                                if (j01Var != null) {
                                    j01Var.d(true);
                                }
                                ArrayList arrayList12 = r11Var3.C1;
                                if (arrayList12 == null) {
                                    r11Var3.C1 = new ArrayList();
                                } else {
                                    arrayList12.clear();
                                }
                                ArrayList arrayList13 = r11Var3.F1;
                                if (arrayList13 == null) {
                                    r11Var3.F1 = new ArrayList();
                                } else {
                                    arrayList13.clear();
                                }
                                ArrayList arrayList14 = r11Var3.E1;
                                if (arrayList14 == null) {
                                    r11Var3.E1 = new ArrayList();
                                } else {
                                    arrayList14.clear();
                                }
                                ArrayList arrayList15 = r11Var3.D1;
                                if (arrayList15 == null) {
                                    r11Var3.D1 = new ArrayList();
                                } else {
                                    arrayList15.clear();
                                }
                                int i18 = 0;
                                r11Var3.j0.v0(0);
                                int i19 = r11Var3.a0;
                                if (i19 == 1 || i19 == 14 || i19 == 11 || i19 == 2) {
                                    ArrayList arrayList16 = arrayList8;
                                    if (arrayList16.isEmpty()) {
                                        TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) hashMap3.get(str4);
                                        if (tL_availableReaction != null) {
                                            r11Var3.C1.add(ch.p0.c(tL_availableReaction));
                                        }
                                    } else {
                                        r11Var3.C1.addAll(arrayList16);
                                    }
                                    ArrayList arrayList17 = arrayList9;
                                    if (!arrayList17.isEmpty()) {
                                        r11Var3.D1.addAll(arrayList17);
                                    }
                                }
                                Iterator it = linkedHashSet3.iterator();
                                while (it.hasNext()) {
                                    Long l10 = (Long) it.next();
                                    l10.getClass();
                                    ArrayList arrayList18 = r11Var3.C1;
                                    ch.p0 p0Var = new ch.p0();
                                    long longValue2 = l10.longValue();
                                    p0Var.g = longValue2;
                                    p0Var.h = longValue2;
                                    arrayList18.add(p0Var);
                                }
                                Iterator it2 = linkedHashSet4.iterator();
                                while (it2.hasNext()) {
                                    r11Var3.C1.add(ch.p0.b((String) it2.next()));
                                }
                                r11Var3.F1.addAll(arrayList10);
                                ArrayList arrayList19 = arrayList11;
                                int size = arrayList19.size();
                                while (i18 < size) {
                                    Object obj5 = arrayList19.get(i18);
                                    i18++;
                                    r11Var3.E1.addAll((ArrayList) obj5);
                                }
                                r11Var3.r0.E(true ^ z15);
                            }
                        });
                    }
                };
                int i18 = r11Var.a0;
                if (i18 == 13) {
                    Utilities.u(0, new x10() { // from class: org.telegram.ui.a01
                        @Override // org.telegram.messenger.x10
                        public final void a(Object obj4) {
                            switch (i12) {
                                case 0:
                                    r11 r11Var2 = r11Var;
                                    org.telegram.messenger.ri.d0(r11Var2.W).X(r11.c2, str, false, new aj0(15, linkedHashSet2, (Runnable) obj4), false, false, false, false, 0);
                                    break;
                                default:
                                    r11 r11Var3 = r11Var;
                                    String str2 = str;
                                    org.telegram.messenger.ri d02 = org.telegram.messenger.ri.d0(r11Var3.W);
                                    c01 c01Var = new c01(linkedHashSet2, (Runnable) obj4, 0);
                                    if (str2 != null) {
                                        Utilities.g.c(new org.telegram.messenger.tl(str2, d02.u0(5), d02.t0[1], c01Var, 16));
                                        break;
                                    } else {
                                        c01Var.a(new ArrayList());
                                        break;
                                    }
                            }
                        }
                    }, x10Var2);
                    break;
                } else if (i18 == 14) {
                    if (d) {
                        final int i19 = 0;
                        x10Var = new x10() { // from class: org.telegram.ui.b01
                            @Override // org.telegram.messenger.x10
                            public final void a(Object obj4) {
                                switch (i19) {
                                    case 0:
                                        String str2 = str;
                                        Runnable runnable = (Runnable) obj4;
                                        TLRPC.messages_AvailableEffects G0 = org.telegram.messenger.mp.u1(r11Var.W).G0();
                                        if (G0 != null) {
                                            for (int i20 = 0; i20 < G0.effects.size(); i20++) {
                                                try {
                                                    TLRPC.TL_availableEffect tL_availableEffect = G0.effects.get(i20);
                                                    if (str2.contains(tL_availableEffect.emoticon)) {
                                                        (tL_availableEffect.effect_animation_id == 0 ? arrayList5 : arrayList4).add(ch.p0.e(tL_availableEffect));
                                                    }
                                                } catch (Exception unused) {
                                                }
                                            }
                                        }
                                        runnable.run();
                                        break;
                                    default:
                                        r11 r11Var2 = r11Var;
                                        org.telegram.messenger.ri.d0(r11Var2.W).X(r11.c2, str, false, new a1.d(r11Var2, arrayList5, arrayList4, (Runnable) obj4, 18), false, false, false, false, 0);
                                        break;
                                }
                            }
                        };
                    } else {
                        final int i20 = 1;
                        x10Var = new x10() { // from class: org.telegram.ui.b01
                            @Override // org.telegram.messenger.x10
                            public final void a(Object obj4) {
                                switch (i20) {
                                    case 0:
                                        String str2 = str;
                                        Runnable runnable = (Runnable) obj4;
                                        TLRPC.messages_AvailableEffects G0 = org.telegram.messenger.mp.u1(r11Var.W).G0();
                                        if (G0 != null) {
                                            for (int i202 = 0; i202 < G0.effects.size(); i202++) {
                                                try {
                                                    TLRPC.TL_availableEffect tL_availableEffect = G0.effects.get(i202);
                                                    if (str2.contains(tL_availableEffect.emoticon)) {
                                                        (tL_availableEffect.effect_animation_id == 0 ? arrayList5 : arrayList4).add(ch.p0.e(tL_availableEffect));
                                                    }
                                                } catch (Exception unused) {
                                                }
                                            }
                                        }
                                        runnable.run();
                                        break;
                                    default:
                                        r11 r11Var2 = r11Var;
                                        org.telegram.messenger.ri.d0(r11Var2.W).X(r11.c2, str, false, new a1.d(r11Var2, arrayList5, arrayList4, (Runnable) obj4, 18), false, false, false, false, 0);
                                        break;
                                }
                            }
                        };
                    }
                    Utilities.u(0, x10Var, x10Var2);
                    break;
                } else {
                    Utilities.u(0, new lb(d, str, linkedHashSet, i10), new x10() { // from class: org.telegram.ui.a01
                        @Override // org.telegram.messenger.x10
                        public final void a(Object obj4) {
                            switch (i11) {
                                case 0:
                                    r11 r11Var2 = r11Var;
                                    org.telegram.messenger.ri.d0(r11Var2.W).X(r11.c2, str, false, new aj0(15, linkedHashSet, (Runnable) obj4), false, false, false, false, 0);
                                    break;
                                default:
                                    r11 r11Var3 = r11Var;
                                    String str2 = str;
                                    org.telegram.messenger.ri d02 = org.telegram.messenger.ri.d0(r11Var3.W);
                                    c01 c01Var = new c01(linkedHashSet, (Runnable) obj4, 0);
                                    if (str2 != null) {
                                        Utilities.g.c(new org.telegram.messenger.tl(str2, d02.u0(5), d02.t0[1], c01Var, 16));
                                        break;
                                    } else {
                                        c01Var.a(new ArrayList());
                                        break;
                                    }
                            }
                        }
                    }, new bi.i2(r11Var, strArr, str, linkedHashSet, 13), new ut0(r11Var, d, linkedHashSet, str, hashMap, arrayList4), new bi.i2(r11Var, str, arrayList6, hashMap2, 14), new org.telegram.ui.x(r11Var, str, arrayList7, 12), x10Var2);
                    break;
                }
            case 4:
                p4.v vVar = (p4.v) obj;
                p4.d0 d0Var = ((p4.m0) ((m.b3) obj3).d).h;
                p4.i1 i1Var = d0Var.t;
                jb.b(i1Var, (p4.w) obj2);
                int i21 = i1Var.i();
                if (z11) {
                    if (i21 == 1) {
                        if (i1Var.p0(2)) {
                            i1Var.a();
                        }
                    } else if (i21 == 4 && i1Var.p0(4)) {
                        i1Var.G();
                    }
                }
                if (z10 && i1Var.p0(1)) {
                    i1Var.f();
                }
                SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
                for (int i22 : new int[]{31, 2}) {
                    la.p(!false);
                    sparseBooleanArray.append(i22, true);
                }
                if (z10) {
                    la.p(!false);
                    sparseBooleanArray.append(1, true);
                }
                la.p(!false);
                d0Var.p(vVar);
                break;
            case 5:
                Runnable runnable = (Runnable) obj;
                ((sg.i0) obj3).l((sg.j0) obj2, z11, z10);
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            default:
                Bitmap[] bitmapArr = (Bitmap[]) obj2;
                CountDownLatch countDownLatch = (CountDownLatch) obj;
                sg.i0 i0Var = ((sg.s0) obj3).E.c;
                vt0 vt0Var = i0Var.g;
                sg.h0 h = i0Var.h(new RectF(0.0f, 0.0f, vt0Var.a, vt0Var.b), false, z11, z10);
                if (h != null) {
                    bitmapArr[0] = (Bitmap) h.b;
                }
                countDownLatch.countDown();
                break;
        }
    }

    public /* synthetic */ p5(Object obj, Object obj2, boolean z10, boolean z11, Object obj3, int i7) {
        this.a = i7;
        this.d = obj;
        this.e = obj2;
        this.b = z10;
        this.c = z11;
        this.f = obj3;
    }

    public /* synthetic */ p5(ProfileActivity profileActivity, TLRPC.User user, String str, boolean z10, boolean z11) {
        this.a = 2;
        this.d = profileActivity;
        this.e = user;
        this.f = str;
        this.b = z10;
        this.c = z11;
    }

    public /* synthetic */ p5(sg.s0 s0Var, boolean z10, boolean z11, Bitmap[] bitmapArr, CountDownLatch countDownLatch) {
        this.a = 6;
        this.d = s0Var;
        this.b = z10;
        this.c = z11;
        this.e = bitmapArr;
        this.f = countDownLatch;
    }
}
