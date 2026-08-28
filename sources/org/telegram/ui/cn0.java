package org.telegram.ui;

import android.widget.FrameLayout;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class cn0 implements OnCompleteListener, org.telegram.ui.ActionBar.b2, pt {
    public final /* synthetic */ int a;
    public final /* synthetic */ co0 b;

    public /* synthetic */ cn0(co0 co0Var, int i9) {
        this.a = i9;
        this.b = co0Var;
    }

    @Override // org.telegram.ui.pt
    public void a1(lt ltVar) {
        switch (this.a) {
            case 2:
                co0 co0Var = this.b;
                co0Var.w0 = ltVar;
                co0Var.f[4].setText(ltVar.a);
                break;
            default:
                co0 co0Var2 = this.b;
                co0Var2.w0 = ltVar;
                co0Var2.f[4].setText(ltVar.a);
                co0Var2.x0 = ltVar.d;
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.b2
    public void f(org.telegram.ui.ActionBar.c2 c2Var, int i9) {
        switch (this.a) {
            case 1:
                co0 co0Var = this.b;
                co0Var.H0(co0Var.N0[0]);
                break;
            case 2:
            default:
                co0 co0Var2 = this.b;
                co0Var2.C0(true);
                co0Var2.y0();
                break;
            case 3:
                this.b.z0(true);
                break;
        }
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        co0 co0Var = this.b;
        co0Var.getClass();
        if (!task.isSuccessful()) {
            FileLog.e("isReadyToPay failed", task.getException());
            return;
        }
        FrameLayout frameLayout = co0Var.K;
        if (frameLayout != null) {
            frameLayout.setVisibility(0);
        }
    }
}
