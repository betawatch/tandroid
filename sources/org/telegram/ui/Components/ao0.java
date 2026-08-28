package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class ao0 extends f2.d1 {
    public final /* synthetic */ ve a;

    public ao0(ve veVar) {
        this.a = veVar;
    }

    @Override // f2.d1
    public final void b(RecyclerView recyclerView, int i9, int i10) {
        ve veVar = this.a;
        View view = veVar.u;
        boolean z10 = veVar.w.I0() != 0;
        Boolean bool = veVar.x;
        if (bool == null || z10 != bool.booleanValue()) {
            view.animate().cancel();
            view.animate().alpha(z10 ? 1.0f : 0.0f).setDuration(150L).start();
            veVar.x = Boolean.valueOf(z10);
        }
    }
}
