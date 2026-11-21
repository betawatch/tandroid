package di;

import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.fj;
import org.telegram.messenger.gd;
import org.telegram.messenger.j10;
import org.telegram.messenger.mp;
import org.telegram.messenger.q10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.a70;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final /* synthetic */ class i1 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ f6 b;

    public /* synthetic */ i1(f6 f6Var, int i7) {
        this.a = i7;
        this.b = f6Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:200:0x02ee, code lost:
    
        if (r2 != null) goto L188;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x016b, code lost:
    
        if (org.telegram.messenger.n5.o(r15) == org.telegram.messenger.j10.i(r6.a).e()) goto L78;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x02fe  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x031d  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0345  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0368  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0388  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x03a9  */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onClick(View view) {
        long j3;
        boolean z10;
        boolean z11;
        TL_stars.TL_starGiftUnique M1;
        boolean z12;
        boolean z13;
        TL_stars.TL_starGiftUnique tL_starGiftUnique;
        boolean S1;
        TLRPC.Message message;
        long o4;
        Object[] objArr;
        ArrayList<TL_stars.StarsAmount> arrayList;
        long o10;
        String y10;
        int i7 = this.a;
        Object[] objArr2 = 0;
        int i10 = 1;
        final f6 f6Var = this.b;
        switch (i7) {
            case 0:
                f6Var.onBackPressed();
                break;
            case 1:
                f6Var.g2();
                break;
            case 2:
                f6Var.V1();
                break;
            case 3:
                f6Var.onBackPressed();
                break;
            case 4:
                o5 o5Var = f6Var.L2;
                o5Var.h.e();
                o5Var.i.e();
                o5Var.j.e();
                o5Var.k.e();
                break;
            case 5:
                f6Var.a2();
                break;
            case 6:
                org.telegram.ui.Wallet.w5 w5Var = f6Var.d3;
                if (w5Var != null) {
                    f6Var.dismiss();
                    org.telegram.messenger.g0.h3(new ca.r(w5Var, 17), 250L);
                    break;
                }
                break;
            case 7:
                f6Var.o2();
                break;
            case 8:
                f6Var.a2();
                break;
            case 9:
                if (f6Var.M1() != null && f6Var.M1().host_id != null) {
                    f6Var.b2();
                    break;
                } else {
                    org.telegram.messenger.f3.n(null, 2131749815, f6Var.k(), R.raw.info, 36);
                    break;
                }
                break;
            case 10:
                f6Var.U2 = true;
                f6Var.I2(false);
                break;
            case 11:
                f6Var.onBackPressed();
                break;
            case 12:
                f6Var.onBackPressed();
                break;
            case 13:
                f6Var.x1();
                break;
            case 14:
                f6Var.m2();
                break;
            case 15:
                f6Var.m2();
                break;
            case 16:
                f6Var.onBackPressed();
                break;
            case 17:
                f6Var.dismiss();
                break;
            case 18:
                f6Var.V1();
                break;
            case 19:
                f6Var.m2();
                break;
            case 20:
                f6Var.onBackPressed();
                break;
            case 21:
                f6Var.c2(true);
                break;
            case 22:
                f6Var.m2();
                break;
            case 23:
                if (view.getAlpha() >= 1.0f) {
                    hi.e eVar = f6Var.g2;
                    eVar.i(gd.N0(2131749770, null), true, true);
                    eVar.g(null, true);
                    eVar.setOnClickListener(new p3(f6Var, 4));
                    f6Var.b2.i(3, gd.N0(2131749762, null), gd.N0(2131749763, null), null);
                    f6Var.H2(3, true, null);
                    break;
                }
                break;
            case 24:
                if (!f6Var.g2.R) {
                    f6Var.s2.a(!r1.a.q, true);
                    break;
                }
                break;
            case 25:
                final TL_stars.TL_starGiftUnique M12 = f6Var.M1();
                if (M12 != null && !TextUtils.isEmpty(M12.slug)) {
                    final boolean z14 = M12.host_id == null;
                    if (f6Var.v3 == null) {
                        f6Var.v3 = Boolean.valueOf(!z14);
                    }
                    f6Var.z2(M12, z14);
                    final int i11 = f6Var.u3 + 1;
                    f6Var.u3 = i11;
                    TL_stars.displayStarGift displaystargift = new TL_stars.displayStarGift();
                    displaystargift.peer = z14 ? mp.u1(f6Var.a).l1(j10.i(f6Var.a).e()) : null;
                    displaystargift.slug = M12.slug;
                    ConnectionsManager.getInstance(f6Var.a).sendRequestTyped(displaystargift, new d3.b(1), new q10() { // from class: di.o1
                        @Override // org.telegram.messenger.q10
                        public final void a(Object obj, Object obj2) {
                            TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                            boolean z15 = ((TLRPC.Bool) obj) instanceof TLRPC.TL_boolTrue;
                            f6 f6Var2 = f6.this;
                            if (z15) {
                                f6Var2.v3 = Boolean.valueOf(z14);
                                return;
                            }
                            if (i11 != f6Var2.u3) {
                                return;
                            }
                            f6Var2.z2(M12, f6Var2.v3.booleanValue());
                            f6Var2.k().f0(tL_error != null ? tL_error.text : "NULL_ERROR", false);
                        }
                    });
                    break;
                }
                break;
            case 26:
                String H1 = f6Var.H1();
                TL_stars.TL_starGiftUnique M13 = f6Var.M1();
                n4 n4Var = f6Var.U1;
                n4Var.getLocationInWindow(new int[2]);
                a70 G = a70.G(n4Var, f6Var.J0, view);
                boolean z15 = (f6Var.M1() == null || !f6.S1(f6Var.a, org.telegram.messenger.n5.o(f6Var.M1().owner_id)) || !(f6Var.C2 instanceof p8) || f6Var.B2 == null || f6Var.G1() == null) ? false : true;
                TL_stars.SavedStarGift savedStarGift = f6Var.B2;
                G.l((savedStarGift == null || !savedStarGift.pinned_to_top) ? R.drawable.msg_pin : R.drawable.msg_unpin, gd.N0((savedStarGift == null || !savedStarGift.pinned_to_top) ? 2131750061 : 2131749867, null), new k1(f6Var, 18), z15);
                G.l(R.drawable.outline_craft, gd.N0(2131749784, null), new k1(f6Var, 25), f6Var.r1());
                G.l(R.drawable.menu_edit_price, gd.N0(2131750247, null), new k1(f6Var, 26), (f6Var.M1() == null || !f6.S1(f6Var.a, org.telegram.messenger.n5.o(f6Var.M1().owner_id)) || f6Var.M1().resell_amount == null || bi.y4.u(f6Var.M1())) ? false : true);
                G.l(R.drawable.msg_link, gd.N0(2131751750, null), new h3(f6Var, H1, 7), H1 != null);
                G.l(R.drawable.msg_share, gd.N0(2131745263, null), new k1(f6Var, 27), H1 != null);
                if (f6Var.e3 == null) {
                    int i12 = f6Var.a;
                    TL_stars.TL_starGiftUnique M14 = f6Var.M1();
                    if (f6Var.b3 != null || f6Var.Q1(f6Var.M1())) {
                        j3 = 0;
                    } else {
                        TL_stars.TL_starGiftUnique M15 = f6Var.M1();
                        if (M15 != null && (r15 = M15.host_id) != null) {
                            j3 = 0;
                            break;
                        } else {
                            j3 = 0;
                        }
                        objArr = false;
                        HashMap hashMap = bi.i4.a;
                        if (M14 != null && !TextUtils.isEmpty(M14.gift_address) && !TextUtils.isEmpty(M14.owner_address) && !TextUtils.isEmpty(M14.slug) && objArr == false && M14.offer_min_amount > j3 && (((arrayList = M14.resell_amount) == null || arrayList.isEmpty()) && ((org.telegram.messenger.h0) mp.u1(i12).A7.p0.b).c)) {
                            o10 = org.telegram.messenger.n5.o(M14.owner_id);
                            if ((o10 != j3 || o10 != j10.i(i12).e()) && (TextUtils.isEmpty(M14.owner_address) || (y10 = org.telegram.ui.Wallet.u0.D(i12).y()) == null || !org.telegram.ui.Wallet.u0.c(M14.owner_address, y10))) {
                                z10 = true;
                                G.l(R.drawable.input_suggest_paid_24, gd.N0(2131749669, null), new k1(f6Var, 28), z10);
                                if (f6Var.e3 == null) {
                                    HashMap hashMap2 = bi.i4.a;
                                    if (M13 != null && TextUtils.isEmpty(M13.owner_address) && M13.offer_min_stars > 0 && M13.owner_id != null) {
                                        z11 = true;
                                        G.l(R.drawable.input_suggest_paid_24, gd.N0(2131749669, null), new k1(f6Var, 29), z11);
                                        M1 = f6Var.M1();
                                        if (M1 != null && M1.theme_available) {
                                            o4 = org.telegram.messenger.n5.o(M1.owner_id);
                                            long o11 = org.telegram.messenger.n5.o(M1.host_id);
                                            if ((o4 > j3 && f6.S1(f6Var.a, o4)) || (o11 > j3 && f6.S1(f6Var.a, o11))) {
                                                z12 = true;
                                                G.l(R.drawable.msg_colors, gd.N0(2131749420, null), new r3(f6Var, objArr2 == true ? 1 : 0), z12);
                                                boolean z16 = f6Var.b3 != null && f6Var.A2 && f6Var.B2 != null && f6.R1(f6Var.a, f6Var.T1);
                                                TL_stars.SavedStarGift savedStarGift2 = f6Var.B2;
                                                G.l((savedStarGift2 != null || savedStarGift2.unsaved) ? R.drawable.menu_show_on_profile : R.drawable.menu_hide_from_profile, gd.N0((savedStarGift2 != null || savedStarGift2.unsaved) ? 2131749963 : 2131750171, null), new k1(f6Var, 8), z16);
                                                if (f6Var.b3 == null) {
                                                    if (f6Var.G1() != null) {
                                                        fj fjVar = f6Var.D2;
                                                        if (fjVar != null && (message = fjVar.k) != null) {
                                                            TLRPC.MessageAction messageAction = message.action;
                                                            if (messageAction instanceof TLRPC.TL_messageActionStarGiftUnique) {
                                                                TLRPC.TL_messageActionStarGiftUnique tL_messageActionStarGiftUnique = (TLRPC.TL_messageActionStarGiftUnique) messageAction;
                                                                if ((tL_messageActionStarGiftUnique.flags & 16) != 0) {
                                                                    TL_stars.StarGift starGift = tL_messageActionStarGiftUnique.gift;
                                                                    if (starGift instanceof TL_stars.TL_starGiftUnique) {
                                                                        tL_starGiftUnique = (TL_stars.TL_starGiftUnique) starGift;
                                                                        S1 = f6.S1(f6Var.a, org.telegram.messenger.n5.o(tL_starGiftUnique.owner_id));
                                                                        if (S1 && !bi.y4.m(M13)) {
                                                                            z13 = true;
                                                                            G.l(R.drawable.menu_transfer, gd.N0(2131749901, null), new r3(f6Var, i10), z13);
                                                                            G.l(R.drawable.menu_transfer, gd.N0(2131749901, null), new k1(f6Var, 19), f6Var.b3 == null || (f6Var.e3 == null && (f6Var.F2(M13) || f6Var.T1(M13))));
                                                                            G.l(R.drawable.menu_feature_paid, gd.N0(2131749524, null), new k1(f6Var, 20), (f6Var.t1() || bi.y4.m(M13)) ? false : true);
                                                                            G.l(R.drawable.menu_edit_price, gd.N0(2131750247, null), new k1(f6Var, 21), !f6Var.t1() && bi.y4.m(M13));
                                                                            G.l(R.drawable.msg_delete, gd.N0(2131750415, null), new k1(f6Var, 22), !f6Var.t1() && bi.y4.m(M13));
                                                                            G.l(R.drawable.msg_view_file, gd.N0(2131749829, null), new k1(f6Var, 23), (f6Var.B2 == null || f6Var.C1() == j3) ? false : true);
                                                                            G.m(R.drawable.msg_delete, new k1(f6Var, 24), gd.N0(2131750201, null), f6Var.s1(), true);
                                                                            G.t = false;
                                                                            G.b0 = true;
                                                                            G.s = 0;
                                                                            G.b0(r8[0] + f6Var.u0, -org.telegram.messenger.g0.L(2.0f));
                                                                            f6Var.I0(view, G, false);
                                                                            break;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        TL_stars.SavedStarGift savedStarGift3 = f6Var.B2;
                                                        if (savedStarGift3 != null) {
                                                            TL_stars.StarGift starGift2 = savedStarGift3.gift;
                                                            if (starGift2 instanceof TL_stars.TL_starGiftUnique) {
                                                                tL_starGiftUnique = (TL_stars.TL_starGiftUnique) starGift2;
                                                                S1 = f6.S1(f6Var.a, org.telegram.messenger.n5.o(tL_starGiftUnique.owner_id));
                                                                if (S1) {
                                                                    z13 = true;
                                                                    G.l(R.drawable.menu_transfer, gd.N0(2131749901, null), new r3(f6Var, i10), z13);
                                                                    G.l(R.drawable.menu_transfer, gd.N0(2131749901, null), new k1(f6Var, 19), f6Var.b3 == null || (f6Var.e3 == null && (f6Var.F2(M13) || f6Var.T1(M13))));
                                                                    G.l(R.drawable.menu_feature_paid, gd.N0(2131749524, null), new k1(f6Var, 20), (f6Var.t1() || bi.y4.m(M13)) ? false : true);
                                                                    G.l(R.drawable.menu_edit_price, gd.N0(2131750247, null), new k1(f6Var, 21), !f6Var.t1() && bi.y4.m(M13));
                                                                    G.l(R.drawable.msg_delete, gd.N0(2131750415, null), new k1(f6Var, 22), !f6Var.t1() && bi.y4.m(M13));
                                                                    G.l(R.drawable.msg_view_file, gd.N0(2131749829, null), new k1(f6Var, 23), (f6Var.B2 == null || f6Var.C1() == j3) ? false : true);
                                                                    G.m(R.drawable.msg_delete, new k1(f6Var, 24), gd.N0(2131750201, null), f6Var.s1(), true);
                                                                    G.t = false;
                                                                    G.b0 = true;
                                                                    G.s = 0;
                                                                    G.b0(r8[0] + f6Var.u0, -org.telegram.messenger.g0.L(2.0f));
                                                                    f6Var.I0(view, G, false);
                                                                }
                                                            }
                                                        }
                                                        tL_starGiftUnique = f6Var.F2;
                                                        break;
                                                    }
                                                    S1 = false;
                                                    if (S1) {
                                                    }
                                                }
                                                z13 = false;
                                                G.l(R.drawable.menu_transfer, gd.N0(2131749901, null), new r3(f6Var, i10), z13);
                                                G.l(R.drawable.menu_transfer, gd.N0(2131749901, null), new k1(f6Var, 19), f6Var.b3 == null || (f6Var.e3 == null && (f6Var.F2(M13) || f6Var.T1(M13))));
                                                G.l(R.drawable.menu_feature_paid, gd.N0(2131749524, null), new k1(f6Var, 20), (f6Var.t1() || bi.y4.m(M13)) ? false : true);
                                                G.l(R.drawable.menu_edit_price, gd.N0(2131750247, null), new k1(f6Var, 21), !f6Var.t1() && bi.y4.m(M13));
                                                G.l(R.drawable.msg_delete, gd.N0(2131750415, null), new k1(f6Var, 22), !f6Var.t1() && bi.y4.m(M13));
                                                G.l(R.drawable.msg_view_file, gd.N0(2131749829, null), new k1(f6Var, 23), (f6Var.B2 == null || f6Var.C1() == j3) ? false : true);
                                                G.m(R.drawable.msg_delete, new k1(f6Var, 24), gd.N0(2131750201, null), f6Var.s1(), true);
                                                G.t = false;
                                                G.b0 = true;
                                                G.s = 0;
                                                G.b0(r8[0] + f6Var.u0, -org.telegram.messenger.g0.L(2.0f));
                                                f6Var.I0(view, G, false);
                                            }
                                        }
                                        z12 = false;
                                        G.l(R.drawable.msg_colors, gd.N0(2131749420, null), new r3(f6Var, objArr2 == true ? 1 : 0), z12);
                                        if (f6Var.b3 != null) {
                                        }
                                        TL_stars.SavedStarGift savedStarGift22 = f6Var.B2;
                                        G.l((savedStarGift22 != null || savedStarGift22.unsaved) ? R.drawable.menu_show_on_profile : R.drawable.menu_hide_from_profile, gd.N0((savedStarGift22 != null || savedStarGift22.unsaved) ? 2131749963 : 2131750171, null), new k1(f6Var, 8), z16);
                                        if (f6Var.b3 == null) {
                                        }
                                        z13 = false;
                                        G.l(R.drawable.menu_transfer, gd.N0(2131749901, null), new r3(f6Var, i10), z13);
                                        G.l(R.drawable.menu_transfer, gd.N0(2131749901, null), new k1(f6Var, 19), f6Var.b3 == null || (f6Var.e3 == null && (f6Var.F2(M13) || f6Var.T1(M13))));
                                        G.l(R.drawable.menu_feature_paid, gd.N0(2131749524, null), new k1(f6Var, 20), (f6Var.t1() || bi.y4.m(M13)) ? false : true);
                                        G.l(R.drawable.menu_edit_price, gd.N0(2131750247, null), new k1(f6Var, 21), !f6Var.t1() && bi.y4.m(M13));
                                        G.l(R.drawable.msg_delete, gd.N0(2131750415, null), new k1(f6Var, 22), !f6Var.t1() && bi.y4.m(M13));
                                        G.l(R.drawable.msg_view_file, gd.N0(2131749829, null), new k1(f6Var, 23), (f6Var.B2 == null || f6Var.C1() == j3) ? false : true);
                                        G.m(R.drawable.msg_delete, new k1(f6Var, 24), gd.N0(2131750201, null), f6Var.s1(), true);
                                        G.t = false;
                                        G.b0 = true;
                                        G.s = 0;
                                        G.b0(r8[0] + f6Var.u0, -org.telegram.messenger.g0.L(2.0f));
                                        f6Var.I0(view, G, false);
                                    }
                                }
                                z11 = false;
                                G.l(R.drawable.input_suggest_paid_24, gd.N0(2131749669, null), new k1(f6Var, 29), z11);
                                M1 = f6Var.M1();
                                if (M1 != null) {
                                    o4 = org.telegram.messenger.n5.o(M1.owner_id);
                                    long o112 = org.telegram.messenger.n5.o(M1.host_id);
                                    if (o4 > j3) {
                                        z12 = true;
                                        G.l(R.drawable.msg_colors, gd.N0(2131749420, null), new r3(f6Var, objArr2 == true ? 1 : 0), z12);
                                        if (f6Var.b3 != null) {
                                        }
                                        TL_stars.SavedStarGift savedStarGift222 = f6Var.B2;
                                        G.l((savedStarGift222 != null || savedStarGift222.unsaved) ? R.drawable.menu_show_on_profile : R.drawable.menu_hide_from_profile, gd.N0((savedStarGift222 != null || savedStarGift222.unsaved) ? 2131749963 : 2131750171, null), new k1(f6Var, 8), z16);
                                        if (f6Var.b3 == null) {
                                        }
                                        z13 = false;
                                        G.l(R.drawable.menu_transfer, gd.N0(2131749901, null), new r3(f6Var, i10), z13);
                                        G.l(R.drawable.menu_transfer, gd.N0(2131749901, null), new k1(f6Var, 19), f6Var.b3 == null || (f6Var.e3 == null && (f6Var.F2(M13) || f6Var.T1(M13))));
                                        G.l(R.drawable.menu_feature_paid, gd.N0(2131749524, null), new k1(f6Var, 20), (f6Var.t1() || bi.y4.m(M13)) ? false : true);
                                        G.l(R.drawable.menu_edit_price, gd.N0(2131750247, null), new k1(f6Var, 21), !f6Var.t1() && bi.y4.m(M13));
                                        G.l(R.drawable.msg_delete, gd.N0(2131750415, null), new k1(f6Var, 22), !f6Var.t1() && bi.y4.m(M13));
                                        G.l(R.drawable.msg_view_file, gd.N0(2131749829, null), new k1(f6Var, 23), (f6Var.B2 == null || f6Var.C1() == j3) ? false : true);
                                        G.m(R.drawable.msg_delete, new k1(f6Var, 24), gd.N0(2131750201, null), f6Var.s1(), true);
                                        G.t = false;
                                        G.b0 = true;
                                        G.s = 0;
                                        G.b0(r8[0] + f6Var.u0, -org.telegram.messenger.g0.L(2.0f));
                                        f6Var.I0(view, G, false);
                                    }
                                    z12 = true;
                                    G.l(R.drawable.msg_colors, gd.N0(2131749420, null), new r3(f6Var, objArr2 == true ? 1 : 0), z12);
                                    if (f6Var.b3 != null) {
                                    }
                                    TL_stars.SavedStarGift savedStarGift2222 = f6Var.B2;
                                    G.l((savedStarGift2222 != null || savedStarGift2222.unsaved) ? R.drawable.menu_show_on_profile : R.drawable.menu_hide_from_profile, gd.N0((savedStarGift2222 != null || savedStarGift2222.unsaved) ? 2131749963 : 2131750171, null), new k1(f6Var, 8), z16);
                                    if (f6Var.b3 == null) {
                                    }
                                    z13 = false;
                                    G.l(R.drawable.menu_transfer, gd.N0(2131749901, null), new r3(f6Var, i10), z13);
                                    G.l(R.drawable.menu_transfer, gd.N0(2131749901, null), new k1(f6Var, 19), f6Var.b3 == null || (f6Var.e3 == null && (f6Var.F2(M13) || f6Var.T1(M13))));
                                    G.l(R.drawable.menu_feature_paid, gd.N0(2131749524, null), new k1(f6Var, 20), (f6Var.t1() || bi.y4.m(M13)) ? false : true);
                                    G.l(R.drawable.menu_edit_price, gd.N0(2131750247, null), new k1(f6Var, 21), !f6Var.t1() && bi.y4.m(M13));
                                    G.l(R.drawable.msg_delete, gd.N0(2131750415, null), new k1(f6Var, 22), !f6Var.t1() && bi.y4.m(M13));
                                    G.l(R.drawable.msg_view_file, gd.N0(2131749829, null), new k1(f6Var, 23), (f6Var.B2 == null || f6Var.C1() == j3) ? false : true);
                                    G.m(R.drawable.msg_delete, new k1(f6Var, 24), gd.N0(2131750201, null), f6Var.s1(), true);
                                    G.t = false;
                                    G.b0 = true;
                                    G.s = 0;
                                    G.b0(r8[0] + f6Var.u0, -org.telegram.messenger.g0.L(2.0f));
                                    f6Var.I0(view, G, false);
                                }
                                z12 = false;
                                G.l(R.drawable.msg_colors, gd.N0(2131749420, null), new r3(f6Var, objArr2 == true ? 1 : 0), z12);
                                if (f6Var.b3 != null) {
                                }
                                TL_stars.SavedStarGift savedStarGift22222 = f6Var.B2;
                                G.l((savedStarGift22222 != null || savedStarGift22222.unsaved) ? R.drawable.menu_show_on_profile : R.drawable.menu_hide_from_profile, gd.N0((savedStarGift22222 != null || savedStarGift22222.unsaved) ? 2131749963 : 2131750171, null), new k1(f6Var, 8), z16);
                                if (f6Var.b3 == null) {
                                }
                                z13 = false;
                                G.l(R.drawable.menu_transfer, gd.N0(2131749901, null), new r3(f6Var, i10), z13);
                                G.l(R.drawable.menu_transfer, gd.N0(2131749901, null), new k1(f6Var, 19), f6Var.b3 == null || (f6Var.e3 == null && (f6Var.F2(M13) || f6Var.T1(M13))));
                                G.l(R.drawable.menu_feature_paid, gd.N0(2131749524, null), new k1(f6Var, 20), (f6Var.t1() || bi.y4.m(M13)) ? false : true);
                                G.l(R.drawable.menu_edit_price, gd.N0(2131750247, null), new k1(f6Var, 21), !f6Var.t1() && bi.y4.m(M13));
                                G.l(R.drawable.msg_delete, gd.N0(2131750415, null), new k1(f6Var, 22), !f6Var.t1() && bi.y4.m(M13));
                                G.l(R.drawable.msg_view_file, gd.N0(2131749829, null), new k1(f6Var, 23), (f6Var.B2 == null || f6Var.C1() == j3) ? false : true);
                                G.m(R.drawable.msg_delete, new k1(f6Var, 24), gd.N0(2131750201, null), f6Var.s1(), true);
                                G.t = false;
                                G.b0 = true;
                                G.s = 0;
                                G.b0(r8[0] + f6Var.u0, -org.telegram.messenger.g0.L(2.0f));
                                f6Var.I0(view, G, false);
                            }
                        }
                    }
                    objArr = true;
                    HashMap hashMap3 = bi.i4.a;
                    if (M14 != null) {
                        o10 = org.telegram.messenger.n5.o(M14.owner_id);
                        if (o10 != j3) {
                        }
                        z10 = true;
                        G.l(R.drawable.input_suggest_paid_24, gd.N0(2131749669, null), new k1(f6Var, 28), z10);
                        if (f6Var.e3 == null) {
                        }
                        z11 = false;
                        G.l(R.drawable.input_suggest_paid_24, gd.N0(2131749669, null), new k1(f6Var, 29), z11);
                        M1 = f6Var.M1();
                        if (M1 != null) {
                        }
                        z12 = false;
                        G.l(R.drawable.msg_colors, gd.N0(2131749420, null), new r3(f6Var, objArr2 == true ? 1 : 0), z12);
                        if (f6Var.b3 != null) {
                        }
                        TL_stars.SavedStarGift savedStarGift222222 = f6Var.B2;
                        G.l((savedStarGift222222 != null || savedStarGift222222.unsaved) ? R.drawable.menu_show_on_profile : R.drawable.menu_hide_from_profile, gd.N0((savedStarGift222222 != null || savedStarGift222222.unsaved) ? 2131749963 : 2131750171, null), new k1(f6Var, 8), z16);
                        if (f6Var.b3 == null) {
                        }
                        z13 = false;
                        G.l(R.drawable.menu_transfer, gd.N0(2131749901, null), new r3(f6Var, i10), z13);
                        G.l(R.drawable.menu_transfer, gd.N0(2131749901, null), new k1(f6Var, 19), f6Var.b3 == null || (f6Var.e3 == null && (f6Var.F2(M13) || f6Var.T1(M13))));
                        G.l(R.drawable.menu_feature_paid, gd.N0(2131749524, null), new k1(f6Var, 20), (f6Var.t1() || bi.y4.m(M13)) ? false : true);
                        G.l(R.drawable.menu_edit_price, gd.N0(2131750247, null), new k1(f6Var, 21), !f6Var.t1() && bi.y4.m(M13));
                        G.l(R.drawable.msg_delete, gd.N0(2131750415, null), new k1(f6Var, 22), !f6Var.t1() && bi.y4.m(M13));
                        G.l(R.drawable.msg_view_file, gd.N0(2131749829, null), new k1(f6Var, 23), (f6Var.B2 == null || f6Var.C1() == j3) ? false : true);
                        G.m(R.drawable.msg_delete, new k1(f6Var, 24), gd.N0(2131750201, null), f6Var.s1(), true);
                        G.t = false;
                        G.b0 = true;
                        G.s = 0;
                        G.b0(r8[0] + f6Var.u0, -org.telegram.messenger.g0.L(2.0f));
                        f6Var.I0(view, G, false);
                    }
                } else {
                    j3 = 0;
                }
                z10 = false;
                G.l(R.drawable.input_suggest_paid_24, gd.N0(2131749669, null), new k1(f6Var, 28), z10);
                if (f6Var.e3 == null) {
                }
                z11 = false;
                G.l(R.drawable.input_suggest_paid_24, gd.N0(2131749669, null), new k1(f6Var, 29), z11);
                M1 = f6Var.M1();
                if (M1 != null) {
                }
                z12 = false;
                G.l(R.drawable.msg_colors, gd.N0(2131749420, null), new r3(f6Var, objArr2 == true ? 1 : 0), z12);
                if (f6Var.b3 != null) {
                }
                TL_stars.SavedStarGift savedStarGift2222222 = f6Var.B2;
                G.l((savedStarGift2222222 != null || savedStarGift2222222.unsaved) ? R.drawable.menu_show_on_profile : R.drawable.menu_hide_from_profile, gd.N0((savedStarGift2222222 != null || savedStarGift2222222.unsaved) ? 2131749963 : 2131750171, null), new k1(f6Var, 8), z16);
                if (f6Var.b3 == null) {
                }
                z13 = false;
                G.l(R.drawable.menu_transfer, gd.N0(2131749901, null), new r3(f6Var, i10), z13);
                G.l(R.drawable.menu_transfer, gd.N0(2131749901, null), new k1(f6Var, 19), f6Var.b3 == null || (f6Var.e3 == null && (f6Var.F2(M13) || f6Var.T1(M13))));
                G.l(R.drawable.menu_feature_paid, gd.N0(2131749524, null), new k1(f6Var, 20), (f6Var.t1() || bi.y4.m(M13)) ? false : true);
                G.l(R.drawable.menu_edit_price, gd.N0(2131750247, null), new k1(f6Var, 21), !f6Var.t1() && bi.y4.m(M13));
                G.l(R.drawable.msg_delete, gd.N0(2131750415, null), new k1(f6Var, 22), !f6Var.t1() && bi.y4.m(M13));
                G.l(R.drawable.msg_view_file, gd.N0(2131749829, null), new k1(f6Var, 23), (f6Var.B2 == null || f6Var.C1() == j3) ? false : true);
                G.m(R.drawable.msg_delete, new k1(f6Var, 24), gd.N0(2131750201, null), f6Var.s1(), true);
                G.t = false;
                G.b0 = true;
                G.s = 0;
                G.b0(r8[0] + f6Var.u0, -org.telegram.messenger.g0.L(2.0f));
                f6Var.I0(view, G, false);
                break;
            case 27:
                f6Var.c2(true);
                break;
            case 28:
                if (!f6Var.E2()) {
                    if (view.getAlpha() >= 0.99f) {
                        if (f6Var.b3 != null || !f6Var.F2(f6Var.M1())) {
                            f6Var.j2();
                            break;
                        } else {
                            f6Var.o2();
                            break;
                        }
                    } else {
                        f6Var.u1();
                        break;
                    }
                }
                break;
            default:
                f6Var.b2();
                break;
        }
    }
}
