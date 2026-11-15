package fi;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.uj0;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class j4 extends uj0 implements z6 {
    public final /* synthetic */ c5 f3;
    public final /* synthetic */ c5 g3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j4(c5 c5Var, Context context, b bVar) {
        super(context, bVar);
        this.g3 = c5Var;
        this.f3 = c5Var;
    }

    @Override // fi.z6
    public final void a(int[] iArr) {
        iArr[0] = org.telegram.messenger.g0.L(this.f3.e);
        iArr[1] = getMeasuredHeight();
    }

    @Override // org.telegram.ui.Components.uj0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int i7, int i10) {
        this.g3.n = View.MeasureSpec.getSize(i10);
        super.onMeasure(i7, i10);
    }
}
