package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Paint;
import android.graphics.Shader;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes3.dex */
public final /* synthetic */ class hw0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ androidx.activity.g b;

    public /* synthetic */ hw0(androidx.activity.g gVar, int i10) {
        this.a = i10;
        this.b = gVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        androidx.activity.g gVar = this.b;
        switch (i10) {
            case 0:
                mw0 mw0Var = (mw0) gVar.c;
                boolean z10 = mw0Var.O;
                Paint paint = mw0Var.b0;
                Paint paint2 = mw0Var.W;
                if (!z10) {
                    iw0 iw0Var = (iw0) gVar.d;
                    if (iw0Var != null) {
                        iw0Var.c.recycle();
                    }
                    mw0Var.P = false;
                    break;
                } else {
                    iw0 iw0Var2 = mw0Var.Q;
                    mw0Var.R = iw0Var2;
                    mw0Var.a0.setShader(paint2.getShader());
                    mw0Var.c0.setShader(paint.getShader());
                    Bitmap bitmap = ((iw0) gVar.d).c;
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    paint2.setShader(new BitmapShader(bitmap, tileMode, tileMode));
                    ((iw0) gVar.d).getClass();
                    ValueAnimator valueAnimator = mw0Var.g0;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    mw0Var.f0 = 0.0f;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    mw0Var.g0 = ofFloat;
                    ofFloat.addUpdateListener(new v70(gVar, 22));
                    mw0Var.g0.addListener(new cl0(2, gVar, iw0Var2));
                    mw0Var.g0.setDuration(50L);
                    mw0Var.g0.start();
                    mw0Var.N();
                    mw0Var.Q = (iw0) gVar.d;
                    AndroidUtilities.runOnUIThread(new hw0(gVar, 1), 16L);
                    break;
                }
            default:
                mw0 mw0Var2 = (mw0) gVar.c;
                mw0Var2.P = false;
                mw0Var2.W();
                break;
        }
    }
}
