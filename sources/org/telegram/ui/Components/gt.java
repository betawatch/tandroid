package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class gt implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ jt b;

    public /* synthetic */ gt(jt jtVar, int i10) {
        this.a = i10;
        this.b = jtVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10;
        Bitmap bitmap;
        switch (this.a) {
            case 0:
                jt jtVar = this.b;
                try {
                    i10 = jtVar.w + 0;
                    bitmap = jtVar.b;
                } catch (Exception e) {
                    FileLog.e(e);
                    jtVar.E = true;
                }
                if (bitmap != null) {
                    if (bitmap.getWidth() == jtVar.x) {
                        if (jtVar.b.getHeight() != i10) {
                        }
                        jtVar.b.eraseColor(0);
                        jtVar.c.save();
                        jtVar.c.translate(0.0f, 0);
                        jtVar.c(jtVar.c);
                        jtVar.c.restore();
                        jtVar.b.prepareToDraw();
                        AndroidUtilities.runOnUIThread(jtVar.H);
                        break;
                    }
                }
                Bitmap bitmap2 = jtVar.b;
                if (bitmap2 != null) {
                    bitmap2.recycle();
                }
                jtVar.b = Bitmap.createBitmap(jtVar.x, i10, Bitmap.Config.ARGB_8888);
                jtVar.c = new Canvas(jtVar.b);
                jtVar.b.eraseColor(0);
                jtVar.c.save();
                jtVar.c.translate(0.0f, 0);
                jtVar.c(jtVar.c);
                jtVar.c.restore();
                jtVar.b.prepareToDraw();
                AndroidUtilities.runOnUIThread(jtVar.H);
            default:
                jt jtVar2 = this.b;
                jtVar2.f = false;
                jtVar2.g();
                if (!jtVar2.a) {
                    jtVar2.j();
                    break;
                } else if (jtVar2.v == jtVar2.J) {
                    jtVar2.G = true;
                    break;
                }
                break;
        }
    }
}
