package org.telegram.ui.Components;

import android.view.MotionEvent;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class mx extends f61 {
    public final /* synthetic */ tz b;

    public mx(tz tzVar) {
        this.b = tzVar;
    }

    @Override // org.telegram.ui.Components.f61
    public final boolean a() {
        return this.b.t1.b();
    }

    @Override // org.telegram.ui.Components.f61
    public final String[] b() {
        return this.b.W0;
    }

    @Override // org.telegram.ui.Components.f61
    public final boolean c() {
        return this.b.t1.c();
    }

    @Override // org.telegram.ui.Components.f61
    public final boolean d(y51 y51Var, MotionEvent motionEvent) {
        org.telegram.ui.ht o10 = org.telegram.ui.ht.o();
        tz tzVar = this.b;
        tzVar.getMeasuredHeight();
        return o10.p(motionEvent, y51Var, tzVar.g2, tzVar.Z1);
    }

    @Override // org.telegram.ui.Components.f61
    public final boolean e(y51 y51Var, j jVar, MotionEvent motionEvent) {
        org.telegram.ui.ht o10 = org.telegram.ui.ht.o();
        tz tzVar = this.b;
        tzVar.getMeasuredHeight();
        return o10.q(motionEvent, y51Var, jVar, tzVar.g2, tzVar.Z1);
    }

    @Override // org.telegram.ui.Components.f61
    public final void f(TLRPC.Document document, Object obj, boolean z10, int i10) {
        this.b.t1.m(null, document, null, obj, null, z10, i10);
    }

    @Override // org.telegram.ui.Components.f61
    public final void g(TLRPC.StickerSetCovered stickerSetCovered, boolean z10) {
        tz tzVar = this.b;
        tzVar.t1.r(stickerSetCovered);
        if (z10) {
            tzVar.X(true);
        }
    }

    @Override // org.telegram.ui.Components.f61
    public final void h(TLRPC.StickerSetCovered stickerSetCovered) {
        this.b.t1.h(stickerSetCovered);
    }

    @Override // org.telegram.ui.Components.f61
    public final void i(String[] strArr) {
        this.b.W0 = strArr;
    }
}
