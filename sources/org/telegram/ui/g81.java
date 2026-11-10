package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class g81 extends org.telegram.ui.Cells.q1 {
    public final Path ld;
    public final Paint md;
    public final /* synthetic */ int nd;
    public final /* synthetic */ int od;
    public final /* synthetic */ int pd;
    public final /* synthetic */ i81 qd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g81(i81 i81Var, Context context, int i7, org.telegram.ui.ActionBar.h6 h6Var, int i10, int i11, int i12) {
        super(context, i7, false, null, h6Var);
        this.qd = i81Var;
        this.nd = i10;
        this.od = i11;
        this.pd = i12;
        this.ld = new Path();
        this.md = new Paint(1);
    }

    @Override // org.telegram.ui.Cells.q1
    public final void j1(Canvas canvas) {
        this.R4 = 0;
        this.S4 = this.P4.size() - 1;
        super.j1(canvas);
    }

    @Override // org.telegram.ui.Cells.q1, android.view.View
    public final void onDraw(Canvas canvas) {
        canvas.save();
        int b22 = b2(this.nd);
        float U1 = U1(b22);
        float T1 = T1(b22);
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set(getPollButtonsLeft(), U1, getPollButtonsRight(), T1);
        Path path = this.ld;
        path.rewind();
        path.addRoundRect(rectF, org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), Path.Direction.CW);
        Paint paint = this.md;
        paint.setColor(0);
        paint.setShadowLayer(org.telegram.messenger.g0.L(2.0f), 0.0f, org.telegram.messenger.g0.L(0.66f), org.telegram.ui.ActionBar.m6.r1(this.qd.y * 0.2f, -16777216));
        canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), paint);
        canvas.clipPath(path);
        d1(canvas);
        canvas.restore();
    }

    @Override // org.telegram.ui.Cells.q1, android.view.View
    public final void onMeasure(int i7, int i10) {
        setMeasuredDimension(this.od, this.pd);
    }

    @Override // org.telegram.ui.Cells.q1, android.view.View
    public final void setPressed(boolean z9) {
    }
}
