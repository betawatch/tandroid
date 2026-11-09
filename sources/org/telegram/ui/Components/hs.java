package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class hs implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ is b;

    public /* synthetic */ hs(is isVar, int i7) {
        this.a = i7;
        this.b = isVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7;
        Bitmap bitmap;
        switch (this.a) {
            case 0:
                is isVar = this.b;
                try {
                    i7 = isVar.x + 0;
                    bitmap = isVar.b;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    isVar.E = true;
                }
                if (bitmap != null) {
                    if (bitmap.getWidth() == isVar.y) {
                        if (isVar.b.getHeight() != i7) {
                        }
                        isVar.b.eraseColor(0);
                        isVar.c.save();
                        isVar.c.translate(0.0f, 0);
                        isVar.c(isVar.c);
                        isVar.c.restore();
                        isVar.b.prepareToDraw();
                        org.telegram.messenger.g0.h3(isVar.H);
                        break;
                    }
                }
                Bitmap bitmap2 = isVar.b;
                if (bitmap2 != null) {
                    bitmap2.recycle();
                }
                isVar.b = Bitmap.createBitmap(isVar.y, i7, Bitmap.Config.ARGB_8888);
                isVar.c = new Canvas(isVar.b);
                isVar.b.eraseColor(0);
                isVar.c.save();
                isVar.c.translate(0.0f, 0);
                isVar.c(isVar.c);
                isVar.c.restore();
                isVar.b.prepareToDraw();
                org.telegram.messenger.g0.h3(isVar.H);
            default:
                is isVar2 = this.b;
                isVar2.f = false;
                isVar2.g();
                if (!isVar2.a) {
                    isVar2.j();
                    break;
                } else if (isVar2.w == isVar2.J) {
                    isVar2.G = true;
                    break;
                }
                break;
        }
    }
}
