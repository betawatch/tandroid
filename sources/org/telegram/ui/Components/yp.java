package org.telegram.ui.Components;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
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
