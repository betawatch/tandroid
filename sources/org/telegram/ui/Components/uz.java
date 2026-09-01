package org.telegram.ui.Components;

import android.graphics.SurfaceTexture;
import android.os.Looper;
import android.view.Surface;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class uz implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ xz b;

    public /* synthetic */ uz(xz xzVar, int i10) {
        this.a = i10;
        this.b = xzVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.finish();
                Looper myLooper = Looper.myLooper();
                if (myLooper != null) {
                    myLooper.quit();
                    break;
                }
                break;
            case 1:
                xz.b(this.b);
                break;
            default:
                xz xzVar = this.b;
                hv hvVar = xzVar.Y;
                SurfaceTexture surfaceTexture = xzVar.w;
                y61 y61Var = (y61) hvVar.b;
                if (y61Var.a != null) {
                    y61Var.a.T(new Surface(surfaceTexture));
                    break;
                }
                break;
        }
    }
}
