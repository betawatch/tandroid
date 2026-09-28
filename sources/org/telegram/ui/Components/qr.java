package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
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
