package di;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.webkit.JsPromptResult;
import android.widget.EditText;
import bi.va;
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
import org.telegram.ui.Components.dd0;
import org.telegram.ui.Components.kb;
import org.telegram.ui.Components.pc;
import org.telegram.ui.Components.wc;
import org.telegram.ui.ExternalActionActivity;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.a61;
import org.telegram.ui.yo0;
import org.telegram.ui.zi1;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final /* synthetic */ class h0 implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ h0(int i10, Object obj, Object obj2) {
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
                gg.u1 u1Var = (gg.u1) obj2;
                if (!zArr[0]) {
                    u1Var.run(Boolean.FALSE);
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
                fg.l1 l1Var = (fg.l1) obj2;
                l1Var.getClass();
                if (!((boolean[]) obj)[0]) {
                    l1Var.Q();
                    break;
                }
                break;
            case 3:
                org.telegram.ui.ActionBar.p2 p2Var = (org.telegram.ui.ActionBar.p2) obj;
                DialogInterface.OnDismissListener onDismissListener = (DialogInterface.OnDismissListener) obj2;
                p2Var.getClass();
                if (onDismissListener != null) {
                    onDismissListener.onDismiss(dialogInterface);
                }
                p2Var.onDialogDismiss((Dialog) dialogInterface);
                if (dialogInterface == p2Var.visibleDialog) {
                    p2Var.visibleDialog = null;
                    break;
                }
                break;
            case 4:
                org.telegram.ui.ActionBar.p2 p2Var2 = (org.telegram.ui.ActionBar.p2) obj;
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) obj2;
                p2Var2.onPause();
                p2Var2.onFragmentDestroy();
                if (n2Var != null && (runnable = n2Var.b) != null) {
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
                ((org.telegram.ui.web.y1) obj).run(Integer.valueOf(((dd0) obj2).getValue()));
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
                org.telegram.ui.ActionBar.d2 d2Var = (org.telegram.ui.ActionBar.d2) obj2;
                if (d2Var == launchActivity.H0) {
                    ActionBarLayout actionBarLayout = launchActivity.q0;
                    org.telegram.ui.ActionBar.p2 lastFragment = actionBarLayout == null ? null : actionBarLayout.getLastFragment();
                    try {
                        String str = LocaleController.getInstance().getCurrentLocaleInfo().shortName;
                        if (lastFragment != null) {
                            pc Q = wc.a0(lastFragment).Q(R.raw.msg_translate, 36, LaunchActivity.V(R.string.ChangeLanguageLater, "ChangeLanguageLater", str.equals("en") ? launchActivity.K0 : launchActivity.J0));
                            Q.j = 5000;
                            Q.j();
                        } else {
                            pc Q2 = new wc(kb.a(launchActivity), null).Q(R.raw.msg_translate, 36, LaunchActivity.V(R.string.ChangeLanguageLater, "ChangeLanguageLater", str.equals("en") ? launchActivity.K0 : launchActivity.J0));
                            Q2.j = 5000;
                            Q2.j();
                        }
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                    launchActivity.H0 = null;
                } else if (d2Var == launchActivity.F0) {
                    MessagesController.getGlobalMainSettings();
                    SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
                    edit.putBoolean("proxy_enabled", false);
                    edit.putBoolean("proxy_enabled_calls", false);
                    edit.commit();
                    ConnectionsManager.setProxySettings(false, null);
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.proxySettingsChanged, new Object[0]);
                    launchActivity.F0 = null;
                }
                launchActivity.E0.remove(d2Var);
                break;
            case 10:
                yo0 yo0Var = (yo0) obj2;
                if (!((boolean[]) obj)[0]) {
                    yo0Var.run(Boolean.FALSE);
                    break;
                }
                break;
            case 11:
                a61 a61Var = (a61) obj2;
                if (!((boolean[]) obj)[0]) {
                    a61Var.c(true);
                }
                a61Var.w = null;
                break;
            case 12:
                zi1 zi1Var = (zi1) obj2;
                if (!((boolean[]) obj)[0]) {
                    zi1Var.u0.b();
                    break;
                }
                break;
            case 13:
                org.telegram.ui.web.c1 c1Var = (org.telegram.ui.web.c1) obj;
                Runnable runnable2 = (Runnable) obj2;
                if (runnable2 != null) {
                    c1Var.getClass();
                    runnable2.run();
                }
                c1Var.c0 = null;
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
                va vaVar = (va) obj2;
                if (!((AtomicBoolean) obj).get()) {
                    vaVar.run();
                    break;
                }
                break;
            default:
                wh.m4 m4Var = (wh.m4) obj2;
                if (!((boolean[]) obj)[0]) {
                    m4Var.run(Boolean.FALSE, null);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ h0(Object obj, boolean[] zArr, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = zArr;
    }
}
