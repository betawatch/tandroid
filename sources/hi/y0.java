package hi;

import java.io.File;
import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final /* synthetic */ class y0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ d1 b;
    public final /* synthetic */ File c;

    public /* synthetic */ y0(d1 d1Var, File file, int i7) {
        this.a = i7;
        this.b = d1Var;
        this.c = file;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                d1 d1Var = this.b;
                if (d1Var.c && d1Var.r != null) {
                    MediaController.d0(this.c.getAbsolutePath(), d1Var.getContext(), 1, null, null, new z0(d1Var, 1));
                    break;
                }
                break;
            case 1:
                d1 d1Var2 = this.b;
                x7 x7Var = d1Var2.r;
                File file = this.c;
                x7Var.c(file);
                if (d1Var2.c && d1Var2.r != null) {
                    org.telegram.messenger.g0.g3(new y0(d1Var2, file, 2));
                    break;
                }
                break;
            default:
                String absolutePath = this.c.getAbsolutePath();
                d1 d1Var3 = this.b;
                MediaController.d0(absolutePath, d1Var3.getContext(), 0, null, null, new z0(d1Var3, 2));
                break;
        }
    }
}
