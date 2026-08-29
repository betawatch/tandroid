package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.pc1;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class to implements pc1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ni b;
    public final /* synthetic */ org.telegram.ui.x3 c;

    public /* synthetic */ to(ni niVar, org.telegram.ui.x3 x3Var, int i10) {
        this.a = i10;
        this.b = niVar;
        this.c = x3Var;
    }

    @Override // org.telegram.ui.pc1
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
