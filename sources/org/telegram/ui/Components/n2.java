package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.WindowManager;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.GenericProvider;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final /* synthetic */ class n2 implements qd0, org.telegram.ui.ActionBar.z1, f5, ImageReceiver.ImageReceiverDelegate, GenericProvider, p.a, hh.b, fw0, gw0, r0.n {
    public final /* synthetic */ int a;

    public /* synthetic */ n2(int i10) {
        this.a = i10;
    }

    @Override // org.telegram.ui.Components.f5
    public void J(int i10, int i11, boolean z10) {
        switch (this.a) {
            case 8:
                MediaController.getInstance().stopRecording(1, z10, i10, false, 0L);
                break;
            default:
                MediaController.getInstance().stopRecording(1, z10, i10, false, 0L);
                break;
        }
    }

    @Override // r0.n
    public r0.l1 Q0(View view, r0.l1 l1Var) {
        return r0.l1.b;
    }

    @Override // hh.b
    public Object a(Bitmap bitmap) {
        return bitmap.getConfig() == Bitmap.Config.ALPHA_8 ? bitmap : bitmap.extractAlpha();
    }

    @Override // org.telegram.ui.Components.gw0
    public void b(Object obj, float f7) {
        switch (this.a) {
            case 18:
                yd0 yd0Var = (yd0) obj;
                yd0Var.f = f7;
                if (!yd0Var.y || yd0Var.F) {
                    yd0Var.c.setStrokeWidth(AndroidUtilities.lerp(yd0Var.v, yd0Var.w, f7));
                    yd0Var.f();
                }
                yd0Var.invalidate();
                break;
            case 20:
                yd0 yd0Var2 = (yd0) obj;
                yd0Var2.n = f7;
                if (!yd0Var2.y || yd0Var2.F) {
                    yd0Var2.f();
                }
                yd0Var2.invalidate();
                break;
            case 22:
                yd0 yd0Var3 = (yd0) obj;
                yd0Var3.s = f7;
                yd0Var3.f();
                break;
            case 26:
                fh0 fh0Var = (fh0) obj;
                WindowManager.LayoutParams layoutParams = fh0Var.c;
                fh0Var.K = f7;
                layoutParams.x = (int) f7;
                try {
                    AndroidUtilities.updateViewLayout(fh0Var.b, fh0Var.d, layoutParams);
                    break;
                } catch (IllegalArgumentException unused) {
                    fh0Var.M.c();
                    return;
                }
            default:
                fh0 fh0Var2 = (fh0) obj;
                WindowManager.LayoutParams layoutParams2 = fh0Var2.c;
                fh0Var2.L = f7;
                layoutParams2.y = (int) f7;
                try {
                    AndroidUtilities.updateViewLayout(fh0Var2.b, fh0Var2.d, layoutParams2);
                    break;
                } catch (IllegalArgumentException unused2) {
                    fh0Var2.N.c();
                }
        }
    }

    @Override // p.a
    public sc c(zc zcVar) {
        return zcVar.k(false);
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        yj0 lottieAnimation;
        switch (this.a) {
            case 10:
                Drawable drawable = imageReceiver.getDrawable();
                if (drawable instanceof yj0) {
                    yj0 yj0Var = (yj0) drawable;
                    yj0Var.P(0);
                    yj0Var.stop();
                    yj0Var.T(0.0f, false);
                    break;
                }
                break;
            default:
                if (z10 && !z11 && (lottieAnimation = imageReceiver.getLottieAnimation()) != null) {
                    lottieAnimation.start();
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public /* synthetic */ void didSetImageBitmap(int i10, String str, Drawable drawable) {
        int i11 = this.a;
        org.telegram.messenger.l5.a(this, i10, str, drawable);
    }

    @Override // org.telegram.ui.Components.qd0
    public String e(int i10) {
        switch (this.a) {
            case 0:
                return String.format("%02d", Integer.valueOf(i10));
            case 1:
                return i2.d.j(i10, "");
            case 2:
                return String.format("%02d", Integer.valueOf(i10));
            case 3:
                return String.format("%02d", Integer.valueOf(i10));
            case 4:
                return i10 == 0 ? LocaleController.getString(R.string.ShortMessageLifetimeForever) : (i10 < 1 || i10 >= 16) ? i10 == 16 ? LocaleController.formatTTLString(30) : i10 == 17 ? LocaleController.formatTTLString(60) : i10 == 18 ? LocaleController.formatTTLString(3600) : i10 == 19 ? LocaleController.formatTTLString(86400) : i10 == 20 ? LocaleController.formatTTLString(604800) : "" : LocaleController.formatTTLString(i10);
            case 5:
            default:
                switch (i10) {
                    case 0:
                        return LocaleController.getString(R.string.January);
                    case 1:
                        return LocaleController.getString(R.string.February);
                    case 2:
                        return LocaleController.getString(R.string.March);
                    case 3:
                        return LocaleController.getString(R.string.April);
                    case 4:
                        return LocaleController.getString(R.string.May);
                    case 5:
                        return LocaleController.getString(R.string.June);
                    case 6:
                        return LocaleController.getString(R.string.July);
                    case 7:
                        return LocaleController.getString(R.string.August);
                    case 8:
                        return LocaleController.getString(R.string.September);
                    case 9:
                        return LocaleController.getString(R.string.October);
                    case 10:
                        return LocaleController.getString(R.string.November);
                    default:
                        return LocaleController.getString(R.string.December);
                }
            case 6:
                return i2.d.j(i10, "");
        }
    }

    @Override // org.telegram.ui.ActionBar.z1
    public void g(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.a) {
            case 5:
                Pattern pattern = g5.a;
                break;
            case 11:
                a2Var.dismiss();
                break;
            default:
                a2Var.dismiss();
                break;
        }
    }

    @Override // org.telegram.ui.Components.fw0
    public float get(Object obj) {
        switch (this.a) {
            case 17:
                return ((yd0) obj).f;
            case 19:
                return ((yd0) obj).n;
            case 21:
                return ((yd0) obj).s;
            case 25:
                return ((fh0) obj).K;
            default:
                return ((fh0) obj).L;
        }
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public /* synthetic */ void onAnimationReady(ImageReceiver imageReceiver) {
        int i10 = this.a;
        org.telegram.messenger.l5.b(this, imageReceiver);
    }

    @Override // org.telegram.messenger.GenericProvider
    public Object provide(Object obj) {
        switch (this.a) {
            case 12:
                return CheckBoxBase.I;
            default:
                int i10 = wz.O2;
                return 0;
        }
    }
}
