package org.telegram.ui.Components;

import android.text.Editable;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
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
