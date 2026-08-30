package kh;

import android.content.Context;
import org.telegram.ui.Components.g61;
import org.telegram.ui.Components.or0;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class h3 extends g61 {
    public final /* synthetic */ or0 c3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h3(Context context, int i10, dg.r1 r1Var, f3 f3Var, f3 f3Var2, org.telegram.ui.ActionBar.f6 f6Var, or0 or0Var) {
        super(context, i10, 0, false, r1Var, f3Var, f3Var2, f6Var, 3, 1);
        this.c3 = or0Var;
    }

    @Override // org.telegram.ui.Components.sl0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        super.onLayout(z4, i10, i11, i12, i13);
        this.c3.o();
    }
}
