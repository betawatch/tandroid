package ci;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.bd;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.h10;
import org.telegram.messenger.hp;
import org.telegram.messenger.n10;
import org.telegram.messenger.zi;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.f60;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class r1 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ l6 b;

    public /* synthetic */ r1(l6 l6Var, int i3) {
        this.a = i3;
        this.b = l6Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:167:0x02e6, code lost:
    
        if (r1 != null) goto L167;
     */
    /* JADX WARN: Removed duplicated region for block: B:132:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x02f6  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0311  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0326  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0313  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ed  */
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
        int i3;
        TLRPC.Message message2;
        TLRPC.Message message3;
        int i10 = this.a;
        int i11 = 18;
        int i12 = 2;
        int i13 = 0;
        final l6 l6Var = this.b;
        switch (i10) {
            case 0:
                org.telegram.ui.Wallet.f5 f5Var = l6Var.a3;
                if (f5Var != null) {
                    l6Var.dismiss();
                    org.telegram.messenger.g0.i3(new d1(f5Var, 2), 250L);
                    break;
                }
                break;
            case 1:
                l6Var.b2();
                break;
            case 2:
                l6Var.R1();
                break;
            case 3:
                if (l6Var.H1() != null && l6Var.H1().host_id != null) {
                    l6Var.S1();
                    break;
                } else {
                    org.telegram.messenger.k5.o(null, 2131749840, l6Var.k(), R.raw.info, 36);
                    break;
                }
                break;
            case 4:
                l6Var.R2 = true;
                l6Var.t2(false);
                break;
            case 5:
                l6Var.onBackPressed();
                break;
            case 6:
                l6Var.t1();
                break;
            case 7:
                l6Var.onBackPressed();
                break;
            case 8:
                l6Var.Z1();
                break;
            case 9:
                l6Var.dismiss();
                break;
            case 10:
                l6Var.Z1();
                break;
            case 11:
                l6Var.onBackPressed();
                break;
            case 12:
                l6Var.N1();
                break;
            case 13:
                l6Var.Z1();
                break;
            case 14:
                l6Var.onBackPressed();
                break;
            case 15:
                l6Var.T1(true);
                break;
            case 16:
                l6Var.Z1();
                break;
            case 17:
                if (view.getAlpha() >= 1.0f) {
                    gi.d dVar = l6Var.d2;
                    dVar.i(bd.M0(2131749795, null), true, true);
                    dVar.g(null, true);
                    dVar.setOnClickListener(new r1(l6Var, 28));
                    l6Var.Y1.i(3, bd.M0(2131749787, null), bd.M0(2131749788, null), null);
                    l6Var.s2(3, true, null);
                    break;
                }
                break;
            case 18:
                if (!l6Var.d2.R) {
                    l6Var.p2.a(!r1.a.q, true);
                    break;
                }
                break;
            case 19:
                final TL_stars.TL_starGiftUnique H1 = l6Var.H1();
                if (H1 != null && !TextUtils.isEmpty(H1.slug)) {
                    r6 = H1.host_id == null;
                    if (l6Var.p3 == null) {
                        l6Var.p3 = Boolean.valueOf(!r6);
                    }
                    l6Var.m2(H1, r6);
                    final int i14 = l6Var.o3 + 1;
                    l6Var.o3 = i14;
                    TL_stars.displayStarGift displaystargift = new TL_stars.displayStarGift();
                    displaystargift.peer = r6 ? hp.s1(l6Var.a).j1(h10.i(l6Var.a).e()) : null;
                    displaystargift.slug = H1.slug;
                    ConnectionsManager.getInstance(l6Var.a).sendRequestTyped(displaystargift, new c3.b(1), new n10() { // from class: ci.v1
                        @Override // org.telegram.messenger.n10
                        public final void a(Object obj, Object obj2) {
                            TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                            boolean z12 = ((TLRPC.Bool) obj) instanceof TLRPC.TL_boolTrue;
                            l6 l6Var2 = l6.this;
                            if (z12) {
                                l6Var2.p3 = Boolean.valueOf(r2);
                                return;
                            }
                            if (i14 != l6Var2.o3) {
                                return;
                            }
                            l6Var2.m2(H1, l6Var2.p3.booleanValue());
                            l6Var2.k().e0(tL_error != null ? tL_error.text : "NULL_ERROR", false);
                        }
                    });
                    break;
                }
                break;
            case 20:
                String C1 = l6Var.C1();
                TL_stars.TL_starGiftUnique H12 = l6Var.H1();
                t4 t4Var = l6Var.R1;
                t4Var.getLocationInWindow(new int[2]);
                f60 F = f60.F(t4Var, l6Var.J0, view);
                boolean z12 = (l6Var.H1() == null || !l6.L1(l6Var.a, org.telegram.messenger.m5.o(l6Var.H1().owner_id)) || !(l6Var.z2 instanceof v8) || l6Var.y2 == null || l6Var.B1() == null) ? false : true;
                TL_stars.SavedStarGift savedStarGift = l6Var.y2;
                F.l((savedStarGift == null || !savedStarGift.pinned_to_top) ? R.drawable.msg_pin : R.drawable.msg_unpin, bd.M0((savedStarGift == null || !savedStarGift.pinned_to_top) ? 2131750086 : 2131749892, null), new s1(l6Var, 13), z12);
                F.l(R.drawable.outline_craft, bd.M0(2131749809, null), new s1(l6Var, 16), l6Var.o1());
                F.l(R.drawable.menu_edit_price, bd.M0(2131750272, null), new s1(l6Var, 17), (l6Var.H1() == null || !l6.L1(l6Var.a, org.telegram.messenger.m5.o(l6Var.H1().owner_id)) || l6Var.H1().resell_amount == null) ? false : true);
                F.l(R.drawable.msg_link, bd.M0(2131751762, null), new m3(l6Var, C1, 7), C1 != null);
                F.l(R.drawable.msg_share, bd.M0(2131745469, null), new s1(l6Var, i11), C1 != null);
                F.l(R.drawable.input_suggest_paid_24, bd.M0(2131749695, null), new s1(l6Var, 19), H12 != null && H12.offer_min_stars > 0);
                TL_stars.TL_starGiftUnique H13 = l6Var.H1();
                if (H13 != null && H13.theme_available) {
                    long o10 = org.telegram.messenger.m5.o(H13.owner_id);
                    long o11 = org.telegram.messenger.m5.o(H13.host_id);
                    if ((o10 > 0 && l6.L1(l6Var.a, o10)) || (o11 > 0 && l6.L1(l6Var.a, o11))) {
                        z10 = true;
                        F.l(R.drawable.msg_colors, bd.M0(2131749604, null), new s1(l6Var, 20), z10);
                        boolean z13 = l6Var.Y2 != null && l6Var.x2 && l6Var.y2 != null && l6.K1(l6Var.a, l6Var.Q1);
                        TL_stars.SavedStarGift savedStarGift2 = l6Var.y2;
                        F.l((savedStarGift2 != null || savedStarGift2.unsaved) ? R.drawable.menu_show_on_profile : R.drawable.menu_hide_from_profile, bd.M0((savedStarGift2 != null || savedStarGift2.unsaved) ? 2131749988 : 2131750196, null), new s1(l6Var, 6), z13);
                        if (l6Var.Y2 == null) {
                            if (l6Var.B1() != null) {
                                zi ziVar = l6Var.A2;
                                if (ziVar != null && (message = ziVar.k) != null) {
                                    TLRPC.MessageAction messageAction = message.action;
                                    if (messageAction instanceof TLRPC.TL_messageActionStarGiftUnique) {
                                        TLRPC.TL_messageActionStarGiftUnique tL_messageActionStarGiftUnique = (TLRPC.TL_messageActionStarGiftUnique) messageAction;
                                        if ((tL_messageActionStarGiftUnique.flags & 16) != 0) {
                                            TL_stars.StarGift starGift = tL_messageActionStarGiftUnique.gift;
                                            if (starGift instanceof TL_stars.TL_starGiftUnique) {
                                                tL_starGiftUnique = (TL_stars.TL_starGiftUnique) starGift;
                                                L1 = l6.L1(l6Var.a, org.telegram.messenger.m5.o(tL_starGiftUnique.owner_id));
                                                if (L1) {
                                                    z11 = true;
                                                    F.l(R.drawable.menu_transfer, bd.M0(2131749926, null), new s1(l6Var, 21), z11);
                                                    F.l(R.drawable.menu_transfer, bd.M0(2131749926, null), new s1(l6Var, 22), l6Var.Y2 != null);
                                                    F.l(R.drawable.msg_view_file, bd.M0(2131749854, null), new s1(l6Var, 14), (l6Var.y2 == null || l6Var.x1() == 0) ? false : true);
                                                    F.m(R.drawable.msg_delete, new s1(l6Var, 15), bd.M0(2131750226, null), l6Var.p1(), true);
                                                    F.t = false;
                                                    F.Y = true;
                                                    F.s = 0;
                                                    F.a0(r4[0] + l6Var.u0, -org.telegram.messenger.g0.L(2.0f));
                                                    F.Z();
                                                    break;
                                                }
                                            }
                                        }
                                    }
                                }
                                TL_stars.SavedStarGift savedStarGift3 = l6Var.y2;
                                if (savedStarGift3 != null) {
                                    TL_stars.StarGift starGift2 = savedStarGift3.gift;
                                    if (starGift2 instanceof TL_stars.TL_starGiftUnique) {
                                        tL_starGiftUnique = (TL_stars.TL_starGiftUnique) starGift2;
                                        L1 = l6.L1(l6Var.a, org.telegram.messenger.m5.o(tL_starGiftUnique.owner_id));
                                        if (L1) {
                                        }
                                    }
                                }
                                tL_starGiftUnique = l6Var.C2;
                                break;
                            }
                            L1 = false;
                            if (L1) {
                            }
                        }
                        z11 = false;
                        F.l(R.drawable.menu_transfer, bd.M0(2131749926, null), new s1(l6Var, 21), z11);
                        F.l(R.drawable.menu_transfer, bd.M0(2131749926, null), new s1(l6Var, 22), l6Var.Y2 != null);
                        F.l(R.drawable.msg_view_file, bd.M0(2131749854, null), new s1(l6Var, 14), (l6Var.y2 == null || l6Var.x1() == 0) ? false : true);
                        F.m(R.drawable.msg_delete, new s1(l6Var, 15), bd.M0(2131750226, null), l6Var.p1(), true);
                        F.t = false;
                        F.Y = true;
                        F.s = 0;
                        F.a0(r4[0] + l6Var.u0, -org.telegram.messenger.g0.L(2.0f));
                        F.Z();
                    }
                }
                z10 = false;
                F.l(R.drawable.msg_colors, bd.M0(2131749604, null), new s1(l6Var, 20), z10);
                if (l6Var.Y2 != null) {
                }
                TL_stars.SavedStarGift savedStarGift22 = l6Var.y2;
                F.l((savedStarGift22 != null || savedStarGift22.unsaved) ? R.drawable.menu_show_on_profile : R.drawable.menu_hide_from_profile, bd.M0((savedStarGift22 != null || savedStarGift22.unsaved) ? 2131749988 : 2131750196, null), new s1(l6Var, 6), z13);
                if (l6Var.Y2 == null) {
                }
                z11 = false;
                F.l(R.drawable.menu_transfer, bd.M0(2131749926, null), new s1(l6Var, 21), z11);
                F.l(R.drawable.menu_transfer, bd.M0(2131749926, null), new s1(l6Var, 22), l6Var.Y2 != null);
                F.l(R.drawable.msg_view_file, bd.M0(2131749854, null), new s1(l6Var, 14), (l6Var.y2 == null || l6Var.x1() == 0) ? false : true);
                F.m(R.drawable.msg_delete, new s1(l6Var, 15), bd.M0(2131750226, null), l6Var.p1(), true);
                F.t = false;
                F.Y = true;
                F.s = 0;
                F.a0(r4[0] + l6Var.u0, -org.telegram.messenger.g0.L(2.0f));
                F.Z();
                break;
            case 21:
                l6Var.T1(true);
                break;
            case 22:
                if (view.getAlpha() >= 0.99f) {
                    l6Var.W1();
                    break;
                } else {
                    l6Var.q1();
                    break;
                }
            case 23:
                l6Var.S1();
                break;
            case 24:
                l6Var.O1();
                break;
            case 25:
                if (view.getAlpha() < 0.99f) {
                    l6Var.q1();
                    break;
                } else {
                    TL_stars.TL_starGiftUnique H14 = l6Var.H1();
                    if (H14 != null) {
                        if (H14.resell_amount != null) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, l6Var.getContext(), l6Var.J0);
                            String a02 = bd.a0(null, null, 2131749894, l6Var.z1());
                            org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.a;
                            s1Var.S = a02;
                            s1Var.U = bd.M0(2131749895, null);
                            alertDialog$Builder.k(bd.M0(2131750440, null), new y3(l6Var, H14, r6 ? 1 : 0));
                            alertDialog$Builder.h(bd.M0(2131752589, null), new a3.j(18));
                            alertDialog$Builder.p();
                            break;
                        } else {
                            zi ziVar2 = l6Var.A2;
                            if (ziVar2 != null && (message3 = ziVar2.k) != null) {
                                TLRPC.MessageAction messageAction2 = message3.action;
                                if (messageAction2 instanceof TLRPC.TL_messageActionStarGiftUnique) {
                                    i3 = ((TLRPC.TL_messageActionStarGiftUnique) messageAction2).can_resell_at;
                                    if (i3 > ConnectionsManager.getInstance(l6Var.a).getCurrentTime()) {
                                        wb.i1(l6Var.getContext(), l6Var.a, null, new z3(l6Var, H14, r6 ? 1 : 0), l6Var.J0);
                                        break;
                                    } else {
                                        Context context = l6Var.getContext();
                                        zi ziVar3 = l6Var.A2;
                                        if (ziVar3 != null && (message2 = ziVar3.k) != null) {
                                            TLRPC.MessageAction messageAction3 = message2.action;
                                            if (messageAction3 instanceof TLRPC.TL_messageActionStarGiftUnique) {
                                                i13 = ((TLRPC.TL_messageActionStarGiftUnique) messageAction3).can_resell_at;
                                                l6Var.q2(i13 - ConnectionsManager.getInstance(l6Var.a).getCurrentTime(), context, true);
                                                break;
                                            }
                                        }
                                        TL_stars.SavedStarGift savedStarGift4 = l6Var.y2;
                                        if (savedStarGift4 != null) {
                                            i13 = savedStarGift4.can_resell_at;
                                        }
                                        l6Var.q2(i13 - ConnectionsManager.getInstance(l6Var.a).getCurrentTime(), context, true);
                                    }
                                }
                            }
                            TL_stars.SavedStarGift savedStarGift5 = l6Var.y2;
                            i3 = savedStarGift5 != null ? savedStarGift5.can_resell_at : 0;
                            if (i3 > ConnectionsManager.getInstance(l6Var.a).getCurrentTime()) {
                            }
                        }
                    }
                }
                break;
            case 26:
                TL_stars.TL_starGiftUnique H15 = l6Var.H1();
                if (H15 != null) {
                    wb.i1(l6Var.getContext(), l6Var.a, H15, new z3(l6Var, H15, i12), l6Var.J0);
                    break;
                }
                break;
            case 27:
                l6Var.R2 = true;
                l6Var.t2(false);
                break;
            case 28:
                l6Var.T1(false);
                break;
            default:
                l6Var.b2();
                break;
        }
    }
}
