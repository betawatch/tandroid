package hg;

import android.graphics.drawable.Drawable;
import android.view.View;
import cf.f;
import jh.u4;
import kg.o0;
import org.telegram.ui.Components.eo0;
import org.telegram.ui.Components.s21;
import org.telegram.ui.Components.yp;
import th.q0;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
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
                break;
            case 3:
                ((u4) this.b).f.invalidate();
                break;
            case 4:
                ((k2.d) this.b).invalidateSelf();
                break;
            case 5:
                o0 o0Var = (o0) this.b;
                View view = o0Var.W;
                if (view != null) {
                    view.invalidate();
                    if (o0Var.R && o0Var.W.getParent() != null && (o0Var.W.getParent().getParent() instanceof View)) {
                        ((View) o0Var.W.getParent().getParent()).invalidate();
                        break;
                    }
                }
                break;
            case 6:
                ((yp) this.b).invalidateSelf();
                break;
            case 7:
                ((eo0) this.b).b.run();
                break;
            case 8:
                ((f) this.b).invalidateSelf();
                break;
            case 9:
                ((s21) this.b).invalidateSelf();
                break;
            default:
                ((q0) this.b).b.invalidate();
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
                Drawable.Callback callback = (Drawable.Callback) this.b;
                if (callback != null) {
                    callback.scheduleDrawable(drawable, runnable, j10);
                    break;
                }
                break;
            case 4:
                ((k2.d) this.b).scheduleSelf(runnable, j10);
                break;
            case 5:
                View view = ((o0) this.b).W;
                if (view != null) {
                    view.scheduleDrawable(drawable, runnable, j10);
                    break;
                }
                break;
            case 6:
                ((yp) this.b).scheduleSelf(runnable, j10);
                break;
            case 8:
                ((f) this.b).scheduleSelf(runnable, j10);
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
                Drawable.Callback callback = (Drawable.Callback) this.b;
                if (callback != null) {
                    callback.unscheduleDrawable(drawable, runnable);
                    break;
                }
                break;
            case 4:
                ((k2.d) this.b).unscheduleSelf(runnable);
                break;
            case 5:
                View view = ((o0) this.b).W;
                if (view != null) {
                    view.unscheduleDrawable(drawable, runnable);
                    break;
                }
                break;
            case 6:
                ((yp) this.b).unscheduleSelf(runnable);
                break;
            case 8:
                ((f) this.b).unscheduleSelf(runnable);
                break;
        }
    }

    public /* synthetic */ a(Object obj, int i10) {
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
