package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Paint;
import android.graphics.Shader;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class kv0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ androidx.activity.g b;

    public /* synthetic */ kv0(androidx.activity.g gVar, int i10) {
        this.a = i10;
        this.b = gVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        androidx.activity.g gVar = this.b;
        switch (i10) {
            case 0:
                pv0 pv0Var = (pv0) gVar.c;
                boolean z4 = pv0Var.L;
                Paint paint = pv0Var.V;
                Paint paint2 = pv0Var.T;
                if (!z4) {
                    lv0 lv0Var = (lv0) gVar.d;
                    if (lv0Var != null) {
                        lv0Var.c.recycle();
                    }
                    pv0Var.M = false;
                    break;
                } else {
                    lv0 lv0Var2 = pv0Var.N;
                    pv0Var.O = lv0Var2;
                    pv0Var.U.setShader(paint2.getShader());
                    pv0Var.W.setShader(paint.getShader());
                    Bitmap bitmap = ((lv0) gVar.d).c;
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    paint2.setShader(new BitmapShader(bitmap, tileMode, tileMode));
                    ((lv0) gVar.d).getClass();
                    ValueAnimator valueAnimator = pv0Var.d0;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    pv0Var.c0 = 0.0f;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    pv0Var.d0 = ofFloat;
                    ofFloat.addUpdateListener(new k70(gVar, 22));
                    pv0Var.d0.addListener(new eg.w2(29, gVar, lv0Var2));
                    pv0Var.d0.setDuration(50L);
                    pv0Var.d0.start();
                    pv0Var.N();
                    pv0Var.N = (lv0) gVar.d;
                    AndroidUtilities.runOnUIThread(new kv0(gVar, 1), 16L);
                    break;
                }
            default:
                pv0 pv0Var2 = (pv0) gVar.c;
                pv0Var2.M = false;
                pv0Var2.W();
                break;
        }
    }
}
