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

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class fa0 implements org.telegram.ui.ActionBar.z1, gh.b, rv0, sv0, ImageReceiver.ImageReceiverDelegate, r0.n, GenericProvider, LanguageDetector.ExceptionCallback {
    public final /* synthetic */ int a;

    public /* synthetic */ fa0(int i10) {
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

    @Override // org.telegram.ui.Components.sv0
    public void b(Object obj, float f7) {
        switch (this.a) {
            case 3:
                jd0 jd0Var = (jd0) obj;
                jd0Var.f = f7;
                if (!jd0Var.y || jd0Var.F) {
                    jd0Var.c.setStrokeWidth(AndroidUtilities.lerp(jd0Var.v, jd0Var.w, f7));
                    jd0Var.f();
                }
                jd0Var.invalidate();
                break;
            case 5:
                jd0 jd0Var2 = (jd0) obj;
                jd0Var2.n = f7;
                if (!jd0Var2.y || jd0Var2.F) {
                    jd0Var2.f();
                }
                jd0Var2.invalidate();
                break;
            case 7:
                jd0 jd0Var3 = (jd0) obj;
                jd0Var3.s = f7;
                jd0Var3.f();
                break;
            case 11:
                og0 og0Var = (og0) obj;
                WindowManager.LayoutParams layoutParams = og0Var.c;
                og0Var.K = f7;
                layoutParams.x = (int) f7;
                try {
                    AndroidUtilities.updateViewLayout(og0Var.b, og0Var.d, layoutParams);
                    break;
                } catch (IllegalArgumentException unused) {
                    og0Var.M.c();
                    return;
                }
            case 13:
                og0 og0Var2 = (og0) obj;
                WindowManager.LayoutParams layoutParams2 = og0Var2.c;
                og0Var2.L = f7;
                layoutParams2.y = (int) f7;
                try {
                    AndroidUtilities.updateViewLayout(og0Var2.b, og0Var2.d, layoutParams2);
                    break;
                } catch (IllegalArgumentException unused2) {
                    og0Var2.N.c();
                    return;
                }
            case 18:
                jp0 jp0Var = (jp0) obj;
                jp0Var.n = f7;
                jp0Var.invalidate();
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
        ij0 lottieAnimation;
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
                int i11 = fy0.u0;
                break;
            case 24:
                a2Var.dismiss();
                break;
            default:
                a2Var.dismiss();
                break;
        }
    }

    @Override // org.telegram.ui.Components.rv0
    public float get(Object obj) {
        switch (this.a) {
            case 2:
                return ((jd0) obj).f;
            case 4:
                return ((jd0) obj).n;
            case 6:
                return ((jd0) obj).s;
            case 10:
                return ((og0) obj).K;
            case 12:
                return ((og0) obj).L;
            case 17:
                return ((jp0) obj).n;
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
        int i10 = uq0.a1;
        return 0;
    }

    @Override // org.telegram.messenger.LanguageDetector.ExceptionCallback
    public void run(Exception exc) {
        FileLog.e(exc);
    }
}
