package org.telegram.ui.Components;

import android.graphics.SurfaceTexture;
import android.os.Looper;
import android.view.Surface;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class zy implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ cz b;

    public /* synthetic */ zy(cz czVar, int i7) {
        this.a = i7;
        this.b = czVar;
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
                cz.a(this.b);
                break;
            default:
                cz czVar = this.b;
                iy iyVar = czVar.c0;
                SurfaceTexture surfaceTexture = czVar.x;
                v51 v51Var = (v51) iyVar.b;
                if (v51Var.a != null) {
                    v51Var.a.y0(new Surface(surfaceTexture));
                    break;
                }
                break;
        }
    }
}
