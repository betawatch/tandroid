package org.telegram.ui.Components;

import android.text.Editable;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ku implements Utilities.Callback {
    public final /* synthetic */ ru a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;

    public /* synthetic */ ku(ru ruVar, int i10, int i11) {
        this.a = ruVar;
        this.b = i10;
        this.c = i11;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        CharSequence charSequence = (CharSequence) obj;
        ru ruVar = this.a;
        Editable text = ruVar.getText();
        int i10 = this.b;
        text.replace(i10, this.c, charSequence);
        ruVar.setSelection(i10, charSequence.length() + i10);
    }
}
