package org.telegram.ui;

import android.content.Context;
import java.util.ArrayList;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class i91 extends u91 {
    public final /* synthetic */ w91 p3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i91(w91 w91Var, Context context) {
        super(w91Var, context);
        this.p3 = w91Var;
    }

    @Override // org.telegram.ui.Components.ek0
    public final boolean R0() {
        ArrayList arrayList = this.p3.b;
        return (getAdapter() == null || this.W1 || (arrayList == null || arrayList.size() != 1 || arrayList.get(0) == null || ((o91) arrayList.get(0)).c == null || ((o91) arrayList.get(0)).c.id != 1 ? getAdapter().b() > 1 : getAdapter().b() > 2)) ? false : true;
    }

    @Override // org.telegram.ui.u91, org.telegram.ui.Components.ek0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        super.onLayout(z10, i7, i10, i11, i12);
        this.p3.C0();
    }
}
