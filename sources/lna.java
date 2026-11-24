// default package

import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Wallet.c;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class lna implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ vqa b;

    public /* synthetic */ lna(vqa vqaVar, byte b) {
        this.a = b;
        this.b = vqaVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:201:0x02e5, code lost:
    
        if (r2 != null) goto L179;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0172, code lost:
    
        if (cf3.n(r15) == y6c.h(r0.a).e()) goto L79;
     */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x02f7  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0316  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x033d  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0360  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0380  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x03a1  */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onClick(View view) {
        long j;
        boolean z;
        boolean z2;
        TL_stars.TL_starGiftUnique A1;
        boolean z3;
        boolean z4;
        boolean z5;
        TL_stars.TL_starGiftUnique tL_starGiftUnique;
        TLRPC.Message message;
        long n;
        boolean z6;
        ArrayList<TL_stars.StarsAmount> arrayList;
        long n2;
        String x;
        byte b = this.a;
        byte b2 = 16;
        byte b3 = 0;
        byte b4 = 1;
        final vqa vqaVar = this.b;
        switch (b) {
            case 0:
                vqaVar.X1();
                break;
            case 1:
                vqaVar.M1();
                break;
            case 2:
                vqaVar.onBackPressed();
                break;
            case 3:
                hqa hqaVar = vqaVar.K2;
                hqaVar.h.e();
                hqaVar.i.e();
                hqaVar.j.e();
                hqaVar.k.e();
                break;
            case 4:
                vqaVar.R1();
                break;
            case 5:
                rlc rlcVar = vqaVar.c3;
                if (rlcVar != null) {
                    vqaVar.dismiss();
                    gl.d3(new z6a(rlcVar, b2), 250L);
                    break;
                }
                break;
            case 6:
                vqaVar.f2();
                break;
            case 7:
                vqaVar.R1();
                break;
            case 8:
                if (vqaVar.A1() != null && vqaVar.A1().host_id != null) {
                    vqaVar.S1();
                    break;
                } else {
                    ir2.v(null, 2131749816, vqaVar.j(), R.raw.info, 36);
                    break;
                }
            case 9:
                vqaVar.T2 = true;
                vqaVar.A2(false);
                break;
            case 10:
                vqaVar.onBackPressed();
                break;
            case 11:
                vqaVar.onBackPressed();
                break;
            case 12:
                vqaVar.l1();
                break;
            case 13:
                vqaVar.d2();
                break;
            case 14:
                vqaVar.d2();
                break;
            case 15:
                vqaVar.onBackPressed();
                break;
            case 16:
                vqaVar.dismiss();
                break;
            case 17:
                vqaVar.M1();
                break;
            case 18:
                vqaVar.d2();
                break;
            case 19:
                vqaVar.onBackPressed();
                break;
            case 20:
                vqaVar.T1(true);
                break;
            case 21:
                vqaVar.d2();
                break;
            case 22:
                if (view.getAlpha() >= 1.0f) {
                    u41 u41Var = vqaVar.f2;
                    u41Var.i(k96.M0(2131749771, null), true, true);
                    u41Var.g(null, true);
                    u41Var.setOnClickListener(new roa(vqaVar, (byte) 3));
                    vqaVar.a2.i(3, k96.M0(2131749763, null), k96.M0(2131749764, null), null);
                    vqaVar.z2(3, true, null);
                    break;
                }
                break;
            case 23:
                if (!vqaVar.f2.R) {
                    vqaVar.r2.a(!r0.a.q, true);
                    break;
                }
                break;
            case 24:
                final TL_stars.TL_starGiftUnique A12 = vqaVar.A1();
                if (A12 != null && !TextUtils.isEmpty(A12.slug)) {
                    final boolean z7 = A12.host_id == null;
                    if (vqaVar.u3 == null) {
                        vqaVar.u3 = Boolean.valueOf(!z7);
                    }
                    vqaVar.q2(A12, z7);
                    final int i = vqaVar.t3 + 1;
                    vqaVar.t3 = i;
                    TL_stars.displayStarGift displaystargift = new TL_stars.displayStarGift();
                    displaystargift.peer = z7 ? na7.q1(vqaVar.a).h1(y6c.h(vqaVar.a).e()) : null;
                    displaystargift.slug = A12.slug;
                    ConnectionsManager.getInstance(vqaVar.a).sendRequestTyped(displaystargift, new hc(b3), new i8c() { // from class: rna
                        @Override // i8c
                        public final void a(Object obj, Object obj2) {
                            TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                            boolean z8 = ((TLRPC.Bool) obj) instanceof TLRPC.TL_boolTrue;
                            vqa vqaVar2 = vqa.this;
                            if (z8) {
                                vqaVar2.u3 = Boolean.valueOf(z7);
                                return;
                            }
                            if (i != vqaVar2.t3) {
                                return;
                            }
                            vqaVar2.q2(A12, vqaVar2.u3.booleanValue());
                            vqaVar2.j().f0(tL_error != null ? tL_error.text : "NULL_ERROR", false);
                        }
                    });
                    break;
                }
                break;
            case 25:
                String v1 = vqaVar.v1();
                TL_stars.TL_starGiftUnique A13 = vqaVar.A1();
                vqaVar.T1.getLocationInWindow(new int[2]);
                cs5 G = cs5.G(vqaVar.T1, vqaVar.J0, view);
                boolean z8 = (vqaVar.A1() == null || !vqa.G1(vqaVar.a, cf3.n(vqaVar.A1().owner_id)) || !(vqaVar.B2 instanceof xsa) || vqaVar.A2 == null || vqaVar.u1() == null) ? false : true;
                TL_stars.SavedStarGift savedStarGift = vqaVar.A2;
                G.k((savedStarGift == null || !savedStarGift.pinned_to_top) ? R.drawable.msg_pin : R.drawable.msg_unpin, k96.M0((savedStarGift == null || !savedStarGift.pinned_to_top) ? 2131750062 : 2131749868, null), new nna(vqaVar, (byte) 18), z8);
                G.k(R.drawable.outline_craft, k96.M0(2131749785, null), new nna(vqaVar, (byte) 25), vqaVar.f1());
                G.k(R.drawable.menu_edit_price, k96.M0(2131750248, null), new nna(vqaVar, (byte) 26), (vqaVar.A1() == null || !vqa.G1(vqaVar.a, cf3.n(vqaVar.A1().owner_id)) || vqaVar.A1().resell_amount == null || cq7.u(vqaVar.A1())) ? false : true);
                G.k(R.drawable.msg_link, k96.M0(2131751750, null), new noa(vqaVar, v1, (byte) 7), v1 != null);
                G.k(R.drawable.msg_share, k96.M0(2131745267, null), new nna(vqaVar, (byte) 27), v1 != null);
                if (vqaVar.d3 == null) {
                    int i2 = vqaVar.a;
                    TL_stars.TL_starGiftUnique A14 = vqaVar.A1();
                    if (vqaVar.a3 != null || vqaVar.E1(vqaVar.A1())) {
                        j = 0;
                    } else {
                        TL_stars.TL_starGiftUnique A15 = vqaVar.A1();
                        if (A15 != null && (r15 = A15.host_id) != null) {
                            j = 0;
                            break;
                        } else {
                            j = 0;
                        }
                        z6 = false;
                        HashMap hashMap = vp7.a;
                        if (A14 != null && !TextUtils.isEmpty(A14.gift_address) && !TextUtils.isEmpty(A14.owner_address) && !TextUtils.isEmpty(A14.slug) && !z6 && A14.offer_min_amount > j && (((arrayList = A14.resell_amount) == null || arrayList.isEmpty()) && na7.q1(i2).k4.n0.f)) {
                            n2 = cf3.n(A14.owner_id);
                            if ((n2 != j || n2 != y6c.h(i2).e()) && (TextUtils.isEmpty(A14.owner_address) || (x = c.C(i2).x()) == null || !c.b(A14.owner_address, x))) {
                                z = true;
                                G.k(R.drawable.input_suggest_paid_24, k96.M0(2131749670, null), new nna(vqaVar, (byte) 28), z);
                                if (vqaVar.d3 == null) {
                                    HashMap hashMap2 = vp7.a;
                                    if (A13 != null && TextUtils.isEmpty(A13.owner_address) && A13.offer_min_stars > 0 && A13.owner_id != null) {
                                        z2 = true;
                                        G.k(R.drawable.input_suggest_paid_24, k96.M0(2131749670, null), new nna(vqaVar, (byte) 29), z2);
                                        A1 = vqaVar.A1();
                                        if (A1 != null && A1.theme_available) {
                                            n = cf3.n(A1.owner_id);
                                            long n3 = cf3.n(A1.host_id);
                                            if ((n > j && vqa.G1(vqaVar.a, n)) || (n3 > j && vqa.G1(vqaVar.a, n3))) {
                                                z3 = true;
                                                G.k(R.drawable.msg_colors, k96.M0(2131749421, null), new toa(vqaVar, b3), z3);
                                                boolean z9 = vqaVar.a3 != null && vqaVar.z2 && vqaVar.A2 != null && vqa.F1(vqaVar.a, vqaVar.S1);
                                                TL_stars.SavedStarGift savedStarGift2 = vqaVar.A2;
                                                G.k((savedStarGift2 != null || savedStarGift2.unsaved) ? R.drawable.menu_show_on_profile : R.drawable.menu_hide_from_profile, k96.M0((savedStarGift2 != null || savedStarGift2.unsaved) ? 2131749964 : 2131750172, null), new nna(vqaVar, (byte) 8), z9);
                                                if (vqaVar.a3 == null) {
                                                    if (vqaVar.u1() != null) {
                                                        k27 k27Var = vqaVar.C2;
                                                        if (k27Var != null && (message = k27Var.k) != null) {
                                                            TLRPC.MessageAction messageAction = message.action;
                                                            if (messageAction instanceof TLRPC.TL_messageActionStarGiftUnique) {
                                                                TLRPC.TL_messageActionStarGiftUnique tL_messageActionStarGiftUnique = (TLRPC.TL_messageActionStarGiftUnique) messageAction;
                                                                if ((tL_messageActionStarGiftUnique.flags & 16) != 0) {
                                                                    TL_stars.StarGift starGift = tL_messageActionStarGiftUnique.gift;
                                                                    if (starGift instanceof TL_stars.TL_starGiftUnique) {
                                                                        tL_starGiftUnique = (TL_stars.TL_starGiftUnique) starGift;
                                                                        z5 = vqa.G1(vqaVar.a, cf3.n(tL_starGiftUnique.owner_id));
                                                                        if (z5 && !cq7.m(A13)) {
                                                                            z4 = true;
                                                                            G.k(R.drawable.menu_transfer, k96.M0(2131749902, null), new toa(vqaVar, b4), z4);
                                                                            G.k(R.drawable.menu_transfer, k96.M0(2131749902, null), new nna(vqaVar, (byte) 19), vqaVar.a3 == null || (vqaVar.d3 == null && (vqaVar.x2(A13) || vqaVar.H1(A13))));
                                                                            G.k(R.drawable.menu_feature_paid, k96.M0(2131749525, null), new nna(vqaVar, (byte) 20), (vqaVar.h1() || cq7.m(A13)) ? false : true);
                                                                            G.k(R.drawable.menu_edit_price, k96.M0(2131750248, null), new nna(vqaVar, (byte) 21), !vqaVar.h1() && cq7.m(A13));
                                                                            G.k(R.drawable.msg_delete, k96.M0(2131750416, null), new nna(vqaVar, (byte) 22), !vqaVar.h1() && cq7.m(A13));
                                                                            G.k(R.drawable.msg_view_file, k96.M0(2131749830, null), new nna(vqaVar, (byte) 23), (vqaVar.A2 == null || vqaVar.q1() == j) ? false : true);
                                                                            G.l(R.drawable.msg_delete, new nna(vqaVar, (byte) 24), k96.M0(2131750202, null), vqaVar.g1(), true);
                                                                            G.t = false;
                                                                            G.b0 = true;
                                                                            G.s = (short) 0;
                                                                            G.b0(r8[0] + vqaVar.u0, -gl.L(2.0f));
                                                                            vqaVar.B0(view, G, false);
                                                                            break;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        TL_stars.SavedStarGift savedStarGift3 = vqaVar.A2;
                                                        if (savedStarGift3 != null) {
                                                            TL_stars.StarGift starGift2 = savedStarGift3.gift;
                                                            if (starGift2 instanceof TL_stars.TL_starGiftUnique) {
                                                                tL_starGiftUnique = (TL_stars.TL_starGiftUnique) starGift2;
                                                                z5 = vqa.G1(vqaVar.a, cf3.n(tL_starGiftUnique.owner_id));
                                                                if (z5) {
                                                                    z4 = true;
                                                                    G.k(R.drawable.menu_transfer, k96.M0(2131749902, null), new toa(vqaVar, b4), z4);
                                                                    G.k(R.drawable.menu_transfer, k96.M0(2131749902, null), new nna(vqaVar, (byte) 19), vqaVar.a3 == null || (vqaVar.d3 == null && (vqaVar.x2(A13) || vqaVar.H1(A13))));
                                                                    G.k(R.drawable.menu_feature_paid, k96.M0(2131749525, null), new nna(vqaVar, (byte) 20), (vqaVar.h1() || cq7.m(A13)) ? false : true);
                                                                    G.k(R.drawable.menu_edit_price, k96.M0(2131750248, null), new nna(vqaVar, (byte) 21), !vqaVar.h1() && cq7.m(A13));
                                                                    G.k(R.drawable.msg_delete, k96.M0(2131750416, null), new nna(vqaVar, (byte) 22), !vqaVar.h1() && cq7.m(A13));
                                                                    G.k(R.drawable.msg_view_file, k96.M0(2131749830, null), new nna(vqaVar, (byte) 23), (vqaVar.A2 == null || vqaVar.q1() == j) ? false : true);
                                                                    G.l(R.drawable.msg_delete, new nna(vqaVar, (byte) 24), k96.M0(2131750202, null), vqaVar.g1(), true);
                                                                    G.t = false;
                                                                    G.b0 = true;
                                                                    G.s = (short) 0;
                                                                    G.b0(r8[0] + vqaVar.u0, -gl.L(2.0f));
                                                                    vqaVar.B0(view, G, false);
                                                                }
                                                            }
                                                        }
                                                        tL_starGiftUnique = vqaVar.E2;
                                                        break;
                                                    }
                                                    z5 = false;
                                                    if (z5) {
                                                    }
                                                }
                                                z4 = false;
                                                G.k(R.drawable.menu_transfer, k96.M0(2131749902, null), new toa(vqaVar, b4), z4);
                                                G.k(R.drawable.menu_transfer, k96.M0(2131749902, null), new nna(vqaVar, (byte) 19), vqaVar.a3 == null || (vqaVar.d3 == null && (vqaVar.x2(A13) || vqaVar.H1(A13))));
                                                G.k(R.drawable.menu_feature_paid, k96.M0(2131749525, null), new nna(vqaVar, (byte) 20), (vqaVar.h1() || cq7.m(A13)) ? false : true);
                                                G.k(R.drawable.menu_edit_price, k96.M0(2131750248, null), new nna(vqaVar, (byte) 21), !vqaVar.h1() && cq7.m(A13));
                                                G.k(R.drawable.msg_delete, k96.M0(2131750416, null), new nna(vqaVar, (byte) 22), !vqaVar.h1() && cq7.m(A13));
                                                G.k(R.drawable.msg_view_file, k96.M0(2131749830, null), new nna(vqaVar, (byte) 23), (vqaVar.A2 == null || vqaVar.q1() == j) ? false : true);
                                                G.l(R.drawable.msg_delete, new nna(vqaVar, (byte) 24), k96.M0(2131750202, null), vqaVar.g1(), true);
                                                G.t = false;
                                                G.b0 = true;
                                                G.s = (short) 0;
                                                G.b0(r8[0] + vqaVar.u0, -gl.L(2.0f));
                                                vqaVar.B0(view, G, false);
                                            }
                                        }
                                        z3 = false;
                                        G.k(R.drawable.msg_colors, k96.M0(2131749421, null), new toa(vqaVar, b3), z3);
                                        if (vqaVar.a3 != null) {
                                        }
                                        TL_stars.SavedStarGift savedStarGift22 = vqaVar.A2;
                                        G.k((savedStarGift22 != null || savedStarGift22.unsaved) ? R.drawable.menu_show_on_profile : R.drawable.menu_hide_from_profile, k96.M0((savedStarGift22 != null || savedStarGift22.unsaved) ? 2131749964 : 2131750172, null), new nna(vqaVar, (byte) 8), z9);
                                        if (vqaVar.a3 == null) {
                                        }
                                        z4 = false;
                                        G.k(R.drawable.menu_transfer, k96.M0(2131749902, null), new toa(vqaVar, b4), z4);
                                        G.k(R.drawable.menu_transfer, k96.M0(2131749902, null), new nna(vqaVar, (byte) 19), vqaVar.a3 == null || (vqaVar.d3 == null && (vqaVar.x2(A13) || vqaVar.H1(A13))));
                                        G.k(R.drawable.menu_feature_paid, k96.M0(2131749525, null), new nna(vqaVar, (byte) 20), (vqaVar.h1() || cq7.m(A13)) ? false : true);
                                        G.k(R.drawable.menu_edit_price, k96.M0(2131750248, null), new nna(vqaVar, (byte) 21), !vqaVar.h1() && cq7.m(A13));
                                        G.k(R.drawable.msg_delete, k96.M0(2131750416, null), new nna(vqaVar, (byte) 22), !vqaVar.h1() && cq7.m(A13));
                                        G.k(R.drawable.msg_view_file, k96.M0(2131749830, null), new nna(vqaVar, (byte) 23), (vqaVar.A2 == null || vqaVar.q1() == j) ? false : true);
                                        G.l(R.drawable.msg_delete, new nna(vqaVar, (byte) 24), k96.M0(2131750202, null), vqaVar.g1(), true);
                                        G.t = false;
                                        G.b0 = true;
                                        G.s = (short) 0;
                                        G.b0(r8[0] + vqaVar.u0, -gl.L(2.0f));
                                        vqaVar.B0(view, G, false);
                                    }
                                }
                                z2 = false;
                                G.k(R.drawable.input_suggest_paid_24, k96.M0(2131749670, null), new nna(vqaVar, (byte) 29), z2);
                                A1 = vqaVar.A1();
                                if (A1 != null) {
                                    n = cf3.n(A1.owner_id);
                                    long n32 = cf3.n(A1.host_id);
                                    if (n > j) {
                                        z3 = true;
                                        G.k(R.drawable.msg_colors, k96.M0(2131749421, null), new toa(vqaVar, b3), z3);
                                        if (vqaVar.a3 != null) {
                                        }
                                        TL_stars.SavedStarGift savedStarGift222 = vqaVar.A2;
                                        G.k((savedStarGift222 != null || savedStarGift222.unsaved) ? R.drawable.menu_show_on_profile : R.drawable.menu_hide_from_profile, k96.M0((savedStarGift222 != null || savedStarGift222.unsaved) ? 2131749964 : 2131750172, null), new nna(vqaVar, (byte) 8), z9);
                                        if (vqaVar.a3 == null) {
                                        }
                                        z4 = false;
                                        G.k(R.drawable.menu_transfer, k96.M0(2131749902, null), new toa(vqaVar, b4), z4);
                                        G.k(R.drawable.menu_transfer, k96.M0(2131749902, null), new nna(vqaVar, (byte) 19), vqaVar.a3 == null || (vqaVar.d3 == null && (vqaVar.x2(A13) || vqaVar.H1(A13))));
                                        G.k(R.drawable.menu_feature_paid, k96.M0(2131749525, null), new nna(vqaVar, (byte) 20), (vqaVar.h1() || cq7.m(A13)) ? false : true);
                                        G.k(R.drawable.menu_edit_price, k96.M0(2131750248, null), new nna(vqaVar, (byte) 21), !vqaVar.h1() && cq7.m(A13));
                                        G.k(R.drawable.msg_delete, k96.M0(2131750416, null), new nna(vqaVar, (byte) 22), !vqaVar.h1() && cq7.m(A13));
                                        G.k(R.drawable.msg_view_file, k96.M0(2131749830, null), new nna(vqaVar, (byte) 23), (vqaVar.A2 == null || vqaVar.q1() == j) ? false : true);
                                        G.l(R.drawable.msg_delete, new nna(vqaVar, (byte) 24), k96.M0(2131750202, null), vqaVar.g1(), true);
                                        G.t = false;
                                        G.b0 = true;
                                        G.s = (short) 0;
                                        G.b0(r8[0] + vqaVar.u0, -gl.L(2.0f));
                                        vqaVar.B0(view, G, false);
                                    }
                                    z3 = true;
                                    G.k(R.drawable.msg_colors, k96.M0(2131749421, null), new toa(vqaVar, b3), z3);
                                    if (vqaVar.a3 != null) {
                                    }
                                    TL_stars.SavedStarGift savedStarGift2222 = vqaVar.A2;
                                    G.k((savedStarGift2222 != null || savedStarGift2222.unsaved) ? R.drawable.menu_show_on_profile : R.drawable.menu_hide_from_profile, k96.M0((savedStarGift2222 != null || savedStarGift2222.unsaved) ? 2131749964 : 2131750172, null), new nna(vqaVar, (byte) 8), z9);
                                    if (vqaVar.a3 == null) {
                                    }
                                    z4 = false;
                                    G.k(R.drawable.menu_transfer, k96.M0(2131749902, null), new toa(vqaVar, b4), z4);
                                    G.k(R.drawable.menu_transfer, k96.M0(2131749902, null), new nna(vqaVar, (byte) 19), vqaVar.a3 == null || (vqaVar.d3 == null && (vqaVar.x2(A13) || vqaVar.H1(A13))));
                                    G.k(R.drawable.menu_feature_paid, k96.M0(2131749525, null), new nna(vqaVar, (byte) 20), (vqaVar.h1() || cq7.m(A13)) ? false : true);
                                    G.k(R.drawable.menu_edit_price, k96.M0(2131750248, null), new nna(vqaVar, (byte) 21), !vqaVar.h1() && cq7.m(A13));
                                    G.k(R.drawable.msg_delete, k96.M0(2131750416, null), new nna(vqaVar, (byte) 22), !vqaVar.h1() && cq7.m(A13));
                                    G.k(R.drawable.msg_view_file, k96.M0(2131749830, null), new nna(vqaVar, (byte) 23), (vqaVar.A2 == null || vqaVar.q1() == j) ? false : true);
                                    G.l(R.drawable.msg_delete, new nna(vqaVar, (byte) 24), k96.M0(2131750202, null), vqaVar.g1(), true);
                                    G.t = false;
                                    G.b0 = true;
                                    G.s = (short) 0;
                                    G.b0(r8[0] + vqaVar.u0, -gl.L(2.0f));
                                    vqaVar.B0(view, G, false);
                                }
                                z3 = false;
                                G.k(R.drawable.msg_colors, k96.M0(2131749421, null), new toa(vqaVar, b3), z3);
                                if (vqaVar.a3 != null) {
                                }
                                TL_stars.SavedStarGift savedStarGift22222 = vqaVar.A2;
                                G.k((savedStarGift22222 != null || savedStarGift22222.unsaved) ? R.drawable.menu_show_on_profile : R.drawable.menu_hide_from_profile, k96.M0((savedStarGift22222 != null || savedStarGift22222.unsaved) ? 2131749964 : 2131750172, null), new nna(vqaVar, (byte) 8), z9);
                                if (vqaVar.a3 == null) {
                                }
                                z4 = false;
                                G.k(R.drawable.menu_transfer, k96.M0(2131749902, null), new toa(vqaVar, b4), z4);
                                G.k(R.drawable.menu_transfer, k96.M0(2131749902, null), new nna(vqaVar, (byte) 19), vqaVar.a3 == null || (vqaVar.d3 == null && (vqaVar.x2(A13) || vqaVar.H1(A13))));
                                G.k(R.drawable.menu_feature_paid, k96.M0(2131749525, null), new nna(vqaVar, (byte) 20), (vqaVar.h1() || cq7.m(A13)) ? false : true);
                                G.k(R.drawable.menu_edit_price, k96.M0(2131750248, null), new nna(vqaVar, (byte) 21), !vqaVar.h1() && cq7.m(A13));
                                G.k(R.drawable.msg_delete, k96.M0(2131750416, null), new nna(vqaVar, (byte) 22), !vqaVar.h1() && cq7.m(A13));
                                G.k(R.drawable.msg_view_file, k96.M0(2131749830, null), new nna(vqaVar, (byte) 23), (vqaVar.A2 == null || vqaVar.q1() == j) ? false : true);
                                G.l(R.drawable.msg_delete, new nna(vqaVar, (byte) 24), k96.M0(2131750202, null), vqaVar.g1(), true);
                                G.t = false;
                                G.b0 = true;
                                G.s = (short) 0;
                                G.b0(r8[0] + vqaVar.u0, -gl.L(2.0f));
                                vqaVar.B0(view, G, false);
                            }
                        }
                    }
                    z6 = true;
                    HashMap hashMap3 = vp7.a;
                    if (A14 != null) {
                        n2 = cf3.n(A14.owner_id);
                        if (n2 != j) {
                        }
                        z = true;
                        G.k(R.drawable.input_suggest_paid_24, k96.M0(2131749670, null), new nna(vqaVar, (byte) 28), z);
                        if (vqaVar.d3 == null) {
                        }
                        z2 = false;
                        G.k(R.drawable.input_suggest_paid_24, k96.M0(2131749670, null), new nna(vqaVar, (byte) 29), z2);
                        A1 = vqaVar.A1();
                        if (A1 != null) {
                        }
                        z3 = false;
                        G.k(R.drawable.msg_colors, k96.M0(2131749421, null), new toa(vqaVar, b3), z3);
                        if (vqaVar.a3 != null) {
                        }
                        TL_stars.SavedStarGift savedStarGift222222 = vqaVar.A2;
                        G.k((savedStarGift222222 != null || savedStarGift222222.unsaved) ? R.drawable.menu_show_on_profile : R.drawable.menu_hide_from_profile, k96.M0((savedStarGift222222 != null || savedStarGift222222.unsaved) ? 2131749964 : 2131750172, null), new nna(vqaVar, (byte) 8), z9);
                        if (vqaVar.a3 == null) {
                        }
                        z4 = false;
                        G.k(R.drawable.menu_transfer, k96.M0(2131749902, null), new toa(vqaVar, b4), z4);
                        G.k(R.drawable.menu_transfer, k96.M0(2131749902, null), new nna(vqaVar, (byte) 19), vqaVar.a3 == null || (vqaVar.d3 == null && (vqaVar.x2(A13) || vqaVar.H1(A13))));
                        G.k(R.drawable.menu_feature_paid, k96.M0(2131749525, null), new nna(vqaVar, (byte) 20), (vqaVar.h1() || cq7.m(A13)) ? false : true);
                        G.k(R.drawable.menu_edit_price, k96.M0(2131750248, null), new nna(vqaVar, (byte) 21), !vqaVar.h1() && cq7.m(A13));
                        G.k(R.drawable.msg_delete, k96.M0(2131750416, null), new nna(vqaVar, (byte) 22), !vqaVar.h1() && cq7.m(A13));
                        G.k(R.drawable.msg_view_file, k96.M0(2131749830, null), new nna(vqaVar, (byte) 23), (vqaVar.A2 == null || vqaVar.q1() == j) ? false : true);
                        G.l(R.drawable.msg_delete, new nna(vqaVar, (byte) 24), k96.M0(2131750202, null), vqaVar.g1(), true);
                        G.t = false;
                        G.b0 = true;
                        G.s = (short) 0;
                        G.b0(r8[0] + vqaVar.u0, -gl.L(2.0f));
                        vqaVar.B0(view, G, false);
                    }
                } else {
                    j = 0;
                }
                z = false;
                G.k(R.drawable.input_suggest_paid_24, k96.M0(2131749670, null), new nna(vqaVar, (byte) 28), z);
                if (vqaVar.d3 == null) {
                }
                z2 = false;
                G.k(R.drawable.input_suggest_paid_24, k96.M0(2131749670, null), new nna(vqaVar, (byte) 29), z2);
                A1 = vqaVar.A1();
                if (A1 != null) {
                }
                z3 = false;
                G.k(R.drawable.msg_colors, k96.M0(2131749421, null), new toa(vqaVar, b3), z3);
                if (vqaVar.a3 != null) {
                }
                TL_stars.SavedStarGift savedStarGift2222222 = vqaVar.A2;
                G.k((savedStarGift2222222 != null || savedStarGift2222222.unsaved) ? R.drawable.menu_show_on_profile : R.drawable.menu_hide_from_profile, k96.M0((savedStarGift2222222 != null || savedStarGift2222222.unsaved) ? 2131749964 : 2131750172, null), new nna(vqaVar, (byte) 8), z9);
                if (vqaVar.a3 == null) {
                }
                z4 = false;
                G.k(R.drawable.menu_transfer, k96.M0(2131749902, null), new toa(vqaVar, b4), z4);
                G.k(R.drawable.menu_transfer, k96.M0(2131749902, null), new nna(vqaVar, (byte) 19), vqaVar.a3 == null || (vqaVar.d3 == null && (vqaVar.x2(A13) || vqaVar.H1(A13))));
                G.k(R.drawable.menu_feature_paid, k96.M0(2131749525, null), new nna(vqaVar, (byte) 20), (vqaVar.h1() || cq7.m(A13)) ? false : true);
                G.k(R.drawable.menu_edit_price, k96.M0(2131750248, null), new nna(vqaVar, (byte) 21), !vqaVar.h1() && cq7.m(A13));
                G.k(R.drawable.msg_delete, k96.M0(2131750416, null), new nna(vqaVar, (byte) 22), !vqaVar.h1() && cq7.m(A13));
                G.k(R.drawable.msg_view_file, k96.M0(2131749830, null), new nna(vqaVar, (byte) 23), (vqaVar.A2 == null || vqaVar.q1() == j) ? false : true);
                G.l(R.drawable.msg_delete, new nna(vqaVar, (byte) 24), k96.M0(2131750202, null), vqaVar.g1(), true);
                G.t = false;
                G.b0 = true;
                G.s = (short) 0;
                G.b0(r8[0] + vqaVar.u0, -gl.L(2.0f));
                vqaVar.B0(view, G, false);
                break;
            case 26:
                vqaVar.T1(true);
                break;
            case 27:
                if (!vqaVar.w2()) {
                    if (view.getAlpha() >= 0.99f) {
                        if (vqaVar.a3 != null || !vqaVar.x2(vqaVar.A1())) {
                            vqaVar.a2();
                            break;
                        } else {
                            vqaVar.f2();
                            break;
                        }
                    } else {
                        vqaVar.i1();
                        break;
                    }
                }
                break;
            case 28:
                vqaVar.S1();
                break;
            default:
                vqaVar.N1();
                break;
        }
    }
}
