package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class cj extends d61 {
    public final /* synthetic */ gj f3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cj(gj gjVar, Context context, int i10, d dVar, zi ziVar, zi ziVar2, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, i10, 0, false, dVar, ziVar, ziVar2, f6Var);
        this.f3 = gjVar;
    }

    @Override // org.telegram.ui.Components.d61
    public final void B1() {
        gj gjVar = this.f3;
        gjVar.b.X1(gjVar, 0);
    }

    @Override // org.telegram.ui.Components.ll0
    public final boolean E0(float f7) {
        vi viVar = this.f3.b;
        return f7 >= ((float) ((AndroidUtilities.dp(30.0f) + viVar.b2[0]) + (!viVar.g0 ? AndroidUtilities.statusBarHeight : 0)));
    }

    @Override // org.telegram.ui.Components.ll0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        gj gjVar = this.f3;
        gjVar.b.X1(gjVar, 0);
    }
}
