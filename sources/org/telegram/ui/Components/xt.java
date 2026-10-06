package org.telegram.ui.Components;

import android.text.Editable;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
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
