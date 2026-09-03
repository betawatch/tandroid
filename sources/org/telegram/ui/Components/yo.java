package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.id1;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class yo implements id1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ mi b;
    public final /* synthetic */ org.telegram.ui.w3 c;

    public /* synthetic */ yo(mi miVar, org.telegram.ui.w3 w3Var, int i10) {
        this.a = i10;
        this.b = miVar;
        this.c = w3Var;
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
