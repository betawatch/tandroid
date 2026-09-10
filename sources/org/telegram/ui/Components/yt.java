package org.telegram.ui.Components;

import android.text.Editable;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class yt implements Utilities.Callback {
    public final /* synthetic */ fu a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;

    public /* synthetic */ yt(fu fuVar, int i10, int i11) {
        this.a = fuVar;
        this.b = i10;
        this.c = i11;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        CharSequence charSequence = (CharSequence) obj;
        fu fuVar = this.a;
        Editable text = fuVar.getText();
        int i10 = this.b;
        text.replace(i10, this.c, charSequence);
        fuVar.setSelection(i10, charSequence.length() + i10);
    }
}
