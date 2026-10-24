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

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ud0 implements gw0, ImageReceiver.ImageReceiverDelegate, eh.d, r0.n, fw0, org.telegram.ui.ActionBar.z1, org.telegram.ui.ActionBar.o6, org.telegram.ui.ActionBar.p6, GenericProvider, LanguageDetector.ExceptionCallback {
    public final /* synthetic */ int a;

    public /* synthetic */ ud0(int i10) {
        this.a = i10;
    }

    @Override // r0.n
    public r0.k1 B0(View view, r0.k1 k1Var) {
        return r0.k1.b;
    }

    @Override // org.telegram.ui.Components.gw0
    public void b(Object obj, float f7) {
        switch (this.a) {
            case 0:
                vd0 vd0Var = (vd0) obj;
                vd0Var.s = f7;
                vd0Var.f();
                break;
            case 5:
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
            case 7:
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
            case 14:
                xp0 xp0Var = (xp0) obj;
                xp0Var.n = f7;
                xp0Var.invalidate();
                break;
            case 25:
                org.telegram.ui.Components.voip.h1 h1Var = (org.telegram.ui.Components.voip.h1) obj;
                WindowManager.LayoutParams layoutParams3 = h1Var.c;
                h1Var.Q = f7;
                layoutParams3.x = (int) f7;
                AndroidUtilities.updateViewLayout(h1Var.b, h1Var.d, layoutParams3);
                break;
            default:
                org.telegram.ui.Components.voip.h1 h1Var2 = (org.telegram.ui.Components.voip.h1) obj;
                WindowManager.LayoutParams layoutParams4 = h1Var2.c;
                h1Var2.R = f7;
                layoutParams4.y = (int) f7;
                AndroidUtilities.updateViewLayout(h1Var2.b, h1Var2.d, layoutParams4);
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.p6
    public void d(int i10, View view) {
        ((wo0) view).setTextColor(i10);
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        yj0 lottieAnimation;
        switch (this.a) {
            case 1:
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
        org.telegram.messenger.m5.a(this, i10, str, drawable);
    }

    @Override // org.telegram.ui.ActionBar.o6
    public int f(View view) {
        return ((wo0) view).v;
    }

    @Override // org.telegram.ui.ActionBar.z1
    public void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        switch (this.a) {
            case 9:
                c2Var.dismiss();
                break;
            case 10:
                c2Var.dismiss();
                break;
            case 16:
                c2Var.dismiss();
                break;
            case 17:
                c2Var.dismiss();
                break;
            case 18:
                c2Var.dismiss();
                break;
            case 19:
                int i11 = ty0.w0;
                break;
            case 20:
                c2Var.dismiss();
                break;
            case 22:
                c2Var.dismiss();
                break;
            case 28:
                c2Var.dismiss();
                break;
        }
    }

    @Override // org.telegram.ui.Components.fw0
    public float get(Object obj) {
        switch (this.a) {
            case 4:
                return ((dh0) obj).K;
            case 6:
                return ((dh0) obj).L;
            case 13:
                return ((xp0) obj).n;
            case 24:
                return ((org.telegram.ui.Components.voip.h1) obj).Q;
            default:
                return ((org.telegram.ui.Components.voip.h1) obj).R;
        }
    }

    @Override // eh.d
    public int i(org.telegram.ui.ActionBar.g6 g6Var, boolean z10) {
        Bitmap bitmap = zh.t.a;
        return (((int) a1.g.B(zh.d1.b[3], 255.0f, 100.0f, 0.5f)) << 24) | 16777215;
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public /* synthetic */ void onAnimationReady(ImageReceiver imageReceiver) {
        int i10 = this.a;
        org.telegram.messenger.m5.b(this, imageReceiver);
    }

    @Override // org.telegram.messenger.GenericProvider
    public Object provide(Object obj) {
        int i10 = ir0.d1;
        return 0;
    }

    @Override // org.telegram.messenger.LanguageDetector.ExceptionCallback
    public void run(Exception exc) {
        FileLog.e(exc);
    }

    private final void a(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
    }
}
