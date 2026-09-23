package org.telegram.ui;

import android.widget.FrameLayout;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final /* synthetic */ class on0 implements OnCompleteListener, org.telegram.ui.ActionBar.a2, wt {
    public final /* synthetic */ int a;
    public final /* synthetic */ qo0 b;

    public /* synthetic */ on0(qo0 qo0Var, int i10) {
        this.a = i10;
        this.b = qo0Var;
    }

    @Override // org.telegram.ui.wt
    public void a1(st stVar) {
        switch (this.a) {
            case 2:
                qo0 qo0Var = this.b;
                qo0Var.A0 = stVar;
                qo0Var.f[4].setText(stVar.a);
                break;
            default:
                qo0 qo0Var2 = this.b;
                qo0Var2.A0 = stVar;
                qo0Var2.f[4].setText(stVar.a);
                qo0Var2.B0 = stVar.d;
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.a) {
            case 1:
                qo0 qo0Var = this.b;
                qo0Var.I0(qo0Var.R0[0]);
                break;
            case 2:
            default:
                qo0 qo0Var2 = this.b;
                qo0Var2.D0(true);
                qo0Var2.z0();
                break;
            case 3:
                this.b.A0(true);
                break;
        }
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        qo0 qo0Var = this.b;
        qo0Var.getClass();
        if (!task.isSuccessful()) {
            FileLog.e("isReadyToPay failed", task.getException());
            return;
        }
        FrameLayout frameLayout = qo0Var.O;
        if (frameLayout != null) {
            frameLayout.setVisibility(0);
        }
    }
}
