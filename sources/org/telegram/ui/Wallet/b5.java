package org.telegram.ui.Wallet;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes4.dex */
public final class b5 extends x5 {
    public final /* synthetic */ o5 l0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b5(o5 o5Var, Context context) {
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
        o5Var.O0(o5Var.w0);
        o5Var.P0(fArr);
    }
}
