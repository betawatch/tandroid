package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class j51 extends f2.w {
    public final /* synthetic */ int Q;
    public final /* synthetic */ w61 R;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j51(w61 w61Var, int i10) {
        super(40);
        this.Q = i10;
        this.R = w61Var;
    }

    @Override // f2.j0, f2.w0
    public final void v0(RecyclerView recyclerView, f2.j1 j1Var, int i10) {
        switch (this.Q) {
            case 0:
                try {
                    org.telegram.ui.Components.fx fxVar = new org.telegram.ui.Components.fx(this, recyclerView.getContext(), 2);
                    fxVar.a = i10;
                    w0(fxVar);
                    break;
                } catch (Exception e6) {
                    FileLog.e(e6);
                }
            default:
                try {
                    org.telegram.ui.Components.fx fxVar2 = new org.telegram.ui.Components.fx(this, recyclerView.getContext(), 4);
                    fxVar2.a = i10;
                    w0(fxVar2);
                    break;
                } catch (Exception e10) {
                    FileLog.e(e10);
                    return;
                }
        }
    }
}
