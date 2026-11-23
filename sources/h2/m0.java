package h2;

import org.telegram.messenger.p10;
import org.telegram.messenger.video.VideoPlayerHolderBase;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.messenger.voip.VoipAudioManager;
import org.telegram.ui.Components.qy;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public final /* synthetic */ class m0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;

    public /* synthetic */ m0(Object obj, boolean z10, boolean z11, int i7) {
        this.a = i7;
        this.d = obj;
        this.b = z10;
        this.c = z11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                wf.b.p((wf.b) ((o0) this.d).d, this.b, this.c);
                break;
            case 1:
                ((VideoPlayerHolderBase) this.d).lambda$setAudioEnabled$8(this.b, this.c);
                break;
            case 2:
                ((NativeInstance) this.d).lambda$onNetworkStateUpdated$0(this.b, this.c);
                break;
            case 3:
                VoipAudioManager.lambda$isBluetoothAndSpeakerOnAsync$3((p10) this.d, this.b, this.c);
                break;
            default:
                ((qy) this.d).Q(false, this.b, this.c);
                break;
        }
    }
}
