package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class kn0 extends v4.u0 {
    public final /* synthetic */ xe a;

    public kn0(xe xeVar) {
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
