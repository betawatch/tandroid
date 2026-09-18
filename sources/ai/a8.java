package ai;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.LocationController;
import org.telegram.messenger.SavedMessagesController;
import org.telegram.messenger.SecretChatHelper;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.kd0;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes4.dex */
public final /* synthetic */ class a8 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;

    public /* synthetic */ a8(Object obj, long j3, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = j3;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new a3.h0((l9) this.c, this.b, tLObject, 2));
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
                kd0 kd0Var = (kd0) this.c;
                if (tLObject != null) {
                    AndroidUtilities.runOnUIThread(new a3.h0(kd0Var, tLObject, this.b, 28));
                    break;
                }
                break;
        }
    }
}
