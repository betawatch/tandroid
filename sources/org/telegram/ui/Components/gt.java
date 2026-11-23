package org.telegram.ui.Components;

import android.text.Editable;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class gt implements org.telegram.messenger.w10 {
    public final /* synthetic */ mt a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;

    public /* synthetic */ gt(mt mtVar, int i7, int i10) {
        this.a = mtVar;
        this.b = i7;
        this.c = i10;
    }

    @Override // org.telegram.messenger.w10
    public final void a(Object obj) {
        CharSequence charSequence = (CharSequence) obj;
        mt mtVar = this.a;
        Editable text = mtVar.getText();
        int i7 = this.b;
        text.replace(i7, this.c, charSequence);
        mtVar.setSelection(i7, charSequence.length() + i7);
    }
}
