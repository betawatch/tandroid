package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class o41 extends f2.x {
    public final /* synthetic */ int Q;
    public final /* synthetic */ a61 R;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o41(a61 a61Var, int i10) {
        super(40);
        this.Q = i10;
        this.R = a61Var;
    }

    @Override // f2.k0, f2.x0
    public final void v0(RecyclerView recyclerView, f2.l1 l1Var, int i10) {
        switch (this.Q) {
            case 0:
                try {
                    lh.l1 l1Var2 = new lh.l1(this, recyclerView.getContext(), 3);
                    l1Var2.a = i10;
                    w0(l1Var2);
                    break;
                } catch (Exception e9) {
                    FileLog.e(e9);
                }
            default:
                try {
                    lh.l1 l1Var3 = new lh.l1(this, recyclerView.getContext(), 5);
                    l1Var3.a = i10;
                    w0(l1Var3);
                    break;
                } catch (Exception e10) {
                    FileLog.e(e10);
                    return;
                }
        }
    }
}
