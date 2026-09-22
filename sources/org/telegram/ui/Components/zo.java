package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.vd1;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final /* synthetic */ class zo implements vd1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ vi b;
    public final /* synthetic */ org.telegram.ui.s3 c;

    public /* synthetic */ zo(vi viVar, org.telegram.ui.s3 s3Var, int i10) {
        this.a = i10;
        this.b = viVar;
        this.c = s3Var;
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
