package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class ur implements Drawable.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ vr b;

    public /* synthetic */ ur(vr vrVar, int i10) {
        this.a = i10;
        this.b = vrVar;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        switch (this.a) {
            case 0:
                vr vrVar = this.b;
                if (vrVar.c < 1.0f) {
                    vrVar.invalidateSelf();
                    break;
                }
                break;
            default:
                vr vrVar2 = this.b;
                if (vrVar2.c > 0.0f) {
                    vrVar2.invalidateSelf();
                    break;
                }
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j3) {
        switch (this.a) {
            case 0:
                vr vrVar = this.b;
                if (vrVar.c < 1.0f) {
                    vrVar.scheduleSelf(runnable, j3);
                    break;
                }
                break;
            default:
                vr vrVar2 = this.b;
                if (vrVar2.c > 0.0f) {
                    vrVar2.scheduleSelf(runnable, j3);
                    break;
                }
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        switch (this.a) {
            case 0:
                vr vrVar = this.b;
                if (vrVar.c < 1.0f) {
                    vrVar.unscheduleSelf(runnable);
                    break;
                }
                break;
            default:
                vr vrVar2 = this.b;
                if (vrVar2.c > 0.0f) {
                    vrVar2.unscheduleSelf(runnable);
                    break;
                }
                break;
        }
    }
}
