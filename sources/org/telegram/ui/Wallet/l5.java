package org.telegram.ui.Wallet;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class l5 extends View {
    public final /* synthetic */ int a;
    public final /* synthetic */ b6 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l5(b6 b6Var, Context context, int i10) {
        super(context);
        this.a = i10;
        this.b = b6Var;
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        switch (this.a) {
            case 0:
                int size = View.MeasureSpec.getSize(i10);
                b6 b6Var = this.b;
                b6Var.Z.measure(View.MeasureSpec.makeMeasureSpec(Math.max(0, size - org.telegram.messenger.i0.L(24.0f)), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(0, 0));
                setMeasuredDimension(size, org.telegram.messenger.i0.L(36.0f) + b6Var.Z.getMeasuredHeight());
                break;
            default:
                b6 b6Var2 = this.b;
                b6Var2.e.measure(i10, View.MeasureSpec.makeMeasureSpec(0, 0));
                setMeasuredDimension(View.MeasureSpec.getSize(i10), b6Var2.e.getMeasuredHeight());
                break;
        }
    }
}
