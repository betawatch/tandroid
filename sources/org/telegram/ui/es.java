package org.telegram.ui;

import android.view.View;
import java.util.Calendar;
import java.util.Locale;
import java.util.regex.Pattern;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LanguageDetector;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final /* synthetic */ class es implements org.telegram.ui.Components.sv0, org.telegram.ui.Components.tv0, LanguageDetector.ExceptionCallback, org.telegram.ui.Components.zc0, org.telegram.ui.ActionBar.a2, org.telegram.ui.Components.bd0 {
    public final /* synthetic */ int a;

    public /* synthetic */ es(int i10) {
        this.a = i10;
    }

    @Override // org.telegram.ui.Components.tv0
    public void b(Object obj, float f7) {
        gs gsVar = (gs) obj;
        switch (this.a) {
            case 1:
                gsVar.d = f7;
                if (gsVar.getParent() != null) {
                    ((View) gsVar.getParent()).invalidate();
                    break;
                }
                break;
            default:
                gsVar.e = f7;
                if (gsVar.getParent() != null) {
                    ((View) gsVar.getParent()).invalidate();
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.a) {
            case 9:
                b2Var.dismiss();
                break;
            case 20:
                b2Var.dismiss();
                break;
            default:
                b2Var.dismiss();
                break;
        }
    }

    @Override // org.telegram.ui.Components.sv0
    public float get(Object obj) {
        gs gsVar = (gs) obj;
        switch (this.a) {
            case 0:
                return gsVar.d;
            default:
                return gsVar.e;
        }
    }

    @Override // org.telegram.ui.Components.zc0
    public String j(int i10) {
        switch (this.a) {
            case 6:
                return hg.k0.h(i10, "");
            case 7:
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
                return String.format("%02d", Integer.valueOf(i10));
            case 9:
            case 10:
            case 20:
            case 27:
            default:
                return String.format("%02d", Integer.valueOf(i10));
            case 11:
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
            case 12:
                return String.format("%02d", Integer.valueOf(i10));
            case 13:
                return String.format("%02d", Integer.valueOf(i10));
            case 14:
                Calendar calendar2 = Calendar.getInstance();
                calendar2.set(5, 1);
                calendar2.set(2, i10);
                return calendar2.getDisplayName(2, 1, Locale.getDefault());
            case 15:
                return String.format("%02d", Integer.valueOf(i10));
            case 16:
                return String.format("%02d", Integer.valueOf(i10));
            case 17:
                if (i10 == 0) {
                    return LocaleController.getString(R.string.MessageScheduleToday);
                }
                Calendar calendar3 = Calendar.getInstance();
                int i13 = calendar3.get(1);
                calendar3.add(6, i10);
                long timeInMillis2 = calendar3.getTimeInMillis();
                return calendar3.get(1) == i13 ? LocaleController.getInstance().getFormatterScheduleDay().format(timeInMillis2) : LocaleController.getInstance().getFormatterScheduleYear().format(timeInMillis2);
            case 18:
                return String.format("%02d", Integer.valueOf(i10));
            case 19:
                return String.format("%02d", Integer.valueOf(i10));
            case 21:
                return LocaleController.formatPluralString("Times", i10 + 1, new Object[0]);
            case 22:
                return LocaleController.formatPluralString("Minutes", i10 + 1, new Object[0]);
            case 23:
                return LocaleController.getString(R.string.NotificationsFrequencyDivider);
            case 24:
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
            case 25:
                return String.format("%02d", Integer.valueOf(i10));
            case 26:
                return String.format("%02d", Integer.valueOf(i10));
            case 28:
                boolean z10 = LocaleController.is24HourFormat;
                String format = String.format("%02d", Integer.valueOf((i10 % 12 != 0 || z10) ? i10 % (z10 ? 24 : 12) : 12));
                return i10 >= 24 ? LocaleController.formatString(R.string.BusinessHoursNextDayPicker, format) : format;
        }
    }

    @Override // org.telegram.ui.Components.bd0
    public void q(org.telegram.ui.Components.dd0 dd0Var, int i10) {
        Pattern pattern = org.telegram.ui.Components.e5.a;
    }

    @Override // org.telegram.messenger.LanguageDetector.ExceptionCallback
    public void run(Exception exc) {
        switch (this.a) {
            case 4:
                FileLog.e(exc);
                break;
            default:
                FileLog.e(exc);
                break;
        }
    }
}
