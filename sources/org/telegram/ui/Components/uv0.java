package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Paint;
import android.graphics.Shader;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class uv0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ androidx.activity.g b;

    public /* synthetic */ uv0(androidx.activity.g gVar, int i10) {
        this.a = i10;
        this.b = gVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        androidx.activity.g gVar = this.b;
        int i11 = 0;
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
                    ofFloat.addUpdateListener(new q70(gVar, 22));
                    aw0Var.g0.addListener(new vv0(i11, gVar, wv0Var2));
                    aw0Var.g0.setDuration(50L);
                    aw0Var.g0.start();
                    aw0Var.N();
                    aw0Var.Q = (wv0) gVar.d;
                    AndroidUtilities.runOnUIThread(new uv0(gVar, 1), 16L);
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
