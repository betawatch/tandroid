package org.telegram.ui.Wallet;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes4.dex */
public final class j5 extends View {
    public final /* synthetic */ int a;
    public final /* synthetic */ y5 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j5(y5 y5Var, Context context, int i7) {
        super(context);
        this.a = i7;
        this.b = y5Var;
    }

    @Override // android.view.View
    public final void onMeasure(int i7, int i10) {
        switch (this.a) {
            case 0:
                int size = View.MeasureSpec.getSize(i7);
                y5 y5Var = this.b;
                y5Var.a0.measure(View.MeasureSpec.makeMeasureSpec(Math.max(0, size - org.telegram.messenger.g0.L(24.0f)), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(0, 0));
                setMeasuredDimension(size, org.telegram.messenger.g0.L(36.0f) + y5Var.a0.getMeasuredHeight());
                break;
            default:
                y5 y5Var2 = this.b;
                y5Var2.e.measure(i7, View.MeasureSpec.makeMeasureSpec(0, 0));
                setMeasuredDimension(View.MeasureSpec.getSize(i7), y5Var2.e.getMeasuredHeight());
                break;
        }
    }
}
