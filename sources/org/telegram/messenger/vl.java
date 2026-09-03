package org.telegram.messenger;

import org.telegram.messenger.UnconfirmedAuthController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final /* synthetic */ class vl implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ UnconfirmedAuthController.UnconfirmedAuth b;
    public final /* synthetic */ Utilities.Callback c;

    public /* synthetic */ vl(UnconfirmedAuthController.UnconfirmedAuth unconfirmedAuth, Utilities.Callback callback, int i10) {
        this.a = i10;
        this.b = unconfirmedAuth;
        this.c = callback;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                this.b.lambda$deny$4(this.c, tLObject, tL_error);
                break;
            case 1:
                this.b.lambda$deny$6(this.c, tLObject, tL_error);
                break;
            default:
                this.b.lambda$confirm$2(this.c, tLObject, tL_error);
                break;
        }
    }
}
