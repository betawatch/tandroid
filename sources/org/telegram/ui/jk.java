package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final class jk extends org.telegram.ui.Components.to {
    public final /* synthetic */ zn f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jk(zn znVar, Context context) {
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
        bl blVar = znVar.ab;
        if (blVar != null) {
            blVar.setTranslationY(znVar.w9 + getCurrentHeight());
        }
        if (!z10) {
            znVar.o9();
        } else {
            znVar.D9 = true;
            znVar.jc();
        }
    }
}
