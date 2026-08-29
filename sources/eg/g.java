package eg;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.webkit.JsPromptResult;
import android.widget.EditText;
import ih.s5;
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
import org.telegram.ui.Components.hb;
import org.telegram.ui.Components.mc;
import org.telegram.ui.Components.qc0;
import org.telegram.ui.Components.tc;
import org.telegram.ui.ExternalActionActivity;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.oh1;
import org.telegram.ui.s41;
import org.telegram.ui.tm;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
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
                z1 z1Var = (z1) obj;
                if (!((AtomicBoolean) obj2).get()) {
                    z1Var.run();
                    break;
                }
                break;
            case 1:
                s5 s5Var = (s5) obj2;
                if (!((boolean[]) obj)[0]) {
                    s5Var.run(Boolean.FALSE, null);
                    break;
                }
                break;
            case 2:
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
            case 3:
                org.telegram.ui.ActionBar.o2 o2Var2 = (org.telegram.ui.ActionBar.o2) obj2;
                org.telegram.ui.ActionBar.m2 m2Var = (org.telegram.ui.ActionBar.m2) obj;
                o2Var2.onPause();
                o2Var2.onFragmentDestroy();
                if (m2Var != null && (runnable = m2Var.b) != null) {
                    runnable.run();
                    break;
                }
                break;
            case 4:
                q0.a aVar = (q0.a) obj;
                if (!((AtomicBoolean) obj2).get()) {
                    aVar.accept(Boolean.FALSE);
                    break;
                }
                break;
            case 5:
                AndroidUtilities.hideKeyboard((EditText) obj2);
                AndroidUtilities.hideKeyboard((EditText) obj);
                break;
            case 6:
                ((ag.i0) obj2).run(Integer.valueOf(((qc0) obj).getValue()));
                break;
            case 7:
                ExternalActionActivity externalActionActivity = (ExternalActionActivity) obj2;
                ArrayList arrayList = ExternalActionActivity.x;
                externalActionActivity.getClass();
                externalActionActivity.setResult(1, new Intent().putExtra("error", ((TLRPC.TL_error) obj).text));
                externalActionActivity.finish();
                break;
            case 8:
                LaunchActivity launchActivity = (LaunchActivity) obj2;
                org.telegram.ui.ActionBar.c2 c2Var = (org.telegram.ui.ActionBar.c2) obj;
                if (c2Var == launchActivity.D0) {
                    ActionBarLayout actionBarLayout = launchActivity.m0;
                    org.telegram.ui.ActionBar.o2 lastFragment = actionBarLayout == null ? null : actionBarLayout.getLastFragment();
                    try {
                        String str = LocaleController.getInstance().getCurrentLocaleInfo().shortName;
                        if (lastFragment != null) {
                            mc Q = tc.a0(lastFragment).Q(R.raw.msg_translate, 36, LaunchActivity.V(R.string.ChangeLanguageLater, "ChangeLanguageLater", str.equals("en") ? launchActivity.G0 : launchActivity.F0));
                            Q.j = 5000;
                            Q.j();
                        } else {
                            mc Q2 = new tc(hb.a(launchActivity), null).Q(R.raw.msg_translate, 36, LaunchActivity.V(R.string.ChangeLanguageLater, "ChangeLanguageLater", str.equals("en") ? launchActivity.G0 : launchActivity.F0));
                            Q2.j = 5000;
                            Q2.j();
                        }
                    } catch (Exception e10) {
                        FileLog.e(e10);
                    }
                    launchActivity.D0 = null;
                } else if (c2Var == launchActivity.B0) {
                    MessagesController.getGlobalMainSettings();
                    SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
                    edit.putBoolean("proxy_enabled", false);
                    edit.putBoolean("proxy_enabled_calls", false);
                    edit.commit();
                    ConnectionsManager.setProxySettings(false, "", 1080, "", "", "");
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.proxySettingsChanged, new Object[0]);
                    launchActivity.B0 = null;
                }
                launchActivity.A0.remove(c2Var);
                break;
            case 9:
                tm tmVar = (tm) obj;
                if (!((boolean[]) obj2)[0]) {
                    tmVar.run(Boolean.FALSE);
                    break;
                }
                break;
            case 10:
                s41 s41Var = (s41) obj2;
                if (!((boolean[]) obj)[0]) {
                    s41Var.c(true);
                }
                s41Var.w = null;
                break;
            case 11:
                oh1 oh1Var = (oh1) obj2;
                if (!((boolean[]) obj)[0]) {
                    oh1Var.q0.b();
                    break;
                }
                break;
            case 12:
                org.telegram.ui.web.z0 z0Var = (org.telegram.ui.web.z0) obj;
                z0Var.getClass();
                if (!((AtomicBoolean) obj2).get()) {
                    z0Var.v("popup_closed", new JSONObject());
                }
                z0Var.V = null;
                z0Var.a0 = System.currentTimeMillis();
                break;
            case 13:
                org.telegram.ui.web.z0 z0Var2 = (org.telegram.ui.web.z0) obj2;
                Runnable runnable2 = (Runnable) obj;
                if (runnable2 != null) {
                    z0Var2.getClass();
                    runnable2.run();
                }
                z0Var2.V = null;
                break;
            case 14:
                boolean[] zArr = (boolean[]) obj2;
                JsPromptResult jsPromptResult = (JsPromptResult) obj;
                if (!zArr[0]) {
                    zArr[0] = true;
                    jsPromptResult.cancel();
                    break;
                }
                break;
            case 15:
                boolean[] zArr2 = (boolean[]) obj2;
                ih.i iVar = (ih.i) obj;
                if (!zArr2[0]) {
                    iVar.run(Boolean.FALSE);
                    zArr2[0] = true;
                    break;
                }
                break;
            case 16:
                boolean[] zArr3 = (boolean[]) obj2;
                d1 d1Var = (d1) obj;
                if (!zArr3[0]) {
                    zArr3[0] = true;
                    d1Var.run(null);
                    break;
                }
                break;
            default:
                rf.v0 v0Var = (rf.v0) obj2;
                v0Var.getClass();
                if (!((boolean[]) obj)[0]) {
                    v0Var.Q();
                    break;
                }
                break;
        }
    }

    public /* synthetic */ g(org.telegram.ui.web.z0 z0Var, AtomicBoolean atomicBoolean) {
        this.a = 12;
        this.c = z0Var;
        this.b = atomicBoolean;
    }
}
