package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class o51 extends s4.s {
    public final /* synthetic */ int Q;
    public final /* synthetic */ a71 R;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o51(a71 a71Var, int i10) {
        super(40);
        this.Q = i10;
        this.R = a71Var;
    }

    @Override // s4.c0, s4.o0
    public final void v0(RecyclerView recyclerView, s4.z0 z0Var, int i10) {
        switch (this.Q) {
            case 0:
                try {
                    ci.m1 m1Var = new ci.m1(this, recyclerView.getContext(), 3);
                    m1Var.a = i10;
                    w0(m1Var);
                    break;
                } catch (Exception e) {
                    FileLog.e(e);
                }
            default:
                try {
                    ci.m1 m1Var2 = new ci.m1(this, recyclerView.getContext(), 5);
                    m1Var2.a = i10;
                    w0(m1Var2);
                    break;
                } catch (Exception e7) {
                    FileLog.e(e7);
                    return;
                }
        }
    }
}
