package org.telegram.ui.Components;

import android.os.Build;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class nw extends lz {
    public final /* synthetic */ mz d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nw(mz mzVar) {
        super(mzVar, 2);
        this.d = mzVar;
    }

    @Override // org.telegram.ui.Components.lz, f2.a1
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        mz mzVar;
        og.e eVar;
        super.b(recyclerView, i10, i11);
        if (Build.VERSION.SDK_INT < 31 || (eVar = (mzVar = this.d).g2) == null) {
            return;
        }
        eVar.f(i10, i11);
        mzVar.C();
    }
}
