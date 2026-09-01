package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
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
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
        switch (this.a) {
            case 0:
                or orVar = this.b;
                if (orVar.c < 1.0f) {
                    orVar.scheduleSelf(runnable, j10);
                    break;
                }
                break;
            default:
                or orVar2 = this.b;
                if (orVar2.c > 0.0f) {
                    orVar2.scheduleSelf(runnable, j10);
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
