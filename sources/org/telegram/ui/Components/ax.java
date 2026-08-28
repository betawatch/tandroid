package org.telegram.ui.Components;

import android.os.Build;
import androidx.recyclerview.widget.RecyclerView;
import j$.util.Objects;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class ax extends vy {
    public final /* synthetic */ wy d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ax(wy wyVar) {
        super(wyVar, 1);
        this.d = wyVar;
    }

    @Override // org.telegram.ui.Components.vy, f2.d1
    public final void a(RecyclerView recyclerView, int i9) {
        if (i9 == 0) {
            this.d.b0 = false;
        }
        super.a(recyclerView, i9);
    }

    @Override // org.telegram.ui.Components.vy, f2.d1
    public final void b(RecyclerView recyclerView, int i9, int i10) {
        ig.e eVar;
        wy wyVar = this.d;
        vx vxVar = wyVar.O;
        xw xwVar = wyVar.M;
        wyVar.V(xwVar.I0());
        if (Build.VERSION.SDK_INT >= 31 && (eVar = wyVar.f2) != null) {
            eVar.f(i9, i10);
            wyVar.C();
        }
        super.b(recyclerView, i9, i10);
        if (vxVar == null || wyVar.L.getAdapter() != vxVar) {
            return;
        }
        vx vxVar2 = vxVar.x.a;
        if (vxVar2.B.R.B || vxVar2.A) {
            return;
        }
        if (xwVar.N0() + 20 > vxVar.h()) {
            ux uxVar = vxVar.x;
            Objects.requireNonNull(uxVar);
            AndroidUtilities.runOnUIThread(new ew(uxVar, 1));
        }
    }
}
