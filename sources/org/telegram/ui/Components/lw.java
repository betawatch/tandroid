package org.telegram.ui.Components;

import android.view.MotionEvent;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class lw extends g41 {
    public final /* synthetic */ qy b;

    public lw(qy qyVar) {
        this.b = qyVar;
    }

    @Override // org.telegram.ui.Components.g41
    public final boolean a() {
        return this.b.u1.b();
    }

    @Override // org.telegram.ui.Components.g41
    public final String[] b() {
        return this.b.X0;
    }

    @Override // org.telegram.ui.Components.g41
    public final boolean c() {
        return this.b.u1.c();
    }

    @Override // org.telegram.ui.Components.g41
    public final boolean d(z31 z31Var, MotionEvent motionEvent) {
        org.telegram.ui.ns p10 = org.telegram.ui.ns.p();
        qy qyVar = this.b;
        qyVar.getMeasuredHeight();
        return p10.q(motionEvent, z31Var, qyVar.h2, qyVar.a2);
    }

    @Override // org.telegram.ui.Components.g41
    public final boolean e(z31 z31Var, n nVar, MotionEvent motionEvent) {
        org.telegram.ui.ns p10 = org.telegram.ui.ns.p();
        qy qyVar = this.b;
        qyVar.getMeasuredHeight();
        return p10.r(motionEvent, z31Var, nVar, qyVar.h2, qyVar.a2);
    }

    @Override // org.telegram.ui.Components.g41
    public final void f(TLRPC.Document document, Object obj, boolean z10, int i7) {
        this.b.u1.m(null, document, null, obj, null, z10, i7);
    }

    @Override // org.telegram.ui.Components.g41
    public final void g(TLRPC.StickerSetCovered stickerSetCovered, boolean z10) {
        qy qyVar = this.b;
        qyVar.u1.r(stickerSetCovered);
        if (z10) {
            qyVar.Y(true);
        }
    }

    @Override // org.telegram.ui.Components.g41
    public final void h(TLRPC.StickerSetCovered stickerSetCovered) {
        this.b.u1.h(stickerSetCovered);
    }

    @Override // org.telegram.ui.Components.g41
    public final void i(String[] strArr) {
        this.b.X0 = strArr;
    }
}
