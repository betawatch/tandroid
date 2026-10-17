package org.telegram.ui.Components;

import android.text.Editable;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final /* synthetic */ class du implements Utilities.Callback {
    public final /* synthetic */ iu a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;

    public /* synthetic */ du(iu iuVar, int i10, int i11) {
        this.a = iuVar;
        this.b = i10;
        this.c = i11;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        CharSequence charSequence = (CharSequence) obj;
        iu iuVar = this.a;
        Editable text = iuVar.getText();
        int i10 = this.b;
        text.replace(i10, this.c, charSequence);
        iuVar.setSelection(i10, charSequence.length() + i10);
    }
}
