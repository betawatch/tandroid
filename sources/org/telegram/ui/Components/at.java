package org.telegram.ui.Components;

import android.text.Editable;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class at implements org.telegram.messenger.z10 {
    public final /* synthetic */ ft a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;

    public /* synthetic */ at(ft ftVar, int i7, int i10) {
        this.a = ftVar;
        this.b = i7;
        this.c = i10;
    }

    @Override // org.telegram.messenger.z10
    public final void a(Object obj) {
        CharSequence charSequence = (CharSequence) obj;
        ft ftVar = this.a;
        Editable text = ftVar.getText();
        int i7 = this.b;
        text.replace(i7, this.c, charSequence);
        ftVar.setSelection(i7, charSequence.length() + i7);
    }
}
