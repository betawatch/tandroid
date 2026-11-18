package m;

import android.graphics.Path;
import android.graphics.Rect;
import android.os.Handler;
import android.util.SparseArray;
import android.view.View;
import fi.p5;
import java.util.ArrayList;
import org.telegram.messenger.fj;
import org.telegram.ui.Wallet.c5;
import org.telegram.ui.bn;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes.dex */
public final class b3 implements m9.t {
    public boolean a;
    public boolean b;
    public Object c;
    public Object d;

    public b3(org.telegram.ui.Wallet.m mVar, org.telegram.ui.Wallet.u uVar) {
        this.c = mVar;
        this.d = uVar;
    }

    public boolean a(int i7) {
        SparseArray sparseArray = (SparseArray) this.c;
        boolean z10 = this.b;
        bn bnVar = (bn) this.d;
        int i10 = i7 - bnVar.D0.K;
        if (i10 < 0 || i10 >= bnVar.M6.size()) {
            return false;
        }
        fj fjVar = (fj) bnVar.M6.get(i10);
        if (fjVar.U != 0) {
            return false;
        }
        if (z10 || sparseArray.get(fjVar.e1(), null) != null) {
            return z10 && sparseArray.get(fjVar.e1(), null) != null;
        }
        return true;
    }

    public void b() {
        if (this.a) {
            return;
        }
        this.a = true;
        Runnable runnable = (Runnable) this.c;
        if (runnable != null) {
            runnable.run();
        }
        Runnable runnable2 = (Runnable) this.d;
        if (runnable2 == null || this.b) {
            return;
        }
        runnable2.run();
    }

    public boolean c(Rect rect, boolean z10, boolean z11) {
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
    public void d(float f10, float f11, int i7, boolean z10) {
        v4.f1 K;
        bn bnVar = (bn) this.d;
        ArrayList arrayList = bnVar.M6;
        SparseArray[] sparseArrayArr = bnVar.o6;
        int i10 = i7 - bnVar.D0.K;
        if (this.b) {
            z10 = !z10;
        }
        if (i10 < 0 || i10 >= arrayList.size()) {
            return;
        }
        fj fjVar = (fj) arrayList.get(i10);
        if (!z10 || (sparseArrayArr[0].indexOfKey(fjVar.e1()) < 0 && sparseArrayArr[1].indexOfKey(fjVar.e1()) < 0)) {
            if ((z10 || sparseArrayArr[0].indexOfKey(fjVar.e1()) >= 0 || sparseArrayArr[1].indexOfKey(fjVar.e1()) >= 0) && fjVar.U == 0) {
                if (z10) {
                    if (sparseArrayArr[1].size() + sparseArrayArr[0].size() >= 100) {
                        this.a = true;
                        K = bnVar.A0.K(i7);
                        if (K != null) {
                            View view = K.a;
                            if (view instanceof org.telegram.ui.Cells.q1) {
                                bn.k2(bnVar, view, false, f10, f11);
                                return;
                            }
                        }
                        bnVar.K6(fjVar, false, true);
                        bnVar.Lc();
                        bnVar.Gd(false);
                    }
                }
                this.a = false;
                K = bnVar.A0.K(i7);
                if (K != null) {
                }
                bnVar.K6(fjVar, false, true);
                bnVar.Lc();
                bnVar.Gd(false);
            }
        }
    }

    @Override // m9.t
    public void onSuccess(Object obj) {
        p4.w wVar = (p4.w) obj;
        p4.d0 d0Var = ((p4.m0) this.d).h;
        Handler handler = d0Var.l;
        p4.v vVar = (p4.v) this.c;
        h2.l0.W(handler, new c5(d0Var, vVar, new p5(this, wVar, this.a, this.b, vVar, 4)));
    }

    public b3() {
        this.c = new Path();
        this.d = new Rect();
    }

    @Override // m9.t
    public void h(Throwable th2) {
    }
}
