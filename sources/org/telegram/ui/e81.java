package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class e81 extends org.telegram.ui.Cells.r1 {
    public final Paint Ad;
    public final /* synthetic */ int Bd;
    public final /* synthetic */ int Cd;
    public final /* synthetic */ int Dd;
    public final /* synthetic */ g81 Ed;
    public final Path zd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e81(g81 g81Var, Context context, int i7, org.telegram.ui.ActionBar.i6 i6Var, int i10, int i11, int i12) {
        super(context, i7, false, null, i6Var);
        this.Ed = g81Var;
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
        paint.setShadowLayer(org.telegram.messenger.g0.L(2.0f), 0.0f, org.telegram.messenger.g0.L(0.66f), org.telegram.ui.ActionBar.n6.r1(this.Ed.y * 0.2f, -16777216));
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
