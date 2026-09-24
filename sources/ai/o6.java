package ai;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes4.dex */
public final class o6 extends f7 {
    public final /* synthetic */ k7 Z2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o6(k7 k7Var, Context context, d dVar) {
        super(k7Var, context, dVar, 0);
        this.Z2 = k7Var;
    }

    @Override // org.telegram.ui.Components.wl0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int i10, int i11) {
        this.Z2.n = View.MeasureSpec.getSize(i11);
        super.onMeasure(i10, i11);
    }
}
