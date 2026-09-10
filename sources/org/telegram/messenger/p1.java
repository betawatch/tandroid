package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.id0;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final /* synthetic */ class p1 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;

    public /* synthetic */ p1(Object obj, long j3, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = j3;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                ((ContactsController) this.c).lambda$loadContacts$28(this.b, tLObject, tL_error);
                break;
            case 1:
                ((LocationController) this.c).lambda$loadLiveLocations$26(this.b, tLObject, tL_error);
                break;
            case 2:
                ((SavedMessagesController) this.c).lambda$hasSavedMessages$15(this.b, tLObject, tL_error);
                break;
            case 3:
                ((SecretChatHelper) this.c).lambda$declineSecretChat$20(this.b, tLObject, tL_error);
                break;
            case 4:
                ((SendMessagesHelper) this.c).lambda$sendGame$47(this.b, tLObject, tL_error);
                break;
            case 5:
                id0 id0Var = (id0) this.c;
                if (tLObject != null) {
                    AndroidUtilities.runOnUIThread(new a3.h0(id0Var, tLObject, this.b, 22));
                    break;
                }
                break;
            default:
                AndroidUtilities.runOnUIThread(new a3.h0((zh.i5) this.c, this.b, tLObject, 29));
                break;
        }
    }
}
