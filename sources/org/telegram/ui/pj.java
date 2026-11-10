package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class pj extends org.telegram.ui.Components.bo {
    public final /* synthetic */ cn f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pj(cn cnVar, Context context) {
        super(context);
        this.f = cnVar;
    }

    @Override // org.telegram.ui.Components.bo
    public final void a(boolean z9) {
        cn cnVar = this.f;
        cnVar.I7();
        cnVar.G7();
        cnVar.J7();
        cnVar.K7();
        jk jkVar = cnVar.zb;
        if (jkVar != null) {
            jkVar.setTranslationY(cnVar.R9 + getCurrentHeight());
        }
        if (!z9) {
            cnVar.L9();
        } else {
            cnVar.Y9 = true;
            cnVar.Qc();
        }
    }
}
