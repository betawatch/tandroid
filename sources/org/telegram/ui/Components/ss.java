package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class ss implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ us b;

    public /* synthetic */ ss(us usVar, int i10) {
        this.a = i10;
        this.b = usVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10;
        Bitmap bitmap;
        switch (this.a) {
            case 0:
                us usVar = this.b;
                try {
                    i10 = usVar.w + 0;
                    bitmap = usVar.b;
                } catch (Exception e9) {
                    FileLog.e(e9);
                    usVar.A = true;
                }
                if (bitmap != null) {
                    if (bitmap.getWidth() == usVar.x) {
                        if (usVar.b.getHeight() != i10) {
                        }
                        usVar.b.eraseColor(0);
                        usVar.c.save();
                        usVar.c.translate(0.0f, 0);
                        usVar.c(usVar.c);
                        usVar.c.restore();
                        usVar.b.prepareToDraw();
                        AndroidUtilities.runOnUIThread(usVar.D);
                        break;
                    }
                }
                Bitmap bitmap2 = usVar.b;
                if (bitmap2 != null) {
                    bitmap2.recycle();
                }
                usVar.b = Bitmap.createBitmap(usVar.x, i10, Bitmap.Config.ARGB_8888);
                usVar.c = new Canvas(usVar.b);
                usVar.b.eraseColor(0);
                usVar.c.save();
                usVar.c.translate(0.0f, 0);
                usVar.c(usVar.c);
                usVar.c.restore();
                usVar.b.prepareToDraw();
                AndroidUtilities.runOnUIThread(usVar.D);
            default:
                us usVar2 = this.b;
                usVar2.f = false;
                usVar2.g();
                if (!usVar2.a) {
                    usVar2.j();
                    break;
                } else if (usVar2.v == usVar2.F) {
                    usVar2.C = true;
                    break;
                }
                break;
        }
    }
}
