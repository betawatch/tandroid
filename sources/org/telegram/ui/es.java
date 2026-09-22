package org.telegram.ui;

import android.view.View;
import java.util.Calendar;
import java.util.regex.Pattern;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LanguageDetector;
import org.telegram.messenger.LocaleController;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final /* synthetic */ class es implements org.telegram.ui.Components.hv0, LanguageDetector.ExceptionCallback, org.telegram.ui.Components.qc0, org.telegram.ui.ActionBar.a2, org.telegram.ui.Components.sc0 {
    public final /* synthetic */ int a;

    public /* synthetic */ es(int i10) {
        this.a = i10;
    }

    @Override // org.telegram.ui.Components.hv0
    public void b(Object obj, float f7) {
        gs gsVar = (gs) obj;
        gsVar.e = f7;
        if (gsVar.getParent() != null) {
            ((View) gsVar.getParent()).invalidate();
        }
    }

    @Override // org.telegram.ui.Components.qc0
    public String e(int i10) {
        switch (this.a) {
            case 4:
                switch (i10) {
                }
            case 8:
                if (i10 != 0) {
                    Calendar calendar = Calendar.getInstance();
                    int i11 = calendar.get(1);
                    calendar.add(6, i10);
                    long timeInMillis = calendar.getTimeInMillis();
                    int i12 = calendar.get(1);
                    if (i12 == i11 && i10 < 7) {
                        break;
                    } else if (i12 != i11) {
                        break;
                    } else {
                        break;
                    }
                } else {
                    break;
                }
                break;
            case 11:
                Calendar calendar2 = Calendar.getInstance();
                calendar2.set(5, 1);
                calendar2.set(2, i10);
                break;
            case 14:
                if (i10 != 0) {
                    Calendar calendar3 = Calendar.getInstance();
                    int i13 = calendar3.get(1);
                    calendar3.add(6, i10);
                    long timeInMillis2 = calendar3.getTimeInMillis();
                    if (calendar3.get(1) != i13) {
                        break;
                    } else {
                        break;
                    }
                } else {
                    break;
                }
            case 21:
                if (i10 != 0) {
                    Calendar calendar4 = Calendar.getInstance();
                    int i14 = calendar4.get(1);
                    calendar4.add(6, i10);
                    long timeInMillis3 = calendar4.getTimeInMillis();
                    if (calendar4.get(1) != i14) {
                        break;
                    } else {
                        break;
                    }
                } else {
                    break;
                }
            case 25:
                boolean z10 = LocaleController.is24HourFormat;
                String format = String.format("%02d", Integer.valueOf((i10 % 12 != 0 || z10) ? i10 % (z10 ? 24 : 12) : 12));
                if (i10 >= 24) {
                    break;
                }
                break;
            case 27:
                if (i10 != 0) {
                    Calendar calendar5 = Calendar.getInstance();
                    int i15 = calendar5.get(1);
                    calendar5.add(6, i10);
                    long timeInMillis4 = calendar5.getTimeInMillis();
                    if (calendar5.get(1) != i15) {
                        break;
                    } else {
                        break;
                    }
                } else {
                    break;
                }
        }
        return String.format("%02d", Integer.valueOf(i10));
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.a) {
            case 6:
                b2Var.dismiss();
                break;
            case 17:
                b2Var.dismiss();
                break;
            default:
                b2Var.dismiss();
                break;
        }
    }

    @Override // org.telegram.ui.Components.sc0
    public void q(org.telegram.ui.Components.uc0 uc0Var, int i10) {
        Pattern pattern = org.telegram.ui.Components.c5.a;
    }

    @Override // org.telegram.messenger.LanguageDetector.ExceptionCallback
    public void run(Exception exc) {
        switch (this.a) {
            case 1:
                FileLog.e(exc);
                break;
            default:
                FileLog.e(exc);
                break;
        }
    }
}
