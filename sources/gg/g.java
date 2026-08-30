package gg;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.webkit.JsPromptResult;
import android.widget.EditText;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import kh.s5;
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
import org.telegram.ui.Components.cb;
import org.telegram.ui.Components.ic;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.vk;
import org.telegram.ui.Components.wc0;
import org.telegram.ui.ExternalActionActivity;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ai1;
import org.telegram.ui.e51;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
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
                y1 y1Var = (y1) obj;
                if (!((AtomicBoolean) obj2).get()) {
                    y1Var.run();
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
                org.telegram.ui.ActionBar.p2 p2Var = (org.telegram.ui.ActionBar.p2) obj2;
                DialogInterface.OnDismissListener onDismissListener = (DialogInterface.OnDismissListener) obj;
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
            case 3:
                org.telegram.ui.ActionBar.p2 p2Var2 = (org.telegram.ui.ActionBar.p2) obj2;
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) obj;
                p2Var2.onPause();
                p2Var2.onFragmentDestroy();
                if (n2Var != null && (runnable = n2Var.b) != null) {
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
                ((cg.h0) obj2).run(Integer.valueOf(((wc0) obj).getValue()));
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
                org.telegram.ui.ActionBar.d2 d2Var = (org.telegram.ui.ActionBar.d2) obj;
                if (d2Var == launchActivity.E0) {
                    ActionBarLayout actionBarLayout = launchActivity.n0;
                    org.telegram.ui.ActionBar.p2 lastFragment = actionBarLayout == null ? null : actionBarLayout.getLastFragment();
                    try {
                        String str = LocaleController.getInstance().getCurrentLocaleInfo().shortName;
                        if (lastFragment != null) {
                            ic Q = qc.a0(lastFragment).Q(R.raw.msg_translate, 36, LaunchActivity.V(R.string.ChangeLanguageLater, "ChangeLanguageLater", str.equals("en") ? launchActivity.H0 : launchActivity.G0));
                            Q.j = 5000;
                            Q.j();
                        } else {
                            ic Q2 = new qc(cb.a(launchActivity), null).Q(R.raw.msg_translate, 36, LaunchActivity.V(R.string.ChangeLanguageLater, "ChangeLanguageLater", str.equals("en") ? launchActivity.H0 : launchActivity.G0));
                            Q2.j = 5000;
                            Q2.j();
                        }
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                    launchActivity.E0 = null;
                } else if (d2Var == launchActivity.C0) {
                    MessagesController.getGlobalMainSettings();
                    SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
                    edit.putBoolean("proxy_enabled", false);
                    edit.putBoolean("proxy_enabled_calls", false);
                    edit.commit();
                    ConnectionsManager.setProxySettings(false, "", 1080, "", "", "");
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.proxySettingsChanged, new Object[0]);
                    launchActivity.C0 = null;
                }
                launchActivity.B0.remove(d2Var);
                break;
            case 9:
                vk vkVar = (vk) obj;
                if (!((boolean[]) obj2)[0]) {
                    vkVar.run(Boolean.FALSE);
                    break;
                }
                break;
            case 10:
                e51 e51Var = (e51) obj2;
                if (!((boolean[]) obj)[0]) {
                    e51Var.c(true);
                }
                e51Var.w = null;
                break;
            case 11:
                ai1 ai1Var = (ai1) obj2;
                if (!((boolean[]) obj)[0]) {
                    ai1Var.r0.b();
                    break;
                }
                break;
            case 12:
                org.telegram.ui.web.a1 a1Var = (org.telegram.ui.web.a1) obj;
                a1Var.getClass();
                if (!((AtomicBoolean) obj2).get()) {
                    a1Var.v("popup_closed", new JSONObject());
                }
                a1Var.W = null;
                a1Var.b0 = System.currentTimeMillis();
                break;
            case 13:
                org.telegram.ui.web.a1 a1Var2 = (org.telegram.ui.web.a1) obj2;
                Runnable runnable2 = (Runnable) obj;
                if (runnable2 != null) {
                    a1Var2.getClass();
                    runnable2.run();
                }
                a1Var2.W = null;
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
                kh.h hVar = (kh.h) obj;
                if (!zArr2[0]) {
                    hVar.run(Boolean.FALSE);
                    zArr2[0] = true;
                    break;
                }
                break;
            case 16:
                boolean[] zArr3 = (boolean[]) obj2;
                c1 c1Var = (c1) obj;
                if (!zArr3[0]) {
                    zArr3[0] = true;
                    c1Var.run(null);
                    break;
                }
                break;
            default:
                tf.u0 u0Var = (tf.u0) obj2;
                u0Var.getClass();
                if (!((boolean[]) obj)[0]) {
                    u0Var.Q();
                    break;
                }
                break;
        }
    }

    public /* synthetic */ g(org.telegram.ui.web.a1 a1Var, AtomicBoolean atomicBoolean) {
        this.a = 12;
        this.c = a1Var;
        this.b = atomicBoolean;
    }
}
