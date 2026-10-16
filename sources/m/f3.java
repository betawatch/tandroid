package m;

import android.graphics.Path;
import android.graphics.Rect;
import android.os.Handler;
import bi.n7;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes.dex */
public final class f3 implements j9.t {
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
        m4.w wVar = (m4.w) obj;
        m4.e0 e0Var = ((m4.p0) this.d).g;
        Handler handler = e0Var.l;
        m4.v vVar = (m4.v) this.c;
        e2.m0.W(handler, new ji.v2(e0Var, vVar, new n7(this, wVar, this.a, this.b, vVar, 2)));
    }

    @Override // j9.t
    public void i(Throwable th2) {
    }
}
