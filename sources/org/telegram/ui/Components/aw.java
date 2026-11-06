package org.telegram.ui.Components;

import android.view.MotionEvent;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class aw extends j31 {
    public final /* synthetic */ gy b;

    public aw(gy gyVar) {
        this.b = gyVar;
    }

    @Override // org.telegram.ui.Components.j31
    public final boolean a() {
        return this.b.t1.b();
    }

    @Override // org.telegram.ui.Components.j31
    public final String[] b() {
        return this.b.W0;
    }

    @Override // org.telegram.ui.Components.j31
    public final boolean c() {
        return this.b.t1.c();
    }

    @Override // org.telegram.ui.Components.j31
    public final boolean d(c31 c31Var, MotionEvent motionEvent) {
        org.telegram.ui.ks p10 = org.telegram.ui.ks.p();
        gy gyVar = this.b;
        gyVar.getMeasuredHeight();
        return p10.q(motionEvent, c31Var, gyVar.g2, gyVar.Z1);
    }

    @Override // org.telegram.ui.Components.j31
    public final boolean e(c31 c31Var, k kVar, MotionEvent motionEvent) {
        org.telegram.ui.ks p10 = org.telegram.ui.ks.p();
        gy gyVar = this.b;
        gyVar.getMeasuredHeight();
        return p10.r(motionEvent, c31Var, kVar, gyVar.g2, gyVar.Z1);
    }

    @Override // org.telegram.ui.Components.j31
    public final void f(TLRPC.Document document, Object obj, boolean z9, int i7) {
        this.b.t1.m(null, document, null, obj, null, z9, i7);
    }

    @Override // org.telegram.ui.Components.j31
    public final void g(TLRPC.StickerSetCovered stickerSetCovered, boolean z9) {
        gy gyVar = this.b;
        gyVar.t1.r(stickerSetCovered);
        if (z9) {
            gyVar.X(true);
        }
    }

    @Override // org.telegram.ui.Components.j31
    public final void h(TLRPC.StickerSetCovered stickerSetCovered) {
        this.b.t1.h(stickerSetCovered);
    }

    @Override // org.telegram.ui.Components.j31
    public final void i(String[] strArr) {
        this.b.W0 = strArr;
    }
}
