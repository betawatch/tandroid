package org.telegram.ui;

import android.widget.FrameLayout;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ln0 implements OnCompleteListener, org.telegram.ui.ActionBar.c2, yt {
    public final /* synthetic */ int a;
    public final /* synthetic */ lo0 b;

    public /* synthetic */ ln0(lo0 lo0Var, int i10) {
        this.a = i10;
        this.b = lo0Var;
    }

    @Override // org.telegram.ui.yt
    public void V0(tt ttVar) {
        switch (this.a) {
            case 2:
                lo0 lo0Var = this.b;
                lo0Var.x0 = ttVar;
                lo0Var.f[4].setText(ttVar.a);
                break;
            default:
                lo0 lo0Var2 = this.b;
                lo0Var2.x0 = ttVar;
                lo0Var2.f[4].setText(ttVar.a);
                lo0Var2.y0 = ttVar.d;
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.c2
    public void j(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        switch (this.a) {
            case 1:
                lo0 lo0Var = this.b;
                lo0Var.I0(lo0Var.O0[0]);
                break;
            case 2:
            default:
                lo0 lo0Var2 = this.b;
                lo0Var2.D0(true);
                lo0Var2.z0();
                break;
            case 3:
                this.b.A0(true);
                break;
        }
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        lo0 lo0Var = this.b;
        lo0Var.getClass();
        if (!task.isSuccessful()) {
            FileLog.e("isReadyToPay failed", task.getException());
            return;
        }
        FrameLayout frameLayout = lo0Var.L;
        if (frameLayout != null) {
            frameLayout.setVisibility(0);
        }
    }
}
