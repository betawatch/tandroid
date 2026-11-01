package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.os.Build;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class jg0 implements hi.a, fi.a {
    public final tg.b a;

    public jg0(tg.b bVar) {
        this.a = bVar;
    }

    @Override // fi.a
    public final int a() {
        return ((fi.a) b()).a();
    }

    public final hi.a b() {
        ei.s f7 = ei.r.f();
        boolean z10 = f7.a;
        tg.b bVar = this.a;
        return !z10 ? bVar.c : (!f7.b || Build.VERSION.SDK_INT < 33) ? bVar.b : bVar.a;
    }

    @Override // fi.a
    public final void d(float f7, float f10, int i10, Canvas canvas, RectF rectF) {
        ((fi.a) b()).d(f7, f10, i10, canvas, rectF);
    }

    @Override // hi.a
    public final void e(Canvas canvas, float f7, float f10, float f11, float f12) {
        b().e(canvas, f7, f10, f11, f12);
    }

    @Override // fi.a
    public final int f() {
        return ((fi.a) b()).f();
    }

    @Override // fi.a
    public final int g() {
        return ((fi.a) b()).g();
    }

    @Override // fi.a
    public final boolean h() {
        hi.a b10 = b();
        return (b10 instanceof fi.a) && ((fi.a) b10).h();
    }
}
