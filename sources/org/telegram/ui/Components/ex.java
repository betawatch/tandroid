package org.telegram.ui.Components;

import android.os.Build;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class ex extends zz {
    public final /* synthetic */ a00 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ex(a00 a00Var) {
        super(a00Var, 2);
        this.d = a00Var;
    }

    @Override // org.telegram.ui.Components.zz, s4.t0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        ah.h hVar;
        super.b(recyclerView, i10, i11);
        if (Build.VERSION.SDK_INT < 31 || (hVar = this.d.j2) == null) {
            return;
        }
        hVar.f(i10, i11);
    }
}
