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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class lpa implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ wsa b;

    public /* synthetic */ lpa(wsa wsaVar, byte b) {
        this.a = b;
        this.b = wsaVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:201:0x02e6, code lost:
    
        if (r2 != null) goto L179;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0172, code lost:
    
        if (pg3.n(r15) == z8c.h(r0.a).e()) goto L79;
     */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x02f8  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0317  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x033e  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0361  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0381  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x03a2  */
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
        byte b2 = 24;
        byte b3 = 0;
        byte b4 = 1;
        final wsa wsaVar = this.b;
        switch (b) {
            case 0:
                wsaVar.X1();
                break;
            case 1:
                wsaVar.M1();
                break;
            case 2:
                wsaVar.onBackPressed();
                break;
            case 3:
                hsa hsaVar = wsaVar.K2;
                hsaVar.h.e();
                hsaVar.i.e();
                hsaVar.j.e();
                hsaVar.k.e();
                break;
            case 4:
                wsaVar.R1();
                break;
            case 5:
                qnc qncVar = wsaVar.c3;
                if (qncVar != null) {
                    wsaVar.dismiss();
                    gm.d3(new c0a(qncVar, b2), 250L);
                    break;
                }
                break;
            case 6:
                wsaVar.f2();
                break;
            case 7:
                wsaVar.R1();
                break;
            case 8:
                if (wsaVar.A1() != null && wsaVar.A1().host_id != null) {
                    wsaVar.S1();
                    break;
                } else {
                    ts2.u(null, 2131749765, wsaVar.j(), R.raw.info, 36);
                    break;
                }
            case 9:
                wsaVar.T2 = true;
                wsaVar.A2(false);
                break;
            case 10:
                wsaVar.onBackPressed();
                break;
            case 11:
                wsaVar.onBackPressed();
                break;
            case 12:
                wsaVar.l1();
                break;
            case 13:
                wsaVar.d2();
                break;
            case 14:
                wsaVar.d2();
                break;
            case 15:
                wsaVar.onBackPressed();
                break;
            case 16:
                wsaVar.dismiss();
                break;
            case 17:
                wsaVar.M1();
                break;
            case 18:
                wsaVar.d2();
                break;
            case 19:
                wsaVar.onBackPressed();
                break;
            case 20:
                wsaVar.T1(true);
                break;
            case 21:
                wsaVar.d2();
                break;
            case 22:
                if (view.getAlpha() >= 1.0f) {
                    b61 b61Var = wsaVar.f2;
                    b61Var.i(jb6.M0(2131749720, null), true, true);
                    b61Var.g(null, true);
                    b61Var.setOnClickListener(new rqa(wsaVar, (byte) 3));
                    wsaVar.a2.i(3, jb6.M0(2131749712, null), jb6.M0(2131749713, null), null);
                    wsaVar.z2(3, true, null);
                    break;
                }
                break;
            case 23:
                if (!wsaVar.f2.R) {
                    wsaVar.r2.a(!r0.a.q, true);
                    break;
                }
                break;
            case 24:
                final TL_stars.TL_starGiftUnique A12 = wsaVar.A1();
                if (A12 != null && !TextUtils.isEmpty(A12.slug)) {
                    final boolean z7 = A12.host_id == null;
                    if (wsaVar.u3 == null) {
                        wsaVar.u3 = Boolean.valueOf(!z7);
                    }
                    wsaVar.q2(A12, z7);
                    final int i = wsaVar.t3 + 1;
                    wsaVar.t3 = i;
                    TL_stars.displayStarGift displaystargift = new TL_stars.displayStarGift();
                    displaystargift.peer = z7 ? oc7.r1(wsaVar.a).i1(z8c.h(wsaVar.a).e()) : null;
                    displaystargift.slug = A12.slug;
                    ConnectionsManager.getInstance(wsaVar.a).sendRequestTyped(displaystargift, new kc((byte) 0), new jac() { // from class: rpa
                        @Override // jac
                        public final void a(Object obj, Object obj2) {
                            TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                            boolean z8 = ((TLRPC.Bool) obj) instanceof TLRPC.TL_boolTrue;
                            wsa wsaVar2 = wsa.this;
                            if (z8) {
                                wsaVar2.u3 = Boolean.valueOf(z7);
                                return;
                            }
                            if (i != wsaVar2.t3) {
                                return;
                            }
                            wsaVar2.q2(A12, wsaVar2.u3.booleanValue());
                            wsaVar2.j().f0(tL_error != null ? tL_error.text : "NULL_ERROR", false);
                        }
                    });
                    break;
                }
                break;
            case 25:
                String v1 = wsaVar.v1();
                TL_stars.TL_starGiftUnique A13 = wsaVar.A1();
                wsaVar.T1.getLocationInWindow(new int[2]);
                bu5 G = bu5.G(wsaVar.T1, wsaVar.J0, view);
                boolean z8 = (wsaVar.A1() == null || !wsa.G1(wsaVar.a, pg3.n(wsaVar.A1().owner_id)) || !(wsaVar.B2 instanceof ava) || wsaVar.A2 == null || wsaVar.u1() == null) ? false : true;
                TL_stars.SavedStarGift savedStarGift = wsaVar.A2;
                G.k((savedStarGift == null || !savedStarGift.pinned_to_top) ? R.drawable.msg_pin : R.drawable.msg_unpin, jb6.M0((savedStarGift == null || !savedStarGift.pinned_to_top) ? 2131750011 : 2131749817, null), new npa(wsaVar, (byte) 18), z8);
                G.k(R.drawable.outline_craft, jb6.M0(2131749734, null), new npa(wsaVar, (byte) 25), wsaVar.f1());
                G.k(R.drawable.menu_edit_price, jb6.M0(2131750197, null), new npa(wsaVar, (byte) 26), (wsaVar.A1() == null || !wsa.G1(wsaVar.a, pg3.n(wsaVar.A1().owner_id)) || wsaVar.A1().resell_amount == null || fs7.u(wsaVar.A1())) ? false : true);
                G.k(R.drawable.msg_link, jb6.M0(2131751699, null), new nqa(wsaVar, v1, (byte) 7), v1 != null);
                G.k(R.drawable.msg_share, jb6.M0(2131745193, null), new npa(wsaVar, (byte) 27), v1 != null);
                if (wsaVar.d3 == null) {
                    int i2 = wsaVar.a;
                    TL_stars.TL_starGiftUnique A14 = wsaVar.A1();
                    if (wsaVar.a3 != null || wsaVar.E1(wsaVar.A1())) {
                        j = 0;
                    } else {
                        TL_stars.TL_starGiftUnique A15 = wsaVar.A1();
                        if (A15 != null && (r15 = A15.host_id) != null) {
                            j = 0;
                            break;
                        } else {
                            j = 0;
                        }
                        z6 = false;
                        HashMap hashMap = yr7.a;
                        if (A14 != null && !TextUtils.isEmpty(A14.gift_address) && !TextUtils.isEmpty(A14.owner_address) && !TextUtils.isEmpty(A14.slug) && !z6 && A14.offer_min_amount > j && (((arrayList = A14.resell_amount) == null || arrayList.isEmpty()) && oc7.r1(i2).l4.n0.f)) {
                            n2 = pg3.n(A14.owner_id);
                            if ((n2 != j || n2 != z8c.h(i2).e()) && (TextUtils.isEmpty(A14.owner_address) || (x = c.C(i2).x()) == null || !c.b(A14.owner_address, x))) {
                                z = true;
                                G.k(R.drawable.input_suggest_paid_24, jb6.M0(2131749619, null), new npa(wsaVar, (byte) 28), z);
                                if (wsaVar.d3 == null) {
                                    HashMap hashMap2 = yr7.a;
                                    if (A13 != null && TextUtils.isEmpty(A13.owner_address) && A13.offer_min_stars > 0 && A13.owner_id != null) {
                                        z2 = true;
                                        G.k(R.drawable.input_suggest_paid_24, jb6.M0(2131749619, null), new npa(wsaVar, (byte) 29), z2);
                                        A1 = wsaVar.A1();
                                        if (A1 != null && A1.theme_available) {
                                            n = pg3.n(A1.owner_id);
                                            long n3 = pg3.n(A1.host_id);
                                            if ((n > j && wsa.G1(wsaVar.a, n)) || (n3 > j && wsa.G1(wsaVar.a, n3))) {
                                                z3 = true;
                                                G.k(R.drawable.msg_colors, jb6.M0(2131749370, null), new tqa(wsaVar, b3), z3);
                                                boolean z9 = wsaVar.a3 != null && wsaVar.z2 && wsaVar.A2 != null && wsa.F1(wsaVar.a, wsaVar.S1);
                                                TL_stars.SavedStarGift savedStarGift2 = wsaVar.A2;
                                                G.k((savedStarGift2 != null || savedStarGift2.unsaved) ? R.drawable.menu_show_on_profile : R.drawable.menu_hide_from_profile, jb6.M0((savedStarGift2 != null || savedStarGift2.unsaved) ? 2131749913 : 2131750121, null), new npa(wsaVar, (byte) 8), z9);
                                                if (wsaVar.a3 == null) {
                                                    if (wsaVar.u1() != null) {
                                                        k47 k47Var = wsaVar.C2;
                                                        if (k47Var != null && (message = k47Var.k) != null) {
                                                            TLRPC.MessageAction messageAction = message.action;
                                                            if (messageAction instanceof TLRPC.TL_messageActionStarGiftUnique) {
                                                                TLRPC.TL_messageActionStarGiftUnique tL_messageActionStarGiftUnique = (TLRPC.TL_messageActionStarGiftUnique) messageAction;
                                                                if ((tL_messageActionStarGiftUnique.flags & 16) != 0) {
                                                                    TL_stars.StarGift starGift = tL_messageActionStarGiftUnique.gift;
                                                                    if (starGift instanceof TL_stars.TL_starGiftUnique) {
                                                                        tL_starGiftUnique = (TL_stars.TL_starGiftUnique) starGift;
                                                                        z5 = wsa.G1(wsaVar.a, pg3.n(tL_starGiftUnique.owner_id));
                                                                        if (z5 && !fs7.m(A13)) {
                                                                            z4 = true;
                                                                            G.k(R.drawable.menu_transfer, jb6.M0(2131749851, null), new tqa(wsaVar, b4), z4);
                                                                            G.k(R.drawable.menu_transfer, jb6.M0(2131749851, null), new npa(wsaVar, (byte) 19), wsaVar.a3 == null || (wsaVar.d3 == null && (wsaVar.x2(A13) || wsaVar.H1(A13))));
                                                                            G.k(R.drawable.menu_feature_paid, jb6.M0(2131749474, null), new npa(wsaVar, (byte) 20), (wsaVar.h1() || fs7.m(A13)) ? false : true);
                                                                            G.k(R.drawable.menu_edit_price, jb6.M0(2131750197, null), new npa(wsaVar, (byte) 21), !wsaVar.h1() && fs7.m(A13));
                                                                            G.k(R.drawable.msg_delete, jb6.M0(2131750365, null), new npa(wsaVar, (byte) 22), !wsaVar.h1() && fs7.m(A13));
                                                                            G.k(R.drawable.msg_view_file, jb6.M0(2131749779, null), new npa(wsaVar, (byte) 23), (wsaVar.A2 == null || wsaVar.q1() == j) ? false : true);
                                                                            G.l(R.drawable.msg_delete, new npa(wsaVar, b2), jb6.M0(2131750151, null), wsaVar.g1(), true);
                                                                            G.t = false;
                                                                            G.b0 = true;
                                                                            G.s = (short) 0;
                                                                            G.b0(r8[0] + wsaVar.u0, -gm.L(2.0f));
                                                                            wsaVar.B0(view, G, false);
                                                                            break;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        TL_stars.SavedStarGift savedStarGift3 = wsaVar.A2;
                                                        if (savedStarGift3 != null) {
                                                            TL_stars.StarGift starGift2 = savedStarGift3.gift;
                                                            if (starGift2 instanceof TL_stars.TL_starGiftUnique) {
                                                                tL_starGiftUnique = (TL_stars.TL_starGiftUnique) starGift2;
                                                                z5 = wsa.G1(wsaVar.a, pg3.n(tL_starGiftUnique.owner_id));
                                                                if (z5) {
                                                                    z4 = true;
                                                                    G.k(R.drawable.menu_transfer, jb6.M0(2131749851, null), new tqa(wsaVar, b4), z4);
                                                                    G.k(R.drawable.menu_transfer, jb6.M0(2131749851, null), new npa(wsaVar, (byte) 19), wsaVar.a3 == null || (wsaVar.d3 == null && (wsaVar.x2(A13) || wsaVar.H1(A13))));
                                                                    G.k(R.drawable.menu_feature_paid, jb6.M0(2131749474, null), new npa(wsaVar, (byte) 20), (wsaVar.h1() || fs7.m(A13)) ? false : true);
                                                                    G.k(R.drawable.menu_edit_price, jb6.M0(2131750197, null), new npa(wsaVar, (byte) 21), !wsaVar.h1() && fs7.m(A13));
                                                                    G.k(R.drawable.msg_delete, jb6.M0(2131750365, null), new npa(wsaVar, (byte) 22), !wsaVar.h1() && fs7.m(A13));
                                                                    G.k(R.drawable.msg_view_file, jb6.M0(2131749779, null), new npa(wsaVar, (byte) 23), (wsaVar.A2 == null || wsaVar.q1() == j) ? false : true);
                                                                    G.l(R.drawable.msg_delete, new npa(wsaVar, b2), jb6.M0(2131750151, null), wsaVar.g1(), true);
                                                                    G.t = false;
                                                                    G.b0 = true;
                                                                    G.s = (short) 0;
                                                                    G.b0(r8[0] + wsaVar.u0, -gm.L(2.0f));
                                                                    wsaVar.B0(view, G, false);
                                                                }
                                                            }
                                                        }
                                                        tL_starGiftUnique = wsaVar.E2;
                                                        break;
                                                    }
                                                    z5 = false;
                                                    if (z5) {
                                                    }
                                                }
                                                z4 = false;
                                                G.k(R.drawable.menu_transfer, jb6.M0(2131749851, null), new tqa(wsaVar, b4), z4);
                                                G.k(R.drawable.menu_transfer, jb6.M0(2131749851, null), new npa(wsaVar, (byte) 19), wsaVar.a3 == null || (wsaVar.d3 == null && (wsaVar.x2(A13) || wsaVar.H1(A13))));
                                                G.k(R.drawable.menu_feature_paid, jb6.M0(2131749474, null), new npa(wsaVar, (byte) 20), (wsaVar.h1() || fs7.m(A13)) ? false : true);
                                                G.k(R.drawable.menu_edit_price, jb6.M0(2131750197, null), new npa(wsaVar, (byte) 21), !wsaVar.h1() && fs7.m(A13));
                                                G.k(R.drawable.msg_delete, jb6.M0(2131750365, null), new npa(wsaVar, (byte) 22), !wsaVar.h1() && fs7.m(A13));
                                                G.k(R.drawable.msg_view_file, jb6.M0(2131749779, null), new npa(wsaVar, (byte) 23), (wsaVar.A2 == null || wsaVar.q1() == j) ? false : true);
                                                G.l(R.drawable.msg_delete, new npa(wsaVar, b2), jb6.M0(2131750151, null), wsaVar.g1(), true);
                                                G.t = false;
                                                G.b0 = true;
                                                G.s = (short) 0;
                                                G.b0(r8[0] + wsaVar.u0, -gm.L(2.0f));
                                                wsaVar.B0(view, G, false);
                                            }
                                        }
                                        z3 = false;
                                        G.k(R.drawable.msg_colors, jb6.M0(2131749370, null), new tqa(wsaVar, b3), z3);
                                        if (wsaVar.a3 != null) {
                                        }
                                        TL_stars.SavedStarGift savedStarGift22 = wsaVar.A2;
                                        G.k((savedStarGift22 != null || savedStarGift22.unsaved) ? R.drawable.menu_show_on_profile : R.drawable.menu_hide_from_profile, jb6.M0((savedStarGift22 != null || savedStarGift22.unsaved) ? 2131749913 : 2131750121, null), new npa(wsaVar, (byte) 8), z9);
                                        if (wsaVar.a3 == null) {
                                        }
                                        z4 = false;
                                        G.k(R.drawable.menu_transfer, jb6.M0(2131749851, null), new tqa(wsaVar, b4), z4);
                                        G.k(R.drawable.menu_transfer, jb6.M0(2131749851, null), new npa(wsaVar, (byte) 19), wsaVar.a3 == null || (wsaVar.d3 == null && (wsaVar.x2(A13) || wsaVar.H1(A13))));
                                        G.k(R.drawable.menu_feature_paid, jb6.M0(2131749474, null), new npa(wsaVar, (byte) 20), (wsaVar.h1() || fs7.m(A13)) ? false : true);
                                        G.k(R.drawable.menu_edit_price, jb6.M0(2131750197, null), new npa(wsaVar, (byte) 21), !wsaVar.h1() && fs7.m(A13));
                                        G.k(R.drawable.msg_delete, jb6.M0(2131750365, null), new npa(wsaVar, (byte) 22), !wsaVar.h1() && fs7.m(A13));
                                        G.k(R.drawable.msg_view_file, jb6.M0(2131749779, null), new npa(wsaVar, (byte) 23), (wsaVar.A2 == null || wsaVar.q1() == j) ? false : true);
                                        G.l(R.drawable.msg_delete, new npa(wsaVar, b2), jb6.M0(2131750151, null), wsaVar.g1(), true);
                                        G.t = false;
                                        G.b0 = true;
                                        G.s = (short) 0;
                                        G.b0(r8[0] + wsaVar.u0, -gm.L(2.0f));
                                        wsaVar.B0(view, G, false);
                                    }
                                }
                                z2 = false;
                                G.k(R.drawable.input_suggest_paid_24, jb6.M0(2131749619, null), new npa(wsaVar, (byte) 29), z2);
                                A1 = wsaVar.A1();
                                if (A1 != null) {
                                    n = pg3.n(A1.owner_id);
                                    long n32 = pg3.n(A1.host_id);
                                    if (n > j) {
                                        z3 = true;
                                        G.k(R.drawable.msg_colors, jb6.M0(2131749370, null), new tqa(wsaVar, b3), z3);
                                        if (wsaVar.a3 != null) {
                                        }
                                        TL_stars.SavedStarGift savedStarGift222 = wsaVar.A2;
                                        G.k((savedStarGift222 != null || savedStarGift222.unsaved) ? R.drawable.menu_show_on_profile : R.drawable.menu_hide_from_profile, jb6.M0((savedStarGift222 != null || savedStarGift222.unsaved) ? 2131749913 : 2131750121, null), new npa(wsaVar, (byte) 8), z9);
                                        if (wsaVar.a3 == null) {
                                        }
                                        z4 = false;
                                        G.k(R.drawable.menu_transfer, jb6.M0(2131749851, null), new tqa(wsaVar, b4), z4);
                                        G.k(R.drawable.menu_transfer, jb6.M0(2131749851, null), new npa(wsaVar, (byte) 19), wsaVar.a3 == null || (wsaVar.d3 == null && (wsaVar.x2(A13) || wsaVar.H1(A13))));
                                        G.k(R.drawable.menu_feature_paid, jb6.M0(2131749474, null), new npa(wsaVar, (byte) 20), (wsaVar.h1() || fs7.m(A13)) ? false : true);
                                        G.k(R.drawable.menu_edit_price, jb6.M0(2131750197, null), new npa(wsaVar, (byte) 21), !wsaVar.h1() && fs7.m(A13));
                                        G.k(R.drawable.msg_delete, jb6.M0(2131750365, null), new npa(wsaVar, (byte) 22), !wsaVar.h1() && fs7.m(A13));
                                        G.k(R.drawable.msg_view_file, jb6.M0(2131749779, null), new npa(wsaVar, (byte) 23), (wsaVar.A2 == null || wsaVar.q1() == j) ? false : true);
                                        G.l(R.drawable.msg_delete, new npa(wsaVar, b2), jb6.M0(2131750151, null), wsaVar.g1(), true);
                                        G.t = false;
                                        G.b0 = true;
                                        G.s = (short) 0;
                                        G.b0(r8[0] + wsaVar.u0, -gm.L(2.0f));
                                        wsaVar.B0(view, G, false);
                                    }
                                    z3 = true;
                                    G.k(R.drawable.msg_colors, jb6.M0(2131749370, null), new tqa(wsaVar, b3), z3);
                                    if (wsaVar.a3 != null) {
                                    }
                                    TL_stars.SavedStarGift savedStarGift2222 = wsaVar.A2;
                                    G.k((savedStarGift2222 != null || savedStarGift2222.unsaved) ? R.drawable.menu_show_on_profile : R.drawable.menu_hide_from_profile, jb6.M0((savedStarGift2222 != null || savedStarGift2222.unsaved) ? 2131749913 : 2131750121, null), new npa(wsaVar, (byte) 8), z9);
                                    if (wsaVar.a3 == null) {
                                    }
                                    z4 = false;
                                    G.k(R.drawable.menu_transfer, jb6.M0(2131749851, null), new tqa(wsaVar, b4), z4);
                                    G.k(R.drawable.menu_transfer, jb6.M0(2131749851, null), new npa(wsaVar, (byte) 19), wsaVar.a3 == null || (wsaVar.d3 == null && (wsaVar.x2(A13) || wsaVar.H1(A13))));
                                    G.k(R.drawable.menu_feature_paid, jb6.M0(2131749474, null), new npa(wsaVar, (byte) 20), (wsaVar.h1() || fs7.m(A13)) ? false : true);
                                    G.k(R.drawable.menu_edit_price, jb6.M0(2131750197, null), new npa(wsaVar, (byte) 21), !wsaVar.h1() && fs7.m(A13));
                                    G.k(R.drawable.msg_delete, jb6.M0(2131750365, null), new npa(wsaVar, (byte) 22), !wsaVar.h1() && fs7.m(A13));
                                    G.k(R.drawable.msg_view_file, jb6.M0(2131749779, null), new npa(wsaVar, (byte) 23), (wsaVar.A2 == null || wsaVar.q1() == j) ? false : true);
                                    G.l(R.drawable.msg_delete, new npa(wsaVar, b2), jb6.M0(2131750151, null), wsaVar.g1(), true);
                                    G.t = false;
                                    G.b0 = true;
                                    G.s = (short) 0;
                                    G.b0(r8[0] + wsaVar.u0, -gm.L(2.0f));
                                    wsaVar.B0(view, G, false);
                                }
                                z3 = false;
                                G.k(R.drawable.msg_colors, jb6.M0(2131749370, null), new tqa(wsaVar, b3), z3);
                                if (wsaVar.a3 != null) {
                                }
                                TL_stars.SavedStarGift savedStarGift22222 = wsaVar.A2;
                                G.k((savedStarGift22222 != null || savedStarGift22222.unsaved) ? R.drawable.menu_show_on_profile : R.drawable.menu_hide_from_profile, jb6.M0((savedStarGift22222 != null || savedStarGift22222.unsaved) ? 2131749913 : 2131750121, null), new npa(wsaVar, (byte) 8), z9);
                                if (wsaVar.a3 == null) {
                                }
                                z4 = false;
                                G.k(R.drawable.menu_transfer, jb6.M0(2131749851, null), new tqa(wsaVar, b4), z4);
                                G.k(R.drawable.menu_transfer, jb6.M0(2131749851, null), new npa(wsaVar, (byte) 19), wsaVar.a3 == null || (wsaVar.d3 == null && (wsaVar.x2(A13) || wsaVar.H1(A13))));
                                G.k(R.drawable.menu_feature_paid, jb6.M0(2131749474, null), new npa(wsaVar, (byte) 20), (wsaVar.h1() || fs7.m(A13)) ? false : true);
                                G.k(R.drawable.menu_edit_price, jb6.M0(2131750197, null), new npa(wsaVar, (byte) 21), !wsaVar.h1() && fs7.m(A13));
                                G.k(R.drawable.msg_delete, jb6.M0(2131750365, null), new npa(wsaVar, (byte) 22), !wsaVar.h1() && fs7.m(A13));
                                G.k(R.drawable.msg_view_file, jb6.M0(2131749779, null), new npa(wsaVar, (byte) 23), (wsaVar.A2 == null || wsaVar.q1() == j) ? false : true);
                                G.l(R.drawable.msg_delete, new npa(wsaVar, b2), jb6.M0(2131750151, null), wsaVar.g1(), true);
                                G.t = false;
                                G.b0 = true;
                                G.s = (short) 0;
                                G.b0(r8[0] + wsaVar.u0, -gm.L(2.0f));
                                wsaVar.B0(view, G, false);
                            }
                        }
                    }
                    z6 = true;
                    HashMap hashMap3 = yr7.a;
                    if (A14 != null) {
                        n2 = pg3.n(A14.owner_id);
                        if (n2 != j) {
                        }
                        z = true;
                        G.k(R.drawable.input_suggest_paid_24, jb6.M0(2131749619, null), new npa(wsaVar, (byte) 28), z);
                        if (wsaVar.d3 == null) {
                        }
                        z2 = false;
                        G.k(R.drawable.input_suggest_paid_24, jb6.M0(2131749619, null), new npa(wsaVar, (byte) 29), z2);
                        A1 = wsaVar.A1();
                        if (A1 != null) {
                        }
                        z3 = false;
                        G.k(R.drawable.msg_colors, jb6.M0(2131749370, null), new tqa(wsaVar, b3), z3);
                        if (wsaVar.a3 != null) {
                        }
                        TL_stars.SavedStarGift savedStarGift222222 = wsaVar.A2;
                        G.k((savedStarGift222222 != null || savedStarGift222222.unsaved) ? R.drawable.menu_show_on_profile : R.drawable.menu_hide_from_profile, jb6.M0((savedStarGift222222 != null || savedStarGift222222.unsaved) ? 2131749913 : 2131750121, null), new npa(wsaVar, (byte) 8), z9);
                        if (wsaVar.a3 == null) {
                        }
                        z4 = false;
                        G.k(R.drawable.menu_transfer, jb6.M0(2131749851, null), new tqa(wsaVar, b4), z4);
                        G.k(R.drawable.menu_transfer, jb6.M0(2131749851, null), new npa(wsaVar, (byte) 19), wsaVar.a3 == null || (wsaVar.d3 == null && (wsaVar.x2(A13) || wsaVar.H1(A13))));
                        G.k(R.drawable.menu_feature_paid, jb6.M0(2131749474, null), new npa(wsaVar, (byte) 20), (wsaVar.h1() || fs7.m(A13)) ? false : true);
                        G.k(R.drawable.menu_edit_price, jb6.M0(2131750197, null), new npa(wsaVar, (byte) 21), !wsaVar.h1() && fs7.m(A13));
                        G.k(R.drawable.msg_delete, jb6.M0(2131750365, null), new npa(wsaVar, (byte) 22), !wsaVar.h1() && fs7.m(A13));
                        G.k(R.drawable.msg_view_file, jb6.M0(2131749779, null), new npa(wsaVar, (byte) 23), (wsaVar.A2 == null || wsaVar.q1() == j) ? false : true);
                        G.l(R.drawable.msg_delete, new npa(wsaVar, b2), jb6.M0(2131750151, null), wsaVar.g1(), true);
                        G.t = false;
                        G.b0 = true;
                        G.s = (short) 0;
                        G.b0(r8[0] + wsaVar.u0, -gm.L(2.0f));
                        wsaVar.B0(view, G, false);
                    }
                } else {
                    j = 0;
                }
                z = false;
                G.k(R.drawable.input_suggest_paid_24, jb6.M0(2131749619, null), new npa(wsaVar, (byte) 28), z);
                if (wsaVar.d3 == null) {
                }
                z2 = false;
                G.k(R.drawable.input_suggest_paid_24, jb6.M0(2131749619, null), new npa(wsaVar, (byte) 29), z2);
                A1 = wsaVar.A1();
                if (A1 != null) {
                }
                z3 = false;
                G.k(R.drawable.msg_colors, jb6.M0(2131749370, null), new tqa(wsaVar, b3), z3);
                if (wsaVar.a3 != null) {
                }
                TL_stars.SavedStarGift savedStarGift2222222 = wsaVar.A2;
                G.k((savedStarGift2222222 != null || savedStarGift2222222.unsaved) ? R.drawable.menu_show_on_profile : R.drawable.menu_hide_from_profile, jb6.M0((savedStarGift2222222 != null || savedStarGift2222222.unsaved) ? 2131749913 : 2131750121, null), new npa(wsaVar, (byte) 8), z9);
                if (wsaVar.a3 == null) {
                }
                z4 = false;
                G.k(R.drawable.menu_transfer, jb6.M0(2131749851, null), new tqa(wsaVar, b4), z4);
                G.k(R.drawable.menu_transfer, jb6.M0(2131749851, null), new npa(wsaVar, (byte) 19), wsaVar.a3 == null || (wsaVar.d3 == null && (wsaVar.x2(A13) || wsaVar.H1(A13))));
                G.k(R.drawable.menu_feature_paid, jb6.M0(2131749474, null), new npa(wsaVar, (byte) 20), (wsaVar.h1() || fs7.m(A13)) ? false : true);
                G.k(R.drawable.menu_edit_price, jb6.M0(2131750197, null), new npa(wsaVar, (byte) 21), !wsaVar.h1() && fs7.m(A13));
                G.k(R.drawable.msg_delete, jb6.M0(2131750365, null), new npa(wsaVar, (byte) 22), !wsaVar.h1() && fs7.m(A13));
                G.k(R.drawable.msg_view_file, jb6.M0(2131749779, null), new npa(wsaVar, (byte) 23), (wsaVar.A2 == null || wsaVar.q1() == j) ? false : true);
                G.l(R.drawable.msg_delete, new npa(wsaVar, b2), jb6.M0(2131750151, null), wsaVar.g1(), true);
                G.t = false;
                G.b0 = true;
                G.s = (short) 0;
                G.b0(r8[0] + wsaVar.u0, -gm.L(2.0f));
                wsaVar.B0(view, G, false);
                break;
            case 26:
                wsaVar.T1(true);
                break;
            case 27:
                if (!wsaVar.w2()) {
                    if (view.getAlpha() >= 0.99f) {
                        if (wsaVar.a3 != null || !wsaVar.x2(wsaVar.A1())) {
                            wsaVar.a2();
                            break;
                        } else {
                            wsaVar.f2();
                            break;
                        }
                    } else {
                        wsaVar.i1();
                        break;
                    }
                }
                break;
            case 28:
                wsaVar.S1();
                break;
            default:
                wsaVar.N1();
                break;
        }
    }
}
