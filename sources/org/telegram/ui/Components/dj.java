package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class dj extends h71 {
    public final /* synthetic */ hj d3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dj(hj hjVar, Context context, int i10, d dVar, zi ziVar, zi ziVar2, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, i10, 0, false, dVar, ziVar, ziVar2, c6Var);
        this.d3 = hjVar;
    }

    @Override // org.telegram.ui.Components.h71
    public final void D1() {
        hj hjVar = this.d3;
        hjVar.b.b2(hjVar, 0);
    }

    @Override // org.telegram.ui.Components.mm0
    public final boolean E0(float f7) {
        vi viVar = this.d3.b;
        return f7 >= ((float) ((AndroidUtilities.dp(30.0f) + viVar.e2[0]) + (!viVar.g0 ? AndroidUtilities.statusBarHeight : 0)));
    }

    @Override // org.telegram.ui.Components.mm0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        hj hjVar = this.d3;
        hjVar.b.b2(hjVar, 0);
    }
}
