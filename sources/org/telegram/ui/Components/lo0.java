package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class lo0 extends f2.a1 {
    public final /* synthetic */ ye a;

    public lo0(ye yeVar) {
        this.a = yeVar;
    }

    @Override // f2.a1
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        ye yeVar = this.a;
        View view = yeVar.u;
        boolean z10 = yeVar.w.I0() != 0;
        Boolean bool = yeVar.x;
        if (bool == null || z10 != bool.booleanValue()) {
            view.animate().cancel();
            view.animate().alpha(z10 ? 1.0f : 0.0f).setDuration(150L).start();
            yeVar.x = Boolean.valueOf(z10);
        }
    }
}
