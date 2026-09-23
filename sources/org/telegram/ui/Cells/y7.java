package org.telegram.ui.Cells;

import android.graphics.RectF;
import android.view.ActionMode;
import android.view.View;
import java.util.Calendar;
import java.util.Locale;
import java.util.regex.Pattern;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LanguageDetector;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.gv0;
import org.telegram.ui.Components.hv0;
import org.telegram.ui.Components.pc0;
import org.telegram.ui.Components.rc0;
import org.telegram.ui.Components.tc0;
import org.telegram.ui.Components.zk0;
import org.telegram.ui.bs;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final /* synthetic */ class y7 implements Utilities.Callback2Return, org.telegram.ui.ActionBar.a2, hh.i, zk0, gv0, hv0, LanguageDetector.ExceptionCallback, pc0, rc0 {
    public final /* synthetic */ int a;

    public /* synthetic */ y7(int i10) {
        this.a = i10;
    }

    public static /* bridge */ /* synthetic */ ActionMode.Callback2 b(Object obj) {
        return (ActionMode.Callback2) obj;
    }

    @Override // org.telegram.ui.Components.hv0
    public void a(Object obj, float f7) {
        bs bsVar = (bs) obj;
        switch (this.a) {
            case 8:
                bsVar.b = f7;
                if (bsVar.getParent() != null) {
                    ((View) bsVar.getParent()).invalidate();
                    break;
                }
                break;
            case 9:
            case 11:
            default:
                bsVar.e = f7;
                if (bsVar.getParent() != null) {
                    ((View) bsVar.getParent()).invalidate();
                    break;
                }
                break;
            case 10:
                bsVar.c = f7;
                if (bsVar.getParent() != null) {
                    ((View) bsVar.getParent()).invalidate();
                    break;
                }
                break;
            case 12:
                bsVar.d = f7;
                if (bsVar.getParent() != null) {
                    ((View) bsVar.getParent()).invalidate();
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.pc0
    public String e(int i10) {
        switch (this.a) {
            case 17:
                return hg.c.i(i10, "");
            case 18:
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
            case 19:
                return String.format("%02d", Integer.valueOf(i10));
            case 20:
            case 21:
            default:
                return String.format("%02d", Integer.valueOf(i10));
            case 22:
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
            case 23:
                return String.format("%02d", Integer.valueOf(i10));
            case 24:
                return String.format("%02d", Integer.valueOf(i10));
            case 25:
                Calendar calendar2 = Calendar.getInstance();
                calendar2.set(5, 1);
                calendar2.set(2, i10);
                return calendar2.getDisplayName(2, 1, Locale.getDefault());
            case 26:
                return String.format("%02d", Integer.valueOf(i10));
            case 27:
                return String.format("%02d", Integer.valueOf(i10));
            case 28:
                if (i10 == 0) {
                    return LocaleController.getString(R.string.MessageScheduleToday);
                }
                Calendar calendar3 = Calendar.getInstance();
                int i13 = calendar3.get(1);
                calendar3.add(6, i10);
                long timeInMillis2 = calendar3.getTimeInMillis();
                return calendar3.get(1) == i13 ? LocaleController.getInstance().getFormatterScheduleDay().format(timeInMillis2) : LocaleController.getInstance().getFormatterScheduleYear().format(timeInMillis2);
        }
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.a) {
            case 2:
                b2Var.dismiss();
                break;
            case 5:
                b2Var.dismiss();
                break;
            default:
                b2Var.dismiss();
                break;
        }
    }

    @Override // org.telegram.ui.Components.gv0
    public float get(Object obj) {
        bs bsVar = (bs) obj;
        switch (this.a) {
            case 7:
                return bsVar.b;
            case 8:
            case 10:
            default:
                return bsVar.e;
            case 9:
                return bsVar.c;
            case 11:
                return bsVar.d;
        }
    }

    @Override // hh.i
    public void j(RectF rectF, View view) {
        view.invalidate();
    }

    @Override // org.telegram.ui.Components.rc0
    public void q(tc0 tc0Var, int i10) {
        Pattern pattern = org.telegram.ui.Components.e5.a;
    }

    @Override // org.telegram.messenger.LanguageDetector.ExceptionCallback
    public void run(Exception exc) {
        switch (this.a) {
            case 15:
                FileLog.e(exc);
                break;
            default:
                FileLog.e(exc);
                break;
        }
    }

    @Override // org.telegram.messenger.Utilities.Callback2Return
    public Object run(Object obj, Object obj2) {
        Integer num = (Integer) obj;
        Integer num2 = (Integer) obj2;
        switch (this.a) {
            case 0:
                if (num.intValue() == 0) {
                    return LocaleController.formatPluralString("MaximumReactionsValue", num2.intValue(), new Object[0]);
                }
                return "" + num2;
            default:
                if (num.intValue() == 0) {
                    return LocaleController.formatPluralStringComma("Stars", num2.intValue());
                }
                return "" + num2;
        }
    }
}
