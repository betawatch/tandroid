package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class bj extends j71 {
    public final /* synthetic */ fj g3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bj(fj fjVar, Context context, int i10, d dVar, xi xiVar, xi xiVar2, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, i10, 0, false, dVar, xiVar, xiVar2, g6Var);
        this.g3 = fjVar;
    }

    @Override // org.telegram.ui.Components.mm0
    public final boolean E0(float f7) {
        ti tiVar = this.g3.b;
        return f7 >= ((float) ((AndroidUtilities.dp(30.0f) + tiVar.e2[0]) + (!tiVar.g0 ? AndroidUtilities.statusBarHeight : 0)));
    }

    @Override // org.telegram.ui.Components.j71
    public final void I1() {
        fj fjVar = this.g3;
        fjVar.b.f2(fjVar, 0);
    }

    @Override // org.telegram.ui.Components.mm0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        fj fjVar = this.g3;
        fjVar.b.f2(fjVar, 0);
    }
}
