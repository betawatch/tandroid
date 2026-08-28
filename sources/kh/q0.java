package kh;

import java.io.File;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final /* synthetic */ class q0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ v0 b;
    public final /* synthetic */ File c;

    public /* synthetic */ q0(v0 v0Var, File file, int i9) {
        this.a = i9;
        this.b = v0Var;
        this.c = file;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                v0 v0Var = this.b;
                if (v0Var.c && v0Var.r != null) {
                    MediaController.saveFile(this.c.getAbsolutePath(), v0Var.getContext(), 1, null, null, new r0(v0Var, 1), false);
                    break;
                }
                break;
            case 1:
                v0 v0Var2 = this.b;
                a8 a8Var = v0Var2.r;
                File file = this.c;
                a8Var.c(file);
                if (v0Var2.c && v0Var2.r != null) {
                    AndroidUtilities.runOnUIThread(new q0(v0Var2, file, 2));
                    break;
                }
                break;
            default:
                String absolutePath = this.c.getAbsolutePath();
                v0 v0Var3 = this.b;
                MediaController.saveFile(absolutePath, v0Var3.getContext(), 0, null, null, new r0(v0Var3, 2), false);
                break;
        }
    }
}
