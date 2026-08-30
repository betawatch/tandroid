package ih;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class l implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ m b;
    public final /* synthetic */ int c;

    public /* synthetic */ l(m mVar, int i10, int i11) {
        this.a = i11;
        this.b = mVar;
        this.c = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                m mVar = this.b;
                int i10 = mVar.k;
                f7.b[] bVarArr = mVar.c;
                int i11 = this.c;
                if (bVarArr[i11] == null) {
                    bVarArr[i11] = new f7.b(i10);
                }
                Bitmap bitmap = mVar.e;
                if (bitmap == null) {
                    mVar.e = Bitmap.createBitmap(i10, i10, Bitmap.Config.ALPHA_8);
                    mVar.f = new Canvas(mVar.e);
                } else {
                    bitmap.eraseColor(0);
                }
                mVar.a(mVar.f, mVar.o);
                Utilities.copyBitmaps(mVar.e, (Bitmap) bVarArr[i11].b);
                AndroidUtilities.runOnUIThread(new l(mVar, i11, 1));
                break;
            default:
                m mVar2 = this.b;
                int i12 = this.c;
                mVar2.d = i12;
                mVar2.g.setShader((BitmapShader) mVar2.c[i12].c);
                mVar2.j = false;
                mVar2.p = true;
                break;
        }
    }
}
