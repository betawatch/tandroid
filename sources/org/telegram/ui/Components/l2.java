package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.view.ActionMode;
import android.view.View;
import android.view.WindowManager;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.GenericProvider;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class l2 implements qc0, org.telegram.ui.ActionBar.b2, b5, ImageReceiver.ImageReceiverDelegate, GenericProvider, p.a, gh.b, hv0, iv0, r0.n {
    public final /* synthetic */ int a;

    public /* synthetic */ l2(int i10) {
        this.a = i10;
    }

    public static /* bridge */ /* synthetic */ boolean d(Object obj) {
        return obj instanceof ActionMode.Callback2;
    }

    @Override // org.telegram.ui.Components.b5
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

    @Override // gh.b
    public Object a(Bitmap bitmap) {
        return bitmap.getConfig() == Bitmap.Config.ALPHA_8 ? bitmap : bitmap.extractAlpha();
    }

    @Override // org.telegram.ui.Components.iv0
    public void b(Object obj, float f7) {
        switch (this.a) {
            case 18:
                yc0 yc0Var = (yc0) obj;
                yc0Var.f = f7;
                if (!yc0Var.y || yc0Var.F) {
                    yc0Var.c.setStrokeWidth(AndroidUtilities.lerp(yc0Var.v, yc0Var.w, f7));
                    yc0Var.f();
                }
                yc0Var.invalidate();
                break;
            case 20:
                yc0 yc0Var2 = (yc0) obj;
                yc0Var2.n = f7;
                if (!yc0Var2.y || yc0Var2.F) {
                    yc0Var2.f();
                }
                yc0Var2.invalidate();
                break;
            case 22:
                yc0 yc0Var3 = (yc0) obj;
                yc0Var3.s = f7;
                yc0Var3.f();
                break;
            case 26:
                fg0 fg0Var = (fg0) obj;
                WindowManager.LayoutParams layoutParams = fg0Var.c;
                fg0Var.K = f7;
                layoutParams.x = (int) f7;
                try {
                    AndroidUtilities.updateViewLayout(fg0Var.b, fg0Var.d, layoutParams);
                    break;
                } catch (IllegalArgumentException unused) {
                    fg0Var.M.c();
                    return;
                }
            default:
                fg0 fg0Var2 = (fg0) obj;
                WindowManager.LayoutParams layoutParams2 = fg0Var2.c;
                fg0Var2.L = f7;
                layoutParams2.y = (int) f7;
                try {
                    AndroidUtilities.updateViewLayout(fg0Var2.b, fg0Var2.d, layoutParams2);
                    break;
                } catch (IllegalArgumentException unused2) {
                    fg0Var2.N.c();
                }
        }
    }

    @Override // p.a
    public oc c(vc vcVar) {
        return vcVar.k(false);
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        yi0 lottieAnimation;
        switch (this.a) {
            case 10:
                Drawable drawable = imageReceiver.getDrawable();
                if (drawable instanceof yi0) {
                    yi0 yi0Var = (yi0) drawable;
                    yi0Var.P(0);
                    yi0Var.stop();
                    yi0Var.T(0.0f, false);
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
        org.telegram.messenger.h5.a(this, i10, str, drawable);
    }

    @Override // org.telegram.ui.Components.qc0
    public String e(int i10) {
        switch (this.a) {
            case 0:
                return String.format("%02d", Integer.valueOf(i10));
            case 1:
                return hg.k0.i(i10, "");
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
                return hg.k0.i(i10, "");
        }
    }

    @Override // org.telegram.ui.ActionBar.b2
    public void f(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        switch (this.a) {
            case 5:
                Pattern pattern = c5.a;
                break;
            default:
                c2Var.dismiss();
                break;
        }
    }

    @Override // org.telegram.ui.Components.hv0
    public float get(Object obj) {
        switch (this.a) {
            case 17:
                return ((yc0) obj).f;
            case 19:
                return ((yc0) obj).n;
            case 21:
                return ((yc0) obj).s;
            case 25:
                return ((fg0) obj).K;
            default:
                return ((fg0) obj).L;
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
            case 11:
                return CheckBoxBase.I;
            default:
                int i10 = kz.O2;
                return 0;
        }
    }
}
