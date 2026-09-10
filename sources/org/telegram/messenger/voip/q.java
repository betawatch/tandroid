package org.telegram.messenger.voip;

import java.util.ArrayList;
import org.telegram.messenger.voip.VoIPDebugToSend;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final /* synthetic */ class q implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ q(Object obj, Object obj2, Object obj3, int i10) {
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
                ((GroupCallMessagesController) this.b).lambda$sendCallMessage$5((i) this.c, (GroupCallMessage) this.d, tLObject, tL_error);
                break;
            case 2:
                VoIPService.lambda$startConferenceGroupCall$49((ArrayList) this.b, (ArrayList) this.c, (b0) this.d, tLObject, tL_error);
                break;
            case 3:
                ((VoIPService) this.b).lambda$startConferenceGroupCall$45((TL_phone.PhoneCall) this.c, (TL_phone.exportGroupCallInvite) this.d, tLObject, tL_error);
                break;
            default:
                VoIPService.lambda$startConferenceGroupCall$41((ArrayList) this.b, (ArrayList) this.c, (b0) this.d, tLObject, tL_error);
                break;
        }
    }
}
