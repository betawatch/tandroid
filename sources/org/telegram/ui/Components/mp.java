package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.lc1;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final /* synthetic */ class mp implements lc1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ np b;

    public /* synthetic */ mp(np npVar, int i10) {
        this.a = i10;
        this.b = npVar;
    }

    @Override // org.telegram.ui.lc1
    public final void a(TLRPC.TL_wallPaper tL_wallPaper) {
        switch (this.a) {
            case 0:
                wp wpVar = this.b.a;
                wpVar.Y.dismissInternal();
                wpVar.dismiss();
                break;
            default:
                wp wpVar2 = this.b.a;
                wpVar2.Y.dismissInternal();
                wpVar2.dismiss();
                break;
        }
    }
}
