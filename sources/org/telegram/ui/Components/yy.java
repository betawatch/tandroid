package org.telegram.ui.Components;

import android.graphics.SurfaceTexture;
import android.os.Looper;
import android.view.Surface;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class yy implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ bz b;

    public /* synthetic */ yy(bz bzVar, int i7) {
        this.a = i7;
        this.b = bzVar;
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
                bz.a(this.b);
                break;
            default:
                bz bzVar = this.b;
                hy hyVar = bzVar.c0;
                SurfaceTexture surfaceTexture = bzVar.x;
                x51 x51Var = (x51) hyVar.b;
                if (x51Var.a != null) {
                    x51Var.a.y0(new Surface(surfaceTexture));
                    break;
                }
                break;
        }
    }
}
