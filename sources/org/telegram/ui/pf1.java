package org.telegram.ui;

import android.content.Context;
import java.util.ArrayList;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class pf1 extends cg1 {
    public final /* synthetic */ eg1 i3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pf1(eg1 eg1Var, Context context) {
        super(eg1Var, context);
        this.i3 = eg1Var;
    }

    @Override // org.telegram.ui.Components.ll0
    public final boolean R0() {
        ArrayList arrayList = this.i3.b;
        return (getAdapter() == null || this.X1 || (arrayList == null || arrayList.size() != 1 || arrayList.get(0) == null || ((vf1) arrayList.get(0)).c == null || ((vf1) arrayList.get(0)).c.id != 1 ? getAdapter().h() > 1 : getAdapter().h() > 2)) ? false : true;
    }

    @Override // org.telegram.ui.cg1, org.telegram.ui.Components.ll0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.i3.y0();
    }
}
