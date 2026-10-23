package org.telegram.ui.Components;

import android.view.MotionEvent;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes3.dex */
public final class mx extends a61 {
    public final /* synthetic */ tz b;

    public mx(tz tzVar) {
        this.b = tzVar;
    }

    @Override // org.telegram.ui.Components.a61
    public final boolean a() {
        return this.b.t1.b();
    }

    @Override // org.telegram.ui.Components.a61
    public final String[] b() {
        return this.b.W0;
    }

    @Override // org.telegram.ui.Components.a61
    public final boolean c() {
        return this.b.t1.c();
    }

    @Override // org.telegram.ui.Components.a61
    public final boolean d(t51 t51Var, MotionEvent motionEvent) {
        org.telegram.ui.et q6 = org.telegram.ui.et.q();
        tz tzVar = this.b;
        tzVar.getMeasuredHeight();
        return q6.r(motionEvent, t51Var, tzVar.g2, tzVar.Z1);
    }

    @Override // org.telegram.ui.Components.a61
    public final boolean e(t51 t51Var, j jVar, MotionEvent motionEvent) {
        org.telegram.ui.et q6 = org.telegram.ui.et.q();
        tz tzVar = this.b;
        tzVar.getMeasuredHeight();
        return q6.s(motionEvent, t51Var, jVar, tzVar.g2, tzVar.Z1);
    }

    @Override // org.telegram.ui.Components.a61
    public final void f(TLRPC.Document document, Object obj, boolean z10, int i10) {
        this.b.t1.m(null, document, null, obj, null, z10, i10);
    }

    @Override // org.telegram.ui.Components.a61
    public final void g(TLRPC.StickerSetCovered stickerSetCovered, boolean z10) {
        tz tzVar = this.b;
        tzVar.t1.r(stickerSetCovered);
        if (z10) {
            tzVar.X(true);
        }
    }

    @Override // org.telegram.ui.Components.a61
    public final void h(TLRPC.StickerSetCovered stickerSetCovered) {
        this.b.t1.h(stickerSetCovered);
    }

    @Override // org.telegram.ui.Components.a61
    public final void i(String[] strArr) {
        this.b.W0 = strArr;
    }
}
