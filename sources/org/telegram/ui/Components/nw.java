package org.telegram.ui.Components;

import android.os.Build;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
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
