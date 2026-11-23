package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class oj extends org.telegram.ui.Components.so {
    public final /* synthetic */ bn f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oj(bn bnVar, Context context) {
        super(context);
        this.f = bnVar;
    }

    @Override // org.telegram.ui.Components.so
    public final void a(boolean z10) {
        bn bnVar = this.f;
        bnVar.I7();
        bnVar.G7();
        bnVar.J7();
        bnVar.K7();
        ik ikVar = bnVar.Bb;
        if (ikVar != null) {
            ikVar.setTranslationY(bnVar.T9 + getCurrentHeight());
        }
        if (!z10) {
            bnVar.M9();
        } else {
            bnVar.aa = true;
            bnVar.Rc();
        }
    }
}
