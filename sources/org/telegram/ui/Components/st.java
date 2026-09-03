package org.telegram.ui.Components;

import android.text.Editable;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class st implements Utilities.Callback {
    public final /* synthetic */ xt a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;

    public /* synthetic */ st(xt xtVar, int i10, int i11) {
        this.a = xtVar;
        this.b = i10;
        this.c = i11;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        CharSequence charSequence = (CharSequence) obj;
        xt xtVar = this.a;
        Editable text = xtVar.getText();
        int i10 = this.b;
        text.replace(i10, this.c, charSequence);
        xtVar.setSelection(i10, charSequence.length() + i10);
    }
}
