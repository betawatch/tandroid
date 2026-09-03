package lh;

import android.content.Context;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.h61;
import org.telegram.ui.Components.or0;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class h3 extends h61 {
    public final /* synthetic */ or0 c3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h3(Context context, int i10, eg.p1 p1Var, f3 f3Var, f3 f3Var2, g6 g6Var, or0 or0Var) {
        super(context, i10, 0, false, p1Var, f3Var, f3Var2, g6Var, 3, 1);
        this.c3 = or0Var;
    }

    @Override // org.telegram.ui.Components.sl0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        super.onLayout(z4, i10, i11, i12, i13);
        this.c3.o();
    }
}
