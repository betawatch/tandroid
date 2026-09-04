package i0;

import android.graphics.Bitmap;
import b2.q;
import b2.z0;
import e2.m;
import e2.n;
import e2.x;
import i2.o;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.a2;
import org.telegram.ui.ActionBar.b2;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements d9.e, m, a2, hh.b, n {
    public final /* synthetic */ int a;

    public /* synthetic */ b(int i10) {
        this.a = i10;
    }

    @Override // hh.b
    public Object a(Bitmap bitmap) {
        switch (this.a) {
            case 9:
                if (bitmap == null || bitmap.isRecycled()) {
                    return null;
                }
                Bitmap stackBlurBitmapWithScaleFactor = Utilities.stackBlurBitmapWithScaleFactor(bitmap, Math.max(bitmap.getWidth() / 90.0f, bitmap.getHeight() / 120.0f));
                stackBlurBitmapWithScaleFactor.setHasAlpha(false);
                return stackBlurBitmapWithScaleFactor;
            case 10:
                int i10 = 0;
                if (bitmap != null && !bitmap.isRecycled()) {
                    int height = bitmap.getHeight();
                    i10 = Utilities.averageBitmapColor(bitmap, 0, (height * 9) / 10, bitmap.getWidth(), height);
                }
                return Integer.valueOf(i10);
            default:
                int i11 = 0;
                if (bitmap != null && !bitmap.isRecycled()) {
                    i11 = Utilities.averageBitmapColor(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight() / 10);
                }
                return Integer.valueOf(i11);
        }
    }

    @Override // d9.e, i5.e
    public Object apply(Object obj) {
        return new j2.f((x) obj);
    }

    @Override // e2.n
    public void c(Object obj, q qVar) {
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void g(b2 b2Var, int i10) {
        switch (this.a) {
            case 7:
                b2Var.dismiss();
                break;
            default:
                b2Var.dismiss();
                break;
        }
    }

    @Override // e2.m
    public void invoke(Object obj) {
        switch (this.a) {
            case 5:
                ((z0) obj).onPlayerError(new o(2, new androidx.car.app.j("Player release timed out."), 1003));
                break;
            case 6:
                ((z0) obj).onRenderedFirstFrame();
                break;
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 25:
            default:
                ((j2.b) obj).getClass();
                break;
            case 12:
                ((j2.b) obj).getClass();
                break;
            case 13:
                ((j2.b) obj).getClass();
                break;
            case 14:
                ((j2.b) obj).getClass();
                break;
            case 15:
                ((j2.b) obj).getClass();
                break;
            case 16:
                ((j2.b) obj).getClass();
                break;
            case 17:
                ((j2.b) obj).getClass();
                break;
            case 18:
                ((j2.b) obj).getClass();
                break;
            case 19:
                ((j2.b) obj).getClass();
                break;
            case 20:
                ((j2.b) obj).getClass();
                break;
            case 21:
                ((j2.b) obj).getClass();
                break;
            case 22:
                ((j2.b) obj).getClass();
                break;
            case 23:
                ((j2.b) obj).getClass();
                break;
            case 24:
                ((j2.b) obj).getClass();
                break;
            case 26:
                ((j2.b) obj).getClass();
                break;
            case 27:
                ((j2.b) obj).getClass();
                break;
            case 28:
                ((j2.b) obj).getClass();
                break;
        }
    }

    public /* synthetic */ b(j2.a aVar, int i10, int i11) {
        this.a = i11;
    }

    public /* synthetic */ b(j2.a aVar, int i10, int i11, boolean z10) {
        this.a = 24;
    }

    public /* synthetic */ b(j2.a aVar, Object obj, int i10) {
        this.a = i10;
    }

    public /* synthetic */ b(j2.a aVar, String str, long j3, long j10) {
        this.a = 18;
    }

    public /* synthetic */ b(j2.a aVar, boolean z10) {
        this.a = 17;
    }

    public /* synthetic */ b(j2.a aVar, boolean z10, int i10, int i11) {
        this.a = i11;
    }
}
