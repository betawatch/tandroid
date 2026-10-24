package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class y01 extends ow0 {
    public final org.telegram.ui.w10 w0;
    public final /* synthetic */ org.telegram.ui.ActionBar.g6 x0;
    public final /* synthetic */ w01 y0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y01(Context context, org.telegram.ui.ActionBar.g6 g6Var, w01 w01Var) {
        super(context, null);
        this.x0 = g6Var;
        this.y0 = w01Var;
        this.w0 = new org.telegram.ui.w10();
    }

    @Override // org.telegram.ui.Components.ow0
    public final boolean O() {
        return false;
    }

    @Override // org.telegram.ui.Components.ow0
    public final boolean P() {
        return false;
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (view != this.y0) {
            return super.drawChild(canvas, view, j10);
        }
        canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
        boolean drawChild = super.drawChild(canvas, view, j10);
        canvas.save();
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(0.0f, 0.0f, AndroidUtilities.dp(45.0f), getHeight());
        this.w0.b(canvas, rectF, 0, 1.0f);
        canvas.restore();
        canvas.restore();
        return drawChild;
    }

    @Override // org.telegram.ui.Components.ow0
    public final org.telegram.ui.ActionBar.g6 getResourceProvider() {
        return this.x0;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.x, TLObject.FLAG_30);
        w01 w01Var = this.y0;
        w01Var.measure(makeMeasureSpec, i11);
        setMeasuredDimension(View.MeasureSpec.getSize(i10), w01Var.getMeasuredHeight() + AndroidUtilities.dp(24.0f));
    }
}
