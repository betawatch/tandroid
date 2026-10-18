package org.telegram.ui.Wallet;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes4.dex */
public final class w4 extends View {
    public final /* synthetic */ int a;
    public final /* synthetic */ m5 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w4(m5 m5Var, Context context, int i10) {
        super(context);
        this.a = i10;
        this.b = m5Var;
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        switch (this.a) {
            case 0:
                int size = View.MeasureSpec.getSize(i10);
                m5 m5Var = this.b;
                m5Var.a0.measure(View.MeasureSpec.makeMeasureSpec(Math.max(0, size - AndroidUtilities.dp(24.0f)), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(0, 0));
                setMeasuredDimension(size, AndroidUtilities.dp(36.0f) + m5Var.a0.getMeasuredHeight());
                break;
            default:
                m5 m5Var2 = this.b;
                m5Var2.d.measure(i10, View.MeasureSpec.makeMeasureSpec(0, 0));
                setMeasuredDimension(View.MeasureSpec.getSize(i10), m5Var2.d.getMeasuredHeight());
                break;
        }
    }
}
