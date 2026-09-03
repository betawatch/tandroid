package i;

import android.graphics.drawable.Drawable;
import android.view.View;
import lh.t4;
import mg.o0;
import org.telegram.ui.Components.bq;
import org.telegram.ui.Components.c31;
import org.telegram.ui.Components.no0;
import vh.r0;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
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
                ((jg.a) this.b).c.invalidate();
                break;
            case 2:
                ((jg.c) this.b).c.invalidate();
                break;
            case 3:
                ((k2.d) this.b).invalidateSelf();
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
                ((bq) this.b).invalidateSelf();
                break;
            case 7:
                ((no0) this.b).b.run();
                break;
            case 8:
                ((df.f) this.b).invalidateSelf();
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
                ((jg.a) this.b).c.invalidate();
                break;
            case 2:
                ((jg.c) this.b).c.invalidate();
                break;
            case 3:
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
                ((bq) this.b).scheduleSelf(runnable, j10);
                break;
            case 8:
                ((df.f) this.b).scheduleSelf(runnable, j10);
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
                ((jg.a) this.b).c.invalidate();
                break;
            case 2:
                ((jg.c) this.b).c.invalidate();
                break;
            case 3:
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
                ((bq) this.b).unscheduleSelf(runnable);
                break;
            case 8:
                ((df.f) this.b).unscheduleSelf(runnable);
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
