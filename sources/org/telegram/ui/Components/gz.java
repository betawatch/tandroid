package org.telegram.ui.Components;

import android.graphics.SurfaceTexture;
import android.os.Looper;
import android.view.Surface;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class gz implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ jz b;

    public /* synthetic */ gz(jz jzVar, int i10) {
        this.a = i10;
        this.b = jzVar;
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
                jz.b(this.b);
                break;
            default:
                jz jzVar = this.b;
                vu vuVar = jzVar.X;
                SurfaceTexture surfaceTexture = jzVar.w;
                a61 a61Var = (a61) vuVar.b;
                if (a61Var.a != null) {
                    a61Var.a.U(new Surface(surfaceTexture));
                    break;
                }
                break;
        }
    }
}
