package bi;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes4.dex */
public final class a6 extends r6 {
    public final /* synthetic */ w6 X2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a6(w6 w6Var, Context context, b bVar) {
        super(w6Var, context, bVar, 0);
        this.X2 = w6Var;
    }

    @Override // org.telegram.ui.Components.mm0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int i10, int i11) {
        this.X2.n = View.MeasureSpec.getSize(i11);
        super.onMeasure(i10, i11);
    }
}
