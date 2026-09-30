package org.telegram.ui.Components;

import android.os.Build;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes3.dex */
public final class rw extends lz {
    public final /* synthetic */ mz d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rw(mz mzVar) {
        super(mzVar, 2);
        this.d = mzVar;
    }

    @Override // org.telegram.ui.Components.lz, s4.s0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        ah.h hVar;
        super.b(recyclerView, i10, i11);
        if (Build.VERSION.SDK_INT < 31 || (hVar = this.d.j2) == null) {
            return;
        }
        hVar.f(i10, i11);
    }
}
