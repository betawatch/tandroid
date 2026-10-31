package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class gz0 extends uu0 {
    public final li.k f0;
    public final /* synthetic */ org.telegram.ui.ActionBar.p6 g0;
    public final /* synthetic */ ez0 h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gz0(Context context, org.telegram.ui.ActionBar.p6 p6Var, ez0 ez0Var) {
        super(context, null);
        this.g0 = p6Var;
        this.h0 = ez0Var;
        this.f0 = new li.k(23);
    }

    @Override // org.telegram.ui.Components.uu0
    public final boolean O() {
        return false;
    }

    @Override // org.telegram.ui.Components.uu0
    public final boolean P() {
        return false;
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (view != this.h0) {
            return super.drawChild(canvas, view, j10);
        }
        canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), org.telegram.messenger.zs.e4, 31);
        boolean drawChild = super.drawChild(canvas, view, j10);
        canvas.save();
        RectF rectF = org.telegram.messenger.i0.P;
        rectF.set(0.0f, 0.0f, org.telegram.messenger.i0.L(45.0f), getHeight());
        this.f0.o(canvas, rectF, 0, 1.0f);
        canvas.restore();
        canvas.restore();
        return drawChild;
    }

    @Override // org.telegram.ui.Components.uu0
    public final org.telegram.ui.ActionBar.p6 getResourceProvider() {
        return this.g0;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.q.x, TLObject.FLAG_30);
        ez0 ez0Var = this.h0;
        ez0Var.measure(makeMeasureSpec, i11);
        setMeasuredDimension(View.MeasureSpec.getSize(i10), ez0Var.getMeasuredHeight() + org.telegram.messenger.i0.L(24.0f));
    }
}
