// default package

import java.util.Calendar;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class c implements yy5, ee, jp7, hp7 {
    public final /* synthetic */ byte a;

    public /* synthetic */ c(byte b) {
        this.a = b;
    }

    @Override // hp7
    public final String c(int i) {
        switch (this.a) {
            case 18:
                if (i != 0) {
                    Calendar calendar = Calendar.getInstance();
                    int i2 = calendar.get(1);
                    calendar.add(6, i);
                    long timeInMillis = calendar.getTimeInMillis();
                    if (calendar.get(1) != i2) {
                        break;
                    } else {
                        break;
                    }
                } else {
                    break;
                }
            case 20:
                if (i != 0) {
                    Calendar calendar2 = Calendar.getInstance();
                    int i3 = calendar2.get(1);
                    calendar2.add(6, i);
                    long timeInMillis2 = calendar2.getTimeInMillis();
                    if (calendar2.get(1) != i3) {
                        break;
                    } else if (i >= 7) {
                        break;
                    } else {
                        break;
                    }
                } else {
                    break;
                }
            case 24:
                Calendar calendar3 = Calendar.getInstance();
                calendar3.set(5, 1);
                calendar3.set(2, i);
                break;
            case 27:
                if (i != 0) {
                    Calendar calendar4 = Calendar.getInstance();
                    int i4 = calendar4.get(1);
                    calendar4.add(6, i);
                    long timeInMillis3 = calendar4.getTimeInMillis();
                    if (calendar4.get(1) != i4) {
                        break;
                    } else {
                        break;
                    }
                } else {
                    break;
                }
        }
        return String.format("%02d", Integer.valueOf(i));
    }

    @Override // yy5
    public final void o(Exception exc) {
        switch (this.a) {
            case 0:
                fc4.g(exc, true);
                break;
            default:
                fc4.g(exc, true);
                break;
        }
    }

    @Override // ee
    public final void r(he heVar, int i) {
        heVar.dismiss();
    }

    @Override // jp7
    public final void g(lp7 lp7Var, int i) {
    }
}
