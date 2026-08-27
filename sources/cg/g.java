package cg;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.webkit.JsPromptResult;
import android.widget.EditText;
import gh.z5;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.Components.ab;
import org.telegram.ui.Components.ec;
import org.telegram.ui.Components.fc0;
import org.telegram.ui.Components.mc;
import org.telegram.ui.ExternalActionActivity;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ib0;
import org.telegram.ui.lh1;
import org.telegram.ui.p41;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
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
        int i10 = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i10) {
            case 0:
                b2 b2Var = (b2) obj;
                if (!((AtomicBoolean) obj2).get()) {
                    b2Var.run();
                    break;
                }
                break;
            case 1:
                z5 z5Var = (z5) obj2;
                if (!((boolean[]) obj)[0]) {
                    z5Var.run(Boolean.FALSE, null);
                    break;
                }
                break;
            case 2:
                boolean[] zArr = (boolean[]) obj2;
                gh.i iVar = (gh.i) obj;
                if (!zArr[0]) {
                    iVar.run(Boolean.FALSE);
                    zArr[0] = true;
                    break;
                }
                break;
            case 3:
                boolean[] zArr2 = (boolean[]) obj2;
                e1 e1Var = (e1) obj;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    e1Var.run(null);
                    break;
                }
                break;
            case 4:
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
            case 5:
                org.telegram.ui.ActionBar.n2 n2Var2 = (org.telegram.ui.ActionBar.n2) obj2;
                org.telegram.ui.ActionBar.l2 l2Var = (org.telegram.ui.ActionBar.l2) obj;
                n2Var2.onPause();
                n2Var2.onFragmentDestroy();
                if (l2Var != null && (runnable = l2Var.b) != null) {
                    runnable.run();
                    break;
                }
                break;
            case 6:
                q0.a aVar = (q0.a) obj;
                if (!((AtomicBoolean) obj2).get()) {
                    aVar.accept(Boolean.FALSE);
                    break;
                }
                break;
            case 7:
                AndroidUtilities.hideKeyboard((EditText) obj2);
                AndroidUtilities.hideKeyboard((EditText) obj);
                break;
            case 8:
                ((ag.n0) obj2).run(Integer.valueOf(((fc0) obj).getValue()));
                break;
            case 9:
                ExternalActionActivity externalActionActivity = (ExternalActionActivity) obj2;
                ArrayList arrayList = ExternalActionActivity.x;
                externalActionActivity.getClass();
                externalActionActivity.setResult(1, new Intent().putExtra("error", ((TLRPC.TL_error) obj).text));
                externalActionActivity.finish();
                break;
            case 10:
                LaunchActivity launchActivity = (LaunchActivity) obj2;
                org.telegram.ui.ActionBar.b2 b2Var2 = (org.telegram.ui.ActionBar.b2) obj;
                if (b2Var2 == launchActivity.D0) {
                    ActionBarLayout actionBarLayout = launchActivity.m0;
                    org.telegram.ui.ActionBar.n2 lastFragment = actionBarLayout == null ? null : actionBarLayout.getLastFragment();
                    try {
                        String str = LocaleController.getInstance().getCurrentLocaleInfo().shortName;
                        if (lastFragment != null) {
                            ec Q = mc.a0(lastFragment).Q(R.raw.msg_translate, 36, LaunchActivity.V(R.string.ChangeLanguageLater, "ChangeLanguageLater", str.equals("en") ? launchActivity.G0 : launchActivity.F0));
                            Q.j = 5000;
                            Q.j();
                        } else {
                            ec Q2 = new mc(ab.a(launchActivity), null).Q(R.raw.msg_translate, 36, LaunchActivity.V(R.string.ChangeLanguageLater, "ChangeLanguageLater", str.equals("en") ? launchActivity.G0 : launchActivity.F0));
                            Q2.j = 5000;
                            Q2.j();
                        }
                    } catch (Exception e9) {
                        FileLog.e(e9);
                    }
                    launchActivity.D0 = null;
                } else if (b2Var2 == launchActivity.B0) {
                    MessagesController.getGlobalMainSettings();
                    SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
                    edit.putBoolean("proxy_enabled", false);
                    edit.putBoolean("proxy_enabled_calls", false);
                    edit.commit();
                    ConnectionsManager.setProxySettings(false, "", 1080, "", "", "");
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.proxySettingsChanged, new Object[0]);
                    launchActivity.B0 = null;
                }
                launchActivity.A0.remove(b2Var2);
                break;
            case 11:
                ib0 ib0Var = (ib0) obj;
                if (!((boolean[]) obj2)[0]) {
                    ib0Var.run(Boolean.FALSE);
                    break;
                }
                break;
            case 12:
                p41 p41Var = (p41) obj2;
                if (!((boolean[]) obj)[0]) {
                    p41Var.c(true);
                }
                p41Var.w = null;
                break;
            case 13:
                lh1 lh1Var = (lh1) obj2;
                if (!((boolean[]) obj)[0]) {
                    lh1Var.q0.b();
                    break;
                }
                break;
            case 14:
                org.telegram.ui.web.z0 z0Var = (org.telegram.ui.web.z0) obj;
                z0Var.getClass();
                if (!((AtomicBoolean) obj2).get()) {
                    z0Var.v("popup_closed", new JSONObject());
                }
                z0Var.V = null;
                z0Var.a0 = System.currentTimeMillis();
                break;
            case 15:
                org.telegram.ui.web.z0 z0Var2 = (org.telegram.ui.web.z0) obj2;
                Runnable runnable2 = (Runnable) obj;
                if (runnable2 != null) {
                    z0Var2.getClass();
                    runnable2.run();
                }
                z0Var2.V = null;
                break;
            case 16:
                boolean[] zArr3 = (boolean[]) obj2;
                JsPromptResult jsPromptResult = (JsPromptResult) obj;
                if (!zArr3[0]) {
                    zArr3[0] = true;
                    jsPromptResult.cancel();
                    break;
                }
                break;
            default:
                pf.u0 u0Var = (pf.u0) obj2;
                u0Var.getClass();
                if (!((boolean[]) obj)[0]) {
                    u0Var.Q();
                    break;
                }
                break;
        }
    }

    public /* synthetic */ g(org.telegram.ui.web.z0 z0Var, AtomicBoolean atomicBoolean) {
        this.a = 14;
        this.c = z0Var;
        this.b = atomicBoolean;
    }
}
