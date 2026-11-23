package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class mn0 extends v4.u0 {
    public final /* synthetic */ xe a;

    public mn0(xe xeVar) {
        this.a = xeVar;
    }

    @Override // v4.u0
    public final void b(RecyclerView recyclerView, int i7, int i10) {
        xe xeVar = this.a;
        View view = xeVar.u;
        boolean z10 = xeVar.w.I0() != 0;
        Boolean bool = xeVar.x;
        if (bool == null || z10 != bool.booleanValue()) {
            view.animate().cancel();
            view.animate().alpha(z10 ? 1.0f : 0.0f).setDuration(150L).start();
            xeVar.x = Boolean.valueOf(z10);
        }
    }
}
