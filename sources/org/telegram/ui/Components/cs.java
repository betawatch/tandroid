package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class cs implements Drawable.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ ds b;

    public /* synthetic */ cs(ds dsVar, int i10) {
        this.a = i10;
        this.b = dsVar;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        switch (this.a) {
            case 0:
                ds dsVar = this.b;
                if (dsVar.c < 1.0f) {
                    dsVar.invalidateSelf();
                    break;
                }
                break;
            default:
                ds dsVar2 = this.b;
                if (dsVar2.c > 0.0f) {
                    dsVar2.invalidateSelf();
                    break;
                }
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
        switch (this.a) {
            case 0:
                ds dsVar = this.b;
                if (dsVar.c < 1.0f) {
                    dsVar.scheduleSelf(runnable, j10);
                    break;
                }
                break;
            default:
                ds dsVar2 = this.b;
                if (dsVar2.c > 0.0f) {
                    dsVar2.scheduleSelf(runnable, j10);
                    break;
                }
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        switch (this.a) {
            case 0:
                ds dsVar = this.b;
                if (dsVar.c < 1.0f) {
                    dsVar.unscheduleSelf(runnable);
                    break;
                }
                break;
            default:
                ds dsVar2 = this.b;
                if (dsVar2.c > 0.0f) {
                    dsVar2.unscheduleSelf(runnable);
                    break;
                }
                break;
        }
    }
}
