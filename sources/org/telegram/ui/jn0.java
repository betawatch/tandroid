package org.telegram.ui;

import android.widget.FrameLayout;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class jn0 implements OnCompleteListener, org.telegram.ui.ActionBar.c2, xt {
    public final /* synthetic */ int a;
    public final /* synthetic */ jo0 b;

    public /* synthetic */ jn0(jo0 jo0Var, int i10) {
        this.a = i10;
        this.b = jo0Var;
    }

    @Override // org.telegram.ui.xt
    public void b1(st stVar) {
        switch (this.a) {
            case 2:
                jo0 jo0Var = this.b;
                jo0Var.x0 = stVar;
                jo0Var.f[4].setText(stVar.a);
                break;
            default:
                jo0 jo0Var2 = this.b;
                jo0Var2.x0 = stVar;
                jo0Var2.f[4].setText(stVar.a);
                jo0Var2.y0 = stVar.d;
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.c2
    public void i(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        switch (this.a) {
            case 1:
                jo0 jo0Var = this.b;
                jo0Var.I0(jo0Var.O0[0]);
                break;
            case 2:
            default:
                jo0 jo0Var2 = this.b;
                jo0Var2.D0(true);
                jo0Var2.z0();
                break;
            case 3:
                this.b.A0(true);
                break;
        }
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        jo0 jo0Var = this.b;
        jo0Var.getClass();
        if (!task.isSuccessful()) {
            FileLog.e("isReadyToPay failed", task.getException());
            return;
        }
        FrameLayout frameLayout = jo0Var.L;
        if (frameLayout != null) {
            frameLayout.setVisibility(0);
        }
    }
}
