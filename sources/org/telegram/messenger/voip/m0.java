package org.telegram.messenger.voip;

import org.telegram.messenger.voip.Instance;
import org.telegram.messenger.voip.NativeInstance;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class m0 implements NativeInstance.AudioLevelsCallback, NativeInstance.VideoSourcesCallback, NativeInstance.RequestBroadcastPartCallback, NativeInstance.RequestCurrentTimeCallback, Instance.OnStateUpdatedListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ VoIPService b;
    public final /* synthetic */ int c;

    public /* synthetic */ m0(VoIPService voIPService, int i9, int i10) {
        this.a = i10;
        this.b = voIPService;
        this.c = i9;
    }

    @Override // org.telegram.messenger.voip.Instance.OnStateUpdatedListener
    public void onStateUpdated(int i9, boolean z10) {
        this.b.lambda$createGroupInstance$80(this.c, i9, z10);
    }

    @Override // org.telegram.messenger.voip.NativeInstance.RequestCurrentTimeCallback
    public void run(long j10) {
        this.b.lambda$createGroupInstance$79(this.c, j10);
    }

    @Override // org.telegram.messenger.voip.NativeInstance.RequestBroadcastPartCallback
    public void run(long j10, long j11, int i9, int i10) {
        switch (this.a) {
            case 2:
                this.b.lambda$createGroupInstance$75(this.c, j10, j11, i9, i10);
                break;
            default:
                this.b.lambda$createGroupInstance$77(this.c, j10, j11, i9, i10);
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
