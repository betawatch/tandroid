package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Paint;
import android.graphics.Shader;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final /* synthetic */ class jw0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ androidx.activity.g b;

    public /* synthetic */ jw0(androidx.activity.g gVar, int i10) {
        this.a = i10;
        this.b = gVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        androidx.activity.g gVar = this.b;
        switch (i10) {
            case 0:
                ow0 ow0Var = (ow0) gVar.c;
                boolean z10 = ow0Var.O;
                Paint paint = ow0Var.b0;
                Paint paint2 = ow0Var.W;
                if (!z10) {
                    kw0 kw0Var = (kw0) gVar.d;
                    if (kw0Var != null) {
                        kw0Var.c.recycle();
                    }
                    ow0Var.P = false;
                    break;
                } else {
                    kw0 kw0Var2 = ow0Var.Q;
                    ow0Var.R = kw0Var2;
                    ow0Var.a0.setShader(paint2.getShader());
                    ow0Var.c0.setShader(paint.getShader());
                    Bitmap bitmap = ((kw0) gVar.d).c;
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    paint2.setShader(new BitmapShader(bitmap, tileMode, tileMode));
                    ((kw0) gVar.d).getClass();
                    ValueAnimator valueAnimator = ow0Var.g0;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    ow0Var.f0 = 0.0f;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    ow0Var.g0 = ofFloat;
                    ofFloat.addUpdateListener(new f80(gVar, 23));
                    ow0Var.g0.addListener(new ql0(2, gVar, kw0Var2));
                    ow0Var.g0.setDuration(50L);
                    ow0Var.g0.start();
                    ow0Var.N();
                    ow0Var.Q = (kw0) gVar.d;
                    AndroidUtilities.runOnUIThread(new jw0(gVar, 1), 16L);
                    break;
                }
            default:
                ow0 ow0Var2 = (ow0) gVar.c;
                ow0Var2.P = false;
                ow0Var2.W();
                break;
        }
    }
}
