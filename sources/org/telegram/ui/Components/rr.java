package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final class rr implements Drawable.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ sr b;

    public /* synthetic */ rr(sr srVar, int i10) {
        this.a = i10;
        this.b = srVar;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        switch (this.a) {
            case 0:
                sr srVar = this.b;
                if (srVar.c < 1.0f) {
                    srVar.invalidateSelf();
                    break;
                }
                break;
            default:
                sr srVar2 = this.b;
                if (srVar2.c > 0.0f) {
                    srVar2.invalidateSelf();
                    break;
                }
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j3) {
        switch (this.a) {
            case 0:
                sr srVar = this.b;
                if (srVar.c < 1.0f) {
                    srVar.scheduleSelf(runnable, j3);
                    break;
                }
                break;
            default:
                sr srVar2 = this.b;
                if (srVar2.c > 0.0f) {
                    srVar2.scheduleSelf(runnable, j3);
                    break;
                }
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        switch (this.a) {
            case 0:
                sr srVar = this.b;
                if (srVar.c < 1.0f) {
                    srVar.unscheduleSelf(runnable);
                    break;
                }
                break;
            default:
                sr srVar2 = this.b;
                if (srVar2.c > 0.0f) {
                    srVar2.unscheduleSelf(runnable);
                    break;
                }
                break;
        }
    }
}
