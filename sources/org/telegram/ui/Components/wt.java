package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class wt implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ yt b;

    public /* synthetic */ wt(yt ytVar, int i10) {
        this.a = i10;
        this.b = ytVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10;
        Bitmap bitmap;
        switch (this.a) {
            case 0:
                yt ytVar = this.b;
                try {
                    i10 = ytVar.w + 0;
                    bitmap = ytVar.b;
                } catch (Exception e7) {
                    FileLog.e(e7);
                    ytVar.E = true;
                }
                if (bitmap != null) {
                    if (bitmap.getWidth() == ytVar.x) {
                        if (ytVar.b.getHeight() != i10) {
                        }
                        ytVar.b.eraseColor(0);
                        ytVar.c.save();
                        ytVar.c.translate(0.0f, 0);
                        ytVar.c(ytVar.c);
                        ytVar.c.restore();
                        ytVar.b.prepareToDraw();
                        AndroidUtilities.runOnUIThread(ytVar.H);
                        break;
                    }
                }
                Bitmap bitmap2 = ytVar.b;
                if (bitmap2 != null) {
                    bitmap2.recycle();
                }
                ytVar.b = Bitmap.createBitmap(ytVar.x, i10, Bitmap.Config.ARGB_8888);
                ytVar.c = new Canvas(ytVar.b);
                ytVar.b.eraseColor(0);
                ytVar.c.save();
                ytVar.c.translate(0.0f, 0);
                ytVar.c(ytVar.c);
                ytVar.c.restore();
                ytVar.b.prepareToDraw();
                AndroidUtilities.runOnUIThread(ytVar.H);
            default:
                yt ytVar2 = this.b;
                ytVar2.f = false;
                ytVar2.g();
                if (!ytVar2.a) {
                    ytVar2.j();
                    break;
                } else if (ytVar2.v == ytVar2.J) {
                    ytVar2.G = true;
                    break;
                }
                break;
        }
    }
}
