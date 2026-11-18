package org.telegram.ui.Components;

import android.view.MotionEvent;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class mw extends e41 {
    public final /* synthetic */ ry b;

    public mw(ry ryVar) {
        this.b = ryVar;
    }

    @Override // org.telegram.ui.Components.e41
    public final boolean a() {
        return this.b.u1.b();
    }

    @Override // org.telegram.ui.Components.e41
    public final String[] b() {
        return this.b.X0;
    }

    @Override // org.telegram.ui.Components.e41
    public final boolean c() {
        return this.b.u1.c();
    }

    @Override // org.telegram.ui.Components.e41
    public final boolean d(x31 x31Var, MotionEvent motionEvent) {
        org.telegram.ui.ns p10 = org.telegram.ui.ns.p();
        ry ryVar = this.b;
        ryVar.getMeasuredHeight();
        return p10.q(motionEvent, x31Var, ryVar.h2, ryVar.a2);
    }

    @Override // org.telegram.ui.Components.e41
    public final boolean e(x31 x31Var, n nVar, MotionEvent motionEvent) {
        org.telegram.ui.ns p10 = org.telegram.ui.ns.p();
        ry ryVar = this.b;
        ryVar.getMeasuredHeight();
        return p10.r(motionEvent, x31Var, nVar, ryVar.h2, ryVar.a2);
    }

    @Override // org.telegram.ui.Components.e41
    public final void f(TLRPC.Document document, Object obj, boolean z10, int i7) {
        this.b.u1.m(null, document, null, obj, null, z10, i7);
    }

    @Override // org.telegram.ui.Components.e41
    public final void g(TLRPC.StickerSetCovered stickerSetCovered, boolean z10) {
        ry ryVar = this.b;
        ryVar.u1.r(stickerSetCovered);
        if (z10) {
            ryVar.Y(true);
        }
    }

    @Override // org.telegram.ui.Components.e41
    public final void h(TLRPC.StickerSetCovered stickerSetCovered) {
        this.b.u1.h(stickerSetCovered);
    }

    @Override // org.telegram.ui.Components.e41
    public final void i(String[] strArr) {
        this.b.X0 = strArr;
    }
}
