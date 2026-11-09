package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.os.Build;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class hf0 implements ri.a, pi.a {
    public final dh.c a;

    public hf0(dh.c cVar) {
        this.a = cVar;
    }

    @Override // pi.a
    public final int a() {
        return ((pi.a) b()).a();
    }

    public final ri.a b() {
        oi.r f10 = oi.q.f();
        boolean z9 = f10.a;
        dh.c cVar = this.a;
        return !z9 ? cVar.c : (!f10.b || Build.VERSION.SDK_INT < 33) ? cVar.b : cVar.a;
    }

    @Override // pi.a
    public final void d(float f10, float f11, int i7, Canvas canvas, RectF rectF) {
        ((pi.a) b()).d(f10, f11, i7, canvas, rectF);
    }

    @Override // ri.a
    public final void e(Canvas canvas, float f10, float f11, float f12, float f13) {
        b().e(canvas, f10, f11, f12, f13);
    }

    @Override // pi.a
    public final int f() {
        return ((pi.a) b()).f();
    }

    @Override // pi.a
    public final int g() {
        return ((pi.a) b()).g();
    }

    @Override // pi.a
    public final boolean h() {
        ri.a b10 = b();
        return (b10 instanceof pi.a) && ((pi.a) b10).h();
    }
}
