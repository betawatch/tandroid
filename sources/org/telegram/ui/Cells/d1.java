package org.telegram.ui.Cells;

import android.R;
import java.util.ArrayList;
import org.telegram.messenger.dj;
import org.telegram.messenger.ej;
import org.telegram.messenger.gj;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class d1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ q1 b;

    public /* synthetic */ d1(q1 q1Var, int i7) {
        this.a = i7;
        this.b = q1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.q2();
                break;
            case 1:
                this.b.r2();
                break;
            case 2:
                q1 q1Var = this.b;
                b9.g0 g0Var = q1Var.x;
                g0Var.a(q1Var.Yb);
                g0Var.a(q1Var.Zb);
                q1Var.i3();
                gj gjVar = q1Var.Q5;
                if (gjVar != null) {
                    gjVar.n0(null);
                    gj gjVar2 = q1Var.Q5;
                    if (gjVar2.z != null) {
                        gjVar2.z = null;
                        gjVar2.k0();
                    }
                    l1 l1Var = q1Var.Sa;
                    if (l1Var != null) {
                        l1Var.V(q1Var);
                        break;
                    }
                }
                break;
            case 3:
                q1 q1Var2 = this.b;
                if (q1Var2.e8 && !q1Var2.f8 && q1Var2.g8) {
                    q1Var2.f8 = true;
                    q1Var2.Ka.setState(new int[]{R.attr.state_pressed, R.attr.state_enabled});
                    break;
                }
                break;
            case 4:
                q1 q1Var3 = this.b;
                q1Var3.Ka.setState(new int[0]);
                q1Var3.invalidate();
                break;
            case 5:
                q1 q1Var4 = this.b;
                q1Var4.Ka.setState(new int[0]);
                q1Var4.invalidate();
                break;
            case 6:
                q1 q1Var5 = this.b;
                int i7 = 0;
                q1Var5.P5 = false;
                q1Var5.getMessageObject().N0 = true;
                ej ejVar = q1Var5.q3;
                if (ejVar != null) {
                    ArrayList arrayList = ejVar.e;
                    int size = arrayList.size();
                    int i10 = 0;
                    while (i10 < size) {
                        Object obj = arrayList.get(i10);
                        i10++;
                        ((dj) obj).y.clear();
                    }
                }
                ej ejVar2 = q1Var5.m3;
                if (ejVar2 != null) {
                    ArrayList arrayList2 = ejVar2.e;
                    int size2 = arrayList2.size();
                    while (i7 < size2) {
                        Object obj2 = arrayList2.get(i7);
                        i7++;
                        ((dj) obj2).y.clear();
                    }
                } else {
                    ArrayList arrayList3 = q1Var5.Q5.B2;
                    if (arrayList3 != null) {
                        int size3 = arrayList3.size();
                        while (i7 < size3) {
                            Object obj3 = arrayList3.get(i7);
                            i7++;
                            ((dj) obj3).y.clear();
                        }
                    }
                }
                q1Var5.invalidate();
                break;
            case 7:
                q1 q1Var6 = this.b;
                q1Var6.getMessageObject().C.N0 = true;
                q1Var6.Tb.clear();
                q1Var6.invalidate();
                break;
            case 8:
                q1 q1Var7 = this.b;
                q1Var7.post(new d1(q1Var7, 6));
                break;
            case 9:
                q1 q1Var8 = this.b;
                l1 l1Var2 = q1Var8.Sa;
                if (l1Var2 != null) {
                    l1Var2.r(q1Var8);
                    break;
                }
                break;
            default:
                this.b.i3();
                break;
        }
    }
}
