// default package

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class d36 extends hc0 {
    public final /* synthetic */ eb0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d36(eb0 eb0Var, Context context) {
        super(context, false);
        this.e = eb0Var;
    }

    @Override // hc0, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(gl.L(Math.min(3, ((f36) this.e.d).x) == 0 ? 0 : oo1.h(r4, 1, 20, 32)), TLObject.FLAG_30), i2);
    }
}
