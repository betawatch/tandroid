package org.telegram.ui.Components;

import android.view.MotionEvent;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class mx extends z51 {
    public final /* synthetic */ tz b;

    public mx(tz tzVar) {
        this.b = tzVar;
    }

    @Override // org.telegram.ui.Components.z51
    public final boolean a() {
        return this.b.t1.b();
    }

    @Override // org.telegram.ui.Components.z51
    public final String[] b() {
        return this.b.W0;
    }

    @Override // org.telegram.ui.Components.z51
    public final boolean c() {
        return this.b.t1.c();
    }

    @Override // org.telegram.ui.Components.z51
    public final boolean d(s51 s51Var, MotionEvent motionEvent) {
        org.telegram.ui.et q6 = org.telegram.ui.et.q();
        tz tzVar = this.b;
        tzVar.getMeasuredHeight();
        return q6.r(motionEvent, s51Var, tzVar.g2, tzVar.Z1);
    }

    @Override // org.telegram.ui.Components.z51
    public final boolean e(s51 s51Var, j jVar, MotionEvent motionEvent) {
        org.telegram.ui.et q6 = org.telegram.ui.et.q();
        tz tzVar = this.b;
        tzVar.getMeasuredHeight();
        return q6.s(motionEvent, s51Var, jVar, tzVar.g2, tzVar.Z1);
    }

    @Override // org.telegram.ui.Components.z51
    public final void f(TLRPC.Document document, Object obj, boolean z10, int i10) {
        this.b.t1.m(null, document, null, obj, null, z10, i10);
    }

    @Override // org.telegram.ui.Components.z51
    public final void g(TLRPC.StickerSetCovered stickerSetCovered, boolean z10) {
        tz tzVar = this.b;
        tzVar.t1.r(stickerSetCovered);
        if (z10) {
            tzVar.X(true);
        }
    }

    @Override // org.telegram.ui.Components.z51
    public final void h(TLRPC.StickerSetCovered stickerSetCovered) {
        this.b.t1.h(stickerSetCovered);
    }

    @Override // org.telegram.ui.Components.z51
    public final void i(String[] strArr) {
        this.b.W0 = strArr;
    }
}
