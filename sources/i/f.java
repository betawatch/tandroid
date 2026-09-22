package i;

import android.graphics.drawable.Drawable;
import android.view.View;
import ii.u0;
import org.telegram.ui.Components.cd;
import org.telegram.ui.Components.d31;
import org.telegram.ui.Components.eq;
import org.telegram.ui.Components.ko0;
import yh.n3;
import zg.n0;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes.dex */
public final class f implements Drawable.Callback {
    public final /* synthetic */ int a;
    public Object b;

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        switch (this.a) {
            case 0:
                break;
            case 1:
                ((u0) this.b).b.invalidate();
                break;
            case 2:
                ((eq) this.b).invalidateSelf();
                break;
            case 3:
                ((ko0) this.b).b.run();
                break;
            case 4:
                ((cd) this.b).invalidateSelf();
                break;
            case 5:
                ((d31) this.b).invalidateSelf();
                break;
            case 6:
                ((wg.a) this.b).c.invalidate();
                break;
            case 7:
                ((wg.c) this.b).c.invalidate();
                break;
            case 8:
                ((x4.d) this.b).invalidateSelf();
                break;
            case 9:
                ((n3) this.b).f.invalidate();
                break;
            default:
                n0 n0Var = (n0) this.b;
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
                Drawable.Callback callback = (Drawable.Callback) this.b;
                if (callback != null) {
                    callback.scheduleDrawable(drawable, runnable, j3);
                    break;
                }
                break;
            case 1:
                break;
            case 2:
                ((eq) this.b).scheduleSelf(runnable, j3);
                break;
            case 3:
                break;
            case 4:
                ((cd) this.b).scheduleSelf(runnable, j3);
                break;
            case 5:
                break;
            case 6:
                ((wg.a) this.b).c.invalidate();
                break;
            case 7:
                ((wg.c) this.b).c.invalidate();
                break;
            case 8:
                ((x4.d) this.b).scheduleSelf(runnable, j3);
                break;
            case 9:
                break;
            default:
                View view = ((n0) this.b).W;
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
                Drawable.Callback callback = (Drawable.Callback) this.b;
                if (callback != null) {
                    callback.unscheduleDrawable(drawable, runnable);
                    break;
                }
                break;
            case 1:
                break;
            case 2:
                ((eq) this.b).unscheduleSelf(runnable);
                break;
            case 3:
                break;
            case 4:
                ((cd) this.b).unscheduleSelf(runnable);
                break;
            case 5:
                break;
            case 6:
                ((wg.a) this.b).c.invalidate();
                break;
            case 7:
                ((wg.c) this.b).c.invalidate();
                break;
            case 8:
                ((x4.d) this.b).unscheduleSelf(runnable);
                break;
            case 9:
                break;
            default:
                View view = ((n0) this.b).W;
                if (view != null) {
                    view.unscheduleDrawable(drawable, runnable);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ f(Object obj, int i10) {
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
