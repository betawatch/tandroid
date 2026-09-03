package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class kr implements Drawable.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ lr b;

    public /* synthetic */ kr(lr lrVar, int i10) {
        this.a = i10;
        this.b = lrVar;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        switch (this.a) {
            case 0:
                lr lrVar = this.b;
                if (lrVar.c < 1.0f) {
                    lrVar.invalidateSelf();
                    break;
                }
                break;
            default:
                lr lrVar2 = this.b;
                if (lrVar2.c > 0.0f) {
                    lrVar2.invalidateSelf();
                    break;
                }
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
        switch (this.a) {
            case 0:
                lr lrVar = this.b;
                if (lrVar.c < 1.0f) {
                    lrVar.scheduleSelf(runnable, j10);
                    break;
                }
                break;
            default:
                lr lrVar2 = this.b;
                if (lrVar2.c > 0.0f) {
                    lrVar2.scheduleSelf(runnable, j10);
                    break;
                }
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        switch (this.a) {
            case 0:
                lr lrVar = this.b;
                if (lrVar.c < 1.0f) {
                    lrVar.unscheduleSelf(runnable);
                    break;
                }
                break;
            default:
                lr lrVar2 = this.b;
                if (lrVar2.c > 0.0f) {
                    lrVar2.unscheduleSelf(runnable);
                    break;
                }
                break;
        }
    }
}
