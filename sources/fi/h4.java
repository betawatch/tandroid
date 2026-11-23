package fi;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.ek0;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes4.dex */
public final class h4 extends ek0 implements w6 {
    public final /* synthetic */ b5 f3;
    public final /* synthetic */ b5 g3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h4(b5 b5Var, Context context, b bVar) {
        super(context, bVar);
        this.g3 = b5Var;
        this.f3 = b5Var;
    }

    @Override // fi.w6
    public final void a(int[] iArr) {
        iArr[0] = org.telegram.messenger.g0.L(this.f3.e);
        iArr[1] = getMeasuredHeight();
    }

    @Override // org.telegram.ui.Components.ek0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int i7, int i10) {
        this.g3.n = View.MeasureSpec.getSize(i10);
        super.onMeasure(i7, i10);
    }
}
