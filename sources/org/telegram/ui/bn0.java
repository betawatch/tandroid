package org.telegram.ui;

import android.widget.FrameLayout;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final /* synthetic */ class bn0 implements OnCompleteListener, org.telegram.ui.ActionBar.a2, nt {
    public final /* synthetic */ int a;
    public final /* synthetic */ eo0 b;

    public /* synthetic */ bn0(eo0 eo0Var, int i10) {
        this.a = i10;
        this.b = eo0Var;
    }

    @Override // org.telegram.ui.nt
    public void L0(ht htVar) {
        switch (this.a) {
            case 2:
                eo0 eo0Var = this.b;
                eo0Var.A0 = htVar;
                eo0Var.f[4].setText(htVar.a);
                break;
            default:
                eo0 eo0Var2 = this.b;
                eo0Var2.A0 = htVar;
                eo0Var2.f[4].setText(htVar.a);
                eo0Var2.B0 = htVar.d;
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.a) {
            case 1:
                eo0 eo0Var = this.b;
                eo0Var.I0(eo0Var.R0[0]);
                break;
            case 2:
            default:
                eo0 eo0Var2 = this.b;
                eo0Var2.D0(true);
                eo0Var2.z0();
                break;
            case 3:
                this.b.A0(true);
                break;
        }
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        eo0 eo0Var = this.b;
        eo0Var.getClass();
        if (!task.isSuccessful()) {
            FileLog.e("isReadyToPay failed", task.getException());
            return;
        }
        FrameLayout frameLayout = eo0Var.O;
        if (frameLayout != null) {
            frameLayout.setVisibility(0);
        }
    }
}
