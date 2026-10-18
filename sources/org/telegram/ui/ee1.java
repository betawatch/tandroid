package org.telegram.ui;

import android.content.Context;
import java.util.ArrayList;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final class ee1 extends re1 {
    public final /* synthetic */ te1 g3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ee1(te1 te1Var, Context context) {
        super(te1Var, context);
        this.g3 = te1Var;
    }

    @Override // org.telegram.ui.Components.im0
    public final boolean S0() {
        ArrayList arrayList = this.g3.b;
        return (getAdapter() == null || this.V1 || (arrayList == null || arrayList.size() != 1 || arrayList.get(0) == null || ((ke1) arrayList.get(0)).c == null || ((ke1) arrayList.get(0)).c.id != 1 ? getAdapter().h() > 1 : getAdapter().h() > 2)) ? false : true;
    }

    @Override // org.telegram.ui.re1, org.telegram.ui.Components.im0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.g3.y0();
    }
}
