package org.telegram.ui.Components;

import android.text.Editable;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
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
