package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Paint;
import android.graphics.Shader;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class uu0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ androidx.activity.g b;

    public /* synthetic */ uu0(androidx.activity.g gVar, int i10) {
        this.a = i10;
        this.b = gVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        androidx.activity.g gVar = this.b;
        switch (i10) {
            case 0:
                zu0 zu0Var = (zu0) gVar.c;
                boolean z10 = zu0Var.K;
                Paint paint = zu0Var.U;
                Paint paint2 = zu0Var.S;
                if (!z10) {
                    vu0 vu0Var = (vu0) gVar.d;
                    if (vu0Var != null) {
                        vu0Var.c.recycle();
                    }
                    zu0Var.L = false;
                    break;
                } else {
                    vu0 vu0Var2 = zu0Var.M;
                    zu0Var.N = vu0Var2;
                    zu0Var.T.setShader(paint2.getShader());
                    zu0Var.V.setShader(paint.getShader());
                    Bitmap bitmap = ((vu0) gVar.d).c;
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    paint2.setShader(new BitmapShader(bitmap, tileMode, tileMode));
                    ((vu0) gVar.d).getClass();
                    ValueAnimator valueAnimator = zu0Var.c0;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    zu0Var.b0 = 0.0f;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    zu0Var.c0 = ofFloat;
                    ofFloat.addUpdateListener(new v60(gVar, 22));
                    zu0Var.c0.addListener(new fk0(2, gVar, vu0Var2));
                    zu0Var.c0.setDuration(50L);
                    zu0Var.c0.start();
                    zu0Var.N();
                    zu0Var.M = (vu0) gVar.d;
                    AndroidUtilities.runOnUIThread(new uu0(gVar, 1), 16L);
                    break;
                }
            default:
                zu0 zu0Var2 = (zu0) gVar.c;
                zu0Var2.L = false;
                zu0Var2.W();
                break;
        }
    }
}
