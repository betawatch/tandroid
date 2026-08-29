package org.telegram.ui.Components;

import android.view.MotionEvent;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class yw extends p41 {
    public final /* synthetic */ fz b;

    public yw(fz fzVar) {
        this.b = fzVar;
    }

    @Override // org.telegram.ui.Components.p41
    public final boolean a() {
        return this.b.p1.b();
    }

    @Override // org.telegram.ui.Components.p41
    public final String[] b() {
        return this.b.S0;
    }

    @Override // org.telegram.ui.Components.p41
    public final boolean c() {
        return this.b.p1.c();
    }

    @Override // org.telegram.ui.Components.p41
    public final boolean d(i41 i41Var, MotionEvent motionEvent) {
        org.telegram.ui.ht q6 = org.telegram.ui.ht.q();
        fz fzVar = this.b;
        fzVar.getMeasuredHeight();
        return q6.r(motionEvent, i41Var, fzVar.c2, fzVar.V1);
    }

    @Override // org.telegram.ui.Components.p41
    public final boolean e(i41 i41Var, k kVar, MotionEvent motionEvent) {
        org.telegram.ui.ht q6 = org.telegram.ui.ht.q();
        fz fzVar = this.b;
        fzVar.getMeasuredHeight();
        return q6.s(motionEvent, i41Var, kVar, fzVar.c2, fzVar.V1);
    }

    @Override // org.telegram.ui.Components.p41
    public final void f(TLRPC.Document document, Object obj, boolean z10, int i10) {
        this.b.p1.m(null, document, null, obj, null, z10, i10);
    }

    @Override // org.telegram.ui.Components.p41
    public final void g(TLRPC.StickerSetCovered stickerSetCovered, boolean z10) {
        fz fzVar = this.b;
        fzVar.p1.r(stickerSetCovered);
        if (z10) {
            fzVar.Z(true);
        }
    }

    @Override // org.telegram.ui.Components.p41
    public final void h(TLRPC.StickerSetCovered stickerSetCovered) {
        this.b.p1.h(stickerSetCovered);
    }

    @Override // org.telegram.ui.Components.p41
    public final void i(String[] strArr) {
        this.b.S0 = strArr;
    }
}
