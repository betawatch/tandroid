package org.telegram.ui.Components;

import android.os.Build;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class pw extends kz {
    public final /* synthetic */ lz d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pw(lz lzVar) {
        super(lzVar, 2);
        this.d = lzVar;
    }

    @Override // org.telegram.ui.Components.kz, s4.s0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        ah.h hVar;
        super.b(recyclerView, i10, i11);
        if (Build.VERSION.SDK_INT < 31 || (hVar = this.d.j2) == null) {
            return;
        }
        hVar.f(i10, i11);
    }
}
