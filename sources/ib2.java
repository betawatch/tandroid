// default package

import android.R;
import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class ib2 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ wb2 b;

    public /* synthetic */ ib2(wb2 wb2Var, byte b) {
        this.a = b;
        this.b = wb2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        int i = 0;
        wb2 wb2Var = this.b;
        switch (b) {
            case 0:
                wb2Var.r2();
                break;
            case 1:
                wb2Var.s2();
                break;
            case 2:
                y99 y99Var = wb2Var.x;
                y99Var.a(wb2Var.kc);
                y99Var.a(wb2Var.lc);
                wb2Var.k3();
                r47 r47Var = wb2Var.Q5;
                if (r47Var != null) {
                    r47Var.n0(null);
                    r47 r47Var2 = wb2Var.Q5;
                    if (r47Var2.z != null) {
                        r47Var2.z = null;
                        r47Var2.k0();
                    }
                    rb2 rb2Var = wb2Var.eb;
                    if (rb2Var != null) {
                        rb2Var.A0(wb2Var, true);
                        break;
                    }
                }
                break;
            case 3:
                if (wb2Var.e8 && !wb2Var.f8 && wb2Var.g8) {
                    wb2Var.f8 = true;
                    wb2Var.Wa.setState(new int[]{R.attr.state_pressed, R.attr.state_enabled});
                    break;
                }
                break;
            case 4:
                wb2Var.Wa.setState(new int[0]);
                wb2Var.invalidate();
                break;
            case 5:
                wb2Var.P5 = false;
                wb2Var.getMessageObject().N0 = true;
                p47 p47Var = wb2Var.q3;
                if (p47Var != null) {
                    ArrayList arrayList = p47Var.e;
                    int size = arrayList.size();
                    int i2 = 0;
                    while (i2 < size) {
                        Object obj = arrayList.get(i2);
                        i2++;
                        ((o47) obj).y.clear();
                    }
                }
                p47 p47Var2 = wb2Var.m3;
                if (p47Var2 != null) {
                    ArrayList arrayList2 = p47Var2.e;
                    int size2 = arrayList2.size();
                    while (i < size2) {
                        Object obj2 = arrayList2.get(i);
                        i++;
                        ((o47) obj2).y.clear();
                    }
                } else {
                    ArrayList arrayList3 = wb2Var.Q5.B2;
                    if (arrayList3 != null) {
                        int size3 = arrayList3.size();
                        while (i < size3) {
                            Object obj3 = arrayList3.get(i);
                            i++;
                            ((o47) obj3).y.clear();
                        }
                    }
                }
                wb2Var.invalidate();
                break;
            case 6:
                wb2Var.getMessageObject().C.N0 = true;
                wb2Var.fc.clear();
                wb2Var.invalidate();
                break;
            case 7:
                rb2 rb2Var2 = wb2Var.eb;
                if (rb2Var2 != null) {
                    rb2Var2.A0(wb2Var, false);
                    break;
                }
                break;
            case 8:
                wb2Var.Wa.setState(new int[0]);
                wb2Var.invalidate();
                break;
            case 9:
                wb2Var.post(new ib2(wb2Var, (byte) 5));
                break;
            case 10:
                rb2 rb2Var3 = wb2Var.eb;
                if (rb2Var3 != null) {
                    rb2Var3.a1(wb2Var);
                    break;
                }
                break;
            case 11:
                wb2Var.k3();
                break;
            case 12:
                wb2Var.invalidate();
                if (wb2Var.getParent() instanceof View) {
                    ((View) wb2Var.getParent()).invalidate();
                    break;
                }
                break;
            default:
                wb2Var.invalidate();
                if (wb2Var.getParent() instanceof View) {
                    ((View) wb2Var.getParent()).invalidate();
                    break;
                }
                break;
        }
    }
}
