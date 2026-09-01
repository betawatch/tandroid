package org.telegram.messenger.voip;

import android.content.Context;
import java.io.File;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.voip.VoIPDebugToSend;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final /* synthetic */ class l implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ l(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ((VoIPDebugToSend) this.b).lambda$done$2((VoIPDebugToSend.Data) this.c, (File) this.d, (TL_phone.saveCallDebug) this.e);
                break;
            case 1:
                ((NativeInstance) this.b).lambda$onAudioLevelsUpdated$1((int[]) this.c, (float[]) this.d, (boolean[]) this.e);
                break;
            case 2:
                VoIPPreNotificationService.lambda$acknowledge$2((TLObject) this.b, (TLRPC.TL_error) this.c, (Context) this.d, (Runnable) this.e);
                break;
            case 3:
                ((VoIPService) this.b).lambda$startConferenceGroupCall$44((TLObject) this.c, (TL_phone.PhoneCall) this.d, (TL_phone.exportGroupCallInvite) this.e);
                break;
            case 4:
                ((VoIPService) this.b).lambda$startOutgoingCall$9((TLRPC.TL_error) this.c, (TLObject) this.d, (byte[]) this.e);
                break;
            case 5:
                ((VoIPService) this.b).lambda$startGroupCheckShortpoll$63((TLRPC.TL_error) this.c, (TLObject) this.d, (TL_phone.checkGroupCall) this.e);
                break;
            default:
                ((VoIPService) this.b).lambda$startConferenceGroupCall$31((TLObject) this.c, (AccountInstance) this.d, (TLRPC.TL_error) this.e);
                break;
        }
    }
}
