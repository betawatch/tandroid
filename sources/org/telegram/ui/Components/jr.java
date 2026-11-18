package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class jr implements Drawable.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ kr b;

    public /* synthetic */ jr(kr krVar, int i7) {
        this.a = i7;
        this.b = krVar;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        switch (this.a) {
            case 0:
                kr krVar = this.b;
                if (krVar.c < 1.0f) {
                    krVar.invalidateSelf();
                    break;
                }
                break;
            default:
                kr krVar2 = this.b;
                if (krVar2.c > 0.0f) {
                    krVar2.invalidateSelf();
                    break;
                }
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j3) {
        switch (this.a) {
            case 0:
                kr krVar = this.b;
                if (krVar.c < 1.0f) {
                    krVar.scheduleSelf(runnable, j3);
                    break;
                }
                break;
            default:
                kr krVar2 = this.b;
                if (krVar2.c > 0.0f) {
                    krVar2.scheduleSelf(runnable, j3);
                    break;
                }
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        switch (this.a) {
            case 0:
                kr krVar = this.b;
                if (krVar.c < 1.0f) {
                    krVar.unscheduleSelf(runnable);
                    break;
                }
                break;
            default:
                kr krVar2 = this.b;
                if (krVar2.c > 0.0f) {
                    krVar2.unscheduleSelf(runnable);
                    break;
                }
                break;
        }
    }
}
