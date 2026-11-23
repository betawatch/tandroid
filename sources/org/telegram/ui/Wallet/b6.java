package org.telegram.ui.Wallet;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes4.dex */
public final class b6 extends x6 {
    public final /* synthetic */ n6 m0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b6(n6 n6Var, Context context) {
        super(context);
        this.m0 = n6Var;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        super.onMeasure(i7, makeMeasureSpec);
        n6 n6Var = this.m0;
        if (n6Var.r <= 0 || getMeasuredHeight() <= n6Var.r) {
            return;
        }
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(paddingRight + ((int) ((getMeasuredWidth() - paddingRight) * (Math.max(0, n6Var.r - paddingBottom) / Math.max(1, getMeasuredHeight() - paddingBottom)))), TLObject.FLAG_30), makeMeasureSpec);
    }

    @Override // org.telegram.ui.Wallet.x6
    public final void setStickerStyle(float[] fArr) {
        super.setStickerStyle(fArr);
        n6 n6Var = this.m0;
        n6Var.Z0(n6Var.A0);
        n6Var.a1(fArr);
    }
}
