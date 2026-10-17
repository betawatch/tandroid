package org.telegram.ui;

import android.widget.FrameLayout;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final /* synthetic */ class dn0 implements OnCompleteListener, org.telegram.ui.ActionBar.a2, pt {
    public final /* synthetic */ int a;
    public final /* synthetic */ fo0 b;

    public /* synthetic */ dn0(fo0 fo0Var, int i10) {
        this.a = i10;
        this.b = fo0Var;
    }

    @Override // org.telegram.ui.pt
    public void L0(kt ktVar) {
        switch (this.a) {
            case 2:
                fo0 fo0Var = this.b;
                fo0Var.A0 = ktVar;
                fo0Var.f[4].setText(ktVar.a);
                break;
            default:
                fo0 fo0Var2 = this.b;
                fo0Var2.A0 = ktVar;
                fo0Var2.f[4].setText(ktVar.a);
                fo0Var2.B0 = ktVar.d;
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.a) {
            case 1:
                fo0 fo0Var = this.b;
                fo0Var.I0(fo0Var.R0[0]);
                break;
            case 2:
            default:
                fo0 fo0Var2 = this.b;
                fo0Var2.D0(true);
                fo0Var2.z0();
                break;
            case 3:
                this.b.A0(true);
                break;
        }
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        fo0 fo0Var = this.b;
        fo0Var.getClass();
        if (!task.isSuccessful()) {
            FileLog.e("isReadyToPay failed", task.getException());
            return;
        }
        FrameLayout frameLayout = fo0Var.O;
        if (frameLayout != null) {
            frameLayout.setVisibility(0);
        }
    }
}
