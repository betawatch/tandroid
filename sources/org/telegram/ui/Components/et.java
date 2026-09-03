package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class et implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ gt b;

    public /* synthetic */ et(gt gtVar, int i10) {
        this.a = i10;
        this.b = gtVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10;
        Bitmap bitmap;
        switch (this.a) {
            case 0:
                gt gtVar = this.b;
                try {
                    i10 = gtVar.w + 0;
                    bitmap = gtVar.b;
                } catch (Exception e6) {
                    FileLog.e(e6);
                    gtVar.B = true;
                }
                if (bitmap != null) {
                    if (bitmap.getWidth() == gtVar.x) {
                        if (gtVar.b.getHeight() != i10) {
                        }
                        gtVar.b.eraseColor(0);
                        gtVar.c.save();
                        gtVar.c.translate(0.0f, 0);
                        gtVar.c(gtVar.c);
                        gtVar.c.restore();
                        gtVar.b.prepareToDraw();
                        AndroidUtilities.runOnUIThread(gtVar.E);
                        break;
                    }
                }
                Bitmap bitmap2 = gtVar.b;
                if (bitmap2 != null) {
                    bitmap2.recycle();
                }
                gtVar.b = Bitmap.createBitmap(gtVar.x, i10, Bitmap.Config.ARGB_8888);
                gtVar.c = new Canvas(gtVar.b);
                gtVar.b.eraseColor(0);
                gtVar.c.save();
                gtVar.c.translate(0.0f, 0);
                gtVar.c(gtVar.c);
                gtVar.c.restore();
                gtVar.b.prepareToDraw();
                AndroidUtilities.runOnUIThread(gtVar.E);
            default:
                gt gtVar2 = this.b;
                gtVar2.f = false;
                gtVar2.g();
                if (!gtVar2.a) {
                    gtVar2.j();
                    break;
                } else if (gtVar2.v == gtVar2.G) {
                    gtVar2.D = true;
                    break;
                }
                break;
        }
    }
}
