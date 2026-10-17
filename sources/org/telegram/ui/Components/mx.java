package org.telegram.ui.Components;

import android.view.MotionEvent;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final class mx extends y51 {
    public final /* synthetic */ tz b;

    public mx(tz tzVar) {
        this.b = tzVar;
    }

    @Override // org.telegram.ui.Components.y51
    public final boolean a() {
        return this.b.t1.b();
    }

    @Override // org.telegram.ui.Components.y51
    public final String[] b() {
        return this.b.W0;
    }

    @Override // org.telegram.ui.Components.y51
    public final boolean c() {
        return this.b.t1.c();
    }

    @Override // org.telegram.ui.Components.y51
    public final boolean d(r51 r51Var, MotionEvent motionEvent) {
        org.telegram.ui.gt q6 = org.telegram.ui.gt.q();
        tz tzVar = this.b;
        tzVar.getMeasuredHeight();
        return q6.r(motionEvent, r51Var, tzVar.g2, tzVar.Z1);
    }

    @Override // org.telegram.ui.Components.y51
    public final boolean e(r51 r51Var, j jVar, MotionEvent motionEvent) {
        org.telegram.ui.gt q6 = org.telegram.ui.gt.q();
        tz tzVar = this.b;
        tzVar.getMeasuredHeight();
        return q6.s(motionEvent, r51Var, jVar, tzVar.g2, tzVar.Z1);
    }

    @Override // org.telegram.ui.Components.y51
    public final void f(TLRPC.Document document, Object obj, boolean z10, int i10) {
        this.b.t1.m(null, document, null, obj, null, z10, i10);
    }

    @Override // org.telegram.ui.Components.y51
    public final void g(TLRPC.StickerSetCovered stickerSetCovered, boolean z10) {
        tz tzVar = this.b;
        tzVar.t1.r(stickerSetCovered);
        if (z10) {
            tzVar.X(true);
        }
    }

    @Override // org.telegram.ui.Components.y51
    public final void h(TLRPC.StickerSetCovered stickerSetCovered) {
        this.b.t1.h(stickerSetCovered);
    }

    @Override // org.telegram.ui.Components.y51
    public final void i(String[] strArr) {
        this.b.W0 = strArr;
    }
}
