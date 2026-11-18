package org.telegram.ui.Components;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class yp implements du0 {
    public final /* synthetic */ wp a;
    public final /* synthetic */ aq b;

    public yp(aq aqVar, wp wpVar) {
        this.b = aqVar;
        this.a = wpVar;
    }

    @Override // org.telegram.ui.Components.du0
    public final void k(int i7) {
        aq aqVar = this.b;
        aqVar.u1 = i7;
        aqVar.K0(true);
    }

    @Override // org.telegram.ui.Components.du0
    public final void o() {
        int measuredHeight = this.b.o1.getMeasuredHeight();
        wp wpVar = this.a;
        wpVar.z(0 - wpVar.getScrollX(), measuredHeight - wpVar.getScrollY(), false);
    }
}
