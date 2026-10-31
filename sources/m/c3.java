package m;

import android.graphics.Path;
import android.graphics.Rect;
import android.os.Handler;
import android.util.SparseArray;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.jj;
import org.telegram.ui.un;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class c3 implements j9.t {
    public boolean a;
    public boolean b;
    public Object c = new Path();
    public Object d = new Rect();

    public boolean a(int i10) {
        SparseArray sparseArray = (SparseArray) this.c;
        boolean z10 = this.b;
        un unVar = (un) this.d;
        int i11 = i10 - unVar.C0.J;
        if (i11 < 0 || i11 >= unVar.K6.size()) {
            return false;
        }
        jj jjVar = (jj) unVar.K6.get(i11);
        if (jjVar.U != 0) {
            return false;
        }
        if (z10 || sparseArray.get(jjVar.f1(), null) != null) {
            return z10 && sparseArray.get(jjVar.f1(), null) != null;
        }
        return true;
    }

    public boolean b(Rect rect, boolean z10, boolean z11) {
        Rect rect2 = (Rect) this.d;
        boolean z12 = (!rect2.isEmpty() && rect2.top == rect.top && rect2.bottom == rect.bottom && rect2.right == rect.right && rect2.left == rect.left && this.a == z11 && this.b == z10 && z11 && z10) ? false : true;
        this.a = z11;
        this.b = z10;
        rect2.set(rect);
        return z12;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x007e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void c(int i10, boolean z10, float f7, float f10) {
        s4.c1 K;
        un unVar = (un) this.d;
        ArrayList arrayList = unVar.K6;
        SparseArray[] sparseArrayArr = unVar.m6;
        int i11 = i10 - unVar.C0.J;
        if (this.b) {
            z10 = !z10;
        }
        if (i11 < 0 || i11 >= arrayList.size()) {
            return;
        }
        jj jjVar = (jj) arrayList.get(i11);
        if (!z10 || (sparseArrayArr[0].indexOfKey(jjVar.f1()) < 0 && sparseArrayArr[1].indexOfKey(jjVar.f1()) < 0)) {
            if ((z10 || sparseArrayArr[0].indexOfKey(jjVar.f1()) >= 0 || sparseArrayArr[1].indexOfKey(jjVar.f1()) >= 0) && jjVar.U == 0) {
                if (z10) {
                    if (sparseArrayArr[1].size() + sparseArrayArr[0].size() >= 100) {
                        this.a = true;
                        K = unVar.z0.K(i10);
                        if (K != null) {
                            View view = K.a;
                            if (view instanceof org.telegram.ui.Cells.q1) {
                                un.i2(unVar, view, false, f7, f10);
                                return;
                            }
                        }
                        unVar.E6(jjVar, false, true);
                        unVar.xc();
                        unVar.sd(false);
                    }
                }
                this.a = false;
                K = unVar.z0.K(i10);
                if (K != null) {
                }
                unVar.E6(jjVar, false, true);
                unVar.xc();
                unVar.sd(false);
            }
        }
    }

    @Override // j9.t
    public void onSuccess(Object obj) {
        m4.x xVar = (m4.x) obj;
        m4.f0 f0Var = ((m4.p0) this.d).h;
        Handler handler = f0Var.l;
        m4.w wVar = (m4.w) this.c;
        e2.l0.W(handler, new k2.u(f0Var, wVar, new ig.k0(this, xVar, this.a, this.b, wVar, 2)));
    }

    @Override // j9.t
    public void i(Throwable th2) {
    }
}
