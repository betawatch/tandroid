package ai;

import android.graphics.Point;
import android.view.View;
import android.widget.LinearLayout;
import b8.mf;
import ci.e9;
import ci.s8;
import java.io.Serializable;
import java.util.ArrayList;
import org.telegram.messenger.bd;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.h10;
import org.telegram.messenger.hp;
import org.telegram.messenger.s10;
import org.telegram.messenger.t10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.f60;
import org.telegram.ui.Components.fc;
import org.telegram.ui.Components.r31;
import org.telegram.ui.Components.vp0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class f4 implements s10, t10 {
    public final /* synthetic */ o4 a;

    public /* synthetic */ f4(o4 o4Var) {
        this.a = o4Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x02b5  */
    /* JADX WARN: Type inference failed for: r0v24, types: [org.telegram.messenger.ImageReceiver] */
    /* JADX WARN: Type inference failed for: r0v70, types: [org.telegram.ui.Components.f60] */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Object, org.telegram.ui.Components.f60] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v19, types: [int] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v19 */
    /* JADX WARN: Type inference failed for: r5v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r7v18, types: [ai.l4, android.view.View, android.widget.ScrollView] */
    @Override // org.telegram.messenger.t10
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Boolean a(r31 r31Var, View view, Integer num, Float f10, Float f11) {
        boolean z10;
        o4 o4Var;
        ?? r42;
        q2 q2Var;
        s8 s8Var;
        final o4 o4Var2;
        final TL_stars.SavedStarGift savedStarGift;
        q2 q2Var2;
        ?? r5;
        String str;
        boolean z11;
        TL_stars.StarGift starGift;
        TL_stars.TL_starGiftUnique tL_starGiftUnique;
        String str2;
        int i3;
        boolean z12;
        s8 s8Var2;
        o4 o4Var3 = this.a;
        int i10 = o4Var3.b;
        vp0 vp0Var = o4Var3.a;
        boolean z13 = false;
        boolean z14 = false;
        boolean z15 = false;
        if (o4Var3.e != null) {
            if (view instanceof q2) {
                Object obj = r31Var.G;
                if (obj instanceof TL_stars.SavedStarGift) {
                    q2 q2Var3 = (q2) view;
                    TL_stars.SavedStarGift savedStarGift2 = (TL_stars.SavedStarGift) obj;
                    org.telegram.ui.ActionBar.d2 d2Var = vp0Var.a;
                    s8 s8Var3 = vp0Var.e;
                    ?? I = f60.I(d2Var, view);
                    vp0Var.J = I;
                    if (s8Var3.h()) {
                        if (!o4Var3.d) {
                            s8Var3.d().size();
                        }
                        ?? J = I.J();
                        J.c(R.drawable.ic_ab_back, bd.M0(2131753756, null), new g4(I, z15 ? 1 : 0), false);
                        J.k();
                        ?? l4Var = new l4(o4Var3.getContext(), z14 ? 1 : 0);
                        LinearLayout linearLayout = new LinearLayout(o4Var3.getContext());
                        l4Var.addView(linearLayout);
                        linearLayout.setOrientation(1);
                        boolean z16 = true;
                        J.r(l4Var, mf.o(-1, -2));
                        if (s8Var3.d().size() + 1 < ((org.telegram.messenger.j0) hp.s1(i10).x7.t.b).c) {
                            org.telegram.ui.ActionBar.y0 y0Var = new org.telegram.ui.ActionBar.y0(0, o4Var3.getContext(), o4Var3.c, false, false);
                            y0Var.setPadding(org.telegram.messenger.g0.L(18.0f), 0, org.telegram.messenger.g0.L(18.0f), 0);
                            int i11 = org.telegram.ui.ActionBar.k6.E8;
                            y0Var.c(i11, org.telegram.ui.ActionBar.k6.F8);
                            y0Var.h(0.12f, i11);
                            y0Var.j(bd.M0(2131750106, null), R.drawable.menu_folder_add, null);
                            y0Var.setOnClickListener(new h(o4Var3, I, savedStarGift2, 4));
                            linearLayout.addView(y0Var, mf.o(-1, -2));
                        }
                        ArrayList d = s8Var3.d();
                        int size = d.size();
                        int i12 = 0;
                        LinearLayout linearLayout2 = linearLayout;
                        while (i12 < size) {
                            int i13 = i12 + 1;
                            TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) d.get(i12);
                            ArrayList arrayList = s8Var3.e(tL_starGiftCollection.collection_id).l;
                            int size2 = arrayList.size();
                            q2 q2Var4 = q2Var3;
                            int i14 = 0;
                            while (true) {
                                if (i14 >= size2) {
                                    z12 = false;
                                    break;
                                }
                                Object obj2 = arrayList.get(i14);
                                i14++;
                                int i15 = size2;
                                if (e9.k((TL_stars.SavedStarGift) obj2, savedStarGift2)) {
                                    z12 = z16;
                                    break;
                                }
                                size2 = i15;
                            }
                            org.telegram.ui.ActionBar.y0 y0Var2 = new org.telegram.ui.ActionBar.y0(2, o4Var3.getContext(), o4Var3.c, false, false);
                            y0Var2.setChecked(z12);
                            o4 o4Var4 = o4Var3;
                            y0Var2.setPadding(org.telegram.messenger.g0.L(18.0f), 0, org.telegram.messenger.g0.L(18.0f), 0);
                            int i16 = org.telegram.ui.ActionBar.k6.E8;
                            y0Var2.c(i16, org.telegram.ui.ActionBar.k6.F8);
                            y0Var2.h(0.12f, i16);
                            if (tL_starGiftCollection.icon != null) {
                                m4 m4Var = new m4(3, i10, tL_starGiftCollection.icon);
                                s8Var2 = s8Var3;
                                y0Var2.getImageView().addOnAttachStateChangeListener(new f2(m4Var, 10));
                                y0Var2.j(tL_starGiftCollection.title, 0, m4Var);
                            } else {
                                s8Var2 = s8Var3;
                                y0Var2.j(tL_starGiftCollection.title, R.drawable.msg_folders, null);
                            }
                            ArrayList arrayList2 = d;
                            LinearLayout linearLayout3 = linearLayout2;
                            y0Var2.setOnClickListener(new x3(o4Var4, z12, tL_starGiftCollection, savedStarGift2, I, 0));
                            linearLayout3.addView(y0Var2, mf.o(-1, -2));
                            d = arrayList2;
                            linearLayout2 = linearLayout3;
                            size = size;
                            o4Var3 = o4Var4;
                            i12 = i13;
                            q2Var3 = q2Var4;
                            s8Var3 = s8Var2;
                            z16 = true;
                        }
                        o4Var = o4Var3;
                        q2Var = q2Var3;
                        s8Var = s8Var3;
                        r42 = 0;
                        I.c(R.drawable.msg_addfolder, bd.M0(2131750403, null), new y3(I, J, r42), false);
                        I.k();
                    } else {
                        o4Var = o4Var3;
                        r42 = 0;
                        q2Var = q2Var3;
                        s8Var = s8Var3;
                    }
                    if (savedStarGift2.gift instanceof TL_stars.TL_starGiftUnique) {
                        if (!vp0Var.c() || o4Var.d || (savedStarGift2.unsaved && savedStarGift2.pinned_to_top)) {
                            o4Var2 = o4Var;
                            savedStarGift = savedStarGift2;
                            q2Var2 = q2Var;
                            str = null;
                            z10 = r42;
                            if (vp0Var.c() && o4Var2.d) {
                                z11 = true;
                                I.c(R.drawable.tabs_reorder, bd.M0(2131750041, null), new a4(o4Var2, true ? 1 : 0), z10);
                                starGift = savedStarGift.gift;
                                tL_starGiftUnique = (TL_stars.TL_starGiftUnique) starGift;
                                if (starGift.slug == null) {
                                    str2 = hp.s1(i10).V2 + "/nft/" + savedStarGift.gift.slug;
                                } else {
                                    str2 = str;
                                }
                                if (ci.l6.L1(i10, org.telegram.messenger.m5.o(tL_starGiftUnique.owner_id))) {
                                    boolean M1 = ci.l6.M1(i10, tL_starGiftUnique);
                                    int i17 = M1 ? R.drawable.menu_takeoff : R.drawable.menu_wear;
                                    String M0 = bd.M0(M1 ? 2131749887 : 2131749850, str);
                                    final int i18 = z10 ? 1 : 0;
                                    I.c(i17, M0, new Runnable() { // from class: ai.b4
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            switch (i18) {
                                                case 0:
                                                    o4 o4Var5 = o4Var2;
                                                    n4 n4Var = new n4(o4Var5, o4Var5.getContext(), o4Var5.b, o4Var5.a.c, o4Var5.c, 0);
                                                    n4Var.j2(savedStarGift, null);
                                                    n4Var.t2(false);
                                                    break;
                                                case 1:
                                                    o4 o4Var6 = o4Var2;
                                                    n4 n4Var2 = new n4(o4Var6, o4Var6.getContext(), o4Var6.b, o4Var6.a.c, o4Var6.c, 1);
                                                    n4Var2.j2(savedStarGift, null);
                                                    n4Var2.O1();
                                                    break;
                                                default:
                                                    o4 o4Var7 = o4Var2;
                                                    n4 n4Var3 = new n4(o4Var7, o4Var7.getContext(), o4Var7.b, o4Var7.a.c, o4Var7.c, 2);
                                                    n4Var3.j2(savedStarGift, null);
                                                    n4Var3.W1();
                                                    break;
                                            }
                                        }
                                    }, z10);
                                }
                                I.l(R.drawable.msg_link2, bd.M0(2131751762, str), new a1.f(6, o4Var2, str2), str2 == null ? z11 ? 1 : 0 : z10 ? 1 : 0);
                                boolean z17 = str2 == null ? z11 ? 1 : 0 : z10 ? 1 : 0;
                                String M02 = bd.M0(2131745469, str);
                                final int i19 = z11 ? 1 : 0;
                                I.l(R.drawable.msg_share, M02, new Runnable() { // from class: ai.b4
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i19) {
                                            case 0:
                                                o4 o4Var5 = o4Var2;
                                                n4 n4Var = new n4(o4Var5, o4Var5.getContext(), o4Var5.b, o4Var5.a.c, o4Var5.c, 0);
                                                n4Var.j2(savedStarGift, null);
                                                n4Var.t2(false);
                                                break;
                                            case 1:
                                                o4 o4Var6 = o4Var2;
                                                n4 n4Var2 = new n4(o4Var6, o4Var6.getContext(), o4Var6.b, o4Var6.a.c, o4Var6.c, 1);
                                                n4Var2.j2(savedStarGift, null);
                                                n4Var2.O1();
                                                break;
                                            default:
                                                o4 o4Var7 = o4Var2;
                                                n4 n4Var3 = new n4(o4Var7, o4Var7.getContext(), o4Var7.b, o4Var7.a.c, o4Var7.c, 2);
                                                n4Var3.j2(savedStarGift, null);
                                                n4Var3.W1();
                                                break;
                                        }
                                    }
                                }, z17);
                                r5 = z11;
                            }
                        } else {
                            boolean z18 = savedStarGift2.pinned_to_top;
                            int i20 = z18 ? R.drawable.msg_unpin : R.drawable.msg_pin;
                            if (z18) {
                                i3 = 2131749892;
                                str = null;
                            } else {
                                str = null;
                                i3 = 2131750086;
                            }
                            savedStarGift = savedStarGift2;
                            q2Var2 = q2Var;
                            o4Var2 = o4Var;
                            z10 = r42;
                            I.c(i20, bd.M0(i3, str), new z3(o4Var2, savedStarGift, q2Var2, view, 0), z10);
                            I.l(R.drawable.tabs_reorder, bd.M0(2131750041, str), new a4(o4Var2, z10 ? 1 : 0), savedStarGift.pinned_to_top);
                        }
                        z11 = true;
                        starGift = savedStarGift.gift;
                        tL_starGiftUnique = (TL_stars.TL_starGiftUnique) starGift;
                        if (starGift.slug == null) {
                        }
                        if (ci.l6.L1(i10, org.telegram.messenger.m5.o(tL_starGiftUnique.owner_id))) {
                        }
                        I.l(R.drawable.msg_link2, bd.M0(2131751762, str), new a1.f(6, o4Var2, str2), str2 == null ? z11 ? 1 : 0 : z10 ? 1 : 0);
                        if (str2 == null) {
                        }
                        String M022 = bd.M0(2131745469, str);
                        final int i192 = z11 ? 1 : 0;
                        I.l(R.drawable.msg_share, M022, new Runnable() { // from class: ai.b4
                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i192) {
                                    case 0:
                                        o4 o4Var5 = o4Var2;
                                        n4 n4Var = new n4(o4Var5, o4Var5.getContext(), o4Var5.b, o4Var5.a.c, o4Var5.c, 0);
                                        n4Var.j2(savedStarGift, null);
                                        n4Var.t2(false);
                                        break;
                                    case 1:
                                        o4 o4Var6 = o4Var2;
                                        n4 n4Var2 = new n4(o4Var6, o4Var6.getContext(), o4Var6.b, o4Var6.a.c, o4Var6.c, 1);
                                        n4Var2.j2(savedStarGift, null);
                                        n4Var2.O1();
                                        break;
                                    default:
                                        o4 o4Var7 = o4Var2;
                                        n4 n4Var3 = new n4(o4Var7, o4Var7.getContext(), o4Var7.b, o4Var7.a.c, o4Var7.c, 2);
                                        n4Var3.j2(savedStarGift, null);
                                        n4Var3.W1();
                                        break;
                                }
                            }
                        }, z17);
                        r5 = z11;
                    } else {
                        o4Var2 = o4Var;
                        savedStarGift = savedStarGift2;
                        q2Var2 = q2Var;
                        r5 = 1;
                        r5 = 1;
                        r5 = 1;
                        str = null;
                        z10 = r42;
                        if (vp0Var.c() && o4Var2.d) {
                            I.c(R.drawable.tabs_reorder, bd.M0(2131750041, null), new a4(o4Var2, 3), z10);
                        }
                    }
                    final int i21 = 2;
                    if (ci.l6.L1(i10, vp0Var.c)) {
                        boolean z19 = savedStarGift.unsaved;
                        I.c(z19 ? R.drawable.msg_message : R.drawable.menu_hide_gift, bd.M0(z19 ? 2131749989 : 2131750195, str), new k3(o4Var2, savedStarGift, q2Var2, i21), z10);
                    }
                    TL_stars.StarGift starGift2 = savedStarGift.gift;
                    if (starGift2 instanceof TL_stars.TL_starGiftUnique) {
                        I.l(R.drawable.menu_transfer, bd.M0(2131749926, str), new Runnable() { // from class: ai.b4
                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i21) {
                                    case 0:
                                        o4 o4Var5 = o4Var2;
                                        n4 n4Var = new n4(o4Var5, o4Var5.getContext(), o4Var5.b, o4Var5.a.c, o4Var5.c, 0);
                                        n4Var.j2(savedStarGift, null);
                                        n4Var.t2(false);
                                        break;
                                    case 1:
                                        o4 o4Var6 = o4Var2;
                                        n4 n4Var2 = new n4(o4Var6, o4Var6.getContext(), o4Var6.b, o4Var6.a.c, o4Var6.c, 1);
                                        n4Var2.j2(savedStarGift, null);
                                        n4Var2.O1();
                                        break;
                                    default:
                                        o4 o4Var7 = o4Var2;
                                        n4 n4Var3 = new n4(o4Var7, o4Var7.getContext(), o4Var7.b, o4Var7.a.c, o4Var7.c, 2);
                                        n4Var3.j2(savedStarGift, null);
                                        n4Var3.W1();
                                        break;
                                }
                            }
                        }, org.telegram.messenger.m5.o(((TL_stars.TL_starGiftUnique) starGift2).owner_id) == h10.i(i10).e() ? r5 : z10 ? 1 : 0);
                    }
                    if (s8Var.h() && o4Var2.d) {
                        I.c(R.drawable.msg_removefolder, bd.M0(2131750047, str), new k3(o4Var2, savedStarGift, (Object) I, (int) r5), r5);
                        I.E();
                        I.t();
                    }
                    if (I.x() > 0) {
                        I.V(5);
                        I.u = r5;
                        I.v = r5;
                        I.L = r5;
                        Point point = org.telegram.messenger.g0.q;
                        int min = Math.min(point.x, point.y);
                        I.N = min - org.telegram.messenger.g0.L(32.0f);
                        I.O = (int) (min * 0.6f);
                        I.P = r5;
                        I.W = r5;
                        I.Z();
                        q2Var2.E.getImageReceiver().P0(r5);
                        z13 = r5;
                    }
                    z13 = z10;
                }
            }
            z10 = false;
            z13 = z10;
        }
        return Boolean.valueOf(z13);
    }

    @Override // org.telegram.messenger.s10
    public void j(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        r31 r31Var = (r31) obj;
        o4 o4Var = this.a;
        vp0 vp0Var = o4Var.a;
        int i3 = o4Var.b;
        if (o4Var.e == null) {
            return;
        }
        Object obj3 = r31Var.G;
        if (obj3 instanceof TL_stars.SavedStarGift) {
            TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj3;
            if (!o4Var.h) {
                ci.l6 l6Var = new ci.l6(o4Var.getContext(), o4Var.b, vp0Var.c, o4Var.c, null);
                int i10 = 2;
                l6Var.d3 = new a4(o4Var, i10);
                l6Var.K2 = new n(i10, o4Var, savedStarGift);
                l6Var.j2(savedStarGift, o4Var.e);
                l6Var.show();
                return;
            }
            if (!o4Var.d && (savedStarGift.gift instanceof TL_stars.TL_starGiftUnique)) {
                boolean z10 = savedStarGift.pinned_to_top;
                boolean z11 = !z10;
                if (!z10 && savedStarGift.unsaved) {
                    savedStarGift.unsaved = false;
                    TL_stars.saveStarGift savestargift = new TL_stars.saveStarGift();
                    savestargift.stargift = o4Var.e.h(savedStarGift);
                    savestargift.unsave = savedStarGift.unsaved;
                    ConnectionsManager.getInstance(i3).sendRequest(savestargift, null, 64);
                }
                if (o4Var.e.o(savedStarGift, z11, true)) {
                    fc.a0(vp0Var.a).Q(R.raw.chats_infotip, 36, bd.H(',', "GiftsPinLimit", hp.s1(i3).K6)).j();
                }
                if (z10) {
                    return;
                }
                o4Var.f.v0(0);
            }
        }
    }
}
