package ai;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final class p6 extends g7 {
    public final /* synthetic */ l7 X2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p6(l7 l7Var, Context context, d dVar) {
        super(l7Var, context, dVar, 0);
        this.X2 = l7Var;
    }

    @Override // org.telegram.ui.Components.qm0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int i10, int i11) {
        this.X2.n = View.MeasureSpec.getSize(i11);
        super.onMeasure(i10, i11);
    }
}
