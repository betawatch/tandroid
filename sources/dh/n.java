package dh;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class n implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ o b;
    public final /* synthetic */ int c;

    public /* synthetic */ n(o oVar, int i9, int i10) {
        this.a = i10;
        this.b = oVar;
        this.c = i9;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                o oVar = this.b;
                int i9 = oVar.k;
                we.b[] bVarArr = oVar.c;
                int i10 = this.c;
                if (bVarArr[i10] == null) {
                    bVarArr[i10] = new we.b(i9);
                }
                Bitmap bitmap = oVar.e;
                if (bitmap == null) {
                    oVar.e = Bitmap.createBitmap(i9, i9, Bitmap.Config.ALPHA_8);
                    oVar.f = new Canvas(oVar.e);
                } else {
                    bitmap.eraseColor(0);
                }
                oVar.a(oVar.f, oVar.o);
                Utilities.copyBitmaps(oVar.e, (Bitmap) bVarArr[i10].b);
                AndroidUtilities.runOnUIThread(new n(oVar, i10, 1));
                break;
            default:
                o oVar2 = this.b;
                int i11 = this.c;
                oVar2.d = i11;
                oVar2.g.setShader((BitmapShader) oVar2.c[i11].c);
                oVar2.j = false;
                oVar2.p = true;
                break;
        }
    }
}
