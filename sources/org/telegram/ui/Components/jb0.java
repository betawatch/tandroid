package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final /* synthetic */ class jb0 implements e2.h {
    public final /* synthetic */ int a;
    public final /* synthetic */ ViewGroup b;

    public /* synthetic */ jb0(ViewGroup viewGroup, int i10) {
        this.a = i10;
        this.b = viewGroup;
    }

    @Override // e2.h
    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                ac0 ac0Var = (ac0) this.b;
                ac0Var.n.y(ac0Var.f.U((View) obj));
                break;
            default:
                u61 u61Var = (u61) this.b;
                u61Var.Y2.Q(u61Var.U((View) obj), u61Var.c3);
                break;
        }
    }
}
