package hi;

import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.ui.Components.dd;
import org.telegram.ui.Components.kq;
import org.telegram.ui.Components.q31;
import org.telegram.ui.Components.to0;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final class s0 implements Drawable.Callback {
    public final /* synthetic */ int a;
    public Object b;

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        switch (this.a) {
            case 0:
                ((w0) this.b).b.invalidate();
                break;
            case 1:
                break;
            case 2:
                ((kq) this.b).invalidateSelf();
                break;
            case 3:
                ((to0) this.b).b.run();
                break;
            case 4:
                ((dd) this.b).invalidateSelf();
                break;
            case 5:
                ((q31) this.b).invalidateSelf();
                break;
            case 6:
                ((vg.a) this.b).c.invalidate();
                break;
            case 7:
                ((vg.c) this.b).c.invalidate();
                break;
            case 8:
                ((x4.d) this.b).invalidateSelf();
                break;
            case 9:
                ((xh.l3) this.b).f.invalidate();
                break;
            default:
                yg.n0 n0Var = (yg.n0) this.b;
                View view = n0Var.W;
                if (view != null) {
                    view.invalidate();
                    if (n0Var.R && n0Var.W.getParent() != null && (n0Var.W.getParent().getParent() instanceof View)) {
                        ((View) n0Var.W.getParent().getParent()).invalidate();
                        break;
                    }
                }
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j3) {
        switch (this.a) {
            case 0:
                break;
            case 1:
                Drawable.Callback callback = (Drawable.Callback) this.b;
                if (callback != null) {
                    callback.scheduleDrawable(drawable, runnable, j3);
                    break;
                }
                break;
            case 2:
                ((kq) this.b).scheduleSelf(runnable, j3);
                break;
            case 3:
                break;
            case 4:
                ((dd) this.b).scheduleSelf(runnable, j3);
                break;
            case 5:
                break;
            case 6:
                ((vg.a) this.b).c.invalidate();
                break;
            case 7:
                ((vg.c) this.b).c.invalidate();
                break;
            case 8:
                ((x4.d) this.b).scheduleSelf(runnable, j3);
                break;
            case 9:
                break;
            default:
                View view = ((yg.n0) this.b).W;
                if (view != null) {
                    view.scheduleDrawable(drawable, runnable, j3);
                    break;
                }
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
                ((kq) this.b).unscheduleSelf(runnable);
                break;
            case 3:
                break;
            case 4:
                ((dd) this.b).unscheduleSelf(runnable);
                break;
            case 5:
                break;
            case 6:
                ((vg.a) this.b).c.invalidate();
                break;
            case 7:
                ((vg.c) this.b).c.invalidate();
                break;
            case 8:
                ((x4.d) this.b).unscheduleSelf(runnable);
                break;
            case 9:
                break;
            default:
                View view = ((yg.n0) this.b).W;
                if (view != null) {
                    view.unscheduleDrawable(drawable, runnable);
                    break;
                }
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

    private final void b(Drawable drawable, Runnable runnable, long j3) {
    }

    private final void c(Drawable drawable, Runnable runnable, long j3) {
    }

    private final void d(Drawable drawable, Runnable runnable, long j3) {
    }

    private final void e(Drawable drawable, Runnable runnable, long j3) {
    }
}
