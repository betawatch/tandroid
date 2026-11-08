package org.telegram.ui;

import android.widget.FrameLayout;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class jk0 implements OnCompleteListener, org.telegram.ui.ActionBar.r1, ps {
    public final /* synthetic */ int a;
    public final /* synthetic */ hl0 b;

    public /* synthetic */ jk0(hl0 hl0Var, int i7) {
        this.a = i7;
        this.b = hl0Var;
    }

    @Override // org.telegram.ui.ps
    public void b(ms msVar) {
        switch (this.a) {
            case 2:
                hl0 hl0Var = this.b;
                hl0Var.A0 = msVar;
                hl0Var.f[4].setText(msVar.a);
                break;
            default:
                hl0 hl0Var2 = this.b;
                hl0Var2.A0 = msVar;
                hl0Var2.f[4].setText(msVar.a);
                hl0Var2.B0 = msVar.d;
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.r1
    public void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        switch (this.a) {
            case 1:
                hl0 hl0Var = this.b;
                hl0Var.O0(hl0Var.R0[0]);
                break;
            case 2:
            default:
                hl0 hl0Var2 = this.b;
                hl0Var2.J0(true);
                hl0Var2.F0();
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
