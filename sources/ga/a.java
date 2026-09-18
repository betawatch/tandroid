package ga;

import android.graphics.Bitmap;
import androidx.car.app.j;
import b2.q;
import b2.z0;
import cf.c;
import com.google.firebase.datatransport.TransportRegistrar;
import d9.e;
import e2.m;
import e2.n;
import e2.x;
import gh.b;
import i5.f;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.a2;
import org.telegram.ui.ActionBar.b2;
import q9.d;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements d, a2, b, e, m, n {
    public final /* synthetic */ int a;

    public /* synthetic */ a(int i10) {
        this.a = i10;
    }

    @Override // q9.d
    public Object G(c cVar) {
        f lambda$getComponents$0;
        lambda$getComponents$0 = TransportRegistrar.lambda$getComponents$0(cVar);
        return lambda$getComponents$0;
    }

    @Override // gh.b
    public Object a(Bitmap bitmap) {
        switch (this.a) {
            case 3:
                if (bitmap == null || bitmap.isRecycled()) {
                    return null;
                }
                Bitmap stackBlurBitmapWithScaleFactor = Utilities.stackBlurBitmapWithScaleFactor(bitmap, Math.max(bitmap.getWidth() / 90.0f, bitmap.getHeight() / 120.0f));
                stackBlurBitmapWithScaleFactor.setHasAlpha(false);
                return stackBlurBitmapWithScaleFactor;
            case 4:
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
    public void e(Object obj, q qVar) {
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void f(b2 b2Var, int i10) {
        switch (this.a) {
            case 1:
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
            case 11:
                ((z0) obj).onPlayerError(new i2.n(2, new j("Player release timed out."), 1003));
                break;
            case 12:
                ((z0) obj).onRenderedFirstFrame();
                break;
            case 13:
            case 27:
            default:
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
            case 26:
                ((j2.b) obj).getClass();
                break;
            case 28:
                ((j2.b) obj).getClass();
                break;
        }
    }

    public /* synthetic */ a(j2.a aVar, int i10, int i11) {
        this.a = i11;
    }

    public /* synthetic */ a(j2.a aVar, int i10, int i11, boolean z10) {
        this.a = 26;
    }

    public /* synthetic */ a(j2.a aVar, Object obj, int i10) {
        this.a = i10;
    }

    public /* synthetic */ a(j2.a aVar, String str, long j3, long j10) {
        this.a = 20;
    }

    public /* synthetic */ a(j2.a aVar, boolean z10) {
        this.a = 19;
    }

    public /* synthetic */ a(j2.a aVar, boolean z10, int i10, int i11) {
        this.a = i11;
    }
}
