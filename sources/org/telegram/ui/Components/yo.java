package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.vd1;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final /* synthetic */ class yo implements vd1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ vi b;
    public final /* synthetic */ org.telegram.ui.t3 c;

    public /* synthetic */ yo(vi viVar, org.telegram.ui.t3 t3Var, int i10) {
        this.a = i10;
        this.b = viVar;
        this.c = t3Var;
    }

    @Override // org.telegram.ui.vd1
    public final void a(TLRPC.TL_wallPaper tL_wallPaper) {
        switch (this.a) {
            case 0:
                this.b.dismissInternal();
                this.c.run(tL_wallPaper);
                break;
            default:
                this.b.dismissInternal();
                this.c.run(tL_wallPaper);
                break;
        }
    }
}
