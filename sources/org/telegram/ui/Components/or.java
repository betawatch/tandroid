package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class or implements Drawable.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ pr b;

    public /* synthetic */ or(pr prVar, int i10) {
        this.a = i10;
        this.b = prVar;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        switch (this.a) {
            case 0:
                pr prVar = this.b;
                if (prVar.c < 1.0f) {
                    prVar.invalidateSelf();
                    break;
                }
                break;
            default:
                pr prVar2 = this.b;
                if (prVar2.c > 0.0f) {
                    prVar2.invalidateSelf();
                    break;
                }
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j3) {
        switch (this.a) {
            case 0:
                pr prVar = this.b;
                if (prVar.c < 1.0f) {
                    prVar.scheduleSelf(runnable, j3);
                    break;
                }
                break;
            default:
                pr prVar2 = this.b;
                if (prVar2.c > 0.0f) {
                    prVar2.scheduleSelf(runnable, j3);
                    break;
                }
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        switch (this.a) {
            case 0:
                pr prVar = this.b;
                if (prVar.c < 1.0f) {
                    prVar.unscheduleSelf(runnable);
                    break;
                }
                break;
            default:
                pr prVar2 = this.b;
                if (prVar2.c > 0.0f) {
                    prVar2.unscheduleSelf(runnable);
                    break;
                }
                break;
        }
    }
}
