package bi;

import java.io.File;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final /* synthetic */ class t0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ y0 b;
    public final /* synthetic */ File c;

    public /* synthetic */ t0(y0 y0Var, File file, int i10) {
        this.a = i10;
        this.b = y0Var;
        this.c = file;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                y0 y0Var = this.b;
                if (y0Var.c && y0Var.r != null) {
                    MediaController.saveFile(this.c.getAbsolutePath(), y0Var.getContext(), 1, null, null, new u0(y0Var, 1), false);
                    break;
                }
                break;
            case 1:
                y0 y0Var2 = this.b;
                r9 r9Var = y0Var2.r;
                File file = this.c;
                r9Var.c(file);
                if (y0Var2.c && y0Var2.r != null) {
                    AndroidUtilities.runOnUIThread(new t0(y0Var2, file, 2));
                    break;
                }
                break;
            default:
                String absolutePath = this.c.getAbsolutePath();
                y0 y0Var3 = this.b;
                MediaController.saveFile(absolutePath, y0Var3.getContext(), 0, null, null, new u0(y0Var3, 2), false);
                break;
        }
    }
}
