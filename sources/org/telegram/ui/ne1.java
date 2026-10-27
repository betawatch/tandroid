package org.telegram.ui;

import android.content.Context;
import java.util.ArrayList;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class ne1 extends af1 {
    public final /* synthetic */ cf1 p3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ne1(cf1 cf1Var, Context context) {
        super(cf1Var, context);
        this.p3 = cf1Var;
    }

    @Override // org.telegram.ui.Components.nm0
    public final boolean S0() {
        ArrayList arrayList = this.p3.b;
        return (getAdapter() == null || this.V1 || (arrayList == null || arrayList.size() != 1 || arrayList.get(0) == null || ((te1) arrayList.get(0)).c == null || ((te1) arrayList.get(0)).c.id != 1 ? getAdapter().h() > 1 : getAdapter().h() > 2)) ? false : true;
    }

    @Override // org.telegram.ui.af1, org.telegram.ui.Components.nm0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.p3.y0();
    }
}
