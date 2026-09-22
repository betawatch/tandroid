package org.telegram.ui;

import android.content.Context;
import java.util.ArrayList;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class pf1 extends cg1 {
    public final /* synthetic */ eg1 i3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pf1(eg1 eg1Var, Context context) {
        super(eg1Var, context);
        this.i3 = eg1Var;
    }

    @Override // org.telegram.ui.Components.ll0
    public final boolean S0() {
        ArrayList arrayList = this.i3.b;
        return (getAdapter() == null || this.X1 || (arrayList == null || arrayList.size() != 1 || arrayList.get(0) == null || ((vf1) arrayList.get(0)).c == null || ((vf1) arrayList.get(0)).c.id != 1 ? getAdapter().h() > 1 : getAdapter().h() > 2)) ? false : true;
    }

    @Override // org.telegram.ui.cg1, org.telegram.ui.Components.ll0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.i3.y0();
    }
}
