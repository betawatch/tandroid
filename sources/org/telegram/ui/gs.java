package org.telegram.ui;

import android.view.View;
import java.util.Calendar;
import java.util.Locale;
import java.util.regex.Pattern;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LanguageDetector;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class gs implements org.telegram.ui.Components.hv0, org.telegram.ui.Components.iv0, LanguageDetector.ExceptionCallback, org.telegram.ui.Components.qc0, org.telegram.ui.ActionBar.b2, org.telegram.ui.Components.sc0 {
    public final /* synthetic */ int a;

    public /* synthetic */ gs(int i10) {
        this.a = i10;
    }

    @Override // org.telegram.ui.Components.iv0
    public void b(Object obj, float f7) {
        is isVar = (is) obj;
        isVar.e = f7;
        if (isVar.getParent() != null) {
            ((View) isVar.getParent()).invalidate();
        }
    }

    @Override // org.telegram.ui.Components.qc0
    public String e(int i10) {
        switch (this.a) {
            case 4:
                return hg.k0.i(i10, "");
            case 5:
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
                return String.format("%02d", Integer.valueOf(i10));
            case 7:
            case 8:
            case 18:
            case 25:
            default:
                return String.format("%02d", Integer.valueOf(i10));
            case 9:
                if (i10 == 0) {
                    return LocaleController.getString(R.string.MessageScheduleToday);
                }
                Calendar calendar = Calendar.getInstance();
                int i11 = calendar.get(1);
                calendar.add(6, i10);
                long timeInMillis = calendar.getTimeInMillis();
                int i12 = calendar.get(1);
                if (i12 != i11 || i10 >= 7) {
                    return i12 == i11 ? LocaleController.getInstance().getFormatterScheduleDay().format(timeInMillis) : LocaleController.getInstance().getFormatterScheduleYear().format(timeInMillis);
                }
                return LocaleController.getInstance().getFormatterWeek().format(timeInMillis) + ", " + LocaleController.getInstance().getFormatterScheduleDay().format(timeInMillis);
            case 10:
                return String.format("%02d", Integer.valueOf(i10));
            case 11:
                return String.format("%02d", Integer.valueOf(i10));
            case 12:
                Calendar calendar2 = Calendar.getInstance();
                calendar2.set(5, 1);
                calendar2.set(2, i10);
                return calendar2.getDisplayName(2, 1, Locale.getDefault());
            case 13:
                return String.format("%02d", Integer.valueOf(i10));
            case 14:
                return String.format("%02d", Integer.valueOf(i10));
            case 15:
                if (i10 == 0) {
                    return LocaleController.getString(R.string.MessageScheduleToday);
                }
                Calendar calendar3 = Calendar.getInstance();
                int i13 = calendar3.get(1);
                calendar3.add(6, i10);
                long timeInMillis2 = calendar3.getTimeInMillis();
                return calendar3.get(1) == i13 ? LocaleController.getInstance().getFormatterScheduleDay().format(timeInMillis2) : LocaleController.getInstance().getFormatterScheduleYear().format(timeInMillis2);
            case 16:
                return String.format("%02d", Integer.valueOf(i10));
            case 17:
                return String.format("%02d", Integer.valueOf(i10));
            case 19:
                return LocaleController.formatPluralString("Times", i10 + 1, new Object[0]);
            case 20:
                return LocaleController.formatPluralString("Minutes", i10 + 1, new Object[0]);
            case 21:
                return LocaleController.getString(R.string.NotificationsFrequencyDivider);
            case 22:
                if (i10 == 0) {
                    return LocaleController.getString(R.string.MessageScheduleToday);
                }
                Calendar calendar4 = Calendar.getInstance();
                int i14 = calendar4.get(1);
                calendar4.add(6, i10);
                long timeInMillis3 = calendar4.getTimeInMillis();
                if (calendar4.get(1) != i14) {
                    return LocaleController.getInstance().getFormatterScheduleYear().format(timeInMillis3);
                }
                return LocaleController.getInstance().getFormatterWeek().format(timeInMillis3) + ", " + LocaleController.getInstance().getFormatterScheduleDay().format(timeInMillis3);
            case 23:
                return String.format("%02d", Integer.valueOf(i10));
            case 24:
                return String.format("%02d", Integer.valueOf(i10));
            case 26:
                boolean z10 = LocaleController.is24HourFormat;
                String format = String.format("%02d", Integer.valueOf((i10 % 12 != 0 || z10) ? i10 % (z10 ? 24 : 12) : 12));
                return i10 >= 24 ? LocaleController.formatString(R.string.BusinessHoursNextDayPicker, format) : format;
            case 27:
                return String.format("%02d", Integer.valueOf(i10));
            case 28:
                if (i10 == 0) {
                    return LocaleController.getString(R.string.MessageScheduleToday);
                }
                Calendar calendar5 = Calendar.getInstance();
                int i15 = calendar5.get(1);
                calendar5.add(6, i10);
                long timeInMillis4 = calendar5.getTimeInMillis();
                if (calendar5.get(1) != i15) {
                    return LocaleController.getInstance().getFormatterScheduleYear().format(timeInMillis4);
                }
                return LocaleController.getInstance().getFormatterWeek().format(timeInMillis4) + ", " + LocaleController.getInstance().getFormatterScheduleDay().format(timeInMillis4);
        }
    }

    @Override // org.telegram.ui.ActionBar.b2
    public void f(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        switch (this.a) {
            case 7:
                c2Var.dismiss();
                break;
            case 18:
                c2Var.dismiss();
                break;
            default:
                c2Var.dismiss();
                break;
        }
    }

    @Override // org.telegram.ui.Components.hv0
    public float get(Object obj) {
        return ((is) obj).e;
    }

    @Override // org.telegram.ui.Components.sc0
    public void q(org.telegram.ui.Components.uc0 uc0Var, int i10) {
        Pattern pattern = org.telegram.ui.Components.c5.a;
    }

    @Override // org.telegram.messenger.LanguageDetector.ExceptionCallback
    public void run(Exception exc) {
        switch (this.a) {
            case 2:
                FileLog.e(exc);
                break;
            default:
                FileLog.e(exc);
                break;
        }
    }
}
