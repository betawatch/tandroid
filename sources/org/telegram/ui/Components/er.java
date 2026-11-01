package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class er implements Drawable.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ fr b;

    public /* synthetic */ er(fr frVar, int i10) {
        this.a = i10;
        this.b = frVar;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        switch (this.a) {
            case 0:
                fr frVar = this.b;
                if (frVar.c < 1.0f) {
                    frVar.invalidateSelf();
                    break;
                }
                break;
            default:
                fr frVar2 = this.b;
                if (frVar2.c > 0.0f) {
                    frVar2.invalidateSelf();
                    break;
                }
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
        switch (this.a) {
            case 0:
                fr frVar = this.b;
                if (frVar.c < 1.0f) {
                    frVar.scheduleSelf(runnable, j10);
                    break;
                }
                break;
            default:
                fr frVar2 = this.b;
                if (frVar2.c > 0.0f) {
                    frVar2.scheduleSelf(runnable, j10);
                    break;
                }
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        switch (this.a) {
            case 0:
                fr frVar = this.b;
                if (frVar.c < 1.0f) {
                    frVar.unscheduleSelf(runnable);
                    break;
                }
                break;
            default:
                fr frVar2 = this.b;
                if (frVar2.c > 0.0f) {
                    frVar2.unscheduleSelf(runnable);
                    break;
                }
                break;
        }
    }
}
