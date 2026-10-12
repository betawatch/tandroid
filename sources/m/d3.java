package m;

import android.graphics.Path;
import android.graphics.Rect;
import android.os.Handler;
import bi.n7;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes.dex */
public final class d3 implements j9.t {
    public boolean a;
    public boolean b;
    public Object c = new Path();
    public Object d = new Rect();

    public boolean a(Rect rect, boolean z10, boolean z11) {
        Rect rect2 = (Rect) this.d;
        boolean z12 = (!rect2.isEmpty() && rect2.top == rect.top && rect2.bottom == rect.bottom && rect2.right == rect.right && rect2.left == rect.left && this.a == z11 && this.b == z10 && z11 && z10) ? false : true;
        this.a = z11;
        this.b = z10;
        rect2.set(rect);
        return z12;
    }

    @Override // j9.t
    public void onSuccess(Object obj) {
        m4.x xVar = (m4.x) obj;
        m4.f0 f0Var = ((m4.q0) this.d).g;
        Handler handler = f0Var.l;
        m4.w wVar = (m4.w) this.c;
        e2.m0.W(handler, new ji.v2(f0Var, wVar, new n7(this, xVar, this.a, this.b, wVar, 2)));
    }

    @Override // j9.t
    public void i(Throwable th2) {
    }
}
