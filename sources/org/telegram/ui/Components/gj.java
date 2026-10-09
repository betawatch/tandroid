package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class gj extends k71 {
    public final /* synthetic */ kj d3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gj(kj kjVar, Context context, int i10, d dVar, cj cjVar, cj cjVar2, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, i10, 0, false, dVar, cjVar, cjVar2, e6Var);
        this.d3 = kjVar;
    }

    @Override // org.telegram.ui.Components.k71
    public final void D1() {
        kj kjVar = this.d3;
        kjVar.b.b2(kjVar, 0);
    }

    @Override // org.telegram.ui.Components.qm0
    public final boolean E0(float f7) {
        yi yiVar = this.d3.b;
        return f7 >= ((float) ((AndroidUtilities.dp(30.0f) + yiVar.e2[0]) + (!yiVar.g0 ? AndroidUtilities.statusBarHeight : 0)));
    }

    @Override // org.telegram.ui.Components.qm0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        kj kjVar = this.d3;
        kjVar.b.b2(kjVar, 0);
    }
}
