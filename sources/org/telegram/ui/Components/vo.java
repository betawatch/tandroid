package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.id1;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class vo implements id1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ li b;
    public final /* synthetic */ org.telegram.ui.y3 c;

    public /* synthetic */ vo(li liVar, org.telegram.ui.y3 y3Var, int i10) {
        this.a = i10;
        this.b = liVar;
        this.c = y3Var;
    }

    @Override // org.telegram.ui.id1
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
