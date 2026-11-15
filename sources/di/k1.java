package di;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.gj;
import org.telegram.messenger.hd;
import org.telegram.messenger.m10;
import org.telegram.messenger.np;
import org.telegram.messenger.s10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.m60;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class k1 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ c6 b;

    public /* synthetic */ k1(c6 c6Var, int i7) {
        this.a = i7;
        this.b = c6Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:189:0x02ea, code lost:
    
        if (r2 != null) goto L169;
     */
    /* JADX WARN: Removed duplicated region for block: B:134:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x02fa  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0315  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x032a  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0382  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0317  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00f1  */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onClick(View view) {
        boolean z10;
        boolean z11;
        TL_stars.TL_starGiftUnique tL_starGiftUnique;
        boolean L1;
        TLRPC.Message message;
        int i7;
        TLRPC.Message message2;
        TLRPC.Message message3;
        int i10 = this.a;
        int i11 = 2;
        int i12 = 0;
        final c6 c6Var = this.b;
        switch (i10) {
            case 0:
                c6Var.c2();
                break;
            case 1:
                c6Var.R1();
                break;
            case 2:
                if (c6Var.H1() != null && c6Var.H1().host_id != null) {
                    c6Var.S1();
                    break;
                } else {
                    org.telegram.messenger.k5.n(null, 2131749832, c6Var.k(), R.raw.info, 36);
                    break;
                }
                break;
            case 3:
                c6Var.U2 = true;
                c6Var.u2(false);
                break;
            case 4:
                c6Var.onBackPressed();
                break;
            case 5:
                c6Var.t1();
                break;
            case 6:
                c6Var.onBackPressed();
                break;
            case 7:
                c6Var.a2();
                break;
            case 8:
                c6Var.dismiss();
                break;
            case 9:
                c6Var.a2();
                break;
            case 10:
                c6Var.onBackPressed();
                break;
            case 11:
                c6Var.N1();
                break;
            case 12:
                c6Var.a2();
                break;
            case 13:
                c6Var.onBackPressed();
                break;
            case 14:
                c6Var.T1(true);
                break;
            case 15:
                c6Var.a2();
                break;
            case 16:
                if (view.getAlpha() >= 1.0f) {
                    hi.d dVar = c6Var.g2;
                    dVar.i(hd.M0(2131749787, null), true, true);
                    dVar.g(null, true);
                    dVar.setOnClickListener(new k1(c6Var, 27));
                    c6Var.b2.i(3, hd.M0(2131749779, null), hd.M0(2131749780, null), null);
                    c6Var.t2(3, true, null);
                    break;
                }
                break;
            case 17:
                if (!c6Var.g2.R) {
                    c6Var.s2.a(!r1.a.q, true);
                    break;
                }
                break;
            case 18:
                final TL_stars.TL_starGiftUnique H1 = c6Var.H1();
                if (H1 != null && !TextUtils.isEmpty(H1.slug)) {
                    r6 = H1.host_id == null;
                    if (c6Var.s3 == null) {
                        c6Var.s3 = Boolean.valueOf(!r6);
                    }
                    c6Var.n2(H1, r6);
                    final int i13 = c6Var.r3 + 1;
                    c6Var.r3 = i13;
                    TL_stars.displayStarGift displaystargift = new TL_stars.displayStarGift();
                    displaystargift.peer = r6 ? np.s1(c6Var.a).j1(m10.i(c6Var.a).e()) : null;
                    displaystargift.slug = H1.slug;
                    ConnectionsManager.getInstance(c6Var.a).sendRequestTyped(displaystargift, new d3.b(1), new s10() { // from class: di.p1
                        @Override // org.telegram.messenger.s10
                        public final void a(Object obj, Object obj2) {
                            TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                            boolean z12 = ((TLRPC.Bool) obj) instanceof TLRPC.TL_boolTrue;
                            c6 c6Var2 = c6.this;
                            if (z12) {
                                c6Var2.s3 = Boolean.valueOf(r2);
                                return;
                            }
                            if (i13 != c6Var2.r3) {
                                return;
                            }
                            c6Var2.n2(H1, c6Var2.s3.booleanValue());
                            c6Var2.k().e0(tL_error != null ? tL_error.text : "NULL_ERROR", false);
                        }
                    });
                    break;
                }
                break;
            case 19:
                String C1 = c6Var.C1();
                TL_stars.TL_starGiftUnique H12 = c6Var.H1();
                k4 k4Var = c6Var.U1;
                k4Var.getLocationInWindow(new int[2]);
                m60 F = m60.F(k4Var, c6Var.J0, view);
                boolean z12 = (c6Var.H1() == null || !c6.L1(c6Var.a, org.telegram.messenger.m5.o(c6Var.H1().owner_id)) || !(c6Var.C2 instanceof l8) || c6Var.B2 == null || c6Var.B1() == null) ? false : true;
                TL_stars.SavedStarGift savedStarGift = c6Var.B2;
                F.l((savedStarGift == null || !savedStarGift.pinned_to_top) ? R.drawable.msg_pin : R.drawable.msg_unpin, hd.M0((savedStarGift == null || !savedStarGift.pinned_to_top) ? 2131750078 : 2131749884, null), new l1(c6Var, 13), z12);
                F.l(R.drawable.outline_craft, hd.M0(2131749801, null), new l1(c6Var, 16), c6Var.o1());
                F.l(R.drawable.menu_edit_price, hd.M0(2131750264, null), new l1(c6Var, 17), (c6Var.H1() == null || !c6.L1(c6Var.a, org.telegram.messenger.m5.o(c6Var.H1().owner_id)) || c6Var.H1().resell_amount == null) ? false : true);
                F.l(R.drawable.msg_link, hd.M0(2131751762, null), new d3(c6Var, C1, 7), C1 != null);
                F.l(R.drawable.msg_share, hd.M0(2131745459, null), new l1(c6Var, 18), C1 != null);
                F.l(R.drawable.input_suggest_paid_24, hd.M0(2131749687, null), new l1(c6Var, 19), H12 != null && H12.offer_min_stars > 0);
                TL_stars.TL_starGiftUnique H13 = c6Var.H1();
                if (H13 != null && H13.theme_available) {
                    long o4 = org.telegram.messenger.m5.o(H13.owner_id);
                    long o10 = org.telegram.messenger.m5.o(H13.host_id);
                    if ((o4 > 0 && c6.L1(c6Var.a, o4)) || (o10 > 0 && c6.L1(c6Var.a, o10))) {
                        z10 = true;
                        F.l(R.drawable.msg_colors, hd.M0(2131749596, null), new l1(c6Var, 20), z10);
                        boolean z13 = c6Var.b3 != null && c6Var.A2 && c6Var.B2 != null && c6.K1(c6Var.a, c6Var.T1);
                        TL_stars.SavedStarGift savedStarGift2 = c6Var.B2;
                        F.l((savedStarGift2 != null || savedStarGift2.unsaved) ? R.drawable.menu_show_on_profile : R.drawable.menu_hide_from_profile, hd.M0((savedStarGift2 != null || savedStarGift2.unsaved) ? 2131749980 : 2131750188, null), new l1(c6Var, 6), z13);
                        if (c6Var.b3 == null) {
                            if (c6Var.B1() != null) {
                                gj gjVar = c6Var.D2;
                                if (gjVar != null && (message = gjVar.k) != null) {
                                    TLRPC.MessageAction messageAction = message.action;
                                    if (messageAction instanceof TLRPC.TL_messageActionStarGiftUnique) {
                                        TLRPC.TL_messageActionStarGiftUnique tL_messageActionStarGiftUnique = (TLRPC.TL_messageActionStarGiftUnique) messageAction;
                                        if ((tL_messageActionStarGiftUnique.flags & 16) != 0) {
                                            TL_stars.StarGift starGift = tL_messageActionStarGiftUnique.gift;
                                            if (starGift instanceof TL_stars.TL_starGiftUnique) {
                                                tL_starGiftUnique = (TL_stars.TL_starGiftUnique) starGift;
                                                L1 = c6.L1(c6Var.a, org.telegram.messenger.m5.o(tL_starGiftUnique.owner_id));
                                                if (L1) {
                                                    z11 = true;
                                                    F.l(R.drawable.menu_transfer, hd.M0(2131749918, null), new l1(c6Var, 21), z11);
                                                    F.l(R.drawable.menu_transfer, hd.M0(2131749918, null), new l1(c6Var, 22), c6Var.b3 != null);
                                                    F.l(R.drawable.msg_view_file, hd.M0(2131749846, null), new l1(c6Var, 14), (c6Var.B2 == null || c6Var.x1() == 0) ? false : true);
                                                    F.m(R.drawable.msg_delete, new l1(c6Var, 15), hd.M0(2131750218, null), c6Var.p1(), true);
                                                    F.t = false;
                                                    F.Y = true;
                                                    F.s = 0;
                                                    F.a0(r4[0] + c6Var.u0, -org.telegram.messenger.g0.L(2.0f));
                                                    FrameLayout frameLayout = c6Var.c;
                                                    if ((F.A instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) || !view.isLaidOut() || !frameLayout.isAttachedToWindow()) {
                                                        F.Z();
                                                        break;
                                                    } else {
                                                        if (c6Var.Z0 == null) {
                                                            ri.q qVar = new ri.q();
                                                            qVar.i(frameLayout);
                                                            ri.a aVar = new ri.a(qVar, new org.telegram.ui.ActionBar.j2(c6Var));
                                                            c6Var.a1 = aVar;
                                                            org.telegram.ui.ActionBar.e6 e6Var = c6Var.J0;
                                                            aVar.m = frameLayout;
                                                            aVar.n = null;
                                                            aVar.g(frameLayout, null, e6Var);
                                                            c6Var.a1.o = new hi.t6(c6Var, 1);
                                                            org.telegram.ui.ActionBar.g5 g5Var = new org.telegram.ui.ActionBar.g5(c6Var.getContext());
                                                            c6Var.Z0 = g5Var;
                                                            frameLayout.addView(g5Var, c8.ja.c(-1.0f, -1));
                                                        }
                                                        org.telegram.ui.ActionBar.g5 g5Var2 = c6Var.Z0;
                                                        if (!g5Var2.E) {
                                                            if (c6Var.b1 == null) {
                                                                c6Var.b1 = new org.telegram.ui.ActionBar.h5(g5Var2, c6Var.a1, c6Var.J0);
                                                            }
                                                            org.telegram.ui.ActionBar.h5 h5Var = c6Var.b1;
                                                            if (!h5Var.a) {
                                                                h5Var.h = view;
                                                            }
                                                            F.p = new bi.t4(g5Var2, 1);
                                                            g5Var2.d(h5Var, null, (ActionBarPopupWindow$ActionBarPopupWindowLayout) F.A);
                                                            break;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                TL_stars.SavedStarGift savedStarGift3 = c6Var.B2;
                                if (savedStarGift3 != null) {
                                    TL_stars.StarGift starGift2 = savedStarGift3.gift;
                                    if (starGift2 instanceof TL_stars.TL_starGiftUnique) {
                                        tL_starGiftUnique = (TL_stars.TL_starGiftUnique) starGift2;
                                        L1 = c6.L1(c6Var.a, org.telegram.messenger.m5.o(tL_starGiftUnique.owner_id));
                                        if (L1) {
                                        }
                                    }
                                }
                                tL_starGiftUnique = c6Var.F2;
                                break;
                            }
                            L1 = false;
                            if (L1) {
                            }
                        }
                        z11 = false;
                        F.l(R.drawable.menu_transfer, hd.M0(2131749918, null), new l1(c6Var, 21), z11);
                        F.l(R.drawable.menu_transfer, hd.M0(2131749918, null), new l1(c6Var, 22), c6Var.b3 != null);
                        F.l(R.drawable.msg_view_file, hd.M0(2131749846, null), new l1(c6Var, 14), (c6Var.B2 == null || c6Var.x1() == 0) ? false : true);
                        F.m(R.drawable.msg_delete, new l1(c6Var, 15), hd.M0(2131750218, null), c6Var.p1(), true);
                        F.t = false;
                        F.Y = true;
                        F.s = 0;
                        F.a0(r4[0] + c6Var.u0, -org.telegram.messenger.g0.L(2.0f));
                        FrameLayout frameLayout2 = c6Var.c;
                        if (F.A instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                        }
                        F.Z();
                    }
                }
                z10 = false;
                F.l(R.drawable.msg_colors, hd.M0(2131749596, null), new l1(c6Var, 20), z10);
                if (c6Var.b3 != null) {
                }
                TL_stars.SavedStarGift savedStarGift22 = c6Var.B2;
                F.l((savedStarGift22 != null || savedStarGift22.unsaved) ? R.drawable.menu_show_on_profile : R.drawable.menu_hide_from_profile, hd.M0((savedStarGift22 != null || savedStarGift22.unsaved) ? 2131749980 : 2131750188, null), new l1(c6Var, 6), z13);
                if (c6Var.b3 == null) {
                }
                z11 = false;
                F.l(R.drawable.menu_transfer, hd.M0(2131749918, null), new l1(c6Var, 21), z11);
                F.l(R.drawable.menu_transfer, hd.M0(2131749918, null), new l1(c6Var, 22), c6Var.b3 != null);
                F.l(R.drawable.msg_view_file, hd.M0(2131749846, null), new l1(c6Var, 14), (c6Var.B2 == null || c6Var.x1() == 0) ? false : true);
                F.m(R.drawable.msg_delete, new l1(c6Var, 15), hd.M0(2131750218, null), c6Var.p1(), true);
                F.t = false;
                F.Y = true;
                F.s = 0;
                F.a0(r4[0] + c6Var.u0, -org.telegram.messenger.g0.L(2.0f));
                FrameLayout frameLayout22 = c6Var.c;
                if (F.A instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                }
                F.Z();
                break;
            case 20:
                c6Var.T1(true);
                break;
            case 21:
                if (view.getAlpha() >= 0.99f) {
                    c6Var.X1();
                    break;
                } else {
                    c6Var.q1();
                    break;
                }
            case 22:
                c6Var.S1();
                break;
            case 23:
                c6Var.O1();
                break;
            case 24:
                if (view.getAlpha() < 0.99f) {
                    c6Var.q1();
                    break;
                } else {
                    TL_stars.TL_starGiftUnique H14 = c6Var.H1();
                    if (H14 != null) {
                        if (H14.resell_amount != null) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, c6Var.getContext(), c6Var.J0);
                            String a02 = hd.a0(null, null, 2131749886, c6Var.z1());
                            org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
                            t1Var.S = a02;
                            t1Var.U = hd.M0(2131749887, null);
                            alertDialog$Builder.k(hd.M0(2131750432, null), new p3(c6Var, H14, r6 ? 1 : 0));
                            alertDialog$Builder.h(hd.M0(2131752589, null), new o(1));
                            alertDialog$Builder.p();
                            break;
                        } else {
                            gj gjVar2 = c6Var.D2;
                            if (gjVar2 != null && (message3 = gjVar2.k) != null) {
                                TLRPC.MessageAction messageAction2 = message3.action;
                                if (messageAction2 instanceof TLRPC.TL_messageActionStarGiftUnique) {
                                    i7 = ((TLRPC.TL_messageActionStarGiftUnique) messageAction2).can_resell_at;
                                    if (i7 > ConnectionsManager.getInstance(c6Var.a).getCurrentTime()) {
                                        lb.i1(c6Var.getContext(), c6Var.a, null, new q3(c6Var, H14, r6 ? 1 : 0), c6Var.J0);
                                        break;
                                    } else {
                                        Context context = c6Var.getContext();
                                        gj gjVar3 = c6Var.D2;
                                        if (gjVar3 != null && (message2 = gjVar3.k) != null) {
                                            TLRPC.MessageAction messageAction3 = message2.action;
                                            if (messageAction3 instanceof TLRPC.TL_messageActionStarGiftUnique) {
                                                i12 = ((TLRPC.TL_messageActionStarGiftUnique) messageAction3).can_resell_at;
                                                c6Var.r2(i12 - ConnectionsManager.getInstance(c6Var.a).getCurrentTime(), context, true);
                                                break;
                                            }
                                        }
                                        TL_stars.SavedStarGift savedStarGift4 = c6Var.B2;
                                        if (savedStarGift4 != null) {
                                            i12 = savedStarGift4.can_resell_at;
                                        }
                                        c6Var.r2(i12 - ConnectionsManager.getInstance(c6Var.a).getCurrentTime(), context, true);
                                    }
                                }
                            }
                            TL_stars.SavedStarGift savedStarGift5 = c6Var.B2;
                            i7 = savedStarGift5 != null ? savedStarGift5.can_resell_at : 0;
                            if (i7 > ConnectionsManager.getInstance(c6Var.a).getCurrentTime()) {
                            }
                        }
                    }
                }
                break;
            case 25:
                TL_stars.TL_starGiftUnique H15 = c6Var.H1();
                if (H15 != null) {
                    lb.i1(c6Var.getContext(), c6Var.a, H15, new q3(c6Var, H15, i11), c6Var.J0);
                    break;
                }
                break;
            case 26:
                c6Var.U2 = true;
                c6Var.u2(false);
                break;
            case 27:
                c6Var.T1(false);
                break;
            case 28:
                c6Var.c2();
                break;
            default:
                c6Var.onBackPressed();
                break;
        }
    }
}
