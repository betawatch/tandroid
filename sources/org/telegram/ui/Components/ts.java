package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class ts implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ us b;

    public /* synthetic */ ts(us usVar, int i7) {
        this.a = i7;
        this.b = usVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7;
        Bitmap bitmap;
        switch (this.a) {
            case 0:
                us usVar = this.b;
                try {
                    i7 = usVar.x + 0;
                    bitmap = usVar.b;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    usVar.F = true;
                }
                if (bitmap != null) {
                    if (bitmap.getWidth() == usVar.y) {
                        if (usVar.b.getHeight() != i7) {
                        }
                        usVar.b.eraseColor(0);
                        usVar.c.save();
                        usVar.c.translate(0.0f, 0);
                        usVar.c(usVar.c);
                        usVar.c.restore();
                        usVar.b.prepareToDraw();
                        org.telegram.messenger.g0.g3(usVar.I);
                        break;
                    }
                }
                Bitmap bitmap2 = usVar.b;
                if (bitmap2 != null) {
                    bitmap2.recycle();
                }
                usVar.b = Bitmap.createBitmap(usVar.y, i7, Bitmap.Config.ARGB_8888);
                usVar.c = new Canvas(usVar.b);
                usVar.b.eraseColor(0);
                usVar.c.save();
                usVar.c.translate(0.0f, 0);
                usVar.c(usVar.c);
                usVar.c.restore();
                usVar.b.prepareToDraw();
                org.telegram.messenger.g0.g3(usVar.I);
            default:
                us usVar2 = this.b;
                usVar2.f = false;
                usVar2.g();
                if (!usVar2.a) {
                    usVar2.j();
                    break;
                } else if (usVar2.w == usVar2.K) {
                    usVar2.H = true;
                    break;
                }
                break;
        }
    }
}
