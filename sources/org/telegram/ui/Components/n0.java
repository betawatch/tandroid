package org.telegram.ui.Components;

import java.util.Calendar;
import java.util.regex.Pattern;
import org.telegram.messenger.LocaleController;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class n0 implements mc0, org.telegram.ui.ActionBar.b2, oc0 {
    public final /* synthetic */ int a;

    public /* synthetic */ n0(int i10) {
        this.a = i10;
    }

    @Override // org.telegram.ui.Components.mc0
    public String e(int i10) {
        switch (this.a) {
            case 1:
                switch (i10) {
                }
            case 5:
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
            case 8:
                Calendar calendar2 = Calendar.getInstance();
                calendar2.set(5, 1);
                calendar2.set(2, i10);
                break;
            case 11:
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
            case 18:
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
            case 22:
                boolean z10 = LocaleController.is24HourFormat;
                String format = String.format("%02d", Integer.valueOf((i10 % 12 != 0 || z10) ? i10 % (z10 ? 24 : 12) : 12));
                if (i10 >= 24) {
                    break;
                }
                break;
            case 24:
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

    @Override // org.telegram.ui.ActionBar.b2
    public void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        switch (this.a) {
            case 3:
                c2Var.dismiss();
                break;
            case 14:
                c2Var.dismiss();
                break;
            default:
                c2Var.dismiss();
                break;
        }
    }

    @Override // org.telegram.ui.Components.oc0
    public void q(qc0 qc0Var, int i10) {
        Pattern pattern = c5.a;
    }
}
