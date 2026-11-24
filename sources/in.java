// default package

import android.graphics.drawable.Drawable;
import android.view.View;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class in implements Drawable.Callback {
    public final /* synthetic */ byte a;
    public Object b;

    public /* synthetic */ in(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        switch (this.a) {
            case 0:
                ((ln) this.b).invalidateSelf();
                break;
            case 1:
                ((ql0) this.b).invalidateSelf();
                break;
            case 2:
                ((mg2) this.b).invalidateSelf();
                break;
            case 3:
                ((ni2) this.b).invalidateSelf();
                break;
            case 4:
                break;
            case 5:
                ((yv4) this.b).c.invalidate();
                break;
            case 6:
                ((aw4) this.b).c.invalidate();
                break;
            case 7:
                uk1 uk1Var = ((uo8) this.b).g;
                if (uk1Var != null) {
                    uk1Var.invalidate();
                    break;
                }
                break;
            case 8:
                f19 f19Var = (f19) this.b;
                View view = f19Var.V;
                if (view != null) {
                    view.invalidate();
                    if (f19Var.Q && view.getParent() != null && (view.getParent().getParent() instanceof View)) {
                        ((View) view.getParent().getParent()).invalidate();
                        break;
                    }
                }
                break;
            case 9:
                ((ac9) this.b).b.invalidate();
                break;
            case 10:
                ((iv9) this.b).b.run();
                break;
            case 11:
                ((jqa) this.b).h.invalidate();
                break;
            default:
                ((tyb) this.b).invalidateSelf();
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        switch (this.a) {
            case 0:
                ((ln) this.b).scheduleSelf(runnable, j);
                break;
            case 1:
                ((ql0) this.b).scheduleSelf(runnable, j);
                break;
            case 2:
                ((mg2) this.b).scheduleSelf(runnable, j);
                break;
            case 3:
                ((ni2) this.b).scheduleSelf(runnable, j);
                break;
            case 4:
                Drawable.Callback callback = (Drawable.Callback) this.b;
                if (callback != null) {
                    callback.scheduleDrawable(drawable, runnable, j);
                    break;
                }
                break;
            case 5:
                ((yv4) this.b).c.invalidate();
                break;
            case 6:
                ((aw4) this.b).c.invalidate();
                break;
            case 8:
                View view = ((f19) this.b).V;
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
                ((ln) this.b).unscheduleSelf(runnable);
                break;
            case 1:
                ((ql0) this.b).unscheduleSelf(runnable);
                break;
            case 2:
                ((mg2) this.b).unscheduleSelf(runnable);
                break;
            case 3:
                ((ni2) this.b).unscheduleSelf(runnable);
                break;
            case 4:
                Drawable.Callback callback = (Drawable.Callback) this.b;
                if (callback != null) {
                    callback.unscheduleDrawable(drawable, runnable);
                    break;
                }
                break;
            case 5:
                ((yv4) this.b).c.invalidate();
                break;
            case 6:
                ((aw4) this.b).c.invalidate();
                break;
            case 8:
                View view = ((f19) this.b).V;
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
