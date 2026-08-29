package org.telegram.ui.Components;

import android.os.Build;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class hw extends ez {
    public final /* synthetic */ fz d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hw(fz fzVar) {
        super(fzVar, 2);
        this.d = fzVar;
    }

    @Override // org.telegram.ui.Components.ez, f2.a1
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        fz fzVar;
        lg.e eVar;
        super.b(recyclerView, i10, i11);
        if (Build.VERSION.SDK_INT < 31 || (eVar = (fzVar = this.d).f2) == null) {
            return;
        }
        eVar.f(i10, i11);
        fzVar.C();
    }
}
