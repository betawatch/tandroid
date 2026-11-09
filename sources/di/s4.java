package di;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.qj0;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class s4 extends qj0 implements g7 {
    public final /* synthetic */ l5 e3;
    public final /* synthetic */ l5 f3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s4(l5 l5Var, Context context, b bVar) {
        super(context, bVar);
        this.f3 = l5Var;
        this.e3 = l5Var;
    }

    @Override // di.g7
    public final void a(int[] iArr) {
        iArr[0] = org.telegram.messenger.g0.L(this.e3.e);
        iArr[1] = getMeasuredHeight();
    }

    @Override // org.telegram.ui.Components.qj0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int i7, int i10) {
        this.f3.n = View.MeasureSpec.getSize(i10);
        super.onMeasure(i7, i10);
    }
}
