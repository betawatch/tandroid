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

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class q2 implements zc0, org.telegram.ui.ActionBar.c2, c5, ImageReceiver.ImageReceiverDelegate, GenericProvider, p.a, fh.b, qv0, rv0, r0.n {
    public final /* synthetic */ int a;

    public /* synthetic */ q2(int i10) {
        this.a = i10;
    }

    public static /* bridge */ /* synthetic */ boolean d(Object obj) {
        return obj instanceof ActionMode.Callback2;
    }

    @Override // org.telegram.ui.Components.c5
    public void I(int i10, int i11, boolean z10) {
        switch (this.a) {
            case 6:
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

    @Override // fh.b
    public Object a(Bitmap bitmap) {
        return bitmap.getConfig() == Bitmap.Config.ALPHA_8 ? bitmap : bitmap.extractAlpha();
    }

    @Override // org.telegram.ui.Components.rv0
    public void b(Object obj, float f7) {
        switch (this.a) {
            case 16:
                hd0 hd0Var = (hd0) obj;
                hd0Var.f = f7;
                if (!hd0Var.y || hd0Var.F) {
                    hd0Var.c.setStrokeWidth(AndroidUtilities.lerp(hd0Var.v, hd0Var.w, f7));
                    hd0Var.f();
                }
                hd0Var.invalidate();
                break;
            case 18:
                hd0 hd0Var2 = (hd0) obj;
                hd0Var2.n = f7;
                if (!hd0Var2.y || hd0Var2.F) {
                    hd0Var2.f();
                }
                hd0Var2.invalidate();
                break;
            case 20:
                hd0 hd0Var3 = (hd0) obj;
                hd0Var3.s = f7;
                hd0Var3.f();
                break;
            case 24:
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
            default:
                og0 og0Var2 = (og0) obj;
                WindowManager.LayoutParams layoutParams2 = og0Var2.c;
                og0Var2.L = f7;
                layoutParams2.y = (int) f7;
                try {
                    AndroidUtilities.updateViewLayout(og0Var2.b, og0Var2.d, layoutParams2);
                    break;
                } catch (IllegalArgumentException unused2) {
                    og0Var2.N.c();
                }
        }
    }

    @Override // p.a
    public pc c(wc wcVar) {
        return wcVar.k(false);
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        hj0 lottieAnimation;
        switch (this.a) {
            case 8:
                Drawable drawable = imageReceiver.getDrawable();
                if (drawable instanceof hj0) {
                    hj0 hj0Var = (hj0) drawable;
                    hj0Var.P(0);
                    hj0Var.stop();
                    hj0Var.S(0.0f, false);
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
        org.telegram.messenger.m5.a(this, i10, str, drawable);
    }

    @Override // org.telegram.ui.ActionBar.c2
    public void f(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        switch (this.a) {
            case 3:
                Pattern pattern = d5.a;
                break;
            case 13:
                d2Var.dismiss();
                break;
            case 28:
                d2Var.dismiss();
                break;
            default:
                d2Var.dismiss();
                break;
        }
    }

    @Override // org.telegram.ui.Components.qv0
    public float get(Object obj) {
        switch (this.a) {
            case 15:
                return ((hd0) obj).f;
            case 17:
                return ((hd0) obj).n;
            case 19:
                return ((hd0) obj).s;
            case 23:
                return ((og0) obj).K;
            default:
                return ((og0) obj).L;
        }
    }

    @Override // org.telegram.ui.Components.zc0
    public String k(int i10) {
        switch (this.a) {
            case 0:
                return String.format("%02d", Integer.valueOf(i10));
            case 1:
                return String.format("%02d", Integer.valueOf(i10));
            case 2:
                return i10 == 0 ? LocaleController.getString(R.string.ShortMessageLifetimeForever) : (i10 < 1 || i10 >= 16) ? i10 == 16 ? LocaleController.formatTTLString(30) : i10 == 17 ? LocaleController.formatTTLString(60) : i10 == 18 ? LocaleController.formatTTLString(3600) : i10 == 19 ? LocaleController.formatTTLString(86400) : i10 == 20 ? LocaleController.formatTTLString(604800) : "" : LocaleController.formatTTLString(i10);
            case 3:
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
            case 4:
                return hc.b.j(i10, "");
        }
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public /* synthetic */ void onAnimationReady(ImageReceiver imageReceiver) {
        int i10 = this.a;
        org.telegram.messenger.m5.b(this, imageReceiver);
    }

    @Override // org.telegram.messenger.GenericProvider
    public Object provide(Object obj) {
        switch (this.a) {
            case 9:
                return CheckBoxBase.I;
            default:
                int i10 = rz.O2;
                return 0;
        }
    }
}
