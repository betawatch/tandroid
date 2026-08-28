package org.telegram.ui.Components;

import android.view.MotionEvent;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class rw extends e41 {
    public final /* synthetic */ wy b;

    public rw(wy wyVar) {
        this.b = wyVar;
    }

    @Override // org.telegram.ui.Components.e41
    public final boolean a() {
        return this.b.p1.b();
    }

    @Override // org.telegram.ui.Components.e41
    public final String[] b() {
        return this.b.S0;
    }

    @Override // org.telegram.ui.Components.e41
    public final boolean c() {
        return this.b.p1.c();
    }

    @Override // org.telegram.ui.Components.e41
    public final boolean d(x31 x31Var, MotionEvent motionEvent) {
        org.telegram.ui.ht q10 = org.telegram.ui.ht.q();
        wy wyVar = this.b;
        wyVar.getMeasuredHeight();
        return q10.r(motionEvent, x31Var, wyVar.c2, wyVar.V1);
    }

    @Override // org.telegram.ui.Components.e41
    public final boolean e(x31 x31Var, j jVar, MotionEvent motionEvent) {
        org.telegram.ui.ht q10 = org.telegram.ui.ht.q();
        wy wyVar = this.b;
        wyVar.getMeasuredHeight();
        return q10.s(motionEvent, x31Var, jVar, wyVar.c2, wyVar.V1);
    }

    @Override // org.telegram.ui.Components.e41
    public final void f(TLRPC.Document document, Object obj, boolean z10, int i9) {
        this.b.p1.m(null, document, null, obj, null, z10, i9);
    }

    @Override // org.telegram.ui.Components.e41
    public final void g(TLRPC.StickerSetCovered stickerSetCovered, boolean z10) {
        wy wyVar = this.b;
        wyVar.p1.r(stickerSetCovered);
        if (z10) {
            wyVar.Y(true);
        }
    }

    @Override // org.telegram.ui.Components.e41
    public final void h(TLRPC.StickerSetCovered stickerSetCovered) {
        this.b.p1.h(stickerSetCovered);
    }

    @Override // org.telegram.ui.Components.e41
    public final void i(String[] strArr) {
        this.b.S0 = strArr;
    }
}
