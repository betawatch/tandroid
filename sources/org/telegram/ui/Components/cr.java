package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class cr implements Drawable.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ dr b;

    public /* synthetic */ cr(dr drVar, int i10) {
        this.a = i10;
        this.b = drVar;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        switch (this.a) {
            case 0:
                dr drVar = this.b;
                if (drVar.c < 1.0f) {
                    drVar.invalidateSelf();
                    break;
                }
                break;
            default:
                dr drVar2 = this.b;
                if (drVar2.c > 0.0f) {
                    drVar2.invalidateSelf();
                    break;
                }
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
        switch (this.a) {
            case 0:
                dr drVar = this.b;
                if (drVar.c < 1.0f) {
                    drVar.scheduleSelf(runnable, j10);
                    break;
                }
                break;
            default:
                dr drVar2 = this.b;
                if (drVar2.c > 0.0f) {
                    drVar2.scheduleSelf(runnable, j10);
                    break;
                }
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        switch (this.a) {
            case 0:
                dr drVar = this.b;
                if (drVar.c < 1.0f) {
                    drVar.unscheduleSelf(runnable);
                    break;
                }
                break;
            default:
                dr drVar2 = this.b;
                if (drVar2.c > 0.0f) {
                    drVar2.unscheduleSelf(runnable);
                    break;
                }
                break;
        }
    }
}
