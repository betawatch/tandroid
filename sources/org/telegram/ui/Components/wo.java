package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.bd1;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class wo implements bd1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ li b;
    public final /* synthetic */ org.telegram.ui.w3 c;

    public /* synthetic */ wo(li liVar, org.telegram.ui.w3 w3Var, int i10) {
        this.a = i10;
        this.b = liVar;
        this.c = w3Var;
    }

    @Override // org.telegram.ui.bd1
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
