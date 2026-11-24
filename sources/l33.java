// default package

import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class l33 implements Drawable.Callback {
    public final /* synthetic */ byte a;
    public final /* synthetic */ m33 b;

    public /* synthetic */ l33(m33 m33Var, byte b) {
        this.a = b;
        this.b = m33Var;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        byte b = this.a;
        m33 m33Var = this.b;
        switch (b) {
            case 0:
                if (m33Var.c < 1.0f) {
                    m33Var.invalidateSelf();
                    break;
                }
                break;
            default:
                if (m33Var.c > 0.0f) {
                    m33Var.invalidateSelf();
                    break;
                }
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        byte b = this.a;
        m33 m33Var = this.b;
        switch (b) {
            case 0:
                if (m33Var.c < 1.0f) {
                    m33Var.scheduleSelf(runnable, j);
                    break;
                }
                break;
            default:
                if (m33Var.c > 0.0f) {
                    m33Var.scheduleSelf(runnable, j);
                    break;
                }
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        byte b = this.a;
        m33 m33Var = this.b;
        switch (b) {
            case 0:
                if (m33Var.c < 1.0f) {
                    m33Var.unscheduleSelf(runnable);
                    break;
                }
                break;
            default:
                if (m33Var.c > 0.0f) {
                    m33Var.unscheduleSelf(runnable);
                    break;
                }
                break;
        }
    }
}
