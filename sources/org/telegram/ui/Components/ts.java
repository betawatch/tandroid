package org.telegram.ui.Components;

import android.text.Editable;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ts implements org.telegram.messenger.u10 {
    public final /* synthetic */ xs a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;

    public /* synthetic */ ts(xs xsVar, int i3, int i10) {
        this.a = xsVar;
        this.b = i3;
        this.c = i10;
    }

    @Override // org.telegram.messenger.u10
    public final void a(Object obj) {
        CharSequence charSequence = (CharSequence) obj;
        xs xsVar = this.a;
        Editable text = xsVar.getText();
        int i3 = this.b;
        text.replace(i3, this.c, charSequence);
        xsVar.setSelection(i3, charSequence.length() + i3);
    }
}
