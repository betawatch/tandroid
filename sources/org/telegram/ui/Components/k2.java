package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.WindowManager;
import java.util.Calendar;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.GenericProvider;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes3.dex */
public final /* synthetic */ class k2 implements kd0, org.telegram.ui.ActionBar.a2, e5, ImageReceiver.ImageReceiverDelegate, GenericProvider, p.a, hh.b, cw0, dw0, eh.d, r0.n {
    public final /* synthetic */ int a;

    public /* synthetic */ k2(int i10) {
        this.a = i10;
    }

    @Override // r0.n
    public r0.k1 B0(View view, r0.k1 k1Var) {
        return r0.k1.b;
    }

    @Override // org.telegram.ui.Components.e5
    public void C(int i10, int i11, boolean z10) {
        switch (this.a) {
            case 10:
                MediaController.getInstance().stopRecording(1, z10, i10, false, 0L);
                break;
            default:
                MediaController.getInstance().stopRecording(1, z10, i10, false, 0L);
                break;
        }
    }

    @Override // hh.b
    public Object a(Bitmap bitmap) {
        return bitmap.getConfig() == Bitmap.Config.ALPHA_8 ? bitmap : bitmap.extractAlpha();
    }

    @Override // org.telegram.ui.Components.dw0
    public void b(Object obj, float f7) {
        switch (this.a) {
            case 20:
                sd0 sd0Var = (sd0) obj;
                sd0Var.f = f7;
                if (!sd0Var.y || sd0Var.F) {
                    sd0Var.c.setStrokeWidth(AndroidUtilities.lerp(sd0Var.v, sd0Var.w, f7));
                    sd0Var.f();
                }
                sd0Var.invalidate();
                break;
            case 21:
            case 23:
            default:
                ah0 ah0Var = (ah0) obj;
                WindowManager.LayoutParams layoutParams = ah0Var.c;
                ah0Var.K = f7;
                layoutParams.x = (int) f7;
                try {
                    AndroidUtilities.updateViewLayout(ah0Var.b, ah0Var.d, layoutParams);
                    break;
                } catch (IllegalArgumentException unused) {
                    ah0Var.M.c();
                }
            case 22:
                sd0 sd0Var2 = (sd0) obj;
                sd0Var2.n = f7;
                if (!sd0Var2.y || sd0Var2.F) {
                    sd0Var2.f();
                }
                sd0Var2.invalidate();
                break;
            case 24:
                sd0 sd0Var3 = (sd0) obj;
                sd0Var3.s = f7;
                sd0Var3.f();
                break;
        }
    }

    @Override // p.a
    public qc c(xc xcVar) {
        return xcVar.k(false);
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        vj0 lottieAnimation;
        switch (this.a) {
            case 12:
                Drawable drawable = imageReceiver.getDrawable();
                if (drawable instanceof vj0) {
                    vj0 vj0Var = (vj0) drawable;
                    vj0Var.P(0);
                    vj0Var.stop();
                    vj0Var.T(0.0f, false);
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

    @Override // org.telegram.ui.Components.kd0
    public String e(int i10) {
        switch (this.a) {
            case 0:
                if (i10 == 0) {
                    return LocaleController.getString(R.string.MessageScheduleToday);
                }
                Calendar calendar = Calendar.getInstance();
                int i11 = calendar.get(1);
                calendar.add(6, i10);
                long timeInMillis = calendar.getTimeInMillis();
                if (calendar.get(1) != i11) {
                    return LocaleController.getInstance().getFormatterScheduleYear().format(timeInMillis);
                }
                return LocaleController.getInstance().getFormatterWeek().format(timeInMillis) + ", " + LocaleController.getInstance().getFormatterScheduleDay().format(timeInMillis);
            case 1:
                return String.format("%02d", Integer.valueOf(i10));
            case 2:
                return String.format("%02d", Integer.valueOf(i10));
            case 3:
                return i2.e.j(i10, "");
            case 4:
                return String.format("%02d", Integer.valueOf(i10));
            case 5:
                return String.format("%02d", Integer.valueOf(i10));
            case 6:
                return i10 == 0 ? LocaleController.getString(R.string.ShortMessageLifetimeForever) : (i10 < 1 || i10 >= 16) ? i10 == 16 ? LocaleController.formatTTLString(30) : i10 == 17 ? LocaleController.formatTTLString(60) : i10 == 18 ? LocaleController.formatTTLString(3600) : i10 == 19 ? LocaleController.formatTTLString(86400) : i10 == 20 ? LocaleController.formatTTLString(604800) : "" : LocaleController.formatTTLString(i10);
            case 7:
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
            case 8:
                return i2.e.j(i10, "");
        }
    }

    @Override // eh.d
    public int f(org.telegram.ui.ActionBar.d6 d6Var, boolean z10) {
        Bitmap bitmap = zh.t.a;
        return (((int) a1.g.B(zh.d1.b[3], 255.0f, 100.0f, 0.5f)) << 24) | 16777215;
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.a) {
            case 7:
                Pattern pattern = f5.a;
                break;
            case 13:
                b2Var.dismiss();
                break;
            default:
                b2Var.dismiss();
                break;
        }
    }

    @Override // org.telegram.ui.Components.cw0
    public float get(Object obj) {
        switch (this.a) {
            case 19:
                return ((sd0) obj).f;
            case 20:
            case 22:
            default:
                return ((ah0) obj).K;
            case 21:
                return ((sd0) obj).n;
            case 23:
                return ((sd0) obj).s;
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
            case 14:
                return CheckBoxBase.I;
            default:
                int i10 = tz.O2;
                return 0;
        }
    }
}
