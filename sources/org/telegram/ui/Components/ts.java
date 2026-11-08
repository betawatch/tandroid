package org.telegram.ui.Components;

import android.text.Editable;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ts implements org.telegram.messenger.c20 {
    public final /* synthetic */ zs a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;

    public /* synthetic */ ts(zs zsVar, int i7, int i10) {
        this.a = zsVar;
        this.b = i7;
        this.c = i10;
    }

    @Override // org.telegram.messenger.c20
    public final void a(Object obj) {
        CharSequence charSequence = (CharSequence) obj;
        zs zsVar = this.a;
        Editable text = zsVar.getText();
        int i7 = this.b;
        text.replace(i7, this.c, charSequence);
        zsVar.setSelection(i7, charSequence.length() + i7);
    }
}
