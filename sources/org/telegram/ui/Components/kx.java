package org.telegram.ui.Components;

import android.view.MotionEvent;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class kx extends m61 {
    public final /* synthetic */ sz b;

    public kx(sz szVar) {
        this.b = szVar;
    }

    @Override // org.telegram.ui.Components.m61
    public final boolean a() {
        return this.b.t1.b();
    }

    @Override // org.telegram.ui.Components.m61
    public final String[] b() {
        return this.b.W0;
    }

    @Override // org.telegram.ui.Components.m61
    public final boolean c() {
        return this.b.t1.c();
    }

    @Override // org.telegram.ui.Components.m61
    public final boolean d(f61 f61Var, MotionEvent motionEvent) {
        org.telegram.ui.ft o10 = org.telegram.ui.ft.o();
        sz szVar = this.b;
        szVar.getMeasuredHeight();
        return o10.p(motionEvent, f61Var, szVar.g2, szVar.Z1);
    }

    @Override // org.telegram.ui.Components.m61
    public final boolean e(f61 f61Var, j jVar, MotionEvent motionEvent) {
        org.telegram.ui.ft o10 = org.telegram.ui.ft.o();
        sz szVar = this.b;
        szVar.getMeasuredHeight();
        return o10.q(motionEvent, f61Var, jVar, szVar.g2, szVar.Z1);
    }

    @Override // org.telegram.ui.Components.m61
    public final void f(TLRPC.Document document, Object obj, boolean z10, int i10) {
        this.b.t1.m(null, document, null, obj, null, z10, i10);
    }

    @Override // org.telegram.ui.Components.m61
    public final void g(TLRPC.StickerSetCovered stickerSetCovered, boolean z10) {
        sz szVar = this.b;
        szVar.t1.r(stickerSetCovered);
        if (z10) {
            szVar.X(true);
        }
    }

    @Override // org.telegram.ui.Components.m61
    public final void h(TLRPC.StickerSetCovered stickerSetCovered) {
        this.b.t1.h(stickerSetCovered);
    }

    @Override // org.telegram.ui.Components.m61
    public final void i(String[] strArr) {
        this.b.W0 = strArr;
    }
}
