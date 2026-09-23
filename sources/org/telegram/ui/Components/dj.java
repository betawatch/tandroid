package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class dj extends d61 {
    public final /* synthetic */ hj f3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dj(hj hjVar, Context context, int i10, d dVar, aj ajVar, aj ajVar2, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, i10, 0, false, dVar, ajVar, ajVar2, d6Var);
        this.f3 = hjVar;
    }

    @Override // org.telegram.ui.Components.d61
    public final void C1() {
        hj hjVar = this.f3;
        hjVar.b.X1(hjVar, 0);
    }

    @Override // org.telegram.ui.Components.ml0
    public final boolean E0(float f7) {
        wi wiVar = this.f3.b;
        return f7 >= ((float) ((AndroidUtilities.dp(30.0f) + wiVar.b2[0]) + (!wiVar.g0 ? AndroidUtilities.statusBarHeight : 0)));
    }

    @Override // org.telegram.ui.Components.ml0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        hj hjVar = this.f3;
        hjVar.b.X1(hjVar, 0);
    }
}
