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
import org.telegram.ui.Components.eq0;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.lc;
import org.telegram.ui.Components.y60;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class a6 implements v10, w10 {
    public final /* synthetic */ j6 a;

    public /* synthetic */ a6(j6 j6Var) {
        this.a = j6Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x02b8  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x02cf  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x02d1  */
    /* JADX WARN: Type inference failed for: r0v69, types: [org.telegram.ui.Components.y60] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v26, types: [int] */
    /* JADX WARN: Type inference failed for: r7v7, types: [android.view.View, android.widget.ScrollView, bi.g6] */
    @Override // org.telegram.messenger.w10
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Boolean a(l41 l41Var, View view, Integer num, Float f10, Float f11) {
        boolean z10;
        j6 j6Var;
        ?? r42;
        c3 c3Var;
        final j6 j6Var2;
        final TL_stars.SavedStarGift savedStarGift;
        c3 c3Var2;
        String str;
        di.m8 m8Var;
        boolean z11;
        TL_stars.StarGift starGift;
        TL_stars.TL_starGiftUnique tL_starGiftUnique;
        String str2;
        String str3;
        int i7;
        boolean z12;
        Object obj;
        j6 j6Var3 = this.a;
        int i10 = j6Var3.b;
        eq0 eq0Var = j6Var3.a;
        boolean z13 = false;
        boolean z14 = false;
        boolean z15 = false;
        if (j6Var3.e != null) {
            if (view instanceof c3) {
                Object obj2 = l41Var.H;
                if (obj2 instanceof TL_stars.SavedStarGift) {
                    c3 c3Var3 = (c3) view;
                    TL_stars.SavedStarGift savedStarGift2 = (TL_stars.SavedStarGift) obj2;
                    org.telegram.ui.ActionBar.h2 h2Var = eq0Var.a;
                    di.m8 m8Var2 = eq0Var.e;
                    y60 J = y60.J(h2Var, view);
                    eq0Var.J = J;
                    if (m8Var2.h()) {
                        if (!j6Var3.d) {
                            m8Var2.d().size();
                        }
                        ?? K = J.K();
                        K.c(R.drawable.ic_ab_back, gd.M0(2131753754, null), new b6(J, z15 ? 1 : 0), false);
                        K.k();
                        ?? g6Var = new g6(j6Var3.getContext(), z14 ? 1 : 0);
                        LinearLayout linearLayout = new LinearLayout(j6Var3.getContext());
                        g6Var.addView(linearLayout);
                        linearLayout.setOrientation(1);
                        boolean z16 = true;
                        K.r(g6Var, ma.o(-1, -2));
                        if (m8Var2.d().size() + 1 < ((org.telegram.messenger.j0) mp.u1(i10).A7.y.b).c) {
                            org.telegram.ui.ActionBar.z0 z0Var = new org.telegram.ui.ActionBar.z0(0, j6Var3.getContext(), j6Var3.c, false, false);
                            z0Var.setPadding(org.telegram.messenger.g0.L(18.0f), 0, org.telegram.messenger.g0.L(18.0f), 0);
                            int i11 = org.telegram.ui.ActionBar.n6.E8;
                            z0Var.c(i11, org.telegram.ui.ActionBar.n6.F8);
                            z0Var.h(0.12f, i11);
                            z0Var.j(gd.M0(2131750082, null), R.drawable.menu_folder_add, null);
                            z0Var.setOnClickListener(new ah.h(j6Var3, J, savedStarGift2, 5));
                            linearLayout.addView(z0Var, ma.o(-1, -2));
                        }
                        ArrayList d = m8Var2.d();
                        int size = d.size();
                        int i12 = 0;
                        LinearLayout linearLayout2 = linearLayout;
                        while (i12 < size) {
                            int i13 = i12 + 1;
                            TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) d.get(i12);
                            ArrayList arrayList = m8Var2.e(tL_starGiftCollection.collection_id).l;
                            int size2 = arrayList.size();
                            c3 c3Var4 = c3Var3;
                            int i14 = 0;
                            while (true) {
                                if (i14 >= size2) {
                                    z12 = false;
                                    break;
                                }
                                Object obj3 = arrayList.get(i14);
                                i14++;
                                int i15 = size2;
                                if (di.x8.k((TL_stars.SavedStarGift) obj3, savedStarGift2)) {
                                    z12 = z16;
                                    break;
                                }
                                size2 = i15;
                            }
                            org.telegram.ui.ActionBar.z0 z0Var2 = new org.telegram.ui.ActionBar.z0(2, j6Var3.getContext(), j6Var3.c, false, false);
                            z0Var2.setChecked(z12);
                            j6 j6Var4 = j6Var3;
                            boolean z17 = z12;
                            z0Var2.setPadding(org.telegram.messenger.g0.L(18.0f), 0, org.telegram.messenger.g0.L(18.0f), 0);
                            int i16 = org.telegram.ui.ActionBar.n6.E8;
                            z0Var2.c(i16, org.telegram.ui.ActionBar.n6.F8);
                            z0Var2.h(0.12f, i16);
                            if (tL_starGiftCollection.icon != null) {
                                h6 h6Var = new h6(3, i10, tL_starGiftCollection.icon);
                                z0Var2.getImageView().addOnAttachStateChangeListener(new r2(h6Var, 10));
                                z0Var2.j(tL_starGiftCollection.title, 0, h6Var);
                                obj = null;
                            } else {
                                obj = null;
                                z0Var2.j(tL_starGiftCollection.title, R.drawable.msg_folders, null);
                            }
                            ArrayList arrayList2 = d;
                            LinearLayout linearLayout3 = linearLayout2;
                            z0Var2.setOnClickListener(new t5(j6Var4, z17, tL_starGiftCollection, savedStarGift2, J, 0));
                            linearLayout3.addView(z0Var2, ma.o(-1, -2));
                            d = arrayList2;
                            j6Var3 = j6Var4;
                            size = size;
                            i12 = i13;
                            c3Var3 = c3Var4;
                            z16 = true;
                            linearLayout2 = linearLayout3;
                        }
                        j6Var = j6Var3;
                        c3Var = c3Var3;
                        r42 = 0;
                        J.c(R.drawable.msg_addfolder, gd.M0(2131750379, null), new u5(J, K, r42), false);
                        J.k();
                    } else {
                        j6Var = j6Var3;
                        r42 = 0;
                        c3Var = c3Var3;
                    }
                    if (savedStarGift2.gift instanceof TL_stars.TL_starGiftUnique) {
                        if (!eq0Var.c() || j6Var.d || (savedStarGift2.unsaved && savedStarGift2.pinned_to_top)) {
                            j6Var2 = j6Var;
                            savedStarGift = savedStarGift2;
                            c3Var2 = c3Var;
                            str = null;
                            z10 = r42;
                            m8Var = m8Var2;
                            if (eq0Var.c() && j6Var2.d) {
                                J.c(R.drawable.tabs_reorder, gd.M0(2131750017, null), new v5(j6Var2, 1), z10);
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
                                    String M0 = gd.M0(U1 ? 2131749863 : 2131749826, str);
                                    final int i18 = z10 ? 1 : 0;
                                    J.c(i17, M0, new Runnable() { // from class: bi.w5
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            switch (i18) {
                                                case 0:
                                                    j6 j6Var5 = j6Var2;
                                                    i6 i6Var = new i6(j6Var5, j6Var5.getContext(), j6Var5.b, j6Var5.a.c, j6Var5.c, 0);
                                                    i6Var.w2(savedStarGift, null);
                                                    i6Var.I2(false);
                                                    break;
                                                case 1:
                                                    j6 j6Var6 = j6Var2;
                                                    i6 i6Var2 = new i6(j6Var6, j6Var6.getContext(), j6Var6.b, j6Var6.a.c, j6Var6.c, 1);
                                                    i6Var2.w2(savedStarGift, null);
                                                    i6Var2.W1();
                                                    break;
                                                default:
                                                    j6 j6Var7 = j6Var2;
                                                    i6 i6Var3 = new i6(j6Var7, j6Var7.getContext(), j6Var7.b, j6Var7.a.c, j6Var7.c, 2);
                                                    i6Var3.w2(savedStarGift, null);
                                                    i6Var3.j2();
                                                    break;
                                            }
                                        }
                                    }, z10);
                                }
                                J.l(R.drawable.msg_link2, gd.M0(2131751751, str), new a1.e(27, j6Var2, str2), str2 == null ? true : z10 ? 1 : 0);
                                final int i19 = 1;
                                J.l(R.drawable.msg_share, gd.M0(2131745264, str), new Runnable() { // from class: bi.w5
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i19) {
                                            case 0:
                                                j6 j6Var5 = j6Var2;
                                                i6 i6Var = new i6(j6Var5, j6Var5.getContext(), j6Var5.b, j6Var5.a.c, j6Var5.c, 0);
                                                i6Var.w2(savedStarGift, null);
                                                i6Var.I2(false);
                                                break;
                                            case 1:
                                                j6 j6Var6 = j6Var2;
                                                i6 i6Var2 = new i6(j6Var6, j6Var6.getContext(), j6Var6.b, j6Var6.a.c, j6Var6.c, 1);
                                                i6Var2.w2(savedStarGift, null);
                                                i6Var2.W1();
                                                break;
                                            default:
                                                j6 j6Var7 = j6Var2;
                                                i6 i6Var3 = new i6(j6Var7, j6Var7.getContext(), j6Var7.b, j6Var7.a.c, j6Var7.c, 2);
                                                i6Var3.w2(savedStarGift, null);
                                                i6Var3.j2();
                                                break;
                                        }
                                    }
                                }, str2 == null ? true : z10 ? 1 : 0);
                            }
                        } else {
                            boolean z18 = savedStarGift2.pinned_to_top;
                            int i20 = z18 ? R.drawable.msg_unpin : R.drawable.msg_pin;
                            if (z18) {
                                i7 = 2131749868;
                                str3 = null;
                            } else {
                                str3 = null;
                                i7 = 2131750062;
                            }
                            m8Var = m8Var2;
                            savedStarGift = savedStarGift2;
                            str = str3;
                            c3Var2 = c3Var;
                            j6Var2 = j6Var;
                            z10 = r42;
                            J.c(i20, gd.M0(i7, str3), new ai.s(j6Var2, savedStarGift, c3Var2, view, 2), z10);
                            J.l(R.drawable.tabs_reorder, gd.M0(2131750017, str), new v5(j6Var2, z10 ? 1 : 0), savedStarGift.pinned_to_top);
                        }
                        starGift = savedStarGift.gift;
                        tL_starGiftUnique = (TL_stars.TL_starGiftUnique) starGift;
                        if (starGift.slug == null) {
                        }
                        if (di.f6.S1(i10, org.telegram.messenger.n5.o(tL_starGiftUnique.owner_id))) {
                        }
                        J.l(R.drawable.msg_link2, gd.M0(2131751751, str), new a1.e(27, j6Var2, str2), str2 == null ? true : z10 ? 1 : 0);
                        final int i192 = 1;
                        J.l(R.drawable.msg_share, gd.M0(2131745264, str), new Runnable() { // from class: bi.w5
                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i192) {
                                    case 0:
                                        j6 j6Var5 = j6Var2;
                                        i6 i6Var = new i6(j6Var5, j6Var5.getContext(), j6Var5.b, j6Var5.a.c, j6Var5.c, 0);
                                        i6Var.w2(savedStarGift, null);
                                        i6Var.I2(false);
                                        break;
                                    case 1:
                                        j6 j6Var6 = j6Var2;
                                        i6 i6Var2 = new i6(j6Var6, j6Var6.getContext(), j6Var6.b, j6Var6.a.c, j6Var6.c, 1);
                                        i6Var2.w2(savedStarGift, null);
                                        i6Var2.W1();
                                        break;
                                    default:
                                        j6 j6Var7 = j6Var2;
                                        i6 i6Var3 = new i6(j6Var7, j6Var7.getContext(), j6Var7.b, j6Var7.a.c, j6Var7.c, 2);
                                        i6Var3.w2(savedStarGift, null);
                                        i6Var3.j2();
                                        break;
                                }
                            }
                        }, str2 == null ? true : z10 ? 1 : 0);
                    } else {
                        j6Var2 = j6Var;
                        savedStarGift = savedStarGift2;
                        c3Var2 = c3Var;
                        str = null;
                        z10 = r42;
                        m8Var = m8Var2;
                        if (eq0Var.c() && j6Var2.d) {
                            J.c(R.drawable.tabs_reorder, gd.M0(2131750017, null), new v5(j6Var2, 3), z10);
                        }
                    }
                    if (di.f6.S1(i10, eq0Var.c)) {
                        boolean z19 = savedStarGift.unsaved;
                        J.c(z19 ? R.drawable.msg_message : R.drawable.menu_hide_gift, gd.M0(z19 ? 2131749965 : 2131750171, str), new aa.r(j6Var2, savedStarGift, c3Var2, 12), z10);
                    }
                    TL_stars.StarGift starGift2 = savedStarGift.gift;
                    if (starGift2 instanceof TL_stars.TL_starGiftUnique) {
                        final int i21 = 2;
                        J.l(R.drawable.menu_transfer, gd.M0(2131749902, str), new Runnable() { // from class: bi.w5
                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i21) {
                                    case 0:
                                        j6 j6Var5 = j6Var2;
                                        i6 i6Var = new i6(j6Var5, j6Var5.getContext(), j6Var5.b, j6Var5.a.c, j6Var5.c, 0);
                                        i6Var.w2(savedStarGift, null);
                                        i6Var.I2(false);
                                        break;
                                    case 1:
                                        j6 j6Var6 = j6Var2;
                                        i6 i6Var2 = new i6(j6Var6, j6Var6.getContext(), j6Var6.b, j6Var6.a.c, j6Var6.c, 1);
                                        i6Var2.w2(savedStarGift, null);
                                        i6Var2.W1();
                                        break;
                                    default:
                                        j6 j6Var7 = j6Var2;
                                        i6 i6Var3 = new i6(j6Var7, j6Var7.getContext(), j6Var7.b, j6Var7.a.c, j6Var7.c, 2);
                                        i6Var3.w2(savedStarGift, null);
                                        i6Var3.j2();
                                        break;
                                }
                            }
                        }, org.telegram.messenger.n5.o(((TL_stars.TL_starGiftUnique) starGift2).owner_id) == j10.i(i10).e() ? true : z10 ? 1 : 0);
                    }
                    if (m8Var.h() && j6Var2.d) {
                        z11 = true;
                        J.c(R.drawable.msg_removefolder, gd.M0(2131750023, str), new aa.r(j6Var2, savedStarGift, J, 11), true);
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
                        c3Var2.E.getImageReceiver().P0(true);
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
        l41 l41Var = (l41) obj;
        j6 j6Var = this.a;
        eq0 eq0Var = j6Var.a;
        int i7 = j6Var.b;
        if (j6Var.e == null) {
            return;
        }
        Object obj3 = l41Var.H;
        if (obj3 instanceof TL_stars.SavedStarGift) {
            TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj3;
            if (!j6Var.h) {
                di.f6 f6Var = new di.f6(j6Var.getContext(), j6Var.b, eq0Var.c, j6Var.c, null);
                f6Var.j3 = new v5(j6Var, 2);
                f6Var.N2 = new ab.g(4, j6Var, savedStarGift);
                f6Var.w2(savedStarGift, j6Var.e);
                f6Var.show();
                return;
            }
            if (!j6Var.d && (savedStarGift.gift instanceof TL_stars.TL_starGiftUnique)) {
                boolean z10 = savedStarGift.pinned_to_top;
                boolean z11 = !z10;
                if (!z10 && savedStarGift.unsaved) {
                    savedStarGift.unsaved = false;
                    TL_stars.saveStarGift savestargift = new TL_stars.saveStarGift();
                    savestargift.stargift = j6Var.e.h(savedStarGift);
                    savestargift.unsave = savedStarGift.unsaved;
                    ConnectionsManager.getInstance(i7).sendRequest(savestargift, null, 64);
                }
                if (j6Var.e.q(savedStarGift, z11, true)) {
                    lc.b0(eq0Var.a).Q(R.raw.chats_infotip, 36, gd.H(',', "GiftsPinLimit", mp.u1(i7).N6)).j();
                }
                if (z10) {
                    return;
                }
                j6Var.f.v0(0);
            }
        }
    }
}
