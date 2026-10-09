package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class fs implements Drawable.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ gs b;

    public /* synthetic */ fs(gs gsVar, int i10) {
        this.a = i10;
        this.b = gsVar;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        switch (this.a) {
            case 0:
                gs gsVar = this.b;
                if (gsVar.c < 1.0f) {
                    gsVar.invalidateSelf();
                    break;
                }
                break;
            default:
                gs gsVar2 = this.b;
                if (gsVar2.c > 0.0f) {
                    gsVar2.invalidateSelf();
                    break;
                }
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j3) {
        switch (this.a) {
            case 0:
                gs gsVar = this.b;
                if (gsVar.c < 1.0f) {
                    gsVar.scheduleSelf(runnable, j3);
                    break;
                }
                break;
            default:
                gs gsVar2 = this.b;
                if (gsVar2.c > 0.0f) {
                    gsVar2.scheduleSelf(runnable, j3);
                    break;
                }
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        switch (this.a) {
            case 0:
                gs gsVar = this.b;
                if (gsVar.c < 1.0f) {
                    gsVar.unscheduleSelf(runnable);
                    break;
                }
                break;
            default:
                gs gsVar2 = this.b;
                if (gsVar2.c > 0.0f) {
                    gsVar2.unscheduleSelf(runnable);
                    break;
                }
                break;
        }
    }
}
