package org.telegram.ui.Components;

import android.os.Build;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class ow extends jz {
    public final /* synthetic */ kz d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ow(kz kzVar) {
        super(kzVar, 2);
        this.d = kzVar;
    }

    @Override // org.telegram.ui.Components.jz, s4.s0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        ah.h hVar;
        super.b(recyclerView, i10, i11);
        if (Build.VERSION.SDK_INT < 31 || (hVar = this.d.j2) == null) {
            return;
        }
        hVar.f(i10, i11);
    }
}
