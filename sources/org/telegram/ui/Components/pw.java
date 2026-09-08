package org.telegram.ui.Components;

import android.os.Build;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class pw extends jz {
    public final /* synthetic */ kz d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pw(kz kzVar) {
        super(kzVar, 2);
        this.d = kzVar;
    }

    @Override // org.telegram.ui.Components.jz, s4.s0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        kz kzVar;
        bh.f fVar;
        super.b(recyclerView, i10, i11);
        if (Build.VERSION.SDK_INT < 31 || (fVar = (kzVar = this.d).j2) == null) {
            return;
        }
        fVar.f(i10, i11);
        kzVar.C();
    }
}
