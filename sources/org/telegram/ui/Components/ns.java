package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class ns implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ os b;

    public /* synthetic */ ns(os osVar, int i7) {
        this.a = i7;
        this.b = osVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7;
        Bitmap bitmap;
        switch (this.a) {
            case 0:
                os osVar = this.b;
                try {
                    i7 = osVar.x + 0;
                    bitmap = osVar.b;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    osVar.F = true;
                }
                if (bitmap != null) {
                    if (bitmap.getWidth() == osVar.y) {
                        if (osVar.b.getHeight() != i7) {
                        }
                        osVar.b.eraseColor(0);
                        osVar.c.save();
                        osVar.c.translate(0.0f, 0);
                        osVar.c(osVar.c);
                        osVar.c.restore();
                        osVar.b.prepareToDraw();
                        org.telegram.messenger.g0.h3(osVar.I);
                        break;
                    }
                }
                Bitmap bitmap2 = osVar.b;
                if (bitmap2 != null) {
                    bitmap2.recycle();
                }
                osVar.b = Bitmap.createBitmap(osVar.y, i7, Bitmap.Config.ARGB_8888);
                osVar.c = new Canvas(osVar.b);
                osVar.b.eraseColor(0);
                osVar.c.save();
                osVar.c.translate(0.0f, 0);
                osVar.c(osVar.c);
                osVar.c.restore();
                osVar.b.prepareToDraw();
                org.telegram.messenger.g0.h3(osVar.I);
            default:
                os osVar2 = this.b;
                osVar2.f = false;
                osVar2.g();
                if (!osVar2.a) {
                    osVar2.j();
                    break;
                } else if (osVar2.w == osVar2.K) {
                    osVar2.H = true;
                    break;
                }
                break;
        }
    }
}
