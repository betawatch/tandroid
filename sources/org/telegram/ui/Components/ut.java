package org.telegram.ui.Components;

import android.text.Editable;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
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
