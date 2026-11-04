package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class vq implements Drawable.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ wq b;

    public /* synthetic */ vq(wq wqVar, int i3) {
        this.a = i3;
        this.b = wqVar;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        switch (this.a) {
            case 0:
                wq wqVar = this.b;
                if (wqVar.c < 1.0f) {
                    wqVar.invalidateSelf();
                    break;
                }
                break;
            default:
                wq wqVar2 = this.b;
                if (wqVar2.c > 0.0f) {
                    wqVar2.invalidateSelf();
                    break;
                }
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
        switch (this.a) {
            case 0:
                wq wqVar = this.b;
                if (wqVar.c < 1.0f) {
                    wqVar.scheduleSelf(runnable, j10);
                    break;
                }
                break;
            default:
                wq wqVar2 = this.b;
                if (wqVar2.c > 0.0f) {
                    wqVar2.scheduleSelf(runnable, j10);
                    break;
                }
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        switch (this.a) {
            case 0:
                wq wqVar = this.b;
                if (wqVar.c < 1.0f) {
                    wqVar.unscheduleSelf(runnable);
                    break;
                }
                break;
            default:
                wq wqVar2 = this.b;
                if (wqVar2.c > 0.0f) {
                    wqVar2.unscheduleSelf(runnable);
                    break;
                }
                break;
        }
    }
}
