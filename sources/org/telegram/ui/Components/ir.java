package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class ir implements Drawable.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ jr b;

    public /* synthetic */ ir(jr jrVar, int i7) {
        this.a = i7;
        this.b = jrVar;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        switch (this.a) {
            case 0:
                jr jrVar = this.b;
                if (jrVar.c < 1.0f) {
                    jrVar.invalidateSelf();
                    break;
                }
                break;
            default:
                jr jrVar2 = this.b;
                if (jrVar2.c > 0.0f) {
                    jrVar2.invalidateSelf();
                    break;
                }
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j3) {
        switch (this.a) {
            case 0:
                jr jrVar = this.b;
                if (jrVar.c < 1.0f) {
                    jrVar.scheduleSelf(runnable, j3);
                    break;
                }
                break;
            default:
                jr jrVar2 = this.b;
                if (jrVar2.c > 0.0f) {
                    jrVar2.scheduleSelf(runnable, j3);
                    break;
                }
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        switch (this.a) {
            case 0:
                jr jrVar = this.b;
                if (jrVar.c < 1.0f) {
                    jrVar.unscheduleSelf(runnable);
                    break;
                }
                break;
            default:
                jr jrVar2 = this.b;
                if (jrVar2.c > 0.0f) {
                    jrVar2.unscheduleSelf(runnable);
                    break;
                }
                break;
        }
    }
}
