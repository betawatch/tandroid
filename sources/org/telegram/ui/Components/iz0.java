package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class iz0 extends zu0 {
    public final org.telegram.ui.v10 s0;
    public final /* synthetic */ org.telegram.ui.ActionBar.c6 t0;
    public final /* synthetic */ gz0 u0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iz0(Context context, org.telegram.ui.ActionBar.c6 c6Var, gz0 gz0Var) {
        super(context, null);
        this.t0 = c6Var;
        this.u0 = gz0Var;
        this.s0 = new org.telegram.ui.v10();
    }

    @Override // org.telegram.ui.Components.zu0
    public final boolean P() {
        return false;
    }

    @Override // org.telegram.ui.Components.zu0
    public final boolean Q() {
        return false;
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (view != this.u0) {
            return super.drawChild(canvas, view, j10);
        }
        canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
        boolean drawChild = super.drawChild(canvas, view, j10);
        canvas.save();
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(0.0f, 0.0f, AndroidUtilities.dp(45.0f), getHeight());
        this.s0.b(canvas, rectF, 0, 1.0f);
        canvas.restore();
        canvas.restore();
        return drawChild;
    }

    @Override // org.telegram.ui.Components.zu0
    public final org.telegram.ui.ActionBar.c6 getResourceProvider() {
        return this.t0;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.x, TLObject.FLAG_30);
        gz0 gz0Var = this.u0;
        gz0Var.measure(makeMeasureSpec, i11);
        setMeasuredDimension(View.MeasureSpec.getSize(i10), gz0Var.getMeasuredHeight() + AndroidUtilities.dp(24.0f));
    }
}
