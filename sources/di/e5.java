package di;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class e5 extends View {
    public final /* synthetic */ int a;
    public final /* synthetic */ h5 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e5(h5 h5Var, Context context, int i7) {
        super(context);
        this.a = i7;
        this.b = h5Var;
    }

    @Override // android.view.View
    public final void onMeasure(int i7, int i10) {
        switch (this.a) {
            case 0:
                super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(this.b.d.e), TLObject.FLAG_30));
                break;
            default:
                l5 l5Var = this.b.d;
                int i11 = l5Var.y.J;
                if (i11 >= l5Var.r.getPaddingTop() && !l5Var.R) {
                    i11 = 0;
                }
                super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(i11, TLObject.FLAG_30));
                break;
        }
    }
}
