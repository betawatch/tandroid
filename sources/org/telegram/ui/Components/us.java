package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class us implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ vs b;

    public /* synthetic */ us(vs vsVar, int i7) {
        this.a = i7;
        this.b = vsVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7;
        Bitmap bitmap;
        switch (this.a) {
            case 0:
                vs vsVar = this.b;
                try {
                    i7 = vsVar.x + 0;
                    bitmap = vsVar.b;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    vsVar.F = true;
                }
                if (bitmap != null) {
                    if (bitmap.getWidth() == vsVar.y) {
                        if (vsVar.b.getHeight() != i7) {
                        }
                        vsVar.b.eraseColor(0);
                        vsVar.c.save();
                        vsVar.c.translate(0.0f, 0);
                        vsVar.c(vsVar.c);
                        vsVar.c.restore();
                        vsVar.b.prepareToDraw();
                        org.telegram.messenger.g0.g3(vsVar.I);
                        break;
                    }
                }
                Bitmap bitmap2 = vsVar.b;
                if (bitmap2 != null) {
                    bitmap2.recycle();
                }
                vsVar.b = Bitmap.createBitmap(vsVar.y, i7, Bitmap.Config.ARGB_8888);
                vsVar.c = new Canvas(vsVar.b);
                vsVar.b.eraseColor(0);
                vsVar.c.save();
                vsVar.c.translate(0.0f, 0);
                vsVar.c(vsVar.c);
                vsVar.c.restore();
                vsVar.b.prepareToDraw();
                org.telegram.messenger.g0.g3(vsVar.I);
            default:
                vs vsVar2 = this.b;
                vsVar2.f = false;
                vsVar2.g();
                if (!vsVar2.a) {
                    vsVar2.j();
                    break;
                } else if (vsVar2.w == vsVar2.K) {
                    vsVar2.H = true;
                    break;
                }
                break;
        }
    }
}
