package org.telegram.ui.Components;

import android.text.Editable;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class vt implements Utilities.Callback {
    public final /* synthetic */ cu a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;

    public /* synthetic */ vt(cu cuVar, int i10, int i11) {
        this.a = cuVar;
        this.b = i10;
        this.c = i11;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        CharSequence charSequence = (CharSequence) obj;
        cu cuVar = this.a;
        Editable text = cuVar.getText();
        int i10 = this.b;
        text.replace(i10, this.c, charSequence);
        cuVar.setSelection(i10, charSequence.length() + i10);
    }
}
