package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Paint;
import android.graphics.Shader;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final /* synthetic */ class xv0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ androidx.activity.g b;

    public /* synthetic */ xv0(androidx.activity.g gVar, int i10) {
        this.a = i10;
        this.b = gVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        androidx.activity.g gVar = this.b;
        switch (i10) {
            case 0:
                cw0 cw0Var = (cw0) gVar.c;
                boolean z10 = cw0Var.O;
                Paint paint = cw0Var.b0;
                Paint paint2 = cw0Var.W;
                if (!z10) {
                    yv0 yv0Var = (yv0) gVar.d;
                    if (yv0Var != null) {
                        yv0Var.c.recycle();
                    }
                    cw0Var.P = false;
                    break;
                } else {
                    yv0 yv0Var2 = cw0Var.Q;
                    cw0Var.R = yv0Var2;
                    cw0Var.a0.setShader(paint2.getShader());
                    cw0Var.c0.setShader(paint.getShader());
                    Bitmap bitmap = ((yv0) gVar.d).c;
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    paint2.setShader(new BitmapShader(bitmap, tileMode, tileMode));
                    ((yv0) gVar.d).getClass();
                    ValueAnimator valueAnimator = cw0Var.g0;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    cw0Var.f0 = 0.0f;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    cw0Var.g0 = ofFloat;
                    ofFloat.addUpdateListener(new s70(gVar, 22));
                    cw0Var.g0.addListener(new cl0(2, gVar, yv0Var2));
                    cw0Var.g0.setDuration(50L);
                    cw0Var.g0.start();
                    cw0Var.N();
                    cw0Var.Q = (yv0) gVar.d;
                    AndroidUtilities.runOnUIThread(new xv0(gVar, 1), 16L);
                    break;
                }
            default:
                cw0 cw0Var2 = (cw0) gVar.c;
                cw0Var2.P = false;
                cw0Var2.W();
                break;
        }
    }
}
