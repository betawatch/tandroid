// default package

import android.graphics.Paint;
import android.graphics.Path;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class f0d implements u0d {
    public final vw2 a;
    public final String b;
    public final q0d c;
    public final vnb d;
    public final Paint e = new Paint(1);
    public final Path f = new Path();
    public v0d h;
    public int n;
    public boolean r;

    public f0d(vw2 vw2Var, int i, TLRPC.BotInlineResult botInlineResult, vnb vnbVar) {
        this.a = vw2Var;
        this.d = vnbVar;
        String w = k0d.w(i, botInlineResult);
        this.b = w;
        this.c = k0d.h(w);
    }

    public final void a(int i) {
        q0d q0dVar = this.c;
        if (q0dVar == null || i <= 0) {
            return;
        }
        this.n = i;
        q0dVar.m(i);
        if (this.r) {
            return;
        }
        this.r = true;
        q0dVar.k(c1d.a(this.d, true));
        v0d v0dVar = this.h;
        if (v0dVar == null) {
            v0dVar = new v0d(this, hl.p);
            this.h = v0dVar;
        }
        v0dVar.b(q0dVar);
        this.h.q(true);
        k0d.u(q0dVar);
    }

    @Override // u0d
    public final void f() {
        this.a.invalidate();
    }

    @Override // u0d
    public final void h() {
        vw2 vw2Var = this.a;
        vw2Var.requestLayout();
        vw2Var.invalidate();
    }

    @Override // u0d
    public final void d() {
    }

    @Override // u0d
    public final void b(boolean z) {
    }

    @Override // u0d
    public final void setCursor(String str) {
    }
}
