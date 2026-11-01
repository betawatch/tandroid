package org.telegram.ui.Components;

import android.text.Editable;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class gt implements org.telegram.messenger.r20 {
    public final /* synthetic */ mt a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;

    public /* synthetic */ gt(mt mtVar, int i10, int i11) {
        this.a = mtVar;
        this.b = i10;
        this.c = i11;
    }

    @Override // org.telegram.messenger.r20
    public final void a(Object obj) {
        CharSequence charSequence = (CharSequence) obj;
        mt mtVar = this.a;
        Editable text = mtVar.getText();
        int i10 = this.b;
        text.replace(i10, this.c, charSequence);
        mtVar.setSelection(i10, charSequence.length() + i10);
    }
}
