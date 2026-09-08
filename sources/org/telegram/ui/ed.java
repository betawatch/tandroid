package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final /* synthetic */ class ed implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ md b;

    public /* synthetic */ ed(md mdVar, int i10) {
        this.a = i10;
        this.b = mdVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                md.X(this.b, view);
                break;
            case 1:
                md mdVar = this.b;
                mdVar.v.o(mdVar.x != null, new dd(mdVar, 1), new r5(mdVar, 2), 0);
                mdVar.J.K(0);
                mdVar.J.N(43);
                mdVar.h.d();
                break;
            case 2:
                md mdVar2 = this.b;
                if (!mdVar2.j0) {
                    mdVar2.f0();
                    break;
                } else if (mdVar2.a0) {
                    mdVar2.a0 = false;
                    mdVar2.h0();
                    break;
                }
                break;
            default:
                md mdVar3 = this.b;
                if (!mdVar3.a0) {
                    mdVar3.a0 = true;
                    mdVar3.h0();
                    break;
                }
                break;
        }
    }
}
