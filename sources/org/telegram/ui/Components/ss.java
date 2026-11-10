package org.telegram.ui.Components;

import android.text.Editable;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ss implements org.telegram.messenger.c20 {
    public final /* synthetic */ ys a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;

    public /* synthetic */ ss(ys ysVar, int i7, int i10) {
        this.a = ysVar;
        this.b = i7;
        this.c = i10;
    }

    @Override // org.telegram.messenger.c20
    public final void a(Object obj) {
        CharSequence charSequence = (CharSequence) obj;
        ys ysVar = this.a;
        Editable text = ysVar.getText();
        int i7 = this.b;
        text.replace(i7, this.c, charSequence);
        ysVar.setSelection(i7, charSequence.length() + i7);
    }
}
