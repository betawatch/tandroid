package org.telegram.messenger.voip;

import android.content.Context;
import java.io.File;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.voip.VoIPDebugToSend;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes.dex */
public final /* synthetic */ class m implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ m(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
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
