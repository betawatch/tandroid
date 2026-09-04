package ah;

import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.ui.Components.c31;
import org.telegram.ui.Components.dq;
import org.telegram.ui.Components.fd;
import org.telegram.ui.Components.ko0;
import zh.l3;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class g1 implements Drawable.Callback {
    public final /* synthetic */ int a;
    public Object b;

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        switch (this.a) {
            case 0:
                h1 h1Var = (h1) this.b;
                View view = h1Var.W;
                if (view != null) {
                    view.invalidate();
                    if (h1Var.R && h1Var.W.getParent() != null && (h1Var.W.getParent().getParent() instanceof View)) {
                        ((View) h1Var.W.getParent().getParent()).invalidate();
                        break;
                    }
                }
                break;
            case 1:
                break;
            case 2:
                ((ji.t0) this.b).b.invalidate();
                break;
            case 3:
                ((dq) this.b).invalidateSelf();
                break;
            case 4:
                ((ko0) this.b).b.run();
                break;
            case 5:
                ((fd) this.b).invalidateSelf();
                break;
            case 6:
                ((c31) this.b).invalidateSelf();
                break;
            case 7:
                ((x4.d) this.b).invalidateSelf();
                break;
            case 8:
                ((xg.a) this.b).c.invalidate();
                break;
            case 9:
                ((xg.c) this.b).c.invalidate();
                break;
            default:
                ((l3) this.b).f.invalidate();
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j3) {
        switch (this.a) {
            case 0:
                View view = ((h1) this.b).W;
                if (view != null) {
                    view.scheduleDrawable(drawable, runnable, j3);
                    break;
                }
                break;
            case 1:
                Drawable.Callback callback = (Drawable.Callback) this.b;
                if (callback != null) {
                    callback.scheduleDrawable(drawable, runnable, j3);
                    break;
                }
                break;
            case 3:
                ((dq) this.b).scheduleSelf(runnable, j3);
                break;
            case 5:
                ((fd) this.b).scheduleSelf(runnable, j3);
                break;
            case 7:
                ((x4.d) this.b).scheduleSelf(runnable, j3);
                break;
            case 8:
                ((xg.a) this.b).c.invalidate();
                break;
            case 9:
                ((xg.c) this.b).c.invalidate();
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        switch (this.a) {
            case 0:
                View view = ((h1) this.b).W;
                if (view != null) {
                    view.unscheduleDrawable(drawable, runnable);
                    break;
                }
                break;
            case 1:
                Drawable.Callback callback = (Drawable.Callback) this.b;
                if (callback != null) {
                    callback.unscheduleDrawable(drawable, runnable);
                    break;
                }
                break;
            case 3:
                ((dq) this.b).unscheduleSelf(runnable);
                break;
            case 5:
                ((fd) this.b).unscheduleSelf(runnable);
                break;
            case 7:
                ((x4.d) this.b).unscheduleSelf(runnable);
                break;
            case 8:
                ((xg.a) this.b).c.invalidate();
                break;
            case 9:
                ((xg.c) this.b).c.invalidate();
                break;
        }
    }

    public /* synthetic */ g1(Object obj, int i10) {
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
