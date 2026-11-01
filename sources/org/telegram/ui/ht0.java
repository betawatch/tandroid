package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class ht0 extends org.telegram.ui.Cells.q1 {
    public final Path hd;
    public final Paint id;
    public final /* synthetic */ byte[] jd;
    public final /* synthetic */ int kd;
    public final /* synthetic */ int ld;
    public final /* synthetic */ jt0 md;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ht0(jt0 jt0Var, Context context, int i10, org.telegram.ui.ActionBar.p6 p6Var, byte[] bArr, int i11, int i12) {
        super(context, i10, false, null, p6Var);
        this.md = jt0Var;
        this.jd = bArr;
        this.kd = i11;
        this.ld = i12;
        this.hd = new Path();
        this.id = new Paint(1);
    }

    @Override // org.telegram.ui.Cells.q1
    public final void h1(Canvas canvas) {
        this.Q4 = 0;
        this.R4 = this.O4.size() - 1;
        this.S4 = (-org.telegram.messenger.i0.L(7.0f)) * this.md.D;
        super.h1(canvas);
    }

    @Override // org.telegram.ui.Cells.q1, android.view.View
    public final void onDraw(Canvas canvas) {
        canvas.save();
        int T1 = T1(this.jd);
        float S1 = S1(T1);
        float R1 = R1(T1);
        RectF rectF = org.telegram.messenger.i0.P;
        rectF.set(getPollButtonsLeft(), S1, getPollButtonsRight(), R1);
        float f7 = rectF.top;
        float L = org.telegram.messenger.i0.L(3.0f);
        jt0 jt0Var = this.md;
        rectF.top = org.telegram.messenger.i0.T1(L, jt0Var.V ? -org.telegram.messenger.i0.L(3.0f) : 0.0f, jt0Var.D) + f7;
        float f10 = rectF.bottom;
        boolean z10 = jt0Var.V;
        float L2 = org.telegram.messenger.i0.L(3.0f);
        if (!z10) {
            L2 = org.telegram.messenger.i0.T1(L2, 0.0f, jt0Var.D);
        }
        rectF.bottom = f10 + L2;
        Path path = this.hd;
        path.rewind();
        path.addRoundRect(rectF, org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(8.0f), Path.Direction.CW);
        Paint paint = this.id;
        paint.setColor(0);
        paint.setShadowLayer(org.telegram.messenger.i0.L(2.0f), 0.0f, org.telegram.messenger.i0.L(0.66f), org.telegram.ui.ActionBar.t6.r1(jt0Var.D * 0.2f, -16777216));
        canvas.drawRoundRect(rectF, org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(8.0f), paint);
        canvas.clipPath(path);
        b1(canvas);
        canvas.restore();
    }

    @Override // org.telegram.ui.Cells.q1, android.view.View
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(this.kd, this.ld);
    }

    @Override // org.telegram.ui.Cells.q1, android.view.View
    public final void setPressed(boolean z10) {
    }
}
