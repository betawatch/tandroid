package ci;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
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
