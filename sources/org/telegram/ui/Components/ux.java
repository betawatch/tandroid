package org.telegram.ui.Components;

import android.view.MotionEvent;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class ux extends i61 {
    public final /* synthetic */ a00 b;

    public ux(a00 a00Var) {
        this.b = a00Var;
    }

    @Override // org.telegram.ui.Components.i61
    public final boolean a() {
        return this.b.t1.b();
    }

    @Override // org.telegram.ui.Components.i61
    public final String[] b() {
        return this.b.W0;
    }

    @Override // org.telegram.ui.Components.i61
    public final boolean c() {
        return this.b.t1.c();
    }

    @Override // org.telegram.ui.Components.i61
    public final boolean d(b61 b61Var, MotionEvent motionEvent) {
        org.telegram.ui.rt q6 = org.telegram.ui.rt.q();
        a00 a00Var = this.b;
        a00Var.getMeasuredHeight();
        return q6.r(motionEvent, b61Var, a00Var.g2, a00Var.Z1);
    }

    @Override // org.telegram.ui.Components.i61
    public final boolean e(b61 b61Var, j jVar, MotionEvent motionEvent) {
        org.telegram.ui.rt q6 = org.telegram.ui.rt.q();
        a00 a00Var = this.b;
        a00Var.getMeasuredHeight();
        return q6.s(motionEvent, b61Var, jVar, a00Var.g2, a00Var.Z1);
    }

    @Override // org.telegram.ui.Components.i61
    public final void f(TLRPC.Document document, Object obj, boolean z10, int i10) {
        this.b.t1.m(null, document, null, obj, null, z10, i10);
    }

    @Override // org.telegram.ui.Components.i61
    public final void g(TLRPC.StickerSetCovered stickerSetCovered, boolean z10) {
        a00 a00Var = this.b;
        a00Var.t1.r(stickerSetCovered);
        if (z10) {
            a00Var.X(true);
        }
    }

    @Override // org.telegram.ui.Components.i61
    public final void h(TLRPC.StickerSetCovered stickerSetCovered) {
        this.b.t1.h(stickerSetCovered);
    }

    @Override // org.telegram.ui.Components.i61
    public final void i(String[] strArr) {
        this.b.W0 = strArr;
    }
}
