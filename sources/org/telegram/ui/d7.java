package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class d7 implements org.telegram.ui.Components.pk0 {
    public final /* synthetic */ org.telegram.ui.Components.zk0 a;
    public final /* synthetic */ e7 b;

    public d7(e7 e7Var, org.telegram.ui.Components.zk0 zk0Var) {
        this.b = e7Var;
        this.a = zk0Var;
    }

    @Override // org.telegram.ui.Components.pk0
    public final void a(int i10, View view) {
        s7 s7Var = this.b.d;
        org.telegram.ui.Components.zk0 zk0Var = this.a;
        f7 f7Var = (f7) zk0Var.getAdapter();
        m7 m7Var = (m7) f7Var.e.get(i10);
        if (view instanceof org.telegram.ui.Cells.o7) {
            s7.a(s7Var, m7Var, (o7) f7Var, zk0Var);
            return;
        }
        i7 i7Var = s7Var.v;
        if (i7Var != null) {
            i7Var.J(m7Var.c, m7Var.d, false);
        }
    }
}
