package ah;

import android.graphics.drawable.Drawable;
import android.view.View;
import ii.u0;
import org.telegram.ui.Components.c41;
import org.telegram.ui.Components.ep0;
import org.telegram.ui.Components.fd;
import org.telegram.ui.Components.hq;
import yh.m3;
import zg.k0;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
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
                ((hq) this.b).invalidateSelf();
                break;
            case 4:
                ((ep0) this.b).b.run();
                break;
            case 5:
                ((fd) this.b).invalidateSelf();
                break;
            case 6:
                ((c41) this.b).invalidateSelf();
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
                k0 k0Var = (k0) this.b;
                View view = k0Var.W;
                if (view != null) {
                    view.invalidate();
                    if (k0Var.R && k0Var.W.getParent() != null && (k0Var.W.getParent().getParent() instanceof View)) {
                        ((View) k0Var.W.getParent().getParent()).invalidate();
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
                ((hq) this.b).scheduleSelf(runnable, j3);
                break;
            case 4:
                break;
            case 5:
                ((fd) this.b).scheduleSelf(runnable, j3);
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
                View view = ((k0) this.b).W;
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
                ((hq) this.b).unscheduleSelf(runnable);
                break;
            case 4:
                break;
            case 5:
                ((fd) this.b).unscheduleSelf(runnable);
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
                View view = ((k0) this.b).W;
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
