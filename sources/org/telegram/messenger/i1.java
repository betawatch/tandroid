package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes.dex */
public final /* synthetic */ class i1 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ ContactsController b;

    public /* synthetic */ i1(ContactsController contactsController, int i10) {
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
