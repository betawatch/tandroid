package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final class f60 extends org.telegram.ui.Components.o20 {
    public final /* synthetic */ n60 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f60(n60 n60Var, Context context, int i10) {
        super(context, i10);
        this.r = n60Var;
    }

    @Override // org.telegram.ui.Components.o20
    public final void a(org.telegram.ui.Components.v30 v30Var) {
        super.a(v30Var);
        n60.Z(this.r);
    }

    @Override // org.telegram.ui.Components.o20
    public final void b() {
        super.b();
        n60.Z(this.r);
    }

    @Override // org.telegram.ui.Components.o20
    public final void c(org.telegram.ui.Components.v30 v30Var) {
        n60 n60Var = this.r;
        if (v30Var == n60Var.X) {
            n60Var.X = null;
        }
        if (v30Var == n60Var.Y) {
            n60Var.Y = null;
        }
        super.c(v30Var);
        n60.Z(n60Var);
    }
}
