package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
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
