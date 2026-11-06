package org.telegram.messenger.voip;

import org.telegram.messenger.voip.Instance;
import org.telegram.messenger.voip.NativeInstance;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final /* synthetic */ class h0 implements NativeInstance.AudioLevelsCallback, Instance.OnStateUpdatedListener, Instance.OnSignalBarsUpdatedListener, Instance.OnSignalingDataListener, Instance.OnRemoteMediaStateUpdatedListener {
    public final /* synthetic */ VoIPService a;

    public /* synthetic */ h0(VoIPService voIPService) {
        this.a = voIPService;
    }

    @Override // org.telegram.messenger.voip.Instance.OnRemoteMediaStateUpdatedListener
    public void onMediaStateUpdated(int i7, int i10) {
        this.a.lambda$initiateActualEncryptedCall$87(i7, i10);
    }

    @Override // org.telegram.messenger.voip.Instance.OnSignalBarsUpdatedListener
    public void onSignalBarsUpdated(int i7) {
        this.a.onSignalBarCountChanged(i7);
    }

    @Override // org.telegram.messenger.voip.Instance.OnSignalingDataListener
    public void onSignalingData(byte[] bArr) {
        this.a.onSignalingData(bArr);
    }

    @Override // org.telegram.messenger.voip.Instance.OnStateUpdatedListener
    public void onStateUpdated(int i7, boolean z9) {
        this.a.onConnectionStateChanged(i7, z9);
    }

    @Override // org.telegram.messenger.voip.NativeInstance.AudioLevelsCallback
    public void run(int[] iArr, float[] fArr, boolean[] zArr) {
        this.a.lambda$initiateActualEncryptedCall$85(iArr, fArr, zArr);
    }
}
