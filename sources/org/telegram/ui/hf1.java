package org.telegram.ui;

import android.content.Context;
import java.util.ArrayList;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class hf1 extends uf1 {
    public final /* synthetic */ wf1 i3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hf1(wf1 wf1Var, Context context) {
        super(wf1Var, context);
        this.i3 = wf1Var;
    }

    @Override // org.telegram.ui.Components.ml0
    public final boolean S0() {
        ArrayList arrayList = this.i3.b;
        return (getAdapter() == null || this.X1 || (arrayList == null || arrayList.size() != 1 || arrayList.get(0) == null || ((nf1) arrayList.get(0)).c == null || ((nf1) arrayList.get(0)).c.id != 1 ? getAdapter().h() > 1 : getAdapter().h() > 2)) ? false : true;
    }

    @Override // org.telegram.ui.uf1, org.telegram.ui.Components.ml0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.i3.y0();
    }
}
