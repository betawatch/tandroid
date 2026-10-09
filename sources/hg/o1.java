package hg;

import android.graphics.Bitmap;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final /* synthetic */ class o1 implements org.telegram.ui.ActionBar.a2, gh.b, d9.e, e2.m, e2.n {
    public final /* synthetic */ int a;

    public /* synthetic */ o1(int i10) {
        this.a = i10;
    }

    @Override // gh.b
    public Object a(Bitmap bitmap) {
        switch (this.a) {
            case 1:
                if (bitmap == null || bitmap.isRecycled()) {
                    return null;
                }
                Bitmap stackBlurBitmapWithScaleFactor = Utilities.stackBlurBitmapWithScaleFactor(bitmap, Math.max(bitmap.getWidth() / 90.0f, bitmap.getHeight() / 120.0f));
                stackBlurBitmapWithScaleFactor.setHasAlpha(false);
                return stackBlurBitmapWithScaleFactor;
            case 2:
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

    @Override // org.telegram.ui.ActionBar.a2
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        b2Var.dismiss();
    }

    @Override // e2.m
    public void invoke(Object obj) {
        switch (this.a) {
            case 9:
                ((b2.z0) obj).onPlayerError(new i2.n(2, new ae.x("Player release timed out."), 1003));
                break;
            case 10:
                ((b2.z0) obj).onRenderedFirstFrame();
                break;
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

    public /* synthetic */ o1(j2.a aVar, int i10, int i11) {
        this.a = i11;
    }

    public /* synthetic */ o1(j2.a aVar, int i10, int i11, boolean z10) {
        this.a = 24;
    }

    public /* synthetic */ o1(j2.a aVar, Object obj, int i10) {
        this.a = i10;
    }

    public /* synthetic */ o1(j2.a aVar, String str, long j3, long j10) {
        this.a = 18;
    }

    public /* synthetic */ o1(j2.a aVar, boolean z10) {
        this.a = 17;
    }

    public /* synthetic */ o1(j2.a aVar, boolean z10, int i10, int i11) {
        this.a = i11;
    }
}
