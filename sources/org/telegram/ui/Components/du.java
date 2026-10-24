package org.telegram.ui.Components;

import android.text.Editable;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
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
