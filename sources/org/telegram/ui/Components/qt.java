package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class qt implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ st b;

    public /* synthetic */ qt(st stVar, int i10) {
        this.a = i10;
        this.b = stVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10;
        Bitmap bitmap;
        switch (this.a) {
            case 0:
                st stVar = this.b;
                try {
                    i10 = stVar.w + 0;
                    bitmap = stVar.b;
                } catch (Exception e) {
                    FileLog.e(e);
                    stVar.E = true;
                }
                if (bitmap != null) {
                    if (bitmap.getWidth() == stVar.x) {
                        if (stVar.b.getHeight() != i10) {
                        }
                        stVar.b.eraseColor(0);
                        stVar.c.save();
                        stVar.c.translate(0.0f, 0);
                        stVar.c(stVar.c);
                        stVar.c.restore();
                        stVar.b.prepareToDraw();
                        AndroidUtilities.runOnUIThread(stVar.H);
                        break;
                    }
                }
                Bitmap bitmap2 = stVar.b;
                if (bitmap2 != null) {
                    bitmap2.recycle();
                }
                stVar.b = Bitmap.createBitmap(stVar.x, i10, Bitmap.Config.ARGB_8888);
                stVar.c = new Canvas(stVar.b);
                stVar.b.eraseColor(0);
                stVar.c.save();
                stVar.c.translate(0.0f, 0);
                stVar.c(stVar.c);
                stVar.c.restore();
                stVar.b.prepareToDraw();
                AndroidUtilities.runOnUIThread(stVar.H);
            default:
                st stVar2 = this.b;
                stVar2.f = false;
                stVar2.g();
                if (!stVar2.a) {
                    stVar2.j();
                    break;
                } else if (stVar2.v == stVar2.J) {
                    stVar2.G = true;
                    break;
                }
                break;
        }
    }
}
