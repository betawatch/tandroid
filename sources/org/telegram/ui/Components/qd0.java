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

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class qd0 implements nw0, ow0, ImageReceiver.ImageReceiverDelegate, fh.d, r0.n, org.telegram.ui.ActionBar.b2, org.telegram.ui.ActionBar.c7, org.telegram.ui.ActionBar.d7, GenericProvider, LanguageDetector.ExceptionCallback {
    public final /* synthetic */ int a;

    public /* synthetic */ qd0(int i10) {
        this.a = i10;
    }

    @Override // r0.n
    public r0.k1 P0(View view, r0.k1 k1Var) {
        return r0.k1.b;
    }

    @Override // org.telegram.ui.Components.ow0
    public void b(Object obj, float f7) {
        switch (this.a) {
            case 1:
                rd0 rd0Var = (rd0) obj;
                rd0Var.n = f7;
                if (!rd0Var.y || rd0Var.F) {
                    rd0Var.f();
                }
                rd0Var.invalidate();
                break;
            case 3:
                rd0 rd0Var2 = (rd0) obj;
                rd0Var2.s = f7;
                rd0Var2.f();
                break;
            case 8:
                ch0 ch0Var = (ch0) obj;
                WindowManager.LayoutParams layoutParams = ch0Var.c;
                ch0Var.K = f7;
                layoutParams.x = (int) f7;
                try {
                    AndroidUtilities.updateViewLayout(ch0Var.b, ch0Var.d, layoutParams);
                    break;
                } catch (IllegalArgumentException unused) {
                    ch0Var.M.c();
                    return;
                }
            case 10:
                ch0 ch0Var2 = (ch0) obj;
                WindowManager.LayoutParams layoutParams2 = ch0Var2.c;
                ch0Var2.L = f7;
                layoutParams2.y = (int) f7;
                try {
                    AndroidUtilities.updateViewLayout(ch0Var2.b, ch0Var2.d, layoutParams2);
                    break;
                } catch (IllegalArgumentException unused2) {
                    ch0Var2.N.c();
                    return;
                }
            default:
                cq0 cq0Var = (cq0) obj;
                cq0Var.n = f7;
                cq0Var.invalidate();
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.d7
    public void d(int i10, View view) {
        ((ap0) view).setTextColor(i10);
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        xj0 lottieAnimation;
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
        org.telegram.messenger.o5.a(this, i10, str, drawable);
    }

    @Override // org.telegram.ui.ActionBar.c7
    public int e(View view) {
        return ((ap0) view).v;
    }

    @Override // org.telegram.ui.Components.nw0
    public float get(Object obj) {
        switch (this.a) {
            case 0:
                return ((rd0) obj).n;
            case 2:
                return ((rd0) obj).s;
            case 7:
                return ((ch0) obj).K;
            case 9:
                return ((ch0) obj).L;
            default:
                return ((cq0) obj).n;
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
                int i11 = cz0.w0;
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
        org.telegram.messenger.o5.b(this, imageReceiver);
    }

    @Override // org.telegram.messenger.GenericProvider
    public Object provide(Object obj) {
        int i10 = mr0.Z0;
        return 0;
    }

    @Override // org.telegram.messenger.LanguageDetector.ExceptionCallback
    public void run(Exception exc) {
        FileLog.e(exc);
    }
}
