package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final class ek extends org.telegram.ui.Components.dp {
    public final /* synthetic */ sn f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ek(sn snVar, Context context) {
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
        xk xkVar = snVar.bb;
        if (xkVar != null) {
            xkVar.setTranslationY(snVar.w9 + getCurrentHeight());
        }
        if (!z10) {
            snVar.t9();
        } else {
            snVar.D9 = true;
            snVar.nc();
        }
    }
}
