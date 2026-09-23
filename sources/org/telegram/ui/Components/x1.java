package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.view.ActionMode;
import java.util.Calendar;
import java.util.regex.Pattern;
import org.telegram.messenger.GenericProvider;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final /* synthetic */ class x1 implements pc0, org.telegram.ui.ActionBar.a2, d5, ImageReceiver.ImageReceiverDelegate, GenericProvider, p.a, gh.b {
    public final /* synthetic */ int a;

    public /* synthetic */ x1(int i10) {
        this.a = i10;
    }

    public static /* bridge */ /* synthetic */ boolean c(Object obj) {
        return obj instanceof ActionMode.Callback2;
    }

    @Override // org.telegram.ui.Components.d5
    public void J(int i10, int i11, boolean z10) {
        switch (this.a) {
            case 21:
                MediaController.getInstance().stopRecording(1, z10, i10, false, 0L);
                break;
            default:
                MediaController.getInstance().stopRecording(1, z10, i10, false, 0L);
                break;
        }
    }

    @Override // gh.b
    public Object a(Bitmap bitmap) {
        return bitmap.getConfig() == Bitmap.Config.ALPHA_8 ? bitmap : bitmap.extractAlpha();
    }

    @Override // p.a
    public qc b(xc xcVar) {
        return xcVar.k(false);
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        Drawable drawable = imageReceiver.getDrawable();
        if (drawable instanceof yi0) {
            yi0 yi0Var = (yi0) drawable;
            yi0Var.P(0);
            yi0Var.stop();
            yi0Var.T(0.0f, false);
        }
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public /* synthetic */ void didSetImageBitmap(int i10, String str, Drawable drawable) {
        org.telegram.messenger.h5.a(this, i10, str, drawable);
    }

    @Override // org.telegram.ui.Components.pc0
    public String e(int i10) {
        switch (this.a) {
            case 0:
                return String.format("%02d", Integer.valueOf(i10));
            case 1:
            case 8:
            case 18:
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
            case 2:
                return LocaleController.formatPluralString("Times", i10 + 1, new Object[0]);
            case 3:
                return LocaleController.formatPluralString("Minutes", i10 + 1, new Object[0]);
            case 4:
                return LocaleController.getString(R.string.NotificationsFrequencyDivider);
            case 5:
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
            case 6:
                return String.format("%02d", Integer.valueOf(i10));
            case 7:
                return String.format("%02d", Integer.valueOf(i10));
            case 9:
                boolean z10 = LocaleController.is24HourFormat;
                String format = String.format("%02d", Integer.valueOf((i10 % 12 != 0 || z10) ? i10 % (z10 ? 24 : 12) : 12));
                return i10 >= 24 ? LocaleController.formatString(R.string.BusinessHoursNextDayPicker, format) : format;
            case 10:
                return String.format("%02d", Integer.valueOf(i10));
            case 11:
                if (i10 == 0) {
                    return LocaleController.getString(R.string.MessageScheduleToday);
                }
                Calendar calendar2 = Calendar.getInstance();
                int i12 = calendar2.get(1);
                calendar2.add(6, i10);
                long timeInMillis2 = calendar2.getTimeInMillis();
                if (calendar2.get(1) != i12) {
                    return LocaleController.getInstance().getFormatterScheduleYear().format(timeInMillis2);
                }
                return LocaleController.getInstance().getFormatterWeek().format(timeInMillis2) + ", " + LocaleController.getInstance().getFormatterScheduleDay().format(timeInMillis2);
            case 12:
                return String.format("%02d", Integer.valueOf(i10));
            case 13:
                return String.format("%02d", Integer.valueOf(i10));
            case 14:
                return hg.c.i(i10, "");
            case 15:
                return String.format("%02d", Integer.valueOf(i10));
            case 16:
                return String.format("%02d", Integer.valueOf(i10));
            case 17:
                return i10 == 0 ? LocaleController.getString(R.string.ShortMessageLifetimeForever) : (i10 < 1 || i10 >= 16) ? i10 == 16 ? LocaleController.formatTTLString(30) : i10 == 17 ? LocaleController.formatTTLString(60) : i10 == 18 ? LocaleController.formatTTLString(3600) : i10 == 19 ? LocaleController.formatTTLString(86400) : i10 == 20 ? LocaleController.formatTTLString(604800) : "" : LocaleController.formatTTLString(i10);
            case 19:
                return hg.c.i(i10, "");
        }
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.a) {
            case 1:
                b2Var.dismiss();
                break;
            case 8:
                b2Var.dismiss();
                break;
            case 18:
                Pattern pattern = e5.a;
                break;
            default:
                b2Var.dismiss();
                break;
        }
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public /* synthetic */ void onAnimationReady(ImageReceiver imageReceiver) {
        org.telegram.messenger.h5.b(this, imageReceiver);
    }

    @Override // org.telegram.messenger.GenericProvider
    public Object provide(Object obj) {
        switch (this.a) {
            case 24:
                return CheckBoxBase.I;
            default:
                int i10 = lz.O2;
                return 0;
        }
    }
}
