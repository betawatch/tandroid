package org.telegram.ui;

import android.content.Context;
import java.util.ArrayList;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class j91 extends u91 {
    public final /* synthetic */ w91 o3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j91(w91 w91Var, Context context) {
        super(w91Var, context);
        this.o3 = w91Var;
    }

    @Override // org.telegram.ui.Components.pj0
    public final boolean R0() {
        ArrayList arrayList = this.o3.b;
        return (getAdapter() == null || this.V1 || (arrayList == null || arrayList.size() != 1 || arrayList.get(0) == null || ((o91) arrayList.get(0)).c == null || ((o91) arrayList.get(0)).c.id != 1 ? getAdapter().b() > 1 : getAdapter().b() > 2)) ? false : true;
    }

    @Override // org.telegram.ui.u91, org.telegram.ui.Components.pj0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        super.onLayout(z9, i7, i10, i11, i12);
        this.o3.C0();
    }
}
