package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.wd1;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class zo implements wd1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ vi b;
    public final /* synthetic */ org.telegram.ui.s3 c;

    public /* synthetic */ zo(vi viVar, org.telegram.ui.s3 s3Var, int i10) {
        this.a = i10;
        this.b = viVar;
        this.c = s3Var;
    }

    @Override // org.telegram.ui.wd1
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
