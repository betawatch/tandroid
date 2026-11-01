package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
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
        unVar.F7();
        unVar.D7();
        unVar.G7();
        unVar.H7();
        dl dlVar = unVar.xb;
        if (dlVar != null) {
            dlVar.setTranslationY(unVar.P9 + getCurrentHeight());
        }
        if (!z10) {
            unVar.F9();
        } else {
            unVar.W9 = true;
            unVar.Ic();
        }
    }
}
