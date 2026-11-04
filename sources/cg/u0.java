package cg;

import android.view.Window;
import java.lang.ref.WeakReference;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class u0 {
    public final /* synthetic */ int a;
    public boolean b;
    public boolean c;
    public final Object d;

    public /* synthetic */ u0(Object obj, int i3) {
        this.a = i3;
        this.d = obj;
    }

    public void a() {
        if (this.b) {
            return;
        }
        this.b = true;
        Runnable runnable = (Runnable) this.d;
        if (runnable != null) {
            runnable.run();
        }
    }

    public void b() {
        switch (this.a) {
            case 0:
                c(false);
                this.c = true;
                break;
            default:
                c(false);
                this.c = true;
                break;
        }
    }

    public void c(boolean z10) {
        switch (this.a) {
            case 0:
                v0 v0Var = (v0) this.d;
                if (this.b != z10 && !this.c) {
                    this.b = z10;
                    if (z10) {
                        v0Var.b++;
                    } else {
                        v0Var.b--;
                    }
                    boolean z11 = v0Var.b > 0;
                    if (v0Var.a != z11) {
                        v0Var.a = z11;
                        Window window = (Window) ((WeakReference) ((a1.c) v0Var.c).b).get();
                        if (window != null) {
                            window.getDecorView().setVisibility(z11 ? 8 : 0);
                            break;
                        }
                    }
                }
                break;
            default:
                if (this.b != z10 && !this.c) {
                    this.b = z10;
                    LaunchActivity launchActivity = (LaunchActivity) ((WeakReference) this.d).get();
                    if (launchActivity != null) {
                        int i3 = launchActivity.D1 + (z10 ? 1 : -1);
                        launchActivity.D1 = i3;
                        org.telegram.ui.l0 l0Var = launchActivity.x0;
                        if (l0Var != null) {
                            l0Var.setVisibility(i3 > 0 ? 8 : 0);
                        }
                        launchActivity.getWindow();
                        break;
                    }
                }
                break;
        }
    }

    public u0(LaunchActivity launchActivity, boolean z10) {
        this.a = 1;
        this.d = new WeakReference(launchActivity);
    }
}
