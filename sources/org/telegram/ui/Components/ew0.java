package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Paint;
import android.graphics.Shader;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ew0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ androidx.activity.g b;

    public /* synthetic */ ew0(androidx.activity.g gVar, int i10) {
        this.a = i10;
        this.b = gVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        androidx.activity.g gVar = this.b;
        switch (i10) {
            case 0:
                jw0 jw0Var = (jw0) gVar.c;
                boolean z10 = jw0Var.O;
                Paint paint = jw0Var.W;
                if (!z10) {
                    fw0 fw0Var = (fw0) gVar.d;
                    if (fw0Var != null) {
                        fw0Var.c.recycle();
                    }
                    jw0Var.P = false;
                    break;
                } else {
                    fw0 fw0Var2 = jw0Var.Q;
                    jw0Var.R = fw0Var2;
                    jw0Var.a0.setShader(paint.getShader());
                    jw0Var.c0.setShader(jw0Var.b0.getShader());
                    Bitmap bitmap = ((fw0) gVar.d).c;
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    paint.setShader(new BitmapShader(bitmap, tileMode, tileMode));
                    ((fw0) gVar.d).getClass();
                    ValueAnimator valueAnimator = jw0Var.g0;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    jw0Var.f0 = 0.0f;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    jw0Var.g0 = ofFloat;
                    ofFloat.addUpdateListener(new b80(gVar, 23));
                    jw0Var.g0.addListener(new ml0(3, gVar, fw0Var2));
                    jw0Var.g0.setDuration(50L);
                    jw0Var.g0.start();
                    jw0Var.N();
                    jw0Var.Q = (fw0) gVar.d;
                    AndroidUtilities.runOnUIThread(new ew0(gVar, 1), 16L);
                    break;
                }
            default:
                jw0 jw0Var2 = (jw0) gVar.c;
                jw0Var2.P = false;
                jw0Var2.W();
                break;
        }
    }
}
