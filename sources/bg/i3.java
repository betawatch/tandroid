package bg;

import org.telegram.messenger.FileLoader;
import org.telegram.messenger.MediaController;
import org.telegram.ui.Components.p01;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class i3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ u3 b;

    public /* synthetic */ i3(u3 u3Var, int i10) {
        this.a = i10;
        this.b = u3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                u3 u3Var = this.b;
                s3 s3Var = u3Var.S;
                if (s3Var != null) {
                    if (s3Var.r != null) {
                        MediaController.getInstance().cancelVideoConvert(u3Var.S.r);
                        FileLoader.getInstance(u3Var.a).cancelFileUpload(u3Var.S.b, false);
                        u3Var.S.getClass();
                    }
                    u3Var.S.a();
                    u3Var.S = null;
                }
                u3Var.W.a();
                u3Var.W = null;
                break;
            default:
                u3 u3Var2 = this.b;
                p01 p01Var = u3Var2.O;
                if (p01Var != null) {
                    u3Var2.O = null;
                    u3Var2.removeView(p01Var);
                    break;
                }
                break;
        }
    }
}
