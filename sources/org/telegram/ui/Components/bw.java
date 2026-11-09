package org.telegram.ui.Components;

import android.view.MotionEvent;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class bw extends q31 {
    public final /* synthetic */ hy b;

    public bw(hy hyVar) {
        this.b = hyVar;
    }

    @Override // org.telegram.ui.Components.q31
    public final boolean a() {
        return this.b.t1.b();
    }

    @Override // org.telegram.ui.Components.q31
    public final String[] b() {
        return this.b.W0;
    }

    @Override // org.telegram.ui.Components.q31
    public final boolean c() {
        return this.b.t1.c();
    }

    @Override // org.telegram.ui.Components.q31
    public final boolean d(j31 j31Var, MotionEvent motionEvent) {
        org.telegram.ui.ms p10 = org.telegram.ui.ms.p();
        hy hyVar = this.b;
        hyVar.getMeasuredHeight();
        return p10.q(motionEvent, j31Var, hyVar.g2, hyVar.Z1);
    }

    @Override // org.telegram.ui.Components.q31
    public final boolean e(j31 j31Var, k kVar, MotionEvent motionEvent) {
        org.telegram.ui.ms p10 = org.telegram.ui.ms.p();
        hy hyVar = this.b;
        hyVar.getMeasuredHeight();
        return p10.r(motionEvent, j31Var, kVar, hyVar.g2, hyVar.Z1);
    }

    @Override // org.telegram.ui.Components.q31
    public final void f(TLRPC.Document document, Object obj, boolean z9, int i7) {
        this.b.t1.m(null, document, null, obj, null, z9, i7);
    }

    @Override // org.telegram.ui.Components.q31
    public final void g(TLRPC.StickerSetCovered stickerSetCovered, boolean z9) {
        hy hyVar = this.b;
        hyVar.t1.r(stickerSetCovered);
        if (z9) {
            hyVar.X(true);
        }
    }

    @Override // org.telegram.ui.Components.q31
    public final void h(TLRPC.StickerSetCovered stickerSetCovered) {
        this.b.t1.h(stickerSetCovered);
    }

    @Override // org.telegram.ui.Components.q31
    public final void i(String[] strArr) {
        this.b.W0 = strArr;
    }
}
