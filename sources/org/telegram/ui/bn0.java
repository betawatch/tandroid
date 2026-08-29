package org.telegram.ui;

import android.widget.FrameLayout;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class bn0 implements OnCompleteListener, org.telegram.ui.ActionBar.b2, qt {
    public final /* synthetic */ int a;
    public final /* synthetic */ bo0 b;

    public /* synthetic */ bn0(bo0 bo0Var, int i10) {
        this.a = i10;
        this.b = bo0Var;
    }

    @Override // org.telegram.ui.qt
    public void Z0(lt ltVar) {
        switch (this.a) {
            case 2:
                bo0 bo0Var = this.b;
                bo0Var.w0 = ltVar;
                bo0Var.f[4].setText(ltVar.a);
                break;
            default:
                bo0 bo0Var2 = this.b;
                bo0Var2.w0 = ltVar;
                bo0Var2.f[4].setText(ltVar.a);
                bo0Var2.x0 = ltVar.d;
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.b2
    public void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        switch (this.a) {
            case 1:
                bo0 bo0Var = this.b;
                bo0Var.I0(bo0Var.N0[0]);
                break;
            case 2:
            default:
                bo0 bo0Var2 = this.b;
                bo0Var2.D0(true);
                bo0Var2.z0();
                break;
            case 3:
                this.b.A0(true);
                break;
        }
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        bo0 bo0Var = this.b;
        bo0Var.getClass();
        if (!task.isSuccessful()) {
            FileLog.e("isReadyToPay failed", task.getException());
            return;
        }
        FrameLayout frameLayout = bo0Var.K;
        if (frameLayout != null) {
            frameLayout.setVisibility(0);
        }
    }
}
