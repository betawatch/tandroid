package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.nc1;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class po implements nc1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ki b;
    public final /* synthetic */ org.telegram.ui.w3 c;

    public /* synthetic */ po(ki kiVar, org.telegram.ui.w3 w3Var, int i9) {
        this.a = i9;
        this.b = kiVar;
        this.c = w3Var;
    }

    @Override // org.telegram.ui.nc1
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
