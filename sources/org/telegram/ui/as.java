package org.telegram.ui;

import android.view.View;
import java.util.Calendar;
import java.util.Locale;
import java.util.regex.Pattern;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LanguageDetector;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class as implements org.telegram.ui.Components.iv0, org.telegram.ui.Components.hv0, LanguageDetector.ExceptionCallback, org.telegram.ui.Components.uc0, org.telegram.ui.ActionBar.c2, org.telegram.ui.Components.wc0 {
    public final /* synthetic */ int a;

    public /* synthetic */ as(int i10) {
        this.a = i10;
    }

    @Override // org.telegram.ui.Components.iv0
    public void b(Object obj, float f10) {
        cs csVar = (cs) obj;
        switch (this.a) {
            case 0:
                csVar.d = f10;
                if (csVar.getParent() != null) {
                    ((View) csVar.getParent()).invalidate();
                    break;
                }
                break;
            default:
                csVar.e = f10;
                if (csVar.getParent() != null) {
                    ((View) csVar.getParent()).invalidate();
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.uc0
    public String e(int i10) {
        switch (this.a) {
            case 5:
                return l.d.j(i10, "");
            case 6:
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
            case 7:
                return String.format("%02d", Integer.valueOf(i10));
            case 8:
            case 9:
            case 19:
            case 26:
            default:
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
            case 10:
                if (i10 == 0) {
                    return LocaleController.getString(R.string.MessageScheduleToday);
                }
                Calendar calendar2 = Calendar.getInstance();
                int i12 = calendar2.get(1);
                calendar2.add(6, i10);
                long timeInMillis2 = calendar2.getTimeInMillis();
                int i13 = calendar2.get(1);
                if (i13 != i12 || i10 >= 7) {
                    return i13 == i12 ? LocaleController.getInstance().getFormatterScheduleDay().format(timeInMillis2) : LocaleController.getInstance().getFormatterScheduleYear().format(timeInMillis2);
                }
                return LocaleController.getInstance().getFormatterWeek().format(timeInMillis2) + ", " + LocaleController.getInstance().getFormatterScheduleDay().format(timeInMillis2);
            case 11:
                return String.format("%02d", Integer.valueOf(i10));
            case 12:
                return String.format("%02d", Integer.valueOf(i10));
            case 13:
                Calendar calendar3 = Calendar.getInstance();
                calendar3.set(5, 1);
                calendar3.set(2, i10);
                return calendar3.getDisplayName(2, 1, Locale.getDefault());
            case 14:
                return String.format("%02d", Integer.valueOf(i10));
            case 15:
                return String.format("%02d", Integer.valueOf(i10));
            case 16:
                if (i10 == 0) {
                    return LocaleController.getString(R.string.MessageScheduleToday);
                }
                Calendar calendar4 = Calendar.getInstance();
                int i14 = calendar4.get(1);
                calendar4.add(6, i10);
                long timeInMillis3 = calendar4.getTimeInMillis();
                return calendar4.get(1) == i14 ? LocaleController.getInstance().getFormatterScheduleDay().format(timeInMillis3) : LocaleController.getInstance().getFormatterScheduleYear().format(timeInMillis3);
            case 17:
                return String.format("%02d", Integer.valueOf(i10));
            case 18:
                return String.format("%02d", Integer.valueOf(i10));
            case 20:
                return LocaleController.formatPluralString("Times", i10 + 1, new Object[0]);
            case 21:
                return LocaleController.formatPluralString("Minutes", i10 + 1, new Object[0]);
            case 22:
                return LocaleController.getString(R.string.NotificationsFrequencyDivider);
            case 23:
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
            case 24:
                return String.format("%02d", Integer.valueOf(i10));
            case 25:
                return String.format("%02d", Integer.valueOf(i10));
            case 27:
                boolean z4 = LocaleController.is24HourFormat;
                String format = String.format("%02d", Integer.valueOf((i10 % 12 != 0 || z4) ? i10 % (z4 ? 24 : 12) : 12));
                return i10 >= 24 ? LocaleController.formatString(R.string.BusinessHoursNextDayPicker, format) : format;
            case 28:
                return String.format("%02d", Integer.valueOf(i10));
        }
    }

    @Override // org.telegram.ui.Components.hv0
    public float get(Object obj) {
        return ((cs) obj).e;
    }

    @Override // org.telegram.ui.ActionBar.c2
    public void j(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        switch (this.a) {
            case 8:
                d2Var.dismiss();
                break;
            case 19:
                d2Var.dismiss();
                break;
            default:
                d2Var.dismiss();
                break;
        }
    }

    @Override // org.telegram.ui.Components.wc0
    public void q(org.telegram.ui.Components.yc0 yc0Var, int i10) {
        Pattern pattern = org.telegram.ui.Components.z4.a;
    }

    @Override // org.telegram.messenger.LanguageDetector.ExceptionCallback
    public void run(Exception exc) {
        switch (this.a) {
            case 3:
                FileLog.e(exc);
                break;
            default:
                FileLog.e(exc);
                break;
        }
    }
}
