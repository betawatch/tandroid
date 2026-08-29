package org.telegram.ui.Components;

import android.text.Editable;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class nt implements Utilities.Callback {
    public final /* synthetic */ st a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;

    public /* synthetic */ nt(st stVar, int i10, int i11) {
        this.a = stVar;
        this.b = i10;
        this.c = i11;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        CharSequence charSequence = (CharSequence) obj;
        st stVar = this.a;
        Editable text = stVar.getText();
        int i10 = this.b;
        text.replace(i10, this.c, charSequence);
        stVar.setSelection(i10, charSequence.length() + i10);
    }
}
