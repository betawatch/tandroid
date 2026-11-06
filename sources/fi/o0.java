package fi;

import java.io.File;
import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final /* synthetic */ class o0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ t0 b;
    public final /* synthetic */ File c;

    public /* synthetic */ o0(t0 t0Var, File file, int i7) {
        this.a = i7;
        this.b = t0Var;
        this.c = file;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                t0 t0Var = this.b;
                if (t0Var.c && t0Var.r != null) {
                    MediaController.d0(this.c.getAbsolutePath(), t0Var.getContext(), 1, null, null, new p0(t0Var, 1));
                    break;
                }
                break;
            case 1:
                t0 t0Var2 = this.b;
                e7 e7Var = t0Var2.r;
                File file = this.c;
                e7Var.c(file);
                if (t0Var2.c && t0Var2.r != null) {
                    org.telegram.messenger.g0.h3(new o0(t0Var2, file, 2));
                    break;
                }
                break;
            default:
                String absolutePath = this.c.getAbsolutePath();
                t0 t0Var3 = this.b;
                MediaController.d0(absolutePath, t0Var3.getContext(), 0, null, null, new p0(t0Var3, 2));
                break;
        }
    }
}
