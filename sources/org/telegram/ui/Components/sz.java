package org.telegram.ui.Components;

import android.graphics.SurfaceTexture;
import android.os.Looper;
import android.view.Surface;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final /* synthetic */ class sz implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ vz b;

    public /* synthetic */ sz(vz vzVar, int i10) {
        this.a = i10;
        this.b = vzVar;
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
                vz.b(this.b);
                break;
            default:
                vz vzVar = this.b;
                kv kvVar = vzVar.b0;
                SurfaceTexture surfaceTexture = vzVar.w;
                u61 u61Var = (u61) kvVar.b;
                if (u61Var.a != null) {
                    u61Var.a.T(new Surface(surfaceTexture));
                    break;
                }
                break;
        }
    }
}
