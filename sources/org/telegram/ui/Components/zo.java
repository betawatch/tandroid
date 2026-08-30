package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.bd1;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class zo implements bd1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ap b;

    public /* synthetic */ zo(ap apVar, int i10) {
        this.a = i10;
        this.b = apVar;
    }

    @Override // org.telegram.ui.bd1
    public final void a(TLRPC.TL_wallPaper tL_wallPaper) {
        switch (this.a) {
            case 0:
                kp kpVar = this.b.a;
                kpVar.V.dismissInternal();
                kpVar.dismiss();
                break;
            default:
                kp kpVar2 = this.b.a;
                kpVar2.V.dismissInternal();
                kpVar2.dismiss();
                break;
        }
    }
}
