package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class gs implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ hs b;

    public /* synthetic */ gs(hs hsVar, int i7) {
        this.a = i7;
        this.b = hsVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7;
        Bitmap bitmap;
        switch (this.a) {
            case 0:
                hs hsVar = this.b;
                try {
                    i7 = hsVar.x + 0;
                    bitmap = hsVar.b;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    hsVar.E = true;
                }
                if (bitmap != null) {
                    if (bitmap.getWidth() == hsVar.y) {
                        if (hsVar.b.getHeight() != i7) {
                        }
                        hsVar.b.eraseColor(0);
                        hsVar.c.save();
                        hsVar.c.translate(0.0f, 0);
                        hsVar.c(hsVar.c);
                        hsVar.c.restore();
                        hsVar.b.prepareToDraw();
                        org.telegram.messenger.g0.h3(hsVar.H);
                        break;
                    }
                }
                Bitmap bitmap2 = hsVar.b;
                if (bitmap2 != null) {
                    bitmap2.recycle();
                }
                hsVar.b = Bitmap.createBitmap(hsVar.y, i7, Bitmap.Config.ARGB_8888);
                hsVar.c = new Canvas(hsVar.b);
                hsVar.b.eraseColor(0);
                hsVar.c.save();
                hsVar.c.translate(0.0f, 0);
                hsVar.c(hsVar.c);
                hsVar.c.restore();
                hsVar.b.prepareToDraw();
                org.telegram.messenger.g0.h3(hsVar.H);
            default:
                hs hsVar2 = this.b;
                hsVar2.f = false;
                hsVar2.g();
                if (!hsVar2.a) {
                    hsVar2.j();
                    break;
                } else if (hsVar2.w == hsVar2.J) {
                    hsVar2.G = true;
                    break;
                }
                break;
        }
    }
}
