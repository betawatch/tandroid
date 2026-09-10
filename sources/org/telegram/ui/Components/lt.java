package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class lt implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ nt b;

    public /* synthetic */ lt(nt ntVar, int i10) {
        this.a = i10;
        this.b = ntVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10;
        Bitmap bitmap;
        switch (this.a) {
            case 0:
                nt ntVar = this.b;
                try {
                    i10 = ntVar.w + 0;
                    bitmap = ntVar.b;
                } catch (Exception e) {
                    FileLog.e(e);
                    ntVar.E = true;
                }
                if (bitmap != null) {
                    if (bitmap.getWidth() == ntVar.x) {
                        if (ntVar.b.getHeight() != i10) {
                        }
                        ntVar.b.eraseColor(0);
                        ntVar.c.save();
                        ntVar.c.translate(0.0f, 0);
                        ntVar.c(ntVar.c);
                        ntVar.c.restore();
                        ntVar.b.prepareToDraw();
                        AndroidUtilities.runOnUIThread(ntVar.H);
                        break;
                    }
                }
                Bitmap bitmap2 = ntVar.b;
                if (bitmap2 != null) {
                    bitmap2.recycle();
                }
                ntVar.b = Bitmap.createBitmap(ntVar.x, i10, Bitmap.Config.ARGB_8888);
                ntVar.c = new Canvas(ntVar.b);
                ntVar.b.eraseColor(0);
                ntVar.c.save();
                ntVar.c.translate(0.0f, 0);
                ntVar.c(ntVar.c);
                ntVar.c.restore();
                ntVar.b.prepareToDraw();
                AndroidUtilities.runOnUIThread(ntVar.H);
            default:
                nt ntVar2 = this.b;
                ntVar2.f = false;
                ntVar2.g();
                if (!ntVar2.a) {
                    ntVar2.j();
                    break;
                } else if (ntVar2.v == ntVar2.J) {
                    ntVar2.G = true;
                    break;
                }
                break;
        }
    }
}
