package org.telegram.ui.Wallet;

import android.app.Activity;
import android.graphics.Canvas;
import android.text.SpannableString;
import android.util.LongSparseArray;
import android.view.ViewGroup;
import android.widget.TextView;
import c8.za;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.gj;
import org.telegram.messenger.hd;
import org.telegram.messenger.np;
import org.telegram.messenger.s10;
import org.telegram.messenger.z10;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.e80;
import org.telegram.ui.Components.po0;
import org.telegram.ui.WallpapersListActivity;
import org.telegram.ui.mc1;
import org.telegram.ui.rc1;
import org.telegram.ui.web.BotWebViewContainer$BotWebViewProxy;
import org.telegram.ui.yc1;
import org.telegram.ui.zc1;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes4.dex */
public final /* synthetic */ class r implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ r(int i7, Object obj, Object obj2) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7;
        int i10;
        org.telegram.ui.web.v0 v0Var;
        org.telegram.ui.web.c0 c0Var;
        int i11 = this.a;
        int i12 = 0;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i11) {
            case 0:
                l0 l0Var = (l0) obj2;
                j jVar = (j) obj;
                l0.H("emulate disable backup: ready");
                if (l0Var.v() <= 0) {
                    jVar.a(500000L, null);
                    break;
                } else {
                    WalletEngine2 walletEngine2 = l0Var.b;
                    if (walletEngine2 == null) {
                        l0.j("emulate disable backup: no engine!");
                        jVar.a(null, "NULL_ENGINE");
                        break;
                    } else {
                        walletEngine2.emulateRotateKey(new d(l0Var, jVar));
                        break;
                    }
                }
            case 1:
                Exception exc = (Exception) obj;
                ((bi.b) obj2).a(null, exc.getMessage() == null ? "NULL_ERROR" : exc.getMessage());
                break;
            case 2:
                np.s1(((d2) obj2).a).O3((TLRPC.Updates) obj, false);
                break;
            case 3:
                r2 r2Var = (r2) obj2;
                w2 w2Var = (w2) obj;
                if (!r2Var.e) {
                    w2Var.d0 = true;
                    Runnable runnable = r2Var.g;
                    if (runnable != null) {
                        runnable.run();
                        break;
                    }
                }
                break;
            case 4:
                TextView[] textViewArr = (TextView[]) obj2;
                SpannableString[] spannableStringArr = (SpannableString[]) obj;
                if (textViewArr[0] != null) {
                    if (spannableStringArr[0] == null) {
                        SpannableString spannableString = new SpannableString(hd.M0(2131748779, null));
                        spannableStringArr[0] = spannableString;
                        spannableString.setSpan(new e80(org.telegram.messenger.g0.L(150.0f), textViewArr[0]), 0, spannableStringArr[0].length(), 33);
                    }
                    textViewArr[0].setText(spannableStringArr[0]);
                    break;
                }
                break;
            case 5:
                ((fi.r) obj2).a(((TL_wallet.walletTransaction[]) obj)[0]);
                break;
            case 6:
                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj;
                ((s10) obj2).a(wallettransaction.comment, Boolean.valueOf(wallettransaction.comment_encrypted));
                break;
            case 7:
                ((y5) obj2).Q0.remove((g7) obj);
                break;
            case 8:
                x2[] x2VarArr = (x2[]) obj2;
                x2VarArr[0].setOnDismissListener(new j2((TLRPC.User) obj, 1 == true ? 1 : 0));
                x2VarArr[0].dismiss();
                break;
            case 9:
                new cc(((x2[]) obj2)[0].F, (org.telegram.ui.ActionBar.e6) obj).Q(R.raw.copy, 36, hd.M0(2131743201, null)).k(false);
                break;
            case 10:
                super/*android.widget.TextView*/.onDraw((Canvas) obj);
                break;
            case 11:
                super/*org.telegram.ui.Components.h6*/.onDraw((Canvas) obj);
                break;
            case 12:
                super/*org.telegram.ui.Components.h6*/.onDraw((Canvas) obj);
                break;
            case 13:
                ((ViewGroup) obj).removeView(((o6) obj2).h);
                break;
            case 14:
                ((z10) obj2).a((TL_wallet.walletTransaction) obj);
                break;
            case 15:
                c8 c8Var = (c8) obj2;
                TLRPC.UserFull userFull = (TLRPC.UserFull) obj;
                if (!c8Var.b1 && userFull != null) {
                    TL_wallet.card cardVar = userFull.wallet_card;
                    if (cardVar == null) {
                        cardVar = new TL_wallet.card();
                    }
                    c8Var.d(cardVar);
                    break;
                }
                break;
            case 16:
                f8 f8Var = (f8) obj2;
                org.telegram.ui.ActionBar.e2 e2Var = (org.telegram.ui.ActionBar.e2) obj;
                if ((e2Var instanceof y5) && cc.a(e2Var)) {
                    cc.a0(e2Var).I(R.raw.contact_check, hd.M0(2131743089, null), hd.M0(2131743088, null)).j();
                }
                f8Var.finishFragment();
                break;
            case 17:
                ((p0) obj).B();
                ((p8) obj2).a.g3.O(true);
                break;
            case 18:
                p8 p8Var = (p8) obj;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, p8Var.getParentActivity(), p8Var.getResourceProvider());
                String M0 = hd.M0(2131743131, null);
                org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
                t1Var.S = M0;
                t1Var.U = hd.M0(2131743133, null);
                alertDialog$Builder.h(hd.M0(2131752589, null), null);
                alertDialog$Builder.k(hd.M0(2131743136, null), new k8(1 == true ? 1 : 0, p8Var, (l0) obj2));
                alertDialog$Builder.d(-1);
                alertDialog$Builder.p();
                break;
            case 19:
                ((org.telegram.ui.ActionBar.t1[]) obj2)[0].dismiss();
                ((Runnable) obj).run();
                break;
            case 20:
                ((ViewGroup) obj).removeView(((da) obj2).h);
                break;
            case 21:
                mc1 mc1Var = (mc1) obj2;
                int[] iArr = (int[]) obj;
                mc1Var.getClass();
                int i13 = iArr[0] - 1;
                iArr[0] = i13;
                if (i13 == 0) {
                    mc1Var.a.G0(true);
                    break;
                }
                break;
            case 22:
                rc1 rc1Var = (rc1) obj2;
                String str = (String) obj;
                rc1Var.d.clear();
                rc1Var.e.clear();
                rc1Var.f = true;
                rc1Var.F(str, "", true);
                rc1Var.h = str;
                rc1Var.f();
                rc1Var.E = null;
                break;
            case 23:
                rc1 rc1Var2 = (rc1) obj2;
                TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) ((TLObject) obj);
                WallpapersListActivity wallpapersListActivity = rc1Var2.F;
                i7 = ((org.telegram.ui.ActionBar.e2) wallpapersListActivity).currentAccount;
                np.s1(i7).Y3(tL_contacts_resolvedPeer.users, false);
                i10 = ((org.telegram.ui.ActionBar.e2) wallpapersListActivity).currentAccount;
                np.s1(i10).S3(tL_contacts_resolvedPeer.chats, false);
                wallpapersListActivity.getMessagesStorage().m1(tL_contacts_resolvedPeer.users, tL_contacts_resolvedPeer.chats, true, true);
                String str2 = rc1Var2.y;
                rc1Var2.y = null;
                rc1Var2.F(str2, "", false);
                break;
            case 24:
                String str3 = (String) obj;
                zc1 zc1Var = ((yc1) obj2).a;
                Activity parentActivity = zc1Var.getParentActivity();
                gj gjVar = zc1Var.n;
                if (parentActivity != null) {
                    if (org.telegram.messenger.r2.a) {
                        org.telegram.messenger.a8.b(str3);
                    }
                    str3.getClass();
                    if (str3.equals("share_game")) {
                        gjVar.k.with_my_score = false;
                    } else if (str3.equals("share_score")) {
                        gjVar.k.with_my_score = true;
                    }
                    zc1Var.showDialog(po0.N0(zc1Var.getParentActivity(), gjVar, null, false, zc1Var.h));
                    break;
                }
                break;
            case 25:
                org.telegram.ui.web.v0 v0Var2 = (org.telegram.ui.web.v0) obj2;
                ki.r rVar = v0Var2.k0;
                rVar.f = true;
                rVar.k();
                v0Var2.v((fi.i7) obj);
                break;
            case 26:
                BotWebViewContainer$BotWebViewProxy botWebViewContainer$BotWebViewProxy = (BotWebViewContainer$BotWebViewProxy) obj2;
                ArrayList arrayList = (ArrayList) obj;
                if (botWebViewContainer$BotWebViewProxy != null && (v0Var = botWebViewContainer$BotWebViewProxy.a) != null && (c0Var = v0Var.c) != null) {
                    c0Var.f(arrayList);
                    break;
                }
                break;
            case 27:
                ArrayList arrayList2 = (ArrayList) obj2;
                LongSparseArray longSparseArray = (LongSparseArray) obj;
                za.c.addAll(0, arrayList2);
                for (int i14 = 0; i14 < longSparseArray.size(); i14++) {
                    za.d.put(longSparseArray.keyAt(i14), (org.telegram.ui.web.w0) longSparseArray.valueAt(i14));
                }
                za.b = true;
                za.a = false;
                ArrayList arrayList3 = za.e;
                if (arrayList3 != null) {
                    int size = arrayList3.size();
                    while (i12 < size) {
                        Object obj3 = arrayList3.get(i12);
                        i12++;
                        ((z10) obj3).a(arrayList2);
                    }
                    za.e = null;
                    break;
                }
                break;
            case 28:
                org.telegram.ui.web.x0 x0Var = (org.telegram.ui.web.x0) ((hi.s2) obj2).c;
                ArrayList arrayList4 = x0Var.h;
                arrayList4.clear();
                arrayList4.addAll((ArrayList) obj);
                x0Var.n = false;
                bi.v3 v3Var = x0Var.a;
                if (v3Var != null) {
                    v3Var.g3.O(true);
                    break;
                }
                break;
            default:
                org.telegram.ui.ActionBar.z0 z0Var = (org.telegram.ui.ActionBar.z0) obj2;
                z0Var.setEnabled(((org.telegram.ui.web.t1) obj).b() != null);
                z0Var.animate().alpha(z0Var.isEnabled() ? 1.0f : 0.5f);
                break;
        }
    }

    public /* synthetic */ r(p8 p8Var, l0 l0Var) {
        this.a = 18;
        this.c = p8Var;
        this.b = l0Var;
    }
}
