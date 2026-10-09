package ci;

import java.io.File;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final /* synthetic */ class o0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ t0 b;
    public final /* synthetic */ File c;

    public /* synthetic */ o0(t0 t0Var, File file, int i10) {
        this.a = i10;
        this.b = t0Var;
        this.c = file;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                t0 t0Var = this.b;
                if (t0Var.c && t0Var.r != null) {
                    MediaController.saveFile(this.c.getAbsolutePath(), t0Var.getContext(), 1, null, null, new p0(t0Var, 1), false);
                    break;
                }
                break;
            case 1:
                t0 t0Var2 = this.b;
                l8 l8Var = t0Var2.r;
                File file = this.c;
                l8Var.c(file);
                if (t0Var2.c && t0Var2.r != null) {
                    AndroidUtilities.runOnUIThread(new o0(t0Var2, file, 2));
                    break;
                }
                break;
            default:
                String absolutePath = this.c.getAbsolutePath();
                t0 t0Var3 = this.b;
                MediaController.saveFile(absolutePath, t0Var3.getContext(), 0, null, null, new p0(t0Var3, 2), false);
                break;
        }
    }
}
