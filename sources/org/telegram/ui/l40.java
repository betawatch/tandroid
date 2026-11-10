package org.telegram.ui;

import android.app.Activity;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class l40 extends ug.i0 {
    public final /* synthetic */ m40 S2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l40(m40 m40Var, m40 m40Var2, Activity activity, int i7, int i10, org.telegram.ui.ActionBar.h6 h6Var) {
        super(i7, i10, activity, m40Var2, h6Var);
        this.S2 = m40Var;
    }

    @Override // org.telegram.ui.ActionBar.w2, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.b2
    public final void dismiss() {
        super.dismiss();
        this.S2.B0 = false;
    }

    @Override // org.telegram.ui.ActionBar.w2
    public final void v() {
        this.S2.B0 = false;
    }
}
