package org.telegram.ui.Components;

import android.view.MotionEvent;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes3.dex */
public final class hx extends a61 {
    public final /* synthetic */ nz b;

    public hx(nz nzVar) {
        this.b = nzVar;
    }

    @Override // org.telegram.ui.Components.a61
    public final boolean a() {
        return this.b.t1.b();
    }

    @Override // org.telegram.ui.Components.a61
    public final String[] b() {
        return this.b.W0;
    }

    @Override // org.telegram.ui.Components.a61
    public final boolean c() {
        return this.b.t1.c();
    }

    @Override // org.telegram.ui.Components.a61
    public final boolean d(t51 t51Var, MotionEvent motionEvent) {
        org.telegram.ui.rt q6 = org.telegram.ui.rt.q();
        nz nzVar = this.b;
        nzVar.getMeasuredHeight();
        return q6.r(motionEvent, t51Var, nzVar.g2, nzVar.Z1);
    }

    @Override // org.telegram.ui.Components.a61
    public final boolean e(t51 t51Var, j jVar, MotionEvent motionEvent) {
        org.telegram.ui.rt q6 = org.telegram.ui.rt.q();
        nz nzVar = this.b;
        nzVar.getMeasuredHeight();
        return q6.s(motionEvent, t51Var, jVar, nzVar.g2, nzVar.Z1);
    }

    @Override // org.telegram.ui.Components.a61
    public final void f(TLRPC.Document document, Object obj, boolean z10, int i10) {
        this.b.t1.m(null, document, null, obj, null, z10, i10);
    }

    @Override // org.telegram.ui.Components.a61
    public final void g(TLRPC.StickerSetCovered stickerSetCovered, boolean z10) {
        nz nzVar = this.b;
        nzVar.t1.r(stickerSetCovered);
        if (z10) {
            nzVar.W(true);
        }
    }

    @Override // org.telegram.ui.Components.a61
    public final void h(TLRPC.StickerSetCovered stickerSetCovered) {
        this.b.t1.h(stickerSetCovered);
    }

    @Override // org.telegram.ui.Components.a61
    public final void i(String[] strArr) {
        this.b.W0 = strArr;
    }
}
