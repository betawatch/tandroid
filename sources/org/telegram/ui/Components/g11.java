package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class g11 extends vw0 {
    public final org.telegram.ui.w10 l0;
    public final /* synthetic */ org.telegram.ui.ActionBar.u6 m0;
    public final /* synthetic */ e11 n0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g11(Context context, org.telegram.ui.ActionBar.u6 u6Var, e11 e11Var) {
        super(context, null);
        this.m0 = u6Var;
        this.n0 = e11Var;
        this.l0 = new org.telegram.ui.w10();
    }

    @Override // org.telegram.ui.Components.vw0
    public final boolean O() {
        return false;
    }

    @Override // org.telegram.ui.Components.vw0
    public final boolean P() {
        return false;
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (view != this.n0) {
            return super.drawChild(canvas, view, j10);
        }
        canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
        boolean drawChild = super.drawChild(canvas, view, j10);
        canvas.save();
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(0.0f, 0.0f, AndroidUtilities.dp(45.0f), getHeight());
        this.l0.b(canvas, rectF, 0, 1.0f);
        canvas.restore();
        canvas.restore();
        return drawChild;
    }

    @Override // org.telegram.ui.Components.vw0
    public final org.telegram.ui.ActionBar.u6 getResourceProvider() {
        return this.m0;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.x, TLObject.FLAG_30);
        e11 e11Var = this.n0;
        e11Var.measure(makeMeasureSpec, i11);
        setMeasuredDimension(View.MeasureSpec.getSize(i10), e11Var.getMeasuredHeight() + AndroidUtilities.dp(24.0f));
    }
}
