package org.telegram.ui.Components;

import android.view.MotionEvent;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class ow extends s41 {
    public final /* synthetic */ vy b;

    public ow(vy vyVar) {
        this.b = vyVar;
    }

    @Override // org.telegram.ui.Components.s41
    public final boolean a() {
        return this.b.t1.b();
    }

    @Override // org.telegram.ui.Components.s41
    public final String[] b() {
        return this.b.W0;
    }

    @Override // org.telegram.ui.Components.s41
    public final boolean c() {
        return this.b.t1.c();
    }

    @Override // org.telegram.ui.Components.s41
    public final boolean d(l41 l41Var, MotionEvent motionEvent) {
        org.telegram.ui.lt p5 = org.telegram.ui.lt.p();
        vy vyVar = this.b;
        vyVar.getMeasuredHeight();
        return p5.q(motionEvent, l41Var, vyVar.g2, vyVar.Z1);
    }

    @Override // org.telegram.ui.Components.s41
    public final boolean e(l41 l41Var, k kVar, MotionEvent motionEvent) {
        org.telegram.ui.lt p5 = org.telegram.ui.lt.p();
        vy vyVar = this.b;
        vyVar.getMeasuredHeight();
        return p5.r(motionEvent, l41Var, kVar, vyVar.g2, vyVar.Z1);
    }

    @Override // org.telegram.ui.Components.s41
    public final void f(TLRPC.Document document, Object obj, boolean z10, int i10) {
        this.b.t1.m(null, document, null, obj, null, z10, i10);
    }

    @Override // org.telegram.ui.Components.s41
    public final void g(TLRPC.StickerSetCovered stickerSetCovered, boolean z10) {
        vy vyVar = this.b;
        vyVar.t1.r(stickerSetCovered);
        if (z10) {
            vyVar.Y(true);
        }
    }

    @Override // org.telegram.ui.Components.s41
    public final void h(TLRPC.StickerSetCovered stickerSetCovered) {
        this.b.t1.h(stickerSetCovered);
    }

    @Override // org.telegram.ui.Components.s41
    public final void i(String[] strArr) {
        this.b.W0 = strArr;
    }
}
