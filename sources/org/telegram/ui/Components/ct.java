package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class ct implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ et b;

    public /* synthetic */ ct(et etVar, int i10) {
        this.a = i10;
        this.b = etVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10;
        Bitmap bitmap;
        switch (this.a) {
            case 0:
                et etVar = this.b;
                try {
                    i10 = etVar.w + 0;
                    bitmap = etVar.b;
                } catch (Exception e) {
                    FileLog.e(e);
                    etVar.B = true;
                }
                if (bitmap != null) {
                    if (bitmap.getWidth() == etVar.x) {
                        if (etVar.b.getHeight() != i10) {
                        }
                        etVar.b.eraseColor(0);
                        etVar.c.save();
                        etVar.c.translate(0.0f, 0);
                        etVar.c(etVar.c);
                        etVar.c.restore();
                        etVar.b.prepareToDraw();
                        AndroidUtilities.runOnUIThread(etVar.E);
                        break;
                    }
                }
                Bitmap bitmap2 = etVar.b;
                if (bitmap2 != null) {
                    bitmap2.recycle();
                }
                etVar.b = Bitmap.createBitmap(etVar.x, i10, Bitmap.Config.ARGB_8888);
                etVar.c = new Canvas(etVar.b);
                etVar.b.eraseColor(0);
                etVar.c.save();
                etVar.c.translate(0.0f, 0);
                etVar.c(etVar.c);
                etVar.c.restore();
                etVar.b.prepareToDraw();
                AndroidUtilities.runOnUIThread(etVar.E);
            default:
                et etVar2 = this.b;
                etVar2.f = false;
                etVar2.g();
                if (!etVar2.a) {
                    etVar2.j();
                    break;
                } else if (etVar2.v == etVar2.G) {
                    etVar2.D = true;
                    break;
                }
                break;
        }
    }
}
