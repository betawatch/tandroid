package org.telegram.messenger.voip;

import org.telegram.messenger.voip.Instance;
import org.telegram.messenger.voip.NativeInstance;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes.dex */
public final /* synthetic */ class n0 implements NativeInstance.AudioLevelsCallback, NativeInstance.VideoSourcesCallback, NativeInstance.RequestBroadcastPartCallback, NativeInstance.RequestCurrentTimeCallback, Instance.OnStateUpdatedListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ VoIPService b;
    public final /* synthetic */ int c;

    public /* synthetic */ n0(VoIPService voIPService, int i10, int i11) {
        this.a = i11;
        this.b = voIPService;
        this.c = i10;
    }

    @Override // org.telegram.messenger.voip.Instance.OnStateUpdatedListener
    public void onStateUpdated(int i10, boolean z10) {
        this.b.lambda$createGroupInstance$80(this.c, i10, z10);
    }

    @Override // org.telegram.messenger.voip.NativeInstance.RequestCurrentTimeCallback
    public void run(long j10) {
        this.b.lambda$createGroupInstance$79(this.c, j10);
    }

    @Override // org.telegram.messenger.voip.NativeInstance.RequestBroadcastPartCallback
    public void run(long j10, long j11, int i10, int i11) {
        switch (this.a) {
            case 2:
                this.b.lambda$createGroupInstance$75(this.c, j10, j11, i10, i11);
                break;
            default:
                this.b.lambda$createGroupInstance$77(this.c, j10, j11, i10, i11);
                break;
        }
    }

    @Override // org.telegram.messenger.voip.NativeInstance.VideoSourcesCallback
    public void run(long j10, int[] iArr) {
        this.b.lambda$createGroupInstance$70(this.c, j10, iArr);
    }

    @Override // org.telegram.messenger.voip.NativeInstance.AudioLevelsCallback
    public void run(int[] iArr, float[] fArr, boolean[] zArr) {
        this.b.lambda$createGroupInstance$68(this.c, iArr, fArr, zArr);
    }
}
