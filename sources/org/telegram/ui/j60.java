package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class j60 extends org.telegram.ui.Components.q20 {
    public final /* synthetic */ r60 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j60(r60 r60Var, Context context, int i10) {
        super(context, i10);
        this.r = r60Var;
    }

    @Override // org.telegram.ui.Components.q20
    public final void a(org.telegram.ui.Components.x30 x30Var) {
        super.a(x30Var);
        r60.a0(this.r);
    }

    @Override // org.telegram.ui.Components.q20
    public final void b() {
        super.b();
        r60.a0(this.r);
    }

    @Override // org.telegram.ui.Components.q20
    public final void c(org.telegram.ui.Components.x30 x30Var) {
        r60 r60Var = this.r;
        if (x30Var == r60Var.X) {
            r60Var.X = null;
        }
        if (x30Var == r60Var.Y) {
            r60Var.Y = null;
        }
        super.c(x30Var);
        r60.a0(r60Var);
    }
}
