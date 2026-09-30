package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes3.dex */
public final class ht implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ kt b;

    public /* synthetic */ ht(kt ktVar, int i10) {
        this.a = i10;
        this.b = ktVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10;
        Bitmap bitmap;
        switch (this.a) {
            case 0:
                kt ktVar = this.b;
                try {
                    i10 = ktVar.w + 0;
                    bitmap = ktVar.b;
                } catch (Exception e) {
                    FileLog.e(e);
                    ktVar.E = true;
                }
                if (bitmap != null) {
                    if (bitmap.getWidth() == ktVar.x) {
                        if (ktVar.b.getHeight() != i10) {
                        }
                        ktVar.b.eraseColor(0);
                        ktVar.c.save();
                        ktVar.c.translate(0.0f, 0);
                        ktVar.c(ktVar.c);
                        ktVar.c.restore();
                        ktVar.b.prepareToDraw();
                        AndroidUtilities.runOnUIThread(ktVar.H);
                        break;
                    }
                }
                Bitmap bitmap2 = ktVar.b;
                if (bitmap2 != null) {
                    bitmap2.recycle();
                }
                ktVar.b = Bitmap.createBitmap(ktVar.x, i10, Bitmap.Config.ARGB_8888);
                ktVar.c = new Canvas(ktVar.b);
                ktVar.b.eraseColor(0);
                ktVar.c.save();
                ktVar.c.translate(0.0f, 0);
                ktVar.c(ktVar.c);
                ktVar.c.restore();
                ktVar.b.prepareToDraw();
                AndroidUtilities.runOnUIThread(ktVar.H);
            default:
                kt ktVar2 = this.b;
                ktVar2.f = false;
                ktVar2.g();
                if (!ktVar2.a) {
                    ktVar2.j();
                    break;
                } else if (ktVar2.v == ktVar2.J) {
                    ktVar2.G = true;
                    break;
                }
                break;
        }
    }
}
