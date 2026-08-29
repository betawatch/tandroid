package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class ys implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ at b;

    public /* synthetic */ ys(at atVar, int i10) {
        this.a = i10;
        this.b = atVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10;
        Bitmap bitmap;
        switch (this.a) {
            case 0:
                at atVar = this.b;
                try {
                    i10 = atVar.w + 0;
                    bitmap = atVar.b;
                } catch (Exception e10) {
                    FileLog.e(e10);
                    atVar.A = true;
                }
                if (bitmap != null) {
                    if (bitmap.getWidth() == atVar.x) {
                        if (atVar.b.getHeight() != i10) {
                        }
                        atVar.b.eraseColor(0);
                        atVar.c.save();
                        atVar.c.translate(0.0f, 0);
                        atVar.c(atVar.c);
                        atVar.c.restore();
                        atVar.b.prepareToDraw();
                        AndroidUtilities.runOnUIThread(atVar.D);
                        break;
                    }
                }
                Bitmap bitmap2 = atVar.b;
                if (bitmap2 != null) {
                    bitmap2.recycle();
                }
                atVar.b = Bitmap.createBitmap(atVar.x, i10, Bitmap.Config.ARGB_8888);
                atVar.c = new Canvas(atVar.b);
                atVar.b.eraseColor(0);
                atVar.c.save();
                atVar.c.translate(0.0f, 0);
                atVar.c(atVar.c);
                atVar.c.restore();
                atVar.b.prepareToDraw();
                AndroidUtilities.runOnUIThread(atVar.D);
            default:
                at atVar2 = this.b;
                atVar2.f = false;
                atVar2.g();
                if (!atVar2.a) {
                    atVar2.j();
                    break;
                } else if (atVar2.v == atVar2.F) {
                    atVar2.C = true;
                    break;
                }
                break;
        }
    }
}
