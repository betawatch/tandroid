package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class aw extends org.telegram.ui.Components.mt {
    public final /* synthetic */ ay E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aw(wx wxVar, ay ayVar) {
        super(wxVar);
        this.E = ayVar;
    }

    @Override // s4.g1
    public final void y() {
        ay ayVar = this.E;
        if (ayVar.c.L0() == 0) {
            View m10 = ayVar.c.m(0);
            if (m10 != null) {
                m10.invalidate();
            }
            if (ayVar.v == 2) {
                ayVar.v = 1;
            }
            fw fwVar = ayVar.n;
            if (fwVar != null) {
                fwVar.b();
            }
        }
    }
}
