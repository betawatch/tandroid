package m;

import android.graphics.Path;
import android.graphics.Rect;
import android.os.Handler;
import android.util.SparseArray;
import android.view.View;
import di.z5;
import java.util.ArrayList;
import org.telegram.messenger.ij;
import org.telegram.ui.an;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final class c3 implements m9.t {
    public boolean a;
    public boolean b;
    public Object c = new Path();
    public Object d = new Rect();

    public boolean a(int i7) {
        SparseArray sparseArray = (SparseArray) this.c;
        boolean z9 = this.b;
        an anVar = (an) this.d;
        int i10 = i7 - anVar.C0.J;
        if (i10 < 0 || i10 >= anVar.K6.size()) {
            return false;
        }
        ij ijVar = (ij) anVar.K6.get(i10);
        if (ijVar.U != 0) {
            return false;
        }
        if (z9 || sparseArray.get(ijVar.f1(), null) != null) {
            return z9 && sparseArray.get(ijVar.f1(), null) != null;
        }
        return true;
    }

    public boolean b(Rect rect, boolean z9, boolean z10) {
        Rect rect2 = (Rect) this.d;
        boolean z11 = (!rect2.isEmpty() && rect2.top == rect.top && rect2.bottom == rect.bottom && rect2.right == rect.right && rect2.left == rect.left && this.a == z10 && this.b == z9 && z10 && z9) ? false : true;
        this.a = z10;
        this.b = z9;
        rect2.set(rect);
        return z11;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x007e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void c(int i7, boolean z9, float f10, float f11) {
        v4.d1 K;
        an anVar = (an) this.d;
        ArrayList arrayList = anVar.K6;
        SparseArray[] sparseArrayArr = anVar.m6;
        int i10 = i7 - anVar.C0.J;
        if (this.b) {
            z9 = !z9;
        }
        if (i10 < 0 || i10 >= arrayList.size()) {
            return;
        }
        ij ijVar = (ij) arrayList.get(i10);
        if (!z9 || (sparseArrayArr[0].indexOfKey(ijVar.f1()) < 0 && sparseArrayArr[1].indexOfKey(ijVar.f1()) < 0)) {
            if ((z9 || sparseArrayArr[0].indexOfKey(ijVar.f1()) >= 0 || sparseArrayArr[1].indexOfKey(ijVar.f1()) >= 0) && ijVar.U == 0) {
                if (z9) {
                    if (sparseArrayArr[1].size() + sparseArrayArr[0].size() >= 100) {
                        this.a = true;
                        K = anVar.z0.K(i7);
                        if (K != null) {
                            View view = K.a;
                            if (view instanceof org.telegram.ui.Cells.q1) {
                                an.j2(anVar, view, false, f10, f11);
                                return;
                            }
                        }
                        anVar.J6(ijVar, false, true);
                        anVar.Hc();
                        anVar.Cd(false);
                    }
                }
                this.a = false;
                K = anVar.z0.K(i7);
                if (K != null) {
                }
                anVar.J6(ijVar, false, true);
                anVar.Hc();
                anVar.Cd(false);
            }
        }
    }

    @Override // m9.t
    public void onSuccess(Object obj) {
        p4.w wVar = (p4.w) obj;
        p4.d0 d0Var = ((p4.m0) this.d).h;
        Handler handler = d0Var.l;
        p4.v vVar = (p4.v) this.c;
        h2.m0.W(handler, new org.telegram.ui.web.w(d0Var, vVar, new z5(this, wVar, this.a, this.b, vVar, 4)));
    }

    @Override // m9.t
    public void h(Throwable th2) {
    }
}
