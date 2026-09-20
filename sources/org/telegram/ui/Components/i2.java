package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.view.ActionMode;
import android.view.View;
import java.util.Calendar;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.GenericProvider;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final /* synthetic */ class i2 implements yc0, org.telegram.ui.ActionBar.a2, c5, ImageReceiver.ImageReceiverDelegate, GenericProvider, p.a, gh.b, rv0, sv0, r0.n {
    public final /* synthetic */ int a;

    public /* synthetic */ i2(int i10) {
        this.a = i10;
    }

    public static /* bridge */ /* synthetic */ boolean d(Object obj) {
        return obj instanceof ActionMode.Callback2;
    }

    @Override // org.telegram.ui.Components.c5
    public void J(int i10, int i11, boolean z10) {
        switch (this.a) {
            case 12:
                MediaController.getInstance().stopRecording(1, z10, i10, false, 0L);
                break;
            default:
                MediaController.getInstance().stopRecording(1, z10, i10, false, 0L);
                break;
        }
    }

    @Override // r0.n
    public r0.l1 P0(View view, r0.l1 l1Var) {
        return r0.l1.b;
    }

    @Override // gh.b
    public Object a(Bitmap bitmap) {
        return bitmap.getConfig() == Bitmap.Config.ALPHA_8 ? bitmap : bitmap.extractAlpha();
    }

    @Override // org.telegram.ui.Components.sv0
    public void b(Object obj, float f7) {
        hd0 hd0Var = (hd0) obj;
        switch (this.a) {
            case 22:
                hd0Var.f = f7;
                if (!hd0Var.y || hd0Var.F) {
                    hd0Var.c.setStrokeWidth(AndroidUtilities.lerp(hd0Var.v, hd0Var.w, f7));
                    hd0Var.f();
                }
                hd0Var.invalidate();
                break;
            case 23:
            default:
                hd0Var.s = f7;
                hd0Var.f();
                break;
            case 24:
                hd0Var.n = f7;
                if (!hd0Var.y || hd0Var.F) {
                    hd0Var.f();
                }
                hd0Var.invalidate();
                break;
        }
    }

    @Override // p.a
    public pc c(xc xcVar) {
        return xcVar.k(false);
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        hj0 lottieAnimation;
        switch (this.a) {
            case 14:
                Drawable drawable = imageReceiver.getDrawable();
                if (drawable instanceof hj0) {
                    hj0 hj0Var = (hj0) drawable;
                    hj0Var.P(0);
                    hj0Var.stop();
                    hj0Var.T(0.0f, false);
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

    @Override // org.telegram.ui.Components.yc0
    public String e(int i10) {
        switch (this.a) {
            case 0:
                boolean z10 = LocaleController.is24HourFormat;
                String format = String.format("%02d", Integer.valueOf((i10 % 12 != 0 || z10) ? i10 % (z10 ? 24 : 12) : 12));
                return i10 >= 24 ? LocaleController.formatString(R.string.BusinessHoursNextDayPicker, format) : format;
            case 1:
                return String.format("%02d", Integer.valueOf(i10));
            case 2:
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
            case 3:
                return String.format("%02d", Integer.valueOf(i10));
            case 4:
                return String.format("%02d", Integer.valueOf(i10));
            case 5:
                return hg.k0.h(i10, "");
            case 6:
                return String.format("%02d", Integer.valueOf(i10));
            case 7:
                return String.format("%02d", Integer.valueOf(i10));
            case 8:
                return i10 == 0 ? LocaleController.getString(R.string.ShortMessageLifetimeForever) : (i10 < 1 || i10 >= 16) ? i10 == 16 ? LocaleController.formatTTLString(30) : i10 == 17 ? LocaleController.formatTTLString(60) : i10 == 18 ? LocaleController.formatTTLString(3600) : i10 == 19 ? LocaleController.formatTTLString(86400) : i10 == 20 ? LocaleController.formatTTLString(604800) : "" : LocaleController.formatTTLString(i10);
            case 9:
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
            case 10:
                return hg.k0.h(i10, "");
        }
    }

    @Override // org.telegram.ui.Components.rv0
    public float get(Object obj) {
        switch (this.a) {
            case 21:
                return ((hd0) obj).f;
            case 22:
            case 24:
            default:
                return ((og0) obj).K;
            case 23:
                return ((hd0) obj).n;
            case 25:
                return ((hd0) obj).s;
        }
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void k(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.a) {
            case 9:
                Pattern pattern = d5.a;
                break;
            default:
                b2Var.dismiss();
                break;
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
            case 15:
                return CheckBoxBase.I;
            default:
                int i10 = kz.O2;
                return 0;
        }
    }
}
