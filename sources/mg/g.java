package mg;

import ag.m2;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.webkit.JsPromptResult;
import android.widget.EditText;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.cd;
import org.telegram.messenger.f8;
import org.telegram.messenger.vp;
import org.telegram.messenger.zs;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.k2;
import org.telegram.ui.Components.ac0;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.ra;
import org.telegram.ui.Components.wb;
import org.telegram.ui.ExternalActionActivity;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.Wallet.r9;
import org.telegram.ui.be1;
import org.telegram.ui.tm0;
import org.telegram.ui.y11;
import ph.u3;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class g implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ g(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        Runnable runnable;
        r9 r9Var;
        int i10 = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i10) {
            case 0:
                bi.e eVar = (bi.e) obj;
                if (!((AtomicBoolean) obj2).get()) {
                    eVar.run();
                    break;
                }
                break;
            case 1:
                k2 k2Var = (k2) obj2;
                DialogInterface.OnDismissListener onDismissListener = (DialogInterface.OnDismissListener) obj;
                k2Var.getClass();
                if (onDismissListener != null) {
                    onDismissListener.onDismiss(dialogInterface);
                }
                k2Var.onDialogDismiss((Dialog) dialogInterface);
                if (dialogInterface == k2Var.visibleDialog) {
                    k2Var.visibleDialog = null;
                    break;
                }
                break;
            case 2:
                k2 k2Var2 = (k2) obj2;
                org.telegram.ui.ActionBar.i2 i2Var = (org.telegram.ui.ActionBar.i2) obj;
                k2Var2.onPause();
                k2Var2.onFragmentDestroy();
                if (i2Var != null && (runnable = i2Var.b) != null) {
                    runnable.run();
                    break;
                }
                break;
            case 3:
                org.telegram.messenger.i0.v1((EditText) obj2);
                org.telegram.messenger.i0.v1((EditText) obj);
                break;
            case 4:
                q0.a aVar = (q0.a) obj;
                if (!((AtomicBoolean) obj2).get()) {
                    aVar.accept(Boolean.FALSE);
                    break;
                }
                break;
            case 5:
                ((ph.h1) obj2).a(Integer.valueOf(((ac0) obj).getValue()));
                break;
            case 6:
                ExternalActionActivity externalActionActivity = (ExternalActionActivity) obj2;
                ArrayList arrayList = ExternalActionActivity.y;
                externalActionActivity.getClass();
                externalActionActivity.setResult(1, new Intent().putExtra("error", ((TLRPC.TL_error) obj).text));
                externalActionActivity.finish();
                break;
            case 7:
                LaunchActivity launchActivity = (LaunchActivity) obj2;
                org.telegram.ui.ActionBar.x1 x1Var = (org.telegram.ui.ActionBar.x1) obj;
                if (x1Var == launchActivity.H0) {
                    ActionBarLayout actionBarLayout = launchActivity.q0;
                    k2 lastFragment = actionBarLayout == null ? null : actionBarLayout.getLastFragment();
                    try {
                        String str = cd.D0().B.c;
                        if (lastFragment != null) {
                            wb Q = cc.a0(lastFragment).Q(R.raw.msg_translate, 36, LaunchActivity.U(2131752545, "ChangeLanguageLater", str.equals("en") ? launchActivity.K0 : launchActivity.J0));
                            Q.j = 5000;
                            Q.j();
                        } else {
                            wb Q2 = new cc(ra.a(launchActivity), null).Q(R.raw.msg_translate, 36, LaunchActivity.U(2131752545, "ChangeLanguageLater", str.equals("en") ? launchActivity.K0 : launchActivity.J0));
                            Q2.j = 5000;
                            Q2.j();
                        }
                    } catch (Exception e) {
                        f8.g(e, true);
                    }
                    launchActivity.H0 = null;
                } else if (x1Var == launchActivity.F0) {
                    vp.d1();
                    SharedPreferences.Editor edit = vp.d1().edit();
                    edit.putBoolean("proxy_enabled", false);
                    edit.commit();
                    ConnectionsManager.setProxySettings(false, null);
                    zs.e().k(zs.A4, new Object[0]);
                    launchActivity.F0 = null;
                }
                launchActivity.E0.remove(x1Var);
                break;
            case 8:
                tm0 tm0Var = (tm0) obj;
                if (!((boolean[]) obj2)[0]) {
                    tm0Var.a(Boolean.FALSE);
                    break;
                }
                break;
            case 9:
                y11 y11Var = (y11) obj2;
                if (!((boolean[]) obj)[0]) {
                    y11Var.c(true);
                }
                y11Var.x = null;
                break;
            case 10:
                be1 be1Var = (be1) obj2;
                if (!((boolean[]) obj)[0]) {
                    be1Var.u0.b();
                    break;
                }
                break;
            case 11:
                TLRPC.User user = (TLRPC.User) obj2;
                TL_wallet.walletTransactionPeerUser wallettransactionpeeruser = (TL_wallet.walletTransactionPeerUser) obj;
                k2 T = LaunchActivity.T();
                if (T != null) {
                    if (user != null) {
                        r9Var = new r9(user);
                    } else {
                        r9Var = new r9(wallettransactionpeeruser.address);
                        r9Var.z0(wallettransactionpeeruser.domain);
                    }
                    T.presentFragment(r9Var);
                    break;
                }
                break;
            case 12:
                org.telegram.ui.web.z0 z0Var = (org.telegram.ui.web.z0) obj2;
                Runnable runnable2 = (Runnable) obj;
                if (runnable2 != null) {
                    z0Var.getClass();
                    runnable2.run();
                }
                z0Var.c0 = null;
                break;
            case 13:
                boolean[] zArr = (boolean[]) obj2;
                JsPromptResult jsPromptResult = (JsPromptResult) obj;
                if (!zArr[0]) {
                    zArr[0] = true;
                    jsPromptResult.cancel();
                    break;
                }
                break;
            case 14:
                ((boolean[]) obj2)[0] = true;
                Runnable runnable3 = ((Runnable[]) obj)[0];
                if (runnable3 != null) {
                    runnable3.run();
                    break;
                }
                break;
            case 15:
                u3 u3Var = (u3) obj2;
                if (!((boolean[]) obj)[0]) {
                    u3Var.a(Boolean.FALSE, null);
                    break;
                }
                break;
            case 16:
                boolean[] zArr2 = (boolean[]) obj2;
                m2 m2Var = (m2) obj;
                if (!zArr2[0]) {
                    m2Var.a(Boolean.FALSE);
                    zArr2[0] = true;
                    break;
                }
                break;
            case 17:
                boolean[] zArr3 = (boolean[]) obj2;
                org.telegram.ui.web.v vVar = (org.telegram.ui.web.v) obj;
                if (!zArr3[0]) {
                    zArr3[0] = true;
                    vVar.a(null);
                    break;
                }
                break;
            default:
                zf.x0 x0Var = (zf.x0) obj2;
                x0Var.getClass();
                if (!((boolean[]) obj)[0]) {
                    x0Var.Q();
                    break;
                }
                break;
        }
    }
}
