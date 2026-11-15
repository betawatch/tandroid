package bg;

import android.view.Window;
import java.lang.ref.WeakReference;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes.dex */
public final class u0 {
    public final /* synthetic */ int a;
    public boolean b;
    public boolean c;
    public final Object d;

    public /* synthetic */ u0(Object obj, int i7) {
        this.a = i7;
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
                        int i7 = launchActivity.B1 + (z10 ? 1 : -1);
                        launchActivity.B1 = i7;
                        org.telegram.ui.k0 k0Var = launchActivity.v0;
                        if (k0Var != null) {
                            k0Var.setVisibility(i7 > 0 ? 8 : 0);
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
