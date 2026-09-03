package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class bt implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ dt b;

    public /* synthetic */ bt(dt dtVar, int i10) {
        this.a = i10;
        this.b = dtVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10;
        Bitmap bitmap;
        switch (this.a) {
            case 0:
                dt dtVar = this.b;
                try {
                    i10 = dtVar.w + 0;
                    bitmap = dtVar.b;
                } catch (Exception e) {
                    FileLog.e(e);
                    dtVar.B = true;
                }
                if (bitmap != null) {
                    if (bitmap.getWidth() == dtVar.x) {
                        if (dtVar.b.getHeight() != i10) {
                        }
                        dtVar.b.eraseColor(0);
                        dtVar.c.save();
                        dtVar.c.translate(0.0f, 0);
                        dtVar.c(dtVar.c);
                        dtVar.c.restore();
                        dtVar.b.prepareToDraw();
                        AndroidUtilities.runOnUIThread(dtVar.E);
                        break;
                    }
                }
                Bitmap bitmap2 = dtVar.b;
                if (bitmap2 != null) {
                    bitmap2.recycle();
                }
                dtVar.b = Bitmap.createBitmap(dtVar.x, i10, Bitmap.Config.ARGB_8888);
                dtVar.c = new Canvas(dtVar.b);
                dtVar.b.eraseColor(0);
                dtVar.c.save();
                dtVar.c.translate(0.0f, 0);
                dtVar.c(dtVar.c);
                dtVar.c.restore();
                dtVar.b.prepareToDraw();
                AndroidUtilities.runOnUIThread(dtVar.E);
            default:
                dt dtVar2 = this.b;
                dtVar2.f = false;
                dtVar2.g();
                if (!dtVar2.a) {
                    dtVar2.j();
                    break;
                } else if (dtVar2.v == dtVar2.G) {
                    dtVar2.D = true;
                    break;
                }
                break;
        }
    }
}
