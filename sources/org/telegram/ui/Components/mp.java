package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.sc1;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class mp implements sc1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ti b;
    public final /* synthetic */ org.telegram.ui.gc c;

    public /* synthetic */ mp(ti tiVar, org.telegram.ui.gc gcVar, int i10) {
        this.a = i10;
        this.b = tiVar;
        this.c = gcVar;
    }

    @Override // org.telegram.ui.sc1
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
