package org.telegram.ui;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class a11 extends ug.c1 {
    public final /* synthetic */ b11 N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a11(b11 b11Var, Context context) {
        super(2, context, null);
        this.N = b11Var;
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        b11 b11Var = this.N;
        if (b11Var.getParent() instanceof View) {
            ((View) b11Var.getParent()).invalidate();
        }
    }
}
