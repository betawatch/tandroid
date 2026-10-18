package ai;

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
import org.telegram.ui.Components.od0;
import org.telegram.ui.ExternalActionActivity;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.io0;
import org.telegram.ui.jh1;
import org.telegram.ui.lh0;
import org.telegram.ui.o41;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes4.dex */
public final /* synthetic */ class x3 implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ x3(int i10, Object obj, Object obj2) {
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
                yh.l4 l4Var = (yh.l4) obj;
                if (!((boolean[]) obj2)[0]) {
                    l4Var.run(Boolean.FALSE, null);
                    break;
                }
                break;
            case 2:
                boolean[] zArr = (boolean[]) obj2;
                ci.y2 y2Var = (ci.y2) obj;
                if (!zArr[0]) {
                    y2Var.run(Boolean.FALSE);
                    zArr[0] = true;
                    break;
                }
                break;
            case 3:
                boolean[] zArr2 = (boolean[]) obj2;
                org.telegram.ui.web.b0 b0Var = (org.telegram.ui.web.b0) obj;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    b0Var.run(null);
                    break;
                }
                break;
            case 4:
                hg.j1 j1Var = (hg.j1) obj;
                j1Var.getClass();
                if (!((boolean[]) obj2)[0]) {
                    j1Var.Q();
                    break;
                }
                break;
            case 5:
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) obj2;
                DialogInterface.OnDismissListener onDismissListener = (DialogInterface.OnDismissListener) obj;
                n2Var.getClass();
                if (onDismissListener != null) {
                    onDismissListener.onDismiss(dialogInterface);
                }
                n2Var.onDialogDismiss((Dialog) dialogInterface);
                if (dialogInterface == n2Var.visibleDialog) {
                    n2Var.visibleDialog = null;
                    break;
                }
                break;
            case 6:
                org.telegram.ui.ActionBar.n2 n2Var2 = (org.telegram.ui.ActionBar.n2) obj2;
                org.telegram.ui.ActionBar.l2 l2Var = (org.telegram.ui.ActionBar.l2) obj;
                n2Var2.onPause();
                n2Var2.onFragmentDestroy();
                if (l2Var != null && (runnable = l2Var.b) != null) {
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
                ((r0) obj2).run(Integer.valueOf(((od0) obj).getValue()));
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
                org.telegram.ui.ActionBar.b2 b2Var = (org.telegram.ui.ActionBar.b2) obj;
                if (b2Var == launchActivity.H0) {
                    ActionBarLayout actionBarLayout = launchActivity.q0;
                    org.telegram.ui.ActionBar.n2 lastFragment = actionBarLayout == null ? null : actionBarLayout.getLastFragment();
                    try {
                        String str = LocaleController.getInstance().getCurrentLocaleInfo().shortName;
                        if (lastFragment != null) {
                            org.telegram.ui.Components.qc Q = org.telegram.ui.Components.xc.a0(lastFragment).Q(R.raw.msg_translate, 36, LaunchActivity.V(R.string.ChangeLanguageLater, "ChangeLanguageLater", str.equals("en") ? launchActivity.K0 : launchActivity.J0));
                            Q.j = 5000;
                            Q.j();
                        } else {
                            org.telegram.ui.Components.qc Q2 = new org.telegram.ui.Components.xc(org.telegram.ui.Components.lb.a(launchActivity), null).Q(R.raw.msg_translate, 36, LaunchActivity.V(R.string.ChangeLanguageLater, "ChangeLanguageLater", str.equals("en") ? launchActivity.K0 : launchActivity.J0));
                            Q2.j = 5000;
                            Q2.j();
                        }
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                    launchActivity.H0 = null;
                } else if (b2Var == launchActivity.F0) {
                    MessagesController.getGlobalMainSettings();
                    SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
                    edit.putBoolean("proxy_enabled", false);
                    edit.commit();
                    ConnectionsManager.setProxySettings(false, null);
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.proxySettingsChanged, new Object[0]);
                    launchActivity.F0 = null;
                }
                launchActivity.E0.remove(b2Var);
                break;
            case 12:
                io0 io0Var = (io0) obj;
                if (!((boolean[]) obj2)[0]) {
                    io0Var.run(Boolean.FALSE);
                    break;
                }
                break;
            case 13:
                o41 o41Var = (o41) obj;
                if (!((boolean[]) obj2)[0]) {
                    o41Var.c(true);
                }
                o41Var.w = null;
                break;
            case 14:
                jh1 jh1Var = (jh1) obj;
                if (!((boolean[]) obj2)[0]) {
                    jh1Var.u0.b();
                    break;
                }
                break;
            case 15:
                TLRPC.User user = (TLRPC.User) obj2;
                TL_wallet.walletTransactionPeerUser wallettransactionpeeruser = (TL_wallet.walletTransactionPeerUser) obj;
                org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                if (U != null) {
                    if (user != null) {
                        i9Var = new org.telegram.ui.Wallet.i9(user);
                    } else {
                        i9Var = new org.telegram.ui.Wallet.i9(wallettransactionpeeruser.address);
                        i9Var.u0(wallettransactionpeeruser.domain);
                    }
                    U.presentFragment(i9Var);
                    break;
                }
                break;
            case 16:
                org.telegram.ui.web.b1 b1Var = (org.telegram.ui.web.b1) obj2;
                Runnable runnable3 = (Runnable) obj;
                if (runnable3 != null) {
                    b1Var.getClass();
                    runnable3.run();
                }
                b1Var.c0 = null;
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
                lh0 lh0Var = (lh0) obj;
                if (!((AtomicBoolean) obj2).get()) {
                    lh0Var.run();
                    break;
                }
                break;
        }
    }

    public /* synthetic */ x3(Object obj, boolean[] zArr, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = zArr;
    }
}
