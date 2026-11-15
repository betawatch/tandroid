package org.telegram.ui;

import android.widget.FrameLayout;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class mk0 implements OnCompleteListener, org.telegram.ui.ActionBar.q1, ss {
    public final /* synthetic */ int a;
    public final /* synthetic */ jl0 b;

    public /* synthetic */ mk0(jl0 jl0Var, int i7) {
        this.a = i7;
        this.b = jl0Var;
    }

    @Override // org.telegram.ui.ss
    public void e(ps psVar) {
        switch (this.a) {
            case 2:
                jl0 jl0Var = this.b;
                jl0Var.B0 = psVar;
                jl0Var.f[4].setText(psVar.a);
                break;
            default:
                jl0 jl0Var2 = this.b;
                jl0Var2.B0 = psVar;
                jl0Var2.f[4].setText(psVar.a);
                jl0Var2.C0 = psVar.d;
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.q1
    public void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        switch (this.a) {
            case 1:
                jl0 jl0Var = this.b;
                jl0Var.O0(jl0Var.S0[0]);
                break;
            case 2:
            default:
                jl0 jl0Var2 = this.b;
                jl0Var2.J0(true);
                jl0Var2.F0();
                break;
            case 3:
                this.b.G0(true);
                break;
        }
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        if (!task.isSuccessful()) {
            org.telegram.messenger.a8.e("isReadyToPay failed", task.getException());
            return;
        }
        FrameLayout frameLayout = this.b.P;
        if (frameLayout != null) {
            frameLayout.setVisibility(0);
        }
    }
}
