package nh;

import java.io.File;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final /* synthetic */ class p0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ u0 b;
    public final /* synthetic */ File c;

    public /* synthetic */ p0(u0 u0Var, File file, int i10) {
        this.a = i10;
        this.b = u0Var;
        this.c = file;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                u0 u0Var = this.b;
                if (u0Var.c && u0Var.r != null) {
                    MediaController.saveFile(this.c.getAbsolutePath(), u0Var.getContext(), 1, null, null, new q0(u0Var, 1), false);
                    break;
                }
                break;
            case 1:
                u0 u0Var2 = this.b;
                o7 o7Var = u0Var2.r;
                File file = this.c;
                o7Var.c(file);
                if (u0Var2.c && u0Var2.r != null) {
                    AndroidUtilities.runOnUIThread(new p0(u0Var2, file, 2));
                    break;
                }
                break;
            default:
                String absolutePath = this.c.getAbsolutePath();
                u0 u0Var3 = this.b;
                MediaController.saveFile(absolutePath, u0Var3.getContext(), 0, null, null, new q0(u0Var3, 2), false);
                break;
        }
    }
}
