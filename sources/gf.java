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
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.ExternalActionActivity;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class gf implements DialogInterface.OnDismissListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ gf(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        Runnable runnable;
        euc eucVar;
        byte b = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                hl.t1((EditText) obj2);
                hl.t1((EditText) obj);
                break;
            case 1:
                pt2 pt2Var = (pt2) obj;
                if (!((AtomicBoolean) obj2).get()) {
                    pt2Var.accept(Boolean.FALSE);
                    break;
                }
                break;
            case 2:
                e eVar = (e) obj2;
                DialogInterface.OnDismissListener onDismissListener = (DialogInterface.OnDismissListener) obj;
                if (onDismissListener != null) {
                    onDismissListener.onDismiss(dialogInterface);
                }
                eVar.onDialogDismiss((Dialog) dialogInterface);
                if (dialogInterface == eVar.visibleDialog) {
                    eVar.visibleDialog = null;
                    break;
                }
                break;
            case 3:
                e eVar2 = (e) obj2;
                bg0 bg0Var = (bg0) obj;
                eVar2.onPause();
                eVar2.onFragmentDestroy();
                if (bg0Var != null && (runnable = bg0Var.b) != null) {
                    runnable.run();
                    break;
                }
                break;
            case 4:
                kt ktVar = (kt) obj;
                if (!((AtomicBoolean) obj2).get()) {
                    ktVar.run();
                    break;
                }
                break;
            case 5:
                boolean[] zArr = (boolean[]) obj2;
                ku0 ku0Var = (ku0) obj;
                if (!zArr[0]) {
                    ku0Var.a(Boolean.FALSE);
                    zArr[0] = true;
                    break;
                }
                break;
            case 6:
                boolean[] zArr2 = (boolean[]) obj2;
                hu0 hu0Var = (hu0) obj;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    hu0Var.a(null);
                    break;
                }
                break;
            case 7:
                ((Runnable) obj).run();
                ((rv0) obj2).d0 = null;
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
                id idVar = (id) obj;
                String str = LaunchActivity.C1;
                if (idVar == launchActivity.G0) {
                    ActionBarLayout actionBarLayout = launchActivity.p0;
                    e lastFragment = actionBarLayout == null ? null : actionBarLayout.getLastFragment();
                    try {
                        String str2 = ob6.D0().B.c;
                        if (lastFragment != null) {
                            v21 Q = d31.b0(lastFragment).Q(R.raw.msg_translate, 36, LaunchActivity.T(2131752526, "ChangeLanguageLater", str2.equals("en") ? launchActivity.J0 : launchActivity.I0));
                            Q.j = 5000;
                            Q.j();
                        } else {
                            v21 Q2 = new d31(o11.a(launchActivity), null).Q(R.raw.msg_translate, 36, LaunchActivity.T(2131752526, "ChangeLanguageLater", str2.equals("en") ? launchActivity.J0 : launchActivity.I0));
                            Q2.j = 5000;
                            Q2.j();
                        }
                    } catch (Exception e) {
                        cc4.g(e, true);
                    }
                    launchActivity.G0 = null;
                } else if (idVar == launchActivity.E0) {
                    uc7.e1();
                    SharedPreferences.Editor edit = uc7.e1().edit();
                    edit.putBoolean("proxy_enabled", false);
                    edit.commit();
                    ConnectionsManager.setProxySettings(false, null);
                    jn7.e().k(jn7.D4, new Object[0]);
                    launchActivity.E0 = null;
                }
                launchActivity.D0.remove(idVar);
                break;
            case 11:
                r17 r17Var = (r17) obj2;
                if (!((boolean[]) obj)[0]) {
                    r17Var.Q();
                    break;
                }
                break;
            case 12:
                gn1 gn1Var = (gn1) obj;
                if (!((boolean[]) obj2)[0]) {
                    gn1Var.run();
                    break;
                }
                break;
            case 13:
                d38 d38Var = (d38) obj;
                if (!((boolean[]) obj2)[0]) {
                    d38Var.a(Boolean.FALSE);
                    break;
                }
                break;
            case 14:
                c0a c0aVar = (c0a) obj2;
                if (!((boolean[]) obj)[0]) {
                    c0aVar.a(true);
                }
                c0aVar.x = null;
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
                p4a p4aVar = (p4a) obj2;
                if (!((boolean[]) obj)[0]) {
                    p4aVar.a(Boolean.FALSE, null);
                    break;
                }
                break;
            case 17:
                mkc mkcVar = (mkc) obj2;
                if (!((boolean[]) obj)[0]) {
                    mkcVar.u0.b();
                    break;
                }
                break;
            default:
                TLRPC.User user = (TLRPC.User) obj2;
                TL_wallet.walletTransactionPeerUser wallettransactionpeeruser = (TL_wallet.walletTransactionPeerUser) obj;
                e S = LaunchActivity.S();
                if (S != null) {
                    if (user != null) {
                        eucVar = new euc(user);
                    } else {
                        eucVar = new euc(wallettransactionpeeruser.address);
                        eucVar.A0(wallettransactionpeeruser.domain);
                    }
                    S.presentFragment(eucVar);
                    break;
                }
                break;
        }
    }
}
