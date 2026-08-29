package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Paint;
import android.graphics.Shader;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class cv0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ androidx.activity.g b;

    public /* synthetic */ cv0(androidx.activity.g gVar, int i10) {
        this.a = i10;
        this.b = gVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        androidx.activity.g gVar = this.b;
        switch (i10) {
            case 0:
                hv0 hv0Var = (hv0) gVar.c;
                boolean z10 = hv0Var.K;
                Paint paint = hv0Var.U;
                Paint paint2 = hv0Var.S;
                if (!z10) {
                    dv0 dv0Var = (dv0) gVar.d;
                    if (dv0Var != null) {
                        dv0Var.c.recycle();
                    }
                    hv0Var.L = false;
                    break;
                } else {
                    dv0 dv0Var2 = hv0Var.M;
                    hv0Var.N = dv0Var2;
                    hv0Var.T.setShader(paint2.getShader());
                    hv0Var.V.setShader(paint.getShader());
                    Bitmap bitmap = ((dv0) gVar.d).c;
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    paint2.setShader(new BitmapShader(bitmap, tileMode, tileMode));
                    ((dv0) gVar.d).getClass();
                    ValueAnimator valueAnimator = hv0Var.c0;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    hv0Var.b0 = 0.0f;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    hv0Var.c0 = ofFloat;
                    ofFloat.addUpdateListener(new d70(gVar, 22));
                    hv0Var.c0.addListener(new ok0(3, gVar, dv0Var2));
                    hv0Var.c0.setDuration(50L);
                    hv0Var.c0.start();
                    hv0Var.N();
                    hv0Var.M = (dv0) gVar.d;
                    AndroidUtilities.runOnUIThread(new cv0(gVar, 1), 16L);
                    break;
                }
            default:
                hv0 hv0Var2 = (hv0) gVar.c;
                hv0Var2.L = false;
                hv0Var2.W();
                break;
        }
    }
}
