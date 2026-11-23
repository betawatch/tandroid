package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class my0 extends cu0 {
    public final i61 g0;
    public final /* synthetic */ org.telegram.ui.ActionBar.i6 h0;
    public final /* synthetic */ ky0 i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public my0(Context context, org.telegram.ui.ActionBar.i6 i6Var, ky0 ky0Var) {
        super(context, null);
        this.h0 = i6Var;
        this.i0 = ky0Var;
        this.g0 = new i61(1);
    }

    @Override // org.telegram.ui.Components.cu0
    public final boolean O() {
        return false;
    }

    @Override // org.telegram.ui.Components.cu0
    public final boolean P() {
        return false;
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (view != this.i0) {
            return super.drawChild(canvas, view, j3);
        }
        canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), org.telegram.messenger.ks.e4, 31);
        boolean drawChild = super.drawChild(canvas, view, j3);
        canvas.save();
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set(0.0f, 0.0f, org.telegram.messenger.g0.L(45.0f), getHeight());
        this.g0.u(canvas, rectF, 0, 1.0f);
        canvas.restore();
        canvas.restore();
        return drawChild;
    }

    @Override // org.telegram.ui.Components.cu0
    public final org.telegram.ui.ActionBar.i6 getResourceProvider() {
        return this.h0;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.q.x, TLObject.FLAG_30);
        ky0 ky0Var = this.i0;
        ky0Var.measure(makeMeasureSpec, i10);
        setMeasuredDimension(View.MeasureSpec.getSize(i7), ky0Var.getMeasuredHeight() + org.telegram.messenger.g0.L(24.0f));
    }
}
