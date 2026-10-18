package org.telegram.ui;

import android.widget.FrameLayout;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final /* synthetic */ class dn0 implements OnCompleteListener, org.telegram.ui.ActionBar.a2, pt {
    public final /* synthetic */ int a;
    public final /* synthetic */ go0 b;

    public /* synthetic */ dn0(go0 go0Var, int i10) {
        this.a = i10;
        this.b = go0Var;
    }

    @Override // org.telegram.ui.pt
    public void L0(kt ktVar) {
        switch (this.a) {
            case 2:
                go0 go0Var = this.b;
                go0Var.A0 = ktVar;
                go0Var.f[4].setText(ktVar.a);
                break;
            default:
                go0 go0Var2 = this.b;
                go0Var2.A0 = ktVar;
                go0Var2.f[4].setText(ktVar.a);
                go0Var2.B0 = ktVar.d;
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.a) {
            case 1:
                go0 go0Var = this.b;
                go0Var.I0(go0Var.R0[0]);
                break;
            case 2:
            default:
                go0 go0Var2 = this.b;
                go0Var2.D0(true);
                go0Var2.z0();
                break;
            case 3:
                this.b.A0(true);
                break;
        }
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        go0 go0Var = this.b;
        go0Var.getClass();
        if (!task.isSuccessful()) {
            FileLog.e("isReadyToPay failed", task.getException());
            return;
        }
        FrameLayout frameLayout = go0Var.O;
        if (frameLayout != null) {
            frameLayout.setVisibility(0);
        }
    }
}
