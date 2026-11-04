package org.telegram.ui.Wallet;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class h5 extends View {
    public final /* synthetic */ int a;
    public final /* synthetic */ w5 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h5(w5 w5Var, Context context, int i3) {
        super(context);
        this.a = i3;
        this.b = w5Var;
    }

    @Override // android.view.View
    public final void onMeasure(int i3, int i10) {
        switch (this.a) {
            case 0:
                int size = View.MeasureSpec.getSize(i3);
                w5 w5Var = this.b;
                w5Var.a0.measure(View.MeasureSpec.makeMeasureSpec(Math.max(0, size - org.telegram.messenger.g0.L(24.0f)), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(0, 0));
                setMeasuredDimension(size, org.telegram.messenger.g0.L(36.0f) + w5Var.a0.getMeasuredHeight());
                break;
            default:
                w5 w5Var2 = this.b;
                w5Var2.e.measure(i3, View.MeasureSpec.makeMeasureSpec(0, 0));
                setMeasuredDimension(View.MeasureSpec.getSize(i3), w5Var2.e.getMeasuredHeight());
                break;
        }
    }
}
