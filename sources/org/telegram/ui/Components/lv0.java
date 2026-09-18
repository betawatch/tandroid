package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Paint;
import android.graphics.Shader;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class lv0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ androidx.activity.g b;

    public /* synthetic */ lv0(androidx.activity.g gVar, int i10) {
        this.a = i10;
        this.b = gVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        androidx.activity.g gVar = this.b;
        switch (i10) {
            case 0:
                qv0 qv0Var = (qv0) gVar.c;
                boolean z10 = qv0Var.O;
                Paint paint = qv0Var.b0;
                Paint paint2 = qv0Var.W;
                if (!z10) {
                    mv0 mv0Var = (mv0) gVar.d;
                    if (mv0Var != null) {
                        mv0Var.c.recycle();
                    }
                    qv0Var.P = false;
                    break;
                } else {
                    mv0 mv0Var2 = qv0Var.Q;
                    qv0Var.R = mv0Var2;
                    qv0Var.a0.setShader(paint2.getShader());
                    qv0Var.c0.setShader(paint.getShader());
                    Bitmap bitmap = ((mv0) gVar.d).c;
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    paint2.setShader(new BitmapShader(bitmap, tileMode, tileMode));
                    ((mv0) gVar.d).getClass();
                    ValueAnimator valueAnimator = qv0Var.g0;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    qv0Var.f0 = 0.0f;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    qv0Var.g0 = ofFloat;
                    ofFloat.addUpdateListener(new h70(gVar, 22));
                    qv0Var.g0.addListener(new qk0(2, gVar, mv0Var2));
                    qv0Var.g0.setDuration(50L);
                    qv0Var.g0.start();
                    qv0Var.N();
                    qv0Var.Q = (mv0) gVar.d;
                    AndroidUtilities.runOnUIThread(new lv0(gVar, 1), 16L);
                    break;
                }
            default:
                qv0 qv0Var2 = (qv0) gVar.c;
                qv0Var2.P = false;
                qv0Var2.W();
                break;
        }
    }
}
