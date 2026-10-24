package org.telegram.ui.Wallet;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes4.dex */
public final class a5 extends x5 {
    public final /* synthetic */ o5 l0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a5(o5 o5Var, Context context) {
        super(context);
        this.l0 = o5Var;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        super.onMeasure(i10, makeMeasureSpec);
        o5 o5Var = this.l0;
        if (o5Var.n <= 0 || getMeasuredHeight() <= o5Var.n) {
            return;
        }
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(paddingRight + ((int) ((getMeasuredWidth() - paddingRight) * (Math.max(0, o5Var.n - paddingBottom) / Math.max(1, getMeasuredHeight() - paddingBottom)))), TLObject.FLAG_30), makeMeasureSpec);
    }

    @Override // org.telegram.ui.Wallet.x5
    public final void setStickerStyle(float[] fArr) {
        super.setStickerStyle(fArr);
        o5 o5Var = this.l0;
        o5Var.P0(o5Var.w0);
        o5Var.Q0(fArr);
    }
}
