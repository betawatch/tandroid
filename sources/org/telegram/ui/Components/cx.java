package org.telegram.ui.Components;

import android.view.MotionEvent;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class cx extends b51 {
    public final /* synthetic */ kz b;

    public cx(kz kzVar) {
        this.b = kzVar;
    }

    @Override // org.telegram.ui.Components.b51
    public final boolean a() {
        return this.b.q1.b();
    }

    @Override // org.telegram.ui.Components.b51
    public final String[] b() {
        return this.b.T0;
    }

    @Override // org.telegram.ui.Components.b51
    public final boolean c() {
        return this.b.q1.c();
    }

    @Override // org.telegram.ui.Components.b51
    public final boolean d(u41 u41Var, MotionEvent motionEvent) {
        org.telegram.ui.rt q10 = org.telegram.ui.rt.q();
        kz kzVar = this.b;
        kzVar.getMeasuredHeight();
        return q10.r(motionEvent, u41Var, kzVar.d2, kzVar.W1);
    }

    @Override // org.telegram.ui.Components.b51
    public final boolean e(u41 u41Var, k kVar, MotionEvent motionEvent) {
        org.telegram.ui.rt q10 = org.telegram.ui.rt.q();
        kz kzVar = this.b;
        kzVar.getMeasuredHeight();
        return q10.s(motionEvent, u41Var, kVar, kzVar.d2, kzVar.W1);
    }

    @Override // org.telegram.ui.Components.b51
    public final void f(TLRPC.Document document, Object obj, boolean z4, int i10) {
        this.b.q1.m(null, document, null, obj, null, z4, i10);
    }

    @Override // org.telegram.ui.Components.b51
    public final void g(TLRPC.StickerSetCovered stickerSetCovered, boolean z4) {
        kz kzVar = this.b;
        kzVar.q1.r(stickerSetCovered);
        if (z4) {
            kzVar.Z(true);
        }
    }

    @Override // org.telegram.ui.Components.b51
    public final void h(TLRPC.StickerSetCovered stickerSetCovered) {
        this.b.q1.h(stickerSetCovered);
    }

    @Override // org.telegram.ui.Components.b51
    public final void i(String[] strArr) {
        this.b.T0 = strArr;
    }
}
