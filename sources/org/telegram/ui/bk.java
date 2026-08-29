package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class bk extends org.telegram.ui.Components.no {
    public final /* synthetic */ tn f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bk(tn tnVar, Context context) {
        super(context);
        this.f = tnVar;
    }

    @Override // org.telegram.ui.Components.no
    public final void a(boolean z10) {
        tn tnVar = this.f;
        tnVar.t7();
        tnVar.r7();
        tnVar.u7();
        tnVar.v7();
        uk ukVar = tnVar.Xa;
        if (ukVar != null) {
            ukVar.setTranslationY(tnVar.s9 + getCurrentHeight());
        }
        if (!z10) {
            tnVar.o9();
        } else {
            tnVar.z9 = true;
            tnVar.jc();
        }
    }
}
