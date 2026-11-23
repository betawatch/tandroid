package hi;

import java.io.File;
import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes4.dex */
public final /* synthetic */ class q0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ v0 b;
    public final /* synthetic */ File c;

    public /* synthetic */ q0(v0 v0Var, File file, int i7) {
        this.a = i7;
        this.b = v0Var;
        this.c = file;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                v0 v0Var = this.b;
                if (v0Var.c && v0Var.r != null) {
                    MediaController.d0(this.c.getAbsolutePath(), v0Var.getContext(), 1, null, null, new r0(v0Var, 1));
                    break;
                }
                break;
            case 1:
                v0 v0Var2 = this.b;
                c7 c7Var = v0Var2.r;
                File file = this.c;
                c7Var.c(file);
                if (v0Var2.c && v0Var2.r != null) {
                    org.telegram.messenger.g0.g3(new q0(v0Var2, file, 2));
                    break;
                }
                break;
            default:
                String absolutePath = this.c.getAbsolutePath();
                v0 v0Var3 = this.b;
                MediaController.d0(absolutePath, v0Var3.getContext(), 0, null, null, new r0(v0Var3, 2));
                break;
        }
    }
}
