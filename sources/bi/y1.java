package bi;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.ij;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.messenger.v10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.k60;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final /* synthetic */ class y1 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ k7 b;

    public /* synthetic */ y1(k7 k7Var, int i7) {
        this.a = i7;
        this.b = k7Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:167:0x02e8, code lost:
    
        if (r1 != null) goto L167;
     */
    /* JADX WARN: Removed duplicated region for block: B:132:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x02f8  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0313  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0326  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0315  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ed  */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onClick(View view) {
        boolean z9;
        boolean z10;
        TL_stars.TL_starGiftUnique tL_starGiftUnique;
        boolean L1;
        TLRPC.Message message;
        int i7;
        TLRPC.Message message2;
        TLRPC.Message message3;
        int i10 = this.a;
        int i11 = 2;
        int i12 = 22;
        int i13 = 0;
        final k7 k7Var = this.b;
        switch (i10) {
            case 0:
                org.telegram.ui.Wallet.h5 h5Var = k7Var.Z2;
                if (h5Var != null) {
                    k7Var.dismiss();
                    org.telegram.messenger.g0.i3(new a3.f(h5Var, 22), 250L);
                    break;
                }
                break;
            case 1:
                k7Var.b2();
                break;
            case 2:
                k7Var.R1();
                break;
            case 3:
                if (k7Var.H1() != null && k7Var.H1().host_id != null) {
                    k7Var.S1();
                    break;
                } else {
                    org.telegram.messenger.k5.o(null, 2131749831, k7Var.k(), R.raw.info, 36);
                    break;
                }
                break;
            case 4:
                k7Var.Q2 = true;
                k7Var.t2(false);
                break;
            case 5:
                k7Var.onBackPressed();
                break;
            case 6:
                k7Var.t1();
                break;
            case 7:
                k7Var.onBackPressed();
                break;
            case 8:
                k7Var.Z1();
                break;
            case 9:
                k7Var.dismiss();
                break;
            case 10:
                k7Var.Z1();
                break;
            case 11:
                k7Var.onBackPressed();
                break;
            case 12:
                k7Var.N1();
                break;
            case 13:
                k7Var.Z1();
                break;
            case 14:
                k7Var.onBackPressed();
                break;
            case 15:
                k7Var.T1(true);
                break;
            case 16:
                k7Var.Z1();
                break;
            case 17:
                if (view.getAlpha() >= 1.0f) {
                    fi.d dVar = k7Var.c2;
                    dVar.i(org.telegram.messenger.hd.M0(2131749786, null), true, true);
                    dVar.g(null, true);
                    dVar.setOnClickListener(new y1(k7Var, 28));
                    k7Var.X1.i(3, org.telegram.messenger.hd.M0(2131749778, null), org.telegram.messenger.hd.M0(2131749779, null), null);
                    k7Var.s2(3, true, null);
                    break;
                }
                break;
            case 18:
                if (!k7Var.c2.Q) {
                    k7Var.o2.a(!r1.a.q, true);
                    break;
                }
                break;
            case 19:
                final TL_stars.TL_starGiftUnique H1 = k7Var.H1();
                if (H1 != null && !TextUtils.isEmpty(H1.slug)) {
                    r6 = H1.host_id == null;
                    if (k7Var.o3 == null) {
                        k7Var.o3 = Boolean.valueOf(!r6);
                    }
                    k7Var.m2(H1, r6);
                    final int i14 = k7Var.n3 + 1;
                    k7Var.n3 = i14;
                    TL_stars.displayStarGift displaystargift = new TL_stars.displayStarGift();
                    displaystargift.peer = r6 ? qp.s1(k7Var.a).j1(p10.i(k7Var.a).e()) : null;
                    displaystargift.slug = H1.slug;
                    ConnectionsManager.getInstance(k7Var.a).sendRequestTyped(displaystargift, new d3.b(1), new v10() { // from class: bi.c2
                        @Override // org.telegram.messenger.v10
                        public final void a(Object obj, Object obj2) {
                            TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                            boolean z11 = ((TLRPC.Bool) obj) instanceof TLRPC.TL_boolTrue;
                            k7 k7Var2 = k7.this;
                            if (z11) {
                                k7Var2.o3 = Boolean.valueOf(r2);
                                return;
                            }
                            if (i14 != k7Var2.n3) {
                                return;
                            }
                            k7Var2.m2(H1, k7Var2.o3.booleanValue());
                            k7Var2.k().e0(tL_error != null ? tL_error.text : "NULL_ERROR", false);
                        }
                    });
                    break;
                }
                break;
            case 20:
                String C1 = k7Var.C1();
                TL_stars.TL_starGiftUnique H12 = k7Var.H1();
                m5 m5Var = k7Var.Q1;
                m5Var.getLocationInWindow(new int[2]);
                k60 F = k60.F(m5Var, k7Var.I0, view);
                boolean z11 = (k7Var.H1() == null || !k7.L1(k7Var.a, org.telegram.messenger.m5.o(k7Var.H1().owner_id)) || !(k7Var.y2 instanceof v9) || k7Var.x2 == null || k7Var.B1() == null) ? false : true;
                TL_stars.SavedStarGift savedStarGift = k7Var.x2;
                F.l((savedStarGift == null || !savedStarGift.pinned_to_top) ? R.drawable.msg_pin : R.drawable.msg_unpin, org.telegram.messenger.hd.M0((savedStarGift == null || !savedStarGift.pinned_to_top) ? 2131750077 : 2131749883, null), new z1(k7Var, 13), z11);
                F.l(R.drawable.outline_craft, org.telegram.messenger.hd.M0(2131749800, null), new z1(k7Var, 16), k7Var.o1());
                F.l(R.drawable.menu_edit_price, org.telegram.messenger.hd.M0(2131750263, null), new z1(k7Var, 17), (k7Var.H1() == null || !k7.L1(k7Var.a, org.telegram.messenger.m5.o(k7Var.H1().owner_id)) || k7Var.H1().resell_amount == null) ? false : true);
                F.l(R.drawable.msg_link, org.telegram.messenger.hd.M0(2131751762, null), new b4(k7Var, C1, 7), C1 != null);
                F.l(R.drawable.msg_share, org.telegram.messenger.hd.M0(2131745460, null), new z1(k7Var, 18), C1 != null);
                F.l(R.drawable.input_suggest_paid_24, org.telegram.messenger.hd.M0(2131749686, null), new z1(k7Var, 19), H12 != null && H12.offer_min_stars > 0);
                TL_stars.TL_starGiftUnique H13 = k7Var.H1();
                if (H13 != null && H13.theme_available) {
                    long o4 = org.telegram.messenger.m5.o(H13.owner_id);
                    long o10 = org.telegram.messenger.m5.o(H13.host_id);
                    if ((o4 > 0 && k7.L1(k7Var.a, o4)) || (o10 > 0 && k7.L1(k7Var.a, o10))) {
                        z9 = true;
                        F.l(R.drawable.msg_colors, org.telegram.messenger.hd.M0(2131749595, null), new z1(k7Var, 20), z9);
                        boolean z12 = k7Var.X2 != null && k7Var.w2 && k7Var.x2 != null && k7.K1(k7Var.a, k7Var.P1);
                        TL_stars.SavedStarGift savedStarGift2 = k7Var.x2;
                        F.l((savedStarGift2 != null || savedStarGift2.unsaved) ? R.drawable.menu_show_on_profile : R.drawable.menu_hide_from_profile, org.telegram.messenger.hd.M0((savedStarGift2 != null || savedStarGift2.unsaved) ? 2131749979 : 2131750187, null), new z1(k7Var, 6), z12);
                        if (k7Var.X2 == null) {
                            if (k7Var.B1() != null) {
                                ij ijVar = k7Var.z2;
                                if (ijVar != null && (message = ijVar.k) != null) {
                                    TLRPC.MessageAction messageAction = message.action;
                                    if (messageAction instanceof TLRPC.TL_messageActionStarGiftUnique) {
                                        TLRPC.TL_messageActionStarGiftUnique tL_messageActionStarGiftUnique = (TLRPC.TL_messageActionStarGiftUnique) messageAction;
                                        if ((tL_messageActionStarGiftUnique.flags & 16) != 0) {
                                            TL_stars.StarGift starGift = tL_messageActionStarGiftUnique.gift;
                                            if (starGift instanceof TL_stars.TL_starGiftUnique) {
                                                tL_starGiftUnique = (TL_stars.TL_starGiftUnique) starGift;
                                                L1 = k7.L1(k7Var.a, org.telegram.messenger.m5.o(tL_starGiftUnique.owner_id));
                                                if (L1) {
                                                    z10 = true;
                                                    F.l(R.drawable.menu_transfer, org.telegram.messenger.hd.M0(2131749917, null), new z1(k7Var, 21), z10);
                                                    F.l(R.drawable.menu_transfer, org.telegram.messenger.hd.M0(2131749917, null), new z1(k7Var, i12), k7Var.X2 != null);
                                                    F.l(R.drawable.msg_view_file, org.telegram.messenger.hd.M0(2131749845, null), new z1(k7Var, 14), (k7Var.x2 == null || k7Var.x1() == 0) ? false : true);
                                                    F.m(R.drawable.msg_delete, new z1(k7Var, 15), org.telegram.messenger.hd.M0(2131750217, null), k7Var.p1(), true);
                                                    F.t = false;
                                                    F.Y = true;
                                                    F.s = 0;
                                                    F.a0(r3[0] + k7Var.t0, -org.telegram.messenger.g0.L(2.0f));
                                                    F.Z();
                                                    break;
                                                }
                                            }
                                        }
                                    }
                                }
                                TL_stars.SavedStarGift savedStarGift3 = k7Var.x2;
                                if (savedStarGift3 != null) {
                                    TL_stars.StarGift starGift2 = savedStarGift3.gift;
                                    if (starGift2 instanceof TL_stars.TL_starGiftUnique) {
                                        tL_starGiftUnique = (TL_stars.TL_starGiftUnique) starGift2;
                                        L1 = k7.L1(k7Var.a, org.telegram.messenger.m5.o(tL_starGiftUnique.owner_id));
                                        if (L1) {
                                        }
                                    }
                                }
                                tL_starGiftUnique = k7Var.B2;
                                break;
                            }
                            L1 = false;
                            if (L1) {
                            }
                        }
                        z10 = false;
                        F.l(R.drawable.menu_transfer, org.telegram.messenger.hd.M0(2131749917, null), new z1(k7Var, 21), z10);
                        F.l(R.drawable.menu_transfer, org.telegram.messenger.hd.M0(2131749917, null), new z1(k7Var, i12), k7Var.X2 != null);
                        F.l(R.drawable.msg_view_file, org.telegram.messenger.hd.M0(2131749845, null), new z1(k7Var, 14), (k7Var.x2 == null || k7Var.x1() == 0) ? false : true);
                        F.m(R.drawable.msg_delete, new z1(k7Var, 15), org.telegram.messenger.hd.M0(2131750217, null), k7Var.p1(), true);
                        F.t = false;
                        F.Y = true;
                        F.s = 0;
                        F.a0(r3[0] + k7Var.t0, -org.telegram.messenger.g0.L(2.0f));
                        F.Z();
                    }
                }
                z9 = false;
                F.l(R.drawable.msg_colors, org.telegram.messenger.hd.M0(2131749595, null), new z1(k7Var, 20), z9);
                if (k7Var.X2 != null) {
                }
                TL_stars.SavedStarGift savedStarGift22 = k7Var.x2;
                F.l((savedStarGift22 != null || savedStarGift22.unsaved) ? R.drawable.menu_show_on_profile : R.drawable.menu_hide_from_profile, org.telegram.messenger.hd.M0((savedStarGift22 != null || savedStarGift22.unsaved) ? 2131749979 : 2131750187, null), new z1(k7Var, 6), z12);
                if (k7Var.X2 == null) {
                }
                z10 = false;
                F.l(R.drawable.menu_transfer, org.telegram.messenger.hd.M0(2131749917, null), new z1(k7Var, 21), z10);
                F.l(R.drawable.menu_transfer, org.telegram.messenger.hd.M0(2131749917, null), new z1(k7Var, i12), k7Var.X2 != null);
                F.l(R.drawable.msg_view_file, org.telegram.messenger.hd.M0(2131749845, null), new z1(k7Var, 14), (k7Var.x2 == null || k7Var.x1() == 0) ? false : true);
                F.m(R.drawable.msg_delete, new z1(k7Var, 15), org.telegram.messenger.hd.M0(2131750217, null), k7Var.p1(), true);
                F.t = false;
                F.Y = true;
                F.s = 0;
                F.a0(r3[0] + k7Var.t0, -org.telegram.messenger.g0.L(2.0f));
                F.Z();
                break;
            case 21:
                k7Var.T1(true);
                break;
            case 22:
                if (view.getAlpha() >= 0.99f) {
                    k7Var.W1();
                    break;
                } else {
                    k7Var.q1();
                    break;
                }
            case 23:
                k7Var.S1();
                break;
            case 24:
                k7Var.O1();
                break;
            case 25:
                if (view.getAlpha() < 0.99f) {
                    k7Var.q1();
                    break;
                } else {
                    TL_stars.TL_starGiftUnique H14 = k7Var.H1();
                    if (H14 != null) {
                        if (H14.resell_amount != null) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, k7Var.getContext(), k7Var.I0);
                            String a02 = org.telegram.messenger.hd.a0(null, null, 2131749885, k7Var.z1());
                            org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
                            u1Var.R = a02;
                            u1Var.T = org.telegram.messenger.hd.M0(2131749886, null);
                            alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131750431, null), new o4(k7Var, H14, r6 ? 1 : 0));
                            alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), new a3.l(22));
                            alertDialog$Builder.p();
                            break;
                        } else {
                            ij ijVar2 = k7Var.z2;
                            if (ijVar2 != null && (message3 = ijVar2.k) != null) {
                                TLRPC.MessageAction messageAction2 = message3.action;
                                if (messageAction2 instanceof TLRPC.TL_messageActionStarGiftUnique) {
                                    i7 = ((TLRPC.TL_messageActionStarGiftUnique) messageAction2).can_resell_at;
                                    if (i7 > ConnectionsManager.getInstance(k7Var.a).getCurrentTime()) {
                                        dd.i1(k7Var.getContext(), k7Var.a, null, new p4(k7Var, H14, r6 ? 1 : 0), k7Var.I0);
                                        break;
                                    } else {
                                        Context context = k7Var.getContext();
                                        ij ijVar3 = k7Var.z2;
                                        if (ijVar3 != null && (message2 = ijVar3.k) != null) {
                                            TLRPC.MessageAction messageAction3 = message2.action;
                                            if (messageAction3 instanceof TLRPC.TL_messageActionStarGiftUnique) {
                                                i13 = ((TLRPC.TL_messageActionStarGiftUnique) messageAction3).can_resell_at;
                                                k7Var.q2(i13 - ConnectionsManager.getInstance(k7Var.a).getCurrentTime(), context, true);
                                                break;
                                            }
                                        }
                                        TL_stars.SavedStarGift savedStarGift4 = k7Var.x2;
                                        if (savedStarGift4 != null) {
                                            i13 = savedStarGift4.can_resell_at;
                                        }
                                        k7Var.q2(i13 - ConnectionsManager.getInstance(k7Var.a).getCurrentTime(), context, true);
                                    }
                                }
                            }
                            TL_stars.SavedStarGift savedStarGift5 = k7Var.x2;
                            i7 = savedStarGift5 != null ? savedStarGift5.can_resell_at : 0;
                            if (i7 > ConnectionsManager.getInstance(k7Var.a).getCurrentTime()) {
                            }
                        }
                    }
                }
                break;
            case 26:
                TL_stars.TL_starGiftUnique H15 = k7Var.H1();
                if (H15 != null) {
                    dd.i1(k7Var.getContext(), k7Var.a, H15, new p4(k7Var, H15, i11), k7Var.I0);
                    break;
                }
                break;
            case 27:
                k7Var.Q2 = true;
                k7Var.t2(false);
                break;
            case 28:
                k7Var.T1(false);
                break;
            default:
                k7Var.b2();
                break;
        }
    }
}
