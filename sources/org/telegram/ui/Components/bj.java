package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes3.dex */
public final class bj extends c71 {
    public final /* synthetic */ fj d3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bj(fj fjVar, Context context, int i10, d dVar, xi xiVar, xi xiVar2, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, i10, 0, false, dVar, xiVar, xiVar2, d6Var);
        this.d3 = fjVar;
    }

    @Override // org.telegram.ui.Components.c71
    public final void D1() {
        fj fjVar = this.d3;
        fjVar.b.b2(fjVar, 0);
    }

    @Override // org.telegram.ui.Components.jm0
    public final boolean E0(float f7) {
        ti tiVar = this.d3.b;
        return f7 >= ((float) ((AndroidUtilities.dp(30.0f) + tiVar.e2[0]) + (!tiVar.g0 ? AndroidUtilities.statusBarHeight : 0)));
    }

    @Override // org.telegram.ui.Components.jm0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        fj fjVar = this.d3;
        fjVar.b.b2(fjVar, 0);
    }
}
