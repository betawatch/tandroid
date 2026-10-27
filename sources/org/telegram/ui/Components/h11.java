package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class h11 extends ww0 {
    public final org.telegram.ui.y10 l0;
    public final /* synthetic */ org.telegram.ui.ActionBar.u6 m0;
    public final /* synthetic */ f11 n0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h11(Context context, org.telegram.ui.ActionBar.u6 u6Var, f11 f11Var) {
        super(context, null);
        this.m0 = u6Var;
        this.n0 = f11Var;
        this.l0 = new org.telegram.ui.y10();
    }

    @Override // org.telegram.ui.Components.ww0
    public final boolean O() {
        return false;
    }

    @Override // org.telegram.ui.Components.ww0
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

    @Override // org.telegram.ui.Components.ww0
    public final org.telegram.ui.ActionBar.u6 getResourceProvider() {
        return this.m0;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.x, TLObject.FLAG_30);
        f11 f11Var = this.n0;
        f11Var.measure(makeMeasureSpec, i11);
        setMeasuredDimension(View.MeasureSpec.getSize(i10), f11Var.getMeasuredHeight() + AndroidUtilities.dp(24.0f));
    }
}
