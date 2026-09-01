package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class ti extends i61 {
    public final /* synthetic */ xi c3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ti(xi xiVar, Context context, int i10, d dVar, qi qiVar, qi qiVar2, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, i10, 0, false, dVar, qiVar, qiVar2, g6Var);
        this.c3 = xiVar;
    }

    @Override // org.telegram.ui.Components.i61
    public final void C1() {
        xi xiVar = this.c3;
        xiVar.b.X1(xiVar, 0);
    }

    @Override // org.telegram.ui.Components.tl0
    public final boolean E0(float f10) {
        mi miVar = this.c3.b;
        return f10 >= ((float) ((AndroidUtilities.dp(30.0f) + miVar.Y1[0]) + (!miVar.d0 ? AndroidUtilities.statusBarHeight : 0)));
    }

    @Override // org.telegram.ui.Components.tl0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        super.onLayout(z4, i10, i11, i12, i13);
        xi xiVar = this.c3;
        xiVar.b.X1(xiVar, 0);
    }
}
