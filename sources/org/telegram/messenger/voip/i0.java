package org.telegram.messenger.voip;

import org.telegram.messenger.voip.Instance;
import org.telegram.messenger.voip.NativeInstance;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes.dex */
public final /* synthetic */ class i0 implements NativeInstance.AudioLevelsCallback, Instance.OnStateUpdatedListener, Instance.OnSignalBarsUpdatedListener, Instance.OnSignalingDataListener, Instance.OnRemoteMediaStateUpdatedListener {
    public final /* synthetic */ VoIPService a;

    public /* synthetic */ i0(VoIPService voIPService) {
        this.a = voIPService;
    }

    @Override // org.telegram.messenger.voip.Instance.OnRemoteMediaStateUpdatedListener
    public void onMediaStateUpdated(int i10, int i11) {
        this.a.lambda$initiateActualEncryptedCall$87(i10, i11);
    }

    @Override // org.telegram.messenger.voip.Instance.OnSignalBarsUpdatedListener
    public void onSignalBarsUpdated(int i10) {
        this.a.onSignalBarCountChanged(i10);
    }

    @Override // org.telegram.messenger.voip.Instance.OnSignalingDataListener
    public void onSignalingData(byte[] bArr) {
        this.a.onSignalingData(bArr);
    }

    @Override // org.telegram.messenger.voip.Instance.OnStateUpdatedListener
    public void onStateUpdated(int i10, boolean z10) {
        this.a.onConnectionStateChanged(i10, z10);
    }

    @Override // org.telegram.messenger.voip.NativeInstance.AudioLevelsCallback
    public void run(int[] iArr, float[] fArr, boolean[] zArr) {
        this.a.lambda$initiateActualEncryptedCall$85(iArr, fArr, zArr);
    }
}
