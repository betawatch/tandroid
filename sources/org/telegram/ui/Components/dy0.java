package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class dy0 extends tt0 {
    public final h6.m f0;
    public final /* synthetic */ org.telegram.ui.ActionBar.g6 g0;
    public final /* synthetic */ by0 h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dy0(Context context, org.telegram.ui.ActionBar.g6 g6Var, by0 by0Var) {
        super(context, null);
        this.g0 = g6Var;
        this.h0 = by0Var;
        this.f0 = new h6.m(28);
    }

    @Override // org.telegram.ui.Components.tt0
    public final boolean O() {
        return false;
    }

    @Override // org.telegram.ui.Components.tt0
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

    @Override // org.telegram.ui.Components.tt0
    public final org.telegram.ui.ActionBar.g6 getResourceProvider() {
        return this.g0;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.q.x, TLObject.FLAG_30);
        by0 by0Var = this.h0;
        by0Var.measure(makeMeasureSpec, i10);
        setMeasuredDimension(View.MeasureSpec.getSize(i7), by0Var.getMeasuredHeight() + org.telegram.messenger.g0.L(24.0f));
    }
}
