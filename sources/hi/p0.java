package hi;

import java.io.File;
import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class p0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ u0 b;
    public final /* synthetic */ File c;

    public /* synthetic */ p0(u0 u0Var, File file, int i7) {
        this.a = i7;
        this.b = u0Var;
        this.c = file;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                u0 u0Var = this.b;
                if (u0Var.c && u0Var.r != null) {
                    MediaController.d0(this.c.getAbsolutePath(), u0Var.getContext(), 1, null, null, new q0(u0Var, 1));
                    break;
                }
                break;
            case 1:
                u0 u0Var2 = this.b;
                d7 d7Var = u0Var2.r;
                File file = this.c;
                d7Var.c(file);
                if (u0Var2.c && u0Var2.r != null) {
                    org.telegram.messenger.g0.h3(new p0(u0Var2, file, 2));
                    break;
                }
                break;
            default:
                String absolutePath = this.c.getAbsolutePath();
                u0 u0Var3 = this.b;
                MediaController.d0(absolutePath, u0Var3.getContext(), 0, null, null, new q0(u0Var3, 2));
                break;
        }
    }
}
