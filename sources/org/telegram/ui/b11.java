package org.telegram.ui;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
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
