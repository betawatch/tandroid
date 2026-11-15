package m;

import android.graphics.Path;
import android.graphics.Rect;
import android.os.Handler;
import android.util.SparseArray;
import android.view.View;
import fi.r5;
import java.util.ArrayList;
import org.telegram.messenger.gj;
import org.telegram.ui.an;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes.dex */
public final class b3 implements m9.t {
    public boolean a;
    public boolean b;
    public Object c = new Path();
    public Object d = new Rect();

    public boolean a(int i7) {
        SparseArray sparseArray = (SparseArray) this.c;
        boolean z10 = this.b;
        an anVar = (an) this.d;
        int i10 = i7 - anVar.D0.K;
        if (i10 < 0 || i10 >= anVar.L6.size()) {
            return false;
        }
        gj gjVar = (gj) anVar.L6.get(i10);
        if (gjVar.U != 0) {
            return false;
        }
        if (z10 || sparseArray.get(gjVar.e1(), null) != null) {
            return z10 && sparseArray.get(gjVar.e1(), null) != null;
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
    public void c(int i7, boolean z10, float f10, float f11) {
        v4.e1 K;
        an anVar = (an) this.d;
        ArrayList arrayList = anVar.L6;
        SparseArray[] sparseArrayArr = anVar.n6;
        int i10 = i7 - anVar.D0.K;
        if (this.b) {
            z10 = !z10;
        }
        if (i10 < 0 || i10 >= arrayList.size()) {
            return;
        }
        gj gjVar = (gj) arrayList.get(i10);
        if (!z10 || (sparseArrayArr[0].indexOfKey(gjVar.e1()) < 0 && sparseArrayArr[1].indexOfKey(gjVar.e1()) < 0)) {
            if ((z10 || sparseArrayArr[0].indexOfKey(gjVar.e1()) >= 0 || sparseArrayArr[1].indexOfKey(gjVar.e1()) >= 0) && gjVar.U == 0) {
                if (z10) {
                    if (sparseArrayArr[1].size() + sparseArrayArr[0].size() >= 100) {
                        this.a = true;
                        K = anVar.A0.K(i7);
                        if (K != null) {
                            View view = K.a;
                            if (view instanceof org.telegram.ui.Cells.q1) {
                                an.k2(anVar, view, false, f10, f11);
                                return;
                            }
                        }
                        anVar.K6(gjVar, false, true);
                        anVar.Lc();
                        anVar.Gd(false);
                    }
                }
                this.a = false;
                K = anVar.A0.K(i7);
                if (K != null) {
                }
                anVar.K6(gjVar, false, true);
                anVar.Lc();
                anVar.Gd(false);
            }
        }
    }

    @Override // m9.t
    public void onSuccess(Object obj) {
        p4.w wVar = (p4.w) obj;
        p4.d0 d0Var = ((p4.m0) this.d).h;
        Handler handler = d0Var.l;
        p4.v vVar = (p4.v) this.c;
        h2.l0.W(handler, new org.telegram.ui.web.e1(d0Var, vVar, new r5(this, wVar, this.a, this.b, vVar, 4)));
    }

    @Override // m9.t
    public void h(Throwable th2) {
    }
}
