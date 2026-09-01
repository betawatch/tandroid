package lh;

import android.content.Context;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.i61;
import org.telegram.ui.Components.pr0;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final class h3 extends i61 {
    public final /* synthetic */ pr0 c3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h3(Context context, int i10, eg.p1 p1Var, f3 f3Var, f3 f3Var2, g6 g6Var, pr0 pr0Var) {
        super(context, i10, 0, false, p1Var, f3Var, f3Var2, g6Var, 3, 1);
        this.c3 = pr0Var;
    }

    @Override // org.telegram.ui.Components.tl0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        super.onLayout(z4, i10, i11, i12, i13);
        this.c3.o();
    }
}
