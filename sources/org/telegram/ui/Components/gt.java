package org.telegram.ui.Components;

import android.text.Editable;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class gt implements Utilities.Callback {
    public final /* synthetic */ mt a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;

    public /* synthetic */ gt(mt mtVar, int i9, int i10) {
        this.a = mtVar;
        this.b = i9;
        this.c = i10;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        CharSequence charSequence = (CharSequence) obj;
        mt mtVar = this.a;
        Editable text = mtVar.getText();
        int i9 = this.b;
        text.replace(i9, this.c, charSequence);
        mtVar.setSelection(i9, charSequence.length() + i9);
    }
}
