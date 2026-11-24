// default package

import android.R;
import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class dc2 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ rc2 b;

    public /* synthetic */ dc2(rc2 rc2Var, byte b) {
        this.a = b;
        this.b = rc2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        int i = 0;
        rc2 rc2Var = this.b;
        switch (b) {
            case 0:
                rc2Var.r2();
                break;
            case 1:
                rc2Var.s2();
                break;
            case 2:
                qa4 qa4Var = rc2Var.x;
                qa4Var.a(rc2Var.kc);
                qa4Var.a(rc2Var.lc);
                rc2Var.k3();
                k47 k47Var = rc2Var.Q5;
                if (k47Var != null) {
                    k47Var.n0(null);
                    k47 k47Var2 = rc2Var.Q5;
                    if (k47Var2.z != null) {
                        k47Var2.z = null;
                        k47Var2.k0();
                    }
                    mc2 mc2Var = rc2Var.eb;
                    if (mc2Var != null) {
                        mc2Var.D0(rc2Var, true);
                        break;
                    }
                }
                break;
            case 3:
                if (rc2Var.e8 && !rc2Var.f8 && rc2Var.g8) {
                    rc2Var.f8 = true;
                    rc2Var.Wa.setState(new int[]{R.attr.state_pressed, R.attr.state_enabled});
                    break;
                }
                break;
            case 4:
                rc2Var.Wa.setState(new int[0]);
                rc2Var.invalidate();
                break;
            case 5:
                rc2Var.Wa.setState(new int[0]);
                rc2Var.invalidate();
                break;
            case 6:
                rc2Var.P5 = false;
                rc2Var.getMessageObject().N0 = true;
                i47 i47Var = rc2Var.q3;
                if (i47Var != null) {
                    ArrayList arrayList = i47Var.e;
                    int size = arrayList.size();
                    int i2 = 0;
                    while (i2 < size) {
                        Object obj = arrayList.get(i2);
                        i2++;
                        ((h47) obj).y.clear();
                    }
                }
                i47 i47Var2 = rc2Var.m3;
                if (i47Var2 != null) {
                    ArrayList arrayList2 = i47Var2.e;
                    int size2 = arrayList2.size();
                    while (i < size2) {
                        Object obj2 = arrayList2.get(i);
                        i++;
                        ((h47) obj2).y.clear();
                    }
                } else {
                    ArrayList arrayList3 = rc2Var.Q5.B2;
                    if (arrayList3 != null) {
                        int size3 = arrayList3.size();
                        while (i < size3) {
                            Object obj3 = arrayList3.get(i);
                            i++;
                            ((h47) obj3).y.clear();
                        }
                    }
                }
                rc2Var.invalidate();
                break;
            case 7:
                rc2Var.getMessageObject().C.N0 = true;
                rc2Var.fc.clear();
                rc2Var.invalidate();
                break;
            case 8:
                mc2 mc2Var2 = rc2Var.eb;
                if (mc2Var2 != null) {
                    mc2Var2.D0(rc2Var, false);
                    break;
                }
                break;
            case 9:
                rc2Var.post(new dc2(rc2Var, (byte) 6));
                break;
            case 10:
                mc2 mc2Var3 = rc2Var.eb;
                if (mc2Var3 != null) {
                    mc2Var3.Z0(rc2Var);
                    break;
                }
                break;
            case 11:
                rc2Var.k3();
                break;
            case 12:
                rc2Var.invalidate();
                if (rc2Var.getParent() instanceof View) {
                    ((View) rc2Var.getParent()).invalidate();
                    break;
                }
                break;
            default:
                rc2Var.invalidate();
                if (rc2Var.getParent() instanceof View) {
                    ((View) rc2Var.getParent()).invalidate();
                    break;
                }
                break;
        }
    }
}
