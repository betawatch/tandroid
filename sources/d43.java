// default package

import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class d43 implements Drawable.Callback {
    public final /* synthetic */ byte a;
    public final /* synthetic */ e43 b;

    public /* synthetic */ d43(e43 e43Var, byte b) {
        this.a = b;
        this.b = e43Var;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        byte b = this.a;
        e43 e43Var = this.b;
        switch (b) {
            case 0:
                if (e43Var.c < 1.0f) {
                    e43Var.invalidateSelf();
                    break;
                }
                break;
            default:
                if (e43Var.c > 0.0f) {
                    e43Var.invalidateSelf();
                    break;
                }
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        byte b = this.a;
        e43 e43Var = this.b;
        switch (b) {
            case 0:
                if (e43Var.c < 1.0f) {
                    e43Var.scheduleSelf(runnable, j);
                    break;
                }
                break;
            default:
                if (e43Var.c > 0.0f) {
                    e43Var.scheduleSelf(runnable, j);
                    break;
                }
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        byte b = this.a;
        e43 e43Var = this.b;
        switch (b) {
            case 0:
                if (e43Var.c < 1.0f) {
                    e43Var.unscheduleSelf(runnable);
                    break;
                }
                break;
            default:
                if (e43Var.c > 0.0f) {
                    e43Var.unscheduleSelf(runnable);
                    break;
                }
                break;
        }
    }
}
