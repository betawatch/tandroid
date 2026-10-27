package bi;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.webkit.JsPromptResult;
import android.widget.EditText;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.Components.nd0;
import org.telegram.ui.ExternalActionActivity;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.nh0;
import org.telegram.ui.rh1;
import org.telegram.ui.so0;
import org.telegram.ui.u41;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final /* synthetic */ class u3 implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ u3(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        Runnable runnable;
        org.telegram.ui.Wallet.i9 i9Var;
        int i10 = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i10) {
            case 0:
                ((boolean[]) obj2)[0] = true;
                Runnable runnable2 = ((Runnable[]) obj)[0];
                if (runnable2 != null) {
                    runnable2.run();
                    break;
                }
                break;
            case 1:
                zh.m4 m4Var = (zh.m4) obj;
                if (!((boolean[]) obj2)[0]) {
                    m4Var.run(Boolean.FALSE, null);
                    break;
                }
                break;
            case 2:
                boolean[] zArr = (boolean[]) obj2;
                di.y2 y2Var = (di.y2) obj;
                if (!zArr[0]) {
                    y2Var.run(Boolean.FALSE);
                    zArr[0] = true;
                    break;
                }
                break;
            case 3:
                boolean[] zArr2 = (boolean[]) obj2;
                org.telegram.ui.web.a0 a0Var = (org.telegram.ui.web.a0) obj;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    a0Var.run(null);
                    break;
                }
                break;
            case 4:
                ig.j1 j1Var = (ig.j1) obj;
                j1Var.getClass();
                if (!((boolean[]) obj2)[0]) {
                    j1Var.Q();
                    break;
                }
                break;
            case 5:
                org.telegram.ui.ActionBar.r2 r2Var = (org.telegram.ui.ActionBar.r2) obj2;
                DialogInterface.OnDismissListener onDismissListener = (DialogInterface.OnDismissListener) obj;
                r2Var.getClass();
                if (onDismissListener != null) {
                    onDismissListener.onDismiss(dialogInterface);
                }
                r2Var.onDialogDismiss((Dialog) dialogInterface);
                if (dialogInterface == r2Var.visibleDialog) {
                    r2Var.visibleDialog = null;
                    break;
                }
                break;
            case 6:
                org.telegram.ui.ActionBar.r2 r2Var2 = (org.telegram.ui.ActionBar.r2) obj2;
                org.telegram.ui.ActionBar.p2 p2Var = (org.telegram.ui.ActionBar.p2) obj;
                r2Var2.onPause();
                r2Var2.onFragmentDestroy();
                if (p2Var != null && (runnable = p2Var.b) != null) {
                    runnable.run();
                    break;
                }
                break;
            case 7:
                q0.a aVar = (q0.a) obj;
                if (!((AtomicBoolean) obj2).get()) {
                    aVar.accept(Boolean.FALSE);
                    break;
                }
                break;
            case 8:
                AndroidUtilities.hideKeyboard((EditText) obj2);
                AndroidUtilities.hideKeyboard((EditText) obj);
                break;
            case 9:
                ((ai.i) obj2).run(Integer.valueOf(((nd0) obj).getValue()));
                break;
            case 10:
                ExternalActionActivity externalActionActivity = (ExternalActionActivity) obj2;
                ArrayList arrayList = ExternalActionActivity.x;
                externalActionActivity.getClass();
                externalActionActivity.setResult(1, new Intent().putExtra("error", ((TLRPC.TL_error) obj).text));
                externalActionActivity.finish();
                break;
            case 11:
                LaunchActivity launchActivity = (LaunchActivity) obj2;
                org.telegram.ui.ActionBar.e2 e2Var = (org.telegram.ui.ActionBar.e2) obj;
                if (e2Var == launchActivity.H0) {
                    ActionBarLayout actionBarLayout = launchActivity.q0;
                    org.telegram.ui.ActionBar.r2 lastFragment = actionBarLayout == null ? null : actionBarLayout.getLastFragment();
                    try {
                        String str = LocaleController.getInstance().getCurrentLocaleInfo().shortName;
                        if (lastFragment != null) {
                            org.telegram.ui.Components.qc R = org.telegram.ui.Components.wc.b0(lastFragment).R(R.raw.msg_translate, 36, LaunchActivity.V(R.string.ChangeLanguageLater, "ChangeLanguageLater", str.equals("en") ? launchActivity.K0 : launchActivity.J0));
                            R.j = 5000;
                            R.j();
                        } else {
                            org.telegram.ui.Components.qc R2 = new org.telegram.ui.Components.wc(org.telegram.ui.Components.lb.a(launchActivity), null).R(R.raw.msg_translate, 36, LaunchActivity.V(R.string.ChangeLanguageLater, "ChangeLanguageLater", str.equals("en") ? launchActivity.K0 : launchActivity.J0));
                            R2.j = 5000;
                            R2.j();
                        }
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                    launchActivity.H0 = null;
                } else if (e2Var == launchActivity.F0) {
                    MessagesController.getGlobalMainSettings();
                    SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
                    edit.putBoolean("proxy_enabled", false);
                    edit.commit();
                    ConnectionsManager.setProxySettings(false, null);
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.proxySettingsChanged, new Object[0]);
                    launchActivity.F0 = null;
                }
                launchActivity.E0.remove(e2Var);
                break;
            case 12:
                so0 so0Var = (so0) obj;
                if (!((boolean[]) obj2)[0]) {
                    so0Var.run(Boolean.FALSE);
                    break;
                }
                break;
            case 13:
                u41 u41Var = (u41) obj;
                if (!((boolean[]) obj2)[0]) {
                    u41Var.c(true);
                }
                u41Var.w = null;
                break;
            case 14:
                rh1 rh1Var = (rh1) obj;
                if (!((boolean[]) obj2)[0]) {
                    rh1Var.u0.b();
                    break;
                }
                break;
            case 15:
                TLRPC.User user = (TLRPC.User) obj2;
                TL_wallet.walletTransactionPeerUser wallettransactionpeeruser = (TL_wallet.walletTransactionPeerUser) obj;
                org.telegram.ui.ActionBar.r2 U = LaunchActivity.U();
                if (U != null) {
                    if (user != null) {
                        i9Var = new org.telegram.ui.Wallet.i9(user);
                    } else {
                        i9Var = new org.telegram.ui.Wallet.i9(wallettransactionpeeruser.address);
                        i9Var.w0(wallettransactionpeeruser.domain);
                    }
                    U.presentFragment(i9Var);
                    break;
                }
                break;
            case 16:
                org.telegram.ui.web.a1 a1Var = (org.telegram.ui.web.a1) obj2;
                Runnable runnable3 = (Runnable) obj;
                if (runnable3 != null) {
                    a1Var.getClass();
                    runnable3.run();
                }
                a1Var.c0 = null;
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
                nh0 nh0Var = (nh0) obj;
                if (!((AtomicBoolean) obj2).get()) {
                    nh0Var.run();
                    break;
                }
                break;
        }
    }

    public /* synthetic */ u3(Object obj, boolean[] zArr, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = zArr;
    }
}
