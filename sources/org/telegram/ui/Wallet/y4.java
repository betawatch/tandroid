package org.telegram.ui.Wallet;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class y4 extends w5 {
    public final /* synthetic */ m5 l0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y4(m5 m5Var, Context context) {
        super(context);
        this.l0 = m5Var;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        super.onMeasure(i10, makeMeasureSpec);
        m5 m5Var = this.l0;
        if (m5Var.r <= 0 || getMeasuredHeight() <= m5Var.r) {
            return;
        }
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(paddingRight + ((int) ((getMeasuredWidth() - paddingRight) * (Math.max(0, m5Var.r - paddingBottom) / Math.max(1, getMeasuredHeight() - paddingBottom)))), TLObject.FLAG_30), makeMeasureSpec);
    }

    @Override // org.telegram.ui.Wallet.w5
    public final void setStickerStyle(float[] fArr) {
        super.setStickerStyle(fArr);
        m5 m5Var = this.l0;
        m5Var.Q0(m5Var.x0);
        m5Var.R0(fArr);
    }
}
