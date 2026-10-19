package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Paint;
import android.graphics.Shader;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final /* synthetic */ class fw0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ androidx.activity.g b;

    public /* synthetic */ fw0(androidx.activity.g gVar, int i10) {
        this.a = i10;
        this.b = gVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        androidx.activity.g gVar = this.b;
        switch (i10) {
            case 0:
                kw0 kw0Var = (kw0) gVar.c;
                boolean z10 = kw0Var.O;
                Paint paint = kw0Var.W;
                if (!z10) {
                    gw0 gw0Var = (gw0) gVar.d;
                    if (gw0Var != null) {
                        gw0Var.c.recycle();
                    }
                    kw0Var.P = false;
                    break;
                } else {
                    gw0 gw0Var2 = kw0Var.Q;
                    kw0Var.R = gw0Var2;
                    kw0Var.a0.setShader(paint.getShader());
                    kw0Var.c0.setShader(kw0Var.b0.getShader());
                    Bitmap bitmap = ((gw0) gVar.d).c;
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    paint.setShader(new BitmapShader(bitmap, tileMode, tileMode));
                    ((gw0) gVar.d).getClass();
                    ValueAnimator valueAnimator = kw0Var.g0;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    kw0Var.f0 = 0.0f;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    kw0Var.g0 = ofFloat;
                    ofFloat.addUpdateListener(new b80(gVar, 23));
                    kw0Var.g0.addListener(new ml0(3, gVar, gw0Var2));
                    kw0Var.g0.setDuration(50L);
                    kw0Var.g0.start();
                    kw0Var.N();
                    kw0Var.Q = (gw0) gVar.d;
                    AndroidUtilities.runOnUIThread(new fw0(gVar, 1), 16L);
                    break;
                }
            default:
                kw0 kw0Var2 = (kw0) gVar.c;
                kw0Var2.P = false;
                kw0Var2.W();
                break;
        }
    }
}
