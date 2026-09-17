package org.telegram.ui.Components;

import android.text.Editable;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
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
