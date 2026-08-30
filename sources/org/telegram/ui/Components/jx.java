package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class jx extends f2.w {
    public final /* synthetic */ kz Q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jx(kz kzVar) {
        super(8);
        this.Q = kzVar;
    }

    @Override // f2.i0, f2.v0
    public final void v0(RecyclerView recyclerView, f2.i1 i1Var, int i10) {
        try {
            dx dxVar = new dx(this, recyclerView.getContext(), 1);
            dxVar.a = i10;
            w0(dxVar);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }
}
