package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class kk extends org.telegram.ui.Components.lo {
    public final /* synthetic */ un f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kk(un unVar, Context context) {
        super(context);
        this.f = unVar;
    }

    @Override // org.telegram.ui.Components.lo
    public final void a(boolean z10) {
        un unVar = this.f;
        unVar.B7();
        unVar.z7();
        unVar.C7();
        unVar.D7();
        dl dlVar = unVar.wb;
        if (dlVar != null) {
            dlVar.setTranslationY(unVar.P9 + getCurrentHeight());
        }
        if (!z10) {
            unVar.A9();
        } else {
            unVar.W9 = true;
            unVar.Dc();
        }
    }
}
