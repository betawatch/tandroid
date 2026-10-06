package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes3.dex */
public final class jt implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ lt b;

    public /* synthetic */ jt(lt ltVar, int i10) {
        this.a = i10;
        this.b = ltVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10;
        Bitmap bitmap;
        switch (this.a) {
            case 0:
                lt ltVar = this.b;
                try {
                    i10 = ltVar.w + 0;
                    bitmap = ltVar.b;
                } catch (Exception e7) {
                    FileLog.e(e7);
                    ltVar.E = true;
                }
                if (bitmap != null) {
                    if (bitmap.getWidth() == ltVar.x) {
                        if (ltVar.b.getHeight() != i10) {
                        }
                        ltVar.b.eraseColor(0);
                        ltVar.c.save();
                        ltVar.c.translate(0.0f, 0);
                        ltVar.c(ltVar.c);
                        ltVar.c.restore();
                        ltVar.b.prepareToDraw();
                        AndroidUtilities.runOnUIThread(ltVar.H);
                        break;
                    }
                }
                Bitmap bitmap2 = ltVar.b;
                if (bitmap2 != null) {
                    bitmap2.recycle();
                }
                ltVar.b = Bitmap.createBitmap(ltVar.x, i10, Bitmap.Config.ARGB_8888);
                ltVar.c = new Canvas(ltVar.b);
                ltVar.b.eraseColor(0);
                ltVar.c.save();
                ltVar.c.translate(0.0f, 0);
                ltVar.c(ltVar.c);
                ltVar.c.restore();
                ltVar.b.prepareToDraw();
                AndroidUtilities.runOnUIThread(ltVar.H);
            default:
                lt ltVar2 = this.b;
                ltVar2.f = false;
                ltVar2.g();
                if (!ltVar2.a) {
                    ltVar2.j();
                    break;
                } else if (ltVar2.v == ltVar2.J) {
                    ltVar2.G = true;
                    break;
                }
                break;
        }
    }
}
