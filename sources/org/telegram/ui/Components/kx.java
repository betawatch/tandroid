package org.telegram.ui.Components;

import android.view.MotionEvent;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class kx extends n61 {
    public final /* synthetic */ sz b;

    public kx(sz szVar) {
        this.b = szVar;
    }

    @Override // org.telegram.ui.Components.n61
    public final boolean a() {
        return this.b.t1.b();
    }

    @Override // org.telegram.ui.Components.n61
    public final String[] b() {
        return this.b.W0;
    }

    @Override // org.telegram.ui.Components.n61
    public final boolean c() {
        return this.b.t1.c();
    }

    @Override // org.telegram.ui.Components.n61
    public final boolean d(g61 g61Var, MotionEvent motionEvent) {
        org.telegram.ui.ht o10 = org.telegram.ui.ht.o();
        sz szVar = this.b;
        szVar.getMeasuredHeight();
        return o10.p(motionEvent, g61Var, szVar.g2, szVar.Z1);
    }

    @Override // org.telegram.ui.Components.n61
    public final boolean e(g61 g61Var, j jVar, MotionEvent motionEvent) {
        org.telegram.ui.ht o10 = org.telegram.ui.ht.o();
        sz szVar = this.b;
        szVar.getMeasuredHeight();
        return o10.q(motionEvent, g61Var, jVar, szVar.g2, szVar.Z1);
    }

    @Override // org.telegram.ui.Components.n61
    public final void f(TLRPC.Document document, Object obj, boolean z10, int i10) {
        this.b.t1.m(null, document, null, obj, null, z10, i10);
    }

    @Override // org.telegram.ui.Components.n61
    public final void g(TLRPC.StickerSetCovered stickerSetCovered, boolean z10) {
        sz szVar = this.b;
        szVar.t1.r(stickerSetCovered);
        if (z10) {
            szVar.Y(true);
        }
    }

    @Override // org.telegram.ui.Components.n61
    public final void h(TLRPC.StickerSetCovered stickerSetCovered) {
        this.b.t1.h(stickerSetCovered);
    }

    @Override // org.telegram.ui.Components.n61
    public final void i(String[] strArr) {
        this.b.W0 = strArr;
    }
}
