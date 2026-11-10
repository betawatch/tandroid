package org.telegram.ui;

import android.widget.FrameLayout;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class mk0 implements OnCompleteListener, org.telegram.ui.ActionBar.r1, ss {
    public final /* synthetic */ int a;
    public final /* synthetic */ kl0 b;

    public /* synthetic */ mk0(kl0 kl0Var, int i7) {
        this.a = i7;
        this.b = kl0Var;
    }

    @Override // org.telegram.ui.ss
    public void b(ps psVar) {
        switch (this.a) {
            case 2:
                kl0 kl0Var = this.b;
                kl0Var.A0 = psVar;
                kl0Var.f[4].setText(psVar.a);
                break;
            default:
                kl0 kl0Var2 = this.b;
                kl0Var2.A0 = psVar;
                kl0Var2.f[4].setText(psVar.a);
                kl0Var2.B0 = psVar.d;
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.r1
    public void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        switch (this.a) {
            case 1:
                kl0 kl0Var = this.b;
                kl0Var.O0(kl0Var.R0[0]);
                break;
            case 2:
            default:
                kl0 kl0Var2 = this.b;
                kl0Var2.J0(true);
                kl0Var2.F0();
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
