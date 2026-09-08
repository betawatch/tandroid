package org.telegram.ui.Components;

import android.text.Editable;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final /* synthetic */ class st implements Utilities.Callback {
    public final /* synthetic */ zt a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;

    public /* synthetic */ st(zt ztVar, int i10, int i11) {
        this.a = ztVar;
        this.b = i10;
        this.c = i11;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        CharSequence charSequence = (CharSequence) obj;
        zt ztVar = this.a;
        Editable text = ztVar.getText();
        int i10 = this.b;
        text.replace(i10, this.c, charSequence);
        ztVar.setSelection(i10, charSequence.length() + i10);
    }
}
