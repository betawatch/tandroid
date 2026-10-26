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
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class cg implements org.telegram.ui.Components.yl0, fh.d, org.telegram.ui.ActionBar.b2, Utilities.Callback2Return, org.telegram.ui.Components.nw0, org.telegram.ui.Components.ow0, LanguageDetector.ExceptionCallback, org.telegram.ui.Components.id0, org.telegram.ui.Components.kd0 {
    public final /* synthetic */ int a;

    public /* synthetic */ cg(int i10) {
        this.a = i10;
    }

    @Override // org.telegram.ui.Components.ow0
    public void b(Object obj, float f7) {
        xr xrVar = (xr) obj;
        switch (this.a) {
            case 5:
                xrVar.b = f7;
                if (xrVar.getParent() != null) {
                    ((View) xrVar.getParent()).invalidate();
                    break;
                }
                break;
            case 6:
            case 8:
            default:
                xrVar.e = f7;
                if (xrVar.getParent() != null) {
                    ((View) xrVar.getParent()).invalidate();
                    break;
                }
                break;
            case 7:
                xrVar.c = f7;
                if (xrVar.getParent() != null) {
                    ((View) xrVar.getParent()).invalidate();
                    break;
                }
                break;
            case 9:
                xrVar.d = f7;
                if (xrVar.getParent() != null) {
                    ((View) xrVar.getParent()).invalidate();
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.id0
    public String f(int i10) {
        switch (this.a) {
            case 14:
                return ic.a.i(i10, "");
            case 15:
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
            case 16:
                return String.format("%02d", Integer.valueOf(i10));
            case 17:
            case 18:
            default:
                return LocaleController.formatPluralString("Times", i10 + 1, new Object[0]);
            case 19:
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
            case 20:
                return String.format("%02d", Integer.valueOf(i10));
            case 21:
                return String.format("%02d", Integer.valueOf(i10));
            case 22:
                Calendar calendar2 = Calendar.getInstance();
                calendar2.set(5, 1);
                calendar2.set(2, i10);
                return calendar2.getDisplayName(2, 1, Locale.getDefault());
            case 23:
                return String.format("%02d", Integer.valueOf(i10));
            case 24:
                return String.format("%02d", Integer.valueOf(i10));
            case 25:
                if (i10 == 0) {
                    return LocaleController.getString(R.string.MessageScheduleToday);
                }
                Calendar calendar3 = Calendar.getInstance();
                int i13 = calendar3.get(1);
                calendar3.add(6, i10);
                long timeInMillis2 = calendar3.getTimeInMillis();
                return calendar3.get(1) == i13 ? LocaleController.getInstance().getFormatterScheduleDay().format(timeInMillis2) : LocaleController.getInstance().getFormatterScheduleYear().format(timeInMillis2);
            case 26:
                return String.format("%02d", Integer.valueOf(i10));
            case 27:
                return String.format("%02d", Integer.valueOf(i10));
        }
    }

    @Override // org.telegram.ui.Components.nw0
    public float get(Object obj) {
        xr xrVar = (xr) obj;
        switch (this.a) {
            case 4:
                return xrVar.b;
            case 5:
            case 7:
            default:
                return xrVar.e;
            case 6:
                return xrVar.c;
            case 8:
                return xrVar.d;
        }
    }

    @Override // org.telegram.ui.ActionBar.b2
    public void h(org.telegram.ui.ActionBar.e2 e2Var, int i10) {
        switch (this.a) {
            case 2:
                e2Var.dismiss();
                break;
            case 17:
                e2Var.dismiss();
                break;
            default:
                e2Var.dismiss();
                break;
        }
    }

    @Override // fh.d
    public int i(org.telegram.ui.ActionBar.u6 u6Var, boolean z10) {
        return TLObject.FLAG_31;
    }

    @Override // org.telegram.ui.Components.kd0
    public void q(org.telegram.ui.Components.md0 md0Var, int i10) {
        Pattern pattern = org.telegram.ui.Components.g5.a;
    }

    @Override // org.telegram.messenger.LanguageDetector.ExceptionCallback
    public void run(Exception exc) {
        switch (this.a) {
            case 12:
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
