package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.widget.TextView;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class i20 extends TextView {
    public final Paint[] a;
    public final /* synthetic */ org.telegram.ui.g30 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i20(org.telegram.ui.g30 g30Var, Context context) {
        super(context);
        this.b = g30Var;
        this.a = new Paint[g30Var.p1.length];
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
        org.telegram.ui.g30 g30Var = this.b;
        int i10 = g30Var.r1;
        Paint[] paintArr = this.a;
        paintArr[i10].setAlpha(org.telegram.messenger.ks.e4);
        canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f), paintArr[g30Var.r1]);
        float f10 = g30Var.q1;
        if (f10 > 0.0f && (i7 = g30Var.r1 + 1) < paintArr.length) {
            paintArr[i7].setAlpha((int) (f10 * 255.0f));
            canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f), paintArr[g30Var.r1 + 1]);
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
