package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Paint;
import android.graphics.Shader;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes3.dex */
public final /* synthetic */ class gw0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ androidx.activity.g b;

    public /* synthetic */ gw0(androidx.activity.g gVar, int i10) {
        this.a = i10;
        this.b = gVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        androidx.activity.g gVar = this.b;
        switch (i10) {
            case 0:
                lw0 lw0Var = (lw0) gVar.c;
                boolean z10 = lw0Var.O;
                Paint paint = lw0Var.W;
                if (!z10) {
                    hw0 hw0Var = (hw0) gVar.d;
                    if (hw0Var != null) {
                        hw0Var.c.recycle();
                    }
                    lw0Var.P = false;
                    break;
                } else {
                    hw0 hw0Var2 = lw0Var.Q;
                    lw0Var.R = hw0Var2;
                    lw0Var.a0.setShader(paint.getShader());
                    lw0Var.c0.setShader(lw0Var.b0.getShader());
                    Bitmap bitmap = ((hw0) gVar.d).c;
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    paint.setShader(new BitmapShader(bitmap, tileMode, tileMode));
                    ((hw0) gVar.d).getClass();
                    ValueAnimator valueAnimator = lw0Var.g0;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    lw0Var.f0 = 0.0f;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    lw0Var.g0 = ofFloat;
                    ofFloat.addUpdateListener(new b80(gVar, 23));
                    lw0Var.g0.addListener(new nl0(3, gVar, hw0Var2));
                    lw0Var.g0.setDuration(50L);
                    lw0Var.g0.start();
                    lw0Var.N();
                    lw0Var.Q = (hw0) gVar.d;
                    AndroidUtilities.runOnUIThread(new gw0(gVar, 1), 16L);
                    break;
                }
            default:
                lw0 lw0Var2 = (lw0) gVar.c;
                lw0Var2.P = false;
                lw0Var2.W();
                break;
        }
    }
}
