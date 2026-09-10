package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class fj extends r61 {
    public final /* synthetic */ jj f3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fj(jj jjVar, Context context, int i10, e eVar, cj cjVar, cj cjVar2, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, i10, 0, false, eVar, cjVar, cjVar2, f6Var);
        this.f3 = jjVar;
    }

    @Override // org.telegram.ui.Components.r61
    public final void B1() {
        jj jjVar = this.f3;
        jjVar.b.X1(jjVar, 0);
    }

    @Override // org.telegram.ui.Components.vl0
    public final boolean E0(float f7) {
        yi yiVar = this.f3.b;
        return f7 >= ((float) ((AndroidUtilities.dp(30.0f) + yiVar.b2[0]) + (!yiVar.g0 ? AndroidUtilities.statusBarHeight : 0)));
    }

    @Override // org.telegram.ui.Components.vl0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        jj jjVar = this.f3;
        jjVar.b.X1(jjVar, 0);
    }
}
