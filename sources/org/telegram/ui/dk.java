package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final class dk extends org.telegram.ui.Components.dp {
    public final /* synthetic */ sn f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dk(sn snVar, Context context) {
        super(context);
        this.f = snVar;
    }

    @Override // org.telegram.ui.Components.dp
    public final void a(boolean z10) {
        sn snVar = this.f;
        snVar.w7();
        snVar.u7();
        snVar.x7();
        snVar.y7();
        wk wkVar = snVar.nb;
        if (wkVar != null) {
            wkVar.setTranslationY(snVar.I9 + getCurrentHeight());
        }
        if (!z10) {
            snVar.t9();
        } else {
            snVar.P9 = true;
            snVar.qc();
        }
    }
}
