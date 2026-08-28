package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class ts implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ vs b;

    public /* synthetic */ ts(vs vsVar, int i9) {
        this.a = i9;
        this.b = vsVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i9;
        Bitmap bitmap;
        switch (this.a) {
            case 0:
                vs vsVar = this.b;
                try {
                    i9 = vsVar.w + 0;
                    bitmap = vsVar.b;
                } catch (Exception e10) {
                    FileLog.e(e10);
                    vsVar.A = true;
                }
                if (bitmap != null) {
                    if (bitmap.getWidth() == vsVar.x) {
                        if (vsVar.b.getHeight() != i9) {
                        }
                        vsVar.b.eraseColor(0);
                        vsVar.c.save();
                        vsVar.c.translate(0.0f, 0);
                        vsVar.c(vsVar.c);
                        vsVar.c.restore();
                        vsVar.b.prepareToDraw();
                        AndroidUtilities.runOnUIThread(vsVar.D);
                        break;
                    }
                }
                Bitmap bitmap2 = vsVar.b;
                if (bitmap2 != null) {
                    bitmap2.recycle();
                }
                vsVar.b = Bitmap.createBitmap(vsVar.x, i9, Bitmap.Config.ARGB_8888);
                vsVar.c = new Canvas(vsVar.b);
                vsVar.b.eraseColor(0);
                vsVar.c.save();
                vsVar.c.translate(0.0f, 0);
                vsVar.c(vsVar.c);
                vsVar.c.restore();
                vsVar.b.prepareToDraw();
                AndroidUtilities.runOnUIThread(vsVar.D);
            default:
                vs vsVar2 = this.b;
                vsVar2.f = false;
                vsVar2.g();
                if (!vsVar2.a) {
                    vsVar2.j();
                    break;
                } else if (vsVar2.v == vsVar2.F) {
                    vsVar2.C = true;
                    break;
                }
                break;
        }
    }
}
