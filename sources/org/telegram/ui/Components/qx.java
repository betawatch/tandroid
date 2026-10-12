package org.telegram.ui.Components;

import android.view.MotionEvent;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class qx extends e61 {
    public final /* synthetic */ wz b;

    public qx(wz wzVar) {
        this.b = wzVar;
    }

    @Override // org.telegram.ui.Components.e61
    public final boolean a() {
        return this.b.t1.b();
    }

    @Override // org.telegram.ui.Components.e61
    public final String[] b() {
        return this.b.W0;
    }

    @Override // org.telegram.ui.Components.e61
    public final boolean c() {
        return this.b.t1.c();
    }

    @Override // org.telegram.ui.Components.e61
    public final boolean d(x51 x51Var, MotionEvent motionEvent) {
        org.telegram.ui.xt q6 = org.telegram.ui.xt.q();
        wz wzVar = this.b;
        wzVar.getMeasuredHeight();
        return q6.r(motionEvent, x51Var, wzVar.g2, wzVar.Z1);
    }

    @Override // org.telegram.ui.Components.e61
    public final boolean e(x51 x51Var, j jVar, MotionEvent motionEvent) {
        org.telegram.ui.xt q6 = org.telegram.ui.xt.q();
        wz wzVar = this.b;
        wzVar.getMeasuredHeight();
        return q6.s(motionEvent, x51Var, jVar, wzVar.g2, wzVar.Z1);
    }

    @Override // org.telegram.ui.Components.e61
    public final void f(TLRPC.Document document, Object obj, boolean z10, int i10) {
        this.b.t1.m(null, document, null, obj, null, z10, i10);
    }

    @Override // org.telegram.ui.Components.e61
    public final void g(TLRPC.StickerSetCovered stickerSetCovered, boolean z10) {
        wz wzVar = this.b;
        wzVar.t1.r(stickerSetCovered);
        if (z10) {
            wzVar.X(true);
        }
    }

    @Override // org.telegram.ui.Components.e61
    public final void h(TLRPC.StickerSetCovered stickerSetCovered) {
        this.b.t1.h(stickerSetCovered);
    }

    @Override // org.telegram.ui.Components.e61
    public final void i(String[] strArr) {
        this.b.W0 = strArr;
    }
}
