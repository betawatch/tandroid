package org.telegram.ui.Components;

import android.graphics.SurfaceTexture;
import android.os.Looper;
import android.view.Surface;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
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
                t71 t71Var = (t71) pvVar.b;
                if (t71Var.a != null) {
                    t71Var.a.T(new Surface(surfaceTexture));
                    break;
                }
                break;
        }
    }
}
