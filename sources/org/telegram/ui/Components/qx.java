package org.telegram.ui.Components;

import android.view.MotionEvent;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class qx extends f61 {
    public final /* synthetic */ wz b;

    public qx(wz wzVar) {
        this.b = wzVar;
    }

    @Override // org.telegram.ui.Components.f61
    public final boolean a() {
        return this.b.t1.b();
    }

    @Override // org.telegram.ui.Components.f61
    public final String[] b() {
        return this.b.W0;
    }

    @Override // org.telegram.ui.Components.f61
    public final boolean c() {
        return this.b.t1.c();
    }

    @Override // org.telegram.ui.Components.f61
    public final boolean d(y51 y51Var, MotionEvent motionEvent) {
        org.telegram.ui.xt q6 = org.telegram.ui.xt.q();
        wz wzVar = this.b;
        wzVar.getMeasuredHeight();
        return q6.r(motionEvent, y51Var, wzVar.g2, wzVar.Z1);
    }

    @Override // org.telegram.ui.Components.f61
    public final boolean e(y51 y51Var, j jVar, MotionEvent motionEvent) {
        org.telegram.ui.xt q6 = org.telegram.ui.xt.q();
        wz wzVar = this.b;
        wzVar.getMeasuredHeight();
        return q6.s(motionEvent, y51Var, jVar, wzVar.g2, wzVar.Z1);
    }

    @Override // org.telegram.ui.Components.f61
    public final void f(TLRPC.Document document, Object obj, boolean z10, int i10) {
        this.b.t1.m(null, document, null, obj, null, z10, i10);
    }

    @Override // org.telegram.ui.Components.f61
    public final void g(TLRPC.StickerSetCovered stickerSetCovered, boolean z10) {
        wz wzVar = this.b;
        wzVar.t1.r(stickerSetCovered);
        if (z10) {
            wzVar.X(true);
        }
    }

    @Override // org.telegram.ui.Components.f61
    public final void h(TLRPC.StickerSetCovered stickerSetCovered) {
        this.b.t1.h(stickerSetCovered);
    }

    @Override // org.telegram.ui.Components.f61
    public final void i(String[] strArr) {
        this.b.W0 = strArr;
    }
}
