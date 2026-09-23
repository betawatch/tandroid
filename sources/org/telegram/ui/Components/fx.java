package org.telegram.ui.Components;

import android.view.MotionEvent;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class fx extends a51 {
    public final /* synthetic */ lz b;

    public fx(lz lzVar) {
        this.b = lzVar;
    }

    @Override // org.telegram.ui.Components.a51
    public final boolean a() {
        return this.b.t1.b();
    }

    @Override // org.telegram.ui.Components.a51
    public final String[] b() {
        return this.b.W0;
    }

    @Override // org.telegram.ui.Components.a51
    public final boolean c() {
        return this.b.t1.c();
    }

    @Override // org.telegram.ui.Components.a51
    public final boolean d(t41 t41Var, MotionEvent motionEvent) {
        org.telegram.ui.pt q6 = org.telegram.ui.pt.q();
        lz lzVar = this.b;
        lzVar.getMeasuredHeight();
        return q6.r(motionEvent, t41Var, lzVar.g2, lzVar.Z1);
    }

    @Override // org.telegram.ui.Components.a51
    public final boolean e(t41 t41Var, j jVar, MotionEvent motionEvent) {
        org.telegram.ui.pt q6 = org.telegram.ui.pt.q();
        lz lzVar = this.b;
        lzVar.getMeasuredHeight();
        return q6.s(motionEvent, t41Var, jVar, lzVar.g2, lzVar.Z1);
    }

    @Override // org.telegram.ui.Components.a51
    public final void f(TLRPC.Document document, Object obj, boolean z10, int i10) {
        this.b.t1.m(null, document, null, obj, null, z10, i10);
    }

    @Override // org.telegram.ui.Components.a51
    public final void g(TLRPC.StickerSetCovered stickerSetCovered, boolean z10) {
        lz lzVar = this.b;
        lzVar.t1.r(stickerSetCovered);
        if (z10) {
            lzVar.X(true);
        }
    }

    @Override // org.telegram.ui.Components.a51
    public final void h(TLRPC.StickerSetCovered stickerSetCovered) {
        this.b.t1.h(stickerSetCovered);
    }

    @Override // org.telegram.ui.Components.a51
    public final void i(String[] strArr) {
        this.b.W0 = strArr;
    }
}
