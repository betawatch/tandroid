package org.telegram.ui.Components;

import android.text.Editable;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ft implements Utilities.Callback {
    public final /* synthetic */ lt a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;

    public /* synthetic */ ft(lt ltVar, int i10, int i11) {
        this.a = ltVar;
        this.b = i10;
        this.c = i11;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        CharSequence charSequence = (CharSequence) obj;
        lt ltVar = this.a;
        Editable text = ltVar.getText();
        int i10 = this.b;
        text.replace(i10, this.c, charSequence);
        ltVar.setSelection(i10, charSequence.length() + i10);
    }
}
