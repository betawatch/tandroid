// default package

import org.telegram.messenger.video.VideoPlayerHolderBase;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.messenger.voip.VoipAudioManager;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final /* synthetic */ class mz3 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;

    public /* synthetic */ mz3(Object obj, boolean z, boolean z2, byte b) {
        this.a = b;
        this.d = obj;
        this.b = z;
        this.c = z2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        boolean z = this.c;
        boolean z2 = this.b;
        Object obj = this.d;
        switch (b) {
            case 0:
                ((o24) obj).O(false, z2, z);
                break;
            case 1:
                ((NativeInstance) obj).lambda$onNetworkStateUpdated$0(z2, z);
                break;
            case 2:
                ((VideoPlayerHolderBase) obj).lambda$setAudioEnabled$8(z2, z);
                break;
            case 3:
                ((VoIPService) obj).lambda$createGroupInstance$76(z2, z);
                break;
            case 4:
                VoipAudioManager.lambda$isBluetoothAndSpeakerOnAsync$3((icc) obj, z2, z);
                break;
            default:
                ((zhc) ((qoc) obj).c).d(z2, z);
                break;
        }
    }
}
