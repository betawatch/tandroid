package nh;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.i0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class j implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ k b;
    public final /* synthetic */ int c;

    public /* synthetic */ j(k kVar, int i10, int i11) {
        this.a = i11;
        this.b = kVar;
        this.c = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                k kVar = this.b;
                int i10 = kVar.k;
                m4.c[] cVarArr = kVar.c;
                int i11 = this.c;
                if (cVarArr[i11] == null) {
                    cVarArr[i11] = new m4.c(i10);
                }
                Bitmap bitmap = kVar.e;
                if (bitmap == null) {
                    kVar.e = Bitmap.createBitmap(i10, i10, Bitmap.Config.ALPHA_8);
                    kVar.f = new Canvas(kVar.e);
                } else {
                    bitmap.eraseColor(0);
                }
                kVar.a(kVar.f, kVar.o);
                Utilities.copyBitmaps(kVar.e, (Bitmap) cVarArr[i11].b);
                i0.g3(new j(kVar, i11, 1));
                break;
            default:
                k kVar2 = this.b;
                int i12 = this.c;
                kVar2.d = i12;
                kVar2.g.setShader((BitmapShader) kVar2.c[i12].c);
                kVar2.j = false;
                kVar2.p = true;
                break;
        }
    }
}
