package org.telegram.ui.Components;

import android.graphics.SurfaceTexture;
import android.os.Looper;
import android.view.Surface;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class py implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ sy b;

    public /* synthetic */ py(sy syVar, int i7) {
        this.a = i7;
        this.b = syVar;
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
                sy.a(this.b);
                break;
            default:
                sy syVar = this.b;
                bx bxVar = syVar.b0;
                SurfaceTexture surfaceTexture = syVar.x;
                i51 i51Var = (i51) bxVar.b;
                if (i51Var.a != null) {
                    i51Var.a.y0(new Surface(surfaceTexture));
                    break;
                }
                break;
        }
    }
}
