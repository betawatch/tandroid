// default package

import java.io.File;
import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes3.dex */
public final /* synthetic */ class aq3 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ fq3 b;
    public final /* synthetic */ File c;

    public /* synthetic */ aq3(fq3 fq3Var, File file, byte b) {
        this.a = b;
        this.b = fq3Var;
        this.c = file;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        byte b2 = 2;
        File file = this.c;
        fq3 fq3Var = this.b;
        switch (b) {
            case 0:
                if (fq3Var.c && fq3Var.r != null) {
                    MediaController.g0(file.getAbsolutePath(), fq3Var.getContext(), 1, null, null, new bq3(fq3Var, (byte) 1));
                    break;
                }
                break;
            case 1:
                fq3Var.r.c(file);
                if (fq3Var.c && fq3Var.r != null) {
                    hl.c3(new aq3(fq3Var, file, b2));
                    break;
                }
                break;
            default:
                MediaController.g0(file.getAbsolutePath(), fq3Var.getContext(), 0, null, null, new bq3(fq3Var, (byte) 2));
                break;
        }
    }
}
