package org.telegram.messenger.camera;

import java.io.File;
import org.telegram.ui.Cells.b2;
import org.telegram.ui.Cells.e2;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class i implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ i(CameraController cameraController, Object obj, boolean z10, boolean z11) {
        this.d = cameraController;
        this.e = obj;
        this.b = z10;
        this.c = z11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ((CameraController) this.d).lambda$stopVideoRecording$17(this.e, this.b, this.c);
                break;
            default:
                b2 b2Var = (b2) this.d;
                String str = (String) this.e;
                e2 e2Var = b2Var.b;
                e2Var.W = false;
                e2Var.a0 = str;
                if (str == null) {
                    e2Var.a0 = "";
                }
                e2Var.b0 = this.b;
                e2Var.f(this.c, true);
                break;
        }
    }

    public /* synthetic */ i(b2 b2Var, String str, File file, boolean z10, boolean z11) {
        this.d = b2Var;
        this.e = str;
        this.b = z10;
        this.c = z11;
    }
}
