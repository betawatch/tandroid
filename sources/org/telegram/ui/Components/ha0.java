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

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ha0 implements org.telegram.ui.ActionBar.z1, gh.b, tv0, uv0, ImageReceiver.ImageReceiverDelegate, r0.n, GenericProvider, LanguageDetector.ExceptionCallback {
    public final /* synthetic */ int a;

    public /* synthetic */ ha0(int i10) {
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

    @Override // org.telegram.ui.Components.uv0
    public void b(Object obj, float f7) {
        switch (this.a) {
            case 3:
                ld0 ld0Var = (ld0) obj;
                ld0Var.f = f7;
                if (!ld0Var.y || ld0Var.F) {
                    ld0Var.c.setStrokeWidth(AndroidUtilities.lerp(ld0Var.v, ld0Var.w, f7));
                    ld0Var.f();
                }
                ld0Var.invalidate();
                break;
            case 5:
                ld0 ld0Var2 = (ld0) obj;
                ld0Var2.n = f7;
                if (!ld0Var2.y || ld0Var2.F) {
                    ld0Var2.f();
                }
                ld0Var2.invalidate();
                break;
            case 7:
                ld0 ld0Var3 = (ld0) obj;
                ld0Var3.s = f7;
                ld0Var3.f();
                break;
            case 11:
                qg0 qg0Var = (qg0) obj;
                WindowManager.LayoutParams layoutParams = qg0Var.c;
                qg0Var.K = f7;
                layoutParams.x = (int) f7;
                try {
                    AndroidUtilities.updateViewLayout(qg0Var.b, qg0Var.d, layoutParams);
                    break;
                } catch (IllegalArgumentException unused) {
                    qg0Var.M.c();
                    return;
                }
            case 13:
                qg0 qg0Var2 = (qg0) obj;
                WindowManager.LayoutParams layoutParams2 = qg0Var2.c;
                qg0Var2.L = f7;
                layoutParams2.y = (int) f7;
                try {
                    AndroidUtilities.updateViewLayout(qg0Var2.b, qg0Var2.d, layoutParams2);
                    break;
                } catch (IllegalArgumentException unused2) {
                    qg0Var2.N.c();
                    return;
                }
            case 18:
                lp0 lp0Var = (lp0) obj;
                lp0Var.n = f7;
                lp0Var.invalidate();
                break;
            default:
                org.telegram.ui.Components.voip.k1 k1Var = (org.telegram.ui.Components.voip.k1) obj;
                WindowManager.LayoutParams layoutParams3 = k1Var.c;
                k1Var.Q = f7;
                layoutParams3.x = (int) f7;
                AndroidUtilities.updateViewLayout(k1Var.b, k1Var.d, layoutParams3);
                break;
        }
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        kj0 lottieAnimation;
        switch (this.a) {
            case 8:
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

    @Override // org.telegram.ui.ActionBar.z1
    public void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.a) {
            case 0:
                a2Var.dismiss();
                break;
            case 15:
                a2Var.dismiss();
                break;
            case 16:
                a2Var.dismiss();
                break;
            case 20:
                a2Var.dismiss();
                break;
            case 21:
                a2Var.dismiss();
                break;
            case 22:
                a2Var.dismiss();
                break;
            case 23:
                int i11 = hy0.u0;
                break;
            case 24:
                a2Var.dismiss();
                break;
            default:
                a2Var.dismiss();
                break;
        }
    }

    @Override // org.telegram.ui.Components.tv0
    public float get(Object obj) {
        switch (this.a) {
            case 2:
                return ((ld0) obj).f;
            case 4:
                return ((ld0) obj).n;
            case 6:
                return ((ld0) obj).s;
            case 10:
                return ((qg0) obj).K;
            case 12:
                return ((qg0) obj).L;
            case 17:
                return ((lp0) obj).n;
            default:
                return ((org.telegram.ui.Components.voip.k1) obj).Q;
        }
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public /* synthetic */ void onAnimationReady(ImageReceiver imageReceiver) {
        int i10 = this.a;
        org.telegram.messenger.h5.b(this, imageReceiver);
    }

    @Override // org.telegram.messenger.GenericProvider
    public Object provide(Object obj) {
        int i10 = wq0.a1;
        return 0;
    }

    @Override // org.telegram.messenger.LanguageDetector.ExceptionCallback
    public void run(Exception exc) {
        FileLog.e(exc);
    }
}
