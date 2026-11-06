package oi;

import android.graphics.Canvas;
import android.graphics.RectF;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes4.dex */
public final class c implements ri.a, pi.a {
    public final int a;
    public final /* synthetic */ d b;

    public c(d dVar, int i7) {
        this.b = dVar;
        this.a = i7;
    }

    @Override // pi.a
    public final int a() {
        boolean a10 = jg.g.a(this.a);
        d dVar = this.b;
        return a10 ? dVar.s : dVar.q;
    }

    @Override // pi.a
    public final void d(float f10, float f11, int i7, Canvas canvas, RectF rectF) {
        d.b(this.b, this.a, canvas, rectF, i7, f10, f11);
    }

    @Override // ri.a
    public final void e(Canvas canvas, float f10, float f11, float f12, float f13) {
        d.a(this.b, canvas, this.a, f10, f11, f12, f13);
    }

    @Override // pi.a
    public final int f() {
        boolean a10 = jg.g.a(this.a);
        d dVar = this.b;
        return a10 ? dVar.n : dVar.m;
    }

    @Override // pi.a
    public final int g() {
        boolean a10 = jg.g.a(this.a);
        d dVar = this.b;
        return a10 ? dVar.r : dVar.p;
    }

    @Override // pi.a
    public final boolean h() {
        return true;
    }
}
