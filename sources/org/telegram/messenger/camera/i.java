package org.telegram.messenger.camera;

import java.io.File;
import org.telegram.ui.Cells.a2;
import org.telegram.ui.Cells.d2;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
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
                a2 a2Var = (a2) this.d;
                String str = (String) this.e;
                d2 d2Var = a2Var.b;
                d2Var.W = false;
                d2Var.a0 = str;
                if (str == null) {
                    d2Var.a0 = "";
                }
                d2Var.b0 = this.b;
                d2Var.f(this.c, true);
                break;
        }
    }

    public /* synthetic */ i(a2 a2Var, String str, File file, boolean z10, boolean z11) {
        this.d = a2Var;
        this.e = str;
        this.b = z10;
        this.c = z11;
    }
}
