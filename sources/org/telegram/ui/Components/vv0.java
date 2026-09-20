package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Paint;
import android.graphics.Shader;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final /* synthetic */ class vv0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ androidx.activity.g b;

    public /* synthetic */ vv0(androidx.activity.g gVar, int i10) {
        this.a = i10;
        this.b = gVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        androidx.activity.g gVar = this.b;
        switch (i10) {
            case 0:
                aw0 aw0Var = (aw0) gVar.c;
                boolean z10 = aw0Var.O;
                Paint paint = aw0Var.b0;
                Paint paint2 = aw0Var.W;
                if (!z10) {
                    wv0 wv0Var = (wv0) gVar.d;
                    if (wv0Var != null) {
                        wv0Var.c.recycle();
                    }
                    aw0Var.P = false;
                    break;
                } else {
                    wv0 wv0Var2 = aw0Var.Q;
                    aw0Var.R = wv0Var2;
                    aw0Var.a0.setShader(paint2.getShader());
                    aw0Var.c0.setShader(paint.getShader());
                    Bitmap bitmap = ((wv0) gVar.d).c;
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    paint2.setShader(new BitmapShader(bitmap, tileMode, tileMode));
                    ((wv0) gVar.d).getClass();
                    ValueAnimator valueAnimator = aw0Var.g0;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    aw0Var.f0 = 0.0f;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    aw0Var.g0 = ofFloat;
                    ofFloat.addUpdateListener(new p70(gVar, 22));
                    aw0Var.g0.addListener(new zk0(2, gVar, wv0Var2));
                    aw0Var.g0.setDuration(50L);
                    aw0Var.g0.start();
                    aw0Var.N();
                    aw0Var.Q = (wv0) gVar.d;
                    AndroidUtilities.runOnUIThread(new vv0(gVar, 1), 16L);
                    break;
                }
            default:
                aw0 aw0Var2 = (aw0) gVar.c;
                aw0Var2.P = false;
                aw0Var2.W();
                break;
        }
    }
}
