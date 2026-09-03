package org.telegram.messenger.camera;

import java.io.File;
import org.telegram.ui.Cells.b2;
import org.telegram.ui.Cells.e2;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final /* synthetic */ class i implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ i(CameraController cameraController, Object obj, boolean z4, boolean z10) {
        this.d = cameraController;
        this.e = obj;
        this.b = z4;
        this.c = z10;
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
                e2Var.a0 = false;
                e2Var.b0 = str;
                if (str == null) {
                    e2Var.b0 = "";
                }
                e2Var.c0 = this.b;
                e2Var.f(this.c, true);
                break;
        }
    }

    public /* synthetic */ i(b2 b2Var, String str, File file, boolean z4, boolean z10) {
        this.d = b2Var;
        this.e = str;
        this.b = z4;
        this.c = z10;
    }
}
