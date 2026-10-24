package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.pc1;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final /* synthetic */ class kp implements pc1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ti b;
    public final /* synthetic */ org.telegram.ui.fc c;

    public /* synthetic */ kp(ti tiVar, org.telegram.ui.fc fcVar, int i10) {
        this.a = i10;
        this.b = tiVar;
        this.c = fcVar;
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
