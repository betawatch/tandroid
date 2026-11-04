package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class hs implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ is b;

    public /* synthetic */ hs(is isVar, int i3) {
        this.a = i3;
        this.b = isVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i3;
        Bitmap bitmap;
        switch (this.a) {
            case 0:
                is isVar = this.b;
                try {
                    i3 = isVar.x + 0;
                    bitmap = isVar.b;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    isVar.F = true;
                }
                if (bitmap != null) {
                    if (bitmap.getWidth() == isVar.y) {
                        if (isVar.b.getHeight() != i3) {
                        }
                        isVar.b.eraseColor(0);
                        isVar.c.save();
                        isVar.c.translate(0.0f, 0);
                        isVar.c(isVar.c);
                        isVar.c.restore();
                        isVar.b.prepareToDraw();
                        org.telegram.messenger.g0.h3(isVar.I);
                        break;
                    }
                }
                Bitmap bitmap2 = isVar.b;
                if (bitmap2 != null) {
                    bitmap2.recycle();
                }
                isVar.b = Bitmap.createBitmap(isVar.y, i3, Bitmap.Config.ARGB_8888);
                isVar.c = new Canvas(isVar.b);
                isVar.b.eraseColor(0);
                isVar.c.save();
                isVar.c.translate(0.0f, 0);
                isVar.c(isVar.c);
                isVar.c.restore();
                isVar.b.prepareToDraw();
                org.telegram.messenger.g0.h3(isVar.I);
            default:
                is isVar2 = this.b;
                isVar2.f = false;
                isVar2.g();
                if (!isVar2.a) {
                    isVar2.j();
                    break;
                } else if (isVar2.w == isVar2.K) {
                    isVar2.H = true;
                    break;
                }
                break;
        }
    }
}
