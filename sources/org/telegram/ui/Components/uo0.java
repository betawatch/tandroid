package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class uo0 extends f2.z0 {
    public final /* synthetic */ ve a;

    public uo0(ve veVar) {
        this.a = veVar;
    }

    @Override // f2.z0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        ve veVar = this.a;
        View view = veVar.u;
        boolean z4 = veVar.w.I0() != 0;
        Boolean bool = veVar.x;
        if (bool == null || z4 != bool.booleanValue()) {
            view.animate().cancel();
            view.animate().alpha(z4 ? 1.0f : 0.0f).setDuration(150L).start();
            veVar.x = Boolean.valueOf(z4);
        }
    }
}
