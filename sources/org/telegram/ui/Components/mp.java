package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.lc1;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
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
