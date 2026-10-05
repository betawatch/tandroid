package org.telegram.ui.Components;

import android.text.Editable;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final /* synthetic */ class xt implements Utilities.Callback {
    public final /* synthetic */ eu a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;

    public /* synthetic */ xt(eu euVar, int i10, int i11) {
        this.a = euVar;
        this.b = i10;
        this.c = i11;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        CharSequence charSequence = (CharSequence) obj;
        eu euVar = this.a;
        Editable text = euVar.getText();
        int i10 = this.b;
        text.replace(i10, this.c, charSequence);
        euVar.setSelection(i10, charSequence.length() + i10);
    }
}
