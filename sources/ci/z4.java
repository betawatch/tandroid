package ci;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes4.dex */
public final class z4 extends q5 {
    public final /* synthetic */ u5 X2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z4(u5 u5Var, Context context, b bVar) {
        super(u5Var, context, bVar, 0);
        this.X2 = u5Var;
    }

    @Override // org.telegram.ui.Components.jm0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int i10, int i11) {
        this.X2.n = View.MeasureSpec.getSize(i11);
        super.onMeasure(i10, i11);
    }
}
