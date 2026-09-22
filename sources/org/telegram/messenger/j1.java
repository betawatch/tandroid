package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes.dex */
public final /* synthetic */ class j1 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ ContactsController b;

    public /* synthetic */ j1(ContactsController contactsController, int i10) {
        this.a = i10;
        this.b = contactsController;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                this.b.lambda$checkInviteText$3(tLObject, tL_error);
                break;
            case 1:
                this.b.lambda$loadGlobalPrivacySetting$61(tLObject, tL_error);
                break;
            default:
                this.b.lambda$loadPrivacySettings$63(tLObject, tL_error);
                break;
        }
    }
}
