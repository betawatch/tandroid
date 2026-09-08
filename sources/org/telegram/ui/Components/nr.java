package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class nr implements Drawable.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ or b;

    public /* synthetic */ nr(or orVar, int i10) {
        this.a = i10;
        this.b = orVar;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        switch (this.a) {
            case 0:
                or orVar = this.b;
                if (orVar.c < 1.0f) {
                    orVar.invalidateSelf();
                    break;
                }
                break;
            default:
                or orVar2 = this.b;
                if (orVar2.c > 0.0f) {
                    orVar2.invalidateSelf();
                    break;
                }
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j3) {
        switch (this.a) {
            case 0:
                or orVar = this.b;
                if (orVar.c < 1.0f) {
                    orVar.scheduleSelf(runnable, j3);
                    break;
                }
                break;
            default:
                or orVar2 = this.b;
                if (orVar2.c > 0.0f) {
                    orVar2.scheduleSelf(runnable, j3);
                    break;
                }
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        switch (this.a) {
            case 0:
                or orVar = this.b;
                if (orVar.c < 1.0f) {
                    orVar.unscheduleSelf(runnable);
                    break;
                }
                break;
            default:
                or orVar2 = this.b;
                if (orVar2.c > 0.0f) {
                    orVar2.unscheduleSelf(runnable);
                    break;
                }
                break;
        }
    }
}
