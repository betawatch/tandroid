package org.telegram.ui;

import android.widget.FrameLayout;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final /* synthetic */ class ao0 implements OnCompleteListener, org.telegram.ui.ActionBar.z1, eu {
    public final /* synthetic */ int a;
    public final /* synthetic */ cp0 b;

    public /* synthetic */ ao0(cp0 cp0Var, int i10) {
        this.a = i10;
        this.b = cp0Var;
    }

    @Override // org.telegram.ui.eu
    public void a1(au auVar) {
        switch (this.a) {
            case 2:
                cp0 cp0Var = this.b;
                cp0Var.A0 = auVar;
                cp0Var.f[4].setText(auVar.a);
                break;
            default:
                cp0 cp0Var2 = this.b;
                cp0Var2.A0 = auVar;
                cp0Var2.f[4].setText(auVar.a);
                cp0Var2.B0 = auVar.d;
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.z1
    public void g(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.a) {
            case 1:
                cp0 cp0Var = this.b;
                cp0Var.I0(cp0Var.R0[0]);
                break;
            case 2:
            default:
                cp0 cp0Var2 = this.b;
                cp0Var2.D0(true);
                cp0Var2.z0();
                break;
            case 3:
                this.b.A0(true);
                break;
        }
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        cp0 cp0Var = this.b;
        cp0Var.getClass();
        if (!task.isSuccessful()) {
            FileLog.e("isReadyToPay failed", task.getException());
            return;
        }
        FrameLayout frameLayout = cp0Var.O;
        if (frameLayout != null) {
            frameLayout.setVisibility(0);
        }
    }
}
