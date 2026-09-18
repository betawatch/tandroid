package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class ft implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ht b;

    public /* synthetic */ ft(ht htVar, int i10) {
        this.a = i10;
        this.b = htVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10;
        Bitmap bitmap;
        switch (this.a) {
            case 0:
                ht htVar = this.b;
                try {
                    i10 = htVar.w + 0;
                    bitmap = htVar.b;
                } catch (Exception e) {
                    FileLog.e(e);
                    htVar.E = true;
                }
                if (bitmap != null) {
                    if (bitmap.getWidth() == htVar.x) {
                        if (htVar.b.getHeight() != i10) {
                        }
                        htVar.b.eraseColor(0);
                        htVar.c.save();
                        htVar.c.translate(0.0f, 0);
                        htVar.c(htVar.c);
                        htVar.c.restore();
                        htVar.b.prepareToDraw();
                        AndroidUtilities.runOnUIThread(htVar.H);
                        break;
                    }
                }
                Bitmap bitmap2 = htVar.b;
                if (bitmap2 != null) {
                    bitmap2.recycle();
                }
                htVar.b = Bitmap.createBitmap(htVar.x, i10, Bitmap.Config.ARGB_8888);
                htVar.c = new Canvas(htVar.b);
                htVar.b.eraseColor(0);
                htVar.c.save();
                htVar.c.translate(0.0f, 0);
                htVar.c(htVar.c);
                htVar.c.restore();
                htVar.b.prepareToDraw();
                AndroidUtilities.runOnUIThread(htVar.H);
            default:
                ht htVar2 = this.b;
                htVar2.f = false;
                htVar2.g();
                if (!htVar2.a) {
                    htVar2.j();
                    break;
                } else if (htVar2.v == htVar2.J) {
                    htVar2.G = true;
                    break;
                }
                break;
        }
    }
}
