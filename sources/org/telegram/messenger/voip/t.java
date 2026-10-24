package org.telegram.messenger.voip;

import android.content.SharedPreferences;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes.dex */
public final /* synthetic */ class t implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ t(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                ((VoIPService) this.b).lambda$hangUp$4(tLObject, tL_error);
                break;
            case 1:
                ((VoIPService) this.b).lambda$hangUp$5(tLObject, tL_error);
                break;
            case 2:
                ((VoIPService) this.b).lambda$startOutgoingCall$7(tLObject, tL_error);
                break;
            case 3:
                ((VoIPService) this.b).lambda$startGroupCheckShortpoll$62(tLObject, tL_error);
                break;
            case 4:
                ((VoIPService) this.b).lambda$declineIncomingCall$105(tLObject, tL_error);
                break;
            case 5:
                ((VoIPService) this.b).lambda$processAcceptedCall$20(tLObject, tL_error);
                break;
            case 6:
                ((VoIPService) this.b).lambda$startGroupCall$23(tLObject, tL_error);
                break;
            case 7:
                ((VoIPService) this.b).lambda$stopScreenCapture$15(tLObject, tL_error);
                break;
            case 8:
                ((VoIPService) this.b).lambda$acceptIncomingCall$102(tLObject, tL_error);
                break;
            default:
                VoIPService.lambda$updateServerConfig$107((SharedPreferences) this.b, tLObject, tL_error);
                break;
        }
    }
}
