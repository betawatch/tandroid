package org.telegram.ui.Components;

import android.view.MotionEvent;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class gw extends u31 {
    public final /* synthetic */ ly b;

    public gw(ly lyVar) {
        this.b = lyVar;
    }

    @Override // org.telegram.ui.Components.u31
    public final boolean a() {
        return this.b.u1.b();
    }

    @Override // org.telegram.ui.Components.u31
    public final String[] b() {
        return this.b.X0;
    }

    @Override // org.telegram.ui.Components.u31
    public final boolean c() {
        return this.b.u1.c();
    }

    @Override // org.telegram.ui.Components.u31
    public final boolean d(n31 n31Var, MotionEvent motionEvent) {
        org.telegram.ui.ns p10 = org.telegram.ui.ns.p();
        ly lyVar = this.b;
        lyVar.getMeasuredHeight();
        return p10.q(motionEvent, n31Var, lyVar.h2, lyVar.a2);
    }

    @Override // org.telegram.ui.Components.u31
    public final boolean e(n31 n31Var, j jVar, MotionEvent motionEvent) {
        org.telegram.ui.ns p10 = org.telegram.ui.ns.p();
        ly lyVar = this.b;
        lyVar.getMeasuredHeight();
        return p10.r(motionEvent, n31Var, jVar, lyVar.h2, lyVar.a2);
    }

    @Override // org.telegram.ui.Components.u31
    public final void f(TLRPC.Document document, Object obj, boolean z10, int i7) {
        this.b.u1.m(null, document, null, obj, null, z10, i7);
    }

    @Override // org.telegram.ui.Components.u31
    public final void g(TLRPC.StickerSetCovered stickerSetCovered, boolean z10) {
        ly lyVar = this.b;
        lyVar.u1.r(stickerSetCovered);
        if (z10) {
            lyVar.Y(true);
        }
    }

    @Override // org.telegram.ui.Components.u31
    public final void h(TLRPC.StickerSetCovered stickerSetCovered) {
        this.b.u1.h(stickerSetCovered);
    }

    @Override // org.telegram.ui.Components.u31
    public final void i(String[] strArr) {
        this.b.X0 = strArr;
    }
}
