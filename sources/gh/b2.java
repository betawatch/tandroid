package gh;

import android.app.Dialog;
import android.text.TextUtils;
import java.io.Serializable;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.tk0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class b2 implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Dialog b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Serializable d;
    public final /* synthetic */ Object e;

    public /* synthetic */ b2(Dialog dialog, Object obj, Serializable serializable, Object obj2, int i9) {
        this.a = i9;
        this.b = dialog;
        this.c = obj;
        this.d = serializable;
        this.e = obj2;
    }

    @Override // org.telegram.messenger.Utilities.Callback2
    public final void run(Object obj, Object obj2) {
        int i9 = this.a;
        Object obj3 = this.e;
        Serializable serializable = this.d;
        Object obj4 = this.c;
        Dialog dialog = this.b;
        switch (i9) {
            case 0:
                k5.b0((k5) dialog, (Utilities.Callback2) obj4, (ArrayList) serializable, (Runnable) obj3, (TLRPC.Updates) obj, (TLRPC.TL_error) obj2);
                break;
            default:
                org.telegram.ui.ActionBar.f3 f3Var = (org.telegram.ui.ActionBar.f3) obj4;
                String str = (String) serializable;
                org.telegram.ui.ActionBar.b6 b6Var = (org.telegram.ui.ActionBar.b6) obj3;
                ((org.telegram.ui.ActionBar.c2) dialog).dismiss();
                if (!(((TLRPC.Bool) obj) instanceof TLRPC.TL_boolTrue)) {
                    org.telegram.ui.ActionBar.f3 f3Var2 = tk0.a;
                    if (f3Var2 != null) {
                        f3Var2.dismiss();
                        tk0.a = null;
                    }
                    tk0.a().M(LocaleController.getString(R.string.BotAuthLoggedInFailTitle), TextUtils.isEmpty(str) ? LocaleController.getString(R.string.BotAuthLoggedInFailNoDomain) : AndroidUtilities.replaceSingleLinkBold(LocaleController.formatString(R.string.BotAuthLoggedInFail, str), org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.Gi, b6Var)), R.raw.error).j();
                    break;
                } else {
                    tk0.a = f3Var;
                    f3Var.show();
                    break;
                }
        }
    }
}
