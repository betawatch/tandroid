package org.telegram.ui.Components;

import android.text.Editable;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class qt implements Utilities.Callback {
    public final /* synthetic */ vt a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;

    public /* synthetic */ qt(vt vtVar, int i10, int i11) {
        this.a = vtVar;
        this.b = i10;
        this.c = i11;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        CharSequence charSequence = (CharSequence) obj;
        vt vtVar = this.a;
        Editable text = vtVar.getText();
        int i10 = this.b;
        text.replace(i10, this.c, charSequence);
        vtVar.setSelection(i10, charSequence.length() + i10);
    }
}
