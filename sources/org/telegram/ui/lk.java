package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class lk extends org.telegram.ui.Components.jp {
    public final /* synthetic */ zn f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lk(zn znVar, Context context) {
        super(context);
        this.f = znVar;
    }

    @Override // org.telegram.ui.Components.jp
    public final void a(boolean z10) {
        zn znVar = this.f;
        znVar.w7();
        znVar.u7();
        znVar.x7();
        znVar.y7();
        el elVar = znVar.bb;
        if (elVar != null) {
            elVar.setTranslationY(znVar.w9 + getCurrentHeight());
        }
        if (!z10) {
            znVar.t9();
        } else {
            znVar.D9 = true;
            znVar.nc();
        }
    }
}
