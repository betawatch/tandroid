package org.telegram.ui.Components;

import android.os.Build;
import androidx.recyclerview.widget.RecyclerView;
import j$.util.Objects;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class dy extends zz {
    public final /* synthetic */ a00 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dy(a00 a00Var) {
        super(a00Var, 1);
        this.d = a00Var;
    }

    @Override // org.telegram.ui.Components.zz, s4.t0
    public final void a(RecyclerView recyclerView, int i10) {
        if (i10 == 0) {
            this.d.f0 = false;
        }
        super.a(recyclerView, i10);
    }

    @Override // org.telegram.ui.Components.zz, s4.t0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        ah.h hVar;
        a00 a00Var = this.d;
        zy zyVar = a00Var.S;
        zx zxVar = a00Var.Q;
        a00Var.U(zxVar.I0());
        if (Build.VERSION.SDK_INT >= 31 && (hVar = a00Var.j2) != null) {
            hVar.f(i10, i11);
        }
        super.b(recyclerView, i10, i11);
        if (zyVar == null || a00Var.P.getAdapter() != zyVar) {
            return;
        }
        zy zyVar2 = zyVar.x.a;
        if (zyVar2.F.V.F || zyVar2.E) {
            return;
        }
        if (zxVar.N0() + 20 > zyVar.h()) {
            yy yyVar = zyVar.x;
            Objects.requireNonNull(yyVar);
            AndroidUtilities.runOnUIThread(new hx(yyVar, 1));
        }
    }
}
