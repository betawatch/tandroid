package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final class ot implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ qt b;

    public /* synthetic */ ot(qt qtVar, int i10) {
        this.a = i10;
        this.b = qtVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10;
        Bitmap bitmap;
        switch (this.a) {
            case 0:
                qt qtVar = this.b;
                try {
                    i10 = qtVar.w + 0;
                    bitmap = qtVar.b;
                } catch (Exception e) {
                    FileLog.e(e);
                    qtVar.E = true;
                }
                if (bitmap != null) {
                    if (bitmap.getWidth() == qtVar.x) {
                        if (qtVar.b.getHeight() != i10) {
                        }
                        qtVar.b.eraseColor(0);
                        qtVar.c.save();
                        qtVar.c.translate(0.0f, 0);
                        qtVar.c(qtVar.c);
                        qtVar.c.restore();
                        qtVar.b.prepareToDraw();
                        AndroidUtilities.runOnUIThread(qtVar.H);
                        break;
                    }
                }
                Bitmap bitmap2 = qtVar.b;
                if (bitmap2 != null) {
                    bitmap2.recycle();
                }
                qtVar.b = Bitmap.createBitmap(qtVar.x, i10, Bitmap.Config.ARGB_8888);
                qtVar.c = new Canvas(qtVar.b);
                qtVar.b.eraseColor(0);
                qtVar.c.save();
                qtVar.c.translate(0.0f, 0);
                qtVar.c(qtVar.c);
                qtVar.c.restore();
                qtVar.b.prepareToDraw();
                AndroidUtilities.runOnUIThread(qtVar.H);
            default:
                qt qtVar2 = this.b;
                qtVar2.f = false;
                qtVar2.g();
                if (!qtVar2.a) {
                    qtVar2.j();
                    break;
                } else if (qtVar2.v == qtVar2.J) {
                    qtVar2.G = true;
                    break;
                }
                break;
        }
    }
}
