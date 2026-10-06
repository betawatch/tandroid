package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes3.dex */
public final /* synthetic */ class l91 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ ta1 b;

    public /* synthetic */ l91(ta1 ta1Var, int i10) {
        this.a = i10;
        this.b = ta1Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                ta1.T(this.b, tLObject);
                break;
            default:
                ta1.S(this.b, tLObject);
                break;
        }
    }
}
