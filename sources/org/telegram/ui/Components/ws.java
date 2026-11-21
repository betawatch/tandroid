package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class ws implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ xs b;

    public /* synthetic */ ws(xs xsVar, int i7) {
        this.a = i7;
        this.b = xsVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7;
        Bitmap bitmap;
        switch (this.a) {
            case 0:
                xs xsVar = this.b;
                try {
                    i7 = xsVar.x + 0;
                    bitmap = xsVar.b;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    xsVar.F = true;
                }
                if (bitmap != null) {
                    if (bitmap.getWidth() == xsVar.y) {
                        if (xsVar.b.getHeight() != i7) {
                        }
                        xsVar.b.eraseColor(0);
                        xsVar.c.save();
                        xsVar.c.translate(0.0f, 0);
                        xsVar.c(xsVar.c);
                        xsVar.c.restore();
                        xsVar.b.prepareToDraw();
                        org.telegram.messenger.g0.g3(xsVar.I);
                        break;
                    }
                }
                Bitmap bitmap2 = xsVar.b;
                if (bitmap2 != null) {
                    bitmap2.recycle();
                }
                xsVar.b = Bitmap.createBitmap(xsVar.y, i7, Bitmap.Config.ARGB_8888);
                xsVar.c = new Canvas(xsVar.b);
                xsVar.b.eraseColor(0);
                xsVar.c.save();
                xsVar.c.translate(0.0f, 0);
                xsVar.c(xsVar.c);
                xsVar.c.restore();
                xsVar.b.prepareToDraw();
                org.telegram.messenger.g0.g3(xsVar.I);
            default:
                xs xsVar2 = this.b;
                xsVar2.f = false;
                xsVar2.g();
                if (!xsVar2.a) {
                    xsVar2.j();
                    break;
                } else if (xsVar2.w == xsVar2.K) {
                    xsVar2.H = true;
                    break;
                }
                break;
        }
    }
}
