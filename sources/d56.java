// default package

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class d56 extends hd0 {
    public final /* synthetic */ ec0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d56(ec0 ec0Var, Context context) {
        super(context, false);
        this.e = ec0Var;
    }

    @Override // hd0, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(gm.L(Math.min(3, ((f56) this.e.d).x) == 0 ? 0 : aq1.h(r4, 1, 20, 32)), TLObject.FLAG_30), i2);
    }
}
