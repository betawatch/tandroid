package ci;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes4.dex */
public final class y4 extends p5 {
    public final /* synthetic */ t5 a3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y4(t5 t5Var, Context context, b bVar) {
        super(t5Var, context, bVar, 0);
        this.a3 = t5Var;
    }

    @Override // org.telegram.ui.Components.mm0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int i10, int i11) {
        this.a3.n = View.MeasureSpec.getSize(i11);
        super.onMeasure(i10, i11);
    }
}
