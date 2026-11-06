package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class vq implements Drawable.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ wq b;

    public /* synthetic */ vq(wq wqVar, int i7) {
        this.a = i7;
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
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j3) {
        switch (this.a) {
            case 0:
                wq wqVar = this.b;
                if (wqVar.c < 1.0f) {
                    wqVar.scheduleSelf(runnable, j3);
                    break;
                }
                break;
            default:
                wq wqVar2 = this.b;
                if (wqVar2.c > 0.0f) {
                    wqVar2.scheduleSelf(runnable, j3);
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
