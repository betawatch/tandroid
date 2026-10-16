package org.telegram.ui.Components;

import android.text.Editable;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final /* synthetic */ class hu implements Utilities.Callback {
    public final /* synthetic */ nu a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;

    public /* synthetic */ hu(nu nuVar, int i10, int i11) {
        this.a = nuVar;
        this.b = i10;
        this.c = i11;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        CharSequence charSequence = (CharSequence) obj;
        nu nuVar = this.a;
        Editable text = nuVar.getText();
        int i10 = this.b;
        text.replace(i10, this.c, charSequence);
        nuVar.setSelection(i10, charSequence.length() + i10);
    }
}
