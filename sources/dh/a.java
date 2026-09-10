package dh;

import android.content.pm.ShortcutManager;
import android.graphics.Bitmap;
import android.window.OnBackInvokedDispatcher;
import bi.u6;
import ch.d;
import com.google.firebase.datatransport.TransportRegistrar;
import di.n3;
import di.o4;
import di.t4;
import i5.f;
import org.telegram.messenger.GenericProvider;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.c2;
import org.telegram.ui.ActionBar.d2;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.qv0;
import org.telegram.ui.Components.rv0;
import org.telegram.ui.Components.sv0;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class a implements d, qv0, rv0, GenericProvider, q9.d, c2, fh.b {
    public final /* synthetic */ int a;

    public /* synthetic */ a(int i10) {
        this.a = i10;
    }

    public static /* bridge */ /* synthetic */ ShortcutManager d(Object obj) {
        return (ShortcutManager) obj;
    }

    public static /* bridge */ /* synthetic */ OnBackInvokedDispatcher h(Object obj) {
        return (OnBackInvokedDispatcher) obj;
    }

    public static /* bridge */ /* synthetic */ Class i() {
        return ShortcutManager.class;
    }

    @Override // q9.d
    public Object P1(u6 u6Var) {
        f lambda$getComponents$0;
        lambda$getComponents$0 = TransportRegistrar.lambda$getComponents$0(u6Var);
        return lambda$getComponents$0;
    }

    @Override // fh.b
    public Object a(Bitmap bitmap) {
        switch (this.a) {
            case 25:
                if (bitmap == null || bitmap.isRecycled()) {
                    return null;
                }
                Bitmap stackBlurBitmapWithScaleFactor = Utilities.stackBlurBitmapWithScaleFactor(bitmap, Math.max(bitmap.getWidth() / 90.0f, bitmap.getHeight() / 120.0f));
                stackBlurBitmapWithScaleFactor.setHasAlpha(false);
                return stackBlurBitmapWithScaleFactor;
            case 26:
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

    @Override // org.telegram.ui.Components.rv0
    public void b(Object obj, float f7) {
        switch (this.a) {
            case 10:
                n3 n3Var = (n3) obj;
                n3Var.b = f7;
                n3Var.e.invalidate();
                n3Var.W.setAlpha(f7);
                n3Var.E();
                n3Var.C();
                break;
            case 11:
            default:
                ((t4) obj).setSwipeOffsetY(f7);
                break;
            case 12:
                ((o4) obj).setLoadProgress(f7);
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.c2
    public void f(d2 d2Var, int i10) {
        switch (this.a) {
            case 23:
                d2Var.dismiss();
                break;
            default:
                d2Var.dismiss();
                break;
        }
    }

    @Override // ch.d
    public int g(f6 f6Var, boolean z10) {
        switch (this.a) {
            case 0:
                return j6.l1(0.075f, -16777216);
            case 1:
                return j6.l1(0.88f, j6.v0(j6.d6, f6Var));
            case 2:
                return j6.l1(z10 ? 0.85f : 0.825f, j6.w0(null, j6.G8, false));
            case 3:
                return c.m(LiteMode.isEnabled(262144) ? 0.85f : 0.76f, j6.v0(j6.d6, f6Var), j6.v0(j6.Yk, f6Var));
            case 4:
                return j6.l1(LiteMode.isEnabled(262144) ? 0.85f : 0.76f, j6.v0(j6.d6, f6Var));
            case 5:
                return j6.l1(0.78f, j6.v0(j6.h5, f6Var));
            case 6:
                return j6.l1(0.7f, j6.v0(j6.d6, f6Var));
            case 7:
                LiteMode.isEnabled(262144);
                return 0;
            default:
                return j6.l1(LiteMode.isEnabled(262144) ? 0.85f : 0.76f, j6.v0(j6.d6, f6Var));
        }
    }

    @Override // org.telegram.ui.Components.qv0
    public float get(Object obj) {
        switch (this.a) {
            case 9:
                return ((n3) obj).b;
            case 10:
            default:
                return ((t4) obj).getSwipeOffsetY();
            case 11:
                return ((o4) obj).c;
        }
    }

    @Override // org.telegram.messenger.GenericProvider
    public Object provide(Object obj) {
        sv0 sv0Var = t4.b0;
        return Boolean.FALSE;
    }
}
