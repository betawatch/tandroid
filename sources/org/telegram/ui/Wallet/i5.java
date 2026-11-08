package org.telegram.ui.Wallet;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes4.dex */
public final class i5 extends View {
    public final /* synthetic */ int a;
    public final /* synthetic */ x5 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i5(x5 x5Var, Context context, int i7) {
        super(context);
        this.a = i7;
        this.b = x5Var;
    }

    @Override // android.view.View
    public final void onMeasure(int i7, int i10) {
        switch (this.a) {
            case 0:
                int size = View.MeasureSpec.getSize(i7);
                x5 x5Var = this.b;
                x5Var.Z.measure(View.MeasureSpec.makeMeasureSpec(Math.max(0, size - org.telegram.messenger.g0.L(24.0f)), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(0, 0));
                setMeasuredDimension(size, org.telegram.messenger.g0.L(36.0f) + x5Var.Z.getMeasuredHeight());
                break;
            default:
                x5 x5Var2 = this.b;
                x5Var2.e.measure(i7, View.MeasureSpec.makeMeasureSpec(0, 0));
                setMeasuredDimension(View.MeasureSpec.getSize(i7), x5Var2.e.getMeasuredHeight());
                break;
        }
    }
}
