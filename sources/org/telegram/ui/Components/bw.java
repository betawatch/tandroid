package org.telegram.ui.Components;

import android.view.MotionEvent;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class bw extends p31 {
    public final /* synthetic */ hy b;

    public bw(hy hyVar) {
        this.b = hyVar;
    }

    @Override // org.telegram.ui.Components.p31
    public final boolean a() {
        return this.b.t1.b();
    }

    @Override // org.telegram.ui.Components.p31
    public final String[] b() {
        return this.b.W0;
    }

    @Override // org.telegram.ui.Components.p31
    public final boolean c() {
        return this.b.t1.c();
    }

    @Override // org.telegram.ui.Components.p31
    public final boolean d(i31 i31Var, MotionEvent motionEvent) {
        org.telegram.ui.ks p10 = org.telegram.ui.ks.p();
        hy hyVar = this.b;
        hyVar.getMeasuredHeight();
        return p10.q(motionEvent, i31Var, hyVar.g2, hyVar.Z1);
    }

    @Override // org.telegram.ui.Components.p31
    public final boolean e(i31 i31Var, k kVar, MotionEvent motionEvent) {
        org.telegram.ui.ks p10 = org.telegram.ui.ks.p();
        hy hyVar = this.b;
        hyVar.getMeasuredHeight();
        return p10.r(motionEvent, i31Var, kVar, hyVar.g2, hyVar.Z1);
    }

    @Override // org.telegram.ui.Components.p31
    public final void f(TLRPC.Document document, Object obj, boolean z9, int i7) {
        this.b.t1.m(null, document, null, obj, null, z9, i7);
    }

    @Override // org.telegram.ui.Components.p31
    public final void g(TLRPC.StickerSetCovered stickerSetCovered, boolean z9) {
        hy hyVar = this.b;
        hyVar.t1.r(stickerSetCovered);
        if (z9) {
            hyVar.X(true);
        }
    }

    @Override // org.telegram.ui.Components.p31
    public final void h(TLRPC.StickerSetCovered stickerSetCovered) {
        this.b.t1.h(stickerSetCovered);
    }

    @Override // org.telegram.ui.Components.p31
    public final void i(String[] strArr) {
        this.b.W0 = strArr;
    }
}
