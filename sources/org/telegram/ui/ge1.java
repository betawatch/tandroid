package org.telegram.ui;

import android.content.Context;
import java.util.ArrayList;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class ge1 extends ue1 {
    public final /* synthetic */ we1 e3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ge1(we1 we1Var, Context context) {
        super(we1Var, context);
        this.e3 = we1Var;
    }

    @Override // org.telegram.ui.Components.wk0
    public final boolean S0() {
        ArrayList arrayList = this.e3.b;
        return (getAdapter() == null || this.T1 || (arrayList == null || arrayList.size() != 1 || arrayList.get(0) == null || ((me1) arrayList.get(0)).c == null || ((me1) arrayList.get(0)).c.id != 1 ? getAdapter().h() > 1 : getAdapter().h() > 2)) ? false : true;
    }

    @Override // org.telegram.ui.ue1, org.telegram.ui.Components.wk0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        super.onLayout(z10, i9, i10, i11, i12);
        this.e3.x0();
    }
}
