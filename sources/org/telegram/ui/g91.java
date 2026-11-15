package org.telegram.ui;

import android.content.Context;
import java.util.ArrayList;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class g91 extends s91 {
    public final /* synthetic */ u91 p3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g91(u91 u91Var, Context context) {
        super(u91Var, context);
        this.p3 = u91Var;
    }

    @Override // org.telegram.ui.Components.uj0
    public final boolean R0() {
        ArrayList arrayList = this.p3.b;
        return (getAdapter() == null || this.W1 || (arrayList == null || arrayList.size() != 1 || arrayList.get(0) == null || ((m91) arrayList.get(0)).c == null || ((m91) arrayList.get(0)).c.id != 1 ? getAdapter().b() > 1 : getAdapter().b() > 2)) ? false : true;
    }

    @Override // org.telegram.ui.s91, org.telegram.ui.Components.uj0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        super.onLayout(z10, i7, i10, i11, i12);
        this.p3.C0();
    }
}
