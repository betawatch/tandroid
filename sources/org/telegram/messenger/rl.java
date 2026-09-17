package org.telegram.messenger;

import org.telegram.messenger.UnconfirmedAuthController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
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
