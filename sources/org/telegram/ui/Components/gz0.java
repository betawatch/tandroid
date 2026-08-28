package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class gz0 extends xu0 {
    public final org.telegram.ui.s10 s0;
    public final /* synthetic */ org.telegram.ui.ActionBar.b6 t0;
    public final /* synthetic */ ez0 u0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gz0(Context context, org.telegram.ui.ActionBar.b6 b6Var, ez0 ez0Var) {
        super(context, null);
        this.t0 = b6Var;
        this.u0 = ez0Var;
        this.s0 = new org.telegram.ui.s10();
    }

    @Override // org.telegram.ui.Components.xu0
    public final boolean P() {
        return false;
    }

    @Override // org.telegram.ui.Components.xu0
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

    @Override // org.telegram.ui.Components.xu0
    public final org.telegram.ui.ActionBar.b6 getResourceProvider() {
        return this.t0;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(i9, i10);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.x, TLObject.FLAG_30);
        ez0 ez0Var = this.u0;
        ez0Var.measure(makeMeasureSpec, i10);
        setMeasuredDimension(View.MeasureSpec.getSize(i9), ez0Var.getMeasuredHeight() + AndroidUtilities.dp(24.0f));
    }
}
