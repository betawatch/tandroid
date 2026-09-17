package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.vd1;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class yo implements vd1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ vi b;
    public final /* synthetic */ org.telegram.ui.t3 c;

    public /* synthetic */ yo(vi viVar, org.telegram.ui.t3 t3Var, int i10) {
        this.a = i10;
        this.b = viVar;
        this.c = t3Var;
    }

    @Override // org.telegram.ui.vd1
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
