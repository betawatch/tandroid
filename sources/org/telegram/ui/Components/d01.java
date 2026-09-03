package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class d01 extends pv0 {
    public final org.telegram.ui.h20 t0;
    public final /* synthetic */ org.telegram.ui.ActionBar.g6 u0;
    public final /* synthetic */ b01 v0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d01(Context context, org.telegram.ui.ActionBar.g6 g6Var, b01 b01Var) {
        super(context, null);
        this.u0 = g6Var;
        this.v0 = b01Var;
        this.t0 = new org.telegram.ui.h20();
    }

    @Override // org.telegram.ui.Components.pv0
    public final boolean P() {
        return false;
    }

    @Override // org.telegram.ui.Components.pv0
    public final boolean Q() {
        return false;
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (view != this.v0) {
            return super.drawChild(canvas, view, j10);
        }
        canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
        boolean drawChild = super.drawChild(canvas, view, j10);
        canvas.save();
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(0.0f, 0.0f, AndroidUtilities.dp(45.0f), getHeight());
        this.t0.b(canvas, rectF, 0, 1.0f);
        canvas.restore();
        canvas.restore();
        return drawChild;
    }

    @Override // org.telegram.ui.Components.pv0
    public final org.telegram.ui.ActionBar.g6 getResourceProvider() {
        return this.u0;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.x, TLObject.FLAG_30);
        b01 b01Var = this.v0;
        b01Var.measure(makeMeasureSpec, i11);
        setMeasuredDimension(View.MeasureSpec.getSize(i10), b01Var.getMeasuredHeight() + AndroidUtilities.dp(24.0f));
    }
}
