// default package

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes3.dex */
public final class i3a extends d79 implements j6b {
    public final /* synthetic */ z3a f3;
    public final /* synthetic */ z3a g3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i3a(z3a z3aVar, Context context, x53 x53Var) {
        super(context, x53Var);
        this.g3 = z3aVar;
        this.f3 = z3aVar;
    }

    @Override // j6b
    public final void b(int[] iArr) {
        iArr[0] = hl.L(this.f3.e);
        iArr[1] = getMeasuredHeight();
    }

    @Override // d79, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int i, int i2) {
        this.g3.n = View.MeasureSpec.getSize(i2);
        super.onMeasure(i, i2);
    }
}
