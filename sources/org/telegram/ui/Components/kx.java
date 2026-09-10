package org.telegram.ui.Components;

import android.view.MotionEvent;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class kx extends o51 {
    public final /* synthetic */ rz b;

    public kx(rz rzVar) {
        this.b = rzVar;
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
        org.telegram.ui.tt q6 = org.telegram.ui.tt.q();
        rz rzVar = this.b;
        rzVar.getMeasuredHeight();
        return q6.r(motionEvent, h51Var, rzVar.g2, rzVar.Z1);
    }

    @Override // org.telegram.ui.Components.o51
    public final boolean e(h51 h51Var, k kVar, MotionEvent motionEvent) {
        org.telegram.ui.tt q6 = org.telegram.ui.tt.q();
        rz rzVar = this.b;
        rzVar.getMeasuredHeight();
        return q6.s(motionEvent, h51Var, kVar, rzVar.g2, rzVar.Z1);
    }

    @Override // org.telegram.ui.Components.o51
    public final void f(TLRPC.Document document, Object obj, boolean z10, int i10) {
        this.b.t1.m(null, document, null, obj, null, z10, i10);
    }

    @Override // org.telegram.ui.Components.o51
    public final void g(TLRPC.StickerSetCovered stickerSetCovered, boolean z10) {
        rz rzVar = this.b;
        rzVar.t1.r(stickerSetCovered);
        if (z10) {
            rzVar.Z(true);
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
