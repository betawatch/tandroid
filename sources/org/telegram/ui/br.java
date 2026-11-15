package org.telegram.ui;

import android.view.View;
import java.util.Calendar;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class br implements org.telegram.ui.Components.lt0, org.telegram.ui.Components.kt0, org.telegram.messenger.nc, org.telegram.ui.ActionBar.q1, org.telegram.ui.Components.gb0, org.telegram.ui.Components.eb0 {
    public final /* synthetic */ int a;

    public /* synthetic */ br(int i7) {
        this.a = i7;
    }

    @Override // org.telegram.ui.Components.lt0
    public void c(Object obj, float f10) {
        dr drVar = (dr) obj;
        switch (this.a) {
            case 0:
                drVar.M1 = f10;
                if (drVar.getParent() != null) {
                    ((View) drVar.getParent()).invalidate();
                    break;
                }
                break;
            case 1:
            case 3:
            default:
                drVar.P1 = f10;
                if (drVar.getParent() != null) {
                    ((View) drVar.getParent()).invalidate();
                    break;
                }
                break;
            case 2:
                drVar.N1 = f10;
                if (drVar.getParent() != null) {
                    ((View) drVar.getParent()).invalidate();
                    break;
                }
                break;
            case 4:
                drVar.O1 = f10;
                if (drVar.getParent() != null) {
                    ((View) drVar.getParent()).invalidate();
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.eb0
    public String e(int i7) {
        switch (this.a) {
            case 11:
                if (i7 != 0) {
                    Calendar calendar = Calendar.getInstance();
                    int i10 = calendar.get(1);
                    calendar.add(6, i7);
                    long timeInMillis = calendar.getTimeInMillis();
                    if (calendar.get(1) != i10) {
                        break;
                    } else {
                        break;
                    }
                } else {
                    break;
                }
            case 12:
                if (i7 != 0) {
                    Calendar calendar2 = Calendar.getInstance();
                    int i11 = calendar2.get(1);
                    calendar2.add(6, i7);
                    long timeInMillis2 = calendar2.getTimeInMillis();
                    int i12 = calendar2.get(1);
                    if (i12 == i11 && i7 < 7) {
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
            case 17:
                Calendar calendar3 = Calendar.getInstance();
                calendar3.set(5, 1);
                calendar3.set(2, i7);
                break;
            case 20:
                if (i7 != 0) {
                    Calendar calendar4 = Calendar.getInstance();
                    int i13 = calendar4.get(1);
                    calendar4.add(6, i7);
                    long timeInMillis3 = calendar4.getTimeInMillis();
                    if (calendar4.get(1) != i13) {
                        break;
                    } else {
                        break;
                    }
                } else {
                    break;
                }
            case 27:
                if (i7 != 0) {
                    Calendar calendar5 = Calendar.getInstance();
                    int i14 = calendar5.get(1);
                    calendar5.add(6, i7);
                    long timeInMillis4 = calendar5.getTimeInMillis();
                    if (calendar5.get(1) != i14) {
                        break;
                    } else {
                        break;
                    }
                } else {
                    break;
                }
        }
        return String.format("%02d", Integer.valueOf(i7));
    }

    @Override // org.telegram.ui.Components.kt0
    public float get(Object obj) {
        dr drVar = (dr) obj;
        switch (this.a) {
            case 1:
                return drVar.N1;
            case 2:
            default:
                return drVar.P1;
            case 3:
                return drVar.O1;
        }
    }

    @Override // org.telegram.ui.ActionBar.q1
    public void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        switch (this.a) {
            case 9:
                t1Var.dismiss();
                break;
            default:
                t1Var.dismiss();
                break;
        }
    }

    @Override // org.telegram.ui.Components.gb0
    public void m(org.telegram.ui.Components.ib0 ib0Var, int i7) {
        Pattern pattern = org.telegram.ui.Components.t4.a;
    }

    @Override // org.telegram.messenger.nc
    public void r(Exception exc) {
        switch (this.a) {
            case 7:
                org.telegram.messenger.a8.g(exc, true);
                break;
            default:
                org.telegram.messenger.a8.g(exc, true);
                break;
        }
    }
}
