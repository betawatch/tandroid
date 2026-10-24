package ci;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
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
