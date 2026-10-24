package ah;

import ai.v6;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.ui.Components.d41;
import org.telegram.ui.Components.ed;
import org.telegram.ui.Components.lp0;
import org.telegram.ui.Components.oq;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class f1 implements Drawable.Callback {
    public final /* synthetic */ int a;
    public Object b;

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        switch (this.a) {
            case 0:
                g1 g1Var = (g1) this.b;
                View view = g1Var.W;
                if (view != null) {
                    view.invalidate();
                    if (g1Var.R && g1Var.W.getParent() != null && (g1Var.W.getParent().getParent() instanceof View)) {
                        ((View) g1Var.W.getParent().getParent()).invalidate();
                        break;
                    }
                }
                break;
            case 1:
                ((v6) this.b).h.invalidate();
                break;
            case 2:
                break;
            case 3:
                ((ki.t0) this.b).b.invalidate();
                break;
            case 4:
                ((oq) this.b).invalidateSelf();
                break;
            case 5:
                ((lp0) this.b).b.run();
                break;
            case 6:
                ((ed) this.b).invalidateSelf();
                break;
            case 7:
                ((d41) this.b).invalidateSelf();
                break;
            case 8:
                ((x4.d) this.b).invalidateSelf();
                break;
            case 9:
                ((xg.a) this.b).c.invalidate();
                break;
            default:
                ((xg.c) this.b).c.invalidate();
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
        switch (this.a) {
            case 0:
                View view = ((g1) this.b).W;
                if (view != null) {
                    view.scheduleDrawable(drawable, runnable, j10);
                    break;
                }
                break;
            case 1:
                break;
            case 2:
                Drawable.Callback callback = (Drawable.Callback) this.b;
                if (callback != null) {
                    callback.scheduleDrawable(drawable, runnable, j10);
                    break;
                }
                break;
            case 3:
                break;
            case 4:
                ((oq) this.b).scheduleSelf(runnable, j10);
                break;
            case 5:
                break;
            case 6:
                ((ed) this.b).scheduleSelf(runnable, j10);
                break;
            case 7:
                break;
            case 8:
                ((x4.d) this.b).scheduleSelf(runnable, j10);
                break;
            case 9:
                ((xg.a) this.b).c.invalidate();
                break;
            default:
                ((xg.c) this.b).c.invalidate();
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        switch (this.a) {
            case 0:
                View view = ((g1) this.b).W;
                if (view != null) {
                    view.unscheduleDrawable(drawable, runnable);
                    break;
                }
                break;
            case 1:
                break;
            case 2:
                Drawable.Callback callback = (Drawable.Callback) this.b;
                if (callback != null) {
                    callback.unscheduleDrawable(drawable, runnable);
                    break;
                }
                break;
            case 3:
                break;
            case 4:
                ((oq) this.b).unscheduleSelf(runnable);
                break;
            case 5:
                break;
            case 6:
                ((ed) this.b).unscheduleSelf(runnable);
                break;
            case 7:
                break;
            case 8:
                ((x4.d) this.b).unscheduleSelf(runnable);
                break;
            case 9:
                ((xg.a) this.b).c.invalidate();
                break;
            default:
                ((xg.c) this.b).c.invalidate();
                break;
        }
    }

    public /* synthetic */ f1(Object obj, int i10) {
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
