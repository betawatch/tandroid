package bi;

import android.graphics.Point;
import android.view.View;
import android.widget.LinearLayout;
import c8.ja;
import di.k8;
import di.v8;
import java.io.Serializable;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.hd;
import org.telegram.messenger.m10;
import org.telegram.messenger.np;
import org.telegram.messenger.x10;
import org.telegram.messenger.y10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.b41;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.m60;
import org.telegram.ui.Components.wp0;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class t3 implements x10, y10 {
    public final /* synthetic */ c4 a;

    public /* synthetic */ t3(c4 c4Var) {
        this.a = c4Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x02b8  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x02cf  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x02d1  */
    /* JADX WARN: Type inference failed for: r0v69, types: [org.telegram.ui.Components.m60] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v26, types: [int] */
    /* JADX WARN: Type inference failed for: r7v7, types: [android.view.View, android.widget.ScrollView, bi.z3] */
    @Override // org.telegram.messenger.y10
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Boolean a(b41 b41Var, View view, Integer num, Float f10, Float f11) {
        boolean z10;
        c4 c4Var;
        ?? r42;
        i2 i2Var;
        final c4 c4Var2;
        final TL_stars.SavedStarGift savedStarGift;
        i2 i2Var2;
        String str;
        k8 k8Var;
        boolean z11;
        TL_stars.StarGift starGift;
        TL_stars.TL_starGiftUnique tL_starGiftUnique;
        String str2;
        String str3;
        int i7;
        boolean z12;
        Object obj;
        c4 c4Var3 = this.a;
        int i10 = c4Var3.b;
        wp0 wp0Var = c4Var3.a;
        boolean z13 = false;
        boolean z14 = false;
        boolean z15 = false;
        if (c4Var3.e != null) {
            if (view instanceof i2) {
                Object obj2 = b41Var.G;
                if (obj2 instanceof TL_stars.SavedStarGift) {
                    i2 i2Var3 = (i2) view;
                    TL_stars.SavedStarGift savedStarGift2 = (TL_stars.SavedStarGift) obj2;
                    org.telegram.ui.ActionBar.e2 e2Var = wp0Var.a;
                    k8 k8Var2 = wp0Var.e;
                    m60 I = m60.I(e2Var, view);
                    wp0Var.J = I;
                    if (k8Var2.h()) {
                        if (!c4Var3.d) {
                            k8Var2.d().size();
                        }
                        ?? J = I.J();
                        J.c(R.drawable.ic_ab_back, hd.M0(2131753756, null), new u3(I, z15 ? 1 : 0), false);
                        J.k();
                        ?? z3Var = new z3(c4Var3.getContext(), z14 ? 1 : 0);
                        LinearLayout linearLayout = new LinearLayout(c4Var3.getContext());
                        z3Var.addView(linearLayout);
                        linearLayout.setOrientation(1);
                        boolean z16 = true;
                        J.r(z3Var, ja.o(-1, -2));
                        if (k8Var2.d().size() + 1 < ((org.telegram.messenger.j0) np.s1(i10).y7.t.b).c) {
                            org.telegram.ui.ActionBar.z0 z0Var = new org.telegram.ui.ActionBar.z0(0, c4Var3.getContext(), c4Var3.c, false, false);
                            z0Var.setPadding(org.telegram.messenger.g0.L(18.0f), 0, org.telegram.messenger.g0.L(18.0f), 0);
                            int i11 = org.telegram.ui.ActionBar.j6.E8;
                            z0Var.c(i11, org.telegram.ui.ActionBar.j6.F8);
                            z0Var.h(0.12f, i11);
                            z0Var.j(hd.M0(2131750098, null), R.drawable.menu_folder_add, null);
                            z0Var.setOnClickListener(new ah.g(c4Var3, I, savedStarGift2, 5));
                            linearLayout.addView(z0Var, ja.o(-1, -2));
                        }
                        ArrayList d = k8Var2.d();
                        int size = d.size();
                        int i12 = 0;
                        LinearLayout linearLayout2 = linearLayout;
                        while (i12 < size) {
                            int i13 = i12 + 1;
                            TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) d.get(i12);
                            ArrayList arrayList = k8Var2.e(tL_starGiftCollection.collection_id).l;
                            int size2 = arrayList.size();
                            i2 i2Var4 = i2Var3;
                            int i14 = 0;
                            while (true) {
                                if (i14 >= size2) {
                                    z12 = false;
                                    break;
                                }
                                Object obj3 = arrayList.get(i14);
                                i14++;
                                int i15 = size2;
                                if (v8.k((TL_stars.SavedStarGift) obj3, savedStarGift2)) {
                                    z12 = z16;
                                    break;
                                }
                                size2 = i15;
                            }
                            org.telegram.ui.ActionBar.z0 z0Var2 = new org.telegram.ui.ActionBar.z0(2, c4Var3.getContext(), c4Var3.c, false, false);
                            z0Var2.setChecked(z12);
                            c4 c4Var4 = c4Var3;
                            boolean z17 = z12;
                            z0Var2.setPadding(org.telegram.messenger.g0.L(18.0f), 0, org.telegram.messenger.g0.L(18.0f), 0);
                            int i16 = org.telegram.ui.ActionBar.j6.E8;
                            z0Var2.c(i16, org.telegram.ui.ActionBar.j6.F8);
                            z0Var2.h(0.12f, i16);
                            if (tL_starGiftCollection.icon != null) {
                                a4 a4Var = new a4(3, i10, tL_starGiftCollection.icon);
                                z0Var2.getImageView().addOnAttachStateChangeListener(new x1(a4Var, 10));
                                z0Var2.j(tL_starGiftCollection.title, 0, a4Var);
                                obj = null;
                            } else {
                                obj = null;
                                z0Var2.j(tL_starGiftCollection.title, R.drawable.msg_folders, null);
                            }
                            ArrayList arrayList2 = d;
                            LinearLayout linearLayout3 = linearLayout2;
                            z0Var2.setOnClickListener(new m3(c4Var4, z17, tL_starGiftCollection, savedStarGift2, I, 0));
                            linearLayout3.addView(z0Var2, ja.o(-1, -2));
                            d = arrayList2;
                            c4Var3 = c4Var4;
                            size = size;
                            i12 = i13;
                            i2Var3 = i2Var4;
                            z16 = true;
                            linearLayout2 = linearLayout3;
                        }
                        c4Var = c4Var3;
                        i2Var = i2Var3;
                        r42 = 0;
                        I.c(R.drawable.msg_addfolder, hd.M0(2131750395, null), new n3(I, J, r42), false);
                        I.k();
                    } else {
                        c4Var = c4Var3;
                        r42 = 0;
                        i2Var = i2Var3;
                    }
                    if (savedStarGift2.gift instanceof TL_stars.TL_starGiftUnique) {
                        if (!wp0Var.c() || c4Var.d || (savedStarGift2.unsaved && savedStarGift2.pinned_to_top)) {
                            c4Var2 = c4Var;
                            savedStarGift = savedStarGift2;
                            i2Var2 = i2Var;
                            str = null;
                            z10 = r42;
                            k8Var = k8Var2;
                            if (wp0Var.c() && c4Var2.d) {
                                I.c(R.drawable.tabs_reorder, hd.M0(2131750033, null), new o3(c4Var2, 1), z10);
                                starGift = savedStarGift.gift;
                                tL_starGiftUnique = (TL_stars.TL_starGiftUnique) starGift;
                                if (starGift.slug == null) {
                                    str2 = np.s1(i10).V2 + "/nft/" + savedStarGift.gift.slug;
                                } else {
                                    str2 = str;
                                }
                                if (di.c6.L1(i10, org.telegram.messenger.m5.o(tL_starGiftUnique.owner_id))) {
                                    boolean M1 = di.c6.M1(i10, tL_starGiftUnique);
                                    int i17 = M1 ? R.drawable.menu_takeoff : R.drawable.menu_wear;
                                    String M0 = hd.M0(M1 ? 2131749879 : 2131749842, str);
                                    final int i18 = z10 ? 1 : 0;
                                    I.c(i17, M0, new Runnable() { // from class: bi.p3
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            switch (i18) {
                                                case 0:
                                                    c4 c4Var5 = c4Var2;
                                                    b4 b4Var = new b4(c4Var5, c4Var5.getContext(), c4Var5.b, c4Var5.a.c, c4Var5.c, 0);
                                                    b4Var.k2(savedStarGift, null);
                                                    b4Var.u2(false);
                                                    break;
                                                case 1:
                                                    c4 c4Var6 = c4Var2;
                                                    b4 b4Var2 = new b4(c4Var6, c4Var6.getContext(), c4Var6.b, c4Var6.a.c, c4Var6.c, 1);
                                                    b4Var2.k2(savedStarGift, null);
                                                    b4Var2.O1();
                                                    break;
                                                default:
                                                    c4 c4Var7 = c4Var2;
                                                    b4 b4Var3 = new b4(c4Var7, c4Var7.getContext(), c4Var7.b, c4Var7.a.c, c4Var7.c, 2);
                                                    b4Var3.k2(savedStarGift, null);
                                                    b4Var3.X1();
                                                    break;
                                            }
                                        }
                                    }, z10);
                                }
                                I.l(R.drawable.msg_link2, hd.M0(2131751762, str), new a1.e(28, c4Var2, str2), str2 == null ? true : z10 ? 1 : 0);
                                final int i19 = 1;
                                I.l(R.drawable.msg_share, hd.M0(2131745459, str), new Runnable() { // from class: bi.p3
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i19) {
                                            case 0:
                                                c4 c4Var5 = c4Var2;
                                                b4 b4Var = new b4(c4Var5, c4Var5.getContext(), c4Var5.b, c4Var5.a.c, c4Var5.c, 0);
                                                b4Var.k2(savedStarGift, null);
                                                b4Var.u2(false);
                                                break;
                                            case 1:
                                                c4 c4Var6 = c4Var2;
                                                b4 b4Var2 = new b4(c4Var6, c4Var6.getContext(), c4Var6.b, c4Var6.a.c, c4Var6.c, 1);
                                                b4Var2.k2(savedStarGift, null);
                                                b4Var2.O1();
                                                break;
                                            default:
                                                c4 c4Var7 = c4Var2;
                                                b4 b4Var3 = new b4(c4Var7, c4Var7.getContext(), c4Var7.b, c4Var7.a.c, c4Var7.c, 2);
                                                b4Var3.k2(savedStarGift, null);
                                                b4Var3.X1();
                                                break;
                                        }
                                    }
                                }, str2 == null ? true : z10 ? 1 : 0);
                            }
                        } else {
                            boolean z18 = savedStarGift2.pinned_to_top;
                            int i20 = z18 ? R.drawable.msg_unpin : R.drawable.msg_pin;
                            if (z18) {
                                i7 = 2131749884;
                                str3 = null;
                            } else {
                                str3 = null;
                                i7 = 2131750078;
                            }
                            k8Var = k8Var2;
                            savedStarGift = savedStarGift2;
                            str = str3;
                            i2Var2 = i2Var;
                            c4Var2 = c4Var;
                            z10 = r42;
                            I.c(i20, hd.M0(i7, str3), new androidx.car.app.utils.a(c4Var2, savedStarGift, i2Var2, view, 1), z10);
                            I.l(R.drawable.tabs_reorder, hd.M0(2131750033, str), new o3(c4Var2, z10 ? 1 : 0), savedStarGift.pinned_to_top);
                        }
                        starGift = savedStarGift.gift;
                        tL_starGiftUnique = (TL_stars.TL_starGiftUnique) starGift;
                        if (starGift.slug == null) {
                        }
                        if (di.c6.L1(i10, org.telegram.messenger.m5.o(tL_starGiftUnique.owner_id))) {
                        }
                        I.l(R.drawable.msg_link2, hd.M0(2131751762, str), new a1.e(28, c4Var2, str2), str2 == null ? true : z10 ? 1 : 0);
                        final int i192 = 1;
                        I.l(R.drawable.msg_share, hd.M0(2131745459, str), new Runnable() { // from class: bi.p3
                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i192) {
                                    case 0:
                                        c4 c4Var5 = c4Var2;
                                        b4 b4Var = new b4(c4Var5, c4Var5.getContext(), c4Var5.b, c4Var5.a.c, c4Var5.c, 0);
                                        b4Var.k2(savedStarGift, null);
                                        b4Var.u2(false);
                                        break;
                                    case 1:
                                        c4 c4Var6 = c4Var2;
                                        b4 b4Var2 = new b4(c4Var6, c4Var6.getContext(), c4Var6.b, c4Var6.a.c, c4Var6.c, 1);
                                        b4Var2.k2(savedStarGift, null);
                                        b4Var2.O1();
                                        break;
                                    default:
                                        c4 c4Var7 = c4Var2;
                                        b4 b4Var3 = new b4(c4Var7, c4Var7.getContext(), c4Var7.b, c4Var7.a.c, c4Var7.c, 2);
                                        b4Var3.k2(savedStarGift, null);
                                        b4Var3.X1();
                                        break;
                                }
                            }
                        }, str2 == null ? true : z10 ? 1 : 0);
                    } else {
                        c4Var2 = c4Var;
                        savedStarGift = savedStarGift2;
                        i2Var2 = i2Var;
                        str = null;
                        z10 = r42;
                        k8Var = k8Var2;
                        if (wp0Var.c() && c4Var2.d) {
                            I.c(R.drawable.tabs_reorder, hd.M0(2131750033, null), new o3(c4Var2, 3), z10);
                        }
                    }
                    if (di.c6.L1(i10, wp0Var.c)) {
                        boolean z19 = savedStarGift.unsaved;
                        I.c(z19 ? R.drawable.msg_message : R.drawable.menu_hide_gift, hd.M0(z19 ? 2131749981 : 2131750187, str), new aa.r(c4Var2, savedStarGift, i2Var2, 8), z10);
                    }
                    TL_stars.StarGift starGift2 = savedStarGift.gift;
                    if (starGift2 instanceof TL_stars.TL_starGiftUnique) {
                        final int i21 = 2;
                        I.l(R.drawable.menu_transfer, hd.M0(2131749918, str), new Runnable() { // from class: bi.p3
                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i21) {
                                    case 0:
                                        c4 c4Var5 = c4Var2;
                                        b4 b4Var = new b4(c4Var5, c4Var5.getContext(), c4Var5.b, c4Var5.a.c, c4Var5.c, 0);
                                        b4Var.k2(savedStarGift, null);
                                        b4Var.u2(false);
                                        break;
                                    case 1:
                                        c4 c4Var6 = c4Var2;
                                        b4 b4Var2 = new b4(c4Var6, c4Var6.getContext(), c4Var6.b, c4Var6.a.c, c4Var6.c, 1);
                                        b4Var2.k2(savedStarGift, null);
                                        b4Var2.O1();
                                        break;
                                    default:
                                        c4 c4Var7 = c4Var2;
                                        b4 b4Var3 = new b4(c4Var7, c4Var7.getContext(), c4Var7.b, c4Var7.a.c, c4Var7.c, 2);
                                        b4Var3.k2(savedStarGift, null);
                                        b4Var3.X1();
                                        break;
                                }
                            }
                        }, org.telegram.messenger.m5.o(((TL_stars.TL_starGiftUnique) starGift2).owner_id) == m10.i(i10).e() ? true : z10 ? 1 : 0);
                    }
                    if (k8Var.h() && c4Var2.d) {
                        z11 = true;
                        I.c(R.drawable.msg_removefolder, hd.M0(2131750039, str), new aa.r(c4Var2, savedStarGift, I, 7), true);
                        I.E();
                        I.t();
                    } else {
                        z11 = true;
                    }
                    if (I.x() > 0) {
                        I.V(5);
                        I.u = z11;
                        I.v = z11;
                        I.L = z11;
                        Point point = org.telegram.messenger.g0.q;
                        int min = Math.min(point.x, point.y);
                        I.N = min - org.telegram.messenger.g0.L(32.0f);
                        I.O = (int) (min * 0.6f);
                        I.P = true;
                        I.W = true;
                        I.Z();
                        i2Var2.E.getImageReceiver().P0(true);
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

    @Override // org.telegram.messenger.x10
    public void m(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        b41 b41Var = (b41) obj;
        c4 c4Var = this.a;
        wp0 wp0Var = c4Var.a;
        int i7 = c4Var.b;
        if (c4Var.e == null) {
            return;
        }
        Object obj3 = b41Var.G;
        if (obj3 instanceof TL_stars.SavedStarGift) {
            TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj3;
            if (!c4Var.h) {
                di.c6 c6Var = new di.c6(c4Var.getContext(), c4Var.b, wp0Var.c, c4Var.c, null);
                c6Var.g3 = new o3(c4Var, 2);
                c6Var.N2 = new ab.g(5, c4Var, savedStarGift);
                c6Var.k2(savedStarGift, c4Var.e);
                c6Var.show();
                return;
            }
            if (!c4Var.d && (savedStarGift.gift instanceof TL_stars.TL_starGiftUnique)) {
                boolean z10 = savedStarGift.pinned_to_top;
                boolean z11 = !z10;
                if (!z10 && savedStarGift.unsaved) {
                    savedStarGift.unsaved = false;
                    TL_stars.saveStarGift savestargift = new TL_stars.saveStarGift();
                    savestargift.stargift = c4Var.e.h(savedStarGift);
                    savestargift.unsave = savedStarGift.unsaved;
                    ConnectionsManager.getInstance(i7).sendRequest(savestargift, null, 64);
                }
                if (c4Var.e.o(savedStarGift, z11, true)) {
                    cc.a0(wp0Var.a).Q(R.raw.chats_infotip, 36, hd.H(',', "GiftsPinLimit", np.s1(i7).L6)).j();
                }
                if (z10) {
                    return;
                }
                c4Var.f.v0(0);
            }
        }
    }
}
