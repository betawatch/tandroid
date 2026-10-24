package org.telegram.ui;

import android.content.Context;
import java.util.ArrayList;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class ie1 extends we1 {
    public final /* synthetic */ ye1 j3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ie1(ye1 ye1Var, Context context) {
        super(ye1Var, context);
        this.j3 = ye1Var;
    }

    @Override // org.telegram.ui.Components.mm0
    public final boolean T0() {
        ArrayList arrayList = this.j3.b;
        return (getAdapter() == null || this.V1 || (arrayList == null || arrayList.size() != 1 || arrayList.get(0) == null || ((oe1) arrayList.get(0)).c == null || ((oe1) arrayList.get(0)).c.id != 1 ? getAdapter().h() > 1 : getAdapter().h() > 2)) ? false : true;
    }

    @Override // org.telegram.ui.we1, org.telegram.ui.Components.mm0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.j3.x0();
    }
}
