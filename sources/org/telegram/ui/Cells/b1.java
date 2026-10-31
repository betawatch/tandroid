package org.telegram.ui.Cells;

import android.R;
import java.util.ArrayList;
import org.telegram.messenger.gj;
import org.telegram.messenger.hj;
import org.telegram.messenger.jj;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class b1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ q1 b;

    public /* synthetic */ b1(q1 q1Var, int i10) {
        this.a = i10;
        this.b = q1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.n2();
                break;
            case 1:
                this.b.o2();
                break;
            case 2:
                q1 q1Var = this.b;
                m2.t tVar = q1Var.x;
                tVar.n(q1Var.Wb);
                tVar.n(q1Var.Xb);
                q1Var.d3();
                jj jjVar = q1Var.O5;
                if (jjVar != null) {
                    jjVar.n0(null);
                    jj jjVar2 = q1Var.O5;
                    if (jjVar2.z != null) {
                        jjVar2.z = null;
                        jjVar2.k0();
                    }
                    l1 l1Var = q1Var.Qa;
                    if (l1Var != null) {
                        l1Var.U(q1Var);
                        break;
                    }
                }
                break;
            case 3:
                q1 q1Var2 = this.b;
                if (q1Var2.c8 && !q1Var2.d8 && q1Var2.e8) {
                    q1Var2.d8 = true;
                    q1Var2.Ia.setState(new int[]{R.attr.state_pressed, R.attr.state_enabled});
                    break;
                }
                break;
            case 4:
                q1 q1Var3 = this.b;
                q1Var3.Ia.setState(new int[0]);
                q1Var3.invalidate();
                break;
            case 5:
                q1 q1Var4 = this.b;
                q1Var4.Ia.setState(new int[0]);
                q1Var4.invalidate();
                break;
            case 6:
                q1 q1Var5 = this.b;
                int i10 = 0;
                q1Var5.N5 = false;
                q1Var5.getMessageObject().L0 = true;
                hj hjVar = q1Var5.o3;
                if (hjVar != null) {
                    ArrayList arrayList = hjVar.e;
                    int size = arrayList.size();
                    int i11 = 0;
                    while (i11 < size) {
                        Object obj = arrayList.get(i11);
                        i11++;
                        ((gj) obj).y.clear();
                    }
                }
                hj hjVar2 = q1Var5.k3;
                if (hjVar2 != null) {
                    ArrayList arrayList2 = hjVar2.e;
                    int size2 = arrayList2.size();
                    while (i10 < size2) {
                        Object obj2 = arrayList2.get(i10);
                        i10++;
                        ((gj) obj2).y.clear();
                    }
                } else {
                    ArrayList arrayList3 = q1Var5.O5.z2;
                    if (arrayList3 != null) {
                        int size3 = arrayList3.size();
                        while (i10 < size3) {
                            Object obj3 = arrayList3.get(i10);
                            i10++;
                            ((gj) obj3).y.clear();
                        }
                    }
                }
                q1Var5.invalidate();
                break;
            case 7:
                q1 q1Var6 = this.b;
                q1Var6.getMessageObject().C.L0 = true;
                q1Var6.Rb.clear();
                q1Var6.invalidate();
                break;
            case 8:
                q1 q1Var7 = this.b;
                q1Var7.post(new b1(q1Var7, 6));
                break;
            case 9:
                q1 q1Var8 = this.b;
                l1 l1Var2 = q1Var8.Qa;
                if (l1Var2 != null) {
                    l1Var2.q(q1Var8);
                    break;
                }
                break;
            default:
                this.b.d3();
                break;
        }
    }
}
