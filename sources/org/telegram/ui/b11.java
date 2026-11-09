package org.telegram.ui;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class b11 extends ug.z0 {
    public final /* synthetic */ c11 M;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b11(c11 c11Var, Context context) {
        super(2, context, null);
        this.M = c11Var;
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        c11 c11Var = this.M;
        if (c11Var.getParent() instanceof View) {
            ((View) c11Var.getParent()).invalidate();
        }
    }
}
