package bg;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.webkit.JsPromptResult;
import android.widget.EditText;
import fh.h6;
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
import org.telegram.ui.Components.bc0;
import org.telegram.ui.Components.cb;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.oc;
import org.telegram.ui.ExternalActionActivity;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.eb0;
import org.telegram.ui.mh1;
import org.telegram.ui.q41;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class j implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ j(int i9, Object obj, Object obj2) {
        this.a = i9;
        this.b = obj;
        this.c = obj2;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        Runnable runnable;
        int i9 = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i9) {
            case 0:
                i2 i2Var = (i2) obj;
                if (!((AtomicBoolean) obj2).get()) {
                    i2Var.run();
                    break;
                }
                break;
            case 1:
                h6 h6Var = (h6) obj2;
                if (!((boolean[]) obj)[0]) {
                    h6Var.run(Boolean.FALSE, null);
                    break;
                }
                break;
            case 2:
                boolean[] zArr = (boolean[]) obj2;
                fh.i iVar = (fh.i) obj;
                if (!zArr[0]) {
                    iVar.run(Boolean.FALSE);
                    zArr[0] = true;
                    break;
                }
                break;
            case 3:
                boolean[] zArr2 = (boolean[]) obj2;
                j1 j1Var = (j1) obj;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    j1Var.run(null);
                    break;
                }
                break;
            case 4:
                of.f1 f1Var = (of.f1) obj2;
                f1Var.getClass();
                if (!((boolean[]) obj)[0]) {
                    f1Var.Q();
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
                ((i) obj2).run(Integer.valueOf(((bc0) obj).getValue()));
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
                if (c2Var == launchActivity.D0) {
                    ActionBarLayout actionBarLayout = launchActivity.m0;
                    org.telegram.ui.ActionBar.o2 lastFragment = actionBarLayout == null ? null : actionBarLayout.getLastFragment();
                    try {
                        String str = LocaleController.getInstance().getCurrentLocaleInfo().shortName;
                        if (lastFragment != null) {
                            gc Q = oc.a0(lastFragment).Q(R.raw.msg_translate, 36, LaunchActivity.V(R.string.ChangeLanguageLater, "ChangeLanguageLater", str.equals("en") ? launchActivity.G0 : launchActivity.F0));
                            Q.j = 5000;
                            Q.j();
                        } else {
                            gc Q2 = new oc(cb.a(launchActivity), null).Q(R.raw.msg_translate, 36, LaunchActivity.V(R.string.ChangeLanguageLater, "ChangeLanguageLater", str.equals("en") ? launchActivity.G0 : launchActivity.F0));
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
            case 12:
                eb0 eb0Var = (eb0) obj;
                if (!((boolean[]) obj2)[0]) {
                    eb0Var.run(Boolean.FALSE);
                    break;
                }
                break;
            case 13:
                q41 q41Var = (q41) obj2;
                if (!((boolean[]) obj)[0]) {
                    q41Var.c(true);
                }
                q41Var.w = null;
                break;
            case 14:
                mh1 mh1Var = (mh1) obj2;
                if (!((boolean[]) obj)[0]) {
                    mh1Var.q0.b();
                    break;
                }
                break;
            case 15:
                org.telegram.ui.web.y0 y0Var = (org.telegram.ui.web.y0) obj;
                y0Var.getClass();
                if (!((AtomicBoolean) obj2).get()) {
                    y0Var.v("popup_closed", new JSONObject());
                }
                y0Var.V = null;
                y0Var.a0 = System.currentTimeMillis();
                break;
            case 16:
                org.telegram.ui.web.y0 y0Var2 = (org.telegram.ui.web.y0) obj2;
                Runnable runnable2 = (Runnable) obj;
                if (runnable2 != null) {
                    y0Var2.getClass();
                    runnable2.run();
                }
                y0Var2.V = null;
                break;
            default:
                boolean[] zArr3 = (boolean[]) obj2;
                JsPromptResult jsPromptResult = (JsPromptResult) obj;
                if (!zArr3[0]) {
                    zArr3[0] = true;
                    jsPromptResult.cancel();
                    break;
                }
                break;
        }
    }

    public /* synthetic */ j(org.telegram.ui.web.y0 y0Var, AtomicBoolean atomicBoolean) {
        this.a = 15;
        this.c = y0Var;
        this.b = atomicBoolean;
    }
}
