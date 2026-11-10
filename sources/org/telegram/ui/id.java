package org.telegram.ui;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class id implements pa1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ zd b;
    public final /* synthetic */ TwoStepVerificationActivity c;

    public /* synthetic */ id(zd zdVar, TwoStepVerificationActivity twoStepVerificationActivity, int i7) {
        this.a = i7;
        this.b = zdVar;
        this.c = twoStepVerificationActivity;
    }

    @Override // org.telegram.ui.pa1
    public final void j(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
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
