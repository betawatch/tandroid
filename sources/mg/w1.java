package mg;

import java.util.ArrayList;
import org.telegram.messenger.cd;
import org.telegram.messenger.ui;
import org.telegram.ui.ActionBar.k2;
import org.telegram.ui.PrivacyControlActivity;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class w1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ i2 b;

    public /* synthetic */ w1(i2 i2Var, int i10) {
        this.a = i10;
        this.b = i2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        i2 i2Var = this.b;
        switch (i10) {
            case 0:
                i2Var.j1(true);
                break;
            case 1:
                i2Var.V1.setVisibility(8);
                break;
            case 2:
                i2Var.e1();
                i2Var.p1(true, false);
                break;
            case 3:
                f2 f2Var = i2Var.R1;
                f2Var.b.r(cd.L0(2131745853, null), true);
                break;
            case 4:
                f2 f2Var2 = i2Var.R1;
                f2Var2.b.r(cd.L0(2131749659, null), true);
                break;
            case 5:
                i2Var.e1();
                i2Var.p1(true, false);
                break;
            case 6:
                ArrayList arrayList = i2Var.b2;
                if (arrayList.isEmpty()) {
                    arrayList.addAll(ui.b0(i2Var.a).i1);
                    i2Var.o1(true, true);
                    break;
                }
                break;
            case 7:
                i2Var.V1.setVisibility(8);
                break;
            case 8:
                i2Var.e1();
                i2Var.p1(true, false);
                break;
            case 9:
                k2 k2Var = i2Var.o1;
                if (k2Var != null) {
                    org.telegram.ui.ActionBar.i2 i2Var2 = new org.telegram.ui.ActionBar.i2();
                    i2Var2.a = true;
                    k2Var.showAsSheet(new PrivacyControlActivity(11, false), i2Var2);
                    break;
                }
                break;
            case 10:
                i2Var.o1(true, true);
                break;
            case 11:
                i2Var.dismiss();
                break;
            default:
                i2Var.e1();
                i2Var.p1(true, false);
                break;
        }
    }
}
