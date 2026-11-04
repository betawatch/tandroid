package ci;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.webkit.JsPromptResult;
import android.widget.EditText;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.bd;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.hp;
import org.telegram.messenger.hs;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.Components.cb0;
import org.telegram.ui.ExternalActionActivity;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.el0;
import org.telegram.ui.f31;
import org.telegram.ui.wz0;
import org.telegram.ui.zb1;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class h3 implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ h3(int i3, Object obj, Object obj2) {
        this.a = i3;
        this.b = obj;
        this.c = obj2;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        Runnable runnable;
        org.telegram.ui.Wallet.m9 m9Var;
        int i3 = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i3) {
            case 0:
                ((boolean[]) obj2)[0] = true;
                Runnable runnable2 = ((Runnable[]) obj)[0];
                if (runnable2 != null) {
                    runnable2.run();
                    break;
                }
                break;
            case 1:
                ai.n6 n6Var = (ai.n6) obj;
                if (!((boolean[]) obj2)[0]) {
                    n6Var.a(Boolean.FALSE, null);
                    break;
                }
                break;
            case 2:
                boolean[] zArr = (boolean[]) obj2;
                ai.v1 v1Var = (ai.v1) obj;
                if (!zArr[0]) {
                    v1Var.a(Boolean.FALSE);
                    zArr[0] = true;
                    break;
                }
                break;
            case 3:
                boolean[] zArr2 = (boolean[]) obj2;
                org.telegram.ui.web.w wVar = (org.telegram.ui.web.w) obj;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    wVar.a(null);
                    break;
                }
                break;
            case 4:
                kg.e1 e1Var = (kg.e1) obj;
                e1Var.getClass();
                if (!((boolean[]) obj2)[0]) {
                    e1Var.Q();
                    break;
                }
                break;
            case 5:
                org.telegram.ui.ActionBar.d2 d2Var = (org.telegram.ui.ActionBar.d2) obj2;
                DialogInterface.OnDismissListener onDismissListener = (DialogInterface.OnDismissListener) obj;
                d2Var.getClass();
                if (onDismissListener != null) {
                    onDismissListener.onDismiss(dialogInterface);
                }
                d2Var.onDialogDismiss((Dialog) dialogInterface);
                if (dialogInterface == d2Var.visibleDialog) {
                    d2Var.visibleDialog = null;
                    break;
                }
                break;
            case 6:
                org.telegram.ui.ActionBar.d2 d2Var2 = (org.telegram.ui.ActionBar.d2) obj2;
                org.telegram.ui.ActionBar.b2 b2Var = (org.telegram.ui.ActionBar.b2) obj;
                d2Var2.onPause();
                d2Var2.onFragmentDestroy();
                if (b2Var != null && (runnable = b2Var.b) != null) {
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
                ((ai.v2) obj2).a(Integer.valueOf(((cb0) obj).getValue()));
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
                org.telegram.ui.ActionBar.s1 s1Var = (org.telegram.ui.ActionBar.s1) obj;
                if (s1Var == launchActivity.I0) {
                    ActionBarLayout actionBarLayout = launchActivity.r0;
                    org.telegram.ui.ActionBar.d2 lastFragment = actionBarLayout == null ? null : actionBarLayout.getLastFragment();
                    try {
                        String str = bd.E0().B.c;
                        if (lastFragment != null) {
                            org.telegram.ui.Components.ac Q = org.telegram.ui.Components.fc.a0(lastFragment).Q(R.raw.msg_translate, 36, LaunchActivity.U(2131752545, "ChangeLanguageLater", str.equals("en") ? launchActivity.L0 : launchActivity.K0));
                            Q.j = 5000;
                            Q.j();
                        } else {
                            org.telegram.ui.Components.ac Q2 = new org.telegram.ui.Components.fc(org.telegram.ui.Components.wa.a(launchActivity), null).Q(R.raw.msg_translate, 36, LaunchActivity.U(2131752545, "ChangeLanguageLater", str.equals("en") ? launchActivity.L0 : launchActivity.K0));
                            Q2.j = 5000;
                            Q2.j();
                        }
                    } catch (Exception e10) {
                        org.telegram.messenger.a8.g(e10, true);
                    }
                    launchActivity.I0 = null;
                } else if (s1Var == launchActivity.G0) {
                    hp.e1();
                    SharedPreferences.Editor edit = hp.e1().edit();
                    edit.putBoolean("proxy_enabled", false);
                    edit.commit();
                    ConnectionsManager.setProxySettings(false, null);
                    hs.e().k(hs.A4, new Object[0]);
                    launchActivity.G0 = null;
                }
                launchActivity.F0.remove(s1Var);
                break;
            case 12:
                el0 el0Var = (el0) obj;
                if (!((boolean[]) obj2)[0]) {
                    el0Var.a(Boolean.FALSE);
                    break;
                }
                break;
            case 13:
                wz0 wz0Var = (wz0) obj;
                if (!((boolean[]) obj2)[0]) {
                    wz0Var.c(true);
                }
                wz0Var.x = null;
                break;
            case 14:
                zb1 zb1Var = (zb1) obj;
                if (!((boolean[]) obj2)[0]) {
                    zb1Var.v0.b();
                    break;
                }
                break;
            case 15:
                TLRPC.User user = (TLRPC.User) obj2;
                TL_wallet.walletTransactionPeerUser wallettransactionpeeruser = (TL_wallet.walletTransactionPeerUser) obj;
                org.telegram.ui.ActionBar.d2 T = LaunchActivity.T();
                if (T != null) {
                    if (user != null) {
                        m9Var = new org.telegram.ui.Wallet.m9(user);
                    } else {
                        m9Var = new org.telegram.ui.Wallet.m9(wallettransactionpeeruser.address);
                        m9Var.A0(wallettransactionpeeruser.domain);
                    }
                    T.presentFragment(m9Var);
                    break;
                }
                break;
            case 16:
                org.telegram.ui.web.w0 w0Var = (org.telegram.ui.web.w0) obj2;
                Runnable runnable3 = (Runnable) obj;
                if (runnable3 != null) {
                    w0Var.getClass();
                    runnable3.run();
                }
                w0Var.d0 = null;
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
                f31 f31Var = (f31) obj;
                if (!((AtomicBoolean) obj2).get()) {
                    f31Var.run();
                    break;
                }
                break;
        }
    }

    public /* synthetic */ h3(Object obj, boolean[] zArr, int i3) {
        this.a = i3;
        this.c = obj;
        this.b = zArr;
    }
}
