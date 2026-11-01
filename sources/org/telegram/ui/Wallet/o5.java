package org.telegram.ui.Wallet;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class o5 extends l6 {
    public final /* synthetic */ b6 l0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o5(b6 b6Var, Context context) {
        super(context);
        this.l0 = b6Var;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        super.onMeasure(i10, makeMeasureSpec);
        b6 b6Var = this.l0;
        if (b6Var.r <= 0 || getMeasuredHeight() <= b6Var.r) {
            return;
        }
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(paddingRight + ((int) ((getMeasuredWidth() - paddingRight) * (Math.max(0, b6Var.r - paddingBottom) / Math.max(1, getMeasuredHeight() - paddingBottom)))), TLObject.FLAG_30), makeMeasureSpec);
    }

    @Override // org.telegram.ui.Wallet.l6
    public final void setStickerStyle(float[] fArr) {
        super.setStickerStyle(fArr);
        b6 b6Var = this.l0;
        b6Var.U0(b6Var.x0);
        b6Var.V0(fArr);
    }
}
