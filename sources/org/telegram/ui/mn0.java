package org.telegram.ui;

import android.widget.FrameLayout;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final /* synthetic */ class mn0 implements OnCompleteListener, org.telegram.ui.ActionBar.z1, vt {
    public final /* synthetic */ int a;
    public final /* synthetic */ oo0 b;

    public /* synthetic */ mn0(oo0 oo0Var, int i10) {
        this.a = i10;
        this.b = oo0Var;
    }

    @Override // org.telegram.ui.vt
    public void a1(qt qtVar) {
        switch (this.a) {
            case 2:
                oo0 oo0Var = this.b;
                oo0Var.A0 = qtVar;
                oo0Var.f[4].setText(qtVar.a);
                break;
            default:
                oo0 oo0Var2 = this.b;
                oo0Var2.A0 = qtVar;
                oo0Var2.f[4].setText(qtVar.a);
                oo0Var2.B0 = qtVar.d;
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.z1
    public void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.a) {
            case 1:
                oo0 oo0Var = this.b;
                oo0Var.I0(oo0Var.R0[0]);
                break;
            case 2:
            default:
                oo0 oo0Var2 = this.b;
                oo0Var2.D0(true);
                oo0Var2.z0();
                break;
            case 3:
                this.b.A0(true);
                break;
        }
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        oo0 oo0Var = this.b;
        oo0Var.getClass();
        if (!task.isSuccessful()) {
            FileLog.e("isReadyToPay failed", task.getException());
            return;
        }
        FrameLayout frameLayout = oo0Var.O;
        if (frameLayout != null) {
            frameLayout.setVisibility(0);
        }
    }
}
