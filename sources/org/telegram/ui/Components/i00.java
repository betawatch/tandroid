package org.telegram.ui.Components;

import android.graphics.SurfaceTexture;
import android.os.Looper;
import android.view.Surface;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final /* synthetic */ class i00 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ l00 b;

    public /* synthetic */ i00(l00 l00Var, int i10) {
        this.a = i10;
        this.b = l00Var;
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
                l00.b(this.b);
                break;
            default:
                l00 l00Var = this.b;
                bw bwVar = l00Var.b0;
                SurfaceTexture surfaceTexture = l00Var.w;
                z71 z71Var = (z71) bwVar.b;
                if (z71Var.a != null) {
                    z71Var.a.T(new Surface(surfaceTexture));
                    break;
                }
                break;
        }
    }
}
