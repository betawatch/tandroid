package org.telegram.ui;

import android.content.Context;
import java.util.ArrayList;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes3.dex */
public final class ce1 extends pe1 {
    public final /* synthetic */ re1 g3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ce1(re1 re1Var, Context context) {
        super(re1Var, context);
        this.g3 = re1Var;
    }

    @Override // org.telegram.ui.Components.jm0
    public final boolean S0() {
        ArrayList arrayList = this.g3.b;
        return (getAdapter() == null || this.V1 || (arrayList == null || arrayList.size() != 1 || arrayList.get(0) == null || ((ie1) arrayList.get(0)).c == null || ((ie1) arrayList.get(0)).c.id != 1 ? getAdapter().h() > 1 : getAdapter().h() > 2)) ? false : true;
    }

    @Override // org.telegram.ui.pe1, org.telegram.ui.Components.jm0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.g3.y0();
    }
}
