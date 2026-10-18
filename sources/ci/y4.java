package ci;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes4.dex */
public final class y4 extends p5 {
    public final /* synthetic */ t5 X2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y4(t5 t5Var, Context context, b bVar) {
        super(t5Var, context, bVar, 0);
        this.X2 = t5Var;
    }

    @Override // org.telegram.ui.Components.im0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int i10, int i11) {
        this.X2.n = View.MeasureSpec.getSize(i11);
        super.onMeasure(i10, i11);
    }
}
