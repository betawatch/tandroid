package org.telegram.ui.Components;

import android.view.MotionEvent;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class ex extends c51 {
    public final /* synthetic */ kz b;

    public ex(kz kzVar) {
        this.b = kzVar;
    }

    @Override // org.telegram.ui.Components.c51
    public final boolean a() {
        return this.b.t1.b();
    }

    @Override // org.telegram.ui.Components.c51
    public final String[] b() {
        return this.b.W0;
    }

    @Override // org.telegram.ui.Components.c51
    public final boolean c() {
        return this.b.t1.c();
    }

    @Override // org.telegram.ui.Components.c51
    public final boolean d(v41 v41Var, MotionEvent motionEvent) {
        org.telegram.ui.ut q6 = org.telegram.ui.ut.q();
        kz kzVar = this.b;
        kzVar.getMeasuredHeight();
        return q6.r(motionEvent, v41Var, kzVar.g2, kzVar.Z1);
    }

    @Override // org.telegram.ui.Components.c51
    public final boolean e(v41 v41Var, j jVar, MotionEvent motionEvent) {
        org.telegram.ui.ut q6 = org.telegram.ui.ut.q();
        kz kzVar = this.b;
        kzVar.getMeasuredHeight();
        return q6.s(motionEvent, v41Var, jVar, kzVar.g2, kzVar.Z1);
    }

    @Override // org.telegram.ui.Components.c51
    public final void f(TLRPC.Document document, Object obj, boolean z10, int i10) {
        this.b.t1.m(null, document, null, obj, null, z10, i10);
    }

    @Override // org.telegram.ui.Components.c51
    public final void g(TLRPC.StickerSetCovered stickerSetCovered, boolean z10) {
        kz kzVar = this.b;
        kzVar.t1.r(stickerSetCovered);
        if (z10) {
            kzVar.X(true);
        }
    }

    @Override // org.telegram.ui.Components.c51
    public final void h(TLRPC.StickerSetCovered stickerSetCovered) {
        this.b.t1.h(stickerSetCovered);
    }

    @Override // org.telegram.ui.Components.c51
    public final void i(String[] strArr) {
        this.b.W0 = strArr;
    }
}
