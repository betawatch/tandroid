package org.telegram.ui.Wallet;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes4.dex */
public final class y4 extends v5 {
    public final /* synthetic */ l5 r0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y4(l5 l5Var, Context context, boolean z10) {
        super(context, z10);
        this.r0 = l5Var;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        super.onMeasure(i10, makeMeasureSpec);
        l5 l5Var = this.r0;
        if (l5Var.n <= 0 || getMeasuredHeight() <= l5Var.n) {
            return;
        }
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(paddingRight + ((int) ((getMeasuredWidth() - paddingRight) * (Math.max(0, l5Var.n - paddingBottom) / Math.max(1, getMeasuredHeight() - paddingBottom)))), TLObject.FLAG_30), makeMeasureSpec);
    }

    @Override // org.telegram.ui.Wallet.v5
    public final void setStickerStyle(float[] fArr) {
        super.setStickerStyle(fArr);
        l5 l5Var = this.r0;
        l5Var.N0(l5Var.y0);
        l5Var.O0(fArr);
    }
}
