package org.telegram.ui;

import android.content.Context;
import java.util.ArrayList;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class l91 extends x91 {
    public final /* synthetic */ z91 o3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l91(z91 z91Var, Context context) {
        super(z91Var, context);
        this.o3 = z91Var;
    }

    @Override // org.telegram.ui.Components.pj0
    public final boolean R0() {
        ArrayList arrayList = this.o3.b;
        return (getAdapter() == null || this.V1 || (arrayList == null || arrayList.size() != 1 || arrayList.get(0) == null || ((r91) arrayList.get(0)).c == null || ((r91) arrayList.get(0)).c.id != 1 ? getAdapter().b() > 1 : getAdapter().b() > 2)) ? false : true;
    }

    @Override // org.telegram.ui.x91, org.telegram.ui.Components.pj0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        super.onLayout(z9, i7, i10, i11, i12);
        this.o3.C0();
    }
}
