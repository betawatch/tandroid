package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.zd1;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class fp implements zd1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ yi b;
    public final /* synthetic */ org.telegram.ui.u3 c;

    public /* synthetic */ fp(yi yiVar, org.telegram.ui.u3 u3Var, int i10) {
        this.a = i10;
        this.b = yiVar;
        this.c = u3Var;
    }

    @Override // org.telegram.ui.zd1
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
