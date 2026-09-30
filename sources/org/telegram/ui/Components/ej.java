package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes3.dex */
public final class ej extends t61 {
    public final /* synthetic */ ij f3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ej(ij ijVar, Context context, int i10, d dVar, aj ajVar, aj ajVar2, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, i10, 0, false, dVar, ajVar, ajVar2, d6Var);
        this.f3 = ijVar;
    }

    @Override // org.telegram.ui.Components.t61
    public final void C1() {
        ij ijVar = this.f3;
        ijVar.b.X1(ijVar, 0);
    }

    @Override // org.telegram.ui.Components.yl0
    public final boolean E0(float f7) {
        wi wiVar = this.f3.b;
        return f7 >= ((float) ((AndroidUtilities.dp(30.0f) + wiVar.b2[0]) + (!wiVar.g0 ? AndroidUtilities.statusBarHeight : 0)));
    }

    @Override // org.telegram.ui.Components.yl0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        ij ijVar = this.f3;
        ijVar.b.X1(ijVar, 0);
    }
}
