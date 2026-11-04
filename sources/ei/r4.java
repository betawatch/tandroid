package ei;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.tj0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class r4 extends tj0 implements g7 {
    public final /* synthetic */ k5 f3;
    public final /* synthetic */ k5 g3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r4(k5 k5Var, Context context, b bVar) {
        super(context, bVar);
        this.g3 = k5Var;
        this.f3 = k5Var;
    }

    @Override // ei.g7
    public final void a(int[] iArr) {
        iArr[0] = org.telegram.messenger.g0.L(this.f3.e);
        iArr[1] = getMeasuredHeight();
    }

    @Override // org.telegram.ui.Components.tj0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int i3, int i10) {
        this.g3.n = View.MeasureSpec.getSize(i10);
        super.onMeasure(i3, i10);
    }
}
