package org.telegram.ui;

import android.content.Context;
import java.util.ArrayList;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class je1 extends xe1 {
    public final /* synthetic */ ze1 e3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public je1(ze1 ze1Var, Context context) {
        super(ze1Var, context);
        this.e3 = ze1Var;
    }

    @Override // org.telegram.ui.Components.jl0
    public final boolean S0() {
        ArrayList arrayList = this.e3.b;
        return (getAdapter() == null || this.T1 || (arrayList == null || arrayList.size() != 1 || arrayList.get(0) == null || ((pe1) arrayList.get(0)).c == null || ((pe1) arrayList.get(0)).c.id != 1 ? getAdapter().h() > 1 : getAdapter().h() > 2)) ? false : true;
    }

    @Override // org.telegram.ui.xe1, org.telegram.ui.Components.jl0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.e3.y0();
    }
}
