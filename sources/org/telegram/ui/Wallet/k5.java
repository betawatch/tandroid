package org.telegram.ui.Wallet;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes4.dex */
public final class k5 extends f6 {
    public final /* synthetic */ w5 l0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k5(w5 w5Var, Context context) {
        super(context);
        this.l0 = w5Var;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        super.onMeasure(i7, makeMeasureSpec);
        w5 w5Var = this.l0;
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
        w5 w5Var = this.l0;
        w5Var.U0(w5Var.x0);
        w5Var.V0(fArr);
    }
}
