package org.telegram.ui;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class od implements nf1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ fe b;
    public final /* synthetic */ TwoStepVerificationActivity c;

    public /* synthetic */ od(fe feVar, TwoStepVerificationActivity twoStepVerificationActivity, int i9) {
        this.a = i9;
        this.b = feVar;
        this.c = twoStepVerificationActivity;
    }

    @Override // org.telegram.ui.nf1
    public final void h(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        switch (this.a) {
            case 0:
                this.b.b0(false, tL_inputCheckPasswordSRP, this.c);
                break;
            case 1:
                this.b.b0(true, tL_inputCheckPasswordSRP, this.c);
                break;
            default:
                this.b.b0(true, tL_inputCheckPasswordSRP, this.c);
                break;
        }
    }
}
