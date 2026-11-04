package org.telegram.ui.Components;

import android.view.MotionEvent;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class zv extends k31 {
    public final /* synthetic */ ey b;

    public zv(ey eyVar) {
        this.b = eyVar;
    }

    @Override // org.telegram.ui.Components.k31
    public final boolean a() {
        return this.b.u1.b();
    }

    @Override // org.telegram.ui.Components.k31
    public final String[] b() {
        return this.b.X0;
    }

    @Override // org.telegram.ui.Components.k31
    public final boolean c() {
        return this.b.u1.c();
    }

    @Override // org.telegram.ui.Components.k31
    public final boolean d(d31 d31Var, MotionEvent motionEvent) {
        org.telegram.ui.is p10 = org.telegram.ui.is.p();
        ey eyVar = this.b;
        eyVar.getMeasuredHeight();
        return p10.q(motionEvent, d31Var, eyVar.h2, eyVar.a2);
    }

    @Override // org.telegram.ui.Components.k31
    public final boolean e(d31 d31Var, k kVar, MotionEvent motionEvent) {
        org.telegram.ui.is p10 = org.telegram.ui.is.p();
        ey eyVar = this.b;
        eyVar.getMeasuredHeight();
        return p10.r(motionEvent, d31Var, kVar, eyVar.h2, eyVar.a2);
    }

    @Override // org.telegram.ui.Components.k31
    public final void f(TLRPC.Document document, Object obj, boolean z10, int i3) {
        this.b.u1.m(null, document, null, obj, null, z10, i3);
    }

    @Override // org.telegram.ui.Components.k31
    public final void g(TLRPC.StickerSetCovered stickerSetCovered, boolean z10) {
        ey eyVar = this.b;
        eyVar.u1.r(stickerSetCovered);
        if (z10) {
            eyVar.X(true);
        }
    }

    @Override // org.telegram.ui.Components.k31
    public final void h(TLRPC.StickerSetCovered stickerSetCovered) {
        this.b.u1.h(stickerSetCovered);
    }

    @Override // org.telegram.ui.Components.k31
    public final void i(String[] strArr) {
        this.b.X0 = strArr;
    }
}
