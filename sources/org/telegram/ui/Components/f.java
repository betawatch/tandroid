package org.telegram.ui.Components;

import java.util.Calendar;
import java.util.Locale;
import java.util.regex.Pattern;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LanguageDetector;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final /* synthetic */ class f implements LanguageDetector.ExceptionCallback, rc0, org.telegram.ui.ActionBar.a2, tc0 {
    public final /* synthetic */ int a;

    public /* synthetic */ f(int i10) {
        this.a = i10;
    }

    @Override // org.telegram.ui.Components.rc0
    public String f(int i10) {
        switch (this.a) {
            case 1:
                return i2.g.i(i10, "");
            case 2:
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
            case 3:
                return String.format("%02d", Integer.valueOf(i10));
            case 4:
            case 5:
            case 15:
            case 22:
            default:
                return String.format("%02d", Integer.valueOf(i10));
            case 6:
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
            case 7:
                return String.format("%02d", Integer.valueOf(i10));
            case 8:
                return String.format("%02d", Integer.valueOf(i10));
            case 9:
                Calendar calendar2 = Calendar.getInstance();
                calendar2.set(5, 1);
                calendar2.set(2, i10);
                return calendar2.getDisplayName(2, 1, Locale.getDefault());
            case 10:
                return String.format("%02d", Integer.valueOf(i10));
            case 11:
                return String.format("%02d", Integer.valueOf(i10));
            case 12:
                if (i10 == 0) {
                    return LocaleController.getString(R.string.MessageScheduleToday);
                }
                Calendar calendar3 = Calendar.getInstance();
                int i13 = calendar3.get(1);
                calendar3.add(6, i10);
                long timeInMillis2 = calendar3.getTimeInMillis();
                return calendar3.get(1) == i13 ? LocaleController.getInstance().getFormatterScheduleDay().format(timeInMillis2) : LocaleController.getInstance().getFormatterScheduleYear().format(timeInMillis2);
            case 13:
                return String.format("%02d", Integer.valueOf(i10));
            case 14:
                return String.format("%02d", Integer.valueOf(i10));
            case 16:
                return LocaleController.formatPluralString("Times", i10 + 1, new Object[0]);
            case 17:
                return LocaleController.formatPluralString("Minutes", i10 + 1, new Object[0]);
            case 18:
                return LocaleController.getString(R.string.NotificationsFrequencyDivider);
            case 19:
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
            case 20:
                return String.format("%02d", Integer.valueOf(i10));
            case 21:
                return String.format("%02d", Integer.valueOf(i10));
            case 23:
                boolean z10 = LocaleController.is24HourFormat;
                String format = String.format("%02d", Integer.valueOf((i10 % 12 != 0 || z10) ? i10 % (z10 ? 24 : 12) : 12));
                return i10 >= 24 ? LocaleController.formatString(R.string.BusinessHoursNextDayPicker, format) : format;
            case 24:
                return String.format("%02d", Integer.valueOf(i10));
            case 25:
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
            case 26:
                return String.format("%02d", Integer.valueOf(i10));
            case 27:
                return String.format("%02d", Integer.valueOf(i10));
            case 28:
                return i2.g.i(i10, "");
        }
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.a) {
            case 4:
                b2Var.dismiss();
                break;
            case 15:
                b2Var.dismiss();
                break;
            default:
                b2Var.dismiss();
                break;
        }
    }

    @Override // org.telegram.messenger.LanguageDetector.ExceptionCallback
    public void run(Exception exc) {
        FileLog.e(exc);
    }

    @Override // org.telegram.ui.Components.tc0
    public void s(vc0 vc0Var, int i10) {
        Pattern pattern = e5.a;
    }
}
