package org.telegram.ui.Cells;

import android.R;
import java.util.ArrayList;
import org.telegram.messenger.fj;
import org.telegram.messenger.gj;
import org.telegram.messenger.ij;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class c1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ q1 b;

    public /* synthetic */ c1(q1 q1Var, int i7) {
        this.a = i7;
        this.b = q1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.p2();
                break;
            case 1:
                this.b.q2();
                break;
            case 2:
                q1 q1Var = this.b;
                ob.c cVar = q1Var.x;
                cVar.a(q1Var.Xb);
                cVar.a(q1Var.Yb);
                q1Var.h3();
                ij ijVar = q1Var.P5;
                if (ijVar != null) {
                    ijVar.n0(null);
                    ij ijVar2 = q1Var.P5;
                    if (ijVar2.z != null) {
                        ijVar2.z = null;
                        ijVar2.k0();
                    }
                    l1 l1Var = q1Var.Ra;
                    if (l1Var != null) {
                        l1Var.V(q1Var);
                        break;
                    }
                }
                break;
            case 3:
                q1 q1Var2 = this.b;
                if (q1Var2.d8 && !q1Var2.e8 && q1Var2.f8) {
                    q1Var2.e8 = true;
                    q1Var2.Ja.setState(new int[]{R.attr.state_pressed, R.attr.state_enabled});
                    break;
                }
                break;
            case 4:
                q1 q1Var3 = this.b;
                q1Var3.Ja.setState(new int[0]);
                q1Var3.invalidate();
                break;
            case 5:
                q1 q1Var4 = this.b;
                q1Var4.Ja.setState(new int[0]);
                q1Var4.invalidate();
                break;
            case 6:
                q1 q1Var5 = this.b;
                int i7 = 0;
                q1Var5.O5 = false;
                q1Var5.getMessageObject().L0 = true;
                gj gjVar = q1Var5.p3;
                if (gjVar != null) {
                    ArrayList arrayList = gjVar.e;
                    int size = arrayList.size();
                    int i10 = 0;
                    while (i10 < size) {
                        Object obj = arrayList.get(i10);
                        i10++;
                        ((fj) obj).y.clear();
                    }
                }
                gj gjVar2 = q1Var5.l3;
                if (gjVar2 != null) {
                    ArrayList arrayList2 = gjVar2.e;
                    int size2 = arrayList2.size();
                    while (i7 < size2) {
                        Object obj2 = arrayList2.get(i7);
                        i7++;
                        ((fj) obj2).y.clear();
                    }
                } else {
                    ArrayList arrayList3 = q1Var5.P5.z2;
                    if (arrayList3 != null) {
                        int size3 = arrayList3.size();
                        while (i7 < size3) {
                            Object obj3 = arrayList3.get(i7);
                            i7++;
                            ((fj) obj3).y.clear();
                        }
                    }
                }
                q1Var5.invalidate();
                break;
            case 7:
                q1 q1Var6 = this.b;
                q1Var6.getMessageObject().C.L0 = true;
                q1Var6.Sb.clear();
                q1Var6.invalidate();
                break;
            case 8:
                q1 q1Var7 = this.b;
                q1Var7.post(new c1(q1Var7, 6));
                break;
            case 9:
                q1 q1Var8 = this.b;
                l1 l1Var2 = q1Var8.Ra;
                if (l1Var2 != null) {
                    l1Var2.r(q1Var8);
                    break;
                }
                break;
            default:
                this.b.h3();
                break;
        }
    }
}
