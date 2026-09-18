package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class cj extends f61 {
    public final /* synthetic */ gj f3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cj(gj gjVar, Context context, int i10, d dVar, zi ziVar, zi ziVar2, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, i10, 0, false, dVar, ziVar, ziVar2, f6Var);
        this.f3 = gjVar;
    }

    @Override // org.telegram.ui.Components.f61
    public final void D1() {
        gj gjVar = this.f3;
        gjVar.b.X1(gjVar, 0);
    }

    @Override // org.telegram.ui.Components.ml0
    public final boolean F0(float f7) {
        vi viVar = this.f3.b;
        return f7 >= ((float) ((AndroidUtilities.dp(30.0f) + viVar.b2[0]) + (!viVar.g0 ? AndroidUtilities.statusBarHeight : 0)));
    }

    @Override // org.telegram.ui.Components.ml0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        gj gjVar = this.f3;
        gjVar.b.X1(gjVar, 0);
    }
}
