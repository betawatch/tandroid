package ci;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes4.dex */
public final class z4 extends q5 {
    public final /* synthetic */ u5 X2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z4(u5 u5Var, Context context, b bVar) {
        super(u5Var, context, bVar, 0);
        this.X2 = u5Var;
    }

    @Override // org.telegram.ui.Components.im0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int i10, int i11) {
        this.X2.n = View.MeasureSpec.getSize(i11);
        super.onMeasure(i10, i11);
    }
}
