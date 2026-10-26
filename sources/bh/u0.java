package bh;

import android.graphics.drawable.Drawable;
import android.view.View;
import bi.q6;
import org.telegram.ui.Components.dd;
import org.telegram.ui.Components.k41;
import org.telegram.ui.Components.qp0;
import org.telegram.ui.Components.qq;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final class u0 implements Drawable.Callback {
    public final /* synthetic */ int a;
    public Object b;

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        switch (this.a) {
            case 0:
                v0 v0Var = (v0) this.b;
                View view = v0Var.W;
                if (view != null) {
                    view.invalidate();
                    if (v0Var.R && v0Var.W.getParent() != null && (v0Var.W.getParent().getParent() instanceof View)) {
                        ((View) v0Var.W.getParent().getParent()).invalidate();
                        break;
                    }
                }
                break;
            case 1:
                ((q6) this.b).h.invalidate();
                break;
            case 2:
                ((ch.c) this.b).invalidateSelf();
                break;
            case 3:
                break;
            case 4:
                ((li.s0) this.b).b.invalidate();
                break;
            case 5:
                ((qq) this.b).invalidateSelf();
                break;
            case 6:
                ((qp0) this.b).b.run();
                break;
            case 7:
                ((dd) this.b).invalidateSelf();
                break;
            case 8:
                ((k41) this.b).invalidateSelf();
                break;
            case 9:
                ((y4.d) this.b).invalidateSelf();
                break;
            case 10:
                ((yg.a) this.b).c.invalidate();
                break;
            default:
                ((yg.c) this.b).c.invalidate();
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
        switch (this.a) {
            case 0:
                View view = ((v0) this.b).W;
                if (view != null) {
                    view.scheduleDrawable(drawable, runnable, j10);
                    break;
                }
                break;
            case 1:
                break;
            case 2:
                ((ch.c) this.b).scheduleSelf(runnable, j10);
                break;
            case 3:
                Drawable.Callback callback = (Drawable.Callback) this.b;
                if (callback != null) {
                    callback.scheduleDrawable(drawable, runnable, j10);
                    break;
                }
                break;
            case 4:
                break;
            case 5:
                ((qq) this.b).scheduleSelf(runnable, j10);
                break;
            case 6:
                break;
            case 7:
                ((dd) this.b).scheduleSelf(runnable, j10);
                break;
            case 8:
                break;
            case 9:
                ((y4.d) this.b).scheduleSelf(runnable, j10);
                break;
            case 10:
                ((yg.a) this.b).c.invalidate();
                break;
            default:
                ((yg.c) this.b).c.invalidate();
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        switch (this.a) {
            case 0:
                View view = ((v0) this.b).W;
                if (view != null) {
                    view.unscheduleDrawable(drawable, runnable);
                    break;
                }
                break;
            case 1:
                break;
            case 2:
                ((ch.c) this.b).unscheduleSelf(runnable);
                break;
            case 3:
                Drawable.Callback callback = (Drawable.Callback) this.b;
                if (callback != null) {
                    callback.unscheduleDrawable(drawable, runnable);
                    break;
                }
                break;
            case 4:
                break;
            case 5:
                ((qq) this.b).unscheduleSelf(runnable);
                break;
            case 6:
                break;
            case 7:
                ((dd) this.b).unscheduleSelf(runnable);
                break;
            case 8:
                break;
            case 9:
                ((y4.d) this.b).unscheduleSelf(runnable);
                break;
            case 10:
                ((yg.a) this.b).c.invalidate();
                break;
            default:
                ((yg.c) this.b).c.invalidate();
                break;
        }
    }

    public /* synthetic */ u0(Object obj, int i10) {
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
