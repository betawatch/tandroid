package org.telegram.ui.Components;

import android.text.Editable;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class gt implements org.telegram.messenger.q20 {
    public final /* synthetic */ mt a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;

    public /* synthetic */ gt(mt mtVar, int i10, int i11) {
        this.a = mtVar;
        this.b = i10;
        this.c = i11;
    }

    @Override // org.telegram.messenger.q20
    public final void a(Object obj) {
        CharSequence charSequence = (CharSequence) obj;
        mt mtVar = this.a;
        Editable text = mtVar.getText();
        int i10 = this.b;
        text.replace(i10, this.c, charSequence);
        mtVar.setSelection(i10, charSequence.length() + i10);
    }
}
