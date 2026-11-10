package bg;

import android.view.Window;
import java.lang.ref.WeakReference;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final class v0 {
    public final /* synthetic */ int a;
    public boolean b;
    public boolean c;
    public final Object d;

    public /* synthetic */ v0(Object obj, int i7) {
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

    public void c(boolean z9) {
        switch (this.a) {
            case 0:
                w0 w0Var = (w0) this.d;
                if (this.b != z9 && !this.c) {
                    this.b = z9;
                    if (z9) {
                        w0Var.b++;
                    } else {
                        w0Var.b--;
                    }
                    boolean z10 = w0Var.b > 0;
                    if (w0Var.a != z10) {
                        w0Var.a = z10;
                        Window window = (Window) ((WeakReference) ((a1.c) w0Var.c).b).get();
                        if (window != null) {
                            window.getDecorView().setVisibility(z10 ? 8 : 0);
                            break;
                        }
                    }
                }
                break;
            default:
                if (this.b != z9 && !this.c) {
                    this.b = z9;
                    LaunchActivity launchActivity = (LaunchActivity) ((WeakReference) this.d).get();
                    if (launchActivity != null) {
                        int i7 = launchActivity.A1 + (z9 ? 1 : -1);
                        launchActivity.A1 = i7;
                        org.telegram.ui.k0 k0Var = launchActivity.u0;
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

    public v0(LaunchActivity launchActivity, boolean z9) {
        this.a = 1;
        this.d = new WeakReference(launchActivity);
    }
}
