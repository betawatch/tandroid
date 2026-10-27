package m;

import android.graphics.Path;
import android.graphics.Rect;
import android.os.Handler;
import di.i6;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class d3 implements k9.t {
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

    @Override // k9.t
    public void onSuccess(Object obj) {
        m4.x xVar = (m4.x) obj;
        m4.f0 f0Var = ((m4.p0) this.d).g;
        Handler handler = f0Var.l;
        m4.w wVar = (m4.w) this.c;
        e2.n0.W(handler, new k2.e0(f0Var, wVar, new i6(this, xVar, this.a, this.b, wVar, 2)));
    }

    @Override // k9.t
    public void i(Throwable th2) {
    }
}
