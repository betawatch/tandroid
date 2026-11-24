// default package

import android.graphics.drawable.Drawable;
import android.view.View;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class jo implements Drawable.Callback {
    public final /* synthetic */ byte a;
    public Object b;

    public /* synthetic */ jo(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        switch (this.a) {
            case 0:
                ((mo) this.b).invalidateSelf();
                break;
            case 1:
                ((qm0) this.b).invalidateSelf();
                break;
            case 2:
                ((ai2) this.b).invalidateSelf();
                break;
            case 3:
                ((bk2) this.b).invalidateSelf();
                break;
            case 4:
                break;
            case 5:
                ((ay4) this.b).c.invalidate();
                break;
            case 6:
                ((cy4) this.b).c.invalidate();
                break;
            case 7:
                cm1 cm1Var = ((vq8) this.b).g;
                if (cm1Var != null) {
                    cm1Var.invalidate();
                    break;
                }
                break;
            case 8:
                i39 i39Var = (i39) this.b;
                View view = i39Var.V;
                if (view != null) {
                    view.invalidate();
                    if (i39Var.Q && view.getParent() != null && (view.getParent().getParent() instanceof View)) {
                        ((View) view.getParent().getParent()).invalidate();
                        break;
                    }
                }
                break;
            case 9:
                ((be9) this.b).b.invalidate();
                break;
            case 10:
                ((lx9) this.b).b.run();
                break;
            case 11:
                ((jsa) this.b).h.invalidate();
                break;
            default:
                ((u0c) this.b).invalidateSelf();
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        switch (this.a) {
            case 0:
                ((mo) this.b).scheduleSelf(runnable, j);
                break;
            case 1:
                ((qm0) this.b).scheduleSelf(runnable, j);
                break;
            case 2:
                ((ai2) this.b).scheduleSelf(runnable, j);
                break;
            case 3:
                ((bk2) this.b).scheduleSelf(runnable, j);
                break;
            case 4:
                Drawable.Callback callback = (Drawable.Callback) this.b;
                if (callback != null) {
                    callback.scheduleDrawable(drawable, runnable, j);
                    break;
                }
                break;
            case 5:
                ((ay4) this.b).c.invalidate();
                break;
            case 6:
                ((cy4) this.b).c.invalidate();
                break;
            case 8:
                View view = ((i39) this.b).V;
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
                ((mo) this.b).unscheduleSelf(runnable);
                break;
            case 1:
                ((qm0) this.b).unscheduleSelf(runnable);
                break;
            case 2:
                ((ai2) this.b).unscheduleSelf(runnable);
                break;
            case 3:
                ((bk2) this.b).unscheduleSelf(runnable);
                break;
            case 4:
                Drawable.Callback callback = (Drawable.Callback) this.b;
                if (callback != null) {
                    callback.unscheduleDrawable(drawable, runnable);
                    break;
                }
                break;
            case 5:
                ((ay4) this.b).c.invalidate();
                break;
            case 6:
                ((cy4) this.b).c.invalidate();
                break;
            case 8:
                View view = ((i39) this.b).V;
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
