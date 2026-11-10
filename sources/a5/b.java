package a5;

import android.graphics.drawable.Drawable;
import android.view.View;
import bi.u6;
import ch.m0;
import li.r0;
import org.telegram.ui.Components.np;
import org.telegram.ui.Components.qm0;
import org.telegram.ui.Components.r11;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final class b implements Drawable.Callback {
    public final /* synthetic */ int a;
    public Object b;

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        switch (this.a) {
            case 0:
                ((e) this.b).invalidateSelf();
                break;
            case 1:
                ((u6) this.b).h.invalidate();
                break;
            case 2:
                m0 m0Var = (m0) this.b;
                View view = m0Var.V;
                if (view != null) {
                    view.invalidate();
                    if (m0Var.Q && m0Var.V.getParent() != null && (m0Var.V.getParent().getParent() instanceof View)) {
                        ((View) m0Var.V.getParent().getParent()).invalidate();
                        break;
                    }
                }
                break;
            case 3:
                ((dh.d) this.b).invalidateSelf();
                break;
            case 4:
                break;
            case 5:
                ((r0) this.b).b.invalidate();
                break;
            case 6:
                ((np) this.b).invalidateSelf();
                break;
            case 7:
                ((qm0) this.b).b.run();
                break;
            case 8:
                ((r11) this.b).invalidateSelf();
                break;
            case 9:
                ((zg.a) this.b).c.invalidate();
                break;
            default:
                ((zg.c) this.b).c.invalidate();
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
                break;
            case 2:
                View view = ((m0) this.b).V;
                if (view != null) {
                    view.scheduleDrawable(drawable, runnable, j3);
                    break;
                }
                break;
            case 3:
                ((dh.d) this.b).scheduleSelf(runnable, j3);
                break;
            case 4:
                Drawable.Callback callback = (Drawable.Callback) this.b;
                if (callback != null) {
                    callback.scheduleDrawable(drawable, runnable, j3);
                    break;
                }
                break;
            case 5:
                break;
            case 6:
                ((np) this.b).scheduleSelf(runnable, j3);
                break;
            case 7:
            case 8:
                break;
            case 9:
                ((zg.a) this.b).c.invalidate();
                break;
            default:
                ((zg.c) this.b).c.invalidate();
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
                break;
            case 2:
                View view = ((m0) this.b).V;
                if (view != null) {
                    view.unscheduleDrawable(drawable, runnable);
                    break;
                }
                break;
            case 3:
                ((dh.d) this.b).unscheduleSelf(runnable);
                break;
            case 4:
                Drawable.Callback callback = (Drawable.Callback) this.b;
                if (callback != null) {
                    callback.unscheduleDrawable(drawable, runnable);
                    break;
                }
                break;
            case 5:
                break;
            case 6:
                ((np) this.b).unscheduleSelf(runnable);
                break;
            case 7:
            case 8:
                break;
            case 9:
                ((zg.a) this.b).c.invalidate();
                break;
            default:
                ((zg.c) this.b).c.invalidate();
                break;
        }
    }

    public /* synthetic */ b(Object obj, int i7) {
        this.a = i7;
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
