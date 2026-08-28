package eg;

import android.graphics.drawable.Drawable;
import android.view.View;
import gh.x4;
import hg.p0;
import org.telegram.ui.Components.h21;
import org.telegram.ui.Components.tn0;
import org.telegram.ui.Components.up;
import org.telegram.ui.Components.vc;
import qh.q0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class a implements Drawable.Callback {
    public final /* synthetic */ int a;
    public Object b;

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        switch (this.a) {
            case 0:
                ((b) this.b).c.invalidate();
                break;
            case 1:
                ((d) this.b).c.invalidate();
                break;
            case 2:
                ((x4) this.b).f.invalidate();
                break;
            case 3:
                p0 p0Var = (p0) this.b;
                View view = p0Var.W;
                if (view != null) {
                    view.invalidate();
                    if (p0Var.R && p0Var.W.getParent() != null && (p0Var.W.getParent().getParent() instanceof View)) {
                        ((View) p0Var.W.getParent().getParent()).invalidate();
                        break;
                    }
                }
                break;
            case 4:
                break;
            case 5:
                ((k2.d) this.b).invalidateSelf();
                break;
            case 6:
                ((up) this.b).invalidateSelf();
                break;
            case 7:
                ((tn0) this.b).b.run();
                break;
            case 8:
                ((vc) this.b).invalidateSelf();
                break;
            case 9:
                ((h21) this.b).invalidateSelf();
                break;
            default:
                ((q0) this.b).b.invalidate();
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
        switch (this.a) {
            case 0:
                ((b) this.b).c.invalidate();
                break;
            case 1:
                ((d) this.b).c.invalidate();
                break;
            case 3:
                View view = ((p0) this.b).W;
                if (view != null) {
                    view.scheduleDrawable(drawable, runnable, j10);
                    break;
                }
                break;
            case 4:
                Drawable.Callback callback = (Drawable.Callback) this.b;
                if (callback != null) {
                    callback.scheduleDrawable(drawable, runnable, j10);
                    break;
                }
                break;
            case 5:
                ((k2.d) this.b).scheduleSelf(runnable, j10);
                break;
            case 6:
                ((up) this.b).scheduleSelf(runnable, j10);
                break;
            case 8:
                ((vc) this.b).scheduleSelf(runnable, j10);
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        switch (this.a) {
            case 0:
                ((b) this.b).c.invalidate();
                break;
            case 1:
                ((d) this.b).c.invalidate();
                break;
            case 3:
                View view = ((p0) this.b).W;
                if (view != null) {
                    view.unscheduleDrawable(drawable, runnable);
                    break;
                }
                break;
            case 4:
                Drawable.Callback callback = (Drawable.Callback) this.b;
                if (callback != null) {
                    callback.unscheduleDrawable(drawable, runnable);
                    break;
                }
                break;
            case 5:
                ((k2.d) this.b).unscheduleSelf(runnable);
                break;
            case 6:
                ((up) this.b).unscheduleSelf(runnable);
                break;
            case 8:
                ((vc) this.b).unscheduleSelf(runnable);
                break;
        }
    }

    public /* synthetic */ a(Object obj, int i9) {
        this.a = i9;
        this.b = obj;
    }

    private final void a(Drawable drawable) {
    }

    private final void f(Drawable drawable, Runnable runnable) {
    }

    private final void g(Drawable drawable, Runnable runnable) {
    }

    private final void h(Drawable drawable, Runnable runnable) {
    }

    private final void i(Drawable drawable, Runnable runnable) {
    }

    private final void b(Drawable drawable, Runnable runnable, long j10) {
    }

    private final void c(Drawable drawable, Runnable runnable, long j10) {
    }

    private final void d(Drawable drawable, Runnable runnable, long j10) {
    }

    private final void e(Drawable drawable, Runnable runnable, long j10) {
    }
}
