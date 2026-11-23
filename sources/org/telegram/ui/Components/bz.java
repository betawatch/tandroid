package org.telegram.ui.Components;

import android.graphics.SurfaceTexture;
import android.os.Looper;
import android.view.Surface;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class bz implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ez b;

    public /* synthetic */ bz(ez ezVar, int i7) {
        this.a = i7;
        this.b = ezVar;
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
                ez.a(this.b);
                break;
            default:
                ez ezVar = this.b;
                ky kyVar = ezVar.c0;
                SurfaceTexture surfaceTexture = ezVar.x;
                y51 y51Var = (y51) kyVar.b;
                if (y51Var.a != null) {
                    y51Var.a.y0(new Surface(surfaceTexture));
                    break;
                }
                break;
        }
    }
}
