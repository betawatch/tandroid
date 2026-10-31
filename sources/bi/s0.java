package bi;

import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.ui.Components.rn0;
import org.telegram.ui.Components.t21;
import org.telegram.ui.Components.up;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes4.dex */
public final class s0 implements Drawable.Callback {
    public final /* synthetic */ int a;
    public Object b;

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        switch (this.a) {
            case 0:
                ((y0) this.b).b.invalidate();
                break;
            case 1:
                break;
            case 2:
                ((up) this.b).invalidateSelf();
                break;
            case 3:
                ((rn0) this.b).b.run();
                break;
            case 4:
                ((jh.g) this.b).invalidateSelf();
                break;
            case 5:
                ((t21) this.b).invalidateSelf();
                break;
            case 6:
                ((pg.a) this.b).c.invalidate();
                break;
            case 7:
                ((pg.c) this.b).c.invalidate();
                break;
            case 8:
                ((rh.p3) this.b).h.invalidate();
                break;
            case 9:
                sg.m0 m0Var = (sg.m0) this.b;
                View view = m0Var.V;
                if (view != null) {
                    view.invalidate();
                    if (m0Var.Q && m0Var.V.getParent() != null && (m0Var.V.getParent().getParent() instanceof View)) {
                        ((View) m0Var.V.getParent().getParent()).invalidate();
                        break;
                    }
                }
                break;
            case 10:
                ((tg.c) this.b).invalidateSelf();
                break;
            default:
                ((x4.d) this.b).invalidateSelf();
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
        switch (this.a) {
            case 0:
                break;
            case 1:
                Drawable.Callback callback = (Drawable.Callback) this.b;
                if (callback != null) {
                    callback.scheduleDrawable(drawable, runnable, j10);
                    break;
                }
                break;
            case 2:
                ((up) this.b).scheduleSelf(runnable, j10);
                break;
            case 3:
                break;
            case 4:
                ((jh.g) this.b).scheduleSelf(runnable, j10);
                break;
            case 5:
                break;
            case 6:
                ((pg.a) this.b).c.invalidate();
                break;
            case 7:
                ((pg.c) this.b).c.invalidate();
                break;
            case 8:
                break;
            case 9:
                View view = ((sg.m0) this.b).V;
                if (view != null) {
                    view.scheduleDrawable(drawable, runnable, j10);
                    break;
                }
                break;
            case 10:
                ((tg.c) this.b).scheduleSelf(runnable, j10);
                break;
            default:
                ((x4.d) this.b).scheduleSelf(runnable, j10);
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        switch (this.a) {
            case 0:
                break;
            case 1:
                Drawable.Callback callback = (Drawable.Callback) this.b;
                if (callback != null) {
                    callback.unscheduleDrawable(drawable, runnable);
                    break;
                }
                break;
            case 2:
                ((up) this.b).unscheduleSelf(runnable);
                break;
            case 3:
                break;
            case 4:
                ((jh.g) this.b).unscheduleSelf(runnable);
                break;
            case 5:
                break;
            case 6:
                ((pg.a) this.b).c.invalidate();
                break;
            case 7:
                ((pg.c) this.b).c.invalidate();
                break;
            case 8:
                break;
            case 9:
                View view = ((sg.m0) this.b).V;
                if (view != null) {
                    view.unscheduleDrawable(drawable, runnable);
                    break;
                }
                break;
            case 10:
                ((tg.c) this.b).unscheduleSelf(runnable);
                break;
            default:
                ((x4.d) this.b).unscheduleSelf(runnable);
                break;
        }
    }

    public /* synthetic */ s0(Object obj, int i10) {
        this.a = i10;
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
