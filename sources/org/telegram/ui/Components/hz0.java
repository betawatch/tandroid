package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class hz0 extends vu0 {
    public final li.k f0;
    public final /* synthetic */ org.telegram.ui.ActionBar.p6 g0;
    public final /* synthetic */ fz0 h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hz0(Context context, org.telegram.ui.ActionBar.p6 p6Var, fz0 fz0Var) {
        super(context, null);
        this.g0 = p6Var;
        this.h0 = fz0Var;
        this.f0 = new li.k(23);
    }

    @Override // org.telegram.ui.Components.vu0
    public final boolean O() {
        return false;
    }

    @Override // org.telegram.ui.Components.vu0
    public final boolean P() {
        return false;
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (view != this.h0) {
            return super.drawChild(canvas, view, j10);
        }
        canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), org.telegram.messenger.at.e4, 31);
        boolean drawChild = super.drawChild(canvas, view, j10);
        canvas.save();
        RectF rectF = org.telegram.messenger.i0.P;
        rectF.set(0.0f, 0.0f, org.telegram.messenger.i0.L(45.0f), getHeight());
        this.f0.o(canvas, rectF, 0, 1.0f);
        canvas.restore();
        canvas.restore();
        return drawChild;
    }

    @Override // org.telegram.ui.Components.vu0
    public final org.telegram.ui.ActionBar.p6 getResourceProvider() {
        return this.g0;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.q.x, TLObject.FLAG_30);
        fz0 fz0Var = this.h0;
        fz0Var.measure(makeMeasureSpec, i11);
        setMeasuredDimension(View.MeasureSpec.getSize(i10), fz0Var.getMeasuredHeight() + org.telegram.messenger.i0.L(24.0f));
    }
}
