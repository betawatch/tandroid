// default package

import java.io.File;
import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class jp3 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ op3 b;
    public final /* synthetic */ File c;

    public /* synthetic */ jp3(op3 op3Var, File file, byte b) {
        this.a = b;
        this.b = op3Var;
        this.c = file;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        byte b2 = 2;
        File file = this.c;
        op3 op3Var = this.b;
        switch (b) {
            case 0:
                if (op3Var.c && op3Var.r != null) {
                    MediaController.d0(file.getAbsolutePath(), op3Var.getContext(), 1, null, null, new kp3(op3Var, (byte) 1));
                    break;
                }
                break;
            case 1:
                op3Var.r.c(file);
                if (op3Var.c && op3Var.r != null) {
                    gl.d3(new jp3(op3Var, file, b2));
                    break;
                }
                break;
            default:
                MediaController.d0(file.getAbsolutePath(), op3Var.getContext(), 0, null, null, new kp3(op3Var, (byte) 2));
                break;
        }
    }
}
