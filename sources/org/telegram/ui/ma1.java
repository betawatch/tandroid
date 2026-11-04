package org.telegram.ui;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.text.SpannableString;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Wallet.WalletEngine2;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ma1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ma1(int i3, Object obj, Object obj2) {
        this.a = i3;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i3 = this.a;
        int i10 = 1;
        int i11 = 0;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i3) {
            case 0:
                ra1.l0((ra1) obj2, (String) obj);
                break;
            case 1:
                Runnable runnable = (Runnable) obj;
                zq[] zqVarArr = ((ra1) obj2).x.f;
                int length = zqVarArr.length;
                while (i11 < length) {
                    zqVarArr[i11].C(0.0f);
                    i11++;
                }
                runnable.run();
                break;
            case 2:
                wa1 wa1Var = (wa1) obj2;
                TLObject tLObject = (TLObject) obj;
                ArrayList arrayList = wa1Var.f;
                ArrayList arrayList2 = wa1Var.e;
                if (tLObject instanceof TLRPC.messages_Chats) {
                    arrayList2.clear();
                    arrayList2.addAll(((TLRPC.messages_Chats) tLObject).chats);
                }
                org.telegram.messenger.hp.s1(wa1Var.a).S3(arrayList2, false);
                wa1Var.d = false;
                wa1Var.c = true;
                int size = arrayList.size();
                while (i11 < size) {
                    Object obj3 = arrayList.get(i11);
                    i11++;
                    ((Runnable) obj3).run();
                }
                arrayList.clear();
                break;
            case 3:
                zb1 zb1Var = (zb1) obj2;
                zb1Var.V.a(new jb1(zb1Var, (VoIPService) obj, i10), true);
                break;
            case 4:
                zb1 zb1Var2 = (zb1) obj2;
                ValueAnimator valueAnimator = (ValueAnimator) obj;
                org.telegram.ui.Components.voip.u1.V = false;
                org.telegram.ui.Components.voip.u1.a();
                ViewPropertyAnimator duration = zb1Var2.L.animate().setDuration(150L);
                org.telegram.ui.Components.xq xqVar = org.telegram.ui.Components.xq.f;
                duration.setInterpolator(xqVar).start();
                zb1Var2.I.animate().alpha(1.0f).setDuration(150L).setInterpolator(xqVar).start();
                zb1Var2.J.animate().alpha(1.0f).setDuration(150L).setInterpolator(xqVar).start();
                zb1Var2.O.animate().alpha(1.0f).setDuration(150L).setInterpolator(xqVar).start();
                zb1Var2.Y.animate().alpha(1.0f).setDuration(150L).setInterpolator(xqVar).start();
                zb1Var2.k0.animate().alpha(1.0f).setDuration(150L).setInterpolator(xqVar).start();
                zb1Var2.i0.animate().alpha(1.0f).setDuration(350L).setInterpolator(xqVar).start();
                zb1Var2.j0.animate().alpha(1.0f).setDuration(350L).setInterpolator(xqVar).start();
                zb1Var2.N0.animate().alpha(1.0f).setDuration(350L).setInterpolator(xqVar).start();
                valueAnimator.addListener(new ob1(zb1Var2, 2));
                valueAnimator.setDuration(350L);
                valueAnimator.setInterpolator(xqVar);
                valueAnimator.start();
                break;
            case 5:
                org.telegram.messenger.hp.s1(((org.telegram.ui.Wallet.k0) obj2).a).O3((TLRPC.Updates) obj, false);
                break;
            case 6:
                org.telegram.ui.Wallet.k0 k0Var = (org.telegram.ui.Wallet.k0) obj2;
                org.telegram.ui.Wallet.k0.H("enable backup: ready! getting secret phrase...");
                k0Var.z(new ai.q4(24, k0Var, (org.telegram.ui.Wallet.f8) obj), false, true);
                break;
            case 7:
                boolean[] zArr = (boolean[]) obj2;
                org.telegram.ui.Wallet.o oVar = (org.telegram.ui.Wallet.o) obj;
                if (!zArr[0]) {
                    zArr[0] = true;
                    oVar.run();
                    break;
                }
                break;
            case 8:
                org.telegram.ui.Wallet.k0 k0Var2 = (org.telegram.ui.Wallet.k0) obj2;
                org.telegram.ui.Wallet.j jVar = (org.telegram.ui.Wallet.j) obj;
                org.telegram.ui.Wallet.k0.H("emulate disable backup: ready");
                if (k0Var2.v() > 0) {
                    WalletEngine2 walletEngine2 = k0Var2.b;
                    if (walletEngine2 != null) {
                        walletEngine2.emulateRotateKey(new org.telegram.ui.Wallet.d(k0Var2, jVar));
                        break;
                    } else {
                        org.telegram.ui.Wallet.k0.j("emulate disable backup: no engine!");
                        jVar.a(null, "NULL_ENGINE");
                        break;
                    }
                } else {
                    jVar.a(500000L, null);
                    break;
                }
            case 9:
                Exception exc = (Exception) obj;
                ((ai.c) obj2).a(null, exc.getMessage() == null ? "NULL_ERROR" : exc.getMessage());
                break;
            case 10:
                org.telegram.messenger.hp.s1(((org.telegram.ui.Wallet.c2) obj2).a).O3((TLRPC.Updates) obj, false);
                break;
            case 11:
                org.telegram.ui.Wallet.s2 s2Var = (org.telegram.ui.Wallet.s2) obj2;
                org.telegram.ui.Wallet.x2 x2Var = (org.telegram.ui.Wallet.x2) obj;
                if (!s2Var.e) {
                    x2Var.d0 = true;
                    Runnable runnable2 = s2Var.g;
                    if (runnable2 != null) {
                        runnable2.run();
                        break;
                    }
                }
                break;
            case 12:
                org.telegram.ui.ActionBar.d2 d2Var = (org.telegram.ui.ActionBar.d2) obj2;
                d2Var.presentFragment(new org.telegram.ui.Wallet.m9(d2Var.getCurrentAccount(), ((TL_wallet.card) obj).address));
                break;
            case 13:
                TextView[] textViewArr = (TextView[]) obj2;
                SpannableString[] spannableStringArr = (SpannableString[]) obj;
                if (textViewArr[0] != null) {
                    if (spannableStringArr[0] == null) {
                        SpannableString spannableString = new SpannableString(org.telegram.messenger.bd.M0(2131748787, null));
                        spannableStringArr[0] = spannableString;
                        spannableString.setSpan(new org.telegram.ui.Components.x70(org.telegram.messenger.g0.L(150.0f), textViewArr[0]), 0, spannableStringArr[0].length(), 33);
                    }
                    textViewArr[0].setText(spannableStringArr[0]);
                    break;
                }
                break;
            case 14:
                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj;
                ((org.telegram.messenger.n10) obj2).a(wallettransaction.comment, Boolean.valueOf(wallettransaction.comment_encrypted));
                break;
            case 15:
                ((ei.s) obj2).a(((TL_wallet.walletTransaction[]) obj)[0]);
                break;
            case 16:
                ((org.telegram.ui.Wallet.w5) obj2).Q0.remove((org.telegram.ui.Wallet.e7) obj);
                break;
            case 17:
                org.telegram.ui.Wallet.y2[] y2VarArr = (org.telegram.ui.Wallet.y2[]) obj2;
                y2VarArr[0].setOnDismissListener(new org.telegram.ui.Wallet.k2((TLRPC.User) obj, i10));
                y2VarArr[0].dismiss();
                break;
            case 18:
                new org.telegram.ui.Components.fc(((org.telegram.ui.Wallet.y2[]) obj2)[0].F, (org.telegram.ui.ActionBar.e6) obj).Q(R.raw.copy, 36, org.telegram.messenger.bd.M0(2131743211, null)).k(false);
                break;
            case 19:
                super/*android.widget.TextView*/.onDraw((Canvas) obj);
                break;
            case 20:
                super/*org.telegram.ui.Components.h6*/.onDraw((Canvas) obj);
                break;
            case 21:
                super/*org.telegram.ui.Components.h6*/.onDraw((Canvas) obj);
                break;
            case 22:
                ((ViewGroup) obj).removeView(((org.telegram.ui.Wallet.m6) obj2).h);
                break;
            case 23:
                ((org.telegram.messenger.u10) obj2).a((TL_wallet.walletTransaction) obj);
                break;
            case 24:
                org.telegram.ui.Wallet.b8 b8Var = (org.telegram.ui.Wallet.b8) obj2;
                TLRPC.UserFull userFull = (TLRPC.UserFull) obj;
                if (!b8Var.b1 && userFull != null) {
                    TL_wallet.card cardVar = userFull.wallet_card;
                    if (cardVar == null) {
                        cardVar = new TL_wallet.card();
                    }
                    b8Var.d(cardVar);
                    break;
                }
                break;
            case 25:
                org.telegram.ui.Wallet.e8 e8Var = (org.telegram.ui.Wallet.e8) obj2;
                org.telegram.ui.ActionBar.d2 d2Var2 = (org.telegram.ui.ActionBar.d2) obj;
                if ((d2Var2 instanceof org.telegram.ui.Wallet.w5) && org.telegram.ui.Components.fc.a(d2Var2)) {
                    org.telegram.ui.Components.fc.a0(d2Var2).I(R.raw.contact_check, org.telegram.messenger.bd.M0(2131743099, null), org.telegram.messenger.bd.M0(2131743098, null)).j();
                }
                e8Var.finishFragment();
                break;
            case 26:
                ((org.telegram.ui.Wallet.o0) obj).B();
                ((org.telegram.ui.Wallet.n8) obj2).a.g3.O(true);
                break;
            case 27:
                org.telegram.ui.Wallet.n8 n8Var = (org.telegram.ui.Wallet.n8) obj2;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, n8Var.getParentActivity(), n8Var.getResourceProvider());
                String M0 = org.telegram.messenger.bd.M0(2131743141, null);
                org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.a;
                s1Var.S = M0;
                s1Var.U = org.telegram.messenger.bd.M0(2131743143, null);
                alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131752589, null), null);
                alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131743146, null), new na1(5, n8Var, (org.telegram.ui.Wallet.k0) obj));
                alertDialog$Builder.d(-1);
                alertDialog$Builder.p();
                break;
            case 28:
                ((org.telegram.ui.ActionBar.s1[]) obj2)[0].dismiss();
                ((Runnable) obj).run();
                break;
            default:
                ((ViewGroup) obj).removeView(((org.telegram.ui.Wallet.aa) obj2).h);
                break;
        }
    }
}
