package dg;

import org.telegram.messenger.FileLoader;
import org.telegram.messenger.MediaController;
import org.telegram.ui.Components.a11;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class e3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ q3 b;

    public /* synthetic */ e3(q3 q3Var, int i10) {
        this.a = i10;
        this.b = q3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                q3 q3Var = this.b;
                o3 o3Var = q3Var.T;
                if (o3Var != null) {
                    if (o3Var.r != null) {
                        MediaController.getInstance().cancelVideoConvert(q3Var.T.r);
                        FileLoader.getInstance(q3Var.a).cancelFileUpload(q3Var.T.b, false);
                        q3Var.T.getClass();
                    }
                    q3Var.T.a();
                    q3Var.T = null;
                }
                q3Var.a0.a();
                q3Var.a0 = null;
                break;
            default:
                q3 q3Var2 = this.b;
                a11 a11Var = q3Var2.P;
                if (a11Var != null) {
                    q3Var2.P = null;
                    q3Var2.removeView(a11Var);
                    break;
                }
                break;
        }
    }
}
