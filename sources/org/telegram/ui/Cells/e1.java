package org.telegram.ui.Cells;

import android.R;
import java.util.ArrayList;
import org.telegram.messenger.dj;
import org.telegram.messenger.ej;
import org.telegram.messenger.gj;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class e1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ r1 b;

    public /* synthetic */ e1(r1 r1Var, int i7) {
        this.a = i7;
        this.b = r1Var;
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
                r1 r1Var = this.b;
                b9.g0 g0Var = r1Var.x;
                g0Var.a(r1Var.Yb);
                g0Var.a(r1Var.Zb);
                r1Var.j3();
                gj gjVar = r1Var.Q5;
                if (gjVar != null) {
                    gjVar.n0(null);
                    gj gjVar2 = r1Var.Q5;
                    if (gjVar2.z != null) {
                        gjVar2.z = null;
                        gjVar2.k0();
                    }
                    m1 m1Var = r1Var.Sa;
                    if (m1Var != null) {
                        m1Var.Y(r1Var);
                        break;
                    }
                }
                break;
            case 3:
                r1 r1Var2 = this.b;
                if (r1Var2.e8 && !r1Var2.f8 && r1Var2.g8) {
                    r1Var2.f8 = true;
                    r1Var2.Ka.setState(new int[]{R.attr.state_pressed, R.attr.state_enabled});
                    break;
                }
                break;
            case 4:
                r1 r1Var3 = this.b;
                r1Var3.Ka.setState(new int[0]);
                r1Var3.invalidate();
                break;
            case 5:
                r1 r1Var4 = this.b;
                r1Var4.Ka.setState(new int[0]);
                r1Var4.invalidate();
                break;
            case 6:
                r1 r1Var5 = this.b;
                int i7 = 0;
                r1Var5.P5 = false;
                r1Var5.getMessageObject().N0 = true;
                ej ejVar = r1Var5.q3;
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
                ej ejVar2 = r1Var5.m3;
                if (ejVar2 != null) {
                    ArrayList arrayList2 = ejVar2.e;
                    int size2 = arrayList2.size();
                    while (i7 < size2) {
                        Object obj2 = arrayList2.get(i7);
                        i7++;
                        ((dj) obj2).y.clear();
                    }
                } else {
                    ArrayList arrayList3 = r1Var5.Q5.B2;
                    if (arrayList3 != null) {
                        int size3 = arrayList3.size();
                        while (i7 < size3) {
                            Object obj3 = arrayList3.get(i7);
                            i7++;
                            ((dj) obj3).y.clear();
                        }
                    }
                }
                r1Var5.invalidate();
                break;
            case 7:
                r1 r1Var6 = this.b;
                r1Var6.getMessageObject().C.N0 = true;
                r1Var6.Tb.clear();
                r1Var6.invalidate();
                break;
            case 8:
                r1 r1Var7 = this.b;
                r1Var7.post(new e1(r1Var7, 6));
                break;
            case 9:
                r1 r1Var8 = this.b;
                m1 m1Var2 = r1Var8.Sa;
                if (m1Var2 != null) {
                    m1Var2.s(r1Var8);
                    break;
                }
                break;
            default:
                this.b.j3();
                break;
        }
    }
}
