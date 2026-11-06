package di;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.pj0;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class r4 extends pj0 implements f7 {
    public final /* synthetic */ k5 e3;
    public final /* synthetic */ k5 f3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r4(k5 k5Var, Context context, b bVar) {
        super(context, bVar);
        this.f3 = k5Var;
        this.e3 = k5Var;
    }

    @Override // di.f7
    public final void a(int[] iArr) {
        iArr[0] = org.telegram.messenger.g0.L(this.e3.e);
        iArr[1] = getMeasuredHeight();
    }

    @Override // org.telegram.ui.Components.pj0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int i7, int i10) {
        this.f3.n = View.MeasureSpec.getSize(i10);
        super.onMeasure(i7, i10);
    }
}
