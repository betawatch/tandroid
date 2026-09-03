package org.telegram.ui.Components;

import android.view.MotionEvent;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class ex extends a51 {
    public final /* synthetic */ mz b;

    public ex(mz mzVar) {
        this.b = mzVar;
    }

    @Override // org.telegram.ui.Components.a51
    public final boolean a() {
        return this.b.q1.b();
    }

    @Override // org.telegram.ui.Components.a51
    public final String[] b() {
        return this.b.T0;
    }

    @Override // org.telegram.ui.Components.a51
    public final boolean c() {
        return this.b.q1.c();
    }

    @Override // org.telegram.ui.Components.a51
    public final boolean d(t41 t41Var, MotionEvent motionEvent) {
        org.telegram.ui.qt q10 = org.telegram.ui.qt.q();
        mz mzVar = this.b;
        mzVar.getMeasuredHeight();
        return q10.r(motionEvent, t41Var, mzVar.d2, mzVar.W1);
    }

    @Override // org.telegram.ui.Components.a51
    public final boolean e(t41 t41Var, k kVar, MotionEvent motionEvent) {
        org.telegram.ui.qt q10 = org.telegram.ui.qt.q();
        mz mzVar = this.b;
        mzVar.getMeasuredHeight();
        return q10.s(motionEvent, t41Var, kVar, mzVar.d2, mzVar.W1);
    }

    @Override // org.telegram.ui.Components.a51
    public final void f(TLRPC.Document document, Object obj, boolean z4, int i10) {
        this.b.q1.m(null, document, null, obj, null, z4, i10);
    }

    @Override // org.telegram.ui.Components.a51
    public final void g(TLRPC.StickerSetCovered stickerSetCovered, boolean z4) {
        mz mzVar = this.b;
        mzVar.q1.r(stickerSetCovered);
        if (z4) {
            mzVar.Z(true);
        }
    }

    @Override // org.telegram.ui.Components.a51
    public final void h(TLRPC.StickerSetCovered stickerSetCovered) {
        this.b.q1.h(stickerSetCovered);
    }

    @Override // org.telegram.ui.Components.a51
    public final void i(String[] strArr) {
        this.b.T0 = strArr;
    }
}
