package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class ev extends org.telegram.ui.Components.rs {
    public final /* synthetic */ bx F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ev(yw ywVar, bx bxVar) {
        super(ywVar);
        this.F = bxVar;
    }

    @Override // v4.h1
    public final void y() {
        bx bxVar = this.F;
        if (bxVar.c.L0() == 0) {
            View m10 = bxVar.c.m(0);
            if (m10 != null) {
                m10.invalidate();
            }
            if (bxVar.w == 2) {
                bxVar.w = 1;
            }
            jv jvVar = bxVar.n;
            if (jvVar != null) {
                jvVar.b();
            }
        }
    }
}
