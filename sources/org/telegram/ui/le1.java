package org.telegram.ui;

import android.content.Context;
import java.util.ArrayList;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class le1 extends ye1 {
    public final /* synthetic */ af1 p3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public le1(af1 af1Var, Context context) {
        super(af1Var, context);
        this.p3 = af1Var;
    }

    @Override // org.telegram.ui.Components.mm0
    public final boolean S0() {
        ArrayList arrayList = this.p3.b;
        return (getAdapter() == null || this.V1 || (arrayList == null || arrayList.size() != 1 || arrayList.get(0) == null || ((re1) arrayList.get(0)).c == null || ((re1) arrayList.get(0)).c.id != 1 ? getAdapter().h() > 1 : getAdapter().h() > 2)) ? false : true;
    }

    @Override // org.telegram.ui.ye1, org.telegram.ui.Components.mm0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.p3.y0();
    }
}
