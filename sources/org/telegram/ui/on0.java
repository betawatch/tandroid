package org.telegram.ui;

import android.widget.FrameLayout;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class on0 implements OnCompleteListener, org.telegram.ui.ActionBar.b2, nt {
    public final /* synthetic */ int a;
    public final /* synthetic */ po0 b;

    public /* synthetic */ on0(po0 po0Var, int i10) {
        this.a = i10;
        this.b = po0Var;
    }

    @Override // org.telegram.ui.nt
    public void Y0(jt jtVar) {
        switch (this.a) {
            case 2:
                po0 po0Var = this.b;
                po0Var.A0 = jtVar;
                po0Var.f[4].setText(jtVar.a);
                break;
            default:
                po0 po0Var2 = this.b;
                po0Var2.A0 = jtVar;
                po0Var2.f[4].setText(jtVar.a);
                po0Var2.B0 = jtVar.d;
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.b2
    public void h(org.telegram.ui.ActionBar.e2 e2Var, int i10) {
        switch (this.a) {
            case 1:
                po0 po0Var = this.b;
                po0Var.J0(po0Var.R0[0]);
                break;
            case 2:
            default:
                po0 po0Var2 = this.b;
                po0Var2.E0(true);
                po0Var2.A0();
                break;
            case 3:
                this.b.B0(true);
                break;
        }
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        po0 po0Var = this.b;
        po0Var.getClass();
        if (!task.isSuccessful()) {
            FileLog.e("isReadyToPay failed", task.getException());
            return;
        }
        FrameLayout frameLayout = po0Var.O;
        if (frameLayout != null) {
            frameLayout.setVisibility(0);
        }
    }
}
