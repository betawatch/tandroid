package fi;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.ck0;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes4.dex */
public final class h4 extends ck0 implements w6 {
    public final /* synthetic */ a5 f3;
    public final /* synthetic */ a5 g3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h4(a5 a5Var, Context context, b bVar) {
        super(context, bVar);
        this.g3 = a5Var;
        this.f3 = a5Var;
    }

    @Override // fi.w6
    public final void a(int[] iArr) {
        iArr[0] = org.telegram.messenger.g0.L(this.f3.e);
        iArr[1] = getMeasuredHeight();
    }

    @Override // org.telegram.ui.Components.ck0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int i7, int i10) {
        this.g3.n = View.MeasureSpec.getSize(i10);
        super.onMeasure(i7, i10);
    }
}
