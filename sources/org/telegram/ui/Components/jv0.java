package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Paint;
import android.graphics.Shader;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final /* synthetic */ class jv0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ androidx.activity.g b;

    public /* synthetic */ jv0(androidx.activity.g gVar, int i10) {
        this.a = i10;
        this.b = gVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        androidx.activity.g gVar = this.b;
        switch (i10) {
            case 0:
                ov0 ov0Var = (ov0) gVar.c;
                boolean z10 = ov0Var.O;
                Paint paint = ov0Var.b0;
                Paint paint2 = ov0Var.W;
                if (!z10) {
                    kv0 kv0Var = (kv0) gVar.d;
                    if (kv0Var != null) {
                        kv0Var.c.recycle();
                    }
                    ov0Var.P = false;
                    break;
                } else {
                    kv0 kv0Var2 = ov0Var.Q;
                    ov0Var.R = kv0Var2;
                    ov0Var.a0.setShader(paint2.getShader());
                    ov0Var.c0.setShader(paint.getShader());
                    Bitmap bitmap = ((kv0) gVar.d).c;
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    paint2.setShader(new BitmapShader(bitmap, tileMode, tileMode));
                    ((kv0) gVar.d).getClass();
                    ValueAnimator valueAnimator = ov0Var.g0;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    ov0Var.f0 = 0.0f;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    ov0Var.g0 = ofFloat;
                    ofFloat.addUpdateListener(new h70(gVar, 22));
                    ov0Var.g0.addListener(new pk0(2, gVar, kv0Var2));
                    ov0Var.g0.setDuration(50L);
                    ov0Var.g0.start();
                    ov0Var.N();
                    ov0Var.Q = (kv0) gVar.d;
                    AndroidUtilities.runOnUIThread(new jv0(gVar, 1), 16L);
                    break;
                }
            default:
                ov0 ov0Var2 = (ov0) gVar.c;
                ov0Var2.P = false;
                ov0Var2.W();
                break;
        }
    }
}
