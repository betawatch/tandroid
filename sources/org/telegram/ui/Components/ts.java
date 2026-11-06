package org.telegram.ui.Components;

import android.text.Editable;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ts implements org.telegram.messenger.c20 {
    public final /* synthetic */ ys a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;

    public /* synthetic */ ts(ys ysVar, int i7, int i10) {
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
