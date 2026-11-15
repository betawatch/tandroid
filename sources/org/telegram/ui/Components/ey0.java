package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class ey0 extends st0 {
    public final h6.m g0;
    public final /* synthetic */ org.telegram.ui.ActionBar.e6 h0;
    public final /* synthetic */ cy0 i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ey0(Context context, org.telegram.ui.ActionBar.e6 e6Var, cy0 cy0Var) {
        super(context, null);
        this.h0 = e6Var;
        this.i0 = cy0Var;
        this.g0 = new h6.m(29);
    }

    @Override // org.telegram.ui.Components.st0
    public final boolean O() {
        return false;
    }

    @Override // org.telegram.ui.Components.st0
    public final boolean P() {
        return false;
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (view != this.i0) {
            return super.drawChild(canvas, view, j3);
        }
        canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), org.telegram.messenger.ns.e4, 31);
        boolean drawChild = super.drawChild(canvas, view, j3);
        canvas.save();
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set(0.0f, 0.0f, org.telegram.messenger.g0.L(45.0f), getHeight());
        this.g0.m(canvas, rectF, 0, 1.0f);
        canvas.restore();
        canvas.restore();
        return drawChild;
    }

    @Override // org.telegram.ui.Components.st0
    public final org.telegram.ui.ActionBar.e6 getResourceProvider() {
        return this.h0;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.q.x, TLObject.FLAG_30);
        cy0 cy0Var = this.i0;
        cy0Var.measure(makeMeasureSpec, i10);
        setMeasuredDimension(View.MeasureSpec.getSize(i7), cy0Var.getMeasuredHeight() + org.telegram.messenger.g0.L(24.0f));
    }
}
