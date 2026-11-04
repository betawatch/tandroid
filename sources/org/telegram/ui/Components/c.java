package org.telegram.ui.Components;

import java.util.Calendar;
import java.util.Locale;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class c implements org.telegram.messenger.ic, org.telegram.ui.ActionBar.p1, ab0, ya0 {
    public final /* synthetic */ int a;

    public /* synthetic */ c(int i3) {
        this.a = i3;
    }

    @Override // org.telegram.ui.Components.ya0
    public String e(int i3) {
        switch (this.a) {
            case 4:
                if (i3 == 0) {
                    return org.telegram.messenger.bd.M0(2131748539, null);
                }
                Calendar calendar = Calendar.getInstance();
                int i10 = calendar.get(1);
                calendar.add(6, i3);
                long timeInMillis = calendar.getTimeInMillis();
                if (calendar.get(1) != i10) {
                    return org.telegram.messenger.bd.E0().y0().format(timeInMillis);
                }
                return org.telegram.messenger.bd.E0().A0().format(timeInMillis) + ", " + org.telegram.messenger.bd.E0().w0().format(timeInMillis);
            case 5:
                if (i3 == 0) {
                    return org.telegram.messenger.bd.M0(2131748539, null);
                }
                Calendar calendar2 = Calendar.getInstance();
                int i11 = calendar2.get(1);
                calendar2.add(6, i3);
                long timeInMillis2 = calendar2.getTimeInMillis();
                int i12 = calendar2.get(1);
                if (i12 != i11 || i3 >= 7) {
                    return i12 == i11 ? org.telegram.messenger.bd.E0().w0().format(timeInMillis2) : org.telegram.messenger.bd.E0().y0().format(timeInMillis2);
                }
                return org.telegram.messenger.bd.E0().A0().format(timeInMillis2) + ", " + org.telegram.messenger.bd.E0().w0().format(timeInMillis2);
            case 6:
                return String.format("%02d", Integer.valueOf(i3));
            case 7:
                return String.format("%02d", Integer.valueOf(i3));
            case 8:
                return String.format("%02d", Integer.valueOf(i3));
            case 9:
                return String.format("%02d", Integer.valueOf(i3));
            case 10:
                Calendar calendar3 = Calendar.getInstance();
                calendar3.set(5, 1);
                calendar3.set(2, i3);
                return calendar3.getDisplayName(2, 1, Locale.getDefault());
            case 11:
                return String.format("%02d", Integer.valueOf(i3));
            case 12:
                return String.format("%02d", Integer.valueOf(i3));
            case 13:
                if (i3 == 0) {
                    return org.telegram.messenger.bd.M0(2131748539, null);
                }
                Calendar calendar4 = Calendar.getInstance();
                int i13 = calendar4.get(1);
                calendar4.add(6, i3);
                long timeInMillis3 = calendar4.getTimeInMillis();
                return calendar4.get(1) == i13 ? org.telegram.messenger.bd.E0().w0().format(timeInMillis3) : org.telegram.messenger.bd.E0().y0().format(timeInMillis3);
            case 14:
                return String.format("%02d", Integer.valueOf(i3));
            case 15:
                return String.format("%02d", Integer.valueOf(i3));
            case 16:
            case 23:
            case 27:
            default:
                switch (i3) {
                    case 0:
                        return org.telegram.messenger.bd.M0(2131749094, null);
                    case 1:
                        return org.telegram.messenger.bd.M0(2131750830, null);
                    case 2:
                        return org.telegram.messenger.bd.M0(2131748691, null);
                    case 3:
                        return org.telegram.messenger.bd.M0(2131754173, null);
                    case 4:
                        return org.telegram.messenger.bd.M0(2131748670, null);
                    case 5:
                        return org.telegram.messenger.bd.M0(2131749072, null);
                    case 6:
                        return org.telegram.messenger.bd.M0(2131749074, null);
                    case 7:
                        return org.telegram.messenger.bd.M0(2131753895, null);
                    case 8:
                        return org.telegram.messenger.bd.M0(2131745575, null);
                    case 9:
                        return org.telegram.messenger.bd.M0(2131747838, null);
                    case 10:
                        return org.telegram.messenger.bd.M0(2131747843, null);
                    default:
                        return org.telegram.messenger.bd.M0(2131751606, null);
                }
            case 17:
                return org.telegram.messenger.bd.G(i3 + 1, "Times", new Object[0]);
            case 18:
                return org.telegram.messenger.bd.G(i3 + 1, "Minutes", new Object[0]);
            case 19:
                return org.telegram.messenger.bd.M0(2131747916, null);
            case 20:
                if (i3 == 0) {
                    return org.telegram.messenger.bd.M0(2131748539, null);
                }
                Calendar calendar5 = Calendar.getInstance();
                int i14 = calendar5.get(1);
                calendar5.add(6, i3);
                long timeInMillis4 = calendar5.getTimeInMillis();
                if (calendar5.get(1) != i14) {
                    return org.telegram.messenger.bd.E0().y0().format(timeInMillis4);
                }
                return org.telegram.messenger.bd.E0().A0().format(timeInMillis4) + ", " + org.telegram.messenger.bd.E0().w0().format(timeInMillis4);
            case 21:
                return String.format("%02d", Integer.valueOf(i3));
            case 22:
                return String.format("%02d", Integer.valueOf(i3));
            case 24:
                boolean z10 = org.telegram.messenger.bd.c0;
                String format = String.format("%02d", Integer.valueOf((i3 % 12 != 0 || z10) ? i3 % (z10 ? 24 : 12) : 12));
                return i3 >= 24 ? org.telegram.messenger.bd.a0(null, null, 2131752747, format) : format;
            case 25:
                return String.format("%02d", Integer.valueOf(i3));
            case 26:
                return i3 == 0 ? org.telegram.messenger.bd.M0(2131745371, null) : (i3 < 1 || i3 >= 16) ? i3 == 16 ? org.telegram.messenger.bd.c0(30) : i3 == 17 ? org.telegram.messenger.bd.c0(60) : i3 == 18 ? org.telegram.messenger.bd.c0(3600) : i3 == 19 ? org.telegram.messenger.bd.c0(86400) : i3 == 20 ? org.telegram.messenger.bd.c0(604800) : "" : org.telegram.messenger.bd.c0(i3);
            case 28:
                return k2.p1.i(i3, "");
        }
    }

    @Override // org.telegram.ui.ActionBar.p1
    public void g(org.telegram.ui.ActionBar.s1 s1Var, int i3) {
        switch (this.a) {
            case 2:
                s1Var.dismiss();
                break;
            case 16:
                s1Var.dismiss();
                break;
            case 23:
                s1Var.dismiss();
                break;
            default:
                Pattern pattern = t4.a;
                break;
        }
    }

    @Override // org.telegram.ui.Components.ab0
    public void l(cb0 cb0Var, int i3) {
        Pattern pattern = t4.a;
    }

    @Override // org.telegram.messenger.ic
    public void s(Exception exc) {
        switch (this.a) {
            case 0:
                org.telegram.messenger.a8.g(exc, true);
                break;
            default:
                org.telegram.messenger.a8.g(exc, true);
                break;
        }
    }
}
