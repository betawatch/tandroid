package org.telegram.ui.Components;

import android.text.Editable;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
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
