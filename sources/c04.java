// default package

import org.telegram.messenger.video.VideoPlayerHolderBase;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.messenger.voip.VoipAudioManager;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final /* synthetic */ class c04 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;

    public /* synthetic */ c04(Object obj, boolean z, boolean z2, byte b) {
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
                ((e34) obj).O(false, z2, z);
                break;
            case 1:
                ((NativeInstance) obj).lambda$onNetworkStateUpdated$0(z2, z);
                break;
            case 2:
                ((VideoPlayerHolderBase) obj).lambda$setAudioEnabled$8(z2, z);
                break;
            case 3:
                ((VoIPService) obj).lambda$createGroupInstance$75(z2, z);
                break;
            case 4:
                VoipAudioManager.lambda$isBluetoothAndSpeakerOnAsync$3((jac) obj, z2, z);
                break;
            default:
                ((rhb) ((dmc) obj).c).l(z2, z);
                break;
        }
    }
}
