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

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class jq8 implements n8c, o8c {
    public final /* synthetic */ pq8 a;

    public /* synthetic */ jq8(pq8 pq8Var) {
        this.a = pq8Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:68:0x02f7  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x031e  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0370  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0317  */
    @Override // o8c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Boolean d(c4c c4cVar, View view, Integer num, Float f, Float f2) {
        boolean z;
        pq8 pq8Var;
        TL_stars.SavedStarGift savedStarGift;
        nv4 nv4Var;
        final pq8 pq8Var2;
        final TL_stars.SavedStarGift savedStarGift2;
        nv4 nv4Var2;
        boolean z2;
        String str;
        byte b;
        TL_stars.StarGift starGift;
        int i;
        int i2;
        String str2;
        int i3;
        int i4;
        String M0;
        int i5;
        nv4 nv4Var3;
        LinearLayout linearLayout;
        boolean z3;
        TL_stars.SavedStarGift savedStarGift3;
        pq8 pq8Var3 = this.a;
        int i6 = pq8Var3.b;
        lca lcaVar = pq8Var3.a;
        boolean z4 = false;
        int i7 = 0;
        if (pq8Var3.e != null) {
            if (view instanceof nv4) {
                Object obj = c4cVar.H;
                if (obj instanceof TL_stars.SavedStarGift) {
                    nv4 nv4Var4 = (nv4) view;
                    TL_stars.SavedStarGift savedStarGift4 = (TL_stars.SavedStarGift) obj;
                    d dVar = lcaVar.a;
                    wsa wsaVar = lcaVar.e;
                    cs5 J = cs5.J(dVar, view);
                    lcaVar.J = J;
                    byte b2 = 5;
                    byte b3 = 2;
                    if (wsaVar.h()) {
                        if (!pq8Var3.d) {
                            wsaVar.d().size();
                        }
                        cs5 K = J.K();
                        K.b(R.drawable.ic_ab_back, k96.M0(2131753753, null), new en1(J, b3), false);
                        K.j();
                        zh3 zh3Var = new zh3(pq8Var3.getContext(), b2);
                        LinearLayout linearLayout2 = new LinearLayout(pq8Var3.getContext());
                        zh3Var.addView(linearLayout2);
                        linearLayout2.setOrientation(1);
                        boolean z5 = true;
                        K.q(zh3Var, nme.o(-1, -2));
                        if (wsaVar.d().size() + 1 < na7.q1(i6).k4.x.f()) {
                            a8 a8Var = new a8(0, pq8Var3.c, pq8Var3.getContext(), false, false);
                            a8Var.setPadding(gl.L(18.0f), 0, gl.L(18.0f), 0);
                            int i8 = bkb.D8;
                            a8Var.c(i8, bkb.E8);
                            a8Var.h(0.12f, i8);
                            a8Var.j(k96.M0(2131750082, null), R.drawable.menu_folder_add, null);
                            a8Var.setOnClickListener(new hu4(pq8Var3, J, savedStarGift4, (byte) 17));
                            linearLayout2.addView(a8Var, nme.o(-1, -2));
                        }
                        ArrayList d = wsaVar.d();
                        int size = d.size();
                        int i9 = 0;
                        LinearLayout linearLayout3 = linearLayout2;
                        while (i9 < size) {
                            int i10 = i9 + 1;
                            TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) d.get(i9);
                            ArrayList arrayList = wsaVar.e(tL_starGiftCollection.collection_id).l;
                            int size2 = arrayList.size();
                            while (true) {
                                if (i7 >= size2) {
                                    nv4Var3 = nv4Var4;
                                    linearLayout = linearLayout3;
                                    z3 = false;
                                    break;
                                }
                                Object obj2 = arrayList.get(i7);
                                i7++;
                                nv4Var3 = nv4Var4;
                                if (gta.h((TL_stars.SavedStarGift) obj2, savedStarGift4)) {
                                    linearLayout = linearLayout3;
                                    z3 = z5;
                                    break;
                                }
                                nv4Var4 = nv4Var3;
                            }
                            a8 a8Var2 = new a8(2, pq8Var3.c, pq8Var3.getContext(), false, false);
                            a8Var2.setChecked(z3);
                            pq8 pq8Var4 = pq8Var3;
                            a8Var2.setPadding(gl.L(18.0f), 0, gl.L(18.0f), 0);
                            int i11 = bkb.D8;
                            a8Var2.c(i11, bkb.E8);
                            a8Var2.h(0.12f, i11);
                            if (tL_starGiftCollection.icon != null) {
                                nq8 nq8Var = new nq8(3, i6, tL_starGiftCollection.icon);
                                ImageView imageView = a8Var2.getImageView();
                                savedStarGift3 = savedStarGift4;
                                imageView.addOnAttachStateChangeListener(new wc(nq8Var, z5 ? (byte) 1 : (byte) 0));
                                a8Var2.j(tL_starGiftCollection.title, 0, nq8Var);
                            } else {
                                savedStarGift3 = savedStarGift4;
                                a8Var2.j(tL_starGiftCollection.title, R.drawable.msg_folders, null);
                            }
                            ArrayList arrayList2 = d;
                            int i12 = size;
                            TL_stars.SavedStarGift savedStarGift5 = savedStarGift3;
                            a8Var2.setOnClickListener(new x27(pq8Var4, z3, tL_starGiftCollection, savedStarGift5, J, (byte) 1));
                            linearLayout.addView(a8Var2, nme.o(-1, -2));
                            linearLayout3 = linearLayout;
                            pq8Var3 = pq8Var4;
                            savedStarGift4 = savedStarGift5;
                            d = arrayList2;
                            size = i12;
                            i9 = i10;
                            nv4Var4 = nv4Var3;
                            z5 = true;
                            i7 = 0;
                        }
                        pq8Var = pq8Var3;
                        savedStarGift = savedStarGift4;
                        nv4Var = nv4Var4;
                        J.b(R.drawable.msg_addfolder, k96.M0(2131750379, null), new c10(J, K, (byte) 7), false);
                        J.j();
                    } else {
                        pq8Var = pq8Var3;
                        savedStarGift = savedStarGift4;
                        nv4Var = nv4Var4;
                    }
                    if (savedStarGift.gift instanceof TL_stars.TL_starGiftUnique) {
                        if (!lcaVar.c() || pq8Var.d || (savedStarGift.unsaved && savedStarGift.pinned_to_top)) {
                            pq8Var2 = pq8Var;
                            savedStarGift2 = savedStarGift;
                            nv4Var2 = nv4Var;
                            z2 = true;
                            z2 = true;
                            z2 = true;
                            str = null;
                            if (lcaVar.c() && pq8Var2.d) {
                                J.b(R.drawable.tabs_reorder, k96.M0(2131750017, null), new eq8(pq8Var2, z2 ? (byte) 1 : (byte) 0), false);
                            }
                        } else {
                            if (savedStarGift.pinned_to_top) {
                                str = null;
                                M0 = k96.M0(2131749868, null);
                                i5 = R.drawable.msg_unpin;
                            } else {
                                str = null;
                                M0 = k96.M0(2131750062, null);
                                i5 = R.drawable.msg_pin;
                            }
                            pq8 pq8Var5 = pq8Var;
                            int i13 = i5;
                            pq8Var2 = pq8Var5;
                            savedStarGift2 = savedStarGift;
                            nv4Var2 = nv4Var;
                            z2 = true;
                            J.b(i13, M0, new bm8((Object) pq8Var2, (Object) savedStarGift2, (Object) nv4Var2, (Object) view, (byte) 3), false);
                            J.k(R.drawable.tabs_reorder, k96.M0(2131750017, str), new eq8(pq8Var2, (byte) 0), savedStarGift2.pinned_to_top);
                        }
                        TL_stars.StarGift starGift2 = savedStarGift2.gift;
                        TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) starGift2;
                        if (starGift2.slug != null) {
                            str2 = na7.q1(i6).N2 + "/nft/" + savedStarGift2.gift.slug;
                        } else {
                            str2 = str;
                        }
                        if (vqa.G1(i6, cf3.n(tL_starGiftUnique.owner_id))) {
                            if (vqa.I1(i6, tL_starGiftUnique)) {
                                i3 = R.drawable.menu_takeoff;
                                i4 = 2131749863;
                            } else {
                                i3 = R.drawable.menu_wear;
                                i4 = 2131749826;
                            }
                            final byte b4 = 0;
                            J.b(i3, k96.M0(i4, str), new Runnable() { // from class: fq8
                                @Override // java.lang.Runnable
                                public final void run() {
                                    byte b5 = b4;
                                    TL_stars.SavedStarGift savedStarGift6 = savedStarGift2;
                                    switch (b5) {
                                        case 0:
                                            pq8 pq8Var6 = pq8Var2;
                                            oq8 oq8Var = new oq8(pq8Var6, pq8Var6.getContext(), pq8Var6.b, pq8Var6.a.c, pq8Var6.c, (byte) 0);
                                            oq8Var.n2(savedStarGift6, null);
                                            oq8Var.A2(false);
                                            break;
                                        case 1:
                                            pq8 pq8Var7 = pq8Var2;
                                            oq8 oq8Var2 = new oq8(pq8Var7, pq8Var7.getContext(), pq8Var7.b, pq8Var7.a.c, pq8Var7.c, (byte) 1);
                                            oq8Var2.n2(savedStarGift6, null);
                                            oq8Var2.N1();
                                            break;
                                        default:
                                            pq8 pq8Var8 = pq8Var2;
                                            oq8 oq8Var3 = new oq8(pq8Var8, pq8Var8.getContext(), pq8Var8.b, pq8Var8.a.c, pq8Var8.c, (byte) 2);
                                            oq8Var3.n2(savedStarGift6, null);
                                            oq8Var3.a2();
                                            break;
                                    }
                                }
                            }, false);
                        }
                        J.k(R.drawable.msg_link2, k96.M0(2131751750, str), new ll8(pq8Var2, str2, (byte) 18), str2 != null ? z2 ? 1 : 0 : false);
                        boolean z6 = str2 != null ? z2 ? 1 : 0 : false;
                        String M02 = k96.M0(2131745267, str);
                        final byte b5 = z2 ? (byte) 1 : (byte) 0;
                        J.k(R.drawable.msg_share, M02, new Runnable() { // from class: fq8
                            @Override // java.lang.Runnable
                            public final void run() {
                                byte b52 = b5;
                                TL_stars.SavedStarGift savedStarGift6 = savedStarGift2;
                                switch (b52) {
                                    case 0:
                                        pq8 pq8Var6 = pq8Var2;
                                        oq8 oq8Var = new oq8(pq8Var6, pq8Var6.getContext(), pq8Var6.b, pq8Var6.a.c, pq8Var6.c, (byte) 0);
                                        oq8Var.n2(savedStarGift6, null);
                                        oq8Var.A2(false);
                                        break;
                                    case 1:
                                        pq8 pq8Var7 = pq8Var2;
                                        oq8 oq8Var2 = new oq8(pq8Var7, pq8Var7.getContext(), pq8Var7.b, pq8Var7.a.c, pq8Var7.c, (byte) 1);
                                        oq8Var2.n2(savedStarGift6, null);
                                        oq8Var2.N1();
                                        break;
                                    default:
                                        pq8 pq8Var8 = pq8Var2;
                                        oq8 oq8Var3 = new oq8(pq8Var8, pq8Var8.getContext(), pq8Var8.b, pq8Var8.a.c, pq8Var8.c, (byte) 2);
                                        oq8Var3.n2(savedStarGift6, null);
                                        oq8Var3.a2();
                                        break;
                                }
                            }
                        }, z6);
                    } else {
                        pq8Var2 = pq8Var;
                        savedStarGift2 = savedStarGift;
                        nv4Var2 = nv4Var;
                        z2 = true;
                        z2 = true;
                        z2 = true;
                        str = null;
                        if (lcaVar.c() && pq8Var2.d) {
                            b = 3;
                            J.b(R.drawable.tabs_reorder, k96.M0(2131750017, null), new eq8(pq8Var2, b), false);
                            if (vqa.G1(i6, lcaVar.c)) {
                                z = false;
                            } else {
                                if (savedStarGift2.unsaved) {
                                    i = R.drawable.msg_message;
                                    i2 = 2131749965;
                                } else {
                                    i = R.drawable.menu_hide_gift;
                                    i2 = 2131750171;
                                }
                                z = false;
                                J.b(i, k96.M0(i2, str), new gm8(pq8Var2, savedStarGift2, nv4Var2, (byte) 4), false);
                            }
                            starGift = savedStarGift2.gift;
                            if (starGift instanceof TL_stars.TL_starGiftUnique) {
                                final byte b6 = 2;
                                J.k(R.drawable.menu_transfer, k96.M0(2131749902, str), new Runnable() { // from class: fq8
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        byte b52 = b6;
                                        TL_stars.SavedStarGift savedStarGift6 = savedStarGift2;
                                        switch (b52) {
                                            case 0:
                                                pq8 pq8Var6 = pq8Var2;
                                                oq8 oq8Var = new oq8(pq8Var6, pq8Var6.getContext(), pq8Var6.b, pq8Var6.a.c, pq8Var6.c, (byte) 0);
                                                oq8Var.n2(savedStarGift6, null);
                                                oq8Var.A2(false);
                                                break;
                                            case 1:
                                                pq8 pq8Var7 = pq8Var2;
                                                oq8 oq8Var2 = new oq8(pq8Var7, pq8Var7.getContext(), pq8Var7.b, pq8Var7.a.c, pq8Var7.c, (byte) 1);
                                                oq8Var2.n2(savedStarGift6, null);
                                                oq8Var2.N1();
                                                break;
                                            default:
                                                pq8 pq8Var8 = pq8Var2;
                                                oq8 oq8Var3 = new oq8(pq8Var8, pq8Var8.getContext(), pq8Var8.b, pq8Var8.a.c, pq8Var8.c, (byte) 2);
                                                oq8Var3.n2(savedStarGift6, null);
                                                oq8Var3.a2();
                                                break;
                                        }
                                    }
                                }, cf3.n(((TL_stars.TL_starGiftUnique) starGift).owner_id) == y6c.h(i6).e() ? z2 : z);
                            }
                            if (wsaVar.h() && pq8Var2.d) {
                                J.b(R.drawable.msg_removefolder, k96.M0(2131750023, str), new gm8(pq8Var2, savedStarGift2, J, b), z2);
                                J.F();
                                J.t();
                            }
                            if (J.y() > 0) {
                                J.W(5);
                                J.u = z2;
                                J.v = z2;
                                J.L = z2;
                                Point point = gl.q;
                                int min = Math.min(point.x, point.y);
                                J.N = min - gl.L(32.0f);
                                J.O = (int) (min * 0.6f);
                                J.S = z2;
                                J.Z = z2;
                                J.a0();
                                nv4Var2.E.getImageReceiver().w0(z2);
                                z4 = z2;
                            }
                            z4 = z;
                        }
                    }
                    b = 3;
                    if (vqa.G1(i6, lcaVar.c)) {
                    }
                    starGift = savedStarGift2.gift;
                    if (starGift instanceof TL_stars.TL_starGiftUnique) {
                    }
                    if (wsaVar.h()) {
                        J.b(R.drawable.msg_removefolder, k96.M0(2131750023, str), new gm8(pq8Var2, savedStarGift2, J, b), z2);
                        J.F();
                        J.t();
                    }
                    if (J.y() > 0) {
                    }
                    z4 = z;
                }
            }
            z = false;
            z4 = z;
        }
        return Boolean.valueOf(z4);
    }

    @Override // n8c
    public final void j(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        c4c c4cVar = (c4c) obj;
        pq8 pq8Var = this.a;
        lca lcaVar = pq8Var.a;
        int i = pq8Var.b;
        if (pq8Var.e != null) {
            Object obj3 = c4cVar.H;
            if (obj3 instanceof TL_stars.SavedStarGift) {
                TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj3;
                byte b = 0;
                if (!pq8Var.h) {
                    vqa vqaVar = new vqa(pq8Var.getContext(), pq8Var.b, lcaVar.c, pq8Var.c, null);
                    vqaVar.i3 = new eq8(pq8Var, (byte) 2);
                    vqaVar.M2 = new kq8(pq8Var, savedStarGift, b);
                    vqaVar.n2(savedStarGift, pq8Var.e);
                    vqaVar.show();
                    return;
                }
                if (pq8Var.d || !(savedStarGift.gift instanceof TL_stars.TL_starGiftUnique)) {
                    return;
                }
                boolean z = savedStarGift.pinned_to_top;
                boolean z2 = !z;
                if (!z && savedStarGift.unsaved) {
                    savedStarGift.unsaved = false;
                    TL_stars.saveStarGift savestargift = new TL_stars.saveStarGift();
                    savestargift.stargift = pq8Var.e.h(savedStarGift);
                    savestargift.unsave = savedStarGift.unsaved;
                    ConnectionsManager.getInstance(i).sendRequest(savestargift, null, 64);
                }
                if (pq8Var.e.q(savedStarGift, z2, true)) {
                    u21.b0(lcaVar.a).Q(R.raw.chats_infotip, 36, k96.H(',', "GiftsPinLimit", na7.q1(i).k4.J1.f())).j();
                }
                if (z) {
                    return;
                }
                pq8Var.f.w0(0);
            }
        }
    }
}
