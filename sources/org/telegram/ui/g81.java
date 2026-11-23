package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class g81 extends org.telegram.ui.Cells.r1 {
    public final Paint Ad;
    public final /* synthetic */ int Bd;
    public final /* synthetic */ int Cd;
    public final /* synthetic */ int Dd;
    public final /* synthetic */ i81 Ed;
    public final Path zd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g81(i81 i81Var, Context context, int i7, org.telegram.ui.ActionBar.h6 h6Var, int i10, int i11, int i12) {
        super(context, i7, false, null, h6Var);
        this.Ed = i81Var;
        this.Bd = i10;
        this.Cd = i11;
        this.Dd = i12;
        this.zd = new Path();
        this.Ad = new Paint(1);
    }

    @Override // org.telegram.ui.Cells.r1
    public final void j1(Canvas canvas) {
        this.S4 = 0;
        this.T4 = this.Q4.size() - 1;
        super.j1(canvas);
    }

    @Override // org.telegram.ui.Cells.r1, android.view.View
    public final void onDraw(Canvas canvas) {
        canvas.save();
        int c22 = c2(this.Bd);
        float V1 = V1(c22);
        float U1 = U1(c22);
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set(getPollButtonsLeft(), V1, getPollButtonsRight(), U1);
        Path path = this.zd;
        path.rewind();
        path.addRoundRect(rectF, org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), Path.Direction.CW);
        Paint paint = this.Ad;
        paint.setColor(0);
        paint.setShadowLayer(org.telegram.messenger.g0.L(2.0f), 0.0f, org.telegram.messenger.g0.L(0.66f), org.telegram.ui.ActionBar.m6.r1(this.Ed.y * 0.2f, -16777216));
        canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), paint);
        canvas.clipPath(path);
        d1(canvas);
        canvas.restore();
    }

    @Override // org.telegram.ui.Cells.r1, android.view.View
    public final void onMeasure(int i7, int i10) {
        setMeasuredDimension(this.Cd, this.Dd);
    }

    @Override // org.telegram.ui.Cells.r1, android.view.View
    public final void setPressed(boolean z10) {
    }
}
