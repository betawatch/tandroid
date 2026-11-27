// default package

import android.graphics.drawable.Drawable;
import android.view.View;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class jn implements Drawable.Callback {
    public final /* synthetic */ byte a;
    public Object b;

    public /* synthetic */ jn(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        switch (this.a) {
            case 0:
                ((mn) this.b).invalidateSelf();
                break;
            case 1:
                ((rl0) this.b).invalidateSelf();
                break;
            case 2:
                ((eh2) this.b).invalidateSelf();
                break;
            case 3:
                ((jj2) this.b).invalidateSelf();
                break;
            case 4:
                break;
            case 5:
                ((dy4) this.b).c.invalidate();
                break;
            case 6:
                ((fy4) this.b).c.invalidate();
                break;
            case 7:
                dl1 dl1Var = ((gs8) this.b).g;
                if (dl1Var != null) {
                    dl1Var.invalidate();
                    break;
                }
                break;
            case 8:
                u49 u49Var = (u49) this.b;
                View view = u49Var.V;
                if (view != null) {
                    view.invalidate();
                    if (u49Var.Q && view.getParent() != null && (view.getParent().getParent() instanceof View)) {
                        ((View) view.getParent().getParent()).invalidate();
                        break;
                    }
                }
                break;
            case 9:
                ((rf9) this.b).b.invalidate();
                break;
            case 10:
                ((cz9) this.b).b.run();
                break;
            case 11:
                ((kua) this.b).h.invalidate();
                break;
            default:
                ((t2c) this.b).invalidateSelf();
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        switch (this.a) {
            case 0:
                ((mn) this.b).scheduleSelf(runnable, j);
                break;
            case 1:
                ((rl0) this.b).scheduleSelf(runnable, j);
                break;
            case 2:
                ((eh2) this.b).scheduleSelf(runnable, j);
                break;
            case 3:
                ((jj2) this.b).scheduleSelf(runnable, j);
                break;
            case 4:
                Drawable.Callback callback = (Drawable.Callback) this.b;
                if (callback != null) {
                    callback.scheduleDrawable(drawable, runnable, j);
                    break;
                }
                break;
            case 5:
                ((dy4) this.b).c.invalidate();
                break;
            case 6:
                ((fy4) this.b).c.invalidate();
                break;
            case 8:
                View view = ((u49) this.b).V;
                if (view != null) {
                    view.scheduleDrawable(drawable, runnable, j);
                    break;
                }
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        switch (this.a) {
            case 0:
                ((mn) this.b).unscheduleSelf(runnable);
                break;
            case 1:
                ((rl0) this.b).unscheduleSelf(runnable);
                break;
            case 2:
                ((eh2) this.b).unscheduleSelf(runnable);
                break;
            case 3:
                ((jj2) this.b).unscheduleSelf(runnable);
                break;
            case 4:
                Drawable.Callback callback = (Drawable.Callback) this.b;
                if (callback != null) {
                    callback.unscheduleDrawable(drawable, runnable);
                    break;
                }
                break;
            case 5:
                ((dy4) this.b).c.invalidate();
                break;
            case 6:
                ((fy4) this.b).c.invalidate();
                break;
            case 8:
                View view = ((u49) this.b).V;
                if (view != null) {
                    view.unscheduleDrawable(drawable, runnable);
                    break;
                }
                break;
        }
    }

    private final void a(Drawable drawable) {
    }

    private final void g(Drawable drawable, Runnable runnable) {
    }

    private final void h(Drawable drawable, Runnable runnable) {
    }

    private final void i(Drawable drawable, Runnable runnable) {
    }

    private final void j(Drawable drawable, Runnable runnable) {
    }

    private final void k(Drawable drawable, Runnable runnable) {
    }

    private final void b(Drawable drawable, Runnable runnable, long j) {
    }

    private final void c(Drawable drawable, Runnable runnable, long j) {
    }

    private final void d(Drawable drawable, Runnable runnable, long j) {
    }

    private final void e(Drawable drawable, Runnable runnable, long j) {
    }

    private final void f(Drawable drawable, Runnable runnable, long j) {
    }
}
