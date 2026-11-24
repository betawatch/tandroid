// default package

import java.io.File;
import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
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
                    gl.c3(new jp3(op3Var, file, b2));
                    break;
                }
                break;
            default:
                MediaController.d0(file.getAbsolutePath(), op3Var.getContext(), 0, null, null, new kp3(op3Var, (byte) 2));
                break;
        }
    }
}
