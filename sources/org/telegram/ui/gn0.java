package org.telegram.ui;

import android.widget.FrameLayout;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final /* synthetic */ class gn0 implements OnCompleteListener, org.telegram.ui.ActionBar.z1, qt {
    public final /* synthetic */ int a;
    public final /* synthetic */ io0 b;

    public /* synthetic */ gn0(io0 io0Var, int i10) {
        this.a = i10;
        this.b = io0Var;
    }

    @Override // org.telegram.ui.qt
    public void L0(lt ltVar) {
        switch (this.a) {
            case 2:
                io0 io0Var = this.b;
                io0Var.A0 = ltVar;
                io0Var.f[4].setText(ltVar.a);
                break;
            default:
                io0 io0Var2 = this.b;
                io0Var2.A0 = ltVar;
                io0Var2.f[4].setText(ltVar.a);
                io0Var2.B0 = ltVar.d;
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.z1
    public void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        switch (this.a) {
            case 1:
                io0 io0Var = this.b;
                io0Var.I0(io0Var.R0[0]);
                break;
            case 2:
            default:
                io0 io0Var2 = this.b;
                io0Var2.D0(true);
                io0Var2.z0();
                break;
            case 3:
                this.b.A0(true);
                break;
        }
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        io0 io0Var = this.b;
        io0Var.getClass();
        if (!task.isSuccessful()) {
            FileLog.e("isReadyToPay failed", task.getException());
            return;
        }
        FrameLayout frameLayout = io0Var.O;
        if (frameLayout != null) {
            frameLayout.setVisibility(0);
        }
    }
}
