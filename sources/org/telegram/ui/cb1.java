package org.telegram.ui;

import android.content.Context;
import java.util.ArrayList;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class cb1 extends nb1 {
    public final /* synthetic */ pb1 o3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cb1(pb1 pb1Var, Context context) {
        super(pb1Var, context);
        this.o3 = pb1Var;
    }

    @Override // org.telegram.ui.Components.tk0
    public final boolean R0() {
        ArrayList arrayList = this.o3.b;
        return (getAdapter() == null || this.V1 || (arrayList == null || arrayList.size() != 1 || arrayList.get(0) == null || ((hb1) arrayList.get(0)).c == null || ((hb1) arrayList.get(0)).c.id != 1 ? getAdapter().b() > 1 : getAdapter().b() > 2)) ? false : true;
    }

    @Override // org.telegram.ui.nb1, org.telegram.ui.Components.tk0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.o3.B0();
    }
}
