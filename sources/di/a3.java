package di;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.webkit.JsPromptResult;
import android.widget.EditText;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.hd;
import org.telegram.messenger.np;
import org.telegram.messenger.ns;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.Components.ib0;
import org.telegram.ui.ExternalActionActivity;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.d01;
import org.telegram.ui.ec1;
import org.telegram.ui.kl0;
import org.telegram.ui.n31;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class a3 implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ a3(int i7, Object obj, Object obj2) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        Runnable runnable;
        org.telegram.ui.Wallet.p9 p9Var;
        int i7 = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i7) {
            case 0:
                ((boolean[]) obj2)[0] = true;
                Runnable runnable2 = ((Runnable[]) obj)[0];
                if (runnable2 != null) {
                    runnable2.run();
                    break;
                }
                break;
            case 1:
                bi.f6 f6Var = (bi.f6) obj;
                if (!((boolean[]) obj2)[0]) {
                    f6Var.a(Boolean.FALSE, null);
                    break;
                }
                break;
            case 2:
                jg.h1 h1Var = (jg.h1) obj;
                h1Var.getClass();
                if (!((boolean[]) obj2)[0]) {
                    h1Var.Q();
                    break;
                }
                break;
            case 3:
                boolean[] zArr = (boolean[]) obj2;
                bi.o1 o1Var = (bi.o1) obj;
                if (!zArr[0]) {
                    o1Var.a(Boolean.FALSE);
                    zArr[0] = true;
                    break;
                }
                break;
            case 4:
                boolean[] zArr2 = (boolean[]) obj2;
                org.telegram.ui.web.v vVar = (org.telegram.ui.web.v) obj;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    vVar.a(null);
                    break;
                }
                break;
            case 5:
                org.telegram.ui.ActionBar.e2 e2Var = (org.telegram.ui.ActionBar.e2) obj2;
                DialogInterface.OnDismissListener onDismissListener = (DialogInterface.OnDismissListener) obj;
                e2Var.getClass();
                if (onDismissListener != null) {
                    onDismissListener.onDismiss(dialogInterface);
                }
                e2Var.onDialogDismiss((Dialog) dialogInterface);
                if (dialogInterface == e2Var.visibleDialog) {
                    e2Var.visibleDialog = null;
                    break;
                }
                break;
            case 6:
                org.telegram.ui.ActionBar.e2 e2Var2 = (org.telegram.ui.ActionBar.e2) obj2;
                org.telegram.ui.ActionBar.c2 c2Var = (org.telegram.ui.ActionBar.c2) obj;
                e2Var2.onPause();
                e2Var2.onFragmentDestroy();
                if (c2Var != null && (runnable = c2Var.b) != null) {
                    runnable.run();
                    break;
                }
                break;
            case 7:
                org.telegram.messenger.g0.v1((EditText) obj2);
                org.telegram.messenger.g0.v1((EditText) obj);
                break;
            case 8:
                q0.a aVar = (q0.a) obj;
                if (!((AtomicBoolean) obj2).get()) {
                    aVar.accept(Boolean.FALSE);
                    break;
                }
                break;
            case 9:
                ((ai.f0) obj2).a(Integer.valueOf(((ib0) obj).getValue()));
                break;
            case 10:
                ExternalActionActivity externalActionActivity = (ExternalActionActivity) obj2;
                ArrayList arrayList = ExternalActionActivity.y;
                externalActionActivity.getClass();
                externalActionActivity.setResult(1, new Intent().putExtra("error", ((TLRPC.TL_error) obj).text));
                externalActionActivity.finish();
                break;
            case 11:
                LaunchActivity launchActivity = (LaunchActivity) obj2;
                org.telegram.ui.ActionBar.t1 t1Var = (org.telegram.ui.ActionBar.t1) obj;
                if (t1Var == launchActivity.G0) {
                    ActionBarLayout actionBarLayout = launchActivity.p0;
                    org.telegram.ui.ActionBar.e2 lastFragment = actionBarLayout == null ? null : actionBarLayout.getLastFragment();
                    try {
                        String str = hd.E0().B.c;
                        if (lastFragment != null) {
                            org.telegram.ui.Components.xb Q = org.telegram.ui.Components.cc.a0(lastFragment).Q(R.raw.msg_translate, 36, LaunchActivity.U(2131752545, "ChangeLanguageLater", str.equals("en") ? launchActivity.J0 : launchActivity.I0));
                            Q.j = 5000;
                            Q.j();
                        } else {
                            org.telegram.ui.Components.xb Q2 = new org.telegram.ui.Components.cc(org.telegram.ui.Components.ta.a(launchActivity), null).Q(R.raw.msg_translate, 36, LaunchActivity.U(2131752545, "ChangeLanguageLater", str.equals("en") ? launchActivity.J0 : launchActivity.I0));
                            Q2.j = 5000;
                            Q2.j();
                        }
                    } catch (Exception e10) {
                        org.telegram.messenger.a8.g(e10, true);
                    }
                    launchActivity.G0 = null;
                } else if (t1Var == launchActivity.E0) {
                    np.e1();
                    SharedPreferences.Editor edit = np.e1().edit();
                    edit.putBoolean("proxy_enabled", false);
                    edit.commit();
                    ConnectionsManager.setProxySettings(false, null);
                    ns.e().k(ns.A4, new Object[0]);
                    launchActivity.E0 = null;
                }
                launchActivity.D0.remove(t1Var);
                break;
            case 12:
                kl0 kl0Var = (kl0) obj;
                if (!((boolean[]) obj2)[0]) {
                    kl0Var.a(Boolean.FALSE);
                    break;
                }
                break;
            case 13:
                d01 d01Var = (d01) obj;
                if (!((boolean[]) obj2)[0]) {
                    d01Var.c(true);
                }
                d01Var.x = null;
                break;
            case 14:
                ec1 ec1Var = (ec1) obj;
                if (!((boolean[]) obj2)[0]) {
                    ec1Var.u0.b();
                    break;
                }
                break;
            case 15:
                TLRPC.User user = (TLRPC.User) obj2;
                TL_wallet.walletTransactionPeerUser wallettransactionpeeruser = (TL_wallet.walletTransactionPeerUser) obj;
                org.telegram.ui.ActionBar.e2 T = LaunchActivity.T();
                if (T != null) {
                    if (user != null) {
                        p9Var = new org.telegram.ui.Wallet.p9(user);
                    } else {
                        p9Var = new org.telegram.ui.Wallet.p9(wallettransactionpeeruser.address);
                        p9Var.A0(wallettransactionpeeruser.domain);
                    }
                    T.presentFragment(p9Var);
                    break;
                }
                break;
            case 16:
                org.telegram.ui.web.v0 v0Var = (org.telegram.ui.web.v0) obj2;
                Runnable runnable3 = (Runnable) obj;
                if (runnable3 != null) {
                    v0Var.getClass();
                    runnable3.run();
                }
                v0Var.d0 = null;
                break;
            case 17:
                boolean[] zArr3 = (boolean[]) obj2;
                JsPromptResult jsPromptResult = (JsPromptResult) obj;
                if (!zArr3[0]) {
                    zArr3[0] = true;
                    jsPromptResult.cancel();
                    break;
                }
                break;
            default:
                n31 n31Var = (n31) obj;
                if (!((AtomicBoolean) obj2).get()) {
                    n31Var.run();
                    break;
                }
                break;
        }
    }

    public /* synthetic */ a3(Object obj, boolean[] zArr, int i7) {
        this.a = i7;
        this.c = obj;
        this.b = zArr;
    }
}
