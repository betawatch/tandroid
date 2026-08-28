package org.telegram.messenger.voip;

import org.telegram.messenger.voip.Instance;
import org.telegram.messenger.voip.NativeInstance;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class g0 implements NativeInstance.AudioLevelsCallback, Instance.OnStateUpdatedListener, Instance.OnSignalBarsUpdatedListener, Instance.OnSignalingDataListener, Instance.OnRemoteMediaStateUpdatedListener {
    public final /* synthetic */ VoIPService a;

    public /* synthetic */ g0(VoIPService voIPService) {
        this.a = voIPService;
    }

    @Override // org.telegram.messenger.voip.Instance.OnRemoteMediaStateUpdatedListener
    public void onMediaStateUpdated(int i9, int i10) {
        this.a.lambda$initiateActualEncryptedCall$87(i9, i10);
    }

    @Override // org.telegram.messenger.voip.Instance.OnSignalBarsUpdatedListener
    public void onSignalBarsUpdated(int i9) {
        this.a.onSignalBarCountChanged(i9);
    }

    @Override // org.telegram.messenger.voip.Instance.OnSignalingDataListener
    public void onSignalingData(byte[] bArr) {
        this.a.onSignalingData(bArr);
    }

    @Override // org.telegram.messenger.voip.Instance.OnStateUpdatedListener
    public void onStateUpdated(int i9, boolean z10) {
        this.a.onConnectionStateChanged(i9, z10);
    }

    @Override // org.telegram.messenger.voip.NativeInstance.AudioLevelsCallback
    public void run(int[] iArr, float[] fArr, boolean[] zArr) {
        this.a.lambda$initiateActualEncryptedCall$85(iArr, fArr, zArr);
    }
}
