package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes3.dex */
public final class dw extends org.telegram.ui.Components.kt {
    public final /* synthetic */ ay E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dw(xx xxVar, ay ayVar) {
        super(xxVar);
        this.E = ayVar;
    }

    @Override // s4.e1
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
            iw iwVar = ayVar.n;
            if (iwVar != null) {
                iwVar.b();
            }
        }
    }
}
