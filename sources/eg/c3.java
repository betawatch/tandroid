package eg;

import org.telegram.messenger.FileLoader;
import org.telegram.messenger.MediaController;
import org.telegram.ui.Components.b11;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class c3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ o3 b;

    public /* synthetic */ c3(o3 o3Var, int i10) {
        this.a = i10;
        this.b = o3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                o3 o3Var = this.b;
                m3 m3Var = o3Var.T;
                if (m3Var != null) {
                    if (m3Var.r != null) {
                        MediaController.getInstance().cancelVideoConvert(o3Var.T.r);
                        FileLoader.getInstance(o3Var.a).cancelFileUpload(o3Var.T.b, false);
                        o3Var.T.getClass();
                    }
                    o3Var.T.a();
                    o3Var.T = null;
                }
                o3Var.a0.a();
                o3Var.a0 = null;
                break;
            default:
                o3 o3Var2 = this.b;
                b11 b11Var = o3Var2.P;
                if (b11Var != null) {
                    o3Var2.P = null;
                    o3Var2.removeView(b11Var);
                    break;
                }
                break;
        }
    }
}
