package org.telegram.ui.Components;

import android.text.Editable;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final /* synthetic */ class hu implements Utilities.Callback {
    public final /* synthetic */ nu a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;

    public /* synthetic */ hu(nu nuVar, int i10, int i11) {
        this.a = nuVar;
        this.b = i10;
        this.c = i11;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        CharSequence charSequence = (CharSequence) obj;
        nu nuVar = this.a;
        Editable text = nuVar.getText();
        int i10 = this.b;
        text.replace(i10, this.c, charSequence);
        nuVar.setSelection(i10, charSequence.length() + i10);
    }
}
