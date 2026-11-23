package org.telegram.ui.Components;

import android.view.MotionEvent;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class ow extends h41 {
    public final /* synthetic */ ty b;

    public ow(ty tyVar) {
        this.b = tyVar;
    }

    @Override // org.telegram.ui.Components.h41
    public final boolean a() {
        return this.b.u1.b();
    }

    @Override // org.telegram.ui.Components.h41
    public final String[] b() {
        return this.b.X0;
    }

    @Override // org.telegram.ui.Components.h41
    public final boolean c() {
        return this.b.u1.c();
    }

    @Override // org.telegram.ui.Components.h41
    public final boolean d(a41 a41Var, MotionEvent motionEvent) {
        org.telegram.ui.ns p10 = org.telegram.ui.ns.p();
        ty tyVar = this.b;
        tyVar.getMeasuredHeight();
        return p10.q(motionEvent, a41Var, tyVar.h2, tyVar.a2);
    }

    @Override // org.telegram.ui.Components.h41
    public final boolean e(a41 a41Var, o oVar, MotionEvent motionEvent) {
        org.telegram.ui.ns p10 = org.telegram.ui.ns.p();
        ty tyVar = this.b;
        tyVar.getMeasuredHeight();
        return p10.r(motionEvent, a41Var, oVar, tyVar.h2, tyVar.a2);
    }

    @Override // org.telegram.ui.Components.h41
    public final void f(TLRPC.Document document, Object obj, boolean z10, int i7) {
        this.b.u1.m(null, document, null, obj, null, z10, i7);
    }

    @Override // org.telegram.ui.Components.h41
    public final void g(TLRPC.StickerSetCovered stickerSetCovered, boolean z10) {
        ty tyVar = this.b;
        tyVar.u1.r(stickerSetCovered);
        if (z10) {
            tyVar.Y(true);
        }
    }

    @Override // org.telegram.ui.Components.h41
    public final void h(TLRPC.StickerSetCovered stickerSetCovered) {
        this.b.u1.h(stickerSetCovered);
    }

    @Override // org.telegram.ui.Components.h41
    public final void i(String[] strArr) {
        this.b.X0 = strArr;
    }
}
