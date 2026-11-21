package org.telegram.ui.Components;

import android.content.DialogInterface;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class du implements DialogInterface.OnShowListener {
    public final /* synthetic */ iu a;

    public du(iu iuVar) {
        this.a = iuVar;
    }

    @Override // android.content.DialogInterface.OnShowListener
    public final void onShow(DialogInterface dialogInterface) {
        iu iuVar = this.a;
        z71 z71Var = iuVar.n1;
        if (iuVar.N0() && z71Var.f()) {
            z71Var.getViewTreeObserver().addOnPreDrawListener(new org.telegram.ui.ActionBar.h1(this, 2));
        }
    }
}
