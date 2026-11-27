// default package

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class g56 extends jc0 {
    public final /* synthetic */ gb0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g56(gb0 gb0Var, Context context) {
        super(context, false);
        this.e = gb0Var;
    }

    @Override // jc0, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(hl.L(Math.min(3, ((i56) this.e.d).x) == 0 ? 0 : bp1.h(r4, 1, 20, 32)), TLObject.FLAG_30), i2);
    }
}
