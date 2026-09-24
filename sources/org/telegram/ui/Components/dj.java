package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes3.dex */
public final class dj extends r61 {
    public final /* synthetic */ hj f3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dj(hj hjVar, Context context, int i10, d dVar, aj ajVar, aj ajVar2, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, i10, 0, false, dVar, ajVar, ajVar2, d6Var);
        this.f3 = hjVar;
    }

    @Override // org.telegram.ui.Components.r61
    public final void C1() {
        hj hjVar = this.f3;
        hjVar.b.X1(hjVar, 0);
    }

    @Override // org.telegram.ui.Components.wl0
    public final boolean E0(float f7) {
        wi wiVar = this.f3.b;
        return f7 >= ((float) ((AndroidUtilities.dp(30.0f) + wiVar.b2[0]) + (!wiVar.g0 ? AndroidUtilities.statusBarHeight : 0)));
    }

    @Override // org.telegram.ui.Components.wl0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        hj hjVar = this.f3;
        hjVar.b.X1(hjVar, 0);
    }
}
