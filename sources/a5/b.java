package a5;

import android.graphics.drawable.Drawable;
import android.view.View;
import ch.n0;
import di.q5;
import oi.q0;
import org.telegram.ui.Components.eq;
import org.telegram.ui.Components.fn0;
import org.telegram.ui.Components.i21;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes.dex */
public final class b implements Drawable.Callback {
    public final /* synthetic */ int a;
    public Object b;

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        switch (this.a) {
            case 0:
                ((e) this.b).invalidateSelf();
                break;
            case 1:
                n0 n0Var = (n0) this.b;
                View view = n0Var.V;
                if (view != null) {
                    view.invalidate();
                    if (n0Var.Q && n0Var.V.getParent() != null && (n0Var.V.getParent().getParent() instanceof View)) {
                        ((View) n0Var.V.getParent().getParent()).invalidate();
                        break;
                    }
                }
                break;
            case 2:
                ((dh.d) this.b).invalidateSelf();
                break;
            case 3:
                ((q5) this.b).h.invalidate();
                break;
            case 4:
                break;
            case 5:
                ((q0) this.b).b.invalidate();
                break;
            case 6:
                ((eq) this.b).invalidateSelf();
                break;
            case 7:
                ((fn0) this.b).b.run();
                break;
            case 8:
                ((i21) this.b).invalidateSelf();
                break;
            case 9:
                ((zg.a) this.b).c.invalidate();
                break;
            default:
                ((zg.c) this.b).c.invalidate();
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j3) {
        switch (this.a) {
            case 0:
                ((e) this.b).scheduleSelf(runnable, j3);
                break;
            case 1:
                View view = ((n0) this.b).V;
                if (view != null) {
                    view.scheduleDrawable(drawable, runnable, j3);
                    break;
                }
                break;
            case 2:
                ((dh.d) this.b).scheduleSelf(runnable, j3);
                break;
            case 3:
                break;
            case 4:
                Drawable.Callback callback = (Drawable.Callback) this.b;
                if (callback != null) {
                    callback.scheduleDrawable(drawable, runnable, j3);
                    break;
                }
                break;
            case 5:
                break;
            case 6:
                ((eq) this.b).scheduleSelf(runnable, j3);
                break;
            case 7:
            case 8:
                break;
            case 9:
                ((zg.a) this.b).c.invalidate();
                break;
            default:
                ((zg.c) this.b).c.invalidate();
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        switch (this.a) {
            case 0:
                ((e) this.b).unscheduleSelf(runnable);
                break;
            case 1:
                View view = ((n0) this.b).V;
                if (view != null) {
                    view.unscheduleDrawable(drawable, runnable);
                    break;
                }
                break;
            case 2:
                ((dh.d) this.b).unscheduleSelf(runnable);
                break;
            case 3:
                break;
            case 4:
                Drawable.Callback callback = (Drawable.Callback) this.b;
                if (callback != null) {
                    callback.unscheduleDrawable(drawable, runnable);
                    break;
                }
                break;
            case 5:
                break;
            case 6:
                ((eq) this.b).unscheduleSelf(runnable);
                break;
            case 7:
            case 8:
                break;
            case 9:
                ((zg.a) this.b).c.invalidate();
                break;
            default:
                ((zg.c) this.b).c.invalidate();
                break;
        }
    }

    public /* synthetic */ b(Object obj, int i7) {
        this.a = i7;
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

    private final void b(Drawable drawable, Runnable runnable, long j3) {
    }

    private final void c(Drawable drawable, Runnable runnable, long j3) {
    }

    private final void d(Drawable drawable, Runnable runnable, long j3) {
    }

    private final void e(Drawable drawable, Runnable runnable, long j3) {
    }
}
