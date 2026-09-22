package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class kk extends org.telegram.ui.Components.to {
    public final /* synthetic */ zn f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kk(zn znVar, Context context) {
        super(context);
        this.f = znVar;
    }

    @Override // org.telegram.ui.Components.to
    public final void a(boolean z10) {
        zn znVar = this.f;
        znVar.t7();
        znVar.r7();
        znVar.u7();
        znVar.v7();
        cl clVar = znVar.ab;
        if (clVar != null) {
            clVar.setTranslationY(znVar.w9 + getCurrentHeight());
        }
        if (!z10) {
            znVar.o9();
        } else {
            znVar.D9 = true;
            znVar.jc();
        }
    }
}
