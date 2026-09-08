package bi;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.LocationController;
import org.telegram.messenger.SavedMessagesController;
import org.telegram.messenger.SecretChatHelper;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.id0;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes4.dex */
public final /* synthetic */ class j7 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;

    public /* synthetic */ j7(Object obj, long j3, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = j3;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new a3.h0((u8) this.c, this.b, tLObject, 2));
                break;
            case 1:
                ((ContactsController) this.c).lambda$loadContacts$28(this.b, tLObject, tL_error);
                break;
            case 2:
                ((LocationController) this.c).lambda$loadLiveLocations$26(this.b, tLObject, tL_error);
                break;
            case 3:
                ((SavedMessagesController) this.c).lambda$hasSavedMessages$15(this.b, tLObject, tL_error);
                break;
            case 4:
                ((SecretChatHelper) this.c).lambda$declineSecretChat$20(this.b, tLObject, tL_error);
                break;
            case 5:
                ((SendMessagesHelper) this.c).lambda$sendGame$47(this.b, tLObject, tL_error);
                break;
            default:
                id0 id0Var = (id0) this.c;
                if (tLObject != null) {
                    AndroidUtilities.runOnUIThread(new a3.h0(id0Var, tLObject, this.b, 28));
                    break;
                }
                break;
        }
    }
}
