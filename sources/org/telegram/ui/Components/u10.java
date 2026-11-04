package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.widget.TextView;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class u10 extends TextView {
    public final Paint[] a;
    public final /* synthetic */ org.telegram.ui.x20 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u10(org.telegram.ui.x20 x20Var, Context context) {
        super(context);
        this.b = x20Var;
        this.a = new Paint[x20Var.m1.length];
        int i3 = 0;
        while (true) {
            Paint[] paintArr = this.a;
            if (i3 >= paintArr.length) {
                return;
            }
            paintArr[i3] = new Paint(1);
            i3++;
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        int i3;
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        org.telegram.ui.x20 x20Var = this.b;
        int i10 = x20Var.o1;
        Paint[] paintArr = this.a;
        paintArr[i10].setAlpha(org.telegram.messenger.hs.e4);
        canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f), paintArr[x20Var.o1]);
        float f10 = x20Var.n1;
        if (f10 > 0.0f && (i3 = x20Var.o1 + 1) < paintArr.length) {
            paintArr[i3].setAlpha((int) (f10 * 255.0f));
            canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f), paintArr[x20Var.o1 + 1]);
        }
        super.onDraw(canvas);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onSizeChanged(int i3, int i10, int i11, int i12) {
        int i13;
        int i14;
        super.onSizeChanged(i3, i10, i11, i12);
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
