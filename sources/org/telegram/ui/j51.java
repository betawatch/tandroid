package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class j51 extends f2.w {
    public final /* synthetic */ int Q;
    public final /* synthetic */ x61 R;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j51(x61 x61Var, int i10) {
        super(40);
        this.Q = i10;
        this.R = x61Var;
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
