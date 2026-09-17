package org.telegram.messenger;

import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes.dex */
public final /* synthetic */ class eb implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ MessagesController.ErrorDelegate b;
    public final /* synthetic */ TLRPC.TL_error c;

    public /* synthetic */ eb(MessagesController.ErrorDelegate errorDelegate, TLRPC.TL_error tL_error, int i10) {
        this.a = i10;
        this.b = errorDelegate;
        this.c = tL_error;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.run(this.c);
                break;
            default:
                this.b.run(this.c);
                break;
        }
    }
}
