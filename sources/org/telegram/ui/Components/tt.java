package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class tt implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ vt b;

    public /* synthetic */ tt(vt vtVar, int i10) {
        this.a = i10;
        this.b = vtVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10;
        Bitmap bitmap;
        switch (this.a) {
            case 0:
                vt vtVar = this.b;
                try {
                    i10 = vtVar.w + 0;
                    bitmap = vtVar.b;
                } catch (Exception e) {
                    FileLog.e(e);
                    vtVar.E = true;
                }
                if (bitmap != null) {
                    if (bitmap.getWidth() == vtVar.x) {
                        if (vtVar.b.getHeight() != i10) {
                        }
                        vtVar.b.eraseColor(0);
                        vtVar.c.save();
                        vtVar.c.translate(0.0f, 0);
                        vtVar.c(vtVar.c);
                        vtVar.c.restore();
                        vtVar.b.prepareToDraw();
                        AndroidUtilities.runOnUIThread(vtVar.H);
                        break;
                    }
                }
                Bitmap bitmap2 = vtVar.b;
                if (bitmap2 != null) {
                    bitmap2.recycle();
                }
                vtVar.b = Bitmap.createBitmap(vtVar.x, i10, Bitmap.Config.ARGB_8888);
                vtVar.c = new Canvas(vtVar.b);
                vtVar.b.eraseColor(0);
                vtVar.c.save();
                vtVar.c.translate(0.0f, 0);
                vtVar.c(vtVar.c);
                vtVar.c.restore();
                vtVar.b.prepareToDraw();
                AndroidUtilities.runOnUIThread(vtVar.H);
            default:
                vt vtVar2 = this.b;
                vtVar2.f = false;
                vtVar2.g();
                if (!vtVar2.a) {
                    vtVar2.j();
                    break;
                } else if (vtVar2.v == vtVar2.J) {
                    vtVar2.G = true;
                    break;
                }
                break;
        }
    }
}
