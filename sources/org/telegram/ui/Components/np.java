package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.pc1;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final /* synthetic */ class np implements pc1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ op b;

    public /* synthetic */ np(op opVar, int i10) {
        this.a = i10;
        this.b = opVar;
    }

    @Override // org.telegram.ui.pc1
    public final void a(TLRPC.TL_wallPaper tL_wallPaper) {
        switch (this.a) {
            case 0:
                wp wpVar = this.b.a;
                wpVar.X.dismissInternal();
                wpVar.dismiss();
                break;
            default:
                wp wpVar2 = this.b.a;
                wpVar2.X.dismissInternal();
                wpVar2.dismiss();
                break;
        }
    }
}
