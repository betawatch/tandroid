package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class by0 extends qt0 {
    public final k4.j g0;
    public final /* synthetic */ org.telegram.ui.ActionBar.e6 h0;
    public final /* synthetic */ zx0 i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public by0(Context context, org.telegram.ui.ActionBar.e6 e6Var, zx0 zx0Var) {
        super(context, null);
        this.h0 = e6Var;
        this.i0 = zx0Var;
        this.g0 = new k4.j(24);
    }

    @Override // org.telegram.ui.Components.qt0
    public final boolean O() {
        return false;
    }

    @Override // org.telegram.ui.Components.qt0
    public final boolean P() {
        return false;
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (view != this.i0) {
            return super.drawChild(canvas, view, j10);
        }
        canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), org.telegram.messenger.hs.e4, 31);
        boolean drawChild = super.drawChild(canvas, view, j10);
        canvas.save();
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set(0.0f, 0.0f, org.telegram.messenger.g0.L(45.0f), getHeight());
        this.g0.w(canvas, rectF, 0, 1.0f);
        canvas.restore();
        canvas.restore();
        return drawChild;
    }

    @Override // org.telegram.ui.Components.qt0
    public final org.telegram.ui.ActionBar.e6 getResourceProvider() {
        return this.h0;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(i3, i10);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.q.x, TLObject.FLAG_30);
        zx0 zx0Var = this.i0;
        zx0Var.measure(makeMeasureSpec, i10);
        setMeasuredDimension(View.MeasureSpec.getSize(i3), zx0Var.getMeasuredHeight() + org.telegram.messenger.g0.L(24.0f));
    }
}
