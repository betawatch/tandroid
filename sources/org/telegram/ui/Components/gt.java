package org.telegram.ui.Components;

import android.text.Editable;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class gt implements org.telegram.messenger.x10 {
    public final /* synthetic */ mt a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;

    public /* synthetic */ gt(mt mtVar, int i7, int i10) {
        this.a = mtVar;
        this.b = i7;
        this.c = i10;
    }

    @Override // org.telegram.messenger.x10
    public final void a(Object obj) {
        CharSequence charSequence = (CharSequence) obj;
        mt mtVar = this.a;
        Editable text = mtVar.getText();
        int i7 = this.b;
        text.replace(i7, this.c, charSequence);
        mtVar.setSelection(i7, charSequence.length() + i7);
    }
}
