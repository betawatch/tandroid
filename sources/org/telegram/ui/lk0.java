package org.telegram.ui;

import android.widget.FrameLayout;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class lk0 implements OnCompleteListener, org.telegram.ui.ActionBar.r1, rs {
    public final /* synthetic */ int a;
    public final /* synthetic */ jl0 b;

    public /* synthetic */ lk0(jl0 jl0Var, int i7) {
        this.a = i7;
        this.b = jl0Var;
    }

    @Override // org.telegram.ui.rs
    public void b(os osVar) {
        switch (this.a) {
            case 2:
                jl0 jl0Var = this.b;
                jl0Var.A0 = osVar;
                jl0Var.f[4].setText(osVar.a);
                break;
            default:
                jl0 jl0Var2 = this.b;
                jl0Var2.A0 = osVar;
                jl0Var2.f[4].setText(osVar.a);
                jl0Var2.B0 = osVar.d;
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.r1
    public void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        switch (this.a) {
            case 1:
                jl0 jl0Var = this.b;
                jl0Var.O0(jl0Var.R0[0]);
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
        FrameLayout frameLayout = this.b.O;
        if (frameLayout != null) {
            frameLayout.setVisibility(0);
        }
    }
}
