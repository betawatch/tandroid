package org.telegram.ui;

import android.content.Context;
import java.util.ArrayList;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class df1 extends qf1 {
    public final /* synthetic */ sf1 f3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public df1(sf1 sf1Var, Context context) {
        super(sf1Var, context);
        this.f3 = sf1Var;
    }

    @Override // org.telegram.ui.Components.rl0
    public final boolean R0() {
        ArrayList arrayList = this.f3.b;
        return (getAdapter() == null || this.U1 || (arrayList == null || arrayList.size() != 1 || arrayList.get(0) == null || ((jf1) arrayList.get(0)).c == null || ((jf1) arrayList.get(0)).c.id != 1 ? getAdapter().h() > 1 : getAdapter().h() > 2)) ? false : true;
    }

    @Override // org.telegram.ui.qf1, org.telegram.ui.Components.rl0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        super.onLayout(z4, i10, i11, i12, i13);
        this.f3.y0();
    }
}
