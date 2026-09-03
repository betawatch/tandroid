package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class jk extends org.telegram.ui.Components.oo {
    public final /* synthetic */ zn f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jk(zn znVar, Context context) {
        super(context);
        this.f = znVar;
    }

    @Override // org.telegram.ui.Components.oo
    public final void a(boolean z4) {
        zn znVar = this.f;
        znVar.t7();
        znVar.r7();
        znVar.u7();
        znVar.v7();
        cl clVar = znVar.Ya;
        if (clVar != null) {
            clVar.setTranslationY(znVar.t9 + getCurrentHeight());
        }
        if (!z4) {
            znVar.o9();
        } else {
            znVar.A9 = true;
            znVar.jc();
        }
    }
}
