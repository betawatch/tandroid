package oh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.LocationController;
import org.telegram.messenger.SavedMessagesController;
import org.telegram.messenger.SecretChatHelper;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.bd0;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final /* synthetic */ class t5 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;

    public /* synthetic */ t5(Object obj, long j10, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = j10;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new i5.v((t6) this.c, this.b, tLObject, 6));
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
                bd0 bd0Var = (bd0) this.c;
                if (tLObject != null) {
                    AndroidUtilities.runOnUIThread(new i5.v(bd0Var, tLObject, this.b, 29));
                    break;
                }
                break;
        }
    }
}
