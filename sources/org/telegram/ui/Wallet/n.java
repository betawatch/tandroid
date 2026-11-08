package org.telegram.ui.Wallet;

import android.app.Activity;
import android.graphics.Canvas;
import android.text.SpannableString;
import android.view.ViewGroup;
import android.widget.TextView;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.c20;
import org.telegram.messenger.id;
import org.telegram.messenger.ij;
import org.telegram.messenger.qp;
import org.telegram.messenger.v10;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.b80;
import org.telegram.ui.Components.hc;
import org.telegram.ui.Components.mo0;
import org.telegram.ui.WallpapersListActivity;
import org.telegram.ui.lk0;
import org.telegram.ui.nc1;
import org.telegram.ui.sc1;
import org.telegram.ui.yc1;
import org.telegram.ui.zc1;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes4.dex */
public final /* synthetic */ class n implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ n(int i7, Object obj, Object obj2) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7;
        int i10;
        int i11 = this.a;
        int i12 = 1;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i11) {
            case 0:
                qp.s1(((m0) obj2).a).O3((TLRPC.Updates) obj, false);
                break;
            case 1:
                m0 m0Var = (m0) obj2;
                m0.H("enable backup: ready! getting secret phrase...");
                m0Var.z(new bi.p5(23, m0Var, (f8) obj), false, true);
                break;
            case 2:
                boolean[] zArr = (boolean[]) obj2;
                p pVar = (p) obj;
                if (!zArr[0]) {
                    zArr[0] = true;
                    pVar.run();
                    break;
                }
                break;
            case 3:
                m0 m0Var2 = (m0) obj2;
                j jVar = (j) obj;
                m0.H("emulate disable backup: ready");
                if (m0Var2.v() > 0) {
                    WalletEngine2 walletEngine2 = m0Var2.b;
                    if (walletEngine2 != null) {
                        walletEngine2.emulateRotateKey(new d(m0Var2, jVar));
                        break;
                    } else {
                        m0.j("emulate disable backup: no engine!");
                        jVar.a(null, "NULL_ENGINE");
                        break;
                    }
                } else {
                    jVar.a(500000L, null);
                    break;
                }
            case 4:
                Exception exc = (Exception) obj;
                ((ai.e) obj2).a(null, exc.getMessage() == null ? "NULL_ERROR" : exc.getMessage());
                break;
            case 5:
                qp.s1(((e2) obj2).a).O3((TLRPC.Updates) obj, false);
                break;
            case 6:
                t2 t2Var = (t2) obj2;
                y2 y2Var = (y2) obj;
                if (!t2Var.e) {
                    y2Var.c0 = true;
                    Runnable runnable = t2Var.g;
                    if (runnable != null) {
                        runnable.run();
                        break;
                    }
                }
                break;
            case 7:
                org.telegram.ui.ActionBar.f2 f2Var = (org.telegram.ui.ActionBar.f2) obj2;
                f2Var.presentFragment(new m9(f2Var.getCurrentAccount(), ((TL_wallet.card) obj).address));
                break;
            case 8:
                TextView[] textViewArr = (TextView[]) obj2;
                SpannableString[] spannableStringArr = (SpannableString[]) obj;
                if (textViewArr[0] != null) {
                    if (spannableStringArr[0] == null) {
                        SpannableString spannableString = new SpannableString(id.M0(2131748780, null));
                        spannableStringArr[0] = spannableString;
                        spannableString.setSpan(new b80(org.telegram.messenger.g0.L(150.0f), textViewArr[0]), 0, spannableStringArr[0].length(), 33);
                    }
                    textViewArr[0].setText(spannableStringArr[0]);
                    break;
                }
                break;
            case 9:
                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj;
                ((v10) obj2).a(wallettransaction.comment, Boolean.valueOf(wallettransaction.comment_encrypted));
                break;
            case 10:
                ((di.r) obj2).a(((TL_wallet.walletTransaction[]) obj)[0]);
                break;
            case 11:
                ((x5) obj2).P0.remove((f7) obj);
                break;
            case 12:
                z2[] z2VarArr = (z2[]) obj2;
                z2VarArr[0].setOnDismissListener(new l2((TLRPC.User) obj, i12));
                z2VarArr[0].dismiss();
                break;
            case 13:
                new hc(((z2[]) obj2)[0].E, (org.telegram.ui.ActionBar.f6) obj).Q(R.raw.copy, 36, id.M0(2131743204, null)).k(false);
                break;
            case 14:
                super/*android.widget.TextView*/.onDraw((Canvas) obj);
                break;
            case 15:
                super/*org.telegram.ui.Components.j6*/.onDraw((Canvas) obj);
                break;
            case 16:
                super/*org.telegram.ui.Components.j6*/.onDraw((Canvas) obj);
                break;
            case 17:
                ((ViewGroup) obj).removeView(((n6) obj2).h);
                break;
            case 18:
                ((c20) obj2).a((TL_wallet.walletTransaction) obj);
                break;
            case 19:
                b8 b8Var = (b8) obj2;
                TLRPC.UserFull userFull = (TLRPC.UserFull) obj;
                if (!b8Var.a1 && userFull != null) {
                    TL_wallet.card cardVar = userFull.wallet_card;
                    if (cardVar == null) {
                        cardVar = new TL_wallet.card();
                    }
                    b8Var.d(cardVar);
                    break;
                }
                break;
            case 20:
                e8 e8Var = (e8) obj2;
                org.telegram.ui.ActionBar.f2 f2Var2 = (org.telegram.ui.ActionBar.f2) obj;
                if ((f2Var2 instanceof x5) && hc.a(f2Var2)) {
                    hc.a0(f2Var2).I(R.raw.contact_check, id.M0(2131743092, null), id.M0(2131743091, null)).j();
                }
                e8Var.finishFragment();
                break;
            case 21:
                ((q0) obj).B();
                ((n8) obj2).a.f3.O(true);
                break;
            case 22:
                n8 n8Var = (n8) obj;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, n8Var.getParentActivity(), n8Var.getResourceProvider());
                String M0 = id.M0(2131743134, null);
                org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
                u1Var.R = M0;
                u1Var.T = id.M0(2131743136, null);
                alertDialog$Builder.h(id.M0(2131752589, null), null);
                alertDialog$Builder.k(id.M0(2131743139, null), new lk0(27, n8Var, (m0) obj2));
                alertDialog$Builder.d(-1);
                alertDialog$Builder.p();
                break;
            case 23:
                ((org.telegram.ui.ActionBar.u1[]) obj2)[0].dismiss();
                ((Runnable) obj).run();
                break;
            case 24:
                ((ViewGroup) obj).removeView(((aa) obj2).h);
                break;
            case 25:
                nc1 nc1Var = (nc1) obj2;
                int[] iArr = (int[]) obj;
                nc1Var.getClass();
                int i13 = iArr[0] - 1;
                iArr[0] = i13;
                if (i13 == 0) {
                    nc1Var.a.G0(true);
                    break;
                }
                break;
            case 26:
                sc1 sc1Var = (sc1) obj2;
                String str = (String) obj;
                sc1Var.d.clear();
                sc1Var.e.clear();
                sc1Var.f = true;
                sc1Var.F(str, "", true);
                sc1Var.h = str;
                sc1Var.f();
                sc1Var.D = null;
                break;
            case 27:
                sc1 sc1Var2 = (sc1) obj2;
                TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) ((TLObject) obj);
                WallpapersListActivity wallpapersListActivity = sc1Var2.E;
                i7 = ((org.telegram.ui.ActionBar.f2) wallpapersListActivity).currentAccount;
                qp.s1(i7).Y3(tL_contacts_resolvedPeer.users, false);
                i10 = ((org.telegram.ui.ActionBar.f2) wallpapersListActivity).currentAccount;
                qp.s1(i10).S3(tL_contacts_resolvedPeer.chats, false);
                wallpapersListActivity.getMessagesStorage().m1(tL_contacts_resolvedPeer.users, tL_contacts_resolvedPeer.chats, true, true);
                String str2 = sc1Var2.y;
                sc1Var2.y = null;
                sc1Var2.F(str2, "", false);
                break;
            case 28:
                String str3 = (String) obj;
                zc1 zc1Var = ((yc1) obj2).a;
                Activity parentActivity = zc1Var.getParentActivity();
                ij ijVar = zc1Var.n;
                if (parentActivity != null) {
                    if (org.telegram.messenger.r2.a) {
                        org.telegram.messenger.a8.b(str3);
                    }
                    str3.getClass();
                    if (str3.equals("share_game")) {
                        ijVar.k.with_my_score = false;
                    } else if (str3.equals("share_score")) {
                        ijVar.k.with_my_score = true;
                    }
                    zc1Var.showDialog(mo0.N0(zc1Var.getParentActivity(), ijVar, null, false, zc1Var.h));
                    break;
                }
                break;
            default:
                org.telegram.ui.web.x0 x0Var = (org.telegram.ui.web.x0) obj2;
                hi.p pVar2 = x0Var.j0;
                pVar2.f = true;
                pVar2.k();
                x0Var.v((di.o7) obj);
                break;
        }
    }

    public /* synthetic */ n(n8 n8Var, m0 m0Var) {
        this.a = 22;
        this.c = n8Var;
        this.b = m0Var;
    }
}
