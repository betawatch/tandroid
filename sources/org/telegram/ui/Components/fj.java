package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes3.dex */
public final class fj extends e71 {
    public final /* synthetic */ jj m3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fj(jj jjVar, Context context, int i10, d dVar, bj bjVar, bj bjVar2, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, i10, 0, false, dVar, bjVar, bjVar2, d6Var);
        this.m3 = jjVar;
    }

    @Override // org.telegram.ui.Components.e71
    public final void D1() {
        jj jjVar = this.m3;
        jjVar.b.W1(jjVar, 0);
    }

    @Override // org.telegram.ui.Components.zl0
    public final boolean F0(float f7) {
        xi xiVar = this.m3.b;
        return f7 >= ((float) ((AndroidUtilities.dp(30.0f) + xiVar.b2[0]) + (!xiVar.g0 ? AndroidUtilities.statusBarHeight : 0)));
    }

    @Override // org.telegram.ui.Components.zl0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        jj jjVar = this.m3;
        jjVar.b.W1(jjVar, 0);
    }
}
