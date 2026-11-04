package org.telegram.ui.Wallet;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class k5 extends f6 {
    public final /* synthetic */ w5 m0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k5(w5 w5Var, Context context) {
        super(context);
        this.m0 = w5Var;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i3, int i10) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        super.onMeasure(i3, makeMeasureSpec);
        w5 w5Var = this.m0;
        if (w5Var.r <= 0 || getMeasuredHeight() <= w5Var.r) {
            return;
        }
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(paddingRight + ((int) ((getMeasuredWidth() - paddingRight) * (Math.max(0, w5Var.r - paddingBottom) / Math.max(1, getMeasuredHeight() - paddingBottom)))), TLObject.FLAG_30), makeMeasureSpec);
    }

    @Override // org.telegram.ui.Wallet.f6
    public final void setStickerStyle(float[] fArr) {
        super.setStickerStyle(fArr);
        w5 w5Var = this.m0;
        w5Var.U0(w5Var.y0);
        w5Var.V0(fArr);
    }
}
