package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class je1 extends org.telegram.ui.Cells.t1 {
    public final Path Fe;
    public final Paint Ge;
    public final /* synthetic */ int He;
    public final /* synthetic */ int Ie;
    public final /* synthetic */ int Je;
    public final /* synthetic */ le1 Ke;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public je1(le1 le1Var, Context context, int i10, org.telegram.ui.ActionBar.f6 f6Var, int i11, int i12, int i13) {
        super(context, i10, false, null, f6Var);
        this.Ke = le1Var;
        this.He = i11;
        this.Ie = i12;
        this.Je = i13;
        this.Fe = new Path();
        this.Ge = new Paint(1);
    }

    @Override // org.telegram.ui.Cells.t1
    public final void Y1(Canvas canvas) {
        this.i6 = 0;
        this.j6 = this.Y5.size() - 1;
        super.Y1(canvas);
    }

    @Override // org.telegram.ui.Cells.t1, android.view.View
    public final void onDraw(Canvas canvas) {
        canvas.save();
        int O2 = O2(this.He);
        float H2 = H2(O2);
        float G2 = G2(O2);
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(getPollButtonsLeft(), H2, getPollButtonsRight(), G2);
        Path path = this.Fe;
        path.rewind();
        path.addRoundRect(rectF, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), Path.Direction.CW);
        Paint paint = this.Ge;
        paint.setColor(0);
        paint.setShadowLayer(AndroidUtilities.dp(2.0f), 0.0f, AndroidUtilities.dp(0.66f), org.telegram.ui.ActionBar.j6.l1(this.Ke.x * 0.2f, -16777216));
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), paint);
        canvas.clipPath(path);
        S1(canvas);
        canvas.restore();
    }

    @Override // org.telegram.ui.Cells.t1, android.view.View
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(this.Ie, this.Je);
    }

    @Override // org.telegram.ui.Cells.t1, android.view.View
    public final void setPressed(boolean z10) {
    }
}
