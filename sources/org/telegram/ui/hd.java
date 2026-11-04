package org.telegram.ui;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class hd implements ca1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ xd b;
    public final /* synthetic */ TwoStepVerificationActivity c;

    public /* synthetic */ hd(xd xdVar, TwoStepVerificationActivity twoStepVerificationActivity, int i3) {
        this.a = i3;
        this.b = xdVar;
        this.c = twoStepVerificationActivity;
    }

    @Override // org.telegram.ui.ca1
    public final void l(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        switch (this.a) {
            case 0:
                this.b.F(false, tL_inputCheckPasswordSRP, this.c);
                break;
            case 1:
                this.b.F(true, tL_inputCheckPasswordSRP, this.c);
                break;
            default:
                this.b.F(true, tL_inputCheckPasswordSRP, this.c);
                break;
        }
    }
}
