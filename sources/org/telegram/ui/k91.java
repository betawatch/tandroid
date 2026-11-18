package org.telegram.ui;

import android.content.Context;
import java.util.ArrayList;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class k91 extends w91 {
    public final /* synthetic */ y91 p3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k91(y91 y91Var, Context context) {
        super(y91Var, context);
        this.p3 = y91Var;
    }

    @Override // org.telegram.ui.Components.ck0
    public final boolean R0() {
        ArrayList arrayList = this.p3.b;
        return (getAdapter() == null || this.W1 || (arrayList == null || arrayList.size() != 1 || arrayList.get(0) == null || ((q91) arrayList.get(0)).c == null || ((q91) arrayList.get(0)).c.id != 1 ? getAdapter().b() > 1 : getAdapter().b() > 2)) ? false : true;
    }

    @Override // org.telegram.ui.w91, org.telegram.ui.Components.ck0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        super.onLayout(z10, i7, i10, i11, i12);
        this.p3.C0();
    }
}
