package org.telegram.ui.Components;

import android.text.Editable;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class eu implements Utilities.Callback {
    public final /* synthetic */ ju a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;

    public /* synthetic */ eu(ju juVar, int i10, int i11) {
        this.a = juVar;
        this.b = i10;
        this.c = i11;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        CharSequence charSequence = (CharSequence) obj;
        ju juVar = this.a;
        Editable text = juVar.getText();
        int i10 = this.b;
        text.replace(i10, this.c, charSequence);
        juVar.setSelection(i10, charSequence.length() + i10);
    }
}
