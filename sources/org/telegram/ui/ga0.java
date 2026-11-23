package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class ga0 extends v4.u0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ qa0 b;

    public /* synthetic */ ga0(qa0 qa0Var, int i7) {
        this.a = i7;
        this.b = qa0Var;
    }

    @Override // v4.u0
    public final void a(RecyclerView recyclerView, int i7) {
        switch (this.a) {
            case 0:
                if (i7 == 1) {
                    qa0 qa0Var = this.b;
                    if (qa0Var.u0 && qa0Var.v0) {
                        org.telegram.messenger.g0.v1(qa0Var.getParentActivity().getCurrentFocus());
                        break;
                    }
                }
                break;
            default:
                boolean z10 = i7 != 0;
                qa0 qa0Var2 = this.b;
                qa0Var2.N = z10;
                if (!z10 && qa0Var2.I != null) {
                    qa0Var2.I = null;
                    break;
                }
                break;
        }
    }

    @Override // v4.u0
    public void b(RecyclerView recyclerView, int i7, int i10) {
        switch (this.a) {
            case 1:
                qa0 qa0Var = this.b;
                qa0Var.N0(false);
                if (qa0Var.I != null) {
                    qa0Var.K += i10;
                    break;
                }
                break;
        }
    }
}
