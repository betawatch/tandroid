package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final class n41 extends s4.s {
    public final /* synthetic */ int Q;
    public final /* synthetic */ z51 R;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n41(z51 z51Var, int i10) {
        super(40);
        this.Q = i10;
        this.R = z51Var;
    }

    @Override // s4.b0, s4.n0
    public final void v0(RecyclerView recyclerView, s4.y0 y0Var, int i10) {
        switch (this.Q) {
            case 0:
                try {
                    ei.l1 l1Var = new ei.l1(this, recyclerView.getContext(), 3);
                    l1Var.a = i10;
                    w0(l1Var);
                    break;
                } catch (Exception e) {
                    FileLog.e(e);
                }
            default:
                try {
                    ei.l1 l1Var2 = new ei.l1(this, recyclerView.getContext(), 5);
                    l1Var2.a = i10;
                    w0(l1Var2);
                    break;
                } catch (Exception e7) {
                    FileLog.e(e7);
                    return;
                }
        }
    }
}
