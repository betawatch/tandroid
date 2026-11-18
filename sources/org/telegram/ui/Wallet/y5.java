package org.telegram.ui.Wallet;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes4.dex */
public final class y5 extends View {
    public final /* synthetic */ int a;
    public final /* synthetic */ n6 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y5(n6 n6Var, Context context, int i7) {
        super(context);
        this.a = i7;
        this.b = n6Var;
    }

    @Override // android.view.View
    public final void onMeasure(int i7, int i10) {
        switch (this.a) {
            case 0:
                int size = View.MeasureSpec.getSize(i7);
                n6 n6Var = this.b;
                n6Var.a0.measure(View.MeasureSpec.makeMeasureSpec(Math.max(0, size - org.telegram.messenger.g0.L(24.0f)), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(0, 0));
                setMeasuredDimension(size, org.telegram.messenger.g0.L(36.0f) + n6Var.a0.getMeasuredHeight());
                break;
            default:
                n6 n6Var2 = this.b;
                n6Var2.e.measure(i7, View.MeasureSpec.makeMeasureSpec(0, 0));
                setMeasuredDimension(View.MeasureSpec.getSize(i7), n6Var2.e.getMeasuredHeight());
                break;
        }
    }
}
