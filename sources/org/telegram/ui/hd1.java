package org.telegram.ui;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class hd1 implements od1 {
    public boolean a;
    public final /* synthetic */ bo b;

    public hd1(bo boVar, boolean z10) {
        this.b = boVar;
        this.a = z10;
    }

    @Override // org.telegram.ui.od1
    public final boolean Y0() {
        return true;
    }

    @Override // org.telegram.ui.od1
    public final boolean a() {
        return this.a;
    }

    @Override // org.telegram.ui.od1
    public final void o1(boolean z10) {
        boolean z11 = !this.a;
        this.a = z11;
        zn znVar = this.b.ea;
        znVar.i(znVar.f, znVar.h, z10, Boolean.valueOf(z11), false);
    }
}
