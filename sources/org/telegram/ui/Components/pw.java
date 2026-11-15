package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
import j$.util.Objects;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class pw extends ky {
    public final /* synthetic */ ly d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pw(ly lyVar) {
        super(lyVar, 1);
        this.d = lyVar;
    }

    @Override // org.telegram.ui.Components.ky, v4.t0
    public final void a(RecyclerView recyclerView, int i7) {
        if (i7 == 0) {
            this.d.g0 = false;
        }
        super.a(recyclerView, i7);
    }

    @Override // org.telegram.ui.Components.ky, v4.t0
    public final void b(RecyclerView recyclerView, int i7, int i10) {
        ly lyVar = this.d;
        mw mwVar = lyVar.R;
        lyVar.V(mwVar.I0());
        super.b(recyclerView, i7, i10);
        lx lxVar = lyVar.T;
        if (lxVar == null || lyVar.Q.getAdapter() != lxVar) {
            return;
        }
        lx lxVar2 = lxVar.y.a;
        if (lxVar2.G.W.G || lxVar2.F) {
            return;
        }
        if (mwVar.N0() + 20 > lxVar.b()) {
            kx kxVar = lxVar.y;
            Objects.requireNonNull(kxVar);
            org.telegram.messenger.g0.h3(new uv(kxVar, 1));
        }
    }
}
