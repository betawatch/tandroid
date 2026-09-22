package org.telegram.ui.Components;

import android.text.Editable;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final /* synthetic */ class ut implements Utilities.Callback {
    public final /* synthetic */ bu a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;

    public /* synthetic */ ut(bu buVar, int i10, int i11) {
        this.a = buVar;
        this.b = i10;
        this.c = i11;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        CharSequence charSequence = (CharSequence) obj;
        bu buVar = this.a;
        Editable text = buVar.getText();
        int i10 = this.b;
        text.replace(i10, this.c, charSequence);
        buVar.setSelection(i10, charSequence.length() + i10);
    }
}
