package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class uq implements Drawable.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ vq b;

    public /* synthetic */ uq(vq vqVar, int i7) {
        this.a = i7;
        this.b = vqVar;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        switch (this.a) {
            case 0:
                vq vqVar = this.b;
                if (vqVar.c < 1.0f) {
                    vqVar.invalidateSelf();
                    break;
                }
                break;
            default:
                vq vqVar2 = this.b;
                if (vqVar2.c > 0.0f) {
                    vqVar2.invalidateSelf();
                    break;
                }
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j3) {
        switch (this.a) {
            case 0:
                vq vqVar = this.b;
                if (vqVar.c < 1.0f) {
                    vqVar.scheduleSelf(runnable, j3);
                    break;
                }
                break;
            default:
                vq vqVar2 = this.b;
                if (vqVar2.c > 0.0f) {
                    vqVar2.scheduleSelf(runnable, j3);
                    break;
                }
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        switch (this.a) {
            case 0:
                vq vqVar = this.b;
                if (vqVar.c < 1.0f) {
                    vqVar.unscheduleSelf(runnable);
                    break;
                }
                break;
            default:
                vq vqVar2 = this.b;
                if (vqVar2.c > 0.0f) {
                    vqVar2.unscheduleSelf(runnable);
                    break;
                }
                break;
        }
    }
}
