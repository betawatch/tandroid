package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
import j$.util.Objects;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class vw extends qy {
    public final /* synthetic */ ry d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vw(ry ryVar) {
        super(ryVar, 1);
        this.d = ryVar;
    }

    @Override // org.telegram.ui.Components.qy, v4.u0
    public final void a(RecyclerView recyclerView, int i7) {
        if (i7 == 0) {
            this.d.g0 = false;
        }
        super.a(recyclerView, i7);
    }

    @Override // org.telegram.ui.Components.qy, v4.u0
    public final void b(RecyclerView recyclerView, int i7, int i10) {
        ry ryVar = this.d;
        sw swVar = ryVar.R;
        ryVar.V(swVar.I0());
        super.b(recyclerView, i7, i10);
        qx qxVar = ryVar.T;
        if (qxVar == null || ryVar.Q.getAdapter() != qxVar) {
            return;
        }
        qx qxVar2 = qxVar.y.a;
        if (qxVar2.G.W.G || qxVar2.F) {
            return;
        }
        if (swVar.N0() + 20 > qxVar.b()) {
            px pxVar = qxVar.y;
            Objects.requireNonNull(pxVar);
            org.telegram.messenger.g0.g3(new zv(pxVar, 1));
        }
    }
}
