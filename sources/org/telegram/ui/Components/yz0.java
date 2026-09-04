package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class yz0 extends ov0 {
    public final org.telegram.ui.l20 w0;
    public final /* synthetic */ org.telegram.ui.ActionBar.f6 x0;
    public final /* synthetic */ wz0 y0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yz0(Context context, org.telegram.ui.ActionBar.f6 f6Var, wz0 wz0Var) {
        super(context, null);
        this.x0 = f6Var;
        this.y0 = wz0Var;
        this.w0 = new org.telegram.ui.l20();
    }

    @Override // org.telegram.ui.Components.ov0
    public final boolean P() {
        return false;
    }

    @Override // org.telegram.ui.Components.ov0
    public final boolean Q() {
        return false;
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (view != this.y0) {
            return super.drawChild(canvas, view, j3);
        }
        canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
        boolean drawChild = super.drawChild(canvas, view, j3);
        canvas.save();
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(0.0f, 0.0f, AndroidUtilities.dp(45.0f), getHeight());
        this.w0.b(canvas, rectF, 0, 1.0f);
        canvas.restore();
        canvas.restore();
        return drawChild;
    }

    @Override // org.telegram.ui.Components.ov0
    public final org.telegram.ui.ActionBar.f6 getResourceProvider() {
        return this.x0;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.x, TLObject.FLAG_30);
        wz0 wz0Var = this.y0;
        wz0Var.measure(makeMeasureSpec, i11);
        setMeasuredDimension(View.MeasureSpec.getSize(i10), wz0Var.getMeasuredHeight() + AndroidUtilities.dp(24.0f));
    }
}
