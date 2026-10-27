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

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class rd0 implements ow0, pw0, ImageReceiver.ImageReceiverDelegate, fh.d, r0.n, org.telegram.ui.ActionBar.b2, org.telegram.ui.ActionBar.c7, org.telegram.ui.ActionBar.d7, GenericProvider, LanguageDetector.ExceptionCallback {
    public final /* synthetic */ int a;

    public /* synthetic */ rd0(int i10) {
        this.a = i10;
    }

    @Override // r0.n
    public r0.k1 P0(View view, r0.k1 k1Var) {
        return r0.k1.b;
    }

    @Override // org.telegram.ui.Components.pw0
    public void b(Object obj, float f7) {
        switch (this.a) {
            case 1:
                sd0 sd0Var = (sd0) obj;
                sd0Var.n = f7;
                if (!sd0Var.y || sd0Var.F) {
                    sd0Var.f();
                }
                sd0Var.invalidate();
                break;
            case 3:
                sd0 sd0Var2 = (sd0) obj;
                sd0Var2.s = f7;
                sd0Var2.f();
                break;
            case 8:
                dh0 dh0Var = (dh0) obj;
                WindowManager.LayoutParams layoutParams = dh0Var.c;
                dh0Var.K = f7;
                layoutParams.x = (int) f7;
                try {
                    AndroidUtilities.updateViewLayout(dh0Var.b, dh0Var.d, layoutParams);
                    break;
                } catch (IllegalArgumentException unused) {
                    dh0Var.M.c();
                    return;
                }
            case 10:
                dh0 dh0Var2 = (dh0) obj;
                WindowManager.LayoutParams layoutParams2 = dh0Var2.c;
                dh0Var2.L = f7;
                layoutParams2.y = (int) f7;
                try {
                    AndroidUtilities.updateViewLayout(dh0Var2.b, dh0Var2.d, layoutParams2);
                    break;
                } catch (IllegalArgumentException unused2) {
                    dh0Var2.N.c();
                    return;
                }
            default:
                dq0 dq0Var = (dq0) obj;
                dq0Var.n = f7;
                dq0Var.invalidate();
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.d7
    public void d(int i10, View view) {
        ((bp0) view).setTextColor(i10);
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        yj0 lottieAnimation;
        switch (this.a) {
            case 4:
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
        org.telegram.messenger.p5.a(this, i10, str, drawable);
    }

    @Override // org.telegram.ui.ActionBar.c7
    public int e(View view) {
        return ((bp0) view).v;
    }

    @Override // org.telegram.ui.Components.ow0
    public float get(Object obj) {
        switch (this.a) {
            case 0:
                return ((sd0) obj).n;
            case 2:
                return ((sd0) obj).s;
            case 7:
                return ((dh0) obj).K;
            case 9:
                return ((dh0) obj).L;
            default:
                return ((dq0) obj).n;
        }
    }

    @Override // org.telegram.ui.ActionBar.b2
    public void h(org.telegram.ui.ActionBar.e2 e2Var, int i10) {
        switch (this.a) {
            case 12:
                e2Var.dismiss();
                break;
            case 13:
                e2Var.dismiss();
                break;
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            default:
                e2Var.dismiss();
                break;
            case 19:
                e2Var.dismiss();
                break;
            case 20:
                e2Var.dismiss();
                break;
            case 21:
                e2Var.dismiss();
                break;
            case 22:
                int i11 = dz0.w0;
                break;
            case 23:
                e2Var.dismiss();
                break;
        }
    }

    @Override // fh.d
    public int i(org.telegram.ui.ActionBar.u6 u6Var, boolean z10) {
        Bitmap bitmap = ai.a0.a;
        return (((int) a1.g.C(ai.w1.b[3], 255.0f, 100.0f, 0.5f)) << 24) | 16777215;
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public /* synthetic */ void onAnimationReady(ImageReceiver imageReceiver) {
        int i10 = this.a;
        org.telegram.messenger.p5.b(this, imageReceiver);
    }

    @Override // org.telegram.messenger.GenericProvider
    public Object provide(Object obj) {
        int i10 = nr0.Z0;
        return 0;
    }

    @Override // org.telegram.messenger.LanguageDetector.ExceptionCallback
    public void run(Exception exc) {
        FileLog.e(exc);
    }
}
