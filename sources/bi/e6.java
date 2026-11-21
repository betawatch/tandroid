package bi;

import android.graphics.Point;
import android.view.View;
import android.widget.LinearLayout;
import c8.ma;
import java.io.Serializable;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.gd;
import org.telegram.messenger.j10;
import org.telegram.messenger.mp;
import org.telegram.messenger.v10;
import org.telegram.messenger.w10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.a70;
import org.telegram.ui.Components.gq0;
import org.telegram.ui.Components.lc;
import org.telegram.ui.Components.o41;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final /* synthetic */ class e6 implements v10, w10 {
    public final /* synthetic */ n6 a;

    public /* synthetic */ e6(n6 n6Var) {
        this.a = n6Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x02b8  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x02cf  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x02d1  */
    /* JADX WARN: Type inference failed for: r0v69, types: [org.telegram.ui.Components.a70] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v26, types: [int] */
    /* JADX WARN: Type inference failed for: r7v7, types: [android.view.View, android.widget.ScrollView, bi.k6] */
    @Override // org.telegram.messenger.w10
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Boolean a(o41 o41Var, View view, Integer num, Float f10, Float f11) {
        boolean z10;
        n6 n6Var;
        ?? r42;
        g3 g3Var;
        final n6 n6Var2;
        final TL_stars.SavedStarGift savedStarGift;
        g3 g3Var2;
        String str;
        di.n8 n8Var;
        boolean z11;
        TL_stars.StarGift starGift;
        TL_stars.TL_starGiftUnique tL_starGiftUnique;
        String str2;
        String str3;
        int i7;
        boolean z12;
        Object obj;
        n6 n6Var3 = this.a;
        int i10 = n6Var3.b;
        gq0 gq0Var = n6Var3.a;
        boolean z13 = false;
        boolean z14 = false;
        boolean z15 = false;
        if (n6Var3.e != null) {
            if (view instanceof g3) {
                Object obj2 = o41Var.H;
                if (obj2 instanceof TL_stars.SavedStarGift) {
                    g3 g3Var3 = (g3) view;
                    TL_stars.SavedStarGift savedStarGift2 = (TL_stars.SavedStarGift) obj2;
                    org.telegram.ui.ActionBar.g2 g2Var = gq0Var.a;
                    di.n8 n8Var2 = gq0Var.e;
                    a70 J = a70.J(g2Var, view);
                    gq0Var.J = J;
                    if (n8Var2.h()) {
                        if (!n6Var3.d) {
                            n8Var2.d().size();
                        }
                        ?? K = J.K();
                        K.c(R.drawable.ic_ab_back, gd.N0(2131753753, null), new f6(J, z15 ? 1 : 0), false);
                        K.k();
                        ?? k6Var = new k6(n6Var3.getContext(), z14 ? 1 : 0);
                        LinearLayout linearLayout = new LinearLayout(n6Var3.getContext());
                        k6Var.addView(linearLayout);
                        linearLayout.setOrientation(1);
                        boolean z16 = true;
                        K.r(k6Var, ma.o(-1, -2));
                        if (n8Var2.d().size() + 1 < ((org.telegram.messenger.j0) mp.u1(i10).A7.y.b).c) {
                            org.telegram.ui.ActionBar.y0 y0Var = new org.telegram.ui.ActionBar.y0(0, n6Var3.getContext(), n6Var3.c, false, false);
                            y0Var.setPadding(org.telegram.messenger.g0.L(18.0f), 0, org.telegram.messenger.g0.L(18.0f), 0);
                            int i11 = org.telegram.ui.ActionBar.m6.E8;
                            y0Var.c(i11, org.telegram.ui.ActionBar.m6.F8);
                            y0Var.h(0.12f, i11);
                            y0Var.j(gd.N0(2131750081, null), R.drawable.menu_folder_add, null);
                            y0Var.setOnClickListener(new ah.h(n6Var3, J, savedStarGift2, 5));
                            linearLayout.addView(y0Var, ma.o(-1, -2));
                        }
                        ArrayList d = n8Var2.d();
                        int size = d.size();
                        int i12 = 0;
                        LinearLayout linearLayout2 = linearLayout;
                        while (i12 < size) {
                            int i13 = i12 + 1;
                            TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) d.get(i12);
                            ArrayList arrayList = n8Var2.e(tL_starGiftCollection.collection_id).l;
                            int size2 = arrayList.size();
                            g3 g3Var4 = g3Var3;
                            int i14 = 0;
                            while (true) {
                                if (i14 >= size2) {
                                    z12 = false;
                                    break;
                                }
                                Object obj3 = arrayList.get(i14);
                                i14++;
                                int i15 = size2;
                                if (di.y8.k((TL_stars.SavedStarGift) obj3, savedStarGift2)) {
                                    z12 = z16;
                                    break;
                                }
                                size2 = i15;
                            }
                            org.telegram.ui.ActionBar.y0 y0Var2 = new org.telegram.ui.ActionBar.y0(2, n6Var3.getContext(), n6Var3.c, false, false);
                            y0Var2.setChecked(z12);
                            n6 n6Var4 = n6Var3;
                            boolean z17 = z12;
                            y0Var2.setPadding(org.telegram.messenger.g0.L(18.0f), 0, org.telegram.messenger.g0.L(18.0f), 0);
                            int i16 = org.telegram.ui.ActionBar.m6.E8;
                            y0Var2.c(i16, org.telegram.ui.ActionBar.m6.F8);
                            y0Var2.h(0.12f, i16);
                            if (tL_starGiftCollection.icon != null) {
                                l6 l6Var = new l6(3, i10, tL_starGiftCollection.icon);
                                y0Var2.getImageView().addOnAttachStateChangeListener(new v2(l6Var, 10));
                                y0Var2.j(tL_starGiftCollection.title, 0, l6Var);
                                obj = null;
                            } else {
                                obj = null;
                                y0Var2.j(tL_starGiftCollection.title, R.drawable.msg_folders, null);
                            }
                            ArrayList arrayList2 = d;
                            LinearLayout linearLayout3 = linearLayout2;
                            y0Var2.setOnClickListener(new x5(n6Var4, z17, tL_starGiftCollection, savedStarGift2, J, 0));
                            linearLayout3.addView(y0Var2, ma.o(-1, -2));
                            d = arrayList2;
                            n6Var3 = n6Var4;
                            size = size;
                            i12 = i13;
                            g3Var3 = g3Var4;
                            z16 = true;
                            linearLayout2 = linearLayout3;
                        }
                        n6Var = n6Var3;
                        g3Var = g3Var3;
                        r42 = 0;
                        J.c(R.drawable.msg_addfolder, gd.N0(2131750378, null), new y5(J, K, r42), false);
                        J.k();
                    } else {
                        n6Var = n6Var3;
                        r42 = 0;
                        g3Var = g3Var3;
                    }
                    if (savedStarGift2.gift instanceof TL_stars.TL_starGiftUnique) {
                        if (!gq0Var.c() || n6Var.d || (savedStarGift2.unsaved && savedStarGift2.pinned_to_top)) {
                            n6Var2 = n6Var;
                            savedStarGift = savedStarGift2;
                            g3Var2 = g3Var;
                            str = null;
                            z10 = r42;
                            n8Var = n8Var2;
                            if (gq0Var.c() && n6Var2.d) {
                                J.c(R.drawable.tabs_reorder, gd.N0(2131750016, null), new z5(n6Var2, 1), z10);
                                starGift = savedStarGift.gift;
                                tL_starGiftUnique = (TL_stars.TL_starGiftUnique) starGift;
                                if (starGift.slug == null) {
                                    str2 = mp.u1(i10).X2 + "/nft/" + savedStarGift.gift.slug;
                                } else {
                                    str2 = str;
                                }
                                if (di.f6.S1(i10, org.telegram.messenger.n5.o(tL_starGiftUnique.owner_id))) {
                                    boolean U1 = di.f6.U1(i10, tL_starGiftUnique);
                                    int i17 = U1 ? R.drawable.menu_takeoff : R.drawable.menu_wear;
                                    String N0 = gd.N0(U1 ? 2131749862 : 2131749825, str);
                                    final int i18 = z10 ? 1 : 0;
                                    J.c(i17, N0, new Runnable() { // from class: bi.a6
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            switch (i18) {
                                                case 0:
                                                    n6 n6Var5 = n6Var2;
                                                    m6 m6Var = new m6(n6Var5, n6Var5.getContext(), n6Var5.b, n6Var5.a.c, n6Var5.c, 0);
                                                    m6Var.w2(savedStarGift, null);
                                                    m6Var.I2(false);
                                                    break;
                                                case 1:
                                                    n6 n6Var6 = n6Var2;
                                                    m6 m6Var2 = new m6(n6Var6, n6Var6.getContext(), n6Var6.b, n6Var6.a.c, n6Var6.c, 1);
                                                    m6Var2.w2(savedStarGift, null);
                                                    m6Var2.W1();
                                                    break;
                                                default:
                                                    n6 n6Var7 = n6Var2;
                                                    m6 m6Var3 = new m6(n6Var7, n6Var7.getContext(), n6Var7.b, n6Var7.a.c, n6Var7.c, 2);
                                                    m6Var3.w2(savedStarGift, null);
                                                    m6Var3.j2();
                                                    break;
                                            }
                                        }
                                    }, z10);
                                }
                                J.l(R.drawable.msg_link2, gd.N0(2131751750, str), new a1.e(29, n6Var2, str2), str2 == null ? true : z10 ? 1 : 0);
                                final int i19 = 1;
                                J.l(R.drawable.msg_share, gd.N0(2131745263, str), new Runnable() { // from class: bi.a6
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i19) {
                                            case 0:
                                                n6 n6Var5 = n6Var2;
                                                m6 m6Var = new m6(n6Var5, n6Var5.getContext(), n6Var5.b, n6Var5.a.c, n6Var5.c, 0);
                                                m6Var.w2(savedStarGift, null);
                                                m6Var.I2(false);
                                                break;
                                            case 1:
                                                n6 n6Var6 = n6Var2;
                                                m6 m6Var2 = new m6(n6Var6, n6Var6.getContext(), n6Var6.b, n6Var6.a.c, n6Var6.c, 1);
                                                m6Var2.w2(savedStarGift, null);
                                                m6Var2.W1();
                                                break;
                                            default:
                                                n6 n6Var7 = n6Var2;
                                                m6 m6Var3 = new m6(n6Var7, n6Var7.getContext(), n6Var7.b, n6Var7.a.c, n6Var7.c, 2);
                                                m6Var3.w2(savedStarGift, null);
                                                m6Var3.j2();
                                                break;
                                        }
                                    }
                                }, str2 == null ? true : z10 ? 1 : 0);
                            }
                        } else {
                            boolean z18 = savedStarGift2.pinned_to_top;
                            int i20 = z18 ? R.drawable.msg_unpin : R.drawable.msg_pin;
                            if (z18) {
                                i7 = 2131749867;
                                str3 = null;
                            } else {
                                str3 = null;
                                i7 = 2131750061;
                            }
                            n8Var = n8Var2;
                            savedStarGift = savedStarGift2;
                            str = str3;
                            g3Var2 = g3Var;
                            n6Var2 = n6Var;
                            z10 = r42;
                            J.c(i20, gd.N0(i7, str3), new ai.r(n6Var2, savedStarGift, g3Var2, view, 2), z10);
                            J.l(R.drawable.tabs_reorder, gd.N0(2131750016, str), new z5(n6Var2, z10 ? 1 : 0), savedStarGift.pinned_to_top);
                        }
                        starGift = savedStarGift.gift;
                        tL_starGiftUnique = (TL_stars.TL_starGiftUnique) starGift;
                        if (starGift.slug == null) {
                        }
                        if (di.f6.S1(i10, org.telegram.messenger.n5.o(tL_starGiftUnique.owner_id))) {
                        }
                        J.l(R.drawable.msg_link2, gd.N0(2131751750, str), new a1.e(29, n6Var2, str2), str2 == null ? true : z10 ? 1 : 0);
                        final int i192 = 1;
                        J.l(R.drawable.msg_share, gd.N0(2131745263, str), new Runnable() { // from class: bi.a6
                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i192) {
                                    case 0:
                                        n6 n6Var5 = n6Var2;
                                        m6 m6Var = new m6(n6Var5, n6Var5.getContext(), n6Var5.b, n6Var5.a.c, n6Var5.c, 0);
                                        m6Var.w2(savedStarGift, null);
                                        m6Var.I2(false);
                                        break;
                                    case 1:
                                        n6 n6Var6 = n6Var2;
                                        m6 m6Var2 = new m6(n6Var6, n6Var6.getContext(), n6Var6.b, n6Var6.a.c, n6Var6.c, 1);
                                        m6Var2.w2(savedStarGift, null);
                                        m6Var2.W1();
                                        break;
                                    default:
                                        n6 n6Var7 = n6Var2;
                                        m6 m6Var3 = new m6(n6Var7, n6Var7.getContext(), n6Var7.b, n6Var7.a.c, n6Var7.c, 2);
                                        m6Var3.w2(savedStarGift, null);
                                        m6Var3.j2();
                                        break;
                                }
                            }
                        }, str2 == null ? true : z10 ? 1 : 0);
                    } else {
                        n6Var2 = n6Var;
                        savedStarGift = savedStarGift2;
                        g3Var2 = g3Var;
                        str = null;
                        z10 = r42;
                        n8Var = n8Var2;
                        if (gq0Var.c() && n6Var2.d) {
                            J.c(R.drawable.tabs_reorder, gd.N0(2131750016, null), new z5(n6Var2, 3), z10);
                        }
                    }
                    if (di.f6.S1(i10, gq0Var.c)) {
                        boolean z19 = savedStarGift.unsaved;
                        J.c(z19 ? R.drawable.msg_message : R.drawable.menu_hide_gift, gd.N0(z19 ? 2131749964 : 2131750170, str), new aa.r(n6Var2, savedStarGift, g3Var2, 13), z10);
                    }
                    TL_stars.StarGift starGift2 = savedStarGift.gift;
                    if (starGift2 instanceof TL_stars.TL_starGiftUnique) {
                        final int i21 = 2;
                        J.l(R.drawable.menu_transfer, gd.N0(2131749901, str), new Runnable() { // from class: bi.a6
                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i21) {
                                    case 0:
                                        n6 n6Var5 = n6Var2;
                                        m6 m6Var = new m6(n6Var5, n6Var5.getContext(), n6Var5.b, n6Var5.a.c, n6Var5.c, 0);
                                        m6Var.w2(savedStarGift, null);
                                        m6Var.I2(false);
                                        break;
                                    case 1:
                                        n6 n6Var6 = n6Var2;
                                        m6 m6Var2 = new m6(n6Var6, n6Var6.getContext(), n6Var6.b, n6Var6.a.c, n6Var6.c, 1);
                                        m6Var2.w2(savedStarGift, null);
                                        m6Var2.W1();
                                        break;
                                    default:
                                        n6 n6Var7 = n6Var2;
                                        m6 m6Var3 = new m6(n6Var7, n6Var7.getContext(), n6Var7.b, n6Var7.a.c, n6Var7.c, 2);
                                        m6Var3.w2(savedStarGift, null);
                                        m6Var3.j2();
                                        break;
                                }
                            }
                        }, org.telegram.messenger.n5.o(((TL_stars.TL_starGiftUnique) starGift2).owner_id) == j10.i(i10).e() ? true : z10 ? 1 : 0);
                    }
                    if (n8Var.h() && n6Var2.d) {
                        z11 = true;
                        J.c(R.drawable.msg_removefolder, gd.N0(2131750022, str), new aa.r(n6Var2, savedStarGift, J, 12), true);
                        J.F();
                        J.u();
                    } else {
                        z11 = true;
                    }
                    if (J.y() > 0) {
                        J.W(5);
                        J.u = z11;
                        J.v = z11;
                        J.L = z11;
                        Point point = org.telegram.messenger.g0.q;
                        int min = Math.min(point.x, point.y);
                        J.N = min - org.telegram.messenger.g0.L(32.0f);
                        J.O = (int) (min * 0.6f);
                        J.S = true;
                        J.Z = true;
                        J.a0();
                        g3Var2.E.getImageReceiver().P0(true);
                        z13 = true;
                    }
                    z13 = z10;
                }
            }
            z10 = false;
            z13 = z10;
        }
        return Boolean.valueOf(z13);
    }

    @Override // org.telegram.messenger.v10
    public void l(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        o41 o41Var = (o41) obj;
        n6 n6Var = this.a;
        gq0 gq0Var = n6Var.a;
        int i7 = n6Var.b;
        if (n6Var.e == null) {
            return;
        }
        Object obj3 = o41Var.H;
        if (obj3 instanceof TL_stars.SavedStarGift) {
            TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj3;
            if (!n6Var.h) {
                di.f6 f6Var = new di.f6(n6Var.getContext(), n6Var.b, gq0Var.c, n6Var.c, null);
                f6Var.j3 = new z5(n6Var, 2);
                f6Var.N2 = new ab.g(4, n6Var, savedStarGift);
                f6Var.w2(savedStarGift, n6Var.e);
                f6Var.show();
                return;
            }
            if (!n6Var.d && (savedStarGift.gift instanceof TL_stars.TL_starGiftUnique)) {
                boolean z10 = savedStarGift.pinned_to_top;
                boolean z11 = !z10;
                if (!z10 && savedStarGift.unsaved) {
                    savedStarGift.unsaved = false;
                    TL_stars.saveStarGift savestargift = new TL_stars.saveStarGift();
                    savestargift.stargift = n6Var.e.h(savedStarGift);
                    savestargift.unsave = savedStarGift.unsaved;
                    ConnectionsManager.getInstance(i7).sendRequest(savestargift, null, 64);
                }
                if (n6Var.e.q(savedStarGift, z11, true)) {
                    lc.b0(gq0Var.a).Q(R.raw.chats_infotip, 36, gd.H(',', "GiftsPinLimit", mp.u1(i7).N6)).j();
                }
                if (z10) {
                    return;
                }
                n6Var.f.v0(0);
            }
        }
    }
}
