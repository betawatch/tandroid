package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes3.dex */
public final class qr implements Drawable.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ rr b;

    public /* synthetic */ qr(rr rrVar, int i10) {
        this.a = i10;
        this.b = rrVar;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        switch (this.a) {
            case 0:
                rr rrVar = this.b;
                if (rrVar.c < 1.0f) {
                    rrVar.invalidateSelf();
                    break;
                }
                break;
            default:
                rr rrVar2 = this.b;
                if (rrVar2.c > 0.0f) {
                    rrVar2.invalidateSelf();
                    break;
                }
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j3) {
        switch (this.a) {
            case 0:
                rr rrVar = this.b;
                if (rrVar.c < 1.0f) {
                    rrVar.scheduleSelf(runnable, j3);
                    break;
                }
                break;
            default:
                rr rrVar2 = this.b;
                if (rrVar2.c > 0.0f) {
                    rrVar2.scheduleSelf(runnable, j3);
                    break;
                }
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        switch (this.a) {
            case 0:
                rr rrVar = this.b;
                if (rrVar.c < 1.0f) {
                    rrVar.unscheduleSelf(runnable);
                    break;
                }
                break;
            default:
                rr rrVar2 = this.b;
                if (rrVar2.c > 0.0f) {
                    rrVar2.unscheduleSelf(runnable);
                    break;
                }
                break;
        }
    }
}
