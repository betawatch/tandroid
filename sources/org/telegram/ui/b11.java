package org.telegram.ui;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class b11 extends ug.b1 {
    public final /* synthetic */ c11 N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b11(c11 c11Var, Context context) {
        super(2, context, null);
        this.N = c11Var;
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        c11 c11Var = this.N;
        if (c11Var.getParent() instanceof View) {
            ((View) c11Var.getParent()).invalidate();
        }
    }
}
