package ah;

import android.graphics.drawable.Drawable;
import android.view.View;
import ii.u0;
import org.telegram.ui.Components.ed;
import org.telegram.ui.Components.eq;
import org.telegram.ui.Components.s31;
import org.telegram.ui.Components.yo0;
import yh.m3;
import zg.m0;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes3.dex */
public final class d implements Drawable.Callback {
    public final /* synthetic */ int a;
    public Object b;

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        switch (this.a) {
            case 0:
                ((e) this.b).invalidateSelf();
                break;
            case 1:
                break;
            case 2:
                ((u0) this.b).b.invalidate();
                break;
            case 3:
                ((eq) this.b).invalidateSelf();
                break;
            case 4:
                ((yo0) this.b).b.run();
                break;
            case 5:
                ((ed) this.b).invalidateSelf();
                break;
            case 6:
                ((s31) this.b).invalidateSelf();
                break;
            case 7:
                ((wg.a) this.b).c.invalidate();
                break;
            case 8:
                ((wg.c) this.b).c.invalidate();
                break;
            case 9:
                ((x4.d) this.b).invalidateSelf();
                break;
            case 10:
                ((m3) this.b).f.invalidate();
                break;
            default:
                m0 m0Var = (m0) this.b;
                View view = m0Var.W;
                if (view != null) {
                    view.invalidate();
                    if (m0Var.R && m0Var.W.getParent() != null && (m0Var.W.getParent().getParent() instanceof View)) {
                        ((View) m0Var.W.getParent().getParent()).invalidate();
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
                ((e) this.b).scheduleSelf(runnable, j3);
                break;
            case 1:
                Drawable.Callback callback = (Drawable.Callback) this.b;
                if (callback != null) {
                    callback.scheduleDrawable(drawable, runnable, j3);
                    break;
                }
                break;
            case 2:
                break;
            case 3:
                ((eq) this.b).scheduleSelf(runnable, j3);
                break;
            case 4:
                break;
            case 5:
                ((ed) this.b).scheduleSelf(runnable, j3);
                break;
            case 6:
                break;
            case 7:
                ((wg.a) this.b).c.invalidate();
                break;
            case 8:
                ((wg.c) this.b).c.invalidate();
                break;
            case 9:
                ((x4.d) this.b).scheduleSelf(runnable, j3);
                break;
            case 10:
                break;
            default:
                View view = ((m0) this.b).W;
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
                ((e) this.b).unscheduleSelf(runnable);
                break;
            case 1:
                Drawable.Callback callback = (Drawable.Callback) this.b;
                if (callback != null) {
                    callback.unscheduleDrawable(drawable, runnable);
                    break;
                }
                break;
            case 2:
                break;
            case 3:
                ((eq) this.b).unscheduleSelf(runnable);
                break;
            case 4:
                break;
            case 5:
                ((ed) this.b).unscheduleSelf(runnable);
                break;
            case 6:
                break;
            case 7:
                ((wg.a) this.b).c.invalidate();
                break;
            case 8:
                ((wg.c) this.b).c.invalidate();
                break;
            case 9:
                ((x4.d) this.b).unscheduleSelf(runnable);
                break;
            case 10:
                break;
            default:
                View view = ((m0) this.b).W;
                if (view != null) {
                    view.unscheduleDrawable(drawable, runnable);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ d(Object obj, int i10) {
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
