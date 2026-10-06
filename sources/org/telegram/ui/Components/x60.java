package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes3.dex */
public final /* synthetic */ class x60 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ z60 b;

    public /* synthetic */ x60(z60 z60Var, int i10) {
        this.a = i10;
        this.b = z60Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.video.o(this.b, tL_error, tLObject, 22));
                break;
            default:
                AndroidUtilities.runOnUIThread(new yw(14, this.b, tL_error));
                break;
        }
    }
}
