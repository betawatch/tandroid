// default package

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class opa implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ppa b;
    public final /* synthetic */ int c;

    public /* synthetic */ opa(ppa ppaVar, int i, byte b) {
        this.a = b;
        this.b = ppaVar;
        this.c = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        byte b2 = 1;
        int i = this.c;
        ppa ppaVar = this.b;
        switch (b) {
            case 0:
                int i2 = ppaVar.k;
                ym4[] ym4VarArr = ppaVar.c;
                if (ym4VarArr[i] == null) {
                    ym4VarArr[i] = new ym4(i2);
                }
                Bitmap bitmap = ppaVar.e;
                if (bitmap == null) {
                    ppaVar.e = Bitmap.createBitmap(i2, i2, Bitmap.Config.ALPHA_8);
                    ppaVar.f = new Canvas(ppaVar.e);
                } else {
                    bitmap.eraseColor(0);
                }
                ppaVar.a(ppaVar.f, ppaVar.o);
                Utilities.copyBitmaps(ppaVar.e, (Bitmap) ym4VarArr[i].b);
                hl.c3(new opa(ppaVar, i, b2));
                break;
            default:
                ppaVar.d = i;
                ppaVar.g.setShader((BitmapShader) ppaVar.c[i].c);
                ppaVar.j = false;
                ppaVar.p = true;
                break;
        }
    }
}
