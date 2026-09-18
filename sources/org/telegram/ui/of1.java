package org.telegram.ui;

import android.content.Context;
import java.util.ArrayList;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final class of1 extends bg1 {
    public final /* synthetic */ dg1 i3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public of1(dg1 dg1Var, Context context) {
        super(dg1Var, context);
        this.i3 = dg1Var;
    }

    @Override // org.telegram.ui.Components.wl0
    public final boolean T0() {
        ArrayList arrayList = this.i3.b;
        return (getAdapter() == null || this.X1 || (arrayList == null || arrayList.size() != 1 || arrayList.get(0) == null || ((uf1) arrayList.get(0)).c == null || ((uf1) arrayList.get(0)).c.id != 1 ? getAdapter().h() > 1 : getAdapter().h() > 2)) ? false : true;
    }

    @Override // org.telegram.ui.bg1, org.telegram.ui.Components.wl0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.i3.y0();
    }
}
