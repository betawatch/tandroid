package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.os.Build;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class jf0 implements ui.a, si.a {
    public final dh.c a;

    public jf0(dh.c cVar) {
        this.a = cVar;
    }

    @Override // si.a
    public final int a() {
        return ((si.a) b()).a();
    }

    public final ui.a b() {
        ri.r f10 = ri.q.f();
        boolean z10 = f10.a;
        dh.c cVar = this.a;
        return !z10 ? cVar.c : (!f10.b || Build.VERSION.SDK_INT < 33) ? cVar.b : cVar.a;
    }

    @Override // ui.a
    public final void b0(float f10, float f11, float f12, float f13, Canvas canvas) {
        b().b0(f10, f11, f12, f13, canvas);
    }

    @Override // si.a
    public final void d(float f10, float f11, int i7, Canvas canvas, RectF rectF) {
        ((si.a) b()).d(f10, f11, i7, canvas, rectF);
    }

    @Override // si.a
    public final int e() {
        return ((si.a) b()).e();
    }

    @Override // si.a
    public final int f() {
        return ((si.a) b()).f();
    }

    @Override // si.a
    public final boolean g() {
        ui.a b10 = b();
        return (b10 instanceof si.a) && ((si.a) b10).g();
    }
}
