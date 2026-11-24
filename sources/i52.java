// default package

import android.graphics.RectF;
import android.os.Build;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class i52 extends i98 {
    public ArrayList a = new ArrayList();
    public final /* synthetic */ l52 b;

    public i52(l52 l52Var) {
        this.b = l52Var;
    }

    @Override // i98, o98
    public final void C() {
        l52 l52Var = this.b;
        l52Var.c();
        l52Var.i(l52Var.Q.Q, false);
    }

    @Override // i98, o98
    public final int D(int i, oac oacVar) {
        if (i < 0 || i >= this.a.size()) {
            return -1;
        }
        Integer valueOf = Integer.valueOf(((jm6) this.a.get(i)).C);
        l52 l52Var = this.b;
        int indexOf = l52Var.h.indexOf(valueOf);
        ArrayList arrayList = l52Var.h;
        if (indexOf < 0) {
            arrayList.add(valueOf);
            l52Var.c();
            return l52Var.h.size() - 1;
        }
        if (arrayList.size() <= 1) {
            return -1;
        }
        l52Var.h.remove(indexOf);
        l52Var.c();
        return indexOf;
    }

    @Override // i98, o98
    public final int G() {
        return this.b.h.size();
    }

    @Override // i98, o98
    public final p98 M(k27 k27Var, TLRPC.FileLocation fileLocation, int i, boolean z, boolean z2) {
        jm6 jm6Var;
        ArrayList arrayList;
        l52 l52Var = this.b;
        ArrayList arrayList2 = l52Var.b;
        m52 m52Var = l52Var.Q;
        if (i >= 0 && i < this.a.size() && w(i) && (jm6Var = (jm6) this.a.get(i)) != null) {
            int size = arrayList2.size();
            k52 k52Var = null;
            j52 j52Var = null;
            for (int i2 = 0; i2 < size; i2++) {
                k52Var = (k52) arrayList2.get(i2);
                if (k52Var != null && (arrayList = k52Var.h) != null) {
                    int size2 = arrayList.size();
                    int i3 = 0;
                    while (true) {
                        if (i3 >= size2) {
                            break;
                        }
                        j52 j52Var2 = (j52) arrayList.get(i3);
                        if (j52Var2 != null && j52Var2.b == jm6Var && j52Var2.k > 0.5d) {
                            j52Var = (j52) arrayList.get(i3);
                            break;
                        }
                        i3++;
                    }
                    if (j52Var != null) {
                        break;
                    }
                }
            }
            if (k52Var != null && j52Var != null) {
                p98 p98Var = new p98();
                int[] iArr = new int[2];
                l52Var.getLocationInWindow(iArr);
                if (Build.VERSION.SDK_INT < 26) {
                    iArr[0] = iArr[0] - m52Var.b.R();
                }
                p98Var.b = iArr[0];
                p98Var.c = iArr[1] + ((int) k52Var.a);
                p98Var.k = 1.0f;
                p98Var.d = l52Var;
                ImageReceiver imageReceiver = j52Var.c;
                p98Var.a = imageReceiver;
                p98Var.e = imageReceiver.p();
                p98Var.h = new int[]{(int) r7.left, (int) r7.top, (int) r7.right, (int) r7.bottom};
                RectF rectF = j52Var.q;
                p98Var.j = (int) (-l52Var.getY());
                p98Var.i = l52Var.getHeight() - ((int) (((-l52Var.getY()) + m52Var.r.getHeight()) - m52Var.b.T0()));
                return p98Var;
            }
        }
        return null;
    }

    @Override // i98, o98
    public final int R(Object obj) {
        int indexOf;
        Integer valueOf = Integer.valueOf(((jm6) obj).C);
        l52 l52Var = this.b;
        if (l52Var.h.size() <= 1 || (indexOf = l52Var.h.indexOf(valueOf)) < 0) {
            return -1;
        }
        l52Var.h.remove(indexOf);
        l52Var.c();
        return indexOf;
    }

    @Override // i98, o98
    public final int S(int i) {
        jm6 jm6Var;
        if (i < 0 || i >= this.a.size() || (jm6Var = (jm6) this.a.get(i)) == null) {
            return -1;
        }
        return this.b.h.indexOf(Integer.valueOf(jm6Var.C));
    }

    @Override // i98, o98
    public final void X(int i) {
        jm6 jm6Var;
        ArrayList arrayList;
        boolean z;
        l52 l52Var = this.b;
        ArrayList arrayList2 = l52Var.b;
        if (i < 0 || i >= this.a.size() || (jm6Var = (jm6) this.a.get(i)) == null) {
            return;
        }
        int i2 = jm6Var.C;
        l52Var.invalidate();
        for (int i3 = 0; i3 < arrayList2.size(); i3++) {
            k52 k52Var = (k52) arrayList2.get(i3);
            if (k52Var != null && (arrayList = k52Var.h) != null) {
                for (int i4 = 0; i4 < arrayList.size(); i4++) {
                    j52 j52Var = (j52) arrayList.get(i4);
                    if (j52Var != null && j52Var.b.C == i2) {
                        j52Var.f(jm6Var);
                    }
                }
                g52 g52Var = k52Var.k;
                if (g52Var == null || ((ArrayList) g52Var.f) == null) {
                    z = false;
                } else {
                    z = false;
                    for (int i5 = 0; i5 < ((ArrayList) k52Var.k.f).size(); i5++) {
                        if (((jm6) ((ArrayList) k52Var.k.f).get(i5)).C == i2) {
                            ((ArrayList) k52Var.k.f).set(i5, jm6Var);
                            z = true;
                        }
                    }
                }
                if (z) {
                    k52Var.b(k52Var.k, true);
                }
            }
        }
        l52Var.g();
        l52Var.invalidate();
    }

    @Override // i98, o98
    public final ArrayList d() {
        return this.b.h;
    }

    @Override // i98, o98
    public final boolean t() {
        return false;
    }

    @Override // i98, o98
    public final HashMap u() {
        return this.b.d;
    }

    @Override // i98, o98
    public final boolean w(int i) {
        if (i < 0 || i >= this.a.size()) {
            return false;
        }
        return this.b.h.contains(Integer.valueOf(((jm6) this.a.get(i)).C));
    }
}
