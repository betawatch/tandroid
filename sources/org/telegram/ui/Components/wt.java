package org.telegram.ui.Components;

import android.text.Editable;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes3.dex */
public final /* synthetic */ class wt implements Utilities.Callback {
    public final /* synthetic */ du a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;

    public /* synthetic */ wt(du duVar, int i10, int i11) {
        this.a = duVar;
        this.b = i10;
        this.c = i11;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        CharSequence charSequence = (CharSequence) obj;
        du duVar = this.a;
        Editable text = duVar.getText();
        int i10 = this.b;
        text.replace(i10, this.c, charSequence);
        duVar.setSelection(i10, charSequence.length() + i10);
    }
}
