package ai;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes4.dex */
public final class o6 extends f7 {
    public final /* synthetic */ k7 g3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o6(k7 k7Var, Context context, d dVar) {
        super(k7Var, context, dVar, 0);
        this.g3 = k7Var;
    }

    @Override // org.telegram.ui.Components.zl0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int i10, int i11) {
        this.g3.n = View.MeasureSpec.getSize(i11);
        super.onMeasure(i10, i11);
    }
}
