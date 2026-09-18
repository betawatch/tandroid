package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Paint;
import android.graphics.Shader;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes3.dex */
public final /* synthetic */ class wv0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ androidx.activity.g b;

    public /* synthetic */ wv0(androidx.activity.g gVar, int i10) {
        this.a = i10;
        this.b = gVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        androidx.activity.g gVar = this.b;
        switch (i10) {
            case 0:
                bw0 bw0Var = (bw0) gVar.c;
                boolean z10 = bw0Var.O;
                Paint paint = bw0Var.b0;
                Paint paint2 = bw0Var.W;
                if (!z10) {
                    xv0 xv0Var = (xv0) gVar.d;
                    if (xv0Var != null) {
                        xv0Var.c.recycle();
                    }
                    bw0Var.P = false;
                    break;
                } else {
                    xv0 xv0Var2 = bw0Var.Q;
                    bw0Var.R = xv0Var2;
                    bw0Var.a0.setShader(paint2.getShader());
                    bw0Var.c0.setShader(paint.getShader());
                    Bitmap bitmap = ((xv0) gVar.d).c;
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    paint2.setShader(new BitmapShader(bitmap, tileMode, tileMode));
                    ((xv0) gVar.d).getClass();
                    ValueAnimator valueAnimator = bw0Var.g0;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    bw0Var.f0 = 0.0f;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    bw0Var.g0 = ofFloat;
                    ofFloat.addUpdateListener(new q70(gVar, 22));
                    bw0Var.g0.addListener(new al0(2, gVar, xv0Var2));
                    bw0Var.g0.setDuration(50L);
                    bw0Var.g0.start();
                    bw0Var.N();
                    bw0Var.Q = (xv0) gVar.d;
                    AndroidUtilities.runOnUIThread(new wv0(gVar, 1), 16L);
                    break;
                }
            default:
                bw0 bw0Var2 = (bw0) gVar.c;
                bw0Var2.P = false;
                bw0Var2.W();
                break;
        }
    }
}
