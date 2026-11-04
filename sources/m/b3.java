package m;

import android.graphics.Path;
import android.graphics.Rect;
import android.os.Handler;
import android.util.SparseArray;
import android.view.View;
import ei.a6;
import java.util.ArrayList;
import org.telegram.messenger.zi;
import org.telegram.ui.wm;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class b3 implements l9.t {
    public boolean a;
    public boolean b;
    public Object c = new Path();
    public Object d = new Rect();

    public boolean a(int i3) {
        SparseArray sparseArray = (SparseArray) this.c;
        boolean z10 = this.b;
        wm wmVar = (wm) this.d;
        int i10 = i3 - wmVar.D0.K;
        if (i10 < 0 || i10 >= wmVar.L6.size()) {
            return false;
        }
        zi ziVar = (zi) wmVar.L6.get(i10);
        if (ziVar.U != 0) {
            return false;
        }
        if (z10 || sparseArray.get(ziVar.f1(), null) != null) {
            return z10 && sparseArray.get(ziVar.f1(), null) != null;
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
    public void c(int i3, boolean z10, float f10, float f11) {
        u4.d1 K;
        wm wmVar = (wm) this.d;
        ArrayList arrayList = wmVar.L6;
        SparseArray[] sparseArrayArr = wmVar.n6;
        int i10 = i3 - wmVar.D0.K;
        if (this.b) {
            z10 = !z10;
        }
        if (i10 < 0 || i10 >= arrayList.size()) {
            return;
        }
        zi ziVar = (zi) arrayList.get(i10);
        if (!z10 || (sparseArrayArr[0].indexOfKey(ziVar.f1()) < 0 && sparseArrayArr[1].indexOfKey(ziVar.f1()) < 0)) {
            if ((z10 || sparseArrayArr[0].indexOfKey(ziVar.f1()) >= 0 || sparseArrayArr[1].indexOfKey(ziVar.f1()) >= 0) && ziVar.U == 0) {
                if (z10) {
                    if (sparseArrayArr[1].size() + sparseArrayArr[0].size() >= 100) {
                        this.a = true;
                        K = wmVar.A0.K(i3);
                        if (K != null) {
                            View view = K.a;
                            if (view instanceof org.telegram.ui.Cells.q1) {
                                wm.j2(wmVar, view, false, f10, f11);
                                return;
                            }
                        }
                        wmVar.J6(ziVar, false, true);
                        wmVar.Hc();
                        wmVar.Cd(false);
                    }
                }
                this.a = false;
                K = wmVar.A0.K(i3);
                if (K != null) {
                }
                wmVar.J6(ziVar, false, true);
                wmVar.Hc();
                wmVar.Cd(false);
            }
        }
    }

    @Override // l9.t
    public void onSuccess(Object obj) {
        o4.w wVar = (o4.w) obj;
        o4.e0 e0Var = ((o4.o0) this.d).h;
        Handler handler = e0Var.l;
        o4.v vVar = (o4.v) this.c;
        g2.n0.W(handler, new m2.s(e0Var, vVar, new a6(this, wVar, this.a, this.b, vVar, 2)));
    }

    @Override // l9.t
    public void h(Throwable th2) {
    }
}
