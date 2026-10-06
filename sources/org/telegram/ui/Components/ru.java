package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.WindowManager;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.GenericProvider;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LanguageDetector;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes3.dex */
public final /* synthetic */ class ru implements p.a, GenericProvider, org.telegram.ui.ActionBar.a2, gh.b, dw0, ew0, ImageReceiver.ImageReceiverDelegate, r0.n, LanguageDetector.ExceptionCallback {
    public final /* synthetic */ int a;

    public /* synthetic */ ru(int i10) {
        this.a = i10;
    }

    @Override // r0.n
    public r0.l1 Q0(View view, r0.l1 l1Var) {
        return r0.l1.b;
    }

    @Override // gh.b
    public Object a(Bitmap bitmap) {
        return bitmap.getConfig() == Bitmap.Config.ALPHA_8 ? bitmap : bitmap.extractAlpha();
    }

    @Override // org.telegram.ui.Components.ew0
    public void b(Object obj, float f7) {
        switch (this.a) {
            case 5:
                ld0 ld0Var = (ld0) obj;
                ld0Var.f = f7;
                if (!ld0Var.y || ld0Var.F) {
                    ld0Var.c.setStrokeWidth(AndroidUtilities.lerp(ld0Var.v, ld0Var.w, f7));
                    ld0Var.f();
                }
                ld0Var.invalidate();
                break;
            case 7:
                ld0 ld0Var2 = (ld0) obj;
                ld0Var2.n = f7;
                if (!ld0Var2.y || ld0Var2.F) {
                    ld0Var2.f();
                }
                ld0Var2.invalidate();
                break;
            case 9:
                ld0 ld0Var3 = (ld0) obj;
                ld0Var3.s = f7;
                ld0Var3.f();
                break;
            case 13:
                rg0 rg0Var = (rg0) obj;
                WindowManager.LayoutParams layoutParams = rg0Var.c;
                rg0Var.K = f7;
                layoutParams.x = (int) f7;
                try {
                    AndroidUtilities.updateViewLayout(rg0Var.b, rg0Var.d, layoutParams);
                    break;
                } catch (IllegalArgumentException unused) {
                    rg0Var.M.c();
                    return;
                }
            case 15:
                rg0 rg0Var2 = (rg0) obj;
                WindowManager.LayoutParams layoutParams2 = rg0Var2.c;
                rg0Var2.L = f7;
                layoutParams2.y = (int) f7;
                try {
                    AndroidUtilities.updateViewLayout(rg0Var2.b, rg0Var2.d, layoutParams2);
                    break;
                } catch (IllegalArgumentException unused2) {
                    rg0Var2.N.c();
                    return;
                }
            default:
                qp0 qp0Var = (qp0) obj;
                qp0Var.n = f7;
                qp0Var.invalidate();
                break;
        }
    }

    @Override // p.a
    public rc c(yc ycVar) {
        return ycVar.k(false);
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        kj0 lottieAnimation;
        switch (this.a) {
            case 10:
                if (z10 && !z11 && (lottieAnimation = imageReceiver.getLottieAnimation()) != null) {
                    lottieAnimation.start();
                    break;
                }
                break;
            default:
                if (imageReceiver.canInvertBitmap()) {
                    imageReceiver.setColorFilter(new ColorMatrixColorFilter(new float[]{-1.0f, 0.0f, 0.0f, 0.0f, 255.0f, 0.0f, -1.0f, 0.0f, 0.0f, 255.0f, 0.0f, 0.0f, -1.0f, 0.0f, 255.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f}));
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public /* synthetic */ void didSetImageBitmap(int i10, String str, Drawable drawable) {
        int i11 = this.a;
        org.telegram.messenger.h5.a(this, i10, str, drawable);
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.a) {
            case 2:
                b2Var.dismiss();
                break;
            case 17:
                b2Var.dismiss();
                break;
            case 18:
                b2Var.dismiss();
                break;
            case 22:
                b2Var.dismiss();
                break;
            case 23:
                b2Var.dismiss();
                break;
            case 24:
                b2Var.dismiss();
                break;
            case 25:
                int i11 = ry0.u0;
                break;
            case 26:
                b2Var.dismiss();
                break;
            default:
                b2Var.dismiss();
                break;
        }
    }

    @Override // org.telegram.ui.Components.dw0
    public float get(Object obj) {
        switch (this.a) {
            case 4:
                return ((ld0) obj).f;
            case 6:
                return ((ld0) obj).n;
            case 8:
                return ((ld0) obj).s;
            case 12:
                return ((rg0) obj).K;
            case 14:
                return ((rg0) obj).L;
            default:
                return ((qp0) obj).n;
        }
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public /* synthetic */ void onAnimationReady(ImageReceiver imageReceiver) {
        int i10 = this.a;
        org.telegram.messenger.h5.b(this, imageReceiver);
    }

    @Override // org.telegram.messenger.GenericProvider
    public Object provide(Object obj) {
        switch (this.a) {
            case 1:
                int i10 = nz.M2;
                break;
            default:
                int i11 = br0.W0;
                break;
        }
        return 0;
    }

    @Override // org.telegram.messenger.LanguageDetector.ExceptionCallback
    public void run(Exception exc) {
        FileLog.e(exc);
    }
}
