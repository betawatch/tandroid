package ei;

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
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.Components.cd0;
import org.telegram.ui.Components.kb;
import org.telegram.ui.Components.pc;
import org.telegram.ui.Components.xc;
import org.telegram.ui.ExternalActionActivity;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ti1;
import org.telegram.ui.y51;
import org.telegram.ui.zo0;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes4.dex */
public final /* synthetic */ class e0 implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ e0(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        Runnable runnable;
        int i10 = this.a;
        Object obj = this.b;
        Object obj2 = this.c;
        switch (i10) {
            case 0:
                boolean[] zArr = (boolean[]) obj;
                ai.e4 e4Var = (ai.e4) obj2;
                if (!zArr[0]) {
                    e4Var.run(Boolean.FALSE);
                    zArr[0] = true;
                    break;
                }
                break;
            case 1:
                boolean[] zArr2 = (boolean[]) obj;
                org.telegram.ui.web.a0 a0Var = (org.telegram.ui.web.a0) obj2;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    a0Var.run(null);
                    break;
                }
                break;
            case 2:
                gg.k1 k1Var = (gg.k1) obj2;
                k1Var.getClass();
                if (!((boolean[]) obj)[0]) {
                    k1Var.Q();
                    break;
                }
                break;
            case 3:
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) obj;
                DialogInterface.OnDismissListener onDismissListener = (DialogInterface.OnDismissListener) obj2;
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
            case 4:
                org.telegram.ui.ActionBar.n2 n2Var2 = (org.telegram.ui.ActionBar.n2) obj;
                org.telegram.ui.ActionBar.l2 l2Var = (org.telegram.ui.ActionBar.l2) obj2;
                n2Var2.onPause();
                n2Var2.onFragmentDestroy();
                if (l2Var != null && (runnable = l2Var.b) != null) {
                    runnable.run();
                    break;
                }
                break;
            case 5:
                q0.a aVar = (q0.a) obj2;
                if (!((AtomicBoolean) obj).get()) {
                    aVar.accept(Boolean.FALSE);
                    break;
                }
                break;
            case 6:
                AndroidUtilities.hideKeyboard((EditText) obj);
                AndroidUtilities.hideKeyboard((EditText) obj2);
                break;
            case 7:
                ((org.telegram.ui.web.b1) obj).run(Integer.valueOf(((cd0) obj2).getValue()));
                break;
            case 8:
                ExternalActionActivity externalActionActivity = (ExternalActionActivity) obj;
                ArrayList arrayList = ExternalActionActivity.x;
                externalActionActivity.getClass();
                externalActionActivity.setResult(1, new Intent().putExtra("error", ((TLRPC.TL_error) obj2).text));
                externalActionActivity.finish();
                break;
            case 9:
                LaunchActivity launchActivity = (LaunchActivity) obj;
                org.telegram.ui.ActionBar.b2 b2Var = (org.telegram.ui.ActionBar.b2) obj2;
                if (b2Var == launchActivity.H0) {
                    ActionBarLayout actionBarLayout = launchActivity.q0;
                    org.telegram.ui.ActionBar.n2 lastFragment = actionBarLayout == null ? null : actionBarLayout.getLastFragment();
                    try {
                        String str = LocaleController.getInstance().getCurrentLocaleInfo().shortName;
                        if (lastFragment != null) {
                            pc Q = xc.a0(lastFragment).Q(R.raw.msg_translate, 36, LaunchActivity.V(R.string.ChangeLanguageLater, "ChangeLanguageLater", str.equals("en") ? launchActivity.K0 : launchActivity.J0));
                            Q.j = 5000;
                            Q.j();
                        } else {
                            pc Q2 = new xc(kb.a(launchActivity), null).Q(R.raw.msg_translate, 36, LaunchActivity.V(R.string.ChangeLanguageLater, "ChangeLanguageLater", str.equals("en") ? launchActivity.K0 : launchActivity.J0));
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
            case 10:
                zo0 zo0Var = (zo0) obj2;
                if (!((boolean[]) obj)[0]) {
                    zo0Var.run(Boolean.FALSE);
                    break;
                }
                break;
            case 11:
                y51 y51Var = (y51) obj2;
                if (!((boolean[]) obj)[0]) {
                    y51Var.c(true);
                }
                y51Var.w = null;
                break;
            case 12:
                ti1 ti1Var = (ti1) obj2;
                if (!((boolean[]) obj)[0]) {
                    ti1Var.u0.b();
                    break;
                }
                break;
            case 13:
                org.telegram.ui.web.d1 d1Var = (org.telegram.ui.web.d1) obj;
                Runnable runnable2 = (Runnable) obj2;
                if (runnable2 != null) {
                    d1Var.getClass();
                    runnable2.run();
                }
                d1Var.c0 = null;
                break;
            case 14:
                boolean[] zArr3 = (boolean[]) obj;
                JsPromptResult jsPromptResult = (JsPromptResult) obj2;
                if (!zArr3[0]) {
                    zArr3[0] = true;
                    jsPromptResult.cancel();
                    break;
                }
                break;
            case 15:
                ai.j jVar = (ai.j) obj2;
                if (!((AtomicBoolean) obj).get()) {
                    jVar.run();
                    break;
                }
                break;
            default:
                xh.n4 n4Var = (xh.n4) obj2;
                if (!((boolean[]) obj)[0]) {
                    n4Var.run(Boolean.FALSE, null);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ e0(Object obj, boolean[] zArr, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = zArr;
    }
}
