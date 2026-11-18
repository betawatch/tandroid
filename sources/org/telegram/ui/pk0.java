package org.telegram.ui;

import android.widget.FrameLayout;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class pk0 implements OnCompleteListener, org.telegram.ui.ActionBar.r1, ss {
    public final /* synthetic */ int a;
    public final /* synthetic */ ml0 b;

    public /* synthetic */ pk0(ml0 ml0Var, int i7) {
        this.a = i7;
        this.b = ml0Var;
    }

    @Override // org.telegram.ui.ss
    public void b(ps psVar) {
        switch (this.a) {
            case 2:
                ml0 ml0Var = this.b;
                ml0Var.B0 = psVar;
                ml0Var.f[4].setText(psVar.a);
                break;
            default:
                ml0 ml0Var2 = this.b;
                ml0Var2.B0 = psVar;
                ml0Var2.f[4].setText(psVar.a);
                ml0Var2.C0 = psVar.d;
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.r1
    public void h(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        switch (this.a) {
            case 1:
                ml0 ml0Var = this.b;
                ml0Var.O0(ml0Var.S0[0]);
                break;
            case 2:
            default:
                ml0 ml0Var2 = this.b;
                ml0Var2.J0(true);
                ml0Var2.F0();
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
