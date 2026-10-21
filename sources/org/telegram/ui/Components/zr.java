package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes3.dex */
public final class zr implements Drawable.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ as b;

    public /* synthetic */ zr(as asVar, int i10) {
        this.a = i10;
        this.b = asVar;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        switch (this.a) {
            case 0:
                as asVar = this.b;
                if (asVar.c < 1.0f) {
                    asVar.invalidateSelf();
                    break;
                }
                break;
            default:
                as asVar2 = this.b;
                if (asVar2.c > 0.0f) {
                    asVar2.invalidateSelf();
                    break;
                }
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
        switch (this.a) {
            case 0:
                as asVar = this.b;
                if (asVar.c < 1.0f) {
                    asVar.scheduleSelf(runnable, j10);
                    break;
                }
                break;
            default:
                as asVar2 = this.b;
                if (asVar2.c > 0.0f) {
                    asVar2.scheduleSelf(runnable, j10);
                    break;
                }
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        switch (this.a) {
            case 0:
                as asVar = this.b;
                if (asVar.c < 1.0f) {
                    asVar.unscheduleSelf(runnable);
                    break;
                }
                break;
            default:
                as asVar2 = this.b;
                if (asVar2.c > 0.0f) {
                    asVar2.unscheduleSelf(runnable);
                    break;
                }
                break;
        }
    }
}
