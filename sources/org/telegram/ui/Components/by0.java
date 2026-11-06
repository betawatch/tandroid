package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class by0 extends rt0 {
    public final h6.m f0;
    public final /* synthetic */ org.telegram.ui.ActionBar.f6 g0;
    public final /* synthetic */ zx0 h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public by0(Context context, org.telegram.ui.ActionBar.f6 f6Var, zx0 zx0Var) {
        super(context, null);
        this.g0 = f6Var;
        this.h0 = zx0Var;
        this.f0 = new h6.m(28);
    }

    @Override // org.telegram.ui.Components.rt0
    public final boolean O() {
        return false;
    }

    @Override // org.telegram.ui.Components.rt0
    public final boolean P() {
        return false;
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (view != this.h0) {
            return super.drawChild(canvas, view, j3);
        }
        canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), org.telegram.messenger.qs.e4, 31);
        boolean drawChild = super.drawChild(canvas, view, j3);
        canvas.save();
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set(0.0f, 0.0f, org.telegram.messenger.g0.L(45.0f), getHeight());
        this.f0.m(canvas, rectF, 0, 1.0f);
        canvas.restore();
        canvas.restore();
        return drawChild;
    }

    @Override // org.telegram.ui.Components.rt0
    public final org.telegram.ui.ActionBar.f6 getResourceProvider() {
        return this.g0;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.q.x, TLObject.FLAG_30);
        zx0 zx0Var = this.h0;
        zx0Var.measure(makeMeasureSpec, i10);
        setMeasuredDimension(View.MeasureSpec.getSize(i7), zx0Var.getMeasuredHeight() + org.telegram.messenger.g0.L(24.0f));
    }
}
