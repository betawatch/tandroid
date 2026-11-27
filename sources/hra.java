// default package

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Wallet.c;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class hra implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ wua b;

    public /* synthetic */ hra(wua wuaVar, byte b) {
        this.a = b;
        this.b = wuaVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:256:0x03ed, code lost:
    
        if (r2 != null) goto L223;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0308  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0333  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0376  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x038f  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x039c  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x03b9  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x03ff  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x041e  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0445  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0468  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0485  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x04a7  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x010b  */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onClick(View view) {
        long j;
        boolean z;
        boolean z2;
        TL_stars.TL_starGiftUnique B1;
        boolean z3;
        boolean z4;
        boolean z5;
        TL_stars.TL_starGiftUnique tL_starGiftUnique;
        TLRPC.Message message;
        long n;
        ArrayList<TL_stars.StarsAmount> arrayList;
        String x;
        TL_stars.TL_starGiftUnique B12;
        TLRPC.Peer peer;
        int i;
        TLRPC.Message message2;
        TLRPC.Message message3;
        byte b = this.a;
        byte b2 = 3;
        int i2 = 0;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        final wua wuaVar = this.b;
        switch (b) {
            case 0:
                wuaVar.N1();
                break;
            case 1:
                wuaVar.onBackPressed();
                break;
            case 2:
                iua iuaVar = wuaVar.K2;
                iuaVar.h.e();
                iuaVar.i.e();
                iuaVar.j.e();
                iuaVar.k.e();
                break;
            case 3:
                wuaVar.S1();
                break;
            case 4:
                eqc eqcVar = wuaVar.c3;
                if (eqcVar != null) {
                    wuaVar.dismiss();
                    hl.d3(new uoa(eqcVar, b2), 250L);
                    break;
                }
                break;
            case 5:
                wuaVar.g2();
                break;
            case 6:
                wuaVar.S1();
                break;
            case 7:
                if (wuaVar.B1() != null && wuaVar.B1().host_id != null) {
                    wuaVar.T1();
                    break;
                } else {
                    bs2.v(null, 2131749778, wuaVar.j(), R.raw.info, 36);
                    break;
                }
            case 8:
                wuaVar.T2 = true;
                wuaVar.B2(false);
                break;
            case 9:
                wuaVar.T2 = true;
                wuaVar.B2(false);
                break;
            case 10:
                wuaVar.onBackPressed();
                break;
            case 11:
                wuaVar.m1();
                break;
            case 12:
                wuaVar.N1();
                break;
            case 13:
                wuaVar.onBackPressed();
                break;
            case 14:
                wuaVar.e2();
                break;
            case 15:
                wuaVar.onBackPressed();
                break;
            case 16:
                wuaVar.U1(true);
                break;
            case 17:
                wuaVar.dismiss();
                break;
            case 18:
                wuaVar.e2();
                break;
            case 19:
                if (view.getAlpha() >= 1.0f) {
                    c51 c51Var = wuaVar.f2;
                    c51Var.i(ob6.M0(2131749733, null), true, true);
                    c51Var.g(null, true);
                    c51Var.setOnClickListener(new ysa(wuaVar, (byte) 2));
                    wuaVar.a2.i(3, ob6.M0(2131749725, null), ob6.M0(2131749726, null), null);
                    wuaVar.A2(3, true, null);
                    break;
                }
                break;
            case 20:
                if (!wuaVar.f2.R) {
                    wuaVar.r2.a(!r0.a.q, true);
                    break;
                }
                break;
            case 21:
                final TL_stars.TL_starGiftUnique B13 = wuaVar.B1();
                if (B13 != null && !TextUtils.isEmpty(B13.slug)) {
                    final boolean z6 = B13.host_id == null;
                    if (wuaVar.u3 == null) {
                        wuaVar.u3 = Boolean.valueOf(!z6);
                    }
                    wuaVar.r2(B13, z6);
                    final int i3 = wuaVar.t3 + 1;
                    wuaVar.t3 = i3;
                    TL_stars.displayStarGift displaystargift = new TL_stars.displayStarGift();
                    displaystargift.peer = z6 ? uc7.s1(wuaVar.a).j1(yac.h(wuaVar.a).e()) : null;
                    displaystargift.slug = B13.slug;
                    ConnectionsManager.getInstance(wuaVar.a).sendRequestTyped(displaystargift, new ic(objArr == true ? 1 : 0), new icc() { // from class: nra
                        @Override // icc
                        public final void a(Object obj, Object obj2) {
                            TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                            boolean z7 = ((TLRPC.Bool) obj) instanceof TLRPC.TL_boolTrue;
                            wua wuaVar2 = wua.this;
                            if (z7) {
                                wuaVar2.u3 = Boolean.valueOf(z6);
                                return;
                            }
                            if (i3 != wuaVar2.t3) {
                                return;
                            }
                            wuaVar2.r2(B13, wuaVar2.u3.booleanValue());
                            wuaVar2.j().f0(tL_error != null ? tL_error.text : "NULL_ERROR", false);
                        }
                    });
                    break;
                }
                break;
            case 22:
                String w1 = wuaVar.w1();
                TL_stars.TL_starGiftUnique B14 = wuaVar.B1();
                wuaVar.T1.getLocationInWindow(new int[2]);
                fu5 G = fu5.G(wuaVar.T1, wuaVar.J0, view);
                boolean z7 = (wuaVar.B1() == null || !wua.H1(wuaVar.a, wf3.n(wuaVar.B1().owner_id)) || !(wuaVar.B2 instanceof axa) || wuaVar.A2 == null || wuaVar.v1() == null) ? false : true;
                TL_stars.SavedStarGift savedStarGift = wuaVar.A2;
                G.k((savedStarGift == null || !savedStarGift.pinned_to_top) ? R.drawable.msg_pin : R.drawable.msg_unpin, ob6.M0((savedStarGift == null || !savedStarGift.pinned_to_top) ? 2131750036 : 2131749830, null), new jra(wuaVar, (byte) 17), z7);
                G.k(R.drawable.outline_craft, ob6.M0(2131749747, null), new jra(wuaVar, (byte) 24), wuaVar.g1());
                G.k(R.drawable.menu_edit_price, ob6.M0(2131750223, null), new jra(wuaVar, (byte) 25), (wuaVar.B1() == null || !wua.H1(wuaVar.a, wf3.n(wuaVar.B1().owner_id)) || wuaVar.B1().resell_amount == null || it7.y(wuaVar.B1())) ? false : true);
                G.k(R.drawable.msg_link, ob6.M0(2131751727, null), new tra(wuaVar, w1, (byte) 5), w1 != null);
                G.k(R.drawable.msg_share, ob6.M0(2131745187, null), new jra(wuaVar, (byte) 26), w1 != null);
                if (wuaVar.d3 == null) {
                    int i4 = wuaVar.a;
                    TL_stars.TL_starGiftUnique B15 = wuaVar.B1();
                    Object[] objArr5 = (wuaVar.a3 == null && !wuaVar.F1(wuaVar.B1()) && ((B12 = wuaVar.B1()) == null || (peer = B12.host_id) == null || wf3.n(peer) != yac.h(wuaVar.a).e())) ? false : true;
                    HashMap hashMap = vs7.a;
                    if (B15 != null) {
                        j = 0;
                        if (!TextUtils.isEmpty(B15.gift_address) && !TextUtils.isEmpty(B15.owner_address) && !TextUtils.isEmpty(B15.slug) && objArr5 == false && B15.offer_min_amount > 0 && (((arrayList = B15.resell_amount) == null || arrayList.isEmpty()) && uc7.s1(i4).k4.v0.f)) {
                            long n2 = wf3.n(B15.owner_id);
                            if ((n2 == 0 || n2 != yac.h(i4).e()) && (TextUtils.isEmpty(B15.owner_address) || (x = c.C(i4).x()) == null || !c.b(B15.owner_address, x))) {
                                z = true;
                                G.k(R.drawable.input_suggest_paid_24, ob6.M0(2131749632, null), new jra(wuaVar, (byte) 27), z);
                                if (wuaVar.d3 == null) {
                                    HashMap hashMap2 = vs7.a;
                                    if (B14 != null && TextUtils.isEmpty(B14.owner_address) && B14.offer_min_stars > 0 && B14.owner_id != null) {
                                        z2 = true;
                                        G.k(R.drawable.input_suggest_paid_24, ob6.M0(2131749632, null), new jra(wuaVar, (byte) 28), z2);
                                        B1 = wuaVar.B1();
                                        if (B1 != null && B1.theme_available) {
                                            n = wf3.n(B1.owner_id);
                                            long n3 = wf3.n(B1.host_id);
                                            if ((n > j && wua.H1(wuaVar.a, n)) || (n3 > j && wua.H1(wuaVar.a, n3))) {
                                                z3 = true;
                                                G.k(R.drawable.msg_colors, ob6.M0(2131749367, null), new jra(wuaVar, (byte) 29), z3);
                                                boolean z8 = wuaVar.a3 != null && wuaVar.z2 && wuaVar.A2 != null && wua.G1(wuaVar.a, wuaVar.S1);
                                                TL_stars.SavedStarGift savedStarGift2 = wuaVar.A2;
                                                G.k((savedStarGift2 != null || savedStarGift2.unsaved) ? R.drawable.menu_show_on_profile : R.drawable.menu_hide_from_profile, ob6.M0((savedStarGift2 != null || savedStarGift2.unsaved) ? 2131749926 : 2131750147, null), new jra(wuaVar, (byte) 12), z8);
                                                if (wuaVar.a3 == null) {
                                                    if (wuaVar.v1() != null) {
                                                        r47 r47Var = wuaVar.C2;
                                                        if (r47Var != null && (message = r47Var.k) != null) {
                                                            TLRPC.MessageAction messageAction = message.action;
                                                            if (messageAction instanceof TLRPC.TL_messageActionStarGiftUnique) {
                                                                TLRPC.TL_messageActionStarGiftUnique tL_messageActionStarGiftUnique = (TLRPC.TL_messageActionStarGiftUnique) messageAction;
                                                                if ((tL_messageActionStarGiftUnique.flags & 16) != 0) {
                                                                    TL_stars.StarGift starGift = tL_messageActionStarGiftUnique.gift;
                                                                    if (starGift instanceof TL_stars.TL_starGiftUnique) {
                                                                        tL_starGiftUnique = (TL_stars.TL_starGiftUnique) starGift;
                                                                        z5 = wua.H1(wuaVar.a, wf3.n(tL_starGiftUnique.owner_id));
                                                                        if (z5 && !it7.n(B14)) {
                                                                            z4 = true;
                                                                            G.k(R.drawable.menu_transfer, ob6.M0(2131749864, null), new ssa(wuaVar, objArr2 == true ? 1 : 0), z4);
                                                                            G.k(R.drawable.menu_transfer, ob6.M0(2131749864, null), new jra(wuaVar, (byte) 18), wuaVar.a3 == null || (wuaVar.d3 == null && (wuaVar.y2(B14) || wuaVar.I1(B14))));
                                                                            G.k(R.drawable.menu_feature_paid, ob6.M0(2131749486, null), new jra(wuaVar, (byte) 19), (wuaVar.i1() || it7.n(B14)) ? false : true);
                                                                            G.k(R.drawable.menu_edit_price, ob6.M0(2131750223, null), new jra(wuaVar, (byte) 20), !wuaVar.i1() && it7.n(B14));
                                                                            G.k(R.drawable.msg_delete, ob6.M0(2131750393, null), new jra(wuaVar, (byte) 21), !wuaVar.i1() && it7.n(B14));
                                                                            G.k(R.drawable.msg_view_file, ob6.M0(2131749792, null), new jra(wuaVar, (byte) 22), (wuaVar.A2 == null || wuaVar.r1() == j) ? false : true);
                                                                            G.l(R.drawable.msg_delete, new jra(wuaVar, (byte) 23), ob6.M0(2131750177, null), wuaVar.h1(), true);
                                                                            G.t = false;
                                                                            G.e0 = true;
                                                                            G.s = (short) 0;
                                                                            G.b0(r4[0] + wuaVar.u0, -hl.L(2.0f));
                                                                            wuaVar.C0(view, G, false);
                                                                            break;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        TL_stars.SavedStarGift savedStarGift3 = wuaVar.A2;
                                                        if (savedStarGift3 != null) {
                                                            TL_stars.StarGift starGift2 = savedStarGift3.gift;
                                                            if (starGift2 instanceof TL_stars.TL_starGiftUnique) {
                                                                tL_starGiftUnique = (TL_stars.TL_starGiftUnique) starGift2;
                                                                z5 = wua.H1(wuaVar.a, wf3.n(tL_starGiftUnique.owner_id));
                                                                if (z5) {
                                                                    z4 = true;
                                                                    G.k(R.drawable.menu_transfer, ob6.M0(2131749864, null), new ssa(wuaVar, objArr2 == true ? 1 : 0), z4);
                                                                    G.k(R.drawable.menu_transfer, ob6.M0(2131749864, null), new jra(wuaVar, (byte) 18), wuaVar.a3 == null || (wuaVar.d3 == null && (wuaVar.y2(B14) || wuaVar.I1(B14))));
                                                                    G.k(R.drawable.menu_feature_paid, ob6.M0(2131749486, null), new jra(wuaVar, (byte) 19), (wuaVar.i1() || it7.n(B14)) ? false : true);
                                                                    G.k(R.drawable.menu_edit_price, ob6.M0(2131750223, null), new jra(wuaVar, (byte) 20), !wuaVar.i1() && it7.n(B14));
                                                                    G.k(R.drawable.msg_delete, ob6.M0(2131750393, null), new jra(wuaVar, (byte) 21), !wuaVar.i1() && it7.n(B14));
                                                                    G.k(R.drawable.msg_view_file, ob6.M0(2131749792, null), new jra(wuaVar, (byte) 22), (wuaVar.A2 == null || wuaVar.r1() == j) ? false : true);
                                                                    G.l(R.drawable.msg_delete, new jra(wuaVar, (byte) 23), ob6.M0(2131750177, null), wuaVar.h1(), true);
                                                                    G.t = false;
                                                                    G.e0 = true;
                                                                    G.s = (short) 0;
                                                                    G.b0(r4[0] + wuaVar.u0, -hl.L(2.0f));
                                                                    wuaVar.C0(view, G, false);
                                                                }
                                                            }
                                                        }
                                                        tL_starGiftUnique = wuaVar.E2;
                                                        break;
                                                    }
                                                    z5 = false;
                                                    if (z5) {
                                                    }
                                                }
                                                z4 = false;
                                                G.k(R.drawable.menu_transfer, ob6.M0(2131749864, null), new ssa(wuaVar, objArr2 == true ? 1 : 0), z4);
                                                G.k(R.drawable.menu_transfer, ob6.M0(2131749864, null), new jra(wuaVar, (byte) 18), wuaVar.a3 == null || (wuaVar.d3 == null && (wuaVar.y2(B14) || wuaVar.I1(B14))));
                                                G.k(R.drawable.menu_feature_paid, ob6.M0(2131749486, null), new jra(wuaVar, (byte) 19), (wuaVar.i1() || it7.n(B14)) ? false : true);
                                                G.k(R.drawable.menu_edit_price, ob6.M0(2131750223, null), new jra(wuaVar, (byte) 20), !wuaVar.i1() && it7.n(B14));
                                                G.k(R.drawable.msg_delete, ob6.M0(2131750393, null), new jra(wuaVar, (byte) 21), !wuaVar.i1() && it7.n(B14));
                                                G.k(R.drawable.msg_view_file, ob6.M0(2131749792, null), new jra(wuaVar, (byte) 22), (wuaVar.A2 == null || wuaVar.r1() == j) ? false : true);
                                                G.l(R.drawable.msg_delete, new jra(wuaVar, (byte) 23), ob6.M0(2131750177, null), wuaVar.h1(), true);
                                                G.t = false;
                                                G.e0 = true;
                                                G.s = (short) 0;
                                                G.b0(r4[0] + wuaVar.u0, -hl.L(2.0f));
                                                wuaVar.C0(view, G, false);
                                            }
                                        }
                                        z3 = false;
                                        G.k(R.drawable.msg_colors, ob6.M0(2131749367, null), new jra(wuaVar, (byte) 29), z3);
                                        if (wuaVar.a3 != null) {
                                        }
                                        TL_stars.SavedStarGift savedStarGift22 = wuaVar.A2;
                                        G.k((savedStarGift22 != null || savedStarGift22.unsaved) ? R.drawable.menu_show_on_profile : R.drawable.menu_hide_from_profile, ob6.M0((savedStarGift22 != null || savedStarGift22.unsaved) ? 2131749926 : 2131750147, null), new jra(wuaVar, (byte) 12), z8);
                                        if (wuaVar.a3 == null) {
                                        }
                                        z4 = false;
                                        G.k(R.drawable.menu_transfer, ob6.M0(2131749864, null), new ssa(wuaVar, objArr2 == true ? 1 : 0), z4);
                                        G.k(R.drawable.menu_transfer, ob6.M0(2131749864, null), new jra(wuaVar, (byte) 18), wuaVar.a3 == null || (wuaVar.d3 == null && (wuaVar.y2(B14) || wuaVar.I1(B14))));
                                        G.k(R.drawable.menu_feature_paid, ob6.M0(2131749486, null), new jra(wuaVar, (byte) 19), (wuaVar.i1() || it7.n(B14)) ? false : true);
                                        G.k(R.drawable.menu_edit_price, ob6.M0(2131750223, null), new jra(wuaVar, (byte) 20), !wuaVar.i1() && it7.n(B14));
                                        G.k(R.drawable.msg_delete, ob6.M0(2131750393, null), new jra(wuaVar, (byte) 21), !wuaVar.i1() && it7.n(B14));
                                        G.k(R.drawable.msg_view_file, ob6.M0(2131749792, null), new jra(wuaVar, (byte) 22), (wuaVar.A2 == null || wuaVar.r1() == j) ? false : true);
                                        G.l(R.drawable.msg_delete, new jra(wuaVar, (byte) 23), ob6.M0(2131750177, null), wuaVar.h1(), true);
                                        G.t = false;
                                        G.e0 = true;
                                        G.s = (short) 0;
                                        G.b0(r4[0] + wuaVar.u0, -hl.L(2.0f));
                                        wuaVar.C0(view, G, false);
                                    }
                                }
                                z2 = false;
                                G.k(R.drawable.input_suggest_paid_24, ob6.M0(2131749632, null), new jra(wuaVar, (byte) 28), z2);
                                B1 = wuaVar.B1();
                                if (B1 != null) {
                                    n = wf3.n(B1.owner_id);
                                    long n32 = wf3.n(B1.host_id);
                                    if (n > j) {
                                        z3 = true;
                                        G.k(R.drawable.msg_colors, ob6.M0(2131749367, null), new jra(wuaVar, (byte) 29), z3);
                                        if (wuaVar.a3 != null) {
                                        }
                                        TL_stars.SavedStarGift savedStarGift222 = wuaVar.A2;
                                        G.k((savedStarGift222 != null || savedStarGift222.unsaved) ? R.drawable.menu_show_on_profile : R.drawable.menu_hide_from_profile, ob6.M0((savedStarGift222 != null || savedStarGift222.unsaved) ? 2131749926 : 2131750147, null), new jra(wuaVar, (byte) 12), z8);
                                        if (wuaVar.a3 == null) {
                                        }
                                        z4 = false;
                                        G.k(R.drawable.menu_transfer, ob6.M0(2131749864, null), new ssa(wuaVar, objArr2 == true ? 1 : 0), z4);
                                        G.k(R.drawable.menu_transfer, ob6.M0(2131749864, null), new jra(wuaVar, (byte) 18), wuaVar.a3 == null || (wuaVar.d3 == null && (wuaVar.y2(B14) || wuaVar.I1(B14))));
                                        G.k(R.drawable.menu_feature_paid, ob6.M0(2131749486, null), new jra(wuaVar, (byte) 19), (wuaVar.i1() || it7.n(B14)) ? false : true);
                                        G.k(R.drawable.menu_edit_price, ob6.M0(2131750223, null), new jra(wuaVar, (byte) 20), !wuaVar.i1() && it7.n(B14));
                                        G.k(R.drawable.msg_delete, ob6.M0(2131750393, null), new jra(wuaVar, (byte) 21), !wuaVar.i1() && it7.n(B14));
                                        G.k(R.drawable.msg_view_file, ob6.M0(2131749792, null), new jra(wuaVar, (byte) 22), (wuaVar.A2 == null || wuaVar.r1() == j) ? false : true);
                                        G.l(R.drawable.msg_delete, new jra(wuaVar, (byte) 23), ob6.M0(2131750177, null), wuaVar.h1(), true);
                                        G.t = false;
                                        G.e0 = true;
                                        G.s = (short) 0;
                                        G.b0(r4[0] + wuaVar.u0, -hl.L(2.0f));
                                        wuaVar.C0(view, G, false);
                                    }
                                    z3 = true;
                                    G.k(R.drawable.msg_colors, ob6.M0(2131749367, null), new jra(wuaVar, (byte) 29), z3);
                                    if (wuaVar.a3 != null) {
                                    }
                                    TL_stars.SavedStarGift savedStarGift2222 = wuaVar.A2;
                                    G.k((savedStarGift2222 != null || savedStarGift2222.unsaved) ? R.drawable.menu_show_on_profile : R.drawable.menu_hide_from_profile, ob6.M0((savedStarGift2222 != null || savedStarGift2222.unsaved) ? 2131749926 : 2131750147, null), new jra(wuaVar, (byte) 12), z8);
                                    if (wuaVar.a3 == null) {
                                    }
                                    z4 = false;
                                    G.k(R.drawable.menu_transfer, ob6.M0(2131749864, null), new ssa(wuaVar, objArr2 == true ? 1 : 0), z4);
                                    G.k(R.drawable.menu_transfer, ob6.M0(2131749864, null), new jra(wuaVar, (byte) 18), wuaVar.a3 == null || (wuaVar.d3 == null && (wuaVar.y2(B14) || wuaVar.I1(B14))));
                                    G.k(R.drawable.menu_feature_paid, ob6.M0(2131749486, null), new jra(wuaVar, (byte) 19), (wuaVar.i1() || it7.n(B14)) ? false : true);
                                    G.k(R.drawable.menu_edit_price, ob6.M0(2131750223, null), new jra(wuaVar, (byte) 20), !wuaVar.i1() && it7.n(B14));
                                    G.k(R.drawable.msg_delete, ob6.M0(2131750393, null), new jra(wuaVar, (byte) 21), !wuaVar.i1() && it7.n(B14));
                                    G.k(R.drawable.msg_view_file, ob6.M0(2131749792, null), new jra(wuaVar, (byte) 22), (wuaVar.A2 == null || wuaVar.r1() == j) ? false : true);
                                    G.l(R.drawable.msg_delete, new jra(wuaVar, (byte) 23), ob6.M0(2131750177, null), wuaVar.h1(), true);
                                    G.t = false;
                                    G.e0 = true;
                                    G.s = (short) 0;
                                    G.b0(r4[0] + wuaVar.u0, -hl.L(2.0f));
                                    wuaVar.C0(view, G, false);
                                }
                                z3 = false;
                                G.k(R.drawable.msg_colors, ob6.M0(2131749367, null), new jra(wuaVar, (byte) 29), z3);
                                if (wuaVar.a3 != null) {
                                }
                                TL_stars.SavedStarGift savedStarGift22222 = wuaVar.A2;
                                G.k((savedStarGift22222 != null || savedStarGift22222.unsaved) ? R.drawable.menu_show_on_profile : R.drawable.menu_hide_from_profile, ob6.M0((savedStarGift22222 != null || savedStarGift22222.unsaved) ? 2131749926 : 2131750147, null), new jra(wuaVar, (byte) 12), z8);
                                if (wuaVar.a3 == null) {
                                }
                                z4 = false;
                                G.k(R.drawable.menu_transfer, ob6.M0(2131749864, null), new ssa(wuaVar, objArr2 == true ? 1 : 0), z4);
                                G.k(R.drawable.menu_transfer, ob6.M0(2131749864, null), new jra(wuaVar, (byte) 18), wuaVar.a3 == null || (wuaVar.d3 == null && (wuaVar.y2(B14) || wuaVar.I1(B14))));
                                G.k(R.drawable.menu_feature_paid, ob6.M0(2131749486, null), new jra(wuaVar, (byte) 19), (wuaVar.i1() || it7.n(B14)) ? false : true);
                                G.k(R.drawable.menu_edit_price, ob6.M0(2131750223, null), new jra(wuaVar, (byte) 20), !wuaVar.i1() && it7.n(B14));
                                G.k(R.drawable.msg_delete, ob6.M0(2131750393, null), new jra(wuaVar, (byte) 21), !wuaVar.i1() && it7.n(B14));
                                G.k(R.drawable.msg_view_file, ob6.M0(2131749792, null), new jra(wuaVar, (byte) 22), (wuaVar.A2 == null || wuaVar.r1() == j) ? false : true);
                                G.l(R.drawable.msg_delete, new jra(wuaVar, (byte) 23), ob6.M0(2131750177, null), wuaVar.h1(), true);
                                G.t = false;
                                G.e0 = true;
                                G.s = (short) 0;
                                G.b0(r4[0] + wuaVar.u0, -hl.L(2.0f));
                                wuaVar.C0(view, G, false);
                            }
                        }
                        z = false;
                        G.k(R.drawable.input_suggest_paid_24, ob6.M0(2131749632, null), new jra(wuaVar, (byte) 27), z);
                        if (wuaVar.d3 == null) {
                        }
                        z2 = false;
                        G.k(R.drawable.input_suggest_paid_24, ob6.M0(2131749632, null), new jra(wuaVar, (byte) 28), z2);
                        B1 = wuaVar.B1();
                        if (B1 != null) {
                        }
                        z3 = false;
                        G.k(R.drawable.msg_colors, ob6.M0(2131749367, null), new jra(wuaVar, (byte) 29), z3);
                        if (wuaVar.a3 != null) {
                        }
                        TL_stars.SavedStarGift savedStarGift222222 = wuaVar.A2;
                        G.k((savedStarGift222222 != null || savedStarGift222222.unsaved) ? R.drawable.menu_show_on_profile : R.drawable.menu_hide_from_profile, ob6.M0((savedStarGift222222 != null || savedStarGift222222.unsaved) ? 2131749926 : 2131750147, null), new jra(wuaVar, (byte) 12), z8);
                        if (wuaVar.a3 == null) {
                        }
                        z4 = false;
                        G.k(R.drawable.menu_transfer, ob6.M0(2131749864, null), new ssa(wuaVar, objArr2 == true ? 1 : 0), z4);
                        G.k(R.drawable.menu_transfer, ob6.M0(2131749864, null), new jra(wuaVar, (byte) 18), wuaVar.a3 == null || (wuaVar.d3 == null && (wuaVar.y2(B14) || wuaVar.I1(B14))));
                        G.k(R.drawable.menu_feature_paid, ob6.M0(2131749486, null), new jra(wuaVar, (byte) 19), (wuaVar.i1() || it7.n(B14)) ? false : true);
                        G.k(R.drawable.menu_edit_price, ob6.M0(2131750223, null), new jra(wuaVar, (byte) 20), !wuaVar.i1() && it7.n(B14));
                        G.k(R.drawable.msg_delete, ob6.M0(2131750393, null), new jra(wuaVar, (byte) 21), !wuaVar.i1() && it7.n(B14));
                        G.k(R.drawable.msg_view_file, ob6.M0(2131749792, null), new jra(wuaVar, (byte) 22), (wuaVar.A2 == null || wuaVar.r1() == j) ? false : true);
                        G.l(R.drawable.msg_delete, new jra(wuaVar, (byte) 23), ob6.M0(2131750177, null), wuaVar.h1(), true);
                        G.t = false;
                        G.e0 = true;
                        G.s = (short) 0;
                        G.b0(r4[0] + wuaVar.u0, -hl.L(2.0f));
                        wuaVar.C0(view, G, false);
                    }
                }
                j = 0;
                z = false;
                G.k(R.drawable.input_suggest_paid_24, ob6.M0(2131749632, null), new jra(wuaVar, (byte) 27), z);
                if (wuaVar.d3 == null) {
                }
                z2 = false;
                G.k(R.drawable.input_suggest_paid_24, ob6.M0(2131749632, null), new jra(wuaVar, (byte) 28), z2);
                B1 = wuaVar.B1();
                if (B1 != null) {
                }
                z3 = false;
                G.k(R.drawable.msg_colors, ob6.M0(2131749367, null), new jra(wuaVar, (byte) 29), z3);
                if (wuaVar.a3 != null) {
                }
                TL_stars.SavedStarGift savedStarGift2222222 = wuaVar.A2;
                G.k((savedStarGift2222222 != null || savedStarGift2222222.unsaved) ? R.drawable.menu_show_on_profile : R.drawable.menu_hide_from_profile, ob6.M0((savedStarGift2222222 != null || savedStarGift2222222.unsaved) ? 2131749926 : 2131750147, null), new jra(wuaVar, (byte) 12), z8);
                if (wuaVar.a3 == null) {
                }
                z4 = false;
                G.k(R.drawable.menu_transfer, ob6.M0(2131749864, null), new ssa(wuaVar, objArr2 == true ? 1 : 0), z4);
                G.k(R.drawable.menu_transfer, ob6.M0(2131749864, null), new jra(wuaVar, (byte) 18), wuaVar.a3 == null || (wuaVar.d3 == null && (wuaVar.y2(B14) || wuaVar.I1(B14))));
                G.k(R.drawable.menu_feature_paid, ob6.M0(2131749486, null), new jra(wuaVar, (byte) 19), (wuaVar.i1() || it7.n(B14)) ? false : true);
                G.k(R.drawable.menu_edit_price, ob6.M0(2131750223, null), new jra(wuaVar, (byte) 20), !wuaVar.i1() && it7.n(B14));
                G.k(R.drawable.msg_delete, ob6.M0(2131750393, null), new jra(wuaVar, (byte) 21), !wuaVar.i1() && it7.n(B14));
                G.k(R.drawable.msg_view_file, ob6.M0(2131749792, null), new jra(wuaVar, (byte) 22), (wuaVar.A2 == null || wuaVar.r1() == j) ? false : true);
                G.l(R.drawable.msg_delete, new jra(wuaVar, (byte) 23), ob6.M0(2131750177, null), wuaVar.h1(), true);
                G.t = false;
                G.e0 = true;
                G.s = (short) 0;
                G.b0(r4[0] + wuaVar.u0, -hl.L(2.0f));
                wuaVar.C0(view, G, false);
                break;
            case 23:
                wuaVar.U1(true);
                break;
            case 24:
                if (!wuaVar.x2()) {
                    if (view.getAlpha() >= 0.99f) {
                        if (wuaVar.a3 != null || !wuaVar.y2(wuaVar.B1())) {
                            wuaVar.b2();
                            break;
                        } else {
                            wuaVar.g2();
                            break;
                        }
                    } else {
                        wuaVar.j1();
                        break;
                    }
                }
                break;
            case 25:
                wuaVar.T1();
                break;
            case 26:
                wuaVar.O1();
                break;
            case 27:
                TL_stars.TL_starGiftUnique B16 = wuaVar.B1();
                if (it7.y(B16)) {
                    if (!wuaVar.i1()) {
                        it7.t(wuaVar.getContext(), wuaVar.a, wuaVar.J0, wuaVar.j(), "STARGIFT_ONCHAIN_SALE_DISABLED", Boolean.valueOf(B16.fixed_sale));
                        break;
                    } else if (!it7.n(B16)) {
                        wuaVar.X1();
                        break;
                    } else {
                        wuaVar.Y1();
                        break;
                    }
                } else if (view.getAlpha() < 0.99f) {
                    wuaVar.j1();
                    break;
                } else {
                    TL_stars.TL_starGiftUnique B17 = wuaVar.B1();
                    if (B17 != null) {
                        if (B17.resell_amount != null) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, wuaVar.J0, wuaVar.getContext());
                            alertDialog$Builder.a.S = ob6.a0(null, null, 2131749832, wuaVar.t1());
                            alertDialog$Builder.a.U = ob6.M0(2131749833, null);
                            alertDialog$Builder.j(ob6.M0(2131750393, null), new tsa(wuaVar, B17, objArr4 == true ? 1 : 0));
                            alertDialog$Builder.g(ob6.M0(2131752570, null), new vr9((byte) 16));
                            alertDialog$Builder.o();
                            break;
                        } else {
                            r47 r47Var2 = wuaVar.C2;
                            if (r47Var2 != null && (message3 = r47Var2.k) != null) {
                                TLRPC.MessageAction messageAction2 = message3.action;
                                if (messageAction2 instanceof TLRPC.TL_messageActionStarGiftUnique) {
                                    i = ((TLRPC.TL_messageActionStarGiftUnique) messageAction2).can_resell_at;
                                    if (i > ConnectionsManager.getInstance(wuaVar.a).getCurrentTime()) {
                                        nza.j1(wuaVar.getContext(), wuaVar.a, null, new usa(wuaVar, B17, objArr3 == true ? 1 : 0), wuaVar.J0);
                                        break;
                                    } else {
                                        Context context = wuaVar.getContext();
                                        r47 r47Var3 = wuaVar.C2;
                                        if (r47Var3 != null && (message2 = r47Var3.k) != null) {
                                            TLRPC.MessageAction messageAction3 = message2.action;
                                            if (messageAction3 instanceof TLRPC.TL_messageActionStarGiftUnique) {
                                                i2 = ((TLRPC.TL_messageActionStarGiftUnique) messageAction3).can_resell_at;
                                                wuaVar.w2(i2 - ConnectionsManager.getInstance(wuaVar.a).getCurrentTime(), context, true);
                                                break;
                                            }
                                        }
                                        TL_stars.SavedStarGift savedStarGift4 = wuaVar.A2;
                                        if (savedStarGift4 != null) {
                                            i2 = savedStarGift4.can_resell_at;
                                        }
                                        wuaVar.w2(i2 - ConnectionsManager.getInstance(wuaVar.a).getCurrentTime(), context, true);
                                    }
                                }
                            }
                            TL_stars.SavedStarGift savedStarGift5 = wuaVar.A2;
                            i = savedStarGift5 != null ? savedStarGift5.can_resell_at : 0;
                            if (i > ConnectionsManager.getInstance(wuaVar.a).getCurrentTime()) {
                            }
                        }
                    }
                }
                break;
            case 28:
                wuaVar.R1();
                break;
            default:
                wuaVar.e2();
                break;
        }
    }
}
