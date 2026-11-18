package bg;

import android.view.Window;
import java.lang.ref.WeakReference;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes.dex */
public final class v0 {
    public final /* synthetic */ int a = 0;
    public boolean b;
    public boolean c;
    public final Object d;

    public v0(w0 w0Var) {
        this.d = w0Var;
    }

    public final void a() {
        switch (this.a) {
            case 0:
                b(false);
                this.c = true;
                break;
            default:
                b(false);
                this.c = true;
                break;
        }
    }

    public final void b(boolean z10) {
        switch (this.a) {
            case 0:
                w0 w0Var = (w0) this.d;
                if (this.b != z10 && !this.c) {
                    this.b = z10;
                    if (z10) {
                        w0Var.b++;
                    } else {
                        w0Var.b--;
                    }
                    boolean z11 = w0Var.b > 0;
                    if (w0Var.a != z11) {
                        w0Var.a = z11;
                        Window window = (Window) ((WeakReference) ((a1.c) w0Var.c).b).get();
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

    public v0(LaunchActivity launchActivity, boolean z10) {
        this.d = new WeakReference(launchActivity);
    }
}
