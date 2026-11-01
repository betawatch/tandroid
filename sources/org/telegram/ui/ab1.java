package org.telegram.ui;

import android.content.Context;
import java.util.ArrayList;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class ab1 extends lb1 {
    public final /* synthetic */ nb1 o3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ab1(nb1 nb1Var, Context context) {
        super(nb1Var, context);
        this.o3 = nb1Var;
    }

    @Override // org.telegram.ui.Components.uk0
    public final boolean R0() {
        ArrayList arrayList = this.o3.b;
        return (getAdapter() == null || this.V1 || (arrayList == null || arrayList.size() != 1 || arrayList.get(0) == null || ((fb1) arrayList.get(0)).c == null || ((fb1) arrayList.get(0)).c.id != 1 ? getAdapter().b() > 1 : getAdapter().b() > 2)) ? false : true;
    }

    @Override // org.telegram.ui.lb1, org.telegram.ui.Components.uk0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.o3.C0();
    }
}
