package hg;

import android.graphics.Bitmap;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final /* synthetic */ class r implements org.telegram.ui.ActionBar.z1, gh.b, d9.e, e2.m, e2.n {
    public final /* synthetic */ int a;

    public /* synthetic */ r(int i10) {
        this.a = i10;
    }

    @Override // gh.b
    public Object a(Bitmap bitmap) {
        switch (this.a) {
            case 2:
                if (bitmap == null || bitmap.isRecycled()) {
                    return null;
                }
                Bitmap stackBlurBitmapWithScaleFactor = Utilities.stackBlurBitmapWithScaleFactor(bitmap, Math.max(bitmap.getWidth() / 90.0f, bitmap.getHeight() / 120.0f));
                stackBlurBitmapWithScaleFactor.setHasAlpha(false);
                return stackBlurBitmapWithScaleFactor;
            case 3:
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
        return new j2.f((e2.x) obj);
    }

    @Override // e2.n
    public void e(Object obj, b2.q qVar) {
    }

    @Override // org.telegram.ui.ActionBar.z1
    public void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.a) {
            case 0:
                a2Var.dismiss();
                break;
            default:
                a2Var.dismiss();
                break;
        }
    }

    @Override // e2.m
    public void invoke(Object obj) {
        switch (this.a) {
            case 10:
                ((b2.z0) obj).onPlayerError(new i2.n(2, new androidx.car.app.j("Player release timed out."), 1003));
                break;
            case 11:
                ((b2.z0) obj).onRenderedFirstFrame();
                break;
            case 12:
            case 26:
            default:
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
            case 25:
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

    public /* synthetic */ r(j2.a aVar, int i10, int i11) {
        this.a = i11;
    }

    public /* synthetic */ r(j2.a aVar, int i10, int i11, boolean z10) {
        this.a = 25;
    }

    public /* synthetic */ r(j2.a aVar, Object obj, int i10) {
        this.a = i10;
    }

    public /* synthetic */ r(j2.a aVar, String str, long j3, long j10) {
        this.a = 19;
    }

    public /* synthetic */ r(j2.a aVar, boolean z10) {
        this.a = 18;
    }

    public /* synthetic */ r(j2.a aVar, boolean z10, int i10, int i11) {
        this.a = i11;
    }
}
