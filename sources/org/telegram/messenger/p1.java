package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes.dex */
public final /* synthetic */ class p1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ContactsController b;
    public final /* synthetic */ TLRPC.TL_error c;
    public final /* synthetic */ TLObject d;

    public /* synthetic */ p1(int i10, ContactsController contactsController, TLObject tLObject, TLRPC.TL_error tL_error) {
        this.a = i10;
        this.b = contactsController;
        this.c = tL_error;
        this.d = tLObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.lambda$loadGlobalPrivacySetting$60(this.c, this.d);
                break;
            default:
                this.b.lambda$loadPrivacySettings$62(this.c, this.d);
                break;
        }
    }
}
