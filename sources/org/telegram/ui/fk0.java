package org.telegram.ui;

import android.widget.FrameLayout;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class fk0 implements OnCompleteListener, org.telegram.ui.ActionBar.p1, ns {
    public final /* synthetic */ int a;
    public final /* synthetic */ dl0 b;

    public /* synthetic */ fk0(dl0 dl0Var, int i3) {
        this.a = i3;
        this.b = dl0Var;
    }

    @Override // org.telegram.ui.ns
    public void c(ks ksVar) {
        switch (this.a) {
            case 2:
                dl0 dl0Var = this.b;
                dl0Var.B0 = ksVar;
                dl0Var.f[4].setText(ksVar.a);
                break;
            default:
                dl0 dl0Var2 = this.b;
                dl0Var2.B0 = ksVar;
                dl0Var2.f[4].setText(ksVar.a);
                dl0Var2.C0 = ksVar.d;
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.p1
    public void g(org.telegram.ui.ActionBar.s1 s1Var, int i3) {
        switch (this.a) {
            case 1:
                dl0 dl0Var = this.b;
                dl0Var.O0(dl0Var.S0[0]);
                break;
            case 2:
            default:
                dl0 dl0Var2 = this.b;
                dl0Var2.J0(true);
                dl0Var2.F0();
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
