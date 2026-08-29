package org.telegram.ui.Components;

import android.os.Build;
import androidx.recyclerview.widget.RecyclerView;
import j$.util.Objects;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class hx extends ez {
    public final /* synthetic */ fz d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hx(fz fzVar) {
        super(fzVar, 1);
        this.d = fzVar;
    }

    @Override // org.telegram.ui.Components.ez, f2.a1
    public final void a(RecyclerView recyclerView, int i10) {
        if (i10 == 0) {
            this.d.b0 = false;
        }
        super.a(recyclerView, i10);
    }

    @Override // org.telegram.ui.Components.ez, f2.a1
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        lg.e eVar;
        fz fzVar = this.d;
        ey eyVar = fzVar.O;
        ex exVar = fzVar.M;
        fzVar.W(exVar.I0());
        if (Build.VERSION.SDK_INT >= 31 && (eVar = fzVar.f2) != null) {
            eVar.f(i10, i11);
            fzVar.C();
        }
        super.b(recyclerView, i10, i11);
        if (eyVar == null || fzVar.L.getAdapter() != eyVar) {
            return;
        }
        ey eyVar2 = eyVar.x.a;
        if (eyVar2.B.R.B || eyVar2.A) {
            return;
        }
        if (exVar.N0() + 20 > eyVar.h()) {
            dy dyVar = eyVar.x;
            Objects.requireNonNull(dyVar);
            AndroidUtilities.runOnUIThread(new kw(dyVar, 1));
        }
    }
}
