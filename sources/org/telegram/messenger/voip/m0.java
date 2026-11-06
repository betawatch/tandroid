package org.telegram.messenger.voip;

import org.telegram.messenger.voip.Instance;
import org.telegram.messenger.voip.NativeInstance;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final /* synthetic */ class m0 implements NativeInstance.AudioLevelsCallback, NativeInstance.VideoSourcesCallback, NativeInstance.RequestBroadcastPartCallback, NativeInstance.RequestCurrentTimeCallback, Instance.OnStateUpdatedListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ VoIPService b;
    public final /* synthetic */ int c;

    public /* synthetic */ m0(VoIPService voIPService, int i7, int i10) {
        this.a = i10;
        this.b = voIPService;
        this.c = i7;
    }

    @Override // org.telegram.messenger.voip.Instance.OnStateUpdatedListener
    public void onStateUpdated(int i7, boolean z9) {
        this.b.lambda$createGroupInstance$80(this.c, i7, z9);
    }

    @Override // org.telegram.messenger.voip.NativeInstance.RequestCurrentTimeCallback
    public void run(long j3) {
        this.b.lambda$createGroupInstance$79(this.c, j3);
    }

    @Override // org.telegram.messenger.voip.NativeInstance.RequestBroadcastPartCallback
    public void run(long j3, long j10, int i7, int i10) {
        switch (this.a) {
            case 2:
                this.b.lambda$createGroupInstance$75(this.c, j3, j10, i7, i10);
                break;
            default:
                this.b.lambda$createGroupInstance$77(this.c, j3, j10, i7, i10);
                break;
        }
    }

    @Override // org.telegram.messenger.voip.NativeInstance.VideoSourcesCallback
    public void run(long j3, int[] iArr) {
        this.b.lambda$createGroupInstance$70(this.c, j3, iArr);
    }

    @Override // org.telegram.messenger.voip.NativeInstance.AudioLevelsCallback
    public void run(int[] iArr, float[] fArr, boolean[] zArr) {
        this.b.lambda$createGroupInstance$68(this.c, iArr, fArr, zArr);
    }
}
