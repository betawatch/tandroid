package ai;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.r2;
import org.telegram.ui.Components.wc;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final /* synthetic */ class j0 implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ String b;
    public final /* synthetic */ Utilities.Callback c;
    public final /* synthetic */ r2 d;

    public /* synthetic */ j0(String str, Utilities.Callback callback, r2 r2Var) {
        this.b = str;
        this.c = callback;
        this.d = r2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                String str = this.b;
                Utilities.Callback callback = this.c;
                r2 r2Var = this.d;
                o0.p(r2Var, 0, new j0(str, callback, r2Var));
                break;
            default:
                String str2 = this.b;
                if (str2 == null) {
                    wc.b0(this.d).N(LocaleController.getString(R.string.ScanQrCode), LocaleController.getString(R.string.ErrorOccurred)).j();
                    break;
                } else {
                    this.c.run(str2);
                    break;
                }
        }
    }

    public /* synthetic */ j0(r2 r2Var, String str, Utilities.Callback callback) {
        this.d = r2Var;
        this.b = str;
        this.c = callback;
    }
}
