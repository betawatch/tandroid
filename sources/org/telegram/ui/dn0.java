package org.telegram.ui;

import android.widget.FrameLayout;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class dn0 implements OnCompleteListener, org.telegram.ui.ActionBar.a2, st {
    public final /* synthetic */ int a;
    public final /* synthetic */ do0 b;

    public /* synthetic */ dn0(do0 do0Var, int i10) {
        this.a = i10;
        this.b = do0Var;
    }

    @Override // org.telegram.ui.st
    public void Z0(nt ntVar) {
        switch (this.a) {
            case 2:
                do0 do0Var = this.b;
                do0Var.w0 = ntVar;
                do0Var.f[4].setText(ntVar.a);
                break;
            default:
                do0 do0Var2 = this.b;
                do0Var2.w0 = ntVar;
                do0Var2.f[4].setText(ntVar.a);
                do0Var2.x0 = ntVar.d;
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.a) {
            case 1:
                do0 do0Var = this.b;
                do0Var.I0(do0Var.N0[0]);
                break;
            case 2:
            default:
                do0 do0Var2 = this.b;
                do0Var2.D0(true);
                do0Var2.z0();
                break;
            case 3:
                this.b.A0(true);
                break;
        }
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        do0 do0Var = this.b;
        do0Var.getClass();
        if (!task.isSuccessful()) {
            FileLog.e("isReadyToPay failed", task.getException());
            return;
        }
        FrameLayout frameLayout = do0Var.K;
        if (frameLayout != null) {
            frameLayout.setVisibility(0);
        }
    }
}
