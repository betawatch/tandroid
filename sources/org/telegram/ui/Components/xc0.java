package org.telegram.ui.Components;

import android.graphics.ColorMatrixColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.WindowManager;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.GenericProvider;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LanguageDetector;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final /* synthetic */ class xc0 implements gv0, hv0, ImageReceiver.ImageReceiverDelegate, r0.n, org.telegram.ui.ActionBar.a2, GenericProvider, LanguageDetector.ExceptionCallback {
    public final /* synthetic */ int a;

    public /* synthetic */ xc0(int i10) {
        this.a = i10;
    }

    @Override // r0.n
    public r0.l1 Q0(View view, r0.l1 l1Var) {
        return r0.l1.b;
    }

    @Override // org.telegram.ui.Components.hv0
    public void a(Object obj, float f7) {
        switch (this.a) {
            case 1:
                yc0 yc0Var = (yc0) obj;
                yc0Var.f = f7;
                if (!yc0Var.y || yc0Var.F) {
                    yc0Var.c.setStrokeWidth(AndroidUtilities.lerp(yc0Var.v, yc0Var.w, f7));
                    yc0Var.f();
                }
                yc0Var.invalidate();
                break;
            case 3:
                yc0 yc0Var2 = (yc0) obj;
                yc0Var2.n = f7;
                if (!yc0Var2.y || yc0Var2.F) {
                    yc0Var2.f();
                }
                yc0Var2.invalidate();
                break;
            case 5:
                yc0 yc0Var3 = (yc0) obj;
                yc0Var3.s = f7;
                yc0Var3.f();
                break;
            case 9:
                eg0 eg0Var = (eg0) obj;
                WindowManager.LayoutParams layoutParams = eg0Var.c;
                eg0Var.K = f7;
                layoutParams.x = (int) f7;
                try {
                    AndroidUtilities.updateViewLayout(eg0Var.b, eg0Var.d, layoutParams);
                    break;
                } catch (IllegalArgumentException unused) {
                    eg0Var.M.c();
                    return;
                }
            case 11:
                eg0 eg0Var2 = (eg0) obj;
                WindowManager.LayoutParams layoutParams2 = eg0Var2.c;
                eg0Var2.L = f7;
                layoutParams2.y = (int) f7;
                try {
                    AndroidUtilities.updateViewLayout(eg0Var2.b, eg0Var2.d, layoutParams2);
                    break;
                } catch (IllegalArgumentException unused2) {
                    eg0Var2.N.c();
                    return;
                }
            case 16:
                wo0 wo0Var = (wo0) obj;
                wo0Var.n = f7;
                wo0Var.invalidate();
                break;
            case 27:
                org.telegram.ui.Components.voip.j1 j1Var = (org.telegram.ui.Components.voip.j1) obj;
                WindowManager.LayoutParams layoutParams3 = j1Var.c;
                j1Var.Q = f7;
                layoutParams3.x = (int) f7;
                AndroidUtilities.updateViewLayout(j1Var.b, j1Var.d, layoutParams3);
                break;
            default:
                org.telegram.ui.Components.voip.j1 j1Var2 = (org.telegram.ui.Components.voip.j1) obj;
                WindowManager.LayoutParams layoutParams4 = j1Var2.c;
                j1Var2.R = f7;
                layoutParams4.y = (int) f7;
                AndroidUtilities.updateViewLayout(j1Var2.b, j1Var2.d, layoutParams4);
                break;
        }
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        yi0 lottieAnimation;
        switch (this.a) {
            case 6:
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
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.a) {
            case 13:
                b2Var.dismiss();
                break;
            case 14:
                b2Var.dismiss();
                break;
            case 15:
            case 16:
            case 17:
            default:
                b2Var.dismiss();
                break;
            case 18:
                b2Var.dismiss();
                break;
            case 19:
                b2Var.dismiss();
                break;
            case 20:
                b2Var.dismiss();
                break;
            case 21:
                int i11 = ux0.u0;
                break;
            case 22:
                b2Var.dismiss();
                break;
        }
    }

    @Override // org.telegram.ui.Components.gv0
    public float get(Object obj) {
        switch (this.a) {
            case 0:
                return ((yc0) obj).f;
            case 2:
                return ((yc0) obj).n;
            case 4:
                return ((yc0) obj).s;
            case 8:
                return ((eg0) obj).K;
            case 10:
                return ((eg0) obj).L;
            case 15:
                return ((wo0) obj).n;
            case 26:
                return ((org.telegram.ui.Components.voip.j1) obj).Q;
            default:
                return ((org.telegram.ui.Components.voip.j1) obj).R;
        }
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public /* synthetic */ void onAnimationReady(ImageReceiver imageReceiver) {
        int i10 = this.a;
        org.telegram.messenger.h5.b(this, imageReceiver);
    }

    @Override // org.telegram.messenger.GenericProvider
    public Object provide(Object obj) {
        int i10 = hq0.a1;
        return 0;
    }

    @Override // org.telegram.messenger.LanguageDetector.ExceptionCallback
    public void run(Exception exc) {
        FileLog.e(exc);
    }
}
