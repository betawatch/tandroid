package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class lr implements Drawable.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ mr b;

    public /* synthetic */ lr(mr mrVar, int i7) {
        this.a = i7;
        this.b = mrVar;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        switch (this.a) {
            case 0:
                mr mrVar = this.b;
                if (mrVar.c < 1.0f) {
                    mrVar.invalidateSelf();
                    break;
                }
                break;
            default:
                mr mrVar2 = this.b;
                if (mrVar2.c > 0.0f) {
                    mrVar2.invalidateSelf();
                    break;
                }
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j3) {
        switch (this.a) {
            case 0:
                mr mrVar = this.b;
                if (mrVar.c < 1.0f) {
                    mrVar.scheduleSelf(runnable, j3);
                    break;
                }
                break;
            default:
                mr mrVar2 = this.b;
                if (mrVar2.c > 0.0f) {
                    mrVar2.scheduleSelf(runnable, j3);
                    break;
                }
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        switch (this.a) {
            case 0:
                mr mrVar = this.b;
                if (mrVar.c < 1.0f) {
                    mrVar.unscheduleSelf(runnable);
                    break;
                }
                break;
            default:
                mr mrVar2 = this.b;
                if (mrVar2.c > 0.0f) {
                    mrVar2.unscheduleSelf(runnable);
                    break;
                }
                break;
        }
    }
}
