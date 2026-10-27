package di;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class y4 extends p5 {
    public final /* synthetic */ t5 h3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y4(t5 t5Var, Context context, b bVar) {
        super(t5Var, context, bVar, 0);
        this.h3 = t5Var;
    }

    @Override // org.telegram.ui.Components.nm0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int i10, int i11) {
        this.h3.n = View.MeasureSpec.getSize(i11);
        super.onMeasure(i10, i11);
    }
}
