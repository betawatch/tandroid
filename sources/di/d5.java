package di;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class d5 extends View {
    public final /* synthetic */ int a;
    public final /* synthetic */ g5 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d5(g5 g5Var, Context context, int i7) {
        super(context);
        this.a = i7;
        this.b = g5Var;
    }

    @Override // android.view.View
    public final void onMeasure(int i7, int i10) {
        switch (this.a) {
            case 0:
                super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(this.b.d.e), TLObject.FLAG_30));
                break;
            default:
                k5 k5Var = this.b.d;
                int i11 = k5Var.y.J;
                if (i11 >= k5Var.r.getPaddingTop() && !k5Var.R) {
                    i11 = 0;
                }
                super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(i11, TLObject.FLAG_30));
                break;
        }
    }
}
