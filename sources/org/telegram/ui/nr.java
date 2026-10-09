package org.telegram.ui;

import android.view.View;
import java.util.Calendar;
import java.util.Locale;
import java.util.regex.Pattern;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LanguageDetector;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final /* synthetic */ class nr implements Utilities.Callback2Return, org.telegram.ui.Components.jw0, org.telegram.ui.Components.kw0, LanguageDetector.ExceptionCallback, org.telegram.ui.Components.qd0, org.telegram.ui.ActionBar.a2, org.telegram.ui.Components.sd0 {
    public final /* synthetic */ int a;

    public /* synthetic */ nr(int i10) {
        this.a = i10;
    }

    @Override // org.telegram.ui.Components.kw0
    public void b(Object obj, float f7) {
        es esVar = (es) obj;
        switch (this.a) {
            case 2:
                esVar.b = f7;
                if (esVar.getParent() != null) {
                    ((View) esVar.getParent()).invalidate();
                    break;
                }
                break;
            case 3:
            case 5:
            default:
                esVar.e = f7;
                if (esVar.getParent() != null) {
                    ((View) esVar.getParent()).invalidate();
                    break;
                }
                break;
            case 4:
                esVar.c = f7;
                if (esVar.getParent() != null) {
                    ((View) esVar.getParent()).invalidate();
                    break;
                }
                break;
            case 6:
                esVar.d = f7;
                if (esVar.getParent() != null) {
                    ((View) esVar.getParent()).invalidate();
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.a) {
            case 14:
                b2Var.dismiss();
                break;
            default:
                b2Var.dismiss();
                break;
        }
    }

    @Override // org.telegram.ui.Components.jw0
    public float get(Object obj) {
        es esVar = (es) obj;
        switch (this.a) {
            case 1:
                return esVar.b;
            case 2:
            case 4:
            default:
                return esVar.e;
            case 3:
                return esVar.c;
            case 5:
                return esVar.d;
        }
    }

    @Override // org.telegram.ui.Components.qd0
    public String i(int i10) {
        switch (this.a) {
            case 11:
                return hg.c.h(i10, "");
            case 12:
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
            case 13:
                return String.format("%02d", Integer.valueOf(i10));
            case 14:
            case 15:
            case 25:
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
            case 16:
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
            case 17:
                return String.format("%02d", Integer.valueOf(i10));
            case 18:
                return String.format("%02d", Integer.valueOf(i10));
            case 19:
                Calendar calendar3 = Calendar.getInstance();
                calendar3.set(5, 1);
                calendar3.set(2, i10);
                return calendar3.getDisplayName(2, 1, Locale.getDefault());
            case 20:
                return String.format("%02d", Integer.valueOf(i10));
            case 21:
                return String.format("%02d", Integer.valueOf(i10));
            case 22:
                if (i10 == 0) {
                    return LocaleController.getString(R.string.MessageScheduleToday);
                }
                Calendar calendar4 = Calendar.getInstance();
                int i14 = calendar4.get(1);
                calendar4.add(6, i10);
                long timeInMillis3 = calendar4.getTimeInMillis();
                return calendar4.get(1) == i14 ? LocaleController.getInstance().getFormatterScheduleDay().format(timeInMillis3) : LocaleController.getInstance().getFormatterScheduleYear().format(timeInMillis3);
            case 23:
                return String.format("%02d", Integer.valueOf(i10));
            case 24:
                return String.format("%02d", Integer.valueOf(i10));
            case 26:
                return LocaleController.formatPluralString("Times", i10 + 1, new Object[0]);
            case 27:
                return LocaleController.formatPluralString("Minutes", i10 + 1, new Object[0]);
            case 28:
                return LocaleController.getString(R.string.NotificationsFrequencyDivider);
        }
    }

    @Override // org.telegram.ui.Components.sd0
    public void r(org.telegram.ui.Components.ud0 ud0Var, int i10) {
        Pattern pattern = org.telegram.ui.Components.g5.a;
    }

    @Override // org.telegram.messenger.LanguageDetector.ExceptionCallback
    public void run(Exception exc) {
        switch (this.a) {
            case 9:
                FileLog.e(exc);
                break;
            default:
                FileLog.e(exc);
                break;
        }
    }

    @Override // org.telegram.messenger.Utilities.Callback2Return
    public Object run(Object obj, Object obj2) {
        Integer num = (Integer) obj2;
        if (((Integer) obj).intValue() == 0) {
            return LocaleController.formatPluralStringComma("Stars", num.intValue());
        }
        return "" + num;
    }
}
