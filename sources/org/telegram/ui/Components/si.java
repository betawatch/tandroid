package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class si extends g61 {
    public final /* synthetic */ wi c3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public si(wi wiVar, Context context, int i10, d dVar, pi piVar, pi piVar2, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, i10, 0, false, dVar, piVar, piVar2, f6Var);
        this.c3 = wiVar;
    }

    @Override // org.telegram.ui.Components.g61
    public final void C1() {
        wi wiVar = this.c3;
        wiVar.b.X1(wiVar, 0);
    }

    @Override // org.telegram.ui.Components.sl0
    public final boolean E0(float f10) {
        li liVar = this.c3.b;
        return f10 >= ((float) ((AndroidUtilities.dp(30.0f) + liVar.Y1[0]) + (!liVar.d0 ? AndroidUtilities.statusBarHeight : 0)));
    }

    @Override // org.telegram.ui.Components.sl0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        super.onLayout(z4, i10, i11, i12, i13);
        wi wiVar = this.c3;
        wiVar.b.X1(wiVar, 0);
    }
}
