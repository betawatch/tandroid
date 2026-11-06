package org.telegram.ui;

import android.content.Context;
import java.util.ArrayList;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class i91 extends t91 {
    public final /* synthetic */ v91 o3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i91(v91 v91Var, Context context) {
        super(v91Var, context);
        this.o3 = v91Var;
    }

    @Override // org.telegram.ui.Components.pj0
    public final boolean R0() {
        ArrayList arrayList = this.o3.b;
        return (getAdapter() == null || this.V1 || (arrayList == null || arrayList.size() != 1 || arrayList.get(0) == null || ((n91) arrayList.get(0)).c == null || ((n91) arrayList.get(0)).c.id != 1 ? getAdapter().b() > 1 : getAdapter().b() > 2)) ? false : true;
    }

    @Override // org.telegram.ui.t91, org.telegram.ui.Components.pj0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        super.onLayout(z9, i7, i10, i11, i12);
        this.o3.C0();
    }
}
