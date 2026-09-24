package org.telegram.ui.Components;

import android.view.MotionEvent;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes3.dex */
public final class gx extends o51 {
    public final /* synthetic */ lz b;

    public gx(lz lzVar) {
        this.b = lzVar;
    }

    @Override // org.telegram.ui.Components.o51
    public final boolean a() {
        return this.b.t1.b();
    }

    @Override // org.telegram.ui.Components.o51
    public final String[] b() {
        return this.b.W0;
    }

    @Override // org.telegram.ui.Components.o51
    public final boolean c() {
        return this.b.t1.c();
    }

    @Override // org.telegram.ui.Components.o51
    public final boolean d(h51 h51Var, MotionEvent motionEvent) {
        org.telegram.ui.nt q6 = org.telegram.ui.nt.q();
        lz lzVar = this.b;
        lzVar.getMeasuredHeight();
        return q6.r(motionEvent, h51Var, lzVar.g2, lzVar.Z1);
    }

    @Override // org.telegram.ui.Components.o51
    public final boolean e(h51 h51Var, j jVar, MotionEvent motionEvent) {
        org.telegram.ui.nt q6 = org.telegram.ui.nt.q();
        lz lzVar = this.b;
        lzVar.getMeasuredHeight();
        return q6.s(motionEvent, h51Var, jVar, lzVar.g2, lzVar.Z1);
    }

    @Override // org.telegram.ui.Components.o51
    public final void f(TLRPC.Document document, Object obj, boolean z10, int i10) {
        this.b.t1.m(null, document, null, obj, null, z10, i10);
    }

    @Override // org.telegram.ui.Components.o51
    public final void g(TLRPC.StickerSetCovered stickerSetCovered, boolean z10) {
        lz lzVar = this.b;
        lzVar.t1.r(stickerSetCovered);
        if (z10) {
            lzVar.X(true);
        }
    }

    @Override // org.telegram.ui.Components.o51
    public final void h(TLRPC.StickerSetCovered stickerSetCovered) {
        this.b.t1.h(stickerSetCovered);
    }

    @Override // org.telegram.ui.Components.o51
    public final void i(String[] strArr) {
        this.b.W0 = strArr;
    }
}
