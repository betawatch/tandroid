package org.telegram.ui.Components;

import android.text.Editable;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
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
