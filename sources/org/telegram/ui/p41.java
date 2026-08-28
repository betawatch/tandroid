package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class p41 extends f2.y {
    public final /* synthetic */ int Q;
    public final /* synthetic */ b61 R;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p41(b61 b61Var, int i9) {
        super(40);
        this.Q = i9;
        this.R = b61Var;
    }

    @Override // f2.m0, f2.z0
    public final void v0(RecyclerView recyclerView, f2.n1 n1Var, int i9) {
        switch (this.Q) {
            case 0:
                try {
                    kh.n1 n1Var2 = new kh.n1(this, recyclerView.getContext(), 3);
                    n1Var2.a = i9;
                    w0(n1Var2);
                    break;
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
            default:
                try {
                    kh.n1 n1Var3 = new kh.n1(this, recyclerView.getContext(), 5);
                    n1Var3.a = i9;
                    w0(n1Var3);
                    break;
                } catch (Exception e11) {
                    FileLog.e(e11);
                    return;
                }
        }
    }
}
