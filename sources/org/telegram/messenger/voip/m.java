package org.telegram.messenger.voip;

import java.util.ArrayList;
import org.telegram.messenger.voip.VoIPDebugToSend;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final /* synthetic */ class m implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ m(Object obj, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                ((VoIPDebugToSend) this.b).lambda$done$3((VoIPDebugToSend.Data) this.c, (TL_phone.saveCallDebug) this.d, tLObject, tL_error);
                break;
            case 1:
                ((GroupCallMessagesController) this.b).lambda$sendCallMessage$5((e) this.c, (GroupCallMessage) this.d, tLObject, tL_error);
                break;
            case 2:
                VoIPService.lambda$startConferenceGroupCall$49((ArrayList) this.b, (ArrayList) this.c, (x) this.d, tLObject, tL_error);
                break;
            case 3:
                ((VoIPService) this.b).lambda$startConferenceGroupCall$45((TL_phone.PhoneCall) this.c, (TL_phone.exportGroupCallInvite) this.d, tLObject, tL_error);
                break;
            default:
                VoIPService.lambda$startConferenceGroupCall$41((ArrayList) this.b, (ArrayList) this.c, (x) this.d, tLObject, tL_error);
                break;
        }
    }
}
