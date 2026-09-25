package org.telegram.messenger;

import org.telegram.messenger.UnconfirmedAuthController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes.dex */
public final /* synthetic */ class rl implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ UnconfirmedAuthController.UnconfirmedAuth b;
    public final /* synthetic */ TLObject c;
    public final /* synthetic */ Utilities.Callback d;
    public final /* synthetic */ TLRPC.TL_error e;

    public /* synthetic */ rl(UnconfirmedAuthController.UnconfirmedAuth unconfirmedAuth, Utilities.Callback callback, TLObject tLObject, TLRPC.TL_error tL_error) {
        this.a = 1;
        this.b = unconfirmedAuth;
        this.c = tLObject;
        this.d = callback;
        this.e = tL_error;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.lambda$confirm$1(this.d, this.c, this.e);
                break;
            case 1:
                this.b.lambda$deny$3(this.c, this.d, this.e);
                break;
            default:
                this.b.lambda$deny$5(this.d, this.c, this.e);
                break;
        }
    }

    public /* synthetic */ rl(UnconfirmedAuthController.UnconfirmedAuth unconfirmedAuth, Utilities.Callback callback, TLObject tLObject, TLRPC.TL_error tL_error, int i10) {
        this.a = i10;
        this.b = unconfirmedAuth;
        this.d = callback;
        this.c = tLObject;
        this.e = tL_error;
    }
}
