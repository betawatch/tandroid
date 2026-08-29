package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class ui extends u51 {
    public final /* synthetic */ yi b3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ui(yi yiVar, Context context, int i10, d dVar, ri riVar, ri riVar2, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, i10, 0, false, dVar, riVar, riVar2, c6Var);
        this.b3 = yiVar;
    }

    @Override // org.telegram.ui.Components.u51
    public final void C1() {
        yi yiVar = this.b3;
        yiVar.b.X1(yiVar, 0);
    }

    @Override // org.telegram.ui.Components.jl0
    public final boolean E0(float f9) {
        ni niVar = this.b3.b;
        return f9 >= ((float) ((AndroidUtilities.dp(30.0f) + niVar.X1[0]) + (!niVar.c0 ? AndroidUtilities.statusBarHeight : 0)));
    }

    @Override // org.telegram.ui.Components.jl0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        yi yiVar = this.b3;
        yiVar.b.X1(yiVar, 0);
    }
}
