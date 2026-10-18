package org.telegram.ui.Wallet;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes4.dex */
public final class a5 extends x5 {
    public final /* synthetic */ n5 p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a5(n5 n5Var, Context context) {
        super(context);
        this.p0 = n5Var;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        super.onMeasure(i10, makeMeasureSpec);
        n5 n5Var = this.p0;
        if (n5Var.n <= 0 || getMeasuredHeight() <= n5Var.n) {
            return;
        }
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(paddingRight + ((int) ((getMeasuredWidth() - paddingRight) * (Math.max(0, n5Var.n - paddingBottom) / Math.max(1, getMeasuredHeight() - paddingBottom)))), TLObject.FLAG_30), makeMeasureSpec);
    }

    @Override // org.telegram.ui.Wallet.x5
    public final void setStickerStyle(float[] fArr) {
        super.setStickerStyle(fArr);
        n5 n5Var = this.p0;
        n5Var.N0(n5Var.w0);
        n5Var.O0(fArr);
    }
}
