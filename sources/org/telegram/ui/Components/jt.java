package org.telegram.ui.Components;

import android.text.Editable;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final /* synthetic */ class jt implements org.telegram.messenger.y10 {
    public final /* synthetic */ ot a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;

    public /* synthetic */ jt(ot otVar, int i7, int i10) {
        this.a = otVar;
        this.b = i7;
        this.c = i10;
    }

    @Override // org.telegram.messenger.y10
    public final void a(Object obj) {
        CharSequence charSequence = (CharSequence) obj;
        ot otVar = this.a;
        Editable text = otVar.getText();
        int i7 = this.b;
        text.replace(i7, this.c, charSequence);
        otVar.setSelection(i7, charSequence.length() + i7);
    }
}
