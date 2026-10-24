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
import org.telegram.ui.Components.qd0;
import org.telegram.ui.ExternalActionActivity;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ko0;
import org.telegram.ui.oh0;
import org.telegram.ui.oh1;
import org.telegram.ui.q41;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes4.dex */
public final /* synthetic */ class z3 implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ z3(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        Runnable runnable;
        org.telegram.ui.Wallet.j9 j9Var;
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
                org.telegram.ui.web.a0 a0Var = (org.telegram.ui.web.a0) obj;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    a0Var.run(null);
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
                org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) obj2;
                DialogInterface.OnDismissListener onDismissListener = (DialogInterface.OnDismissListener) obj;
                o2Var.getClass();
                if (onDismissListener != null) {
                    onDismissListener.onDismiss(dialogInterface);
                }
                o2Var.onDialogDismiss((Dialog) dialogInterface);
                if (dialogInterface == o2Var.visibleDialog) {
                    o2Var.visibleDialog = null;
                    break;
                }
                break;
            case 6:
                org.telegram.ui.ActionBar.o2 o2Var2 = (org.telegram.ui.ActionBar.o2) obj2;
                org.telegram.ui.ActionBar.m2 m2Var = (org.telegram.ui.ActionBar.m2) obj;
                o2Var2.onPause();
                o2Var2.onFragmentDestroy();
                if (m2Var != null && (runnable = m2Var.b) != null) {
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
                ((r0) obj2).run(Integer.valueOf(((qd0) obj).getValue()));
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
                org.telegram.ui.ActionBar.c2 c2Var = (org.telegram.ui.ActionBar.c2) obj;
                if (c2Var == launchActivity.H0) {
                    ActionBarLayout actionBarLayout = launchActivity.q0;
                    org.telegram.ui.ActionBar.o2 lastFragment = actionBarLayout == null ? null : actionBarLayout.getLastFragment();
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
                } else if (c2Var == launchActivity.F0) {
                    MessagesController.getGlobalMainSettings();
                    SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
                    edit.putBoolean("proxy_enabled", false);
                    edit.commit();
                    ConnectionsManager.setProxySettings(false, null);
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.proxySettingsChanged, new Object[0]);
                    launchActivity.F0 = null;
                }
                launchActivity.E0.remove(c2Var);
                break;
            case 12:
                ko0 ko0Var = (ko0) obj;
                if (!((boolean[]) obj2)[0]) {
                    ko0Var.run(Boolean.FALSE);
                    break;
                }
                break;
            case 13:
                q41 q41Var = (q41) obj;
                if (!((boolean[]) obj2)[0]) {
                    q41Var.c(true);
                }
                q41Var.w = null;
                break;
            case 14:
                oh1 oh1Var = (oh1) obj;
                if (!((boolean[]) obj2)[0]) {
                    oh1Var.u0.b();
                    break;
                }
                break;
            case 15:
                TLRPC.User user = (TLRPC.User) obj2;
                TL_wallet.walletTransactionPeerUser wallettransactionpeeruser = (TL_wallet.walletTransactionPeerUser) obj;
                org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
                if (U != null) {
                    if (user != null) {
                        j9Var = new org.telegram.ui.Wallet.j9(user);
                    } else {
                        j9Var = new org.telegram.ui.Wallet.j9(wallettransactionpeeruser.address);
                        j9Var.v0(wallettransactionpeeruser.domain);
                    }
                    U.presentFragment(j9Var);
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
                oh0 oh0Var = (oh0) obj;
                if (!((AtomicBoolean) obj2).get()) {
                    oh0Var.run();
                    break;
                }
                break;
        }
    }

    public /* synthetic */ z3(Object obj, boolean[] zArr, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = zArr;
    }
}
