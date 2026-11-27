// default package

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class g39 extends d79 {
    public final /* synthetic */ o39 f3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g39(o39 o39Var, Context context, vnb vnbVar) {
        super(context, vnbVar);
        this.f3 = o39Var;
    }

    @Override // d79, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int i, int i2) {
        o39 o39Var = this.f3;
        q37 q37Var = o39Var.K;
        if (q37Var != null) {
            q37Var.measure(i, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i2), 0));
        }
        super.onMeasure(i, i2);
        o39Var.f();
    }
}
