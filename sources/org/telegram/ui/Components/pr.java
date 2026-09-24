package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes3.dex */
public final class pr implements Drawable.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ qr b;

    public /* synthetic */ pr(qr qrVar, int i10) {
        this.a = i10;
        this.b = qrVar;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        switch (this.a) {
            case 0:
                qr qrVar = this.b;
                if (qrVar.c < 1.0f) {
                    qrVar.invalidateSelf();
                    break;
                }
                break;
            default:
                qr qrVar2 = this.b;
                if (qrVar2.c > 0.0f) {
                    qrVar2.invalidateSelf();
                    break;
                }
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j3) {
        switch (this.a) {
            case 0:
                qr qrVar = this.b;
                if (qrVar.c < 1.0f) {
                    qrVar.scheduleSelf(runnable, j3);
                    break;
                }
                break;
            default:
                qr qrVar2 = this.b;
                if (qrVar2.c > 0.0f) {
                    qrVar2.scheduleSelf(runnable, j3);
                    break;
                }
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        switch (this.a) {
            case 0:
                qr qrVar = this.b;
                if (qrVar.c < 1.0f) {
                    qrVar.unscheduleSelf(runnable);
                    break;
                }
                break;
            default:
                qr qrVar2 = this.b;
                if (qrVar2.c > 0.0f) {
                    qrVar2.unscheduleSelf(runnable);
                    break;
                }
                break;
        }
    }
}
