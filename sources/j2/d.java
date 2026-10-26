package j2;

import android.graphics.Bitmap;
import b2.p0;
import e2.o;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.ActionBar.e2;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final /* synthetic */ class d implements o, b2, ih.b {
    public final /* synthetic */ int a;

    public /* synthetic */ d(int i10) {
        this.a = i10;
    }

    @Override // ih.b
    public Object a(Bitmap bitmap) {
        if (bitmap == null || bitmap.isRecycled()) {
            return null;
        }
        Bitmap stackBlurBitmapWithScaleFactor = Utilities.stackBlurBitmapWithScaleFactor(bitmap, Math.max(bitmap.getWidth() / 90.0f, bitmap.getHeight() / 120.0f));
        stackBlurBitmapWithScaleFactor.setHasAlpha(false);
        return stackBlurBitmapWithScaleFactor;
    }

    @Override // org.telegram.ui.ActionBar.b2
    public void h(e2 e2Var, int i10) {
        switch (this.a) {
            case 27:
                e2Var.dismiss();
                break;
            default:
                e2Var.dismiss();
                break;
        }
    }

    @Override // e2.o
    public void invoke(Object obj) {
        b bVar = (b) obj;
        switch (this.a) {
            case 0:
                bVar.getClass();
                break;
            case 1:
                bVar.getClass();
                break;
            case 2:
                bVar.getClass();
                break;
            case 3:
                bVar.getClass();
                break;
            case 4:
                bVar.getClass();
                break;
            case 5:
                bVar.getClass();
                break;
            case 6:
                bVar.getClass();
                break;
            case 7:
                bVar.getClass();
                break;
            case 8:
                bVar.getClass();
                break;
            case 9:
                bVar.getClass();
                break;
            case 10:
                bVar.getClass();
                break;
            case 11:
                bVar.getClass();
                break;
            case 12:
                bVar.getClass();
                break;
            case 13:
                bVar.getClass();
                break;
            case 14:
                bVar.getClass();
                break;
            case 15:
                bVar.getClass();
                break;
            case 16:
                bVar.getClass();
                break;
            case 17:
                bVar.getClass();
                break;
            case 18:
                bVar.getClass();
                break;
            case 19:
                bVar.getClass();
                break;
            case 20:
                bVar.getClass();
                break;
            case 21:
                bVar.getClass();
                break;
            case 22:
                bVar.getClass();
                break;
            case 23:
                bVar.getClass();
                break;
            default:
                bVar.getClass();
                break;
        }
    }

    public /* synthetic */ d(a aVar, float f7) {
        this.a = 24;
    }

    public /* synthetic */ d(a aVar, int i10) {
        this.a = i10;
    }

    public /* synthetic */ d(a aVar, int i10, int i11) {
        this.a = i11;
    }

    public /* synthetic */ d(a aVar, long j10) {
        this.a = 15;
    }

    public /* synthetic */ d(a aVar, p0 p0Var, int i10) {
        this.a = 23;
    }

    public /* synthetic */ d(a aVar, Object obj, int i10) {
        this.a = i10;
    }

    public /* synthetic */ d(a aVar, Object obj, Object obj2, int i10) {
        this.a = i10;
    }

    public /* synthetic */ d(a aVar, boolean z10, int i10) {
        this.a = i10;
    }
}
