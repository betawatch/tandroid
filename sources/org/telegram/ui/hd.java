package org.telegram.ui;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class hd implements oa1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ xd b;
    public final /* synthetic */ TwoStepVerificationActivity c;

    public /* synthetic */ hd(xd xdVar, TwoStepVerificationActivity twoStepVerificationActivity, int i7) {
        this.a = i7;
        this.b = xdVar;
        this.c = twoStepVerificationActivity;
    }

    @Override // org.telegram.ui.oa1
    public final void k(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
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
