package org.telegram.ui.Components;

import android.graphics.SurfaceTexture;
import android.os.Looper;
import android.view.Surface;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class zz implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ c00 b;

    public /* synthetic */ zz(c00 c00Var, int i10) {
        this.a = i10;
        this.b = c00Var;
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
                c00.b(this.b);
                break;
            default:
                c00 c00Var = this.b;
                pv pvVar = c00Var.b0;
                SurfaceTexture surfaceTexture = c00Var.w;
                h71 h71Var = (h71) pvVar.b;
                if (h71Var.a != null) {
                    h71Var.a.T(new Surface(surfaceTexture));
                    break;
                }
                break;
        }
    }
}
