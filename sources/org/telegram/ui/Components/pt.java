package org.telegram.ui.Components;

import android.text.Editable;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class pt implements Utilities.Callback {
    public final /* synthetic */ ut a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;

    public /* synthetic */ pt(ut utVar, int i10, int i11) {
        this.a = utVar;
        this.b = i10;
        this.c = i11;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        CharSequence charSequence = (CharSequence) obj;
        ut utVar = this.a;
        Editable text = utVar.getText();
        int i10 = this.b;
        text.replace(i10, this.c, charSequence);
        utVar.setSelection(i10, charSequence.length() + i10);
    }
}
