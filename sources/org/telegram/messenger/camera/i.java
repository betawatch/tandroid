package org.telegram.messenger.camera;

import java.io.File;
import org.telegram.ui.Cells.a2;
import org.telegram.ui.Cells.d2;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
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
                a2 a2Var = (a2) this.d;
                String str = (String) this.e;
                d2 d2Var = a2Var.b;
                d2Var.a0 = false;
                d2Var.b0 = str;
                if (str == null) {
                    d2Var.b0 = "";
                }
                d2Var.c0 = this.b;
                d2Var.f(this.c, true);
                break;
        }
    }

    public /* synthetic */ i(a2 a2Var, String str, File file, boolean z4, boolean z10) {
        this.d = a2Var;
        this.e = str;
        this.b = z4;
        this.c = z10;
    }
}
