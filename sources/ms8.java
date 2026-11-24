// default package

import android.graphics.Point;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import java.io.Serializable;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class ms8 implements oac, pac {
    public final /* synthetic */ rs8 a;

    public /* synthetic */ ms8(rs8 rs8Var) {
        this.a = rs8Var;
    }

    @Override // pac
    public final Object b(c6c c6cVar, View view, Integer num, Float f, Float f2) {
        boolean z;
        rs8 rs8Var;
        TL_stars.SavedStarGift savedStarGift;
        ox4 ox4Var;
        final rs8 rs8Var2;
        final TL_stars.SavedStarGift savedStarGift2;
        ox4 ox4Var2;
        String str;
        boolean z2;
        int i;
        int i2;
        String str2;
        int i3;
        int i4;
        String str3;
        String M0;
        int i5;
        ox4 ox4Var3;
        boolean z3;
        TL_stars.SavedStarGift savedStarGift3;
        rs8 rs8Var3 = this.a;
        int i6 = rs8Var3.b;
        lea leaVar = rs8Var3.a;
        boolean z4 = false;
        int i7 = 0;
        if (rs8Var3.e != null) {
            if (view instanceof ox4) {
                Object obj = c6cVar.H;
                if (obj instanceof TL_stars.SavedStarGift) {
                    ox4 ox4Var4 = (ox4) view;
                    TL_stars.SavedStarGift savedStarGift4 = (TL_stars.SavedStarGift) obj;
                    d dVar = leaVar.a;
                    yua yuaVar = leaVar.e;
                    bu5 J = bu5.J(dVar, view);
                    leaVar.J = J;
                    byte b = 5;
                    byte b2 = 2;
                    if (yuaVar.h()) {
                        if (!rs8Var3.d) {
                            yuaVar.d().size();
                        }
                        bu5 K = J.K();
                        K.b(R.drawable.ic_ab_back, jb6.M0(2131753721, null), new bo1(J, b2), false);
                        K.j();
                        lj3 lj3Var = new lj3(rs8Var3.getContext(), b);
                        LinearLayout linearLayout = new LinearLayout(rs8Var3.getContext());
                        lj3Var.addView(linearLayout);
                        linearLayout.setOrientation(1);
                        boolean z5 = true;
                        K.q(lj3Var, qoe.o(-1, -2));
                        if (yuaVar.d().size() + 1 < oc7.r1(i6).l4.x.f()) {
                            a8 a8Var = new a8(0, rs8Var3.c, rs8Var3.getContext(), false, false);
                            a8Var.setPadding(gm.L(18.0f), 0, gm.L(18.0f), 0);
                            int i8 = cmb.D8;
                            a8Var.c(i8, cmb.E8);
                            a8Var.h(0.12f, i8);
                            a8Var.j(jb6.M0(2131750031, null), R.drawable.menu_folder_add, null);
                            a8Var.setOnClickListener(new jw4(rs8Var3, J, savedStarGift4, (byte) 16));
                            linearLayout.addView(a8Var, qoe.o(-1, -2));
                        }
                        ArrayList d = yuaVar.d();
                        int size = d.size();
                        int i9 = 0;
                        LinearLayout linearLayout2 = linearLayout;
                        while (i9 < size) {
                            int i10 = i9 + 1;
                            TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) d.get(i9);
                            ArrayList arrayList = yuaVar.e(tL_starGiftCollection.collection_id).l;
                            int size2 = arrayList.size();
                            while (true) {
                                if (i7 >= size2) {
                                    ox4Var3 = ox4Var4;
                                    z3 = false;
                                    break;
                                }
                                Object obj2 = arrayList.get(i7);
                                i7++;
                                ox4Var3 = ox4Var4;
                                if (jva.h((TL_stars.SavedStarGift) obj2, savedStarGift4)) {
                                    z3 = z5;
                                    break;
                                }
                                ox4Var4 = ox4Var3;
                            }
                            a8 a8Var2 = new a8(2, rs8Var3.c, rs8Var3.getContext(), false, false);
                            a8Var2.setChecked(z3);
                            rs8 rs8Var4 = rs8Var3;
                            a8Var2.setPadding(gm.L(18.0f), 0, gm.L(18.0f), 0);
                            int i11 = cmb.D8;
                            a8Var2.c(i11, cmb.E8);
                            a8Var2.h(0.12f, i11);
                            if (tL_starGiftCollection.icon != null) {
                                ps8 ps8Var = new ps8(3, i6, tL_starGiftCollection.icon);
                                ImageView imageView = a8Var2.getImageView();
                                savedStarGift3 = savedStarGift4;
                                imageView.addOnAttachStateChangeListener(new wd(ps8Var, z5 ? (byte) 1 : (byte) 0));
                                a8Var2.j(tL_starGiftCollection.title, 0, ps8Var);
                            } else {
                                savedStarGift3 = savedStarGift4;
                                a8Var2.j(tL_starGiftCollection.title, R.drawable.msg_folders, null);
                            }
                            ArrayList arrayList2 = d;
                            TL_stars.SavedStarGift savedStarGift5 = savedStarGift3;
                            boolean z6 = z3;
                            LinearLayout linearLayout3 = linearLayout2;
                            a8Var2.setOnClickListener(new x47(rs8Var4, z6, tL_starGiftCollection, savedStarGift5, J, (byte) 1));
                            linearLayout3.addView(a8Var2, qoe.o(-1, -2));
                            savedStarGift4 = savedStarGift5;
                            d = arrayList2;
                            size = size;
                            i9 = i10;
                            z5 = true;
                            i7 = 0;
                            rs8Var3 = rs8Var4;
                            linearLayout2 = linearLayout3;
                            ox4Var4 = ox4Var3;
                        }
                        rs8Var = rs8Var3;
                        savedStarGift = savedStarGift4;
                        ox4Var = ox4Var4;
                        J.b(R.drawable.msg_addfolder, jb6.M0(2131750328, null), new c20(J, K, (byte) 7), false);
                        J.j();
                    } else {
                        rs8Var = rs8Var3;
                        savedStarGift = savedStarGift4;
                        ox4Var = ox4Var4;
                    }
                    if (savedStarGift.gift instanceof TL_stars.TL_starGiftUnique) {
                        if (!leaVar.c() || rs8Var.d || (savedStarGift.unsaved && savedStarGift.pinned_to_top)) {
                            rs8Var2 = rs8Var;
                            savedStarGift2 = savedStarGift;
                            ox4Var2 = ox4Var;
                            str = null;
                            z2 = true;
                            z2 = true;
                            z2 = true;
                            if (leaVar.c() && rs8Var2.d) {
                                J.b(R.drawable.tabs_reorder, jb6.M0(2131749966, null), new hs8(rs8Var2, z2 ? (byte) 1 : (byte) 0), false);
                            }
                        } else {
                            if (savedStarGift.pinned_to_top) {
                                str3 = null;
                                M0 = jb6.M0(2131749817, null);
                                i5 = R.drawable.msg_unpin;
                            } else {
                                str3 = null;
                                M0 = jb6.M0(2131750011, null);
                                i5 = R.drawable.msg_pin;
                            }
                            rs8 rs8Var5 = rs8Var;
                            int i12 = i5;
                            rs8Var2 = rs8Var5;
                            str = str3;
                            savedStarGift2 = savedStarGift;
                            ox4Var2 = ox4Var;
                            z2 = true;
                            J.b(i12, M0, new no8((Object) rs8Var2, (Object) savedStarGift2, (Object) ox4Var2, (Object) view, (byte) 3), false);
                            J.k(R.drawable.tabs_reorder, jb6.M0(2131749966, str), new hs8(rs8Var2, (byte) 0), savedStarGift2.pinned_to_top);
                        }
                        TL_stars.StarGift starGift = savedStarGift2.gift;
                        TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) starGift;
                        if (starGift.slug != null) {
                            str2 = oc7.r1(i6).N2 + "/nft/" + savedStarGift2.gift.slug;
                        } else {
                            str2 = str;
                        }
                        if (wsa.G1(i6, pg3.n(tL_starGiftUnique.owner_id))) {
                            if (wsa.I1(i6, tL_starGiftUnique)) {
                                i3 = R.drawable.menu_takeoff;
                                i4 = 2131749812;
                            } else {
                                i3 = R.drawable.menu_wear;
                                i4 = 2131749775;
                            }
                            final byte b3 = 0;
                            J.b(i3, jb6.M0(i4, str), new Runnable() { // from class: is8
                                @Override // java.lang.Runnable
                                public final void run() {
                                    byte b4 = b3;
                                    TL_stars.SavedStarGift savedStarGift6 = savedStarGift2;
                                    switch (b4) {
                                        case 0:
                                            rs8 rs8Var6 = rs8Var2;
                                            qs8 qs8Var = new qs8(rs8Var6, rs8Var6.getContext(), rs8Var6.b, rs8Var6.a.c, rs8Var6.c, (byte) 0);
                                            qs8Var.n2(savedStarGift6, null);
                                            qs8Var.A2(false);
                                            break;
                                        case 1:
                                            rs8 rs8Var7 = rs8Var2;
                                            qs8 qs8Var2 = new qs8(rs8Var7, rs8Var7.getContext(), rs8Var7.b, rs8Var7.a.c, rs8Var7.c, (byte) 1);
                                            qs8Var2.n2(savedStarGift6, null);
                                            qs8Var2.N1();
                                            break;
                                        default:
                                            rs8 rs8Var8 = rs8Var2;
                                            qs8 qs8Var3 = new qs8(rs8Var8, rs8Var8.getContext(), rs8Var8.b, rs8Var8.a.c, rs8Var8.c, (byte) 2);
                                            qs8Var3.n2(savedStarGift6, null);
                                            qs8Var3.a2();
                                            break;
                                    }
                                }
                            }, false);
                        }
                        J.k(R.drawable.msg_link2, jb6.M0(2131751699, str), new mn8(rs8Var2, str2, (byte) 20), str2 != null ? z2 ? 1 : 0 : false);
                        boolean z7 = str2 != null ? z2 ? 1 : 0 : false;
                        String M02 = jb6.M0(2131745193, str);
                        final byte b4 = z2 ? (byte) 1 : (byte) 0;
                        J.k(R.drawable.msg_share, M02, new Runnable() { // from class: is8
                            @Override // java.lang.Runnable
                            public final void run() {
                                byte b42 = b4;
                                TL_stars.SavedStarGift savedStarGift6 = savedStarGift2;
                                switch (b42) {
                                    case 0:
                                        rs8 rs8Var6 = rs8Var2;
                                        qs8 qs8Var = new qs8(rs8Var6, rs8Var6.getContext(), rs8Var6.b, rs8Var6.a.c, rs8Var6.c, (byte) 0);
                                        qs8Var.n2(savedStarGift6, null);
                                        qs8Var.A2(false);
                                        break;
                                    case 1:
                                        rs8 rs8Var7 = rs8Var2;
                                        qs8 qs8Var2 = new qs8(rs8Var7, rs8Var7.getContext(), rs8Var7.b, rs8Var7.a.c, rs8Var7.c, (byte) 1);
                                        qs8Var2.n2(savedStarGift6, null);
                                        qs8Var2.N1();
                                        break;
                                    default:
                                        rs8 rs8Var8 = rs8Var2;
                                        qs8 qs8Var3 = new qs8(rs8Var8, rs8Var8.getContext(), rs8Var8.b, rs8Var8.a.c, rs8Var8.c, (byte) 2);
                                        qs8Var3.n2(savedStarGift6, null);
                                        qs8Var3.a2();
                                        break;
                                }
                            }
                        }, z7);
                    } else {
                        rs8Var2 = rs8Var;
                        savedStarGift2 = savedStarGift;
                        ox4Var2 = ox4Var;
                        str = null;
                        z2 = true;
                        z2 = true;
                        z2 = true;
                        if (leaVar.c() && rs8Var2.d) {
                            J.b(R.drawable.tabs_reorder, jb6.M0(2131749966, null), new hs8(rs8Var2, (byte) 3), false);
                        }
                    }
                    if (wsa.G1(i6, leaVar.c)) {
                        if (savedStarGift2.unsaved) {
                            i = R.drawable.msg_message;
                            i2 = 2131749914;
                        } else {
                            i = R.drawable.menu_hide_gift;
                            i2 = 2131750120;
                        }
                        z = false;
                        J.b(i, jb6.M0(i2, str), new ak8((Object) rs8Var2, (Object) savedStarGift2, (Object) ox4Var2, (byte) 7), false);
                    } else {
                        z = false;
                    }
                    TL_stars.StarGift starGift2 = savedStarGift2.gift;
                    if (starGift2 instanceof TL_stars.TL_starGiftUnique) {
                        final byte b5 = 2;
                        J.k(R.drawable.menu_transfer, jb6.M0(2131749851, str), new Runnable() { // from class: is8
                            @Override // java.lang.Runnable
                            public final void run() {
                                byte b42 = b5;
                                TL_stars.SavedStarGift savedStarGift6 = savedStarGift2;
                                switch (b42) {
                                    case 0:
                                        rs8 rs8Var6 = rs8Var2;
                                        qs8 qs8Var = new qs8(rs8Var6, rs8Var6.getContext(), rs8Var6.b, rs8Var6.a.c, rs8Var6.c, (byte) 0);
                                        qs8Var.n2(savedStarGift6, null);
                                        qs8Var.A2(false);
                                        break;
                                    case 1:
                                        rs8 rs8Var7 = rs8Var2;
                                        qs8 qs8Var2 = new qs8(rs8Var7, rs8Var7.getContext(), rs8Var7.b, rs8Var7.a.c, rs8Var7.c, (byte) 1);
                                        qs8Var2.n2(savedStarGift6, null);
                                        qs8Var2.N1();
                                        break;
                                    default:
                                        rs8 rs8Var8 = rs8Var2;
                                        qs8 qs8Var3 = new qs8(rs8Var8, rs8Var8.getContext(), rs8Var8.b, rs8Var8.a.c, rs8Var8.c, (byte) 2);
                                        qs8Var3.n2(savedStarGift6, null);
                                        qs8Var3.a2();
                                        break;
                                }
                            }
                        }, pg3.n(((TL_stars.TL_starGiftUnique) starGift2).owner_id) == z8c.h(i6).e() ? z2 : z);
                    }
                    if (yuaVar.h() && rs8Var2.d) {
                        J.b(R.drawable.msg_removefolder, jb6.M0(2131749972, str), new ak8((Object) rs8Var2, (Object) savedStarGift2, (Object) J, (byte) 6), z2);
                        J.F();
                        J.t();
                    }
                    if (J.y() > 0) {
                        J.W(5);
                        J.u = z2;
                        J.v = z2;
                        J.L = z2;
                        Point point = gm.q;
                        int min = Math.min(point.x, point.y);
                        J.N = min - gm.L(32.0f);
                        J.O = (int) (min * 0.6f);
                        J.S = z2;
                        J.Z = z2;
                        J.a0();
                        ox4Var2.E.getImageReceiver().w0(z2);
                        z4 = z2;
                    }
                    z4 = z;
                }
            }
            z = false;
            z4 = z;
        }
        return Boolean.valueOf(z4);
    }

    @Override // oac
    public final void k(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        c6c c6cVar = (c6c) obj;
        rs8 rs8Var = this.a;
        lea leaVar = rs8Var.a;
        int i = rs8Var.b;
        if (rs8Var.e != null) {
            Object obj3 = c6cVar.H;
            if (obj3 instanceof TL_stars.SavedStarGift) {
                TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj3;
                byte b = 1;
                if (!rs8Var.h) {
                    wsa wsaVar = new wsa(rs8Var.getContext(), rs8Var.b, leaVar.c, rs8Var.c, null);
                    wsaVar.i3 = new hs8(rs8Var, (byte) 2);
                    wsaVar.M2 = new xr8(rs8Var, savedStarGift, b);
                    wsaVar.n2(savedStarGift, rs8Var.e);
                    wsaVar.show();
                    return;
                }
                if (rs8Var.d || !(savedStarGift.gift instanceof TL_stars.TL_starGiftUnique)) {
                    return;
                }
                boolean z = savedStarGift.pinned_to_top;
                boolean z2 = !z;
                if (!z && savedStarGift.unsaved) {
                    savedStarGift.unsaved = false;
                    TL_stars.saveStarGift savestargift = new TL_stars.saveStarGift();
                    savestargift.stargift = rs8Var.e.h(savedStarGift);
                    savestargift.unsave = savedStarGift.unsaved;
                    ConnectionsManager.getInstance(i).sendRequest(savestargift, null, 64);
                }
                if (rs8Var.e.q(savedStarGift, z2, true)) {
                    c41.b0(leaVar.a).Q(R.raw.chats_infotip, 36, jb6.H(',', "GiftsPinLimit", oc7.r1(i).l4.J1.f())).j();
                }
                if (z) {
                    return;
                }
                rs8Var.f.w0(0);
            }
        }
    }
}
