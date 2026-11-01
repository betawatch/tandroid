package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class zn0 extends s4.s0 {
    public final /* synthetic */ ie a;

    public zn0(ie ieVar) {
        this.a = ieVar;
    }

    @Override // s4.s0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        ie ieVar = this.a;
        View view = ieVar.u;
        boolean z10 = ieVar.w.I0() != 0;
        Boolean bool = ieVar.x;
        if (bool == null || z10 != bool.booleanValue()) {
            view.animate().cancel();
            view.animate().alpha(z10 ? 1.0f : 0.0f).setDuration(150L).start();
            ieVar.x = Boolean.valueOf(z10);
        }
    }
}
