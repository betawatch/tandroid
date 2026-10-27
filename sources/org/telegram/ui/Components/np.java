package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.uc1;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class np implements uc1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ti b;
    public final /* synthetic */ org.telegram.ui.gc c;

    public /* synthetic */ np(ti tiVar, org.telegram.ui.gc gcVar, int i10) {
        this.a = i10;
        this.b = tiVar;
        this.c = gcVar;
    }

    @Override // org.telegram.ui.uc1
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
