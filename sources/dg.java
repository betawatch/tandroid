// default package

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.webkit.JsPromptResult;
import android.widget.EditText;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.ExternalActionActivity;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class dg implements DialogInterface.OnDismissListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ dg(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        Runnable runnable;
        rrc rrcVar;
        byte b = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                gm.t1((EditText) obj2);
                gm.t1((EditText) obj);
                break;
            case 1:
                gu2 gu2Var = (gu2) obj;
                if (!((AtomicBoolean) obj2).get()) {
                    gu2Var.accept(Boolean.FALSE);
                    break;
                }
                break;
            case 2:
                d dVar = (d) obj2;
                DialogInterface.OnDismissListener onDismissListener = (DialogInterface.OnDismissListener) obj;
                if (onDismissListener != null) {
                    onDismissListener.onDismiss(dialogInterface);
                }
                dVar.onDialogDismiss((Dialog) dialogInterface);
                if (dialogInterface == dVar.visibleDialog) {
                    dVar.visibleDialog = null;
                    break;
                }
                break;
            case 3:
                d dVar2 = (d) obj2;
                bh0 bh0Var = (bh0) obj;
                dVar2.onPause();
                dVar2.onFragmentDestroy();
                if (bh0Var != null && (runnable = bh0Var.b) != null) {
                    runnable.run();
                    break;
                }
                break;
            case 4:
                fu fuVar = (fu) obj;
                if (!((AtomicBoolean) obj2).get()) {
                    fuVar.run();
                    break;
                }
                break;
            case 5:
                boolean[] zArr = (boolean[]) obj2;
                jv0 jv0Var = (jv0) obj;
                if (!zArr[0]) {
                    jv0Var.a(Boolean.FALSE);
                    zArr[0] = true;
                    break;
                }
                break;
            case 6:
                boolean[] zArr2 = (boolean[]) obj2;
                hv0 hv0Var = (hv0) obj;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    hv0Var.a(null);
                    break;
                }
                break;
            case 7:
                ((Runnable) obj).run();
                ((qw0) obj2).d0 = null;
                break;
            case 8:
                boolean[] zArr3 = (boolean[]) obj2;
                JsPromptResult jsPromptResult = (JsPromptResult) obj;
                if (!zArr3[0]) {
                    zArr3[0] = true;
                    jsPromptResult.cancel();
                    break;
                }
                break;
            case 9:
                ExternalActionActivity externalActionActivity = (ExternalActionActivity) obj2;
                ArrayList arrayList = ExternalActionActivity.y;
                externalActionActivity.setResult(1, new Intent().putExtra("error", ((TLRPC.TL_error) obj).text));
                externalActionActivity.finish();
                break;
            case 10:
                LaunchActivity launchActivity = (LaunchActivity) obj2;
                he heVar = (he) obj;
                String str = LaunchActivity.C1;
                if (heVar == launchActivity.G0) {
                    ActionBarLayout actionBarLayout = launchActivity.p0;
                    d lastFragment = actionBarLayout == null ? null : actionBarLayout.getLastFragment();
                    try {
                        String str2 = jb6.D0().B.c;
                        if (lastFragment != null) {
                            u31 Q = c41.b0(lastFragment).Q(R.raw.msg_translate, 36, LaunchActivity.T(2131752498, "ChangeLanguageLater", str2.equals("en") ? launchActivity.J0 : launchActivity.I0));
                            Q.j = 5000;
                            Q.j();
                        } else {
                            u31 Q2 = new c41(n21.a(launchActivity), null).Q(R.raw.msg_translate, 36, LaunchActivity.T(2131752498, "ChangeLanguageLater", str2.equals("en") ? launchActivity.J0 : launchActivity.I0));
                            Q2.j = 5000;
                            Q2.j();
                        }
                    } catch (Exception e) {
                        fc4.g(e, true);
                    }
                    launchActivity.G0 = null;
                } else if (heVar == launchActivity.E0) {
                    oc7.d1();
                    SharedPreferences.Editor edit = oc7.d1().edit();
                    edit.putBoolean("proxy_enabled", false);
                    edit.commit();
                    ConnectionsManager.setProxySettings(false, null);
                    nm7.e().k(nm7.E4, new Object[0]);
                    launchActivity.E0 = null;
                }
                launchActivity.D0.remove(heVar);
                break;
            case 11:
                k17 k17Var = (k17) obj2;
                if (!((boolean[]) obj)[0]) {
                    k17Var.Q();
                    break;
                }
                break;
            case 12:
                ho1 ho1Var = (ho1) obj;
                if (!((boolean[]) obj2)[0]) {
                    ho1Var.run();
                    break;
                }
                break;
            case 13:
                a28 a28Var = (a28) obj;
                if (!((boolean[]) obj2)[0]) {
                    a28Var.a(Boolean.FALSE);
                    break;
                }
                break;
            case 14:
                ly9 ly9Var = (ly9) obj2;
                if (!((boolean[]) obj)[0]) {
                    ly9Var.a(true);
                }
                ly9Var.x = null;
                break;
            case 15:
                ((boolean[]) obj2)[0] = true;
                Runnable runnable2 = ((Runnable[]) obj)[0];
                if (runnable2 != null) {
                    runnable2.run();
                    break;
                }
                break;
            case 16:
                y2a y2aVar = (y2a) obj2;
                if (!((boolean[]) obj)[0]) {
                    y2aVar.a(Boolean.FALSE, null);
                    break;
                }
                break;
            case 17:
                iic iicVar = (iic) obj2;
                if (!((boolean[]) obj)[0]) {
                    iicVar.u0.b();
                    break;
                }
                break;
            default:
                TLRPC.User user = (TLRPC.User) obj2;
                TL_wallet.walletTransactionPeerUser wallettransactionpeeruser = (TL_wallet.walletTransactionPeerUser) obj;
                d S = LaunchActivity.S();
                if (S != null) {
                    if (user != null) {
                        rrcVar = new rrc(user);
                    } else {
                        rrcVar = new rrc(wallettransactionpeeruser.address);
                        rrcVar.A0(wallettransactionpeeruser.domain);
                    }
                    S.presentFragment(rrcVar);
                    break;
                }
                break;
        }
    }
}
