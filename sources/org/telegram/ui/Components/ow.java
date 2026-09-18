package org.telegram.ui.Components;

import android.os.Build;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
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
        ah.i iVar;
        super.b(recyclerView, i10, i11);
        if (Build.VERSION.SDK_INT < 31 || (iVar = this.d.j2) == null) {
            return;
        }
        iVar.f(i10, i11);
    }
}
