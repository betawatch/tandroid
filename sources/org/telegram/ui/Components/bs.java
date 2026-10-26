package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class bs implements Drawable.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ cs b;

    public /* synthetic */ bs(cs csVar, int i10) {
        this.a = i10;
        this.b = csVar;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        switch (this.a) {
            case 0:
                cs csVar = this.b;
                if (csVar.c < 1.0f) {
                    csVar.invalidateSelf();
                    break;
                }
                break;
            default:
                cs csVar2 = this.b;
                if (csVar2.c > 0.0f) {
                    csVar2.invalidateSelf();
                    break;
                }
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
        switch (this.a) {
            case 0:
                cs csVar = this.b;
                if (csVar.c < 1.0f) {
                    csVar.scheduleSelf(runnable, j10);
                    break;
                }
                break;
            default:
                cs csVar2 = this.b;
                if (csVar2.c > 0.0f) {
                    csVar2.scheduleSelf(runnable, j10);
                    break;
                }
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        switch (this.a) {
            case 0:
                cs csVar = this.b;
                if (csVar.c < 1.0f) {
                    csVar.unscheduleSelf(runnable);
                    break;
                }
                break;
            default:
                cs csVar2 = this.b;
                if (csVar2.c > 0.0f) {
                    csVar2.unscheduleSelf(runnable);
                    break;
                }
                break;
        }
    }
}
