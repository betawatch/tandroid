package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Paint;
import android.graphics.Shader;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final /* synthetic */ class nw0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ androidx.activity.g b;

    public /* synthetic */ nw0(androidx.activity.g gVar, int i10) {
        this.a = i10;
        this.b = gVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        androidx.activity.g gVar = this.b;
        switch (i10) {
            case 0:
                sw0 sw0Var = (sw0) gVar.c;
                boolean z10 = sw0Var.O;
                Paint paint = sw0Var.b0;
                Paint paint2 = sw0Var.W;
                if (!z10) {
                    ow0 ow0Var = (ow0) gVar.d;
                    if (ow0Var != null) {
                        ow0Var.c.recycle();
                    }
                    sw0Var.P = false;
                    break;
                } else {
                    ow0 ow0Var2 = sw0Var.Q;
                    sw0Var.R = ow0Var2;
                    sw0Var.a0.setShader(paint2.getShader());
                    sw0Var.c0.setShader(paint.getShader());
                    Bitmap bitmap = ((ow0) gVar.d).c;
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    paint2.setShader(new BitmapShader(bitmap, tileMode, tileMode));
                    ((ow0) gVar.d).getClass();
                    ValueAnimator valueAnimator = sw0Var.g0;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    sw0Var.f0 = 0.0f;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    sw0Var.g0 = ofFloat;
                    ofFloat.addUpdateListener(new j80(gVar, 23));
                    sw0Var.g0.addListener(new ul0(2, gVar, ow0Var2));
                    sw0Var.g0.setDuration(50L);
                    sw0Var.g0.start();
                    sw0Var.N();
                    sw0Var.Q = (ow0) gVar.d;
                    AndroidUtilities.runOnUIThread(new nw0(gVar, 1), 16L);
                    break;
                }
            default:
                sw0 sw0Var2 = (sw0) gVar.c;
                sw0Var2.P = false;
                sw0Var2.W();
                break;
        }
    }
}
