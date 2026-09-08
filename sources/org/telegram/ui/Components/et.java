package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
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
                } catch (Exception e7) {
                    FileLog.e(e7);
                    gtVar.E = true;
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
                        AndroidUtilities.runOnUIThread(gtVar.H);
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
                AndroidUtilities.runOnUIThread(gtVar.H);
            default:
                gt gtVar2 = this.b;
                gtVar2.f = false;
                gtVar2.g();
                if (!gtVar2.a) {
                    gtVar2.j();
                    break;
                } else if (gtVar2.v == gtVar2.J) {
                    gtVar2.G = true;
                    break;
                }
                break;
        }
    }
}
