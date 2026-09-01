package lf;

import android.view.Window;
import java.lang.ref.WeakReference;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final class s0 implements r0 {
    public final /* synthetic */ int a = 0;
    public boolean b;
    public boolean c;
    public final Object d;

    public s0(t0 t0Var) {
        this.d = t0Var;
    }

    @Override // lf.r0
    public final void a(boolean z4) {
        switch (this.a) {
            case 0:
                t0 t0Var = (t0) this.d;
                if (this.b != z4 && !this.c) {
                    this.b = z4;
                    if (z4) {
                        t0Var.a++;
                    } else {
                        t0Var.a--;
                    }
                    boolean z10 = t0Var.a > 0;
                    if (t0Var.b != z10) {
                        t0Var.b = z10;
                        Window window = (Window) ((WeakReference) t0Var.c.b).get();
                        if (window != null) {
                            window.getDecorView().setVisibility(z10 ? 8 : 0);
                            break;
                        }
                    }
                }
                break;
            default:
                if (this.b != z4 && !this.c) {
                    this.b = z4;
                    LaunchActivity launchActivity = (LaunchActivity) ((WeakReference) this.d).get();
                    if (launchActivity != null) {
                        int i10 = launchActivity.x1 + (z4 ? 1 : -1);
                        launchActivity.x1 = i10;
                        org.telegram.ui.l0 l0Var = launchActivity.t0;
                        if (l0Var != null) {
                            l0Var.setVisibility(i10 > 0 ? 8 : 0);
                        }
                        launchActivity.getWindow();
                        break;
                    }
                }
                break;
        }
    }

    @Override // lf.r0
    public final void destroy() {
        switch (this.a) {
            case 0:
                a(false);
                this.c = true;
                break;
            default:
                a(false);
                this.c = true;
                break;
        }
    }

    public s0(LaunchActivity launchActivity, boolean z4) {
        this.d = new WeakReference(launchActivity);
    }
}
