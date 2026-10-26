package ag;

import android.view.Window;
import java.lang.ref.WeakReference;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final class b1 implements a1 {
    public final /* synthetic */ int a;
    public boolean b;
    public boolean c;
    public final Object d;

    public /* synthetic */ b1(Object obj, int i10) {
        this.a = i10;
        this.d = obj;
    }

    @Override // ag.a1
    public void a(boolean z10) {
        switch (this.a) {
            case 0:
                c1 c1Var = (c1) this.d;
                if (this.b != z10 && !this.c) {
                    this.b = z10;
                    if (z10) {
                        c1Var.a++;
                    } else {
                        c1Var.a--;
                    }
                    boolean z11 = c1Var.a > 0;
                    if (c1Var.b != z11) {
                        c1Var.b = z11;
                        Window window = (Window) ((WeakReference) c1Var.c.b).get();
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
                        int i10 = launchActivity.C1 + (z10 ? 1 : -1);
                        launchActivity.C1 = i10;
                        org.telegram.ui.k0 k0Var = launchActivity.w0;
                        if (k0Var != null) {
                            k0Var.setVisibility(i10 > 0 ? 8 : 0);
                        }
                        launchActivity.getWindow();
                        break;
                    }
                }
                break;
        }
    }

    public void b() {
        if (this.b) {
            return;
        }
        this.b = true;
        Runnable runnable = (Runnable) this.d;
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override // ag.a1
    public void destroy() {
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

    public b1(LaunchActivity launchActivity, boolean z10) {
        this.a = 1;
        this.d = new WeakReference(launchActivity);
    }
}
