package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Paint;
import android.graphics.Shader;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
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
                boolean z10 = pv0Var.O;
                Paint paint = pv0Var.b0;
                Paint paint2 = pv0Var.W;
                if (!z10) {
                    lv0 lv0Var = (lv0) gVar.d;
                    if (lv0Var != null) {
                        lv0Var.c.recycle();
                    }
                    pv0Var.P = false;
                    break;
                } else {
                    lv0 lv0Var2 = pv0Var.Q;
                    pv0Var.R = lv0Var2;
                    pv0Var.a0.setShader(paint2.getShader());
                    pv0Var.c0.setShader(paint.getShader());
                    Bitmap bitmap = ((lv0) gVar.d).c;
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    paint2.setShader(new BitmapShader(bitmap, tileMode, tileMode));
                    ((lv0) gVar.d).getClass();
                    ValueAnimator valueAnimator = pv0Var.g0;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    pv0Var.f0 = 0.0f;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    pv0Var.g0 = ofFloat;
                    ofFloat.addUpdateListener(new i70(gVar, 22));
                    pv0Var.g0.addListener(new qk0(2, gVar, lv0Var2));
                    pv0Var.g0.setDuration(50L);
                    pv0Var.g0.start();
                    pv0Var.N();
                    pv0Var.Q = (lv0) gVar.d;
                    AndroidUtilities.runOnUIThread(new kv0(gVar, 1), 16L);
                    break;
                }
            default:
                pv0 pv0Var2 = (pv0) gVar.c;
                pv0Var2.P = false;
                pv0Var2.W();
                break;
        }
    }
}
