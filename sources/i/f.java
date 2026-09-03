package i;

import android.graphics.drawable.Drawable;
import android.view.View;
import mh.t4;
import ng.o0;
import org.telegram.ui.Components.c31;
import org.telegram.ui.Components.eq;
import org.telegram.ui.Components.oo0;
import wh.r0;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
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
                ((k2.d) this.b).invalidateSelf();
                break;
            case 2:
                ((kg.a) this.b).c.invalidate();
                break;
            case 3:
                ((kg.c) this.b).c.invalidate();
                break;
            case 4:
                ((t4) this.b).f.invalidate();
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
                ((eq) this.b).invalidateSelf();
                break;
            case 7:
                ((oo0) this.b).b.run();
                break;
            case 8:
                ((ef.f) this.b).invalidateSelf();
                break;
            case 9:
                ((c31) this.b).invalidateSelf();
                break;
            default:
                ((r0) this.b).b.invalidate();
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
        switch (this.a) {
            case 0:
                Drawable.Callback callback = (Drawable.Callback) this.b;
                if (callback != null) {
                    callback.scheduleDrawable(drawable, runnable, j10);
                    break;
                }
                break;
            case 1:
                ((k2.d) this.b).scheduleSelf(runnable, j10);
                break;
            case 2:
                ((kg.a) this.b).c.invalidate();
                break;
            case 3:
                ((kg.c) this.b).c.invalidate();
                break;
            case 5:
                View view = ((o0) this.b).W;
                if (view != null) {
                    view.scheduleDrawable(drawable, runnable, j10);
                    break;
                }
                break;
            case 6:
                ((eq) this.b).scheduleSelf(runnable, j10);
                break;
            case 8:
                ((ef.f) this.b).scheduleSelf(runnable, j10);
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
                ((k2.d) this.b).unscheduleSelf(runnable);
                break;
            case 2:
                ((kg.a) this.b).c.invalidate();
                break;
            case 3:
                ((kg.c) this.b).c.invalidate();
                break;
            case 5:
                View view = ((o0) this.b).W;
                if (view != null) {
                    view.unscheduleDrawable(drawable, runnable);
                    break;
                }
                break;
            case 6:
                ((eq) this.b).unscheduleSelf(runnable);
                break;
            case 8:
                ((ef.f) this.b).unscheduleSelf(runnable);
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

    private final void b(Drawable drawable, Runnable runnable, long j10) {
    }

    private final void c(Drawable drawable, Runnable runnable, long j10) {
    }

    private final void d(Drawable drawable, Runnable runnable, long j10) {
    }

    private final void e(Drawable drawable, Runnable runnable, long j10) {
    }
}
