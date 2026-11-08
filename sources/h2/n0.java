package h2;

import org.telegram.messenger.v10;
import org.telegram.messenger.video.VideoPlayerHolderBase;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.messenger.voip.VoipAudioManager;
import org.telegram.ui.Components.hy;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final /* synthetic */ class n0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;

    public /* synthetic */ n0(Object obj, boolean z9, boolean z10, int i7) {
        this.a = i7;
        this.d = obj;
        this.b = z9;
        this.c = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                wf.b.w((wf.b) ((p0) this.d).d, this.b, this.c);
                break;
            case 1:
                ((VideoPlayerHolderBase) this.d).lambda$setAudioEnabled$8(this.b, this.c);
                break;
            case 2:
                ((NativeInstance) this.d).lambda$onNetworkStateUpdated$0(this.b, this.c);
                break;
            case 3:
                VoipAudioManager.lambda$isBluetoothAndSpeakerOnAsync$3((v10) this.d, this.b, this.c);
                break;
            default:
                ((hy) this.d).P(false, this.b, this.c);
                break;
        }
    }
}
