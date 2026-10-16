package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.be1;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final /* synthetic */ class mp implements be1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ vi b;
    public final /* synthetic */ org.telegram.ui.kc c;

    public /* synthetic */ mp(vi viVar, org.telegram.ui.kc kcVar, int i10) {
        this.a = i10;
        this.b = viVar;
        this.c = kcVar;
    }

    @Override // org.telegram.ui.be1
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
