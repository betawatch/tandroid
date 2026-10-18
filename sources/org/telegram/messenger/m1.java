package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes.dex */
public final /* synthetic */ class m1 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ ContactsController b;

    public /* synthetic */ m1(ContactsController contactsController, int i10) {
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
