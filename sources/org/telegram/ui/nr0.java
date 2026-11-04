package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class nr0 extends org.telegram.ui.Cells.q1 {
    public final Path kd;
    public final Paint ld;
    public final /* synthetic */ byte[] md;
    public final /* synthetic */ int nd;
    public final /* synthetic */ int od;
    public final /* synthetic */ pr0 pd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nr0(pr0 pr0Var, Context context, int i3, org.telegram.ui.ActionBar.e6 e6Var, byte[] bArr, int i10, int i11) {
        super(context, i3, false, null, e6Var);
        this.pd = pr0Var;
        this.md = bArr;
        this.nd = i10;
        this.od = i11;
        this.kd = new Path();
        this.ld = new Paint(1);
    }

    @Override // org.telegram.ui.Cells.q1
    public final void j1(Canvas canvas) {
        this.R4 = 0;
        this.S4 = this.P4.size() - 1;
        this.T4 = (-org.telegram.messenger.g0.L(7.0f)) * this.pd.E;
        super.j1(canvas);
    }

    @Override // org.telegram.ui.Cells.q1, android.view.View
    public final void onDraw(Canvas canvas) {
        canvas.save();
        int V1 = V1(this.md);
        float U1 = U1(V1);
        float T1 = T1(V1);
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set(getPollButtonsLeft(), U1, getPollButtonsRight(), T1);
        float f10 = rectF.top;
        float L = org.telegram.messenger.g0.L(3.0f);
        pr0 pr0Var = this.pd;
        rectF.top = org.telegram.messenger.g0.T1(L, pr0Var.W ? -org.telegram.messenger.g0.L(3.0f) : 0.0f, pr0Var.E) + f10;
        float f11 = rectF.bottom;
        boolean z10 = pr0Var.W;
        float L2 = org.telegram.messenger.g0.L(3.0f);
        if (!z10) {
            L2 = org.telegram.messenger.g0.T1(L2, 0.0f, pr0Var.E);
        }
        rectF.bottom = f11 + L2;
        Path path = this.kd;
        path.rewind();
        path.addRoundRect(rectF, org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), Path.Direction.CW);
        Paint paint = this.ld;
        paint.setColor(0);
        paint.setShadowLayer(org.telegram.messenger.g0.L(2.0f), 0.0f, org.telegram.messenger.g0.L(0.66f), org.telegram.ui.ActionBar.k6.r1(pr0Var.E * 0.2f, -16777216));
        canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), paint);
        canvas.clipPath(path);
        d1(canvas);
        canvas.restore();
    }

    @Override // org.telegram.ui.Cells.q1, android.view.View
    public final void onMeasure(int i3, int i10) {
        setMeasuredDimension(this.nd, this.od);
    }

    @Override // org.telegram.ui.Cells.q1, android.view.View
    public final void setPressed(boolean z10) {
    }
}
