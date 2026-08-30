package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class c51 extends f2.w {
    public final /* synthetic */ int Q;
    public final /* synthetic */ q61 R;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c51(q61 q61Var, int i10) {
        super(40);
        this.Q = i10;
        this.R = q61Var;
    }

    @Override // f2.i0, f2.v0
    public final void v0(RecyclerView recyclerView, f2.i1 i1Var, int i10) {
        switch (this.Q) {
            case 0:
                try {
                    org.telegram.ui.Components.dx dxVar = new org.telegram.ui.Components.dx(this, recyclerView.getContext(), 2);
                    dxVar.a = i10;
                    w0(dxVar);
                    break;
                } catch (Exception e) {
                    FileLog.e(e);
                }
            default:
                try {
                    org.telegram.ui.Components.dx dxVar2 = new org.telegram.ui.Components.dx(this, recyclerView.getContext(), 4);
                    dxVar2.a = i10;
                    w0(dxVar2);
                    break;
                } catch (Exception e6) {
                    FileLog.e(e6);
                    return;
                }
        }
    }
}
