package fg;

import af.g;
import android.graphics.drawable.Drawable;
import android.view.View;
import hh.v4;
import ig.o0;
import org.telegram.ui.Components.j21;
import org.telegram.ui.Components.sp;
import org.telegram.ui.Components.un0;
import rh.q0;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
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
                ((v4) this.b).f.invalidate();
                break;
            case 3:
                break;
            case 4:
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
            case 5:
                ((k2.d) this.b).invalidateSelf();
                break;
            case 6:
                ((sp) this.b).invalidateSelf();
                break;
            case 7:
                ((un0) this.b).b.run();
                break;
            case 8:
                ((g) this.b).invalidateSelf();
                break;
            case 9:
                ((j21) this.b).invalidateSelf();
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
            case 3:
                Drawable.Callback callback = (Drawable.Callback) this.b;
                if (callback != null) {
                    callback.scheduleDrawable(drawable, runnable, j10);
                    break;
                }
                break;
            case 4:
                View view = ((o0) this.b).W;
                if (view != null) {
                    view.scheduleDrawable(drawable, runnable, j10);
                    break;
                }
                break;
            case 5:
                ((k2.d) this.b).scheduleSelf(runnable, j10);
                break;
            case 6:
                ((sp) this.b).scheduleSelf(runnable, j10);
                break;
            case 8:
                ((g) this.b).scheduleSelf(runnable, j10);
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
            case 3:
                Drawable.Callback callback = (Drawable.Callback) this.b;
                if (callback != null) {
                    callback.unscheduleDrawable(drawable, runnable);
                    break;
                }
                break;
            case 4:
                View view = ((o0) this.b).W;
                if (view != null) {
                    view.unscheduleDrawable(drawable, runnable);
                    break;
                }
                break;
            case 5:
                ((k2.d) this.b).unscheduleSelf(runnable);
                break;
            case 6:
                ((sp) this.b).unscheduleSelf(runnable);
                break;
            case 8:
                ((g) this.b).unscheduleSelf(runnable);
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
