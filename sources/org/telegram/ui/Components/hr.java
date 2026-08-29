package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class hr implements Drawable.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ ir b;

    public /* synthetic */ hr(ir irVar, int i10) {
        this.a = i10;
        this.b = irVar;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        switch (this.a) {
            case 0:
                ir irVar = this.b;
                if (irVar.c < 1.0f) {
                    irVar.invalidateSelf();
                    break;
                }
                break;
            default:
                ir irVar2 = this.b;
                if (irVar2.c > 0.0f) {
                    irVar2.invalidateSelf();
                    break;
                }
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
        switch (this.a) {
            case 0:
                ir irVar = this.b;
                if (irVar.c < 1.0f) {
                    irVar.scheduleSelf(runnable, j10);
                    break;
                }
                break;
            default:
                ir irVar2 = this.b;
                if (irVar2.c > 0.0f) {
                    irVar2.scheduleSelf(runnable, j10);
                    break;
                }
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        switch (this.a) {
            case 0:
                ir irVar = this.b;
                if (irVar.c < 1.0f) {
                    irVar.unscheduleSelf(runnable);
                    break;
                }
                break;
            default:
                ir irVar2 = this.b;
                if (irVar2.c > 0.0f) {
                    irVar2.unscheduleSelf(runnable);
                    break;
                }
                break;
        }
    }
}
