package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.os.Build;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class if0 implements si.a, qi.a {
    public final eh.c a;

    public if0(eh.c cVar) {
        this.a = cVar;
    }

    @Override // qi.a
    public final int a() {
        return ((qi.a) b()).a();
    }

    public final si.a b() {
        pi.r f10 = pi.q.f();
        boolean z10 = f10.a;
        eh.c cVar = this.a;
        return !z10 ? cVar.c : (!f10.b || Build.VERSION.SDK_INT < 33) ? cVar.b : cVar.a;
    }

    @Override // qi.a
    public final void c(float f10, float f11, int i3, Canvas canvas, RectF rectF) {
        ((qi.a) b()).c(f10, f11, i3, canvas, rectF);
    }

    @Override // qi.a
    public final int e() {
        return ((qi.a) b()).e();
    }

    @Override // qi.a
    public final int f() {
        return ((qi.a) b()).f();
    }

    @Override // qi.a
    public final boolean g() {
        si.a b10 = b();
        return (b10 instanceof qi.a) && ((qi.a) b10).g();
    }

    @Override // si.a
    public final void l(Canvas canvas, float f10, float f11, float f12, float f13) {
        b().l(canvas, f10, f11, f12, f13);
    }
}
