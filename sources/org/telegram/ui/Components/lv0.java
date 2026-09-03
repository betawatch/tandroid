package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Paint;
import android.graphics.Shader;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
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
                boolean z4 = qv0Var.L;
                Paint paint = qv0Var.V;
                Paint paint2 = qv0Var.T;
                if (!z4) {
                    mv0 mv0Var = (mv0) gVar.d;
                    if (mv0Var != null) {
                        mv0Var.c.recycle();
                    }
                    qv0Var.M = false;
                    break;
                } else {
                    mv0 mv0Var2 = qv0Var.N;
                    qv0Var.O = mv0Var2;
                    qv0Var.U.setShader(paint2.getShader());
                    qv0Var.W.setShader(paint.getShader());
                    Bitmap bitmap = ((mv0) gVar.d).c;
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    paint2.setShader(new BitmapShader(bitmap, tileMode, tileMode));
                    ((mv0) gVar.d).getClass();
                    ValueAnimator valueAnimator = qv0Var.d0;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    qv0Var.c0 = 0.0f;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    qv0Var.d0 = ofFloat;
                    ofFloat.addUpdateListener(new j70(gVar, 22));
                    qv0Var.d0.addListener(new dg.y2(29, gVar, mv0Var2));
                    qv0Var.d0.setDuration(50L);
                    qv0Var.d0.start();
                    qv0Var.N();
                    qv0Var.N = (mv0) gVar.d;
                    AndroidUtilities.runOnUIThread(new lv0(gVar, 1), 16L);
                    break;
                }
            default:
                qv0 qv0Var2 = (qv0) gVar.c;
                qv0Var2.M = false;
                qv0Var2.W();
                break;
        }
    }
}
