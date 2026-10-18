package org.telegram.ui.Components;

import android.graphics.SurfaceTexture;
import android.os.Looper;
import android.view.Surface;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final /* synthetic */ class b00 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ e00 b;

    public /* synthetic */ b00(e00 e00Var, int i10) {
        this.a = i10;
        this.b = e00Var;
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
                e00.b(this.b);
                break;
            default:
                e00 e00Var = this.b;
                tv tvVar = e00Var.b0;
                SurfaceTexture surfaceTexture = e00Var.w;
                p71 p71Var = (p71) tvVar.b;
                if (p71Var.a != null) {
                    p71Var.a.T(new Surface(surfaceTexture));
                    break;
                }
                break;
        }
    }
}
