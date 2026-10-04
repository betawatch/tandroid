package org.telegram.ui;

import android.content.Context;
import java.util.ArrayList;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final class jf1 extends wf1 {
    public final /* synthetic */ yf1 p3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jf1(yf1 yf1Var, Context context) {
        super(yf1Var, context);
        this.p3 = yf1Var;
    }

    @Override // org.telegram.ui.Components.zl0
    public final boolean T0() {
        ArrayList arrayList = this.p3.b;
        return (getAdapter() == null || this.X1 || (arrayList == null || arrayList.size() != 1 || arrayList.get(0) == null || ((pf1) arrayList.get(0)).c == null || ((pf1) arrayList.get(0)).c.id != 1 ? getAdapter().h() > 1 : getAdapter().h() > 2)) ? false : true;
    }

    @Override // org.telegram.ui.wf1, org.telegram.ui.Components.zl0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.p3.y0();
    }
}
