package org.telegram.ui.Wallet;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes4.dex */
public final class z4 extends x5 {
    public final /* synthetic */ m5 r0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z4(m5 m5Var, Context context, boolean z10) {
        super(context, z10);
        this.r0 = m5Var;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        super.onMeasure(i10, makeMeasureSpec);
        m5 m5Var = this.r0;
        if (m5Var.n <= 0 || getMeasuredHeight() <= m5Var.n) {
            return;
        }
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(paddingRight + ((int) ((getMeasuredWidth() - paddingRight) * (Math.max(0, m5Var.n - paddingBottom) / Math.max(1, getMeasuredHeight() - paddingBottom)))), TLObject.FLAG_30), makeMeasureSpec);
    }

    @Override // org.telegram.ui.Wallet.x5
    public final void setStickerStyle(float[] fArr) {
        super.setStickerStyle(fArr);
        m5 m5Var = this.r0;
        m5Var.N0(m5Var.y0);
        m5Var.O0(fArr);
    }
}
