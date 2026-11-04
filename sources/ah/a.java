package ah;

import android.graphics.drawable.Drawable;
import android.view.View;
import ci.w5;
import dh.l0;
import mi.s0;
import org.telegram.ui.Components.l11;
import org.telegram.ui.Components.np;
import org.telegram.ui.Components.tm0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
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
                ((w5) this.b).h.invalidate();
                break;
            case 3:
                l0 l0Var = (l0) this.b;
                View view = l0Var.V;
                if (view != null) {
                    view.invalidate();
                    if (l0Var.Q && l0Var.V.getParent() != null && (l0Var.V.getParent().getParent() instanceof View)) {
                        ((View) l0Var.V.getParent().getParent()).invalidate();
                        break;
                    }
                }
                break;
            case 4:
                ((eh.d) this.b).invalidateSelf();
                break;
            case 5:
                break;
            case 6:
                ((s0) this.b).b.invalidate();
                break;
            case 7:
                ((np) this.b).invalidateSelf();
                break;
            case 8:
                ((tm0) this.b).b.run();
                break;
            case 9:
                ((l11) this.b).invalidateSelf();
                break;
            default:
                ((z4.d) this.b).invalidateSelf();
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
            case 2:
                break;
            case 3:
                View view = ((l0) this.b).V;
                if (view != null) {
                    view.scheduleDrawable(drawable, runnable, j10);
                    break;
                }
                break;
            case 4:
                ((eh.d) this.b).scheduleSelf(runnable, j10);
                break;
            case 5:
                Drawable.Callback callback = (Drawable.Callback) this.b;
                if (callback != null) {
                    callback.scheduleDrawable(drawable, runnable, j10);
                    break;
                }
                break;
            case 6:
                break;
            case 7:
                ((np) this.b).scheduleSelf(runnable, j10);
                break;
            case 8:
            case 9:
                break;
            default:
                ((z4.d) this.b).scheduleSelf(runnable, j10);
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
            case 2:
                break;
            case 3:
                View view = ((l0) this.b).V;
                if (view != null) {
                    view.unscheduleDrawable(drawable, runnable);
                    break;
                }
                break;
            case 4:
                ((eh.d) this.b).unscheduleSelf(runnable);
                break;
            case 5:
                Drawable.Callback callback = (Drawable.Callback) this.b;
                if (callback != null) {
                    callback.unscheduleDrawable(drawable, runnable);
                    break;
                }
                break;
            case 6:
                break;
            case 7:
                ((np) this.b).unscheduleSelf(runnable);
                break;
            case 8:
            case 9:
                break;
            default:
                ((z4.d) this.b).unscheduleSelf(runnable);
                break;
        }
    }

    public /* synthetic */ a(Object obj, int i3) {
        this.a = i3;
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
