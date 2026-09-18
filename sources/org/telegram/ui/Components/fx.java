package org.telegram.ui.Components;

import android.view.MotionEvent;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes3.dex */
public final class fx extends q51 {
    public final /* synthetic */ kz b;

    public fx(kz kzVar) {
        this.b = kzVar;
    }

    @Override // org.telegram.ui.Components.q51
    public final boolean a() {
        return this.b.t1.b();
    }

    @Override // org.telegram.ui.Components.q51
    public final String[] b() {
        return this.b.W0;
    }

    @Override // org.telegram.ui.Components.q51
    public final boolean c() {
        return this.b.t1.c();
    }

    @Override // org.telegram.ui.Components.q51
    public final boolean d(j51 j51Var, MotionEvent motionEvent) {
        org.telegram.ui.st q6 = org.telegram.ui.st.q();
        kz kzVar = this.b;
        kzVar.getMeasuredHeight();
        return q6.r(motionEvent, j51Var, kzVar.g2, kzVar.Z1);
    }

    @Override // org.telegram.ui.Components.q51
    public final boolean e(j51 j51Var, j jVar, MotionEvent motionEvent) {
        org.telegram.ui.st q6 = org.telegram.ui.st.q();
        kz kzVar = this.b;
        kzVar.getMeasuredHeight();
        return q6.s(motionEvent, j51Var, jVar, kzVar.g2, kzVar.Z1);
    }

    @Override // org.telegram.ui.Components.q51
    public final void f(TLRPC.Document document, Object obj, boolean z10, int i10) {
        this.b.t1.m(null, document, null, obj, null, z10, i10);
    }

    @Override // org.telegram.ui.Components.q51
    public final void g(TLRPC.StickerSetCovered stickerSetCovered, boolean z10) {
        kz kzVar = this.b;
        kzVar.t1.r(stickerSetCovered);
        if (z10) {
            kzVar.X(true);
        }
    }

    @Override // org.telegram.ui.Components.q51
    public final void h(TLRPC.StickerSetCovered stickerSetCovered) {
        this.b.t1.h(stickerSetCovered);
    }

    @Override // org.telegram.ui.Components.q51
    public final void i(String[] strArr) {
        this.b.W0 = strArr;
    }
}
