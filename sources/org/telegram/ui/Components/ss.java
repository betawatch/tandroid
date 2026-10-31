package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class ss implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ts b;

    public /* synthetic */ ss(ts tsVar, int i10) {
        this.a = i10;
        this.b = tsVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10;
        Bitmap bitmap;
        switch (this.a) {
            case 0:
                ts tsVar = this.b;
                try {
                    i10 = tsVar.x + 0;
                    bitmap = tsVar.b;
                } catch (Exception e) {
                    org.telegram.messenger.f8.g(e, true);
                    tsVar.E = true;
                }
                if (bitmap != null) {
                    if (bitmap.getWidth() == tsVar.y) {
                        if (tsVar.b.getHeight() != i10) {
                        }
                        tsVar.b.eraseColor(0);
                        tsVar.c.save();
                        tsVar.c.translate(0.0f, 0);
                        tsVar.c(tsVar.c);
                        tsVar.c.restore();
                        tsVar.b.prepareToDraw();
                        org.telegram.messenger.i0.g3(tsVar.H);
                        break;
                    }
                }
                Bitmap bitmap2 = tsVar.b;
                if (bitmap2 != null) {
                    bitmap2.recycle();
                }
                tsVar.b = Bitmap.createBitmap(tsVar.y, i10, Bitmap.Config.ARGB_8888);
                tsVar.c = new Canvas(tsVar.b);
                tsVar.b.eraseColor(0);
                tsVar.c.save();
                tsVar.c.translate(0.0f, 0);
                tsVar.c(tsVar.c);
                tsVar.c.restore();
                tsVar.b.prepareToDraw();
                org.telegram.messenger.i0.g3(tsVar.H);
            default:
                ts tsVar2 = this.b;
                tsVar2.f = false;
                tsVar2.g();
                if (!tsVar2.a) {
                    tsVar2.j();
                    break;
                } else if (tsVar2.w == tsVar2.J) {
                    tsVar2.G = true;
                    break;
                }
                break;
        }
    }
}
