package org.telegram.ui.Components;

import android.graphics.SurfaceTexture;
import android.os.Looper;
import android.view.Surface;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes3.dex */
public final /* synthetic */ class vz implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ yz b;

    public /* synthetic */ vz(yz yzVar, int i10) {
        this.a = i10;
        this.b = yzVar;
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
                yz.b(this.b);
                break;
            default:
                yz yzVar = this.b;
                pv pvVar = yzVar.b0;
                SurfaceTexture surfaceTexture = yzVar.w;
                u71 u71Var = (u71) pvVar.b;
                if (u71Var.a != null) {
                    u71Var.a.T(new Surface(surfaceTexture));
                    break;
                }
                break;
        }
    }
}
