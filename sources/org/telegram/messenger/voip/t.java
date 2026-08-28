package org.telegram.messenger.voip;

import android.content.SharedPreferences;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class t implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ t(Object obj, int i9) {
        this.a = i9;
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
