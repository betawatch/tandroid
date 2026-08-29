package org.telegram.ui.Components;

import android.graphics.SurfaceTexture;
import android.os.Looper;
import android.view.Surface;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class nz implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ qz b;

    public /* synthetic */ nz(qz qzVar, int i10) {
        this.a = i10;
        this.b = qzVar;
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
                qz.b(this.b);
                break;
            default:
                qz qzVar = this.b;
                cv cvVar = qzVar.X;
                SurfaceTexture surfaceTexture = qzVar.w;
                l61 l61Var = (l61) cvVar.b;
                if (l61Var.a != null) {
                    l61Var.a.U(new Surface(surfaceTexture));
                    break;
                }
                break;
        }
    }
}
