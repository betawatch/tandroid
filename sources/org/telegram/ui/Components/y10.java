package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.widget.TextView;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class y10 extends TextView {
    public final Paint[] a;
    public final /* synthetic */ org.telegram.ui.c30 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y10(org.telegram.ui.c30 c30Var, Context context) {
        super(context);
        this.b = c30Var;
        this.a = new Paint[c30Var.l1.length];
        int i7 = 0;
        while (true) {
            Paint[] paintArr = this.a;
            if (i7 >= paintArr.length) {
                return;
            }
            paintArr[i7] = new Paint(1);
            i7++;
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        int i7;
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        org.telegram.ui.c30 c30Var = this.b;
        int i10 = c30Var.n1;
        Paint[] paintArr = this.a;
        paintArr[i10].setAlpha(org.telegram.messenger.qs.e4);
        canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f), paintArr[c30Var.n1]);
        float f10 = c30Var.m1;
        if (f10 > 0.0f && (i7 = c30Var.n1 + 1) < paintArr.length) {
            paintArr[i7].setAlpha((int) (f10 * 255.0f));
            canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f), paintArr[c30Var.n1 + 1]);
        }
        super.onDraw(canvas);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onSizeChanged(int i7, int i10, int i11, int i12) {
        int i13;
        int i14;
        super.onSizeChanged(i7, i10, i11, i12);
        int i15 = 0;
        while (true) {
            Paint[] paintArr = this.a;
            if (i15 >= paintArr.length) {
                return;
            }
            int i16 = -9015575;
            if (i15 == 0) {
                i13 = -9015575;
                i16 = -11033346;
            } else if (i15 == 1) {
                i16 = -8919716;
                i13 = -11089922;
            } else {
                i13 = -1026983;
                i14 = -1792170;
                paintArr[i15].setShader(i14 == 0 ? new LinearGradient(0.0f, 0.0f, getMeasuredWidth(), 0.0f, new int[]{i16, i13, i14}, (float[]) null, Shader.TileMode.CLAMP) : new LinearGradient(0.0f, 0.0f, getMeasuredWidth(), 0.0f, new int[]{i16, i13}, (float[]) null, Shader.TileMode.CLAMP));
                i15++;
            }
            i14 = 0;
            paintArr[i15].setShader(i14 == 0 ? new LinearGradient(0.0f, 0.0f, getMeasuredWidth(), 0.0f, new int[]{i16, i13, i14}, (float[]) null, Shader.TileMode.CLAMP) : new LinearGradient(0.0f, 0.0f, getMeasuredWidth(), 0.0f, new int[]{i16, i13}, (float[]) null, Shader.TileMode.CLAMP));
            i15++;
        }
    }
}
