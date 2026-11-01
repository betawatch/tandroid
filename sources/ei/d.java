package ei;

import android.graphics.Canvas;
import android.graphics.RectF;
import c3.i0;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes4.dex */
public final class d implements hi.a, fi.a {
    public final int a;
    public final /* synthetic */ e b;

    public d(e eVar, int i10) {
        this.b = eVar;
        this.a = i10;
    }

    @Override // fi.a
    public final int a() {
        boolean b10 = i0.b(this.a);
        e eVar = this.b;
        return b10 ? eVar.s : eVar.q;
    }

    @Override // fi.a
    public final void d(float f7, float f10, int i10, Canvas canvas, RectF rectF) {
        e.b(this.b, this.a, canvas, rectF, i10, f7, f10);
    }

    @Override // hi.a
    public final void e(Canvas canvas, float f7, float f10, float f11, float f12) {
        e.a(this.b, canvas, this.a, f7, f10, f11, f12);
    }

    @Override // fi.a
    public final int f() {
        boolean b10 = i0.b(this.a);
        e eVar = this.b;
        return b10 ? eVar.n : eVar.m;
    }

    @Override // fi.a
    public final int g() {
        boolean b10 = i0.b(this.a);
        e eVar = this.b;
        return b10 ? eVar.r : eVar.p;
    }

    @Override // fi.a
    public final boolean h() {
        return true;
    }
}
