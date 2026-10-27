package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.Calendar;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.GenericProvider;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class f2 implements jd0, org.telegram.ui.ActionBar.b2, org.telegram.ui.ActionBar.c7, org.telegram.ui.ActionBar.d7, e5, ImageReceiver.ImageReceiverDelegate, GenericProvider, p.a, ih.b, ow0, pw0 {
    public final /* synthetic */ int a;

    public /* synthetic */ f2(int i10) {
        this.a = i10;
    }

    @Override // org.telegram.ui.Components.e5
    public void G(int i10, int i11, boolean z10) {
        switch (this.a) {
            case 20:
                MediaController.getInstance().stopRecording(1, z10, i10, false, 0L);
                break;
            default:
                MediaController.getInstance().stopRecording(1, z10, i10, false, 0L);
                break;
        }
    }

    @Override // ih.b
    public Object a(Bitmap bitmap) {
        return bitmap.getConfig() == Bitmap.Config.ALPHA_8 ? bitmap : bitmap.extractAlpha();
    }

    @Override // org.telegram.ui.Components.pw0
    public void b(Object obj, float f7) {
        sd0 sd0Var = (sd0) obj;
        sd0Var.f = f7;
        if (!sd0Var.y || sd0Var.F) {
            sd0Var.c.setStrokeWidth(AndroidUtilities.lerp(sd0Var.v, sd0Var.w, f7));
            sd0Var.f();
        }
        sd0Var.invalidate();
    }

    @Override // p.a
    public qc c(wc wcVar) {
        return wcVar.k(false);
    }

    @Override // org.telegram.ui.ActionBar.d7
    public void d(int i10, View view) {
        ((org.telegram.ui.ActionBar.g1) view).d(i10, i10);
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        Drawable drawable = imageReceiver.getDrawable();
        if (drawable instanceof yj0) {
            yj0 yj0Var = (yj0) drawable;
            yj0Var.P(0);
            yj0Var.stop();
            yj0Var.T(0.0f, false);
        }
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public /* synthetic */ void didSetImageBitmap(int i10, String str, Drawable drawable) {
        org.telegram.messenger.p5.a(this, i10, str, drawable);
    }

    @Override // org.telegram.ui.ActionBar.c7
    public int e(View view) {
        org.telegram.ui.ActionBar.g1 g1Var = (org.telegram.ui.ActionBar.g1) view;
        if (g1Var.getTextView() != null) {
            return g1Var.getTextView().getCurrentTextColor();
        }
        return 0;
    }

    @Override // org.telegram.ui.Components.jd0
    public String f(int i10) {
        switch (this.a) {
            case 0:
                return LocaleController.formatPluralString("Minutes", i10 + 1, new Object[0]);
            case 1:
                return LocaleController.getString(R.string.NotificationsFrequencyDivider);
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
            case 15:
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
                boolean z10 = LocaleController.is24HourFormat;
                String format = String.format("%02d", Integer.valueOf((i10 % 12 != 0 || z10) ? i10 % (z10 ? 24 : 12) : 12));
                return i10 >= 24 ? LocaleController.formatString(R.string.BusinessHoursNextDayPicker, format) : format;
            case 7:
                return String.format("%02d", Integer.valueOf(i10));
            case 8:
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
            case 9:
                return String.format("%02d", Integer.valueOf(i10));
            case 10:
                return String.format("%02d", Integer.valueOf(i10));
            case 11:
                return ic.a.i(i10, "");
            case 12:
                return String.format("%02d", Integer.valueOf(i10));
            case 13:
                return String.format("%02d", Integer.valueOf(i10));
            case 14:
                return i10 == 0 ? LocaleController.getString(R.string.ShortMessageLifetimeForever) : (i10 < 1 || i10 >= 16) ? i10 == 16 ? LocaleController.formatTTLString(30) : i10 == 17 ? LocaleController.formatTTLString(60) : i10 == 18 ? LocaleController.formatTTLString(3600) : i10 == 19 ? LocaleController.formatTTLString(86400) : i10 == 20 ? LocaleController.formatTTLString(604800) : "" : LocaleController.formatTTLString(i10);
            case 16:
                return ic.a.i(i10, "");
        }
    }

    @Override // org.telegram.ui.Components.ow0
    public float get(Object obj) {
        return ((sd0) obj).f;
    }

    @Override // org.telegram.ui.ActionBar.b2
    public void h(org.telegram.ui.ActionBar.e2 e2Var, int i10) {
        switch (this.a) {
            case 5:
                e2Var.dismiss();
                break;
            case 15:
                Pattern pattern = g5.a;
                break;
            default:
                e2Var.dismiss();
                break;
        }
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public /* synthetic */ void onAnimationReady(ImageReceiver imageReceiver) {
        org.telegram.messenger.p5.b(this, imageReceiver);
    }

    @Override // org.telegram.messenger.GenericProvider
    public Object provide(Object obj) {
        switch (this.a) {
            case 24:
                return CheckBoxBase.I;
            default:
                int i10 = sz.U2;
                return 0;
        }
    }
}
